import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseClass{

    @Test
    public void positiveTest(){
        Response response = steps.getUsersList();
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test
    public void negativeTest(){
        Response response = steps.loginOnSite("email","pass");
        Assert.assertEquals(response.statusCode(),200);
    }
}
