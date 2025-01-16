package com.jackson.issue.deserialize;



import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.issue.deserialize.dto.FlavorDTO;
import com.jackson.issue.deserialize.dto.FruitDTO;
import com.jackson.issue.deserialize.dto.SmellDTO;


public class DeserializeApplication {

    public static void main(String[] args) throws JsonProcessingException {

        String fruitJsonList = "[{\"name\":\"mango\",\"flavorDTO\":{\"color\":\"yellow\",\"taste\":\"sweet\",\"smell\":{\"smellsGood\":true}}}]";
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<FruitDTO> fruitDTOList = mapper.readValue(fruitJsonList, new TypeReference<List<FruitDTO>>(){});
        System.out.println(fruitDTOList.toString());

   /*     String fruitJson = "{\"name\":\"mango\",\"flavorDTO\":{\"color\":\"yellow\",\"taste\":\"sweet\",\"smell\":{\"smellsGood\":true}}}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        FruitDTO fruitDTO = mapper.readValue(fruitJson, FruitDTO.class);
        System.out.println(fruitDTO.toString());*/

    }


    /***
     * Prints the json string for the {@link com.jackson.issue.deserialize.dto.FruitDTO}
     *
     */
    private static String getFruitJsonString() throws JsonProcessingException {

        SmellDTO smellDTO = new SmellDTO();

        FlavorDTO flavorDTO = new FlavorDTO();
        flavorDTO.setSmell(smellDTO);
        flavorDTO.setColor("yellow");
        flavorDTO.setTaste("sweet");

        FruitDTO fruitDTO = new FruitDTO();
        fruitDTO.setFlavorDTO(flavorDTO);
        fruitDTO.setName("mango");

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(fruitDTO);
        return jsonString;
    }



}
