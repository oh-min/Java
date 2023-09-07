
public class split {

	public static void main(String[] args) {
		String str = "aaa-bbb-ccc";

		/* split(String regex) */
		// - 를 기준으로 분리하여 저장하는 배열 생성
		String[] str_split = str.split("=");

		String split_result_01 = str_split[0];
		String split_result_02 = str_split[1];
		String split_result_03 = str_split[2];

		System.out.println(split_result_01);	// aaa
		System.out.println(split_result_02);	// bbb
		System.out.println(split_result_03);	// ccc

		/* split(String regex,int limit) */
		// - 를 기준으로 분리하고, 배열의 길이가 2인 배열 생성
//		String[] str_split_02 = str.split("-", 2);
//
//		String split_result_01 = str_split_02[0];
//		String split_result_02 = str_split_02[1];
//
//		System.out.println(split_result_01); // aaa
//		System.out.println(split_result_02); // bbb-ccc
	}

}
