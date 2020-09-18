public class kill{
	public static int[] resize(int length){
		int [] myarr = new int[length];

		for(int i = 0; i < arr.length, i++){
			myarr[i] = arr[i]; 
		}
		myarr[length-1] = 4;
		arr = myarr;
		return arr;
	}
 
	public static void main(String[] args){
		arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		int[] newarr = resize(4);

		for(int i = 0; i < newarr.length; i++){
			System.out.print(newarr[i]);
		}
	}
}