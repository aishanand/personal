package com.jackson.issue.deserialize.dto;


import java.io.Serializable;
import java.util.StringJoiner;


public class FruitDTO implements Serializable {

    private static final long serialVersionUID = 7391907107444425699L;

    private String name;

    private FlavorDTO flavorDTO;

    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }



    public FlavorDTO getFlavorDTO() {

        return flavorDTO;
    }


    public void setFlavorDTO(FlavorDTO flavorDTO) {

        this.flavorDTO = flavorDTO;
    }



    @Override
    public String toString() {

        return new StringJoiner(", ", FruitDTO.class.getSimpleName() + "[", "]").add("name='" + name + "'").add("flavorDTO=" + flavorDTO)
                                                                                .toString();
    }
}
