import java.util.Scanner;

//반복문 이해하기 (6단: While문 7단: For문)
public class Gugudan2 {
	public static void main(String[] args) {
		// 8, 9단
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 값 :" + number);
        
        if (number < 2) {
        	System.out.println("값을 잘못 입력했습니다.");
        } else if (number > 9) {
        	System.out.println("값을 잘못 입력했습니다.");
        } else {
        	for(int i = 1; i < 10; i++)  {
        	System.out.println(number * i);
        }
        }
	}
}

////        6단
//        int i = 1;
//        while(i < 10) {
//        	System.out.println(6 * i);
//        	i = i + 1;
//        }
        
////        7단
//        for(int j = 1; j < 10; j++) {
//        	System.out.println(7 * j);
        
	


