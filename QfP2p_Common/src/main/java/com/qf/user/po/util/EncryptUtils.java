package com.qf.user.po.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.print.DocFlavor;
import java.io.IOException;
import java.security.*;

/**
 * 常用的加解密算法
 * 包含但并不限于：
 * Base64编码
 * Md5摘要
 * Sha签名
 * AES对称加密
 * RSA非对称加密
 *
 * */
//编码、摘要算法、加解密
public class EncryptUtils {
    private static KeyPair keyPair=null;
    /**
     * 将指定内容转换为base64
     */
    public static String encStr(String data) {
        //创建base64编码转换对象
        BASE64Encoder encoder = new BASE64Encoder();
        //将对象转换为base64格式
        return encoder.encode(data.getBytes());
    }

    public static String encByte(byte[] data) {
        //创建base64编码转换对象
        BASE64Encoder encoder = new BASE64Encoder();
        //将对象转换为base64格式
        return encoder.encode(data);
    }

    /**
     * 将base64格式的字符串转换为fei
     */
    public static byte[] decStr(String msg) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            return decoder.decodeBuffer(msg);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    //单向---将内容转换为md5格式
    public static String md5Enc(String msg) {
        try {
            StringBuffer buffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] msgChars = msg.toCharArray();
            byte[] msgBytes = new byte[msgChars.length];
            byte[] md5Bytes = null;
            for (int i = 0; i < msgChars.length; i++) {
                msgBytes[i] = (byte) msgChars[i];
                md5Bytes = messageDigest.digest(msgBytes);
            }
            for (int j = 0; j < md5Bytes.length; j++) {
                int value = ((int) md5Bytes[j]) & 0xff;
                if (value < 16) {//校验是否需要补0
                    buffer.append("0");
                }
                buffer.append(Integer.toHexString(value));//转换为16进制
            }
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将MD5加密再次转换：盐  附加的字符串 加密次数
     * 密码更加安全*/
    public static String md5Enc(String msg, String salt, int count) {

        String result = msg + salt;
        for (int i = 1; i <= count; i++) {
            result = md5Enc(result);
        }
        return result;
    }
    public static String md5EncBySalt(String msg) {

        String result = msg + "p2p";
        for (int i = 1; i <= 512; i++) {
            result = md5Enc(result);
        }
        return result;
    }


    /**
     * SHA摘要
     * 结果为base64字符串*/
    public static String sha256Enc(String msg){
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
            messageDigest.update(msg.getBytes());
            byte[] data=messageDigest.digest();
            return encByte(data);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    /*
    * */
    public static String sha256EncHex(String msg){
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
            messageDigest.update(msg.getBytes());
            StringBuffer buffer=new StringBuffer();
            byte[] data=messageDigest.digest();
            for (int j = 0; j < data.length; j++) {
                int value = ((int) data[j]) & 0xff;
                if (value < 16) {//校验是否需要补0
                    buffer.append("0");
                }
                buffer.append(Integer.toHexString(value));//转换为16进制
            }
            return buffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 生成AES的密钥
     * */
    public static Key createAesKey(){
        try {
            KeyGenerator generator=KeyGenerator.getInstance("AES");
            //使用随机数保证每次生成的密钥不一样
            generator.init(new SecureRandom());
            return generator.generateKey();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 生成AES的密钥
     * */
    public static String createAesKeyBase64(){
        Key key=createAesKey();
        return encByte(key.getEncoded());
    }
    /**
     * 将base64格式的字符串转换为key*/
    public static Key toKey(String str){
        SecretKeySpec keySpec=new SecretKeySpec(decStr(str),"AES");
        return  keySpec;
    }
    /**
     * 对称加密之AES
     * 结果为base64*/
    public static String aesEnc(String msg,Key key){
        try {
            //获取加解密对象，基于AES
            Cipher cipher=Cipher.getInstance("AES");
            //初始化：标记是加密还是解密，并且传入密钥
            cipher.init(Cipher.ENCRYPT_MODE,key);
            //操作
            return  encByte(cipher.doFinal(msg.getBytes()));
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 对称加密之AES
     * 解密  要求待解密的字符串为base64格式
     * 结果为字节数组*/
    public static byte[] aesDec(String msg,Key key){
        try {
            //获取加解密对象，基于AES
            Cipher cipher=Cipher.getInstance("AES");
            //初始化：标记是加密还是解密，并且传入密钥
            cipher.init(Cipher.DECRYPT_MODE,key);
            //操作
            return  cipher.doFinal(decStr(msg));
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    /**
     * 对称加密之AES
     * 结果为base64*/
    public static String aesEncBase64(String msg,String key){
       return aesEnc(msg,toKey(key));
    }
    /**
     * 对称加密之AES
     * 解密  要求待解密的字符串为base64格式
     * 结果为字节数组*/
    public static byte[] aesDecBase64(String msg,String key){
        return aesDec(msg,toKey(key));
    }
    public static KeyPair createKeyPair(int seed){
        try {
            KeyPairGenerator generator=KeyPairGenerator.getInstance("RSA");
            generator.initialize(seed);
           return generator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    //创建RSA加解密的私钥
    public static PrivateKey createRsaPri(){
        if(keyPair==null){
            keyPair=createKeyPair(1024);
        }
        PrivateKey privateKey=keyPair.getPrivate();
        return privateKey;
    }
    public static PublicKey createRsaPrub(){
        if(keyPair==null){
            keyPair=createKeyPair(1024);
        }
        return keyPair.getPublic();
    }
    /**
     * RSA加密
     * 公钥加密*/
    public static String rsaEncPub(String msg,PublicKey key){
        try {
            Cipher cipher=Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE,key);
            return encByte(cipher.doFinal(msg.getBytes()));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;

    }
    /**
     * RSA解密  待解析的字符串为base64编码
     * 私钥解密*/
    public static byte[] rsaDecPri(String msg,PrivateKey key){
        try {
            Cipher cipher=Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE,key);
            return cipher.doFinal(decStr(msg));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * RSA加密
     * 公钥加密*/
    public static String rsaEncPri(String msg,PrivateKey key){
        try {
            Cipher cipher=Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE,key);
            return encByte(cipher.doFinal(msg.getBytes()));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;

    }
    /**
     * RSA解密  待解析的字符串为base64编码
     * 私钥解密*/
    public static byte[] rsaDecPub(String msg,PublicKey key){
        try {
            Cipher cipher=Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE,key);
            return cipher.doFinal(decStr(msg));
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

}
