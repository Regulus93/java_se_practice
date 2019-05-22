public class BeerSong{
	
	public static void main(String[] args){
		
		int beerNum = 99;
		String word = "bottles";
		
		StringBuilder sb = new StringBuilder();
		
		while (beerNum > 0) {
			
			if (beerNum == 1){
				word = "bottle";
			}
			
			sb.append(beerNum).append(" ").append(word).append(" of beer on the wall.\n");
			sb.append(beerNum).append(" ").append(word).append(" of beer.\n");
			sb.append("Take on down.\n");
			sb.append("Pass it around.\n");
			beerNum -= 1;
			
			if (beerNum > 0) {
				sb.append(beerNum).append(" ").append(word).append(" of beer on the wall.\n");
			} else {
				sb.append("No more bottles of beer on the wall.");
			}
			
			System.out.println(sb.toString());
			sb.setLength(0);
			
		}
	}
	
	
}