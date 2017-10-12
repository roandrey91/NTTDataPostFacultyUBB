package sem1;



public class Main {

	public static void main(String[] args){
		int[] birdList = {1, 1, 0, 0, 0, 0, 0, 1, 1};


		for(int i : Main.lastBirdStanding(birdList, 1) ){
			System.out.print(i + " " );
		}

		;
	}




	public static int[] lastBirdStanding(int[] birdArray, int mHours){
		int[] newBirdArray = new int[birdArray.length]; 
		int standUp = 1;
		int standDown = 0;
		int m = 1;
		while (m >= mHours) {
			for(int i = 1; i < birdArray.length ; i++){
				if (birdArray[0] == 1 && birdArray[1] == 1) {
					birdArray[0] = standUp;
					newBirdArray[0] = birdArray[0];
				}if (birdArray[0] == 1 && birdArray[1] == 0) {
					birdArray[0] = standDown;
					newBirdArray[0] = birdArray[0];
		
				}if (birdArray[birdArray.length - 1] == 1 && birdArray[birdArray.length - 2] == 1) {
					birdArray[birdArray.length - 1] = standUp;
					newBirdArray[birdArray.length - 1] = birdArray[birdArray.length - 1];
				}else {
					birdArray[birdArray.length - 1] = standDown;
					newBirdArray[birdArray.length - 1] = birdArray[birdArray.length - 1];
				}
				

				m++;		
			}

			return birdArray;
		}
		return newBirdArray;
	}


}
