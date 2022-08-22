package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@RequestMapping("/info")
	public String customerInformation(@RequestParam("customerid") String customerid,
			@RequestParam("customername") String customername,
			@RequestParam("customerphone") String customerphone,
			@RequestParam("customeraddress") String customeraddress,
			@RequestParam("customerloginid") String customerloginid,
			@RequestParam("customerpassword") String customerpassword,
			
			Model m) {
		m.addAttribute("customerid",customerid);
		m.addAttribute("customername",customername);
		m.addAttribute("customerphone",customerphone);
		m.addAttribute("customeraddress",customeraddress);
		m.addAttribute("customerloginid",customerloginid);
		m.addAttribute("customerpassword",customerpassword);
		
		return "customerInformation";
	}
	
	@RequestMapping("/form")
	public String customerForm() {

		return "customerForm";
	}
}
