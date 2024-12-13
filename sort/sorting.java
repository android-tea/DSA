import java.util.Arrays;
import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter" + size + "values: ");
		for (int i=0;i < size;i++) {
			array[i]=sc.nextInt();
			}

		int number = 0; //this is the code to keep track the menu choice
		while (number !=7) {
			System.out.println("Menu");
			System.out.println("\t1.Bubble");
			System.out.println("\t2.Insertion");
			System.out.println("\t3.Selection");
			System.out.println("\t4.Merge");
			System.out.println("\t5.Quick");
			System.out.println("\t6.Heap");
			System.out.println("\t7.Exit");
			System.out.println("\t Enter Choice [1-7]: ");
			number = sc.nextInt();
			sc.nextLine();
			
			switch(number) {
			case 1 :
				bubbleSort(array);
				System.out.println("BubbleSort");
				System.out.println(Arrays.toString(array));
				break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
			case 2:
				insertionSort(array);
				System.out.println("Insertion Sort:");
				
			}
		}

	}

}

public static void bubbleSort (int array[]) {
	int size = array.length;
	for (int i=0; i < size - 1; i++) {
		for (int j=0;j<size-i-1;j++) {
			if (array[j]>array[j+1]) {
				int temp = array[j];
				array[j]=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	
	public static void insertionSort(int arr[]) {
		int n=arr.length; 
		for (int i=1;i<n;++i) {
			int key=arr[i];
			int j=i-1;
			while (j>=0 && arr[j] >key) {
				arr[j+1]=arr[j];
				j=j-1;			}
		}
		arr[j+1]=key;
	}
}

static void selectionSort(int[] arr) {
	int n=arr.length;
	for (int i=0;i<n-1;i++) {
		int min_idx=i;
	for (int j=i + 1;j<n;j++) {
		if (arr[j]<arr[min_idx]) {
			
		}
	}
	int temp=arr[i];
	arr[i]=arr[min_idx];
	arr[min_idx]=temp;
	}
}