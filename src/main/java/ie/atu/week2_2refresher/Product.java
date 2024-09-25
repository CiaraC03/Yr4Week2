package ie.atu.week2_2refresher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 5, message = "postive and greater than 5")
    private Long id;

    @NotBlank(message= "Name must not be blank")
    private String name;

    @Positive(message = "price has to be a positive")
    private double price;
}
