package com.my.crowd.util;

/**
 * 统一整个项目中ajax请求返回结果
 * 可以用于分布式架构各个模块间调用时返回的同一类型
 * @param <T>
 */
public class ResultEntity <T> {

    public static final String SUCCESS = "SUCCESS";

    public static final String FAIL = "FAIL";

    // 封装处理请求成功还是失败
    private String result;

    // 请求处理失败时候返回的错误消息
    private String message;

    // 返回的数据
    private T data;

    /**
     * 请求处理成功且不需要返回数据时使用的工具方法
     * @param <E>
     * @return
     */
    public static <E> ResultEntity<E> successWithoutData(){
        return new ResultEntity<E>(SUCCESS, null, null);
    }

    /**
     * 请求处理成功且需要返回数据时使用的工具方法
     * @param data 要返回的数据
     * @param <E>
     * @return
     */
    public static <E> ResultEntity<E> successWithData(E data){
        return new ResultEntity<E>(SUCCESS, null, data);
    }

    /**
     * 请求失败后返回的工具方法
     * @param message 失败的错误消息
     * @param <E>
     * @return
     */
    public static <E> ResultEntity<E> failed(String message){
        return new ResultEntity<E>(FAIL, message, null);
    }


    public ResultEntity(String result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "result='" + result + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResultEntity() {
    }
}
