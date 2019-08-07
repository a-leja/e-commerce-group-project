package com.kodilla.ecommercee.domain.dto;
import com.kodilla.ecommercee.domain.ProductItem;
import com.kodilla.ecommercee.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CartDto {
     private Long id;
     //private List<ProductDto> productList;
     private List<ProductItem> productItems;      // TODO: stworzyc productItem dto, service, mapper
     private User user;
}
