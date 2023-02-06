/***
 * @author N'ZO LAGOU
 * 
 * Exercice 2 : Itérer Dans Le Tableau

Utilisez une boucle for imbriquée pour parcourir le tableau et imprimer chaque valeur.
 La boucle externe doit parcourir les lignes et la boucle interne doit parcourir les colonnes.


{
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
}
 */

package ninja;

public class Exercice2 {

	public static void matrisse() {
		int[][] arrayItem = {

				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } 
				};
		
		for (int[] item : arrayItem) {
			for (int i = 0; i < arrayItem.length; i++) {
				System.out.println(item[i] + ", "); 
				
			}
		}
	}

}
