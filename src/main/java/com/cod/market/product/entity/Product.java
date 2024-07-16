package com.cod.market.product.entity;

import com.cod.market.base.entity.BaseEntity;
import com.cod.market.cart.entity.Cart;
import com.cod.market.member.entity.Member;
import com.cod.market.question.entity.Question;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

    private String title;
    private String description;
    private int price;
    private int hitCount;
    private String isActive;
    private String thumbnailImg;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Question> questionList;

    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Cart> cartList;

    @ManyToOne
    private Member member;

}
