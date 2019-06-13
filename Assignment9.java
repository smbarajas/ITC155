class Main {
	public static void main (String[] args) {
		double[] list1 = {10, 11, 12, 13, 14, 15, 16, 17};
		double[] list2 = {10, 11, 12, 13, 14, 15, 16, 17, 16};
		
		if (isSorted(list1)) {
			System.out.println("list1 is ascending");
		}
		else {
			System.out.println("list1 isn't ascending");
		}
		
		if (isSorted(list2)) {
			System.out.println("list2 is ascending");
		}
		else {
			System.out.println("list2 isn't ascending");
		}
	}
	
	public static boolean isSorted(double[] list) {

		double lastValue = 0.0;
		int counter = 0;
		for (double d : list) {
			if (counter > 0)
			{
				if (lastValue > d) {
				//not ascending
					return false;
				}
			}
			lastValue = d;
			counter ++;
		}
		return true;
	}
}
