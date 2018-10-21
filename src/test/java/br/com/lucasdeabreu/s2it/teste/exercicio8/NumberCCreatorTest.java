package br.com.lucasdeabreu.s2it.teste.exercicio8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCCreatorTest {

	@Test
	public void should_create_numberC() {

		int numberA = 102;
		int numberB = 512;

		NumberCCreator numberCCreator = new NumberCCreator();
		assertEquals(150_122, numberCCreator.create(numberA, numberB));
	}

	@Test
	public void should_return_minus1_when_numberC_is_greater_than_1_000_000() {

		int numberA = 1000;
		int numberB = 101;

		NumberCCreator numberCCreator = new NumberCCreator();
		assertEquals(-1, numberCCreator.create(numberA, numberB));
	}

	@Test
	public void should_returns_zero_when_numberA_and_numberB_are_zero() {

		int numberA = 0;
		int numberB = 0;

		NumberCCreator numberCCreator = new NumberCCreator();
		assertEquals(0, numberCCreator.create(numberA, numberB));
	}
	
//	@Test
//	public void should_handle_numberexception() {
//
//		int numberA = 1000000;
//		int numberB = 1000000;
//
//		NumberCCreator numberCCreator = new NumberCCreator();
//		assertEquals(0, numberCCreator.create(numberA, numberB));
//	}
}
