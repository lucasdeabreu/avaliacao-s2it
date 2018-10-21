package br.com.lucasdeabreu.s2it.teste.exercicio8;

/**
 * Resultado do exercicio 8 do teste da S2IT
 * 
 * <p>Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as
 * seguintes regras:</p>
 * <p>- O primeiro número de C é o primeiro número de A;</p>
 * <p>- O segundo número de C é o primeiro número de B;</p>
 * <p>- O terceiro número de C é o segundo número de A;</p>
 * <p>- O quarto número de C é o segundo número de B; Assim sucessivamente...</p>
 * <p>- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o
 * restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser
 * 15012256.</p>
 * <p>- Caso C seja maior que 1.000.000, retornar -1</p>
 * 
 * @author lucasdeabreu
 *
 */
public class NumberCCreator {

	private static final int MINUS_ONE = -1;
	private static final int MAX_VALUE_PERMITTED = 1_000_000;

	public int create(int numberA, int numberB) {
		char[] aArray = String.valueOf(numberA).toCharArray();
		char[] bArray = String.valueOf(numberB).toCharArray();

		int maxLength = aArray.length > bArray.length ? aArray.length : bArray.length;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxLength; i++) {
			if (aArray.length > i) {
				sb.append(aArray[i]);
			}
			if (bArray.length > i) {
				sb.append(bArray[i]);
			}
		}

		int numberC = Integer.parseInt(sb.toString());
		if (numberC > MAX_VALUE_PERMITTED) {
			return MINUS_ONE;
		}

		return numberC;
	}

}
