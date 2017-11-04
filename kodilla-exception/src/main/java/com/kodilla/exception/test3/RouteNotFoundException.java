package com.kodilla.exception.test3;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(final String message){
        super(message);
    }
}
