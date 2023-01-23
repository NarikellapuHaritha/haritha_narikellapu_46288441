 package javaassignment;
public class Bubblesort{
	public static void bubbleSort(int[] arr) {
		int n= arr.length; //15
		int temp=0;
		for(int i=0;i<n;i++) { // 1 1<15 2
			for(int j=1;j<(n-i);j++) { //1 1<14 2
				if(arr[j-1]>arr[j]) { //swap elements
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
				
			}
			
	
		}
		
	}
	public static void main(String[]args) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array Before Bubble Sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
