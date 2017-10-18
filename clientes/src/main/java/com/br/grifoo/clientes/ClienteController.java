package com.br.grifoo.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {
	
	@Autowired
	public PedidosService pedidoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> obterPedidos() {
		return new ResponseEntity<>("find by clientes" + pedidoService.findAllPedidos(), HttpStatus.OK);
	}

}
