package com.cod.market.question.entity;

import com.cod.market.base.entity.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.product.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Question extends BaseEntity {


    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;


}
