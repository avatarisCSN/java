package first;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
 
public class Up7 extends JFrame {
   public static Up7 app;
   private TrayIcon iconTr;
   private SystemTray sT = SystemTray.getSystemTray();
   public boolean chetTray = false; //����������, ����� ��� ����� ��������� � ���� ������ ��� ������ ������������
   
   public Up7() throws IOException {
	super("������������ ������������ � ����");
	iconTr = new TrayIcon(ImageIO.read(new File("222.jpg")), "������������ ������������ � ����"); //Ikonka.png - �����������, ������� ����� ������������ � ���� - �������� � �������� ������������ ����������
	iconTr.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent ev)
      {
        setVisible(true);
        setState(JFrame.NORMAL);
        removeTr();
      }
    });
        //���������� ����
        MouseListener mouS = new MouseListener() {
      public void mouseClicked(MouseEvent ev) { }
      public void mouseEntered(MouseEvent ev) { }
      public void mouseExited(MouseEvent ev) {  }
      public void mousePressed(MouseEvent ev) { }
      public void mouseReleased(MouseEvent ev) {}
    };
    iconTr.addMouseListener(mouS);
    
    MouseMotionListener mouM = new MouseMotionListener() {
      public void mouseDragged(MouseEvent ev) { }
      //��� ���������
      public void mouseMoved(MouseEvent ev) {	  
	  boolean flg = false;
	  iconTr.setToolTip("������� ������ - ����������");       
      }
   };
            }
			
// ����� �������� �� ����			
private void removeTr(){ sT.remove(iconTr);}
 
// ����� ���������� � ����	
private void addT() {
    try{
      sT.add(iconTr);
      if (chetTray==false) { iconTr.displayMessage("������������ ������������ � ����", "��������� ����������", TrayIcon.MessageType.INFO); }
	  chetTray = true;
       }
    catch(AWTException ex)
    { ex.printStackTrace(); }
    }
      
   public static void main(String[] args) throws IOException {     
   app = new Up7 ();
   app.setVisible(true);
   app.setAlwaysOnTop(true);
   app.setSize(777, 777);
   
    //���������� ��������� ���� - ����� ���������� ����������� ��� ��������� �������� - ��� ������� ������������, ���� ������ �� ����� :)
    app.addWindowListener(new WindowListener() {
        public void windowClosing(WindowEvent winEvent) {
        System.exit(0);//��� �������� ���� ��������� ���������
		}		
		public void windowActivated(WindowEvent winEvent) {}
        public void windowClosed(WindowEvent winEvent) {}
        public void windowDeactivated(WindowEvent winEvent) {}
        public void windowDeiconified(WindowEvent winEvent) {}
        public void windowIconified(WindowEvent winEvent) {} 
        public void windowOpened(WindowEvent winEvent) {}		
		});  			
	}
}