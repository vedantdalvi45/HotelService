package com.ved.hotel.HotelService.exception;

public class DuplicateEntryException extends RuntimeException{
    public DuplicateEntryException(String message) {
        super(message);
    }
    public DuplicateEntryException(){
        super("Duplicate Entry Exception Occurred");
    }
}
