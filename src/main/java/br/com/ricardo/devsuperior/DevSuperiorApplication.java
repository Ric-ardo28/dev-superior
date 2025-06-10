package br.com.ricardo.devsuperior;

import br.com.ricardo.devsuperior.entity.Order;
import br.com.ricardo.devsuperior.service.OrderService;
import br.com.ricardo.devsuperior.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DevSuperiorApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;



	public static void main(String[] args) {
		SpringApplication.run(DevSuperiorApplication.class, args);
	}

		@Override
		public void run (String...args) throws Exception {


			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			System.out.println("Codigo do pedido");
			Integer code = sc.nextInt();
			System.out.println("Valor basico");
			Double basic = sc.nextDouble();
			System.out.println("Desconto");
			Double discount = sc.nextDouble();

			Order order = new Order(code, basic, discount);

			Double valorTotal = orderService.total(order);


			System.out.println("Pedido Codigo " + code);
			System.out.println("Valor Total " + valorTotal);

			sc.close();

		}

	}

