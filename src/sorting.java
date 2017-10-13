
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] cards = {16,58,81,14,7,2,27,1,8,499};
	int sorted= cards.length;
		while(sorted> 0) {	
			int max = cards[0];
			int maxIndex = 0;
		
			
			//find the highest number and move it to the end
			for (int i=0; i < sorted; i++) {
				if(cards[i]> max){
					max= cards[i];
					maxIndex = i;
				}
			}
			int hold = cards[sorted-1];
			cards[sorted-1]= max;
			cards[maxIndex]= hold;
			
			sorted--;
		}
		for (int i=0; i< cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
}
