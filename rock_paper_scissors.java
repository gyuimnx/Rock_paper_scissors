import java.util.Scanner;
public class rock_paper_scissors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String my_pick, computer_pick;
		System.out.println("안 내면 진다, 가위 바위 보!: ");
		my_pick = s.next();
		
		
		String[] hand = {"가위", "바위", "보"};
		int pick = (int) (Math.random() * 3);
		computer_pick = hand[pick];
		
		System.out.println("컴퓨터: "+computer_pick);
			
		switch(my_pick) {
			case "가위":
				if (computer_pick == "가위") {
					System.out.println("비겼습니다.");
				}else if (computer_pick == "바위") {
					System.out.println("졌습니다.");
				}else if (computer_pick == "보") {
					System.out.println("이겼습니다.");
				} break;
			case "바위":
				if (computer_pick == "가위") {
					System.out.println("이겼습니다.");
				}else if (computer_pick == "바위") {
					System.out.println("비겼습니다.");
				}else if (computer_pick == "보") {
					System.out.println("졌습니다.");
				} break;
			case "보":
				if (computer_pick == "가위") {
					System.out.println("졌습니다.");
				}else if (computer_pick == "바위") {
					System.out.println("이겼습니다.");
				}else if (computer_pick == "보") {
					System.out.println("비겼습니다.");
				} break;
		}
		s.close();
	}
}