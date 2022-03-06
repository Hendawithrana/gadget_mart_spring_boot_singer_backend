package com.edu.gadgetMaster.exception;

/**
 * @author Ramesh Dilshan
 * @since 03/2022
 **/
public class FileStorageException extends RuntimeException{
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
