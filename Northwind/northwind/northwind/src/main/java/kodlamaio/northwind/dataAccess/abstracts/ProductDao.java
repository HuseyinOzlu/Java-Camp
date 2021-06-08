package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concrates.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName); //ürün ismine göre
	// arar
	
	List<Product> getByProductNameStartsWith(String productName); 
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")// Veri tabanı tablosunu unut
	List<Product> GetByNameAndCategory(String productName, int categoryId);
}