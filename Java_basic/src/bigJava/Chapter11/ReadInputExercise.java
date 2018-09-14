package bigJava.Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadInputExercise {
	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("testfile.txt"); //no txt的原因？--这个file要放在最外面的project里面。而不能放在package里面。
		Scanner in = new Scanner(inputFile);
		double max = Double.NEGATIVE_INFINITY;
		double total = 0;
		double min = Double.POSITIVE_INFINITY;
		int size = 0;
		//calculate total
		while (in.hasNextDouble()){
			double value = in.nextDouble();
			if (value > max)
				max = value;
			if (value < min)
				min = value;
			total += value;
			size += 1;
		}
		in.close();
		double average = total/size;
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
		System.out.println("The average is " + average);
		
		
		// save the output into a file
		PrintWriter out = new PrintWriter("OutputFile.txt");  //可以work了，只不过这个要刷新以后才能显示出来
		out.printf("Total: %8.2f\n", total);
		out.printf(" max : %8.2f\n", max);
		out.close();
	}
}
