package come.learning.MyFirstJavaProgram;

public class MultipicationTable {
	
	void print() {
		print(5);
	}
	
	 void print(int tableNum) {
	  print(tableNum,1,10);
	}
	
	 void print(int table_Num, int start_Num, int end_Num) {
		for(int i=start_Num;i<=end_Num;i++) {
			  System.out.printf("%d * %d = %d",table_Num,i,i*table_Num).println();
		  }  
	  }
	void printStarLine() {
		System.out.println("******************************");
	}

}
