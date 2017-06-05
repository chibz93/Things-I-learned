
public class Teacher {
	Teachers teachers;
	Lessons lessons;
	Classes classes;
	
	public Teacher(Teachers teachers, Lessons lessons, Classes classes) {
		this.teachers = teachers;
		this.lessons = lessons;
		this.classes = classes;
	}



	public static void main(String[] args) {
		Teacher MrBlake = new Teacher(Teachers.Mr_Blake, Lessons.Maths, Classes.Class1);
		MrBlake.teacherInformation();
		Teacher MrSmith = new Teacher(Teachers.Mr_Smith, Lessons.Art, Classes.Class2);
		MrSmith.teacherInformation();
		Teacher MrsDaniels = new Teacher(Teachers.Mrs_Daniels, Lessons.English, Classes.Class3);
		MrsDaniels.teacherInformation();
		Teacher MrMiles = new Teacher(Teachers.Mr_Miles, Lessons.French, Classes.Class4);
		MrMiles.teacherInformation();
		Teacher MrsDavids = new Teacher(Teachers.Mrs_Davids, Lessons.Geography, Classes.Class5);
		MrsDavids.teacherInformation();
	}
		
	
		
	public void teacherInformation(){
		switch(teachers){
		case Mr_Blake:
			System.out.println("Mr Blake teaches " + lessons + " in " + classes);
			break;
		case Mr_Smith:
			System.out.println("Mr Smith teaches " + lessons + " in " + classes);
			break;
		case Mrs_Daniels:
			System.out.println("Mr Blake teaches " + lessons + " in " + classes);
			break;
		case Mr_Miles:
			System.out.println("Mr Miles teaches " + lessons + " in " + classes);
			break;
		case Mrs_Davids:
			System.out.println("Mrs Davids teaches " + lessons + " in " + classes);
			break;
		default:
			break;
		}

	}
}

