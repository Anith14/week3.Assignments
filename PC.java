package week3.day1;

public class PC extends Computer 
{
		public void PcSize(int size) 
		{
			System.out.println("PC's size"+ "=" +size);

		}

		public static void main(String[] args)
		{
			PC sel = new PC();
			sel.computerModel("=" +"HP-Envy");
			sel.PcSize(17);
		}
}
