package Tray;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;

import ClientFrame.ClientFrame;
import ClientFrame.FileChooser;

public class Tray {
	public Tray(){
		//判断是否支持系统托盘
		if(SystemTray.isSupported()){
			//获得当前系统的系统托盘
			SystemTray tray = SystemTray.getSystemTray();       
			//图标和工具栏
			Image img = Toolkit.getDefaultToolkit().getImage("image/tray.png");
			PopupMenu menu = new PopupMenu();//popupmenu:图片弹出式菜单
			//菜单内容
			MenuItem helpdoc = new MenuItem("帮助文档");
			MenuItem open = new MenuItem("打开应用");     
			MenuItem exit = new MenuItem("退出");
			MenuItem sendFile = new MenuItem("发送文件");
			//
			helpdoc.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ClientFrame.HelpDoc();
				}
				
			});
			/*open.addActionListener(new ActionListener(){         //工具栏添加事件

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						ClientFrame cf = new ClientFrame();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}); */
			exit.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(-1);
				}
				
			});
			sendFile.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					FileChooser fc = new FileChooser();
				}
				
			});
			//
			menu.add(helpdoc);
			menu.add(sendFile);
			menu.add(open);
			menu.add(exit);
			TrayIcon trayIcon = new TrayIcon(img, "远程桌面监控系统", menu);
			try {
				tray.add(trayIcon);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
