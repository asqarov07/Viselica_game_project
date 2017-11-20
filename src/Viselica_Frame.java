import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.Scanner;
import java.util.Random;
import javax.swing.*;

import com.sun.glass.events.MouseEvent;

@SuppressWarnings("restriction")
public class Viselica_Frame extends JFrame {
	
	private String  text="";
    private String[][] arrText=new String[100][2];
    String[] Star;
    int randomNumber=0;
    int g=0;
    int menWinLose=10;
    String player_answer="";
    
    Scanner sc=new Scanner(System.in);
	Random rdm=new Random();
	
	JPanel mainPanel;
	JPanel DPanel2,DPanel3,MPanel,MPanel2,MPanel3,MPanel4,MPanel5,MPanel6,MPanel7,MPanel8,MPanel9,MPanel10;
	JButton b1,butQ,butW,butE,butR,butT,butY,butU,butI,butO,butP,butA,butS,butD,butF,butG,butH,butJ,butK,butL,butZ,butX,butC,butV,butB,butN,butM,rePlay;
	JLabel star,question,WinLose;
	Image img = Toolkit.getDefaultToolkit().getImage("3.jpeg");
	Image kletka2 = Toolkit.getDefaultToolkit().getImage("kletka2.png");
	
	Viselica_Frame(){
		
		setSize(480,330);
		setTitle("Виселица");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(450, 150);
		setResizable(false);
		
		mainPanel=new DrawingPanel();
		mainPanel.setBounds(0, 0, 480, 290);
		mainPanel.setBackground(Color.RED);
		mainPanel.setLayout(null);
		
		DPanel2=new DrawingPanel2();
		DPanel2.setBounds(0, 0, 480, 290);
		DPanel2.setLayout(null);
		DPanel2.setVisible(false);
		
		DPanel3=new DrawingPanel3();
		DPanel3.setBounds(0, 0, 480, 290);
		DPanel3.setLayout(null);
		DPanel3.setVisible(false);

		MPanel=new DrawingMen();
		MPanel.setBounds(350, 50, 100, 100);
		MPanel.setLayout(null);
		MPanel.setVisible(false);
		
		MPanel2=new DrawingMen2();
		MPanel2.setBounds(350, 50, 100, 100);
		MPanel2.setLayout(null);
		MPanel2.setVisible(false);
		
		MPanel3=new DrawingMen3();
		MPanel3.setBounds(350, 50, 100, 100);
		MPanel3.setLayout(null);
		MPanel3.setVisible(false);
		
		MPanel4=new DrawingMen4();
		MPanel4.setBounds(350, 50, 100, 100);
		MPanel4.setLayout(null);
		MPanel4.setVisible(false);
		
		MPanel5=new DrawingMen5();
		MPanel5.setBounds(350, 50, 100, 100);
		MPanel5.setLayout(null);
		MPanel5.setVisible(false);
		
		MPanel6=new DrawingMen6();
		MPanel6.setBounds(350, 50, 100, 100);
		MPanel6.setLayout(null);
		MPanel6.setVisible(false);
		
		MPanel7=new DrawingMen7();
		MPanel7.setBounds(350, 50, 100, 100);
		MPanel7.setLayout(null);
		MPanel7.setVisible(false);
		
		MPanel8=new DrawingMen8();
		MPanel8.setBounds(350, 50, 100, 100);
		MPanel8.setLayout(null);
		MPanel8.setVisible(false);
		
		MPanel9=new DrawingMen9();
		MPanel9.setBounds(350, 50, 100, 100);
		MPanel9.setLayout(null);
		MPanel9.setVisible(false);
		
		MPanel10=new DrawingMen10();
		MPanel10.setBounds(350, 50, 100, 100);
		MPanel10.setLayout(null);
		MPanel10.setVisible(false);
		
		b1=new JButton("Play");
		b1.setBounds(216, 121, 60, 25);
		rePlay=new JButton("Play");
		rePlay.setBounds(216, 160, 60, 25);
		
		butQ=new JButton("q");
		butQ.setBounds(15,155, 45, 45);
		butW=new JButton("w");
		butW.setBounds(60,155, 45, 45);
		butE=new JButton("e");
		butE.setBounds(105,155, 45, 45);
		butR=new JButton("r");
		butR.setBounds(150,155, 45, 45);
		butT=new JButton("t");
		butT.setBounds(195,155, 45, 45);
		butY=new JButton("y");
		butY.setBounds(240,155, 45, 45);
		butU=new JButton("u");
		butU.setBounds(285,155, 45, 45);
		butI=new JButton("i");
		butI.setBounds(330,155, 45, 45);
		butO=new JButton("o");
		butO.setBounds(375,155, 45, 45);
		butP=new JButton("p");
		butP.setBounds(420,155, 45, 45);
		
		butA=new JButton("a");
		butA.setBounds(37,200, 45, 45);
		butS=new JButton("s");
		butS.setBounds(82,200, 45, 45);
		butD=new JButton("d");
		butD.setBounds(127,200, 45, 45);
		butF=new JButton("f");
		butF.setBounds(172,200, 45, 45);
		butG=new JButton("g");
		butG.setBounds(217,200, 45, 45);
		butH=new JButton("h");
		butH.setBounds(262,200, 45, 45);
		butJ=new JButton("j");
		butJ.setBounds(307,200, 45, 45);
		butK=new JButton("k");
		butK.setBounds(352,200, 45, 45);
		butL=new JButton("l");
		butL.setBounds(397,200, 45, 45);
		
		butZ=new JButton("z");
		butZ.setBounds(82,245, 45, 45);
		butX=new JButton("x");
		butX.setBounds(127,245, 45, 45);
		butC=new JButton("c");
		butC.setBounds(172,245, 45, 45);
		butV=new JButton("v");
		butV.setBounds(217,245, 45, 45);
		butB=new JButton("b");
		butB.setBounds(262,245, 45, 45);
		butN=new JButton("n");
		butN.setBounds(307,245, 45, 45);
		butM=new JButton("m");
		butM.setBounds(352,245, 45, 45);

		star=new JLabel();
		star.setBounds(0, 30, 300, 20);
		star.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		question=new JLabel();
		question.setBounds(0,0, 300, 20);
		question.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		WinLose=new JLabel();
		WinLose.setBounds(217,120, 300, 40);
		WinLose.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPanel.setVisible(false);
				DPanel2.setVisible(true);
				new Play();
			}
		});
		rePlay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Viselica_Frame vis =new Viselica_Frame();
			}
		});
		butQ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("q");
				butQ.setEnabled(false);
			}
		});
		butW.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("w");
				butW.setEnabled(false);
			}
		});
		butE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("e");
				butE.setEnabled(false);
			}
		});
		butR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("r");
				butR.setEnabled(false);
			}
		});
		butT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("t");
				butT.setEnabled(false);
			}
		});
		butY.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("y");
				butY.setEnabled(false);
			}
		});
		butU.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("u");
				butU.setEnabled(false);
			}
		});
		butI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("i");
				butI.setEnabled(false);
			}
		});
		butO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("o");
				butO.setEnabled(false);
			}
		});
		butP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("p");
				butP.setEnabled(false);
			}
		});
		butA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("a");
				butA.setEnabled(false);
			}
		});
		butS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("s");
				butS.setEnabled(false);
			}
		});
		butD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("d");
				butD.setEnabled(false);
			}
		});
		butF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("f");
				butF.setEnabled(false);
			}
		});
		butG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("g");
				butG.setEnabled(false);
			}
		});
		butH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("h");
				butH.setEnabled(false);
			}
		});
		butJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("j");
				butJ.setEnabled(false);
			}
		});
		butK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("k");
				butK.setEnabled(false);
			}
		});
		butL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("l");
				butL.setEnabled(false);
			}
		});
		butZ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("z");
				butZ.setEnabled(false);
			}
		});
		butX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("x");
				butX.setEnabled(false);
			}
		});
		butC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("c");
				butC.setEnabled(false);
			}
		});
		butV.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("v");
				butV.setEnabled(false);
			}
		});
		butB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("b");
				butB.setEnabled(false);
			}
		});
		butN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("n");
				butN.setEnabled(false);
			}
		});
		butM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Player_step("m");
				butM.setEnabled(false);
			}
		});
		mainPanel.add(b1);
		
		add(mainPanel);
		add(DPanel2);
		add(DPanel3);
		
		
		DPanel2.add(butQ);
		DPanel2.add(butW);
		DPanel2.add(butE);
		DPanel2.add(butR);
		DPanel2.add(butT);
		DPanel2.add(butY);
		DPanel2.add(butU);
		DPanel2.add(butI);
		DPanel2.add(butO);
		DPanel2.add(butP);
		DPanel2.add(butA);
		DPanel2.add(butS);
		DPanel2.add(butD);
		DPanel2.add(butF);
		DPanel2.add(butG);
		DPanel2.add(butH);
		DPanel2.add(butJ);
		DPanel2.add(butK);
		DPanel2.add(butL);
		DPanel2.add(butZ);
		DPanel2.add(butX);
		DPanel2.add(butC);
		DPanel2.add(butV);
		DPanel2.add(butB);
		DPanel2.add(butN);
		DPanel2.add(butM);
		
		DPanel2.add(star);
		DPanel2.add(MPanel); DPanel2.add(MPanel2); DPanel2.add(MPanel3); DPanel2.add(MPanel4); DPanel2.add(MPanel5); DPanel2.add(MPanel6); DPanel2.add(MPanel7);
		DPanel2.add(MPanel8); DPanel2.add(MPanel9); DPanel2.add(MPanel10);
		DPanel2.add(question);
		
		DPanel3.add(WinLose);
		DPanel3.add(rePlay);
		setVisible(true);
		
	}
	
	class DrawingPanel extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.drawImage(img, 0, 0, 480, 290,this);
		}
	}
	
	class DrawingPanel2 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.drawImage(kletka2, 0, 0, 480, 290,this);
		}
	}
	
	class DrawingPanel3 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.drawImage(kletka2, 0, 0, 480, 290,this);
		}
	}

	class DrawingMen extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(5,90, 60, 90);
		}
	}
	class DrawingMen2 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(15,90, 15, 20);
		}
	}
	class DrawingMen3 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(0, 20, 80, 20);
		}
	}
	class DrawingMen4 extends JPanel{

		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 20, 60, 40);
		}
	}
	class DrawingMen5 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.fillOval(55, 40, 10, 10);
		}
	}
	class DrawingMen6 extends JPanel{
		
		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 50, 60, 70);
		}
	}
	class DrawingMen7 extends JPanel{

		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 55, 40, 65);
		}
	}
	class DrawingMen8 extends JPanel{

		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 55, 80, 65);
		}
	}
	class DrawingMen9 extends JPanel{

		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 70, 40, 80);
		}
	}
	class DrawingMen10 extends JPanel{

		public void paintComponent(Graphics gr) {
			gr.setColor(Color.black);
			gr.drawLine(60, 70, 80, 80);
		}
	}
	
	class Play implements Runnable{
		Play(){
			new Thread(this).start();
		}

		@Override
		public void run() {
			
			FileInputStream fin;
			
			try {
				
				fin = new FileInputStream("text.txt");
				BufferedReader br= new BufferedReader(new InputStreamReader(fin)); 
			
				while(true) {
					try {
					
						text=br.readLine();
						arrText[g]=text.split(",");
						g++;
					
					}catch (Exception e) {
						break;
					}
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			randomNumber=rdm.nextInt(g);
			question.setText("Question: "+arrText[randomNumber][0]+" ?");
			Star=new String [arrText[randomNumber][1].length()];
			
			for(int i=0;i<arrText[randomNumber][1].length();i++) {
				Star[i]="*";
			}
			for(int i=0;i<arrText[randomNumber][1].length();i++) {
				star.setText(star.getText()+Star[i]);
			}
			
		}
	}
	
	class Player_step{
		Player_step(String player_answer){
			
			int menChar=0;
			
			//while(menWinLose>0) {
					
				int menStar=0;
				for(int i=0; i<arrText[randomNumber][1].length();i++) {
					
					if(player_answer.equalsIgnoreCase(arrText[randomNumber][1].substring(i, i+1))) {
						menChar--;
						Star[i]=arrText[randomNumber][1].substring(i, i+1);										
					}else if(!(player_answer.equalsIgnoreCase(arrText[randomNumber][1].substring(i, i+1)))) {
						WinLose.setText("");
						menStar++;
						if(menStar==arrText[randomNumber][1].length()) {
							menWinLose--;
							if(menWinLose==9) {
								MPanel.setVisible(true);
							}else if(menWinLose==8) {
								MPanel2.setVisible(true);
							}else if(menWinLose==7) {
								MPanel3.setVisible(true);
							}else if(menWinLose==6) {
								MPanel4.setVisible(true);
							}else if(menWinLose==5) {
								MPanel5.setVisible(true);
							}else if(menWinLose==4) {
								MPanel6.setVisible(true);
							}else if(menWinLose==3) {
								MPanel7.setVisible(true);
							}else if(menWinLose==2) {
								MPanel8.setVisible(true);
							}else if(menWinLose==1) {
								MPanel9.setVisible(true);
							}else if(menWinLose==0) {
								MPanel10.setVisible(true);
							}							
						}
					}
				}
				star.setText("");
				for(int s=0;s<arrText[randomNumber][1].length();s++) {
					star.setText(star.getText()+Star[s]);
					if((star.getText()).equalsIgnoreCase(arrText[randomNumber][1])) {
						DPanel3.setVisible(true);
						DPanel2.setVisible(false);
						WinLose.setText("Win");
						break;
					}
					else if(menWinLose==0) {
						DPanel3.setVisible(true);
						DPanel2.setVisible(false);
						WinLose.setText("Lose");
						break;
					}
				}
		}
	}
	
	
	
	public static void main(String[] args) {
		Viselica_Frame vis =new Viselica_Frame();
	}

}
