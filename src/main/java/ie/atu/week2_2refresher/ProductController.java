package ie.atu.week2_2refresher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @PostMapping("/products")
    public Product returnProducts(@RequestBody Product product){
        return productService.returnProducts(product);
    }

}
