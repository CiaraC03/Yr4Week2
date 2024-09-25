package ie.atu.week2_2refresher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();


    public List<Product> getProductList() {
        return productList;
    }


    public Product returnProducts(@RequestBody Product product) {
        productList.add(product);
        return product;
    }

    //updating a product by id name
    public Product updateProducts(Product product)
    {
        for (Product prod : productList)
        {
            if (prod.getId() == product.getId())
            {
                prod.setName(product.getName());
                prod.setPrice(product.getPrice());
                return prod;
            }
        }
        return null;
    }

   //deleting a product by id

   public void deleteProducts(Long id)
   {
      for (Product prod : productList)
      {

      }
   }







}