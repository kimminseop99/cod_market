package com.cod.market.answer.entity;

import com.cod.market.base.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.question.entity.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Answer extends BaseEntity {

    private String comment;

    @OneToMany
    private Member member;

    @OneToMany
    private Question question;
}
