package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * BufferedInputStream / BufferedOutputStream
 *  - 버퍼 보조 스트림
 *  - 성능 향상
 *  - 병목현상 방지
 * 
 */
public class MainCalss03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		PrintStream ps = null;
		
		try {
			// hello.txt 파일을 읽기 위한 객체 생성
			fis = new FileInputStream("./upload/hello.txt");
			// BufferedInputStream으로 기존 스트림을 감싸서 버퍼 기능을 추가함
			bis = new BufferedInputStream(fis);
			
			//upload2 폴더 생성
			File f1 = new File("./upload2");
			f1.mkdir();
			
			//hello3.txt 파일 생성
			File f2 = new File(f1, "hello3.txt");
			f2.createNewFile();
			
			//hello3.txt 파일을 쓰기 위한 객체 생성
			fos = new FileOutputStream(f2);
			//BufferedOutputStream으로 기존 스트림을 감싸서 버퍼 기능을 추가함
			bos = new BufferedOutputStream(fos);
			
			ps = new PrintStream(bos, true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			// 파일에서 읽은 데이터를 버퍼에 쓰고, 버퍼가 가득 차면 파일에 한 번에 쓰기를 수행함
			while((readByteCnt = bis.read(b))!= -1) {
				bos.write(b,0, readByteCnt);
			}
			
			bos.flush();	//남은 데이터 쏟아내라!!(요즘은 잘 안씀) 
			
			ps.println();
			ps.print("===================================");
			ps.print("안녕하세요.");
			ps.print("PrintStream으로 작성했어요!");
			ps.print("===================================");
			
			System.out.println("실행완료!!");
		
			
			
		} catch (Exception e) {
			System.out.println("에러 발생!");
			e.printStackTrace();
		} finally {
			// close 순서는 생성된 객체 역순으로..(쓰기부터 닫고 읽닫기)
			if(bos != null)bos.close();
			if(fos != null)fos.close();
			if(bis != null)bis.close();
			if(fis != null)fis.close();
			if(ps != null)ps.close();
		}
	}
}



































