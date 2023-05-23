package Main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class Index {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Index window = new Index();
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shell.setSize(938, 617);
		shell.setText("SWT Application");
		
		Label lblWelcomeToHotel = new Label(shell, SWT.NONE);
		lblWelcomeToHotel.setText("Your comfortable home");
		lblWelcomeToHotel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.BOLD));
		lblWelcomeToHotel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblWelcomeToHotel.setAlignment(SWT.CENTER);
		lblWelcomeToHotel.setBounds(31, 152, 841, 59);
		
		Button Main_picture = new Button(shell, SWT.NONE);
		Main_picture.setText("New Button");
		Main_picture.setImage(SWTResourceManager.getImage("C:\\Users\\Jerry\\Desktop\\Java\\Hotel_Management_System\\Hotel.jpg"));
		Main_picture.setBounds(258, 236, 409, 167);

	}
}
