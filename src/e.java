import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class e {
	public static void main(String[] args) {
		int x = 1;
		int y = 5;

		Scanner in = new Scanner(System.in);

		String inputs = in.nextLine();

		Nodes nodes1 = new Nodes(1, 5);

		Nodes[] array = new Nodes[inputs.length()];
		array[0] = nodes1;

		for (int i = 0; i < inputs.length(); i++) {
			if (inputs.charAt(i) == 'R')
				x++;
			if (inputs.charAt(i) == 'L')
				x--;
			if (inputs.charAt(i) == 'U')
				y++;
			if (inputs.charAt(i) == 'D')
				y--;
			else
				System.out.println("Only R,L,U, and D are acceptable characters");

			Nodes nodes2 = new Nodes(x, y);
			array[i + 1] = nodes2;
		}

		if (array[inputs.length()] == new Nodes(5, 1))
			System.out.println("The line ends at the correct node");
		else
			System.out.println("Line does not end at the correct node");

		ArrayList<Nodes> list = new ArrayList<>(Arrays.asList(array));
	}

}