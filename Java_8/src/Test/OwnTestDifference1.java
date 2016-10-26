package Test;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>{
	
	int age ;
	String name;
	

	public Student(int i, String string) {
			age=i;
			name=string;
	}


	@Override
	public int compareTo(Student o) {
		System.out.println(o.age);
		System.out.println(age);
		// TODO Auto-generated method stub
		if(age>o.age){
			return 1;
		}else if(age==o.age)
		{
			return 0;
		}
		else return -1;
	}
	
}

public class OwnTestDifference1 {
	public static void main(String[] args) {
	
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(12,"abcd"));
		list.add(new Student(12,"defc"));

		
		Collections.sort(list);
		for (Student string : list) {
			System.out.println(string.name);
		}

	}
}