
package GUI;


import Data.PID;
import Kernel.MainProcess;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

public class reverse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;


	/**
	 * Create the frame.
	 */

	public reverse(){};
	public reverse(List<PID> pcb) {
		setTitle("后备队列");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String path="image\\13.png";
		ImageIcon bg=new ImageIcon(path);
		JLabel la =new JLabel(bg);//这个面板上是背景图片。
		la.setBounds(0, 0,  477, 310);
		setBounds(0, 0, 477, 310);
		JPanel ip=(JPanel)this.getContentPane();
		ip.add(la);//控件要加到la上
		ip.setOpaque(false);
		ip.setLayout(null);
		this.getLayeredPane().add(la,Integer.MIN_VALUE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

			if(pcb.size()>=3)
			{
				textField = new JTextField(pcb.get(1).getWeight() + pcb.get(1).toString());
				textField.setBounds(340, 13, 86, 24);
				contentPane.add(textField);
				textField.setColumns(10);
			}
			
			if(pcb.size()>=4)
			{
				textField_1 = new JTextField( pcb.get(2).getWeight() + pcb.get(2).toString());
				textField_1.setBounds(340, 37, 86, 24);
				contentPane.add(textField_1);
				textField_1.setColumns(10);
			}
			
			if(pcb.size()>=5)
			{
				textField_2 = new JTextField( pcb.get(3).getWeight() + pcb.get(3).toString());
				textField_2.setBounds(340, 59, 86, 24);
				contentPane.add(textField_2);
				textField_2.setColumns(10);
			}
			
			if(pcb.size()>=6)
			{
				textField_3 = new JTextField(pcb.get(4).getWeight() + pcb.get(4).toString());
				textField_3.setBounds(341, 82, 86, 24);
				contentPane.add(textField_3);
				textField_3.setColumns(10);
			}
			if(pcb.size()>=7)
			{
				textField_4 = new JTextField(pcb.get(5).getWeight() + pcb.get(5).toString());
				textField_4.setBounds(341, 106, 86, 24);
				contentPane.add(textField_4);
				textField_4.setColumns(10);
			}
			if(pcb.size()>=8)
			{
				textField_5 = new JTextField( pcb.get(6).getWeight() + pcb.get(6).toString());
				textField_5.setBounds(340, 129, 86, 24);
				contentPane.add(textField_5);
				textField_5.setColumns(10);
			}
			if(pcb.size()>=9)
			{
				textField_6 = new JTextField( pcb.get(7).getWeight() + pcb.get(7).toString() );
				textField_6.setBounds(341, 155, 86, 24);
				contentPane.add(textField_6);
				textField_6.setColumns(10);
			}
			if(pcb.size()>=10)
			{
				textField_7 = new JTextField( pcb.get(8).getWeight() + pcb.get(8).toString());
				textField_7.setBounds(340, 177, 86, 24);
				contentPane.add(textField_7);
				textField_7.setColumns(10);
			}
			if(pcb.size()>=11)
			{
				textField_8 = new JTextField( pcb.get(9).getWeight() + pcb.get(9).toString());
				textField_8.setBounds(341, 202, 86, 24);
				contentPane.add(textField_8);
				textField_8.setColumns(10);
			}
			if(pcb.size()>=12)
			{
				textField_9 = new JTextField( pcb.get(10).getWeight() + pcb.get(10).toString());
				textField_9.setBounds(227, 13, 86, 24);
				contentPane.add(textField_9);
				textField_9.setColumns(10);
			}
			if(pcb.size()>=13)
			{
				textField_10 = new JTextField( pcb.get(11).getWeight() + pcb.get(11).toString());
				textField_10.setBounds(227, 37, 86, 24);
				contentPane.add(textField_10);
				textField_10.setColumns(10);
			}
			if(pcb.size()>=14)
			{
				textField_11 = new JTextField(pcb.get(12).getWeight() + pcb.get(12).toString());
				textField_11.setBounds(227, 59, 86, 24);
				contentPane.add(textField_11);
				textField_11.setColumns(10);
			}
			if(pcb.size()>=15)
			{
				textField_12 = new JTextField( pcb.get(13).getWeight() + pcb.get(13).toString());
				textField_12.setBounds(227, 82, 86, 24);
				contentPane.add(textField_12);
				textField_12.setColumns(10);
			}
			if(pcb.size()>=16)
			{
				textField_13 = new JTextField( pcb.get(14).getWeight() + pcb.get(14).toString());
				textField_13.setBounds(227, 106, 86, 24);
				contentPane.add(textField_13);
				textField_13.setColumns(10);
			}
			if(pcb.size()>=17)
			{
				textField_14 = new JTextField( pcb.get(15).getWeight() + pcb.get(15).toString());
				textField_14.setBounds(227, 129, 86, 24);
				contentPane.add(textField_14);
				textField_14.setColumns(10);
			}
			if(pcb.size()>=18)
			{
				textField_15 = new JTextField( pcb.get(16).getWeight() + pcb.get(16).toString());
				textField_15.setBounds(227, 155, 86, 24);
				contentPane.add(textField_15);
				textField_15.setColumns(10);
			}
			if(pcb.size()>=19)
			{
				textField_16 = new JTextField( pcb.get(17).getWeight() + pcb.get(17).toString());
				textField_16.setBounds(227, 177, 86, 24);
				contentPane.add(textField_16);
				textField_16.setColumns(10);
			}
			if(pcb.size()>=20)
			{
				textField_17 = new JTextField( pcb.get(18).getWeight() + pcb.get(18).toString());
				textField_17.setBounds(227, 202, 86, 24);
				contentPane.add(textField_17);
				textField_17.setColumns(10);
			}
			if(pcb.size()>=21)
			{
				textField_18 = new JTextField(pcb.get(19).getWeight() + pcb.get(19).toString());
				textField_18.setBounds(114, 13, 86, 24);
				contentPane.add(textField_18);
				textField_18.setColumns(10);
			}
			if(pcb.size()>=22)
			{
				textField_19 = new JTextField( pcb.get(20).getWeight() + pcb.get(20).toString());
				textField_19.setBounds(114, 37, 86, 24);
				contentPane.add(textField_19);
				textField_19.setColumns(10);
			}
			if(pcb.size()>=23)
			{
				textField_20 = new JTextField( pcb.get(21).getWeight() + pcb.get(21).toString());
				textField_20.setBounds(114, 59, 86, 24);
				contentPane.add(textField_20);
				textField_20.setColumns(10);
			}
			if(pcb.size()>=24)
			{
				textField_21 = new JTextField( pcb.get(22).getWeight() + pcb.get(22).toString());
				textField_21.setBounds(114, 82, 86, 24);
				contentPane.add(textField_21);
				textField_21.setColumns(10);
			}
			if(pcb.size()>=25)
			{
				textField_22 = new JTextField( pcb.get(23).getWeight() + pcb.get(23).toString());
				textField_22.setBounds(114, 106, 86, 24);
				contentPane.add(textField_22);
				textField_22.setColumns(10);
			}
			if(pcb.size()>=26)
			{
				textField_23 = new JTextField( pcb.get(24).getWeight() + pcb.get(24).toString());
				textField_23.setBounds(114, 129, 86, 24);
				contentPane.add(textField_23);
				textField_23.setColumns(10);
			}
			if(pcb.size()>=27)
			{
				textField_24 = new JTextField( pcb.get(25).getWeight() + pcb.get(25).toString());
				textField_24.setBounds(114, 155, 86, 24);
				contentPane.add(textField_24);
				textField_24.setColumns(10);
			}
			if(pcb.size()>=28)
			{
				textField_25 = new JTextField( pcb.get(26).getWeight() + pcb.get(26).toString());
				textField_25.setBounds(114, 177, 86, 24);
				contentPane.add(textField_25);
				textField_25.setColumns(10);
			}
			if(pcb.size()>=29)
			{
				textField_26 = new JTextField( pcb.get(27).getWeight() + pcb.get(27).toString());
				textField_26.setBounds(114, 202, 86, 24);
				contentPane.add(textField_26);
				textField_26.setColumns(10);
			}
			if(pcb.size()>=30)
			{
				textField_27 = new JTextField( pcb.get(28).getWeight() + pcb.get(28).toString());
				textField_27.setBounds(14, 13, 86, 24);
				contentPane.add(textField_27);
				textField_27.setColumns(10);
			}
			if(pcb.size()>=31)
			{
				textField_28 = new JTextField( pcb.get(29).getWeight() + pcb.get(29).toString());
				textField_28.setBounds(14, 37, 86, 24);
				contentPane.add(textField_28);
				textField_28.setColumns(10);
			}
			if(pcb.size()>=32)
			{
				textField_29 = new JTextField( pcb.get(30).getWeight() + pcb.get(30).toString());
				textField_29.setBounds(14, 59, 86, 24);
				contentPane.add(textField_29);
				textField_29.setColumns(10);
			}
			if(pcb.size()>=33)
			{
				textField_30 = new JTextField( pcb.get(31).getWeight() + pcb.get(31).toString());
				textField_30.setBounds(14, 82, 86, 24);
				contentPane.add(textField_30);
				textField_30.setColumns(10);
			}
			if(pcb.size()>=34)
			{
				textField_31 = new JTextField( pcb.get(32).getWeight() + pcb.get(32).toString());
				textField_31.setBounds(14, 106, 86, 24);
				contentPane.add(textField_31);
				textField_31.setColumns(10);
			}
			if(pcb.size()>=35)
			{
				textField_32 = new JTextField( pcb.get(33).getWeight() + pcb.get(33).toString());
				textField_32.setBounds(14, 129, 86, 24);
				contentPane.add(textField_32);
				textField_32.setColumns(10);
			}
			if(pcb.size()>=36)
			{
				textField_33 = new JTextField( pcb.get(34).getWeight() + pcb.get(34).toString());
				textField_33.setBounds(14, 155, 86, 24);
				contentPane.add(textField_33);
				textField_33.setColumns(10);
			}
			if(pcb.size()>=37)
			{
				textField_34 = new JTextField(pcb.get(35).toString() + pcb.get(35).getWeight());
				textField_34.setBounds(14, 177, 86, 24);
				contentPane.add(textField_34);
				textField_34.setColumns(10);
			}
			if(pcb.size()>=38)
			{
				textField_35 = new JTextField( pcb.get(36).getWeight() + pcb.get(36).toString());
				textField_35.setBounds(14, 202, 86, 24);
				contentPane.add(textField_35);
				textField_35.setColumns(10);
			}
		}
}


