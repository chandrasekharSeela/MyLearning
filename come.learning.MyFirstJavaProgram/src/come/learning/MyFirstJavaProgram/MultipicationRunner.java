package come.learning.MyFirstJavaProgram;

import java.util.Scanner;

public class MultipicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the table number to print to table");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		MultipicationTable table = new MultipicationTable();
		table.printStarLine();
		table.print();
		table.printStarLine();
		table.print(number);
		table.printStarLine();
		table.print(number, 11, 20);

	}

}
