package com.colon.labs.JavaTutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.colon.labs.string.PanagramCheck;

import junit.framework.TestCase;

public class JunitTests extends TestCase {

	
	
	@BeforeEach
	public void setUp() {
		
	}
	
	
	
	@DisplayName("Check for panagram method with valid inputs")
	@Test
	public void checkForTrue() {

		PanagramCheck pan = new PanagramCheck();
		boolean response = pan.checkPanagram("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertEquals(true, response);
		System.out.println(this.getName());
		System.out.println(this.countTestCases());

	}

	@DisplayName("Check for panagram method with invalid inputs")
	@Test
	public void checkForFalse() {

		PanagramCheck pan = new PanagramCheck();
		boolean response = pan.checkPanagram("kasdjhfldssdjfhsdjkaf");
		assertEquals(false, response);
		System.out.println(this.getName());
		System.out.println(this.countTestCases());

	

	}
	
	public void tearDown() {
		
	}

}
