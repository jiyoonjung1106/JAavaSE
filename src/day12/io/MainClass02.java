package day12.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream/OutputStream
 * 바이트 기반 입력과 출력을 다루는 추상 클래스입니다.
 * 
 * FileInputStream
 * - 파일을 읽는 객체
 * 
 * FileOutputStream
 * - 파일에 쓰는 객체
 * 
 * 절대경로 - 파일 또는 디렉토리 절대위치
 * ex) C:\\디렉토리명\파일명.확장자
 *  
 * 상대경로 - 현재 위치에서 상대적인 파일 또는 디렉토리 위치
 * ex) . -> 현재 위치를 나타냄
 * 	   ..-> 상위 경로(폴더)를 나타냄
 * 	   
 *     ./upload/hello.txt
 * 
 */
public class MainClass02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			// hello.txt 파일을 읽기 위한 객체
			fis = new FileInputStream("./upload/hello.txt");
			
			File f1 = new File("./upload2");
			// ./upload2 디렉토리 생성
			f1.mkdir();
			
			File f2 = new File(f1, "hello2.txt");
			// ./upload2경로에 hello2.txt 파일 생성
			f2.createNewFile();
			
			// hello2.txt에 쓰기 위한 객체 생성
			// FileOutputStream 디렉토릭 경로는 존재해야 한다.
			// 파일은 없으면 자동으로 생성된다.
			fos = new FileOutputStream(f2);
			
			int readByteCnt = 0;
			byte[] b = new byte[100];
			
//			int i = 1;
			
			//fis.read(b) => b길이만큼 읽어서 b에 저장
			//읽은 길이값 readByteCnt에 저장
			while((readByteCnt = fis.read(b)) != -1) {
				// fos.write() => b데이터 readByteCnt 길이만큼 쓰기
				fos.write(b,0, readByteCnt);
			}
			System.out.println("실행완료");
			
		} catch (IOException e) {
			System.out.println("IOException 발생!");
		} finally {
			if(fos!=null)fos.close();
			if(fis!=null)fis.close();
		}
		
	}

}










