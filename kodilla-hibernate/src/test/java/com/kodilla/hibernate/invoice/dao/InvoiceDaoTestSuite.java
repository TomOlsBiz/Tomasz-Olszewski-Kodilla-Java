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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        Item item1 = new Item(product1, new BigDecimal("5"), 2);
        Item item2 = new Item(product2, new BigDecimal("3"), 3);
        Item item3 = new Item(product3, new BigDecimal("2"), 4);

        product1.getItem().add(item1);
        product2.getItem().add(item2);
        product3.getItem().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        List<Item> itemList = new ArrayList<>();

        Invoice invoice = new Invoice("Invoice1", itemList);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        invoiceDao.save(invoice);

        //Then
        Assert.assertNotEquals(0, invoice);
        Assert.assertEquals(3, invoiceDao.findById(invoice.getId()).getItems().size());
        Assert.assertEquals(invoice.getId(), invoiceDao.findById(invoice.getId()).getId());

        //CleanUp
        try {
            int product1Id = product1.getId();
            int product2Id = product2.getId();
            int product3Id = product3.getId();

            int item1Id = item1.getId();
            int item2Id = item2.getId();
            int item3Id = item3.getId();

            int invoiceId = invoice.getId();

            productDao.delete(product1Id);
            productDao.delete(product2Id);
            productDao.delete(product3Id);

            itemDao.delete(item1Id);
            itemDao.delete(item2Id);
            itemDao.delete(item3Id);

            invoiceDao.delete(invoiceId);

        } catch (Exception e) {

        }
    }
}


