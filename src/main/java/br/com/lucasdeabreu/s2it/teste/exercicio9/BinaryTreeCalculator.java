package br.com.lucasdeabreu.s2it.teste.exercicio9;

import java.util.Objects;

public class BinaryTreeCalculator {

	public int calcule(BinaryTree node) {
		
		return sumNode(node);
	}

	private int sumNode(BinaryTree node) {
		
		int total = 0;
		if (Objects.nonNull(node.left)) {
			total += sumNode(node.left);
		}
		if (Objects.nonNull(node.right)) {
			total += sumNode(node.right);
		}
		return total + node.valor;
	}
	
}
