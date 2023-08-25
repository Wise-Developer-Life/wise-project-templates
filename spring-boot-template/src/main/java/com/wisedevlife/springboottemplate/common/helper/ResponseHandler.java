package com.wisedevlife.springboottemplate.common.helper;

import com.wisedevlife.springboottemplate.common.enums.ErrorCodeEnum;
import com.wisedevlife.springboottemplate.dto.response.ReturnResponse;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
    private ResponseHandler() {}

    public static <T> ResponseEntity<ReturnResponse<T>> success() {
        ReturnResponse<T> response = ReturnResponse.of(1, "success", true, null);
        return ResponseEntity.ok(response);
    }

    public static <T> ResponseEntity<ReturnResponse<T>> success(T data) {
        ReturnResponse<T> response = ReturnResponse.of(1, "success", true, data);
        return ResponseEntity.ok(response);
    }

    public static <T> ResponseEntity<ReturnResponse<T>> badRequest(
            int code, String message, T data) {
        ReturnResponse<T> response = ReturnResponse.of(code, message, false, data);
        return ResponseEntity.badRequest().body(response);
    }

    public static <T> ResponseEntity<ReturnResponse<T>> badRequest(ErrorCodeEnum errorCodeEnum) {
        ReturnResponse<T> response =
                ReturnResponse.of(errorCodeEnum.getCode(), errorCodeEnum.getMessage(), false, null);

        return ResponseEntity.badRequest().body(response);
    }
}
