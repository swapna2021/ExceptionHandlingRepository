package com.ust.jdbcproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserClass {
	
	private int uid;
	private String uname;
	private String password;
	private String email;
	private int age;
	private String userStatus;

}
