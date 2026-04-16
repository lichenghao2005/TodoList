package com.itheima.todo.common;

public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    // 成功响应（带数据）
    public static <T> Result<T> success(T data) {
        Result<T> r = new Result<>();
        r.code = 200;
        r.msg = "success";
        r.data = data;
        return r;
    }

    // 成功响应（无数据）
    public static <T> Result<T> success() {
        return success(null);
    }

    // getter/setter
    public Integer getCode() { return code; }
    public void setCode(Integer code) { this.code = code; }
    public String getMsg() { return msg; }
    public void setMsg(String msg) { this.msg = msg; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
}
