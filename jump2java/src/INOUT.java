/* 6�� �ڹ��� ����� 
 * �ܼ� �����
 * ���� ����� 
*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class INOUT {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // "1byte" ũ���� ������� �Է��� �޾Ƶ��δ�. 
        InputStreamReader reader = new InputStreamReader(in); 

        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]); // �ƽ�Ű�ڵ尪�� ����
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
    
}
