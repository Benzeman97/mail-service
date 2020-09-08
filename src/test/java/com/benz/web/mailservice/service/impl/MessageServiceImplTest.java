package com.benz.web.mailservice.service.impl;

import com.benz.web.mailservice.util.Country;
import com.benz.web.mailservice.util.CountryCode;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageServiceImplTest {



    @Test
    public void generateId()
    {
        long r= ThreadLocalRandom.current().nextLong(1000,10000);

        String gen_random=String.valueOf(r);


        String country="uk";

        Pattern pattern=Pattern.compile("\\s");

        Matcher matcher=pattern.matcher(country);

        if(matcher.find())
          country=country.replaceAll("\\s","_").toUpperCase();

        switch (country.toUpperCase())
        {
            case Country.SRI_LANKA: gen_random=getGeneratedId(gen_random,CountryCode.SRI_LANKA);break;
            case Country.UK: gen_random=getGeneratedId(gen_random,CountryCode.UK);break;
            case Country.USA: gen_random=getGeneratedId(gen_random,CountryCode.USA);break;
            case Country.INDIA: gen_random=getGeneratedId(gen_random,CountryCode.INDIA);break;
            case Country.AUSTRALIA: gen_random=getGeneratedId(gen_random,CountryCode.AUSTRALIA);break;
            default:
                gen_random="Not Generated";
                System.out.println("Invalid Input");
        }

        System.out.println("Generated Id is "+gen_random);

    }

  public String getGeneratedId(String random,String c_code)
  {
         String f_gen=random.substring(0,2);
         String l_gen=random.substring(2);
         return f_gen+c_code+l_gen;
  }

}

