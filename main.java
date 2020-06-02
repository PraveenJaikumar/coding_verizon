import org.apache.commons.lang3.ArrayUtils;

public class java_code {
	public static void generateRandomNumbers(int num) {
		if(num < 0) num = 0;
		int min = 1;
	      int max = (int) num;
	      int[] data = new int[num];
	      System.out.println("Random integer value from "+min+" to "+max+ ":");
	      int count = 0;
	      while(count < num) {
	    	  int random_int = (int)(Math.random() * (max - min + 1) + min);
	    	  if(ArrayUtils.indexOf(data, random_int) == -1) {
	    		  data[count]= random_int;
	    		  count = count +1;
	    		  System.out.println(random_int);
	    	  }
	      }
	}

	public static void main(String[] args) {
    //call the Random function with argument n
		generateRandomNumbers(12);
	}

}



// Output:
// Random value in double from 1 to 12:
// 1
// 3
// 4
// 2
// 12
// 8
// 10
// 9
// 5
// 11
// 6
// 7
