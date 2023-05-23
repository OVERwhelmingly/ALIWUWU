package Main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import Sign_up.Sign_up;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Main {

	protected Shell shell;
	private Text text_username;
	private Text text_password;
	private Label label;

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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Jerry\\Desktop\\Java\\Hotel_Management_System\\Hotel.jpg"));
		shell.setSize(907, 744);
		shell.setText("SWT Application");
		
		Label lblWelcomeToHotel = new Label(shell, SWT.NONE);
		lblWelcomeToHotel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.BOLD));
		lblWelcomeToHotel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblWelcomeToHotel.setAlignment(SWT.CENTER);
		lblWelcomeToHotel.setBounds(32, 29, 841, 59);
		lblWelcomeToHotel.setText("Welcome to Hotel Management System!");
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblUsername.setAlignment(SWT.CENTER);
		lblUsername.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblUsername.setBounds(160, 300, 150, 40);
		lblUsername.setText("Username:");
		
		text_username = new Text(shell, SWT.BORDER);
		text_username.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		text_username.setBounds(350, 300, 300, 40);
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setAlignment(SWT.CENTER);
		lblPassword.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPassword.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblPassword.setBounds(160, 380, 150, 40);
		lblPassword.setText("Password:");
		
		text_password = new Text(shell, SWT.BORDER);
		text_password.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL | SWT.PASSWORD));
		text_password.setBounds(350, 380, 300, 40);
		
		Button power = new Button(shell, SWT.CHECK);
		power.setAlignment(SWT.CENTER);
		power.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String username = text_username.getText();
				String password = text_password.getText();
			}
		});
		power.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.BOLD));
		power.setBounds(238, 450, 401, 40);
		power.setText("I agree to the service protocol!");
		
		Button log_in = new Button(shell, SWT.NONE);
		log_in.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String username = text_username.getText();
				String password = text_password.getText();
				if (power.getSelection() == true) {  // have power
					if (username.equalsIgnoreCase("1") && password.equalsIgnoreCase("1")) {
						label.setText("Log in Scuess!");
						shell.dispose();
						Index window = new Index();
						window.open();
					}
					else {
						label.setText("Your username or password is wrong!");
						text_username.setText("");
						text_password.setText("");
					}
				}
				else {
					label.setText("Please check your protocol!");
				}
			}
		});
		log_in.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		log_in.setBounds(225, 578, 150, 40);
		log_in.setText("Log in");
		
		Button sign_up = new Button(shell, SWT.NONE);
		sign_up.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Sign_up window = new Sign_up();
				window.open();
			}
		});
		sign_up.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		sign_up.setBounds(500, 578, 150, 40);
		sign_up.setText("Sign up");
		
		Button Main_picture = new Button(shell, SWT.NONE);
		Main_picture.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		Main_picture.setImage(SWTResourceManager.getImage("C:\\Users\\Jerry\\Desktop\\Java\\Hotel_Management_System\\Hotel.jpg"));
		Main_picture.setBounds(259, 100, 409, 167);
		Main_picture.setText("New Button");
		
		label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.BOLD));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label.setAlignment(SWT.CENTER);
		label.setBounds(172, 509, 547, 53);

	}
}
