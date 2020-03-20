package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Produto;

public interface ProdutoDao {

	void save(Produto produto );

    void update(Produto produto);

    void delete(Long id);

    Produto findById(Long id);

    List<Produto> findAll();

}
