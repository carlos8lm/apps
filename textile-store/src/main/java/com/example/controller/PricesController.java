package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Prices;
import com.example.repository.PricesRepository;
import com.example.response.MessageResponse;

@RestController
@RequestMapping("/store")
public class PricesController {
	
	@Autowired
	private PricesRepository pricesRepository;
	
	@GetMapping("/getAll/{start_date}/{product_id}/{brand_id}")
	public ResponseEntity<?> getProducts(@PathVariable String start_date, @PathVariable Integer product_id,
			@PathVariable Integer brand_id){
		
		try {
		List<Prices> result= pricesRepository.findDesiredProduct(start_date, product_id, brand_id);
		return ResponseEntity.ok(result);
		
		}catch(Exception e) {
			return ResponseEntity.badRequest().body(new MessageResponse("error.prices.list"));
		}		
		
	}
}

	
	


