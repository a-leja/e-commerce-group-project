package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "\"ORDERS\"")
public class Order {

    public static String AWAITING = "is awaiting acceptance for implementation";
    public static String IN_PROGRESS = "in progress";
    public static String SEND = "send";

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private boolean isCompleted;


    @ManyToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<ProductItem> productItems;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @Setter
    private User user;

    private BigDecimal valueOfOrder;

    @Setter
    private String trelloCardId;

    @Setter
    private String status = AWAITING;




    public Order(Long id, LocalDate date, boolean isCompleted, User user) {
        this.id = id;
        this.date = date;
        this.isCompleted = isCompleted;
        this.productItems = new ArrayList<>();
        this.user = user;
    }

    public Order(LocalDate date, boolean isCompleted, User user) {
        this.date = date;
        this.isCompleted = isCompleted;
        this.productItems = new ArrayList<>();
        this.user = user;
    }

    public Order(LocalDate date, boolean isCompleted) {
        this.date = date;
        this.isCompleted = isCompleted;
        this.productItems = new ArrayList<>();
    }

    public Order(LocalDate date, boolean isCompleted, User user, BigDecimal valueOfOrder) {
        this.date = date;
        this.isCompleted = isCompleted;
        this.user = user;
        this.valueOfOrder = valueOfOrder;
        this.productItems = new ArrayList<>();
    }
}