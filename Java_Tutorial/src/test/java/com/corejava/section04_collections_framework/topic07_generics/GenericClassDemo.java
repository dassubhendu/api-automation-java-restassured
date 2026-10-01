package com.corejava.section04_collections_framework.topic07_generics;

/** A generic class: write it once with <T>, reuse it for any data type. */
public class GenericClassDemo {

    public static void main(String[] args) {
        ApiResult<String> nameResult = new ApiResult<>("John");
        System.out.println("ApiResult<String> -> " + nameResult.getData());

        ApiResult<Integer> idResult = new ApiResult<>(101);
        System.out.println("ApiResult<Integer> -> " + idResult.getData());
    }
}

class ApiResult<T> {
    private final T data;

    public ApiResult(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
