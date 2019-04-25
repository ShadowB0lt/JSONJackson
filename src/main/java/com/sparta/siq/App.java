package com.sparta.siq;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
        System.out.println(ratesDeserialiser.getRatesMappedDTO().isSuccess());
        System.out.println(ratesDeserialiser.getRatesMappedDTO().getRates("BOB"));
    }

}
