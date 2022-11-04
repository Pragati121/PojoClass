package Authentication;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ToVerifyUserIsCreatingAReqeust {
@Test
    public void PostRequest()
{
    RestAssured.baseURI="https://reqres.in/api/users";
    RestAssured.given().body( " \"name\": \"morpheus\",\n" +
            "    \"job\": \"leader\"").post().then().log().all()
            .assertThat()
            .statusCode(201);
}
}
