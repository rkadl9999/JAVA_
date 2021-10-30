import java.util.Scanner;

public class Grade_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평균 내신등급을 계산하시겠습니까 ? ( yes = 1, no = 2)");
		int select = sc.nextInt();
		if(select==1) {
			System.out.println("몇개 과목의 평균을 계산하시겠습니까 ?");
			int i = sc.nextInt();
			int [] danwe = new int[i];	//단위수를 저장할 배열
			int [] grade = new int[i];  //등급을 저장할 배열
			for(int j=1;j<=i;j++) {
				System.out.printf("%d번째 과목의 단위수 : ",j);
				danwe[j-1]=sc.nextInt();
				System.out.printf("%d번째 과목의 등급 : ",j);
				grade[j-1]=sc.nextInt();
			}
			int [] arr = new int[i];
			for(int j=0;j<i;j++) {                   //과목단위수*등급을 배열에 저장
				arr[j]=danwe[j]*grade[j];
			}
			int cnt=0; 						//단위수의 총합을 저장할 변수
			for(int j=0; j<i; j++) {
				cnt+=danwe[j];
			}
			int total=0;						//과목단위수*등급의 총합 저장 변수
			for(int j=0;j<i;j++) {
				total+=arr[j];
			}
			int avgGrade = total/cnt;
			System.out.printf("평균등급은 %d등급 입니다.",avgGrade);
		}
		else
			System.out.println("종료합니다.");
	}

}
