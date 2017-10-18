package com.br.grifoo.clientes;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("PEDIDOS-SERVICE")
public interface PedidosService {
	
	@RequestMapping(value = "/api/pedidos", method = RequestMethod.GET)
	public String findAllPedidos();

}
