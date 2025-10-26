package com.sys.ch8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	private final MainController mainController;

	private final ProductService productService;

	public ProductController(ProductService productService, MainController mainController) {
		this.productService = productService;
		this.mainController = mainController;
	}

	@GetMapping("/products")
	public String products(Model model) {
		var products = productService.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}

	@PostMapping("/products")
	public String addProduct(@RequestParam Product product, Model model) {
		productService.addProduct(product);

		var products = productService.findAll();
		model.addAttribute("products", products);

		return "products.html";
	}
}
