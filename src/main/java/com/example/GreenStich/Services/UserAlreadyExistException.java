package com.example.GreenStich.Services;

public class UserAlreadyExistException extends Throwable
{
    public UserAlreadyExistException(String message)
    {
        super(message);
    }
}
