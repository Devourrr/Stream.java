package week6day1;
/*
학생데이터 정렬 프로그램
학생 데이터 : Student 클래스 -> 학생데이터 저장하는 사용자정의 자료형
여러학생저장: 배열 -. ArrayList<Student>
정렬 : Collenctions.sort(List, list)
Collenctons.sort(List list, Comparator c)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable <Student>{
	String name;
	String address;
	
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address; //생성자
	}
	@Override
	public String toString() { //toString
		return name + " :" + address;
	}
//	@Override
//	public int compareTo(Object arg0) {
//		Student tmp = (Student)arg0;
//		return this.name.compareTo(tmp.name);
//	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}
	
}

public class CollectionSortTest {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student("김학생", "서울시 마포구");
		Student s2 = new Student("이학생", "제주시 서귀포구");
		
		//학생정보 담기
		list.add(s1);
		list.add(s2);
		list.add(new Student("홍학생", "하남시 덕풍동")); //익명객체
		
		//정렬 Collenctions라는 자바제공클래스 이용
		Collections.sort(list);
		//sort에러 -> collections 안에 sort제공불가, 인터페이스 구현해야함
		/* 		//지역내부클래스, 이름이 있는 클래스작성
		class ComparatorImp implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.address.compareTo(o2.address);
			}
			
		}
//		익명클래스로 익명객체 생성
		Collections.sort(list, new ComparatorImp()); //생성
		Collections.sort(list, new Comparator<Student>(){
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.address.compareTo(arg1.address);
			}
			
		});
		*/
		//람다
		Collections.sort(list, (a,b)-> a.address.compareTo(b.address));
		
		
		//출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			//System.out.priintln(list.get(i).toString());
		}
	}

}
