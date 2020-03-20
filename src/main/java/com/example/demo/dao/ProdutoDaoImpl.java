package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Produto;

@Repository
public class ProdutoDaoImpl extends AbstractDao<Produto, Long> implements ProdutoDao {

}
