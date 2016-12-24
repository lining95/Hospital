import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Button;

public class Main {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;
	private Text text_6;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(691, 465);
		shell.setText("\u533B\u751F\u5C31\u8BCA");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(26, 21, 67, 17);
		label.setText("\u533B\u751F\u5DE5\u4F5C\u53F7\uFF1A");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(99, 18, 99, 22);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(26, 229, 96, 17);
		lblNewLabel.setText("\u9009\u62E9\u67E5\u770B\u75C5\u4EBA\u540D\uFF1A");
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(22, 57, 119, 27);
		button.setText("\u67E5\u8BE2\u6240\u6709\u75C5\u4EBA\u4FE1\u606F");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(10, 90, 281, 120);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(127, 226, 78, 23);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(221, 224, 44, 27);
		button_1.setText("\u67E5\u8BE2");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(10, 263, 281, 131);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(375, 21, 61, 17);
		lblNewLabel_1.setText("\u5F00\u5904\u65B9\u836F\uFF1A");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(204, 16, 51, 27);
		btnNewButton.setText("\u767B\u5F55");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(375, 57, 44, 17);
		lblNewLabel_2.setText("\u836F\u54C1\u540D\uFF1A");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(426, 54, 109, 20);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(375, 193, 36, 17);
		lblNewLabel_3.setText("\u6570\u91CF\uFF1A");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(413, 187, 73, 23);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(541, 52, 51, 22);
		btnNewButton_1.setText("\u67E5\u8BE2");
		
		text_6 = new Text(shell, SWT.BORDER);
		text_6.setBounds(375, 90, 217, 91);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(375, 229, 80, 27);
		button_2.setText("\u751F\u6210\u836F\u5355");

	}
}
