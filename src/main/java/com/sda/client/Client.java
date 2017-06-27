package com.sda.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws IOException {

        String host = "192.168.2.120";  //"localhost"; //127.0.0.1
        int port = 4444;

        Socket socket = new Socket(host,port);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true); //if true autamatycznie wypycha buffer

        printWriter.println("Work HARD !!!");
        //printWriter.flush();


        String response = reader.readLine();
        System.out.println("Response: "+response);
        printWriter.close();
        reader.close();


    }
}
