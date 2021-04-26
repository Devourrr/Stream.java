package week6day1;
/*
�л������� ���� ���α׷�
�л� ������ : Student Ŭ���� -> �л������� �����ϴ� ��������� �ڷ���
�����л�����: �迭 -. ArrayList<Student>
���� : Collenctions.sort(List, list)
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
		this.address = address; //������
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
		
		Student s1 = new Student("���л�", "����� ������");
		Student s2 = new Student("���л�", "���ֽ� ��������");
		
		//�л����� ���
		list.add(s1);
		list.add(s2);
		list.add(new Student("ȫ�л�", "�ϳ��� ��ǳ��")); //�͸�ü
		
		//���� Collenctions��� �ڹ�����Ŭ���� �̿�
		Collections.sort(list);
		//sort���� -> collections �ȿ� sort�����Ұ�, �������̽� �����ؾ���
		/* 		//��������Ŭ����, �̸��� �ִ� Ŭ�����ۼ�
		class ComparatorImp implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				
				return o1.address.compareTo(o2.address);
			}
			
		}
//		�͸�Ŭ������ �͸�ü ����
		Collections.sort(list, new ComparatorImp()); //����
		Collections.sort(list, new Comparator<Student>(){
			@Override
			public int compare(Student arg0, Student arg1) {
				return arg0.address.compareTo(arg1.address);
			}
			
		});
		*/
		//����
		Collections.sort(list, (a,b)-> a.address.compareTo(b.address));
		
		
		//���
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			//System.out.priintln(list.get(i).toString());
		}
	}

}
