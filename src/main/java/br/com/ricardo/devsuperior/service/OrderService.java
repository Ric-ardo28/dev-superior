package br.com.ricardo.devsuperior.service;


import br.com.ricardo.devsuperior.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	public Double total(Order order) {
		return order.getBasic() * order.getDiscount();
	}
}
