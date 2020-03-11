package com.example.demo.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "Produtos")
public class Produto extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true)
	private String nome;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name = "dataEntrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	
}
