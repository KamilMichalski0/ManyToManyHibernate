package michalski.kamil.service;


import michalski.kamil.entity.Order;
import michalski.kamil.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl {


    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findOne(id);
    }

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }



}
