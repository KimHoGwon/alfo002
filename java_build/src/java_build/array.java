package java_build;

public class array {

	public static void main(String[] args) {

		int[] a = new int[10];
		
		a[4]=100;
		
		System.out.println(a[4]);
		
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
			}
		
	}
	
}
		
//		배열: array: 같은 type의 데이터를 한번에 선언하기 위한 것이 배열이다.
//		이점: type(종류)별로만 변수 선언하면 됨
//		형태: 나란히(나열형-선착순-시간의 종속)-순서(index - 순서가 다르기에 중복이 허용)
//		배열부터 데이터 주소라는 개념이 등장.
//		예:int4개 만들고 int 1개당 데이터 주소를 부여
		
//		-이 데이터 주소를 변수에 부여(reference 형식)
//		int a;
//		int[](선언) a; - reference var(레퍼런스 변수 - 주소값이 여기에 무조건 4byte)
//		int a[];
//		new int[갯수];(정의) - 실제 메모리가 적힘 
//		예시) int[]a(주소값)= new int[4](주소에 있는 칸 수)
//		공간을 만듦과 동시에 제로의 영역으로 미리 다 채워둠
//
//		2번째 예시: a[0]=0번지에 잇는 데이터 꺼내와
//		a[0]=3 0번지에는 3을 줘
//		a.length = 배열 길이

//		데이터 - 유형
//		(값) - 크기
//			- 무적
//			- 성질
//				이것들을 도메인이라고 한다.
//		기본형 prmitive type 
//		값 : date
//		정수형: byte,short,int, long
//		실수형: float, double
//		진리형: boolean
//		문자형: char
//
//		참조형 reference type
//		객체: 구조적 date
//		class

