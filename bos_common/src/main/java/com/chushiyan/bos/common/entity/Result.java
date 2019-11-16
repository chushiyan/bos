package com.chushiyan.bos.common.entity;

import lombok.Data;

@Data
public class Result {

    private boolean flag;// 是否成功

    private Integer code;// 返回码

    private String message;// 返回信息

    private Object data;// 返回数据


}
