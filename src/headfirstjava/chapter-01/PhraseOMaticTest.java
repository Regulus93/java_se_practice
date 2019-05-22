import java.util.List;
import java.util.ArrayList;

public class PhraseOMaticTest {

	public static void main(String[] args){
		
		PhraseOMatic instance = new PhraseOMatic("Dog","Cat","Fish","peeing","eating","sleeping","in the kitchen","in the bedroom","in the toilet");
		
		for (int i = 0; i < 10; i++) { 
			instance.saySomethingWise();
		}
	}
	
}

class PhraseOMatic {

		private List<String> wordListOne;
		private List<String> wordListTwo;
		private List<String> wordListThree;

		public PhraseOMatic(String ... args){
			int argCount = 0;
			wordListOne = new ArrayList<>();
			wordListTwo = new ArrayList<>();
			wordListThree = new ArrayList<>();
			
			for(String arg : args){
				if(argCount < 3){
					wordListOne.add(arg);
				} else if (argCount < 6) {
					wordListTwo.add(arg);
				} else {
					wordListThree.add(arg);
				}
				argCount++;
			}
			
		}
		
		public void saySomethingWise(){
			StringBuilder sb = new StringBuilder();
			
			int random1 = (int) (Math.random() * wordListOne.size());
			int random2 = (int) (Math.random() * wordListTwo.size());
			int random3 = (int) (Math.random() * wordListThree.size());
			
			sb.append(wordListOne.get(random1))
			.append(" ")
			.append(wordListTwo.get(random2))
			.append(" ")
			.append(wordListThree.get(random3))
			.append(".");
			
			System.out.println(sb.toString());
		}

}