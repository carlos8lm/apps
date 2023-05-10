package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Prices;

@Repository
public interface PricesRepository extends JpaRepository<Prices,Integer> {
	
	@Query(value = "SELECT product_id, brand_id, price_list, start_date, end_date, price "
			+ "FROM Prices WHERE start_date='?' AND product_id=? AND brand_id=?",nativeQuery = true)
	List<Prices> findDesiredProduct(String start_date, Integer product_id, Integer brand_id);


}
