import java.util.*;
public class Final {

	public static void main(String[] args) {
		FinalObject game = new FinalObject();
		Scanner scan = new Scanner(System.in);
		
		Boolean con = true;
		
		while (con == true) {
		System.out.print("You see four doors in front of you each are numbered doors 1-4 which do you pick?");
		int x = scan.nextInt();
		if(x == 1) {
			System.out.println(game.Door1());
			con = false;
		} else if(x == 2) {
			System.out.println(game.Door2());
			con = false;
		} else if(x == 3) {
			System.out.println(game.Door3());
		} else if(x == 4) {
			System.out.println(game.Door4());
			con = false;
		}
		if(x == 3) {
			System.out.println("You did it, you got the treasure .... nice job .... What? .... It's over .... WHY ARE YOU STILL HERE?"
					+ "\n .... Fine but don't say I didn't warn you You stand in front of the rest of the treasure, there's a necklace,"
					+ "\n a ruby, a sword, and finely a crown pick 1-4"); 
			int y = scan.nextInt();
			if (y == 1) {
			     System.out.println(game.Necklace());
			     con = false;
			} else if (y == 2) {
				System.out.println(game.Ruby());
				con = false;
			} else if(y == 3) {
				System.out.println(game.Sword());
				con = false;
			} else if (y == 4) {
				System.out.println(game.Crown());
				con = false;
			}
		}
		}
	scan.close();
	}
}
