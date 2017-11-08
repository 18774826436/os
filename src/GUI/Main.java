
package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.PID;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Kernel.MainProcess;



public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	public Main(){};
	public Main(List<PID> pcb,List<PID> pcb2) {


		
		setTitle("处理界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String path="image\\1.png";
		ImageIcon bg=new ImageIcon(path);
		JLabel la =new JLabel(bg);//这个面板上是背景图片。
		la.setBounds(0, 0, 701, 420);
		setBounds(0, 0, 701, 420);
		JPanel ip=(JPanel)this.getContentPane();
		ip.add(la);//控件要加到la上
		ip.setOpaque(false);
		ip.setLayout(null);
		this.getLayeredPane().add(la,Integer.MIN_VALUE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("第一道");
		label.setBounds(14, 87, 72, 18);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(72, 84, 86, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 120, 86, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("第二道");
		label_1.setBounds(14, 123, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("第三道");
		label_2.setBounds(14, 157, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("第四道");
		label_3.setBounds(14, 188, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("第五道");
		label_4.setBounds(14, 219, 72, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("第六道");
		label_5.setBounds(14, 250, 72, 18);
		contentPane.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(72, 157, 86, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(72, 188, 86, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 219, 86, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(72, 250, 86, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(217, 46, 210, 43);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_7.setBounds(472, 133, 106, 42);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		textField_8 = new JTextField();
		textField_8.setBounds(472, 188, 106, 49);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("CPU");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 32));
		lblNewLabel.setBounds(289, 13, 86, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(134, 314, 60, 24);
		contentPane.add(btnNewButton);
		

		
		JButton btnNewButton_2 = new JButton("挂起");
		btnNewButton_2.setBounds(412, 313, 113, 27);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MainProcess.flag==1)
				{
					MainProcess.flag2=1;
				}
				if(MainProcess.flag2==1)
				{
					MainProcess.gpcb2 = pcb2.get(2);
				}
				if(MainProcess.flag==0)
				{
					MainProcess.gpcb = pcb2.get(1);
					MainProcess.flag = 1;
					pcb2.remove(1);
				}
			}		
				
				
			
		});
		
		if(MainProcess.flag==1)
		{
			textField_7.setText(MainProcess.gpcb.getWeight() + MainProcess.gpcb.toString());
			
		}
		if(MainProcess.flag2==1)
		{
			textField_8.setText(MainProcess.gpcb2.getWeight() + MainProcess.gpcb2.toString());
		}
		
		JButton btnNewButton_1 = new JButton("解挂");
		btnNewButton_1.setBounds(262, 313, 113, 27);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MainProcess.flag2==1)
				{
					textField_6.setText(MainProcess.gpcb2.getWeight() + MainProcess.gpcb2.toString());
					MainProcess.flag2=0;
				}
				else if(MainProcess.flag==1)
				{
					textField_6.setText(MainProcess.gpcb.getWeight() + MainProcess.gpcb2.toString());
					MainProcess.flag=0;
				}
			}		
		});
		
		JButton btnNewButton_3 = new JButton("退出");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(570, 359, 113, 27);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("停止");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pcb.size()>=6)
				{
					textField.setText(pcb.get(0).toString());
					textField_1.setText(pcb.get(1).toString());
					textField_2.setText(pcb.get(2).toString());
					textField_3.setText(pcb.get(3).toString());
					textField_4.setText(pcb.get(4).toString());
					textField_5.setText(pcb.get(5).toString());
				}
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(14, 333, 60, 27);
		contentPane.add(btnNewButton_4);
		
		if(pcb.size()>3)
		{
			for(int i =  2; i < pcb.size()-1 ; i++)
			{
				pcb2.add(pcb.get(i)) ;
				if(pcb2.get(i-1).getWeight()<pcb2.get(i).getWeight())
				{
					PID temp = pcb2.get(i-1);
					pcb2.set(i-1, pcb2.get(i));
					pcb2.set(i, temp);
				}
			}	
		}
		
		
		
		if(pcb2.size()>=1)
		{
			textField.setText(pcb2.get(1).getWeight() + pcb2.get(1).toString());			
		}
		if(pcb2.size()>2)
		{
			textField_1.setText(pcb2.get(2).getWeight() + pcb2.get(2).toString());
		}
		if(pcb2.size()>3)
		{
			textField_2.setText(pcb2.get(3).getWeight() + pcb2.get(3).toString());
		}
		if(pcb2.size()>4)
		{
			textField_3.setText(pcb2.get(4).getWeight() + pcb2.get(4).toString());
		}
		if(pcb2.size()>5)
		{
			textField_4.setText(pcb2.get(5).getWeight() + pcb2.get(5).toString());
		}
		if(pcb2.size()>6)
		{
			textField_5.setText(pcb2.get(6).getWeight() + pcb2.get(6).toString());
		}
		if(pcb.size()>3)
		{
				try {
					Thread.sleep(pcb2.get(pcb.size()-1).getTime()*1000);
					pcb2.remove(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
		}
		if(pcb2.size()>=1)
		{
			textField_6.setText(pcb2.get(1).getWeight() + pcb2.get(1).toString());
				pcb2.remove(1);
			
		}
	}
}

