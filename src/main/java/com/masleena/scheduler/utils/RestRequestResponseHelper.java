package com.masleena.scheduler.utils;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class RestRequestResponseHelper {

    public static ResponseEntity getOKWithNull(){
        return new ResponseEntity(HttpStatus.OK);
    }

    //TODO: rewrite with generics
    public static ResponseEntity getOKWithObjext(Object entity) {
        return new ResponseEntity(entity,HttpStatus.OK);
    }
}
