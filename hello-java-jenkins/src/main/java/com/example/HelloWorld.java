package com.example;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class HelloWorld {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/", exchange -> {
            String response = "Java app is running inside Docker 🚀";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        });

        server.start();
        System.out.println("Server started on port 8080");
    }
}

