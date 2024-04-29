import java.util.Scanner;

public class rock_paper_scissors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String my_pick, computer_pick;
		
		do {
			System.out.println("안 내면 진다, 가위 바위 보!: ");
			my_pick = s.next();
			
			String[] hands = {"가위", "바위", "보"};
			int pick = (int) (Math.random() * 3);
			computer_pick = hands[pick];
			
			System.out.println("컴퓨터: "+computer_pick);
			
			if (my_pick.equals(computer_pick)) {
				System.out.println("비겼네요. 다시 준비하세요!");
			}else if
			((my_pick.equals("가위") && computer_pick.equals("보")) || 
			(my_pick.equals("바위")&&computer_pick.equals("가위")) || 
			(my_pick.equals("보")&&computer_pick.equals("바위"))) {
				System.out.println("이겼습니다.");
				break;
			}else {
				System.out.println("졌습니다.");
				break;
			}
		} while (true);
			
		s.close();
	}
}