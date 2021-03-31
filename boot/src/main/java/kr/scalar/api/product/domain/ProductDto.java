package kr.scalar.api.product.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data @Lazy
public class ProductDto {
	private long prdNo;
	private String prdName, ctgName, prdImg, prdPrice, prdInv;
}