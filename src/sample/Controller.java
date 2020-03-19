package sample;

public class Controller {
}
public class Main {

    public static void main(String[] args) {
	    /*
	    Napisati program koji omogućuje unos jedne rečenice u string.
	    Zatim se spomenuti string prepravlja tako što se u najdužoj
	    riječi u rečenici sva mala slova pretvaraju u velika.
	     */
        Scanner ulaz = new Scanner(System.in);
        String s = ulaz.nextLine();
        String[] word = s.split(" ");
        String longestWord = "";
        for (String s1 : word) {
            if (s1.length() >= longestWord.length()) {
                longestWord = s1;
            }
        }
        s = s.replaceAll(longestWord, longestWord.toUpperCase());
        System.out.println(s);
    }
}