package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
			
			@GetMapping("/cadastrar")
			public String cadastrar() {
				return "/produto/cadastro";
			}
			
			@GetMapping("/listar")
			public String listar() {
				return "/produto/lista";
			}
		}