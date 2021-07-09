package com.modules.sender;

public class Mail {

    private String sender = "Hermione Granger";
    private String mensage = "Hello Miss.Hermione, How are you?";
    private String address = "Central Park West";
    private Boolean stamp = true;

    public String getSender() {
        return sender;
    }

    public String getMensage() {
        return mensage;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getStamp() {
        return stamp;
    }
}
