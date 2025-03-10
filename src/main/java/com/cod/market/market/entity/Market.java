package com.cod.market.market.entity;

import com.cod.market.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
public class Market extends BaseEntity {

    private String email;

    private String name;

    private String info;

}
