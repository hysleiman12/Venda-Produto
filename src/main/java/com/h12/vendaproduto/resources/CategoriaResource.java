package com.h12.vendaproduto.resources;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.h12.vendaproduto.domain.Categoria;

//EndPoint 
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	//@GetMapping
	@RequestMapping(method=RequestMethod.GET )
	public List<Categoria> listar() {
		
		Categoria categoria01 = new Categoria(1, "Calças");
		Categoria categoria02 = new Categoria(2, "Camisas/Camisetas");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(categoria01);
		lista.add(categoria02);
		return lista;
		
	}
}
