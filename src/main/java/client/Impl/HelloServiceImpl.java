package client.Impl;

import client.Server.HelloService;

public class HelloServiceImpl implements HelloService {
    public String hello(String name){
        return "Hello!" + name;
    }
}

