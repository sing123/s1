package test1;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo {

	public static void main(String[] args) throws Exception {
		String pathName = "F:/m.mp3";
		int byteSize = 64;
		long time1 = System.currentTimeMillis();
//		printBinary(pathName);
		test(pathName,byteSize);
		long time2 = System.currentTimeMillis();
		System.out.println("Run Time:["+(time2-time1)/1000f+"]sec.");
	}

	private static void printBinary(String pathName) throws FileNotFoundException, IOException {
		// ��ȡ�ļ�
		File f = new File(pathName);
		// ����ֽ�������
		//FileInputStream fis = new FileInputStream(pathName);
		// ��ɴ����Ķ����� ��ȡ��
		InputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
		int x=0;
		while((x=fis.read())!=-1)
		{
//		     System.out.println(Integer.toBinaryString(x));
		     System.out.print(Integer.toHexString(x));
		}
		
		fis.close();//�ر���
	}
	
	public static void test(String pathName, int byteSize){
		  FileInputStream is = null;
	        try {
	            is = new FileInputStream(pathName);
	            int i;
	            byte[] b = new byte[byteSize];
	            while((i=is.read(b))!=-1)
	            {
	                 System.out.println(printHex(b));
	            }
	            is.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	    }

	public static final String printHex(byte[] bArray) {  
	          StringBuffer sb = new StringBuffer(bArray.length);  
	          String sTemp;  
	          for (int i = 0; i < bArray.length; i++) {  
	           sTemp = Integer.toHexString(0xFF & bArray[i]);  
	           if (sTemp.length() < 2)  
	            sb.append(0);  
	           sb.append(sTemp.toUpperCase());
//	           sb.append(' ');
	          }  
	          return sb.toString();  
	         }  

}
