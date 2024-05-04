import java.util.Scanner;

public class lmg20211504_mid1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String my_pick, computer_pick;
		
		
		while(true) {
			System.out.println("안 내면 진다, 가위 바위 보!: ");
			my_pick = s.next();
			
			if (my_pick.equals("가위") || my_pick.equals("바위") || my_pick.equals("보")) {
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
					System.out.println("당신이 이겼습니다.");
					break;
				}else {
					System.out.println("당신이 졌습니다.");
					break;
				}
			} else {
				System.out.println("가위, 바위, 보 중에 선택하세요.");
			}
		}
		s.close();
	}
}