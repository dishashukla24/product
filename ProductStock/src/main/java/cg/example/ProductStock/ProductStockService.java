package cg.example.ProductStock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductStockService {

	@Autowired
    private ProductStockRepo pr;

   public int getStockById(int id) {
	   return pr.getById(id).getStock();
   }

}