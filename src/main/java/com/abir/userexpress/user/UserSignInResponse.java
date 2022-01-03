package com.abir.userexpress.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignInResponse {

	private Long id;
	private String name;
	private String email;
	private String token;
	private String refreshToken;

}
