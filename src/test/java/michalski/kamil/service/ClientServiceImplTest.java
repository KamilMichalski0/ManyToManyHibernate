package michalski.kamil.service;

import michalski.kamil.entity.Client;
import michalski.kamil.repository.ClientRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {


    @Autowired
    ClientServiceImpl clientService;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void findById() throws Exception {
        Client clientWithIdOne = clientService.findById((long) 1);
        Assert.assertNotNull(clientWithIdOne);
    }

}