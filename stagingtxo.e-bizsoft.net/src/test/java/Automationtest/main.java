package Automationtest;

public class main {

	public void loop(int w) {
		for(int i =0;i<= w;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}

		main ma=new main();
		ma.loop(5);
		String Paragraph = "Welcome to Java Print Hello World"; 
		
		String First = "//td[text() ='";

		System.out.println(Paragraph);
		 String[] EachWordOfParagraph  = Paragraph.split(" ");

		 System.out.println(EachWordOfParagraph.length);

		 System.out.println(EachWordOfParagraph[5]);
		 
		 for(int j=0; j >= 6;j++) {
			 System.out.println(j);
		 }
		for(int i=0; i <= EachWordOfParagraph.length-1; i++){ 

		System.out.println("arr["+i+"] : " + EachWordOfParagraph[i]);
		}
	}
	

}
