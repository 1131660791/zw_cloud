package com.util.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 返回值
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Resp<T> {

    /**
     * 是否成功
     */
    @ApiModelProperty(value = "请求是否成功标志,成功:true,失败:false", example = "true")
    private boolean success;

    /**
     * 反馈信息
     */
    @ApiModelProperty(value = "反馈信息", example = "操作成功！")
    private String errmsg;

    /**
     * 响应码
     */
    @ApiModelProperty(value = "请求响应代码,0代表成功", example = "0")
    private int errno;

    /**
     * 反馈数据
     */
    @ApiModelProperty(value = "请求返回的数据", example = "")
    private T result;

    @JsonIgnore
    private ResultCode resultCode;

    public Resp() {
        this.success = true;
        this.resultCode = ResultCode.DefaultResultCode.DEFAULT_SUCCESS;
        this.errmsg = "操作成功";
        this.errno = resultCode.getCode();
    }

    public Resp(boolean success, ResultCode resulterrno) {
        this.success = success;
        this.resultCode = resulterrno;
        this.errno = resulterrno.getCode();
    }

    public Resp(boolean success, String errmsg, ResultCode resultCode) {
        this.success = success;
        this.errmsg = errmsg;
        this.resultCode = resultCode;
        this.errno = resultCode.getCode();
    }

    public Resp(T result) {
        this.success = true;
        this.resultCode = ResultCode.DefaultResultCode.DEFAULT_SUCCESS;
        this.errno = resultCode.getCode();
        this.errmsg = "操作成功";
        this.result = result;
    }

    public static <E> Resp<E> ok(E result) {
        return new Resp<>(result);
    }

    public static Resp ok() {
        return new Resp();
    }

    public static Resp error() {
        return new Resp(false, ResultCode.DefaultResultCode.DEFAULT_FAILED);
    }

    public static Resp error(ResultCode resulterrno) {
        return new Resp(false, resulterrno);
    }

    public static Resp error(String errmsg) {
        return new Resp(false, errmsg, ResultCode.DefaultResultCode.DEFAULT_FAILED);
    }

    public static Resp error(ResultCode resulterrno, String errmsg) {
        return new Resp(false, errmsg, resulterrno);
    }
}
