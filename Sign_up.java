package Main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Sign_up {

	protected Shell shell;
	private Text text_username;
	private Text text_password;
	private Text text_confirmed_password;
	private Label label;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Sign_up window = new Sign_up();
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
		shell.setSize(890, 667);
		shell.setText("SWT Application");
		
		Label lblPleaseSignUp = new Label(shell, SWT.NONE);
		lblPleaseSignUp.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPleaseSignUp.setAlignment(SWT.CENTER);
		lblPleaseSignUp.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 16, SWT.BOLD));
		lblPleaseSignUp.setBounds(107, 32, 686, 53);
		lblPleaseSignUp.setText("Please Sign up your account!");
		
		Label lblUsername = new Label(shell, SWT.NONE);
		lblUsername.setText("Username:");
		lblUsername.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblUsername.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblUsername.setAlignment(SWT.CENTER);
		lblUsername.setBounds(204, 137, 150, 40);
		
		text_username = new Text(shell, SWT.BORDER);
		text_username.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		text_username.setBounds(394, 137, 300, 40);
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setText("Password:");
		lblPassword.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblPassword.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPassword.setAlignment(SWT.CENTER);
		lblPassword.setBounds(204, 217, 150, 40);
		
		text_password = new Text(shell, SWT.BORDER);
		text_password.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL | SWT.PASSWORD));
		text_password.setBounds(394, 217, 300, 40);
		
		Label lblConfirmedpassword = new Label(shell, SWT.NONE);
		lblConfirmedpassword.setText("Confirmed Password:");
		lblConfirmedpassword.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblConfirmedpassword.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblConfirmedpassword.setAlignment(SWT.CENTER);
		lblConfirmedpassword.setBounds(57, 300, 317, 40);
		
		text_confirmed_password = new Text(shell, SWT.BORDER);
		text_confirmed_password.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL | SWT.PASSWORD));
		text_confirmed_password.setBounds(394, 297, 300, 40);
		
		Button power = new Button(shell, SWT.CHECK);
		power.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		power.setText("I agree to the service protocol!");
		power.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.BOLD));
		power.setBounds(262, 373, 356, 40);
		
		Button sign_up = new Button(shell, SWT.NONE);
		sign_up.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String username = text_username.getText();
				String password = text_password.getText();
				String confirmed_password = text_confirmed_password.getText();
				if (power.getSelection() == true) {  // have power
					if (password.equalsIgnoreCase("1")) {
						label.setText("Sign up Success!");
					}
					else {
						label.setText("Your password is wrong!");
						text_password.setText("");
						text_confirmed_password.setText("");
					}
				}
				else {
					label.setText("Please check your protocol!");
				}
				
			}
		});
		sign_up.setText("Sign up");
		sign_up.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		sign_up.setBounds(239, 526, 150, 40);
		
		label = new Label(shell, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.BOLD));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label.setBounds(237, 444, 401, 53);
		
		Button Exit = new Button(shell, SWT.NONE);
		Exit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				Main window = new Main();
				window.open();
			}
		});
		Exit.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		Exit.setBounds(520, 526, 150, 40);
		Exit.setText("Exit");

	}

}
