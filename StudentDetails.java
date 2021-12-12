package week3.day1;

public class StudentDetails extends Department{

		public void studentName() {
			System.out.println("A.Anith");
		}
		
		public void studentId() {
			System.out.println("IdNo-4021");
		}
		public static void main(String[] args) {
			StudentDetails sd = new StudentDetails();
			sd.collegeCode();
			sd.collegeName();
			sd.collegeRank();
			sd.deptName();
			sd.studentId();
			sd.studentName();
		}
		}

