package week3.day1;

public class StudentInfo {
		public void getStudentInfo(int id) {
		System.out.println("student id:"+id);
		}
		public void getStudentInfo(String name) {
		System.out.println("student name:"+name);
		}
		public void getStudentInfo(String emailid,long phonenumber) 
		{
		System.out.println("student email:"+emailid);
		System.out.println("student phonenumber:"+phonenumber);
		}
		public static void main(String[] args) {
			StudentInfo std=new StudentInfo();
			std.getStudentInfo(0021);
			std.getStudentInfo("A.Anith");
			std.getStudentInfo("anith1114@gmail.com",7871076580L);
		}
}
