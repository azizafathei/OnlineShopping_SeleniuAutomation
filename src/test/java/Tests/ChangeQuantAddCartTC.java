package Tests;

import Pages.HOME;
import Pages.ProductDetails;
import org.testng.annotations.Test;

public class ChangeQuantAddCartTC  extends  TestBase
{
    ProductDetails detailsobj;
  HOME homeobj;

    //test case 7: change product quantity
    @Test
    public void ChangeQuantity()
    {
        detailsobj = new ProductDetails(driver);
        detailsobj.changeProdQuantity();
    }

    //test case 8: add product to cart
    @Test(dependsOnMethods = "ChangeQuantity")
    public void AddCart()
    {
        detailsobj = new ProductDetails(driver);
        detailsobj.AddToCart();


    }
      @Test(dependsOnMethods = "AddCart")
    public void openCartPage()
      {
          homeobj = new HOME(driver);
          homeobj.OpenCartPage();

      }
        }