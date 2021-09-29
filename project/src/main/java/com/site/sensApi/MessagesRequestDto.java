package com.site.sensApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class MessagesRequestDto {
	
	private String to;
	private String content;

}
