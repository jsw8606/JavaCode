/**
*���ǹ���������������Ĺ����䣬�������������������ֵ����Сֵ�����������Լ����ָ��Ԫ�ص�������
*@author ��ʤΰ
*@version v1.0
*/
public class ArrayTool{
	
	private ArrayTool(){
	}
	
	//�������
	/**
	*������������ķ���
	*@param arr ������������
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
	
	//��ȡ���ֵ
	/**
	*���ǻ�ȡ���������ֵ�ķ���
	*@param arr ������������
	*@return max ���������е����ֵ
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
	
	//��ȡ��Сֵ
	/**
	*���ǻ�ȡ��������Сֵ�ķ���
	*@param arr ������������
	*@return min ���������е���Сֵ
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
	
	//��������
	/**
	*������������ķ���
	*@param arr ������������
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
	
	//���ָ��Ԫ���������е�һ�γ���ʱ������
	/**
	*���ǻ�ȡָ��Ԫ���������е�һ�γ���ʱ�������ķ���
	*@param arr �����ҵ�����
	*@param value �����ҵ�����
	*@return index Ԫ���������е�һ�γ���ʱ������,��δ�ҵ��򷵻�-1
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