package com.edu.gadgetMaster.exception;

/**
 * @author Ramesh Dilshan
 * @since 03/2022
 **/
public class MyFileNotFoundException extends RuntimeException {
    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
