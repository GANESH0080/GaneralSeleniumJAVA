package com.tutorialspoint.endpoint;

import javax.xml.ws.Endpoint;

import com.tutorialspoint.ws.HelloWorldImpl;

public class HelloWorldPublisher {

   public static void main(String[] args){
      Endpoint.publish("http://localhost:9000/ws/hello", new HelloWorldImpl());
   }
}
