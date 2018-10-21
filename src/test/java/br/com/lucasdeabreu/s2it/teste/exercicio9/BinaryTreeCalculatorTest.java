package br.com.lucasdeabreu.s2it.teste.exercicio9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryTreeCalculatorTest {

	@Test
	public void should_calculate_when_only_root_is_set() {
		
		BinaryTree root = new BinaryTree();
		root.valor = 10;
		
		BinaryTreeCalculator calculator = new BinaryTreeCalculator();
		assertEquals(10, calculator.calcule(root));
	}
	
	@Test
	public void should_calculate_when_exists_subsequent() {
		
		BinaryTree root = newNode(10, // 
				newNode(5, //
						newNode(3, // 
								newNode(3), // 
								newNode(2)), //
						newNode(2)), //
				newNode(2, //
						newNode(3), // 
						newNode(2)));

		assertEquals(32, new BinaryTreeCalculator().calcule(root));
	}
	
	public BinaryTree newNode(int value) {
		return newNode(value, null, null);
	}
	
	public BinaryTree newNode(int value, BinaryTree left, BinaryTree right) {
		BinaryTree node = new BinaryTree();
		node.valor = value;
		node.left = left;
		node.right = right;
		return node;
	}
}
