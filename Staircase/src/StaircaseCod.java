
public class StaircaseCod {

	public static void main(String[]args) {
		int stairNum = 6;
		int c = stairNum - 1;
		for(int a = 0; a < stairNum; a++) {
			for(int b = 0; b < stairNum; b++) {
				if(b < c) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			c = c -1;
		}
	}
}
