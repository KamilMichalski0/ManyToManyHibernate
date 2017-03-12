package michalski.kamil.service;

import michalski.kamil.entity.Client;
import michalski.kamil.entity.Order;
import michalski.kamil.entity.Product;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.JVM)
public class OrderServiceImplTest {

    @Autowired
    ClientServiceImpl clientService;
    @Autowired
    ProductServiceImpl productService;
    @Autowired
    OrderServiceImpl orderService;


    private Client client;

    private Product product;



    @Before
    public void setUp() throws Exception {
        this.client = clientService.findById(1L);
        this.product = productService.findById(1L);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void saveOrder() throws Exception{

        List<Product> products = new ArrayList<>();
        products.add(this.product);

        Order order = new Order();
        order.setClient(this.client);
        order.setProducts(products);
        orderService.saveOrder(order);
    }


    @Test
    @Transactional
    public void shouldHaveOneOrder(){
        List<Order> orders  = orderService.findAll();
        orders.forEach(System.out::println);
        Assert.assertEquals(1,orders.size());
    }

}