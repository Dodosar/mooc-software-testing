package tudelft.invoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class InvoiceFilterTest {
    @Test
    void filterInvoices() {

        //InvoiceDao dao = new InvoiceDao();
        Invoice mauricio = new Invoice("Mauricio", 20.0);
        Invoice arie = new Invoice("Arie", 300.0);
        InvoiceDao dao =
                Mockito.mock(InvoiceDao.class);

        List<Invoice> list = Arrays.asList(mauricio,arie);
        Mockito.when(dao.all()).thenReturn(list);

        //dao.save(mauricio);
        //dao.save(arie);

        InvoiceFilter filter = new InvoiceFilter(dao);
        List<Invoice> result = filter.filter();
        System.out.println(result.get(0));
        Assertions.assertEquals(mauricio, result.get(0));
        Assertions.assertEquals(1, result.size());

        //dao.close();
    }

}
