package get;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojo.PokemonAbPojo;
import pojo.PokemonAbilitiesPojo;
import pojo.PokemonPojo;
import pojo.PokemonResultPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pokemon {

    @Test
    public void getPokemonWithPojo(){
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon";
        Response response = RestAssured.given().header("Accept", "application/json")
                .queryParam("limit", "100")
                .when().get()
                .then().statusCode(200).extract().response();

        PokemonPojo deserializedResp = response.as(PokemonPojo.class);
        int actualCount = deserializedResp.getCount();
        int expectedCount = 1279;
        Assert.assertEquals(expectedCount, actualCount);

        int count=0;
        List<PokemonResultPojo> results = deserializedResp.getResults();
        for (PokemonResultPojo result :results) {
            count ++;
            if(result.getName().equalsIgnoreCase("pikachu")){
                System.out.println(result.getUrl());
            }
        }
       Assert.assertEquals(100, count);
    }

    @Test
    public void homeworkPokemon(){
        Response response = RestAssured.given().header("Accept", "application/json")
                .when().get("https://pokeapi.co/api/v2/pokemon").then().
                statusCode(200).extract().response();
       PokemonPojo deserializedResp = response.as(PokemonPojo.class);
       List<PokemonResultPojo> results = deserializedResp.getResults();
       Assert.assertEquals(20, results.size());
       List<String> allUrl = new ArrayList<>();
       Map<String, Object> map = new HashMap<>();


        for (PokemonResultPojo res : results) {
            allUrl.add(res.getUrl());
            for (int i=0; i< allUrl.size();i++) {
                response = RestAssured.given().header("Accept", "application/json")
                        .when().get(allUrl.get(i)).then().statusCode(200).extract().response();
                    PokemonAbPojo deserializedResp1 = response.as(PokemonAbPojo.class);
                List <PokemonAbilitiesPojo> abilities = deserializedResp1.getAbilities();
                System.out.println(abilities);
                //Map<String, String> l=

            }
        } System.out.println(map);
    }
}
