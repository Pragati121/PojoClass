package Authentication;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class toVerifyUserIsAbleToGetWeather {

    @Test
    public void toVerifyUserIsAbleToGetCurrentWeather() {

                RestAssured.baseURI = "http://api.weatherapi.com/v1";
        given()
                .header("key", "c68f69073b9441ee9b5150039220111")
                .header("Accept", "application/json")
                .queryParam("q", "Chandigarh")
                .get("/current.json")
                .then()
                .log().all();

    }
}
