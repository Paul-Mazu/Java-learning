package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product bread = new Product("Bread");
        Product milk = new Product("Milk");

        Item item1 = new Item(new BigDecimal(2.35), 3);
        Item item2 = new Item(new BigDecimal(2.99), 1);
        Item item3 = new Item(new BigDecimal(2.35), 1);

        bread.getItems().add(item1);
        bread.getItems().add(item3);
        milk.getItems().add(item2);

        item1.setProduct(bread);
        item3.setProduct(bread);
        item2.setProduct(milk);

        Invoice invoice = new Invoice("01/08/2018");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp

    }
}
