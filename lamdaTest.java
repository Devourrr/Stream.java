package week6day1;
class Calc{
	
    public static void  calcAdd(  AddInterface f  ) 
    {
             int result=  f.add( 5,7);
             System.out.println(result);
    }
} 

public class lamdaTest {

	public static void main(String[] args) {
		// lamda
		Calc.calcAdd(  (x,y) -> x+y ) ;
		
		//
		Calc.calcAdd( new AddInterface() {

			@Override
			public int add(int num1, int num2) {
				 
				return num1+ num2;
			}
			
		});
		
		//
		class AddInterfaceImp implements AddInterface{

			@Override
			public int add(int num1, int num2) {					 
				return num1+ num2;
			}		 
		}
		
		Calc.calcAdd(new AddInterfaceImp());
}
}
