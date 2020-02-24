package someOrdinaryThoughts;

import java.io.File;

import javax.swing.JFileChooser;

/*
 * 本文件仅用选择文件并获取路径
 */
public class FileSelctor {
	public String s() {
		JFileChooser jf = new JFileChooser();
		jf.showOpenDialog(jf);// 显示打开的文件对话框
		File f = jf.getSelectedFile();// 使用文件类获取选择器选择的文件
		String s = f.getAbsolutePath();// 返回路径名
		return s;// 调用方法时返回路径
	}
}
