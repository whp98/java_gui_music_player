package someOrdinaryThoughts;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;

import javax.swing.JFrame;

/*
 * 本文件用于图形化界面的生成
 */
public class GuiMusicPlayer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1709982380975022807L;
	MusicTest mt = new MusicTest();

	public GuiMusicPlayer() {
		
		JButton jb1 = new JButton("打开文件");
		JButton jb2 = new JButton("暂停");
		JButton jb3 = new JButton("继续");
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mt.selectFile();
				mt.start(true);
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mt.stop();
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mt.continues();
			}
		});
		
		add(jb1,BorderLayout.NORTH);
		add(jb2,BorderLayout.WEST);
		add(jb3,BorderLayout.CENTER);
		}

	public void Start() {
		// 创建程序的主窗口
		GuiMusicPlayer frame1 = new GuiMusicPlayer();
		frame1.setTitle("音乐播放器");
		frame1.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				mt.stop();
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(300, 200);
		frame1.setVisible(true);
	}
}