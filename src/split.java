
public class split {

	public static void main(String[] args) {
		String str = "aaa-bbb-ccc";

		// str을 -를 기준으로 분리하여 저장할 str_split 배열 생성
		String[] str_split = str.split("-");

		String split_result01 = str_split[0];
		String split_result02 = str_split[1];
		String split_result03 = str_split[2];

		System.out.println(split_result01);
		System.out.println(split_result02);
		System.out.println(split_result03);

	}

}
