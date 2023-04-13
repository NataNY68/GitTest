package get;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojo.ResultPojo;
import pojo.StarWarsPojo;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StarWars {
    /*
        1. Defined/determined the endpoint
        2. Added query string params as needed
        3. Defined HTTP Method
        4. Send
        5. Validate status code
     */

    @Test
    public void getStarWarsCharacters() {
        //https://swapi.dev/api/people
        RestAssured.given().when().get("https://swapi.dev/api/people").then().statusCode(200).log().body();
    }

    @Test
    public void getSWCharsDeserialized() {
        Response response = RestAssured.given().header("Accept", "application/json").
                when().get("https://swapi.dev/api/people").then().statusCode(200).
                extract().response();


        Map<String, Object> deserializedResponse = response.as(new TypeRef<Map<String, Object>>() {
        });

        int count = (int) deserializedResponse.get("count");
        Assert.assertEquals(82, count);

        List<Map<String, Object>> result = (List<Map<String, Object>>) deserializedResponse.get("result");

       /*
          validate that SW API Count value is correct, we have total of 82 characters
   get list of all SW characters name
   find only characters gender is female Map<String, List <String>> -> female:
        */
    }

    @Test
    public void swapiGetWithPojo() {
        Response response = RestAssured.given().header("Accept", "application/json")
                .when().get("https://swapi.dev/api/people")
                .then().statusCode(200).extract().response();

        StarWarsPojo deserializedResp = response.as(StarWarsPojo.class);
        int actualCount = deserializedResp.getCount();
        int expectedCount = 82;
        Assert.assertEquals(expectedCount, actualCount);

        List<ResultPojo> results = deserializedResp.getResults();
        for (ResultPojo result : results) {
            System.out.println(result.getName()
            );
        }

    }

    @Test
    public void hw(){
        List<String> allNames = new ArrayList<>();
        int count =0;
        for(int i=1; i>0; i++){
            Response response = RestAssured.given().header("Accept", "application/json").
                    when().get("https://swapi.dev/api/people/?page="+i).then().statusCode(200).
                    extract().response();

            Map<String, Object> deserializedResponse= response.as(new TypeRef<Map<String, Object>>() {
            });
            count=(int)deserializedResponse.get("count");
        }
    }


    @Test
    public void homework() {
        Response response = RestAssured.given().header("Accept", "application/json").
                when().get("https://swapi.dev/api/people").then().statusCode(200).
                extract().response();

        Map<String, Object> deserializedResponse = response.as(new TypeRef<Map<String, Object>>() {});

        int count = (int) deserializedResponse.get("count");
        Assert.assertEquals(82, count);

        List<Map<String, Object>> result = (List<Map<String, Object>>) (deserializedResponse.get("results"));

        String next = (String) deserializedResponse.get("next");
        int num = result.size();
        List<String> allNames = new ArrayList<>();
        List<String> allFemale = new ArrayList<>();
        do {

            for (Map<String, Object> each : result) {
                allNames.add((String) each.get("name"));
                if (each.get("gender").equals("female")) {
                    allFemale.add((String) each.get("name"));
                }
            }

            response = RestAssured.given().header("Accept", "application/json").
                    when().get(next).then().statusCode(200).extract().response();

            deserializedResponse = response.as(new TypeRef<Map<String, Object>>() {
            });
            next = (String) deserializedResponse.get("next");
            result = (List<Map<String, Object>>) (deserializedResponse.get("results"));
            num += result.size();
            if (next == null) {
                for (Map<String, Object> each : result) {
                    allNames.add((String) each.get("name"));
                }
            }

        } while (next != null);
        System.out.println(allFemale);
        System.out.println(allNames.size());
        System.out.println(num);
        System.out.println(allNames);
        Assert.assertEquals(num, count);

    }
}
