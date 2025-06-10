package br.com.ricardo.devsuperior.service;


import br.com.ricardo.devsuperior.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {
		double valorDesconto = order.getBasic() * (order.getDiscount()/100);


		return order.getBasic() - valorDesconto + shippingService.Shipping(order);
	}
}
