package com.qf.user.po.vo;

public class ResultJson {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    //设置成功返回
    public static ResultJson setOK(String msg,Object data){
        ResultJson resultJson=new ResultJson();
        resultJson.setCode(1000);
        resultJson.setMsg(msg);
        resultJson.setData(data);
        return  resultJson;
    }
    //设置失败返回
    public static ResultJson setERROR(String msg,Object data){
        ResultJson resultJson=new ResultJson();
        resultJson.setCode(2000);
        resultJson.setMsg(msg);
        resultJson.setData(data);
        return  resultJson;
    }
}
