package assigments;

import java.util.Arrays;

public class CRUDoperationsArray {
	public static void main(String[] args) {
		int ar[]=new int[7];
		ar[0]=20;
		ar[1]=44;
		ar[2]=5;
		ar[3]=444;
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
//		for (int i = 0; i < n; i++) {
//			System.out.print(ar[i]+" ");
		
		System.out.println(Arrays.toString(ar));
		
		insertElement(ar,3,100);
		
		System.out.println(Arrays.toString(ar));
		
		deleteElement(ar, 4);
		
		System.out.println(Arrays.toString(ar));


	}
	
	public static void insertElement(int ar[], int pos, int ele) {
		for (int i = ar.length-1 ; i > pos-1; i--) {
			ar[i] = ar[i-1];
		}
		ar[pos-1] = ele;
	}
	
	public static void deleteElement(int ar[], int delpos) {
		for (int i = delpos-1 ; i < ar.length-1; i++) {
			ar[i] = ar[i+1];
		}
	}

}
