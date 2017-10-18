package com.br.grifoo.pedidos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pedidos")
public class PedidosController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String obterPedidos() {
		return "pedidos";
	}
}
