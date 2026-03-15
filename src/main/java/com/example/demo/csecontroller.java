package com.example.demo;


	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class csecontroller {
		@GetMapping("/add")
	public int addcse(@RequestParam int a, @RequestParam int b) {
		 return a+b;
	 }
		@GetMapping("/mul")
		public int mulcse(@RequestParam int a, @RequestParam int b) {
			 return a*b;
		 }
		

	}



