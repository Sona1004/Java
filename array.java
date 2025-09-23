package javafullproject;

public class array {

	public static void main(String[] args) {
		int num[]={1,3,5,6};
		int target=5;
		int index=0;
		for(int i=0;i<num.length;i++){
			if (num[i]==target)
		    index=i;
			System.out.print(" output" +index);
		}
		
		}
	}
        