package com.jackson.issue.deserialize;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.issue.deserialize.dto.FlavorDTO;
import com.jackson.issue.deserialize.dto.FruitDTO;
import com.jackson.issue.deserialize.dto.SmellDTO;


public class DeserializeApplication {

    public static void main(String[] args) throws JsonProcessingException {

        //final String jsonString = getFruitJsonString();
        String fruitJson = "{\"name\":\"apple\",\"flavorDTO\":{\"color\":\"yellow\",\"taste\":\"sweet\",\"smell\":{\"smellsGood\":true}}}";
        ObjectMapper mapper = new ObjectMapper();
        FruitDTO fruitDTO = mapper.convertValue(fruitJson, FruitDTO.class);
        System.out.println(fruitDTO.toString());

    }

     /***
     * Prints the json string for the {@link com.jackson.issue.deserialize.dto.FruitDTO}
     * 
     */
    private static String getFruitJsonString() throws JsonProcessingException {

        SmellDTO smellDTO = new SmellDTO();
        smellDTO.setSmellsGood(true);

        FlavorDTO flavorDTO = new FlavorDTO();
        flavorDTO.setSmell(smellDTO);
        flavorDTO.setColor("yellow");
        flavorDTO.setTaste("sweet");

        FruitDTO fruitDTO = new FruitDTO();
        fruitDTO.setFlavorDTO(flavorDTO);
        fruitDTO.setName("apple");

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(fruitDTO);
        return jsonString;
    }

}
