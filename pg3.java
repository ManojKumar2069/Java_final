public class pg3 {
	public static void main(String args[]){
		int[] a={90,43,67,87,45,82,91,150,67};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++){
			if(a[i]>max){
				max=a[i];
			}
			System.out.println(a[i]);
		}
		System.out.println("The maximun Marks is "+max);
	}
}
