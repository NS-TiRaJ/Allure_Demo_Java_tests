import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Steps {

    @Step("Позитивный тест")
    public Response getUsersList(){
        return RestAssured.given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .extract()
                .response();
    }
    @Step("Негативный тест")
    public Response loginOnSite(String email, String password){
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{email:\""+email+"\""+", password: \""+password+"\"}")
                .when()
                .post("https://reqres.in/api/login")
                .then()
                .extract()
                .response();
    }
}
