package com.bilibili.domain;

public class JsonResponse<T> {
    private String code;
    private String msg;
    private T data;
}
