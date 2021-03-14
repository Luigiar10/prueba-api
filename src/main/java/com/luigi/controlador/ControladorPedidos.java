package com.luigi.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luigi.modelo.Pedidos;
import com.luigi.servicio.IPedidos;

@RestController
@RequestMapping("/v1/api")
public class ControladorPedidos{
	
	@Autowired
	private IPedidos repositoryPedidos;
	
	@GetMapping
	@RequestMapping("/pedidos")
	public List<Pedidos> saludo() {
		return repositoryPedidos.findAll();
	}
	
	@GetMapping(value = "/pedidos/{cedulaCliente}")
	public Object getPedidosId(@PathVariable Long cedulaCliente) {
		return repositoryPedidos.findById(cedulaCliente);
	}
	
	// Post for send data of buy
	@PostMapping
	public Object postPedidos(@RequestBody Pedidos datos) {
		return repositoryPedidos.save(datos);
	}
	
	@DeleteMapping(value = "/pedidos/{cedulaCliente}")
	public Object deletePedido(@PathVariable Long cedulaCliente) {
		repositoryPedidos.deleteById(cedulaCliente);
		return "Borrado del pedido exitosamente";
	}
}
