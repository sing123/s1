package test1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


  
public class Demo7z {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) throws Exception{  
        Process proc;  
        String j = "";  
        String cmd = "";  
        String log7z = "";  
        String lastlog7z = "";  
        for(int i=0;i<10;i++) {  
            j = String.valueOf(i);  
            cmd = "C:/Program Files/7-Zip/7z.exe a F:/lzma_dir/out/7z" + j + ".7z F:/mp3/000/*.*";  
            long time1 = System.currentTimeMillis();
            System.out.print("开始运行......"+time1+"\n" + cmd + "\n");  
            proc = Runtime.getRuntime().exec(cmd);  
              
            InputStream is = proc.getInputStream();  
            BufferedReader br = new BufferedReader(new InputStreamReader(is));  
              
            while((log7z = br.readLine()) != null) {  
                lastlog7z = log7z;  
                //System.out.println(lastlog7z);  
            }  
              
            if("Everything is Ok".equals(lastlog7z)) {  
                System.out.println("运行正常......");  
            } else {  
                System.out.println("错误......");  
            }   
            long time2 = System.currentTimeMillis();
            System.out.print("运行时间："+(time2-time1)/1000);  
        }  
    }  
  
}  