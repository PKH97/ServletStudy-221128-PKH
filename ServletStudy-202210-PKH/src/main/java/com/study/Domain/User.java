package com.study.Domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
	private String username;
	private String password;
	private String name;
	private String email;
	private String roles; // ROLE_USER, ROLE_MANAGER, ROLE_ADMIN -> 회원가입시, 한 후 등 에 영향이 간다.
}
