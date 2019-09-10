package cn.neau.neaugame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/*
 * 飞机游戏的主窗口
 */
public class MyGameFrame extends JFrame{
	
	Image ball = GameUtil.getImage("images/ball.png");
	
	@Override
	public void paint(Graphics g) {  //自动被调用。 g相当于画笔
		Color c = g.getColor();  //保存画笔原始颜色
		Font f = g.getFont();  //保存画笔原始字体
		
		g.setColor(Color.blue);  //改变画笔颜色为蓝色
		g.drawLine(100, 100, 300, 300);  //画直线
		g.drawRect(100, 100, 300, 300); //矩形
		g.drawOval(100, 100, 300, 300);//椭圆
		g.fillRect(100, 100, 40, 40);//涂满图形
		
		g.setColor(Color.RED); //改变画笔颜色为红色
		g.setFont(new Font("宋体",Font.BOLD,50)); //指定画笔字体，粗体，大小
		g.drawString("我是谁", 200, 200);
		
		g.drawImage(ball, 250, 250,null);
		g.setColor(c); //是画笔变为初始颜色
		g.setFont(f);  //还原画笔原始字体
	}
	
	
	public void launchFrame() {
		this.setTitle("尚学堂飞机游戏");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter() { //点击窗口的X，程序关闭
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

}
