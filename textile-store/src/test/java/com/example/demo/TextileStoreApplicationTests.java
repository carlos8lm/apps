package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.entity.Prices;
import com.example.repository.PricesRepository;

import junit.framework.Assert;

@SpringBootTest
class TextileStoreApplicationTests {
	  
	  @MockBean
	  private PricesRepository pricesRepository;

	@Test
	public void testProductValidation() throws Exception {
		
		List<Prices> optProduct = List.of(createProduct());
		
		List<Prices> result= pricesRepository.findDesiredProduct("2020-06-14-00.00.00",35455,1);
		
		Assert.assertEquals(optProduct, result);
				
		
	}
	
	  private Prices createProduct() {
		  
		  Prices product = new Prices();
		  
		  product.setProduct_id(35455);
		  product.setBrand_id(1);
		  product.setPrice_list(1);
		  product.setStart_date("2020-06-14-00.00.00");
		  product.setEnd_date("2020-06-14-00.00.00");
		  product.setPrice(35.50);
		  
		    return product;
		  }

}
