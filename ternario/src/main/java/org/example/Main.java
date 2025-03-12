package org.example;

public class Main {
    public static void main(String[] args) {

        int hora = 19;
        String status = hora <=20 ? "Aberto" : "Fechado";

//        if(hora <= 20) {
//            status = "Aberto";
//        } else {
//            status = "Fechado";
//        }

        System.out.println("Status: " + status);
    }
}