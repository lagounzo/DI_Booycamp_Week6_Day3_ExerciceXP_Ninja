/**
 * @author N'ZO LAGOU
 * 
 * Exercice 1 : Guerre Des Nombres

Il y a une grande guerre entre les nombres pairs et impairs.
Beaucoup de gens ont déjà perdu la vie dans cette guerre et 
c'est à vous d'y mettre fin. Vous devez déterminer quel groupe 
totalise le plus : les pairs ou les impairs. Le plus grand groupe gagne.

Créez une fonction qui prend un tableau d'entiers, additionne les nombres
 pairs et impairs séparément, puis renvoie la différence entre la somme des
  nombres pairs et impairs.

Exemples

warOfNumbers([2, 8, 7, 5]) ➞ 2
// 2 + 8 = 10
// 7 + 5 = 12
// 12 is larger than 10
// So we return 12 - 10 = 2

warOfNumbers([12, 90, 75]) ➞ 27

warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
 */

package ninja;

public class Exercice1 {

	public static int differenceEntrePairsImpairs(int[] item) {

		int somPairs = 0;
		int somImpairs = 0;

		for (int i = 0; i < item.length; i++) {
			
			if (item[i] % 2 == 0) {
				
				somPairs += item[i];
				
			} else {
				somImpairs += item[i];
			}
		}

		if (somImpairs < somPairs) {
			
			return somPairs - somImpairs;
			
		} else {
			return somImpairs - somPairs;
		}

	}
}

//2iemm
/*public static int warOfNumber(int[] numbers) {
	    int sumOfPairs = 0;
	    int sumOfImpairs = 0;
	    for (int number : numbers) {
	        if (number % 2 == 0) {
	            sumOfPairs += number;
	        } else {
	            sumOfImpairs += number;
	        }
	    }
	    return sumOfPairs - sumOfImpairs;
	}*/


		




