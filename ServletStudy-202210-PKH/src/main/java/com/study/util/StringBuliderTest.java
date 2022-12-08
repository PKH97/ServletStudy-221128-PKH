package com.study.util;

public class StringBuliderTest {

	public static void main(String[] args) {
		String str = "문자열1";
		str += "문자열2";
		str = str.replaceAll("문자열2", "문자열3");
		
		System.out.println(str);
		
		//면접질문나옴..ㅎ
		StringBuilder builder = new StringBuilder(); // -> 비동기(단일 쓰레드 환경에서 사용)
		StringBuffer buffer = new StringBuffer(); // -> 동기(멀티 쓰레드 환경에서 사용)
	}
}
