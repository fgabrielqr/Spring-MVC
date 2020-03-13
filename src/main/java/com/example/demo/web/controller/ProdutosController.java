package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.Produto;
import com.example.demo.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoService produtoService;
			
	@GetMapping("/cadastrar")
	public String cadastrar(Produto produto) {
		return "/produto/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("produtos", produtoService.buscarTodos());
		return "/produto/lista"; 
	}
	
	@PostMapping("/salvar")
	public String salvar(Produto produto, RedirectAttributes attr) {
		produtoService.salvar(produto);
		attr.addFlashAttribute("success", "Produto inserido com sucesso.");
		return "redirect:/produtos/cadastrar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("produto", produtoService.buscarPorId(id));
		return "produto/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Produto produto, RedirectAttributes attr) {
		produtoService.editar(produto);
		attr.addFlashAttribute("success", "Produto editado com sucesso.");
		return "redirect:/produtos/cadastrar";
	}	
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		produtoService.excluir(id);
		attr.addFlashAttribute("success", "Produto removido com sucesso.");
		return "redirect:/produtos/listar";
	}
}
