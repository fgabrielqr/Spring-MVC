package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ProdutoDao;
import com.example.demo.domain.Produto;

@Service @Transactional(readOnly = true)
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoDao dao;

	@Transactional(readOnly = false)
	@Override
	public void salvar(Produto produto) {
		dao.save(produto);
	}

	@Transactional(readOnly = false)
	@Override
	public void editar(Produto produto) {
		dao.update(produto);
		
	}
	
	@Transactional(readOnly = false)
	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override 
	public Produto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override 
	public List<Produto> buscarTodos() {
		
		return dao.findAll();
	}

}
