package com.kang.cqrs.product.command.application.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // 필수 매개변수 생성자 final이 붙어있는 생성자를 초기화해줌
public class ProductCreateRequest {

    @NotBlank
    private final String productName;

    @Min(value = 1)
    private final Long productPrice;

    @NotBlank
    private final String productDescription;

    @Min(value = 1)
    private final Long categoryCode;

    @Min(value = 1)
    private final Long productStock;

}
