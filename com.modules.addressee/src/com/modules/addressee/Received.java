package com.modules.addressee;

import com.modules.sender.Mail; // módulo Mail

public class Received {

    public static void main(String[] args) {
        Mail mail = new Mail();
        System.out.println("Sender: " + mail.getSender());  //Saída: Sender: Hermione Granger
        System.out.println("Mensage: " + mail.getMensage()); //Saída: Mensage: Hello Miss.Hermione, How are you?
        System.out.println("Address: " + mail.getAddress()); //Saída: Address: Central Park West
        System.out.println("Stamp: " + mail.getStamp()); //Saída: Stamp: True
    }
}
