package order;


import lombok.Data;
import product.ProductDto;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private BigDecimal totalAmount;
    private Long userId;
    private String nickName;
    private String address;
    private List<ProductDto> productDtoList;
}
