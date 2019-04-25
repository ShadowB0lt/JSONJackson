package com.sparta.siq;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class RatesDeserialiser {

    private RatesDTO ratesMappedDTO;

    public RatesDeserialiser(String filePath) {

        ObjectMapper ratesObject = new ObjectMapper();

        try
        {
            ratesMappedDTO = ratesObject.readValue(new File(filePath),RatesDTO.class);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public RatesDTO getRatesMappedDTO()
    {
        return  ratesMappedDTO;
    }
}
