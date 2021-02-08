package com.db.edu.services;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Printer {
    public static void print(String message) {
        System.out.println(message);
    }
    public static void printSysProperties(final String... args) {
        System.getProperties()
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void printHostNameAndAddress(final String... args) {

        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println(ip);
            System.out.println(ip.getHostName());
        } catch (UnknownHostException e) {
        }
    }

}
