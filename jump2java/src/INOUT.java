/* 6장 자바의 입출력 
 * 콘솔 입출력
 * 파일 입출력 
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class INOUT {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // "1byte" 크기의 사용자의 입력을 받아들인다. 
        InputStreamReader reader = new InputStreamReader(in); 

        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]); // 아스키코드값이 나옴
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    
}
