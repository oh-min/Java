import java.util.Scanner; // Scanner 클래스만 import
// import java.util.*; // java.util의 모든 클래스 import

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자형
		/* next() : String 형 입력 및 리턴. 토큰(Token) 기준으로 한 단어를 읽음. */
//		String str = sc.next(); // hello world
//		System.out.println(str); // hello

		/* nextLine() : String 형 입력 및 리턴. 개행(Enter) 기준으로 한 줄을 읽음. */
//		String str2 = sc.nextLine(); // hello world
//		System.out.println(str2); // hello world

		
		// 논리형
		/* nextBoolean() : boolean 형 입력 및 리턴 */
//		boolean bl = sc.nextBoolean(); // true
//		System.out.println(bl); // true
		// true, false 이외의 문자를 입력하면 -> 'InputMismatchException' error 발생
		// 대소문자는 상관 없다. TRUE, FalsE 모두 가능
		
		
		// 정수형
		/* nextByte() : byte 형 입력 및 리턴 */
//		byte bt = sc.nextByte();	// 12	,	-123,	149
//		System.out.println(bt);		// 12	,	-123,	error
		// byte 범위 외의 숫자를 입력하면 -> 'InputMismatchException' error 발생
		
		/* nextShort() : short 형 입력 및 리턴 */
//		short s = sc.nextShort();	// 15000
//		System.out.println(s);		// 15000
		
		/* nextInt() : int 형 입력 및 리턴 */
//		int i = sc.nextInt();	// 1234
//		System.out.println(i);	// 1234
		// String타입의 형식인 'hello'를 입력하면 -> 'InputMismatchException' error 발생
		
		/* nextLong() : long 형 입력 및 리턴 */
//		long l = sc.nextLong();	// 23000000000
//		System.out.println(l);	// 23000000000
		
		
		// 실수형
		/* nextFloat() : float 형 입력 및 리턴 */
//		float f = sc.nextFloat();	// 1.123456789, 1.12345671
//		System.out.println(f);		// 1.1234568,	1.1234567
		// float의 범위에서 벗어나면 반올림해서 출력
		
		/* nextDouble() : double 형 입력 및 리턴 */
//		double d = sc.nextDouble();	// 1.123456789
//		System.out.println(d);		// 1.123456789
		
	}

}
