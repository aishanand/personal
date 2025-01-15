package com.jackson.issue.deserialize.dto;


import java.io.Serial;
import java.io.Serializable;
import java.util.StringJoiner;


public class SmellDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -6230992163348291381L;

    private boolean smellsGood;


    public boolean isSmellsGood() {

        return smellsGood;
    }


    public void setSmellsGood(boolean smellsGood) {

        this.smellsGood = smellsGood;
    }


    @Override
    public String toString() {

        return new StringJoiner(", ", SmellDTO.class.getSimpleName() + "[", "]").add("smellsGood=" + smellsGood).toString();
    }
}
