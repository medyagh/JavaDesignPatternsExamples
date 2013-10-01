package Sort;

public class Main {

	public static void main(String[] args) {

		int[] values = new int[5];
		values = new int [] {5, 3, 4,1,2};
		sort(values);
		for (int e:values) {
			System.out.println(e);
		}
	}
	
	public static void sort (int[] arr) {
		
	int temp=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<i;j++) {
				if (arr[j]>arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			
		}
		
	}

}
