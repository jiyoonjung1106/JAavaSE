package day12.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * [[I/O - Input/Output ]]
 * 입력/출력 관련 패키지
 */
public class MainClass01 {
	public static void main(String[] args) throws IOException {
		// File 객체 - 경로정보를 받아 파일 또는 디렉토리 정보를 객체화
		File f= new File("C:\\");
		
		//C 드라이브 하위에 있는 모든 디렉토리 및 파일 반환한다.
		String[] list = f.list();
		
		// Calendar 객체를 현재 시스템 날짜로 생성한다.
		Calendar c = Calendar.getInstance();
		
		
		for(String temp : list) {	// 파일목록 반복문을 이용하여 하나씩 가져오기
			//temp 명의 디렉토리 또는 파일 File 객체로 생성
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환한다.
			long lastMod = f2.lastModified();
			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar 객체로 다시 설정한다.
			c.setTimeInMillis(lastMod);
			
			//마지막 수정할 날짜 포맷변환하여 문자열 반환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String today1 = sdf.format(c.getTime());
			
			// isDirectory() - 디렉토리이면 true, 파일이면 false
			if(f2.isDirectory()) {
				System.out.print(f2.getName()+"(디렉토리) -");
				System.out.println(today1);
			}
			
		}
		
		for(String temp : list) {
			//temp 명의 디렉토리 또는 파일 File 객체로 생성
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환한다.
			long lastMod = f2.lastModified();
			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calendar 객체로 다시 설정한다.
			c.setTimeInMillis(lastMod);
			
			//마지막 수정할 날짜 포맷변환하여 문자열 반환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String today1 = sdf.format(c.getTime());
			
			// isDirectory() - 디렉토리이면 true, 파일이면 false
			if(f2.isFile()) {
				String size = String.format("%, d", f2.length());
				
				System.out.print(f2.getName()+"(파일) -"+ size+"byte");
				System.out.println(today1);
			}
			
		}// for문 끝
		
		
		File f3 = new File("./", "java.txt");
		//createNewFile() : 파일 생성하면 true 못하면 false
		if(f3.createNewFile()) {
			System.out.println("java.txt 파일이 생성되었습니다.");
		}
		// delete() : 파일 삭제하면 true 못하면 false
		if(f3.delete()) {
			System.out.println("java.txt 파일이 삭제되었습니다.");
		}
		Calendar c2 = Calendar.getInstance();
		
		int year = c2.get(Calendar.YEAR);
		int month = c2.get(Calendar.MONTH)+1;
		int day = c2.get(Calendar.DAY_OF_MONTH);
		int millSec = c2.get(Calendar.DAY_OF_MONTH);
		
		File f4 = new File("./upload/"+year+"/"+month+"/"+day);
		if(f4.mkdirs()) {
			System.out.println("./upload/"+year+"/"+month+"/"+day
					+"디렉토리가 생성되었습니다.");
		}
		
		String uploadFile = "upload_"+year+month+day+millSec;
		File f5 = new File(f4,uploadFile );
		if(f5.createNewFile()) {
			System.out.println(uploadFile+"이 생성되었습니다.");
		}
		
		
	} // 메인메소드 끝

	
	
	
	
	
}














