public class PositiveNeg {

	public boolean posNeg(int a, int b, boolean negative) {
		// checks the value of negative at the loop
		if (negative)

		{
			return (a < 0 && b < 0);
		} else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));

		}
	}

	public static void main(String args[]) {
		PositiveNeg obj = new PositiveNeg();
		if (obj.posNeg(1, -1, false) == true) {
			System.out.println("For test case  (1,-1,false)");
			System.out.println("Pass!");
		} else {
			System.out.println("For test case  (1,-1,false)");
			System.out.println("Fail!!!!!!!!!!!!!!");
		}
		System.out.println();
		if (obj.posNeg(-1, 1, false) == true) {
			System.out.println("For test case  (-1,1,false)");
			System.out.println("Pass!");
		} else {
			System.out.println("For test case  (-1,1,false)");
			System.out.println("Fail!!!!!!!!!!!!!!");
		}
		System.out.println();
		if (obj.posNeg(1, 1, false) == false) {
			System.out.println("For test case  (1,1,false)");
			System.out.println("Pass!");

		} else {
			System.out.println("For test case  (1,1,false)");
			System.out.println("Fail!!!!!!!!!!!!!!");

		}
		System.out.println();
		if (obj.posNeg(-1, -1, false) == false) {
			System.out.println("For test case  (-1,-1,false)");
			System.out.println("Pass!");
		} else {
			System.out.println("For test case  (-1,-1,false)");
			System.out.println("Fail!!!!!!!!!!!!!!");

		}
		System.out.println();
		if (obj.posNeg(-1, -1, true) == true) {
			System.out.println("For test case  (-1,-1,true)");
			System.out.println("Pass!");
		} else {
			System.out.println("For test case  (-1,-1,true)");
			System.out.println("Fail!!!!!!!!!!!!!!");
		}
		System.out.println();
		if (obj.posNeg(1, 1, true) == false) {
			System.out.println("For test case  (1,1,true)");
			System.out.println("Pass!");

		} else {
			System.out.println("For test case  (1,1,true)");
			System.out.println("Fail!!!!!!!!!!!!!!");
		}
		System.out.println();
		if (obj.posNeg(1, -1, true) == false) {
			System.out.println("For test case  (1,-1,true)");
			System.out.println("Pass!");
		} else {
			System.out.println("For test case  (1,-1,true)");
			System.out.println("Fail!!!!!!!!!!!!!!");

		}
		System.out.println();
		if (obj.posNeg(-1, 1, true) == false) {
			System.out.println("For test case  (-1,1,true)");
			System.out.println("Pass!");

		} else {
			System.out.println("For test case  (-1,1,true)");
			System.out.println("Fail!!!!!!!!!!!!!!");

		}

	}
}