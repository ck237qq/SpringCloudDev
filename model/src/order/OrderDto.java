package order;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDto {
    private Long id;
    private BigDecimal totalAmount;
    private Long userId;
    private String nickName;
    private String address;
//    private List<Product> products;
}
