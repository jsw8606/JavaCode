/**
*这是关于整形数组操作的工具箱，包括数组遍历、获得最大值、最小值、数组逆序以及获得指定元素的索引。
*@author 贾胜伟
*@version v1.0
*/
public class ArrayTool{
	
	private ArrayTool(){
	}
	
	//数组遍历
	/**
	*这是数组遍历的方法
	*@param arr 被遍历的数组
	*/
	public static void showArray(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.print(arr[i] + "]");
			}else{
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println();
	}
	
	//获取最大值
	/**
	*这是获取数组中最大值的方法
	*@param arr 被操作的数组
	*@return max 返回数组中的最大值
	*/
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//获取最小值
	/**
	*这是获取数组中最小值的方法
	*@param arr 被操作的数组
	*@return min 返回数组中的最小值
	*/
	public static int getMin(int[] arr){
		int min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//数组逆序
	/**
	*这是数组逆序的方法
	*@param arr 被操作的数组
	*/
	public static void reverse(int[] arr){
		int start;
		int end;
		for(start=0,end=arr.length-1;start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		showArray(arr);
	}
	
	//获得指定元素在数组中第一次出现时的索引
	/**
	*这是获取指定元素在数组中第一次出现时的索引的方法
	*@param arr 被查找的数组
	*@param value 被查找的整数
	*@return index 元素在数组中第一次出现时的索引,若未找到则返回-1
	*/
	public static int getIndex(int[] arr,int value){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == value){
				index = i;
				break;
			}
		}
		return index;
	}
}