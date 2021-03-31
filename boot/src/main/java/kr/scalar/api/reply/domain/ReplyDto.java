package kr.scalar.api.reply.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Lazy @Component
public class ReplyDto {
	private long rplNo;
	private String rplContent;

}