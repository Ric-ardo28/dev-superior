package br.com.ricardo.devsuperior.service;

import br.com.ricardo.devsuperior.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
	public Double Shipping(Order order) {
		if (order.getBasic() < 100.00) {
			return 20.00;
		}else if (order.getBasic() < 200.00) {
			return 12.00;
		}else {
			return 0.00;
		}
	}

}
