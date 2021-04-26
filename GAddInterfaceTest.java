package week6day1;

import java.util.function.BiFunction;



public class GAddInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GAddInterface<Integer,Integer,Integer> instance = (x,y) -> x+y ;	
	
		/*GAddInterface<Integer,Integer,Integer> instance2= new GAddInterface< Integer,Integer,Integer>() {			 
			@Override
			public Integer add(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return  num1+ num2;
			}			
		};		
		*/				 
		GAddInterface<Double,Integer,Double> instance3 = (x,y) -> x+y ;	
		 
		int result = instance.add(5, 7);	
		//int result2 = instance2.add(5,7);
		double  result3 = instance3.add(34.9, 34);
	 	
		GAddInterface<Double, Double,Double> instance4 =  new GAddInterface<Double, Double, Double> (){

			@Override
			public Double add(Double num1, Double num2) {
				// TODO Auto-generated method stub
				return  num1+num2;
			}
			
		};
		GAddInterface<Double, Double, Double>  instance5 = (x,y) ->x+y;
		System.out.println("double °á°ú" + instance5.add(25.3, 12.2));
		
		
		System.out.println(result);
		//System.out.println(result2);	
		System.out.println(result3);
		
		
		
		/*
		 
		 public interface BiFunction<T,U,R> {
	       R apply(T num1, U num2);
        }
		  
		 */
		//java.util.function 
		BiFunction<Integer,Integer,Integer> f = (a,b) ->a+b;
		int  result5 = f.apply(3, 4);
		System.out.println( result5);
		
		BiFunction<Integer,Double,Double> f1 = (a,b) ->a+b;
		double  result6 = f1.apply(3, 4.9);
		System.out.println( result6);
		
		
		

	}

}
