package com.qf.user.po.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {
    public static String getHttpStr(String urlpath) {
        //2、获取连接对象
        HttpURLConnection huc = null;
        BufferedReader bufferedReader = null;
        try {
            //1、创建请求路径
            URL url = new URL(urlpath);

            huc = (HttpURLConnection) url.openConnection();
            //3、设置请求信息
            huc.setRequestMethod("POST");
            huc.setConnectTimeout(2000);
            //4、打开连接
            huc.connect();
            //5、验证状态响应吗
            if (huc.getResponseCode() == 200) {
                //6、读取响应内容
                bufferedReader = new BufferedReader(new InputStreamReader(huc.getInputStream()));
                StringBuffer buffer = new StringBuffer();
                String msg;
                while ((msg = bufferedReader.readLine()) != null) {
                    buffer.append(msg);
                }

                return buffer.toString();
            }
        } catch (IOException e) {
            return null;
        } finally {
            //8、关闭
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            huc.disconnect();
        }
        return null;
    }
}
