package com.jackson.issue.deserialize.dto;


import java.io.Serializable;
import java.util.StringJoiner;


public class FlavorDTO implements Serializable {

    private static final long serialVersionUID = 227259101569063773L;

    private String color;
    private String taste;

    private SmellDTO smell;


    public String getColor() {

        return color;
    }


    public void setColor(String color) {

        this.color = color;
    }


    public String getTaste() {

        return taste;
    }


    public void setTaste(String taste) {

        this.taste = taste;
    }


    public SmellDTO getSmell() {

        return smell;
    }


    public void setSmell(SmellDTO smell) {

        this.smell = smell;
    }


    @Override
    public String toString() {

        return new StringJoiner(", ", FlavorDTO.class.getSimpleName() + "[", "]").add("color='" + color + "'").add("taste='" + taste + "'")
                                                                                 .add("smell=" + smell).toString();
    }
}
