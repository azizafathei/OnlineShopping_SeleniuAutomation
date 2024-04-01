package Tests;

import Pages.HOME;
import Pages.ProductDetails;
import Pages.Products;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTC extends TestBase
{
    HOME homeobj;
    Products prodobj;
    ProductDetails prodDetailsobj;
    String ProdName="blue top";



    //test case 5 : verify all product page and search for product "blue top" and verify it's details
    @Test
    public void SearchProduct()
    {
        homeobj=new HOME(driver);
        homeobj.OpenProductsPage();
        prodobj=new Products(driver);
        prodobj.SearchProduct(ProdName);

        //assertion that serch process is successfull
        prodDetailsobj=new ProductDetails(driver);
       Assert.assertTrue(prodDetailsobj.checkProdName.getText().equalsIgnoreCase("Blue Top"));

    }
}
