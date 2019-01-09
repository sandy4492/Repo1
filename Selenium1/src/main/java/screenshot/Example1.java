package screenshot;

import org.testng.annotations.Test;

public class Example1 {
	@Test
	public void test() {

		String nameAnimals = " cat-dog-mice-snake";

		String newName[] = nameAnimals.split("-");
		System.out.println(newName[2]);

		String fb = " Facebook-login or signup";

		String fbb[] = fb.split("-",3);

		for (int i = 0; i < fbb.length; i++) {
			System.out.println(fbb[i]);

		}

		//System.out.println(fbb[2]);
	}

}
