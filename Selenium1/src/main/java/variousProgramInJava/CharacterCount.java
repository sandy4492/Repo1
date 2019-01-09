package variousProgramInJava;

public class CharacterCount {

	public static void count(String st) {

		char[] chararray = st.toCharArray();
		for (int i = 0; i < chararray.length; i++) {

			String s = " ";

			while (i < chararray.length && chararray[i] != ' ') {

				s = s + chararray[i];
				i++;
			} 
			
		String st1=	s.replace(" ", "");
			System.out.println(s + " " + st1.length());

		}

	}

	public static void main(String[] args) {
		String str = "Hello World";
		count(str);

	}

}
