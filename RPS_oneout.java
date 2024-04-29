import java.util.Scanner;

public class RPS_oneout {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		do {
			System.out.println("나의 첫번째 선택: ");
			String my_first_pick = s.next();
			System.out.println("나의 두번째 선택: ");
			String my_second_pick = s.next();

			String[] hands1 = {"가위", "바위", "보"};
			int pick1 = (int) (Math.random() * 3);
			String computer_pick1 = hands1[pick1];
			System.out.println("컴퓨터의 첫번째 선택: "+computer_pick1);
			
			int pick2 = (int) (Math.random() * 3);
			String computer_pick2 = hands1[pick2];
			System.out.println("컴퓨터의 두번째 선택: "+computer_pick2);

			System.out.println("나의 최종 선택(" + my_first_pick + " or " + my_second_pick + "): ");
			String my_final_pick = s.next();
			
			String[] hands2 = {computer_pick1, computer_pick2};
			int pick3 = (int) (Math.random() * 2);
			String computer_final_pick = hands2[pick3];
			System.out.println("컴퓨터의 최종 선택: "+computer_final_pick);

			if (my_final_pick.equals(computer_final_pick)) {
				System.out.println("비겼네요. 다시 준비하세요!");
			}else if
			((my_final_pick.equals("가위") && computer_final_pick.equals("보")) || 
			(my_final_pick.equals("바위")&&computer_final_pick.equals("가위")) || 
			(my_final_pick.equals("보")&&computer_final_pick.equals("바위"))) {
				System.out.println("이겼습니다.");
				break;
			}else {
				System.out.println("졌습니다.");
				break;
			}
		} while (true);
//			
		s.close();
	}
}