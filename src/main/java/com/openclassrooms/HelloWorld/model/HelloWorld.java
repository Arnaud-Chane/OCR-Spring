package com.openclassrooms.HelloWorld.model;

public class HelloWorld {
    private String value = "Helo World.";

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }

}
