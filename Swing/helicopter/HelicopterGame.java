import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.applet.*;

class HelicopterGame implements KeyListener{
	
	JFrame win = new JFrame();
	Container con = win.getContentPane();
	JLabel score = new JLabel();
	
	HelicopterSound sound = new HelicopterSound();
	Background background = new Background();
	
	ImageIcon helicopterIcon = new ImageIcon("helicopter.gif");
	//ImageIcon backgroundIcon = new ImageIcon("night.jpg");

	ImageIcon backgroundIcon1 = new ImageIcon("night1.jpg");
	ImageIcon backgroundIcon2 = new ImageIcon("night2.jpg");
	ImageIcon backgroundIcon3 = new ImageIcon("night3.jpg");
	ImageIcon backgroundIcon4 = new ImageIcon("night4.jpg");
	ImageIcon backgroundIcon5 = new ImageIcon("night5.jpg");
	
	ImageIcon explodedGIF = new ImageIcon("explosion.gif");
	
	ImageIcon heroMissileIcon = new ImageIcon("animatedfire.gif");//("heroMissile.png");
	JLabel heroMissile = new JLabel(heroMissileIcon);
			
	ImageIcon enemyHelicopterGIF = new ImageIcon("enemyHeli2.gif");
	JLabel enemyHelicopter = new JLabel(enemyHelicopterGIF);
	
	ImageIcon enemyMissileIcon = new ImageIcon("enemyMissile.png");
	JLabel enemyMissile = new JLabel(enemyMissileIcon);
	
	JLabel helicopter = new JLabel(helicopterIcon);
	
	JLabel background1 = new JLabel(backgroundIcon1);
	JLabel background2 = new JLabel(backgroundIcon2);
	JLabel background3 = new JLabel(backgroundIcon3);
	JLabel background4 = new JLabel(backgroundIcon4);
	JLabel background5 = new JLabel(backgroundIcon5);
	
	int left = 0,top = 100;
	int left1 = 0, left2 = 1300, left3 = 2600, left4 = 3900, left5 = 5200;
	int speedIncreased, speedDecreased;
	
	int leftOfEnemyHelicopter;
	int topOfEnemyHelicopter;
			
	boolean missileHitHero = false;
	boolean missileHitEnemy = false;
	
	
	class HelicopterSound extends Thread
	{
		public void run()
		{
			try
			{
				File f = new File("heli.wav");
				URL urlOfAudio = f.toURL();
				AudioClip clip = Applet.newAudioClip(urlOfAudio);
				clip.loop();
				//Thread.sleep(10);
			}catch (Exception e){}
		}
	}
		
	class Background extends Thread
	{
		public void run()
		{
			
			while(true)
			{
				try{
					
						left1-- ;
						left2-- ;
						left3-- ; 
						left4-- ; 
						left5-- ; 
						
						if(left1 == -1300)
							left1 = 5200;
						
						if(left2 == -1300)
							left2 = 5200;
						
						if(left3 == -1300)
							left3 = 5200;
						
						if(left4 == -1300)
							left4 = 5200;
						
						if(left5 == -1300)
							left5 = 5200;
						
						background1.setLocation(left1,0);
						background2.setLocation(left2,0);
						background3.setLocation(left3,0);
						background4.setLocation(left4,0);
						background5.setLocation(left5,0);
				
						Thread.sleep(10);
				} catch(Exception e){}
			}
		}
	}
	
	class Fire extends Thread
	{
		public void run()
		{
			int leftOfMissile = left+200;
			int topOfMissile = top+100;
			//con.add(heroMissile,1);
			heroMissile.setIcon(heroMissileIcon);
			
			heroMissile.setBounds(leftOfMissile,topOfMissile,130,80);
			
				try{
					for( int i = leftOfMissile ; leftOfMissile < (win.getWidth() - 130) ; leftOfMissile++, i++ )
					{
						Thread.sleep(5);
						heroMissile.setLocation(leftOfMissile,topOfMissile);
							
						if( (i <= enemyHelicopter.getWidth() + enemyHelicopter.getX() ) && (i + heroMissile.getWidth() >= enemyHelicopter.getX() ) &&
						( enemyHelicopter.getY() + enemyHelicopter.getHeight() - 50 > heroMissile.getY() ) && ( enemyHelicopter.getY() + 50 < heroMissile.getY() + heroMissile.getHeight() ))
						{
							enemyHelicopter.setIcon(explodedGIF);
							heroMissile.setIcon(null);
							Thread.sleep(100);
							enemyHelicopter.setIcon(enemyHelicopterGIF);
							
							leftOfEnemyHelicopter = win.getWidth();
							topOfEnemyHelicopter = top + 15 + (int) (Math.random() * 20) ;
							enemyHelicopter.setLocation(leftOfEnemyHelicopter,topOfEnemyHelicopter);
						}
					}
					//Thread.sleep(2);
					
					heroMissile.setLocation(-200,0);

				} catch (Exception e) {
					
				}
		}
	}
	
	class EnemyHelicopter extends Thread
	{
		public void run()
		{
			leftOfEnemyHelicopter = win.getWidth() - 100;
			topOfEnemyHelicopter = top + 15 + (int) (Math.random() * 15);
			
			double changeInTopOfEnemy = 0.1;
			
			enemyHelicopter.setBounds(leftOfEnemyHelicopter,topOfEnemyHelicopter,200,200);
			
			while(true)
			{
				
				try{
					for( ; leftOfEnemyHelicopter > - 200 ; leftOfEnemyHelicopter-- )
					{
						enemyHelicopter.setLocation(leftOfEnemyHelicopter,topOfEnemyHelicopter);
						
						changeInTopOfEnemy += 0.2;
						
							if( topOfEnemyHelicopter < top)
							{
								topOfEnemyHelicopter = topOfEnemyHelicopter + (int) ( changeInTopOfEnemy ) ;
							}
							
							if( topOfEnemyHelicopter > top)
							{
								topOfEnemyHelicopter = topOfEnemyHelicopter - (int) ( changeInTopOfEnemy );
							}
							
							if( changeInTopOfEnemy >= 1)
									changeInTopOfEnemy = 0;
							
							if( ( topOfEnemyHelicopter == top ) && (leftOfEnemyHelicopter >= left) )
								{
									new EnemyFire().start();
									Thread.sleep(1000);
								}
		
							win.setTitle("top = " + topOfEnemyHelicopter + ", left = " + leftOfEnemyHelicopter );
							
							Thread.sleep(8);
					}
					Thread.sleep(1500);
					
					leftOfEnemyHelicopter = win.getWidth() - 50;
					topOfEnemyHelicopter = top + 15 + (int) (Math.random() * 15);
					
					}catch (Exception e) {}
				
			}
		}
	}
	
	class EnemyFire extends Thread
	{
		public void run()
		{
			int leftOfEnemyMissile = leftOfEnemyHelicopter - 200;
			int topOfEnemyMissile = topOfEnemyHelicopter + 100;
			
			enemyMissile.setIcon(enemyMissileIcon);
			
			enemyMissile.setBounds(leftOfEnemyMissile, topOfEnemyMissile, 100,50);
			try{
				for(int i = leftOfEnemyMissile ; leftOfEnemyMissile >= - 100; leftOfEnemyMissile--,i-- )
				{
					enemyMissile.setLocation(leftOfEnemyMissile,topOfEnemyMissile);
					Thread.sleep(5);
					
					if( (i <= helicopter.getWidth() + helicopter.getX() ) && (i + enemyMissile.getWidth() >= helicopter.getX() ) &&
					  (helicopter.getY() + helicopter.getHeight() - 50 > enemyMissile.getY() ) && (helicopter.getY() + 50 < enemyMissile.getY() + enemyMissile.getHeight() ))
						{
							left = (int) Math.random() * 100 ;
							enemyMissile.setIcon(null);
							helicopter.setIcon(explodedGIF);
							Thread.sleep(100);
							top = (int) Math.random() * 500;
							helicopter.setIcon(helicopterIcon);
							helicopter.setLocation(left,top);
						}
				}
				Thread.sleep(50);
			}catch (Exception e) {}
		}
	}
	
	HelicopterGame()
	{
		win.setBounds(50,5,1300,700);
		
		score.setBounds(300,400,50,50);
		helicopter.setBounds(left,top,350,180);
		
		background1.setBounds(left1,0,1300,700);
		background2.setBounds(left2,0,1300,700);
		background3.setBounds(left3,0,1300,700);
		background4.setBounds(left4,0,1300,700);
		background5.setBounds(left5,0,1300,700);
		
		sound.start();
		
		background.start();
		
		new EnemyHelicopter().start();
		
		con.setLayout(null);
		
		con.add(helicopter);
		con.add(enemyMissile);
		
		con.add(score);
		
		con.add(enemyHelicopter);
		
		con.add(heroMissile);
		
		con.add(background1);
		con.add(background2);
		con.add(background3);
		con.add(background4);
		con.add(background5);
		
		win.setResizable(false);
		win.addKeyListener(this);
		win.show();
	}

	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		
		if( code == 32)
			new Fire().start();
		
		if(code == 37)
			left -= 5;		
		
		if(code == 39)
			left += 5;
		
		if(code == 38)
			top -= 5;
		
		if(code == 40)
			top += 5;
		
		if(left < -10)
			left = -10;
		
		if(left > 960)
			left = 960;
		
		if(top > 515 )
			top = 515;
		
		if(top < -65 )
			top = -65;
		
		helicopter.setLocation(left,top);
	//	win.setTitle("left = " + left + ", top = " + top);
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
	public static void main(String args[])
	{
		new HelicopterGame();
	}
}