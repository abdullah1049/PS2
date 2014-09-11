// Abdullah AL-Sinaidi


package my_ps2;




public class MyInteger {

	
	public static void main(String[] args){
		
		
		private int value;
		
		
		public MyInteger (int value){
			this.value = value;			
		}
		 
		public Integer get_value (){
		 	return this.value;
		 }
		
		public  boolean IsEven(){
			return (this.value % 2==0);
		}
		public boolean IsOdd(){
			return (this.value % 2 != 0);
		}
			
		
		public boolean IsPrime(){
			for (int y = 1; y<Math.sqrt(value); y++) {
				if (value % y == 0);
				return false;
			}
			if (value< 1){
			return false;
			}
			else{
				return true;
			}
			}
			
					
					
		public static boolean IsEven(int value){
				
				if (value%2 !=0){
				return false;
				}
				else{
					return true;
				}
			}
			
			
			
			
		public static boolean IsOdd (int value){
			if (value % 2 ==0){
				return false;
			}
			else{
				return true;
			}
		}
		
		public static boolean IsPrime (int value){
			for (int y = 1; y<Math.sqrt(value); y++) {
				if (value % y == 0);
				return false;
			}
			if (value< 1){
			return false;
			}
			else{
				return true;
			}
	
		}
	
		
		
		
		
		
		
		
		public static boolean IsEven(MyInteger my_int){
			
			if (value % 2 != 0){
			return false;
			}
			else {
				return true;
			}
		}
		
		
	public static boolean IsOdd (MyInteger my_int){
		if (value % 2 ==0){
			return false;
		}
		else{
			return true;
		}
	}
		
	public static boolean IsPrime (MyInteger my_int){
		for (int y = 1; y<Math.sqrt(value); y++) {
			if (this.value % y == 0);
			return false;
		}
		if (this.value< 1){
		return false;
		}
		else{
			return true;
		}
	
		}
	
	
	
	
	
	public boolean equals(int new_value){
		if (value == new_value){
			return true;
		}
		else{
			return false;
		}
		}
	
	
	public boolean equals(MyInteger new_value){
		if (new_value.value != value){
			return false;
		}
		else{
			return true;
		}
		}
	
	
	
	
	public static int parseInt(char[] total_num){
		int sum_total= 0;
		for(int y =0; y< total_num.length; y++ ){
			sum_total = total_num[y]+ sum_total;
		}
		return sum_total;
		}
		
	
	public static int ParseInt(String to_int ){
		int y = Integer.parseInt(to_int);
		return y;
		
	}
		
		
	}	
	
	
