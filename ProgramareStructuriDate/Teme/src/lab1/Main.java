package lab1;

public class Main {

	public static void main(String[] args){


		int[] array = {1, 3, 2, 6, 1, 2};
		int[] array1 = {2, 3, 4, 8, 1, 2};
		int[] vitezeMasini = {4, 5, 1, 2, 3};
		int[] birdList = {1, 1, 1, 0, 1, 0, 0, 1, 1};
	
////		int [] newBirdArr = Main.lastBirdStanding(birdList, 6);
//		for(int i : newBirdArr){
//			System.out.print(i + " " );
//		}
//		
		
	}


	public static int gcm(int a, int b){
		if(b == 0){
			return a;
		}
		return gcm(b, a % b);
	}

	
	
	/**
	 * . Un drumeț a ajuns la lacul magic, și a văzut că pe malul lacului magic sunt o serie de păsări magice,
 	 *	unele stând în picioare, unele stând pe apă. Drumețul a observat că după o oră, unele păsări își
	 *	modifică poziția. Mai exact rămân în picioare doar acele păsări care aveau ambele vecini în picioare
	 *	în ora anterioară (păsările care sunt la marginea șirului au doar 1 vecin, și rămân în picioare dacă 
	 *	vecinul a fost în picoare). Având un tablou cu poziția inițială a păsărilor, unde valoarea 1 înseamnă
     *  stat în picioare și 0 înseamnă stat în apă, determinați cum vor sta păsările după m ore
	 */

	/**
	 * Problema 8
	 * Dat fiind un tablou cu N elemente și un număr pozitiv k, să se determine câte perechi de poziții (i,j)
	 * sunt în tablou, astfel încât i < j și tablou[i] + tablou[j] este divizibil cu k. Dacă tabloul este [1,3,2,6,1,2]
	 *  și k este 3, sunt 5 perechi: pozițiile (1,3), (1,6), (2,4), (3,5) și (5,6)
	 *  
	 * @param array 
	 * 			array-ul cu N elemente  
	 * @param k
	 * 			int - numar natural 
	 */
	public static void arrayDivideK(int[] array, int k){
		// parcurg array-ul pana la  i < lungimea array-ului respectiv j 
		for(int i =0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				/*conditie ce trebuie indeplinita pentru determinarea pozitiilor 
				de perechi din tablou*/
				if(i < j && (array[i] + array[j]) % k == 0){
					//daca conditia este indeplinita printeaza perechea de pozitii
					System.out.println("(" + (i + 1)+ " " + (j + 1) + ")");
				}
			}
		}
	}

	/**
	 * Problema 9
	 * Să considerăm un tablou A, alcătuit din numere întregi pozitive. Distanța dintre 2 poziții i și j este
	 * abs(i-j). Având tabloul A, determinați distanța minimă astfel încât A[i] = A[j] și i ≠ j. Dacă nu există
	 * această valoare, returnați -1. 
	 * 
	 * @param array
	 * 			array de int numar pozitive
	 * @return
	 * 			int - distanta minima intre 2 pozitii 
	 */
	public static int minDist(int[] array){
		//initializez variabila minDist cu -1 
		int minDist = -1;
		for(int i =0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if (array[i] == array[j] && i != j) {
					minDist = Math.abs(i -j);
				}
			}
			return minDist;
		}
		return minDist;
	}

	/**
	 * Problema 7
	 * Paul e mare fan F1. În timp ce se uita la cursa din India el a observat că pista conține o secție lungă
	 *  de drum drept, dar care este prea îngustă pentru depășiri. Astfel, o mașină trebuia să încetinească
	 *	dacă avea o mașină cu viteză mai mică în față (altfel mergea cu viteza maximă). În timp ce se uita la
	 *  cursă, Paul vrea să știe câte mașini merg cu viteza lor maximă. Se dă viteza maximă pentu N mașini
     *  care merg unul după altul pe pistă. Determinați câte merg cu viteza lor maximă. O mașină merge cu
     *  viteza ei maximă dacă nu are nicio mașină cu viteză mai mică în față. Dacă are în față o mașină cu
     *  viteză mai mică, atunci va merge cu aceeași viteză ca și mașina din față. Dacă vitezele maxime sunt
     *  [4, 5, 1, 2, 3] mașinile vor merge cu viteza: [4, 4, 1, 1, 1] și sunt 2 mașini care merg cu viteza maximă:
     *  prima și a 3-a.
	 *	
	 * @param array 
	 * 		array cu vitezele maxime 
	 */
	public static void maxVitCounter(int[] array){
		int[] newArray = new int[array.length];
		int numarMasini = 1;
		newArray[0] = array[0];
		int vitezaMax = array[0]; 
		for(int i = 1; i < array.length; i++){
			if(array[i] > vitezaMax){
				newArray[i] = vitezaMax;

			}else {
				vitezaMax = array[i];
				newArray[i] = vitezaMax;
				numarMasini++;
			}
		}
		for(int z : newArray){
			System.out.print(z +" ");
		}
		System.out.println();
		System.out.println(numarMasini);
	}
	
	
}
