package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.Arrays;
import java.util.List;


public class DiscountApplierTest {

    @Test
    public void setNewPrice(){

    Product prod1 = new Product("Porche", 50000.00,"HOME");
    Product prod2 = new Product("KAMAZ", 50000.00,"BUSINESS");
    Product prod3 = new Product("SOBR", 100000.00,"BUSINESS");

    ProductDao dao = Mockito.mock(ProductDao.class);

    List<Product> results = Arrays.asList(prod1,prod2,prod3);
    Mockito.when(dao.all()).thenReturn(results);

    DiscountApplier setPrice = new DiscountApplier(dao);
    setPrice.setNewPrices();

        Assertions.assertEquals(3,results.size(),"number of lines");
        Assertions.assertEquals(55000.00,(float)results.get(0).getPrice());
        Assertions.assertEquals(45000.00,(float)results.get(1).getPrice());
        Assertions.assertEquals(90000.00,(float)results.get(2).getPrice());
        Assertions.assertEquals("Porche",results.get(0).getName());
        Assertions.assertEquals(55000.00,(float)results.get(0).getPrice(),"Porche");
        //assertLines

    }


}
