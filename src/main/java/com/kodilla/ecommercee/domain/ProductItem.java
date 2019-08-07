package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.domain.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductItem {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "productItem")
    private List<Product> products;
    private int quantity;
    private BigDecimal ammount;
    // TODO: quantity i ammount liczone na podstawie elementow w Products, wykoanie w ProductItemService
}
