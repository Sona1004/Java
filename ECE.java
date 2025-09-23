package javafullproject;

	class Student {
		int id;
	    String name;
		void display(){
			System.out.println("ID:"+id);
			System.out.println("NAME:"+name);
		}
	}
	public class ECE{
		public static void main(String[]args){
			Student ram=new Student();
			ram.id=101;
			ram.name="sona";
			ram.display();
		}
	}