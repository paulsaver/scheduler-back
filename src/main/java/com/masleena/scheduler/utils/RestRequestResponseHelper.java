package com.masleena.scheduler.utils;


import com.google.common.collect.Lists;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class RestRequestResponseHelper {

    public static  <T> ResponseEntity<T> getResponse(T entity, HttpStatus status) {
        return buildResponseEntity(entity, null, status);
    }

    private static <T> ResponseEntity<T> buildResponseEntity(T entity, HttpHeaders httpHeaders, HttpStatus status) {
        if (httpHeaders == null) {
            httpHeaders = new HttpHeaders();
        }
        httpHeaders.setAccessControlMaxAge(86400L);
        httpHeaders.setAccessControlAllowMethods(Lists.newArrayList(
                HttpMethod.OPTIONS,
                HttpMethod.HEAD,
                HttpMethod.GET,
                HttpMethod.PUT,
                HttpMethod.POST,
                HttpMethod.DELETE,
                HttpMethod.PATCH));
        return new ResponseEntity<>(entity, httpHeaders, status);
    }

    public static <T> ResponseEntity<T> getResponse(HttpStatus status) {
        return buildResponseEntity(null, null, status);
    }
}
