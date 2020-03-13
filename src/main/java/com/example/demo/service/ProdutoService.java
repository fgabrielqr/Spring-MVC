package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Produto;

public interface ProdutoService {

	void salvar(Produto produto);
	
	void editar(Produto produto);
	
	void excluir(Long id);
	
	Produto buscarPorId(Long id);
	
	List<Produto> buscarTodos();
}
