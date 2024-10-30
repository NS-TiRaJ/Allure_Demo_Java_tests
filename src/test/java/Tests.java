import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseClass{

    @Test (description = "Тест кейс 1")
    @Description(value = "Тест получение списка")
    @Severity(SeverityLevel.NORMAL)
    public void positiveTest(){
        Response response = steps.getUsersList();
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test (description = "Тест кейс 2")
    @Description(value = "Тест на авторизацию")
    @Severity(SeverityLevel.NORMAL)
    public void negativeTest(){
        Response response = steps.loginOnSite("email","pass");
        Assert.assertEquals(response.statusCode(),400);
    }
}
