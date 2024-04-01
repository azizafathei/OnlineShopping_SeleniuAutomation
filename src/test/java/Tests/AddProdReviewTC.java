package Tests;

import Pages.ProductDetails;
import org.testng.annotations.Test;

public class AddProdReviewTC extends TestBase
{
    ProductDetails detailsobj;

    String name="aza";
    String mail="azasobhi@gmail.com";
    String  review="product is perfict";

    //test case 6 : add review on product

    @Test
    public void AddReview ()
    {
        detailsobj=new ProductDetails(driver);
        detailsobj.AddReview(name,mail,review);
    }


}
