package com.cod.market.question.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class QuestionForm {
    @NotBlank(message = "내용은 필수항목입니다.")
    private String content;
}

