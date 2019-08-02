package com.kodilla.ecommercee.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderDto {
    private Long id;
    private LocalDate date;
    private boolean isCompleted;
    private List<ProductDto> productList;
    private Long userId;

    public OrderDto(Long id, LocalDate date, boolean isCompleted, Long userId) {
        this.id = id;
        this.date = date;
        this.isCompleted = isCompleted;
        this.userId = userId;
        this.productList = new ArrayList<>();
    }
}
