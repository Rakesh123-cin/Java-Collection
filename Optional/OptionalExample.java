package com.rakesh.Optional;

import java.util.Optional;

public class OptionalExample {
	
	public static Optional<String> getName()
	{
		String str = "Rakesh Ananad";
		return Optional.ofNullable(str);
	}
	
	public static void main(String[] args) {
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
		
		String str2 = "I love java";
		Optional<String> optional2 = Optional.of(str2);
		
		if(optional2.isPresent())
		{
			System.out.println(optional2.get());
		}
		
		System.out.println(optional.orElse("String is empty"));
		
		System.out.println(getName().orElse("No value returned"));
	}

}
