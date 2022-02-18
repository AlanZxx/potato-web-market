package com.potato.marketweb.commonUtil;

public class Result {
    private static final int SUCCESS = 200;
    private static final int FAILED = 500;
    private int code;
    private String message;
    private Object data;

    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Result ok(Object data) {
        return new Result(SUCCESS, "success", data);
    }

    public static Result fail(String message) {
        return new Result(FAILED, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
