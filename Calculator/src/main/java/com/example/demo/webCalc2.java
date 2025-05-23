package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webCalc2 {
	@GetMapping("calcii/{operations}/{a}/{b}/{c}")
 int Calculation(@PathVariable String operations , @PathVariable int a ,@PathVariable int b , @PathVariable int c )
{
	if(operations.equals("add"))
	{
		return a+b+c;
	}
	if(operations.equals("sub"))
	{
		return a-b-c;
	}
	if(operations.equals("mul"))
	{
		return a*b*c;
	}
	if(operations.equals("div"))
	{
		return a/b/c;
	}
 return 0;	
}
}
