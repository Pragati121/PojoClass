package Authentication;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyUserIsAbleToCreateTheInformation {
    @Test
    public void PostMethod(){
            RestAssured.baseURI = "https://api.stripe.com";
            RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + "sk_test_51M02FISJipQbhGpcRBjuHBMEJjdqOdvABUmsXHQUuTH4hxZv6IZBOyC7oRF2EI9w5IwX3Sk3Jh2hn9SeoLDdojwW004I8vx2DB")
                    .header("content-type", "application/json");
        Response res = httpRequest.post("v1/customers");
            System.out.println("The response code - " +res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(),200);
        }
        }


