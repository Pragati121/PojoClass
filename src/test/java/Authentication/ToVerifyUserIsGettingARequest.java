package Authentication;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ToVerifyUserIsGettingARequest {
    @Test
    public void GetRequest(){
        RestAssured.baseURI="https://reqres.in/api/users/2";
        RestAssured.given().param("page","2")
                .when()
                .get()
                .then()
                .assertThat()
                .log()
                .all().statusCode(200);

    }
}
