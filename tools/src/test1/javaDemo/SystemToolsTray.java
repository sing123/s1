package test1.javaDemo;

import java.awt.Image;  
import java.awt.MenuItem;  
import java.awt.PopupMenu;  
import java.awt.SystemTray;  
import java.awt.Toolkit;  
import java.awt.TrayIcon;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.io.IOException;  
import java.util.HashMap;  
import java.util.Map;  
/** 
 * ϵͳ���߿������ 
 */  
public class SystemToolsTray  
{  
    public static Runtime rt;  
    public static Map<String,String> commandMap=new HashMap<String, String>();  
      
    public static void main(String[] args) throws Exception  
    {  
        rt=Runtime.getRuntime();  //java���л���ʵ��  
        SystemTray tray = SystemTray.getSystemTray();  //����ϵͳ����  
        PopupMenu trayMenu= new PopupMenu();  //���������Ҽ��˵�  
        
        //��ʼ�������  
        commandMap.put("������", "calc");  
        commandMap.put("���±�", "notepad");  
        commandMap.put("���������", "taskmgr");  
        commandMap.put("��ͼ����", "mspaint");  
        commandMap.put("��QQ", "C:\\Program Files (x86)\\Tencent\\QQ\\QQProtect\\Bin\\QQProtect.exe");  
        commandMap.put("�����ļ�", "cmd /c echo ���ע�ҵĲ��� http://snkcxy.iteye.com/>d:\\cxyCommandShow.txt");  
        commandMap.put("�����ļ�", "cmd /c d:\\cxyCommandShow.txt");  
        commandMap.put("��ʱ�ػ�", "shutdown -s -t 600");  
        commandMap.put("ȡ���ػ�", "shutdown -a");  
          
        //�Զ����������Ҽ��˵������¼���ִ�����  
        for(final String one : commandMap.keySet())  
        {  
            MenuItem item = new MenuItem(one);  
            item.addActionListener(new ActionListener() {  
                public void actionPerformed(ActionEvent e) {  
                    try  
                    {  
                        rt.exec(commandMap.get(one));  
                    } catch (IOException e1)  
                    {  
                        e1.printStackTrace();  
                    }  
                }  
            });  
            trayMenu.add(item);  
        }  
          
        MenuItem exitItem = new MenuItem("�˳�");  
        exitItem.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                System.exit(0);  
            }  
        });  
        trayMenu.add(exitItem);  
          
        Image image = Toolkit.getDefaultToolkit().getImage("src/res/img/222.jpg");  //����ͼƬ  
        TrayIcon trayIcon = new TrayIcon(image, "�Զ��峣�ù���", trayMenu);  //����trayIcon  
        tray.add(trayIcon);  
    }  
}  