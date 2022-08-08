import java.util.ArrayList;
import java.util.Scanner;


import java.util.Iterator;
import java.util.LinkedList;

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> studentArray=new ArrayList<Student>();
		int choice,age;
//		String age;
		String name,city,degree;
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 for Add Details");
			System.out.println("Press 2 for show student Details");
			System.out.println("Press 3 for search student by name");
			System.out.println("Press 4 for delete student by name");

			System.out.println("Press 5 for update");

			System.out.println("Make Your Choice");
			choice=s.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("Enter Student Name");
				name=s.next();
				System.out.println("Enter Student city");
				city=s.next();
				
				System.out.println("Enter Student age");
				age=s.nextInt();
				System.out.println("Enter Student degree");
				degree=s.next();
				
				Student stud=new Student();
				stud.setAge(age);;
				stud.setCity(city);
				stud.setDegree(degree);
				stud.setName(name);
				
				studentArray.add(stud);
				
				
				System.out.println("**....STUDENT DETAILS IS ADDED SUCCESFULY.........**");
				break;
			case 2:
				for(int i=0;i<studentArray.size();i++) {
					System.out.println("name:  "+studentArray.get(i).getName());
					System.out.println("Age:   "+studentArray.get(i).getAge());
					System.out.println("city:  "+studentArray.get(i).getCity());
					System.out.println("Degree:  "+studentArray.get(i).getDegree());
					break;

				}
				
			case 3:
				System.out.println("Enter name to found");
				name=s.next();
				int ff=0;
				for(int f=0;f<studentArray.size();f++) {
					if(studentArray.get(f).getName().contains(name)) {
						System.out.println("Student Record:  "+(++ff));

						System.out.println("name:  "+studentArray.get(f).getName());
						System.out.println("Age:   "+studentArray.get(f).getAge());
//						System.out.println("city:  "+studentArray.get(f).getCity());
//						System.out.println("Degree:  "+studentArray.get(f).getDegree());
						
					}
					

				}
				
				//boolean found=false;

//				Iterator itr=studentArray.iterator();
//				while(itr.hasNext()) {
//					Student s1=(Student) itr.next();
//					if(s1.getName()==name) {
//						System.out.println(s1);
//						found=true;
//					}
//					
//				}	
				if(ff==0){
					System.out.println("record not found");
				}
			break;
			case 4:
				System.out.println("Enter name to delete");
				name=s.next();
				int search=0;
				for(int i=0;i<studentArray.size();i++) {
					if(studentArray.get(i).getName().contains(name)) {
						System.out.println("Student Record:  "+(++search));
						studentArray.remove(i);
						
					}
					
				}
				if(search==0){
					System.out.println("record not found");
				}
				else {
					System.out.println("record deleted succesfully......");

				}
			break;

				
			case 5:
				System.out.println("***************************");
				System.out.println("enter name,city,age to update");
				 name=s.next();
				int count2=0;
			
				for(int i=0;i<studentArray.size();i++) {
					if(studentArray.get(i).getName().contains(name)) {
						System.out.println("student record"+(i+1));
						System.out.println("enter student want to update");
						name=s.next();
						System.out.println("enter student age want to update");
						age=s.nextInt();
						System.out.println("enter city want to update");
						city=s.next();
						studentArray.get(i).setAge(age);
						studentArray.get(i).setCity(city);
						count2++;
//						Student s1=studentArray.get(i);
//						s1.setAge(age);
//						s1.setName(name);
//						studentArray.set(i, s1);
						
						
						
						
					}
					
				}
				if(count2==0) {
				System.out.println("no record");	
				}
				else {
					System.out.println("update done succesfully");
				}

				break;

				
			case 6:
				System.out.println("enter name to sorting by name");
				name=s.next();

				
			}


		}
		

	}

}
