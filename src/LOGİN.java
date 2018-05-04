import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import java.sql.*;

import javax.swing.JOptionPane;

public class LOGÝN {

	protected Shell shlGiriEkran;
	private Text Pass;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LOGÝN window = new LOGÝN();
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
		shlGiriEkran.open();
		shlGiriEkran.layout();
		while (!shlGiriEkran.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlGiriEkran = new Shell();
		shlGiriEkran.setSize(483, 663);
		shlGiriEkran.setText("G\u0130R\u0130\u015E EKRANI");
		
		Label lblNewLabel = new Label(shlGiriEkran, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\users-group (1).png"));
		lblNewLabel.setBounds(10, 27, 443, 298);
		
		Pass = new Text(shlGiriEkran, SWT.BORDER);
		Pass.setBounds(28, 343, 323, 45);
		
		Button btn1 = new Button(shlGiriEkran, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"1");
			}
		});
		btn1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn1.setBounds(28, 395, 75, 62);
		btn1.setText("1");
		
		Button btn2 = new Button(shlGiriEkran, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"2");
			}
		});
		btn2.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn2.setText("2");
		btn2.setBounds(114, 395, 75, 62);
		
		Button btn3 = new Button(shlGiriEkran, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"3");
			}
		});
		btn3.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn3.setText("3");
		btn3.setBounds(195, 394, 75, 62);
		
		Button btn4 = new Button(shlGiriEkran, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"4");
			}
		});
		btn4.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn4.setText("4");
		btn4.setBounds(28, 463, 75, 62);
		
		Button btn5 = new Button(shlGiriEkran, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"5");
			}
		});
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btn5.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn5.setText("5");
		btn5.setBounds(114, 463, 75, 62);
		
		Button btn6 = new Button(shlGiriEkran, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"6");
			}
		});
		btn6.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn6.setText("6");
		btn6.setBounds(195, 463, 75, 62);
		
		Button btn7 = new Button(shlGiriEkran, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"7");
			}
		});
		btn7.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn7.setText("7");
		btn7.setBounds(28, 531, 75, 62);
		
		Button btn8 = new Button(shlGiriEkran, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"8");
			}
		});
		btn8.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn8.setText("8");
		btn8.setBounds(114, 531, 75, 62);
		
		Button btn9 = new Button(shlGiriEkran, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"9");
			}
		});
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btn9.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn9.setText("9");
		btn9.setBounds(195, 531, 75, 62);
		
		Button btn0 = new Button(shlGiriEkran, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Pass.setText(Pass.getText()+"0");
			}
		});
		btn0.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btn0.setText("0");
		btn0.setBounds(276, 395, 75, 62);
		
		Button btnC = new Button(shlGiriEkran, SWT.NONE);
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String back=null;
				if (Pass.getText().length()>0)
				{
					StringBuilder strB= new StringBuilder(Pass.getText());
					strB.deleteCharAt(Pass.getText().length()-1);
					back=strB.toString();
					Pass.setText(back);
				}
				
			}
		});
		btnC.setBackground(SWTResourceManager.getColor(255, 255, 51));
		btnC.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnC.setText("C");
		btnC.setBounds(276, 463, 75, 130);
		
		Button btnGiri = new Button(shlGiriEkran, SWT.NONE);
		btnGiri.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Statement stmt=conn.createStatement(); 
				String sql="Select * from users where userPassword='"+Pass.getText().toString()+"'";
				ResultSet rs=stmt.executeQuery(sql); 
				if(rs.next())
					JOptionPane.showMessageDialog(null, "Login Successfully");
				else	
					JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
				conn.close();
			}
			catch(Exception b) { System.out.print(b);
			}
				
			}
		});
		btnGiri.setBackground(SWTResourceManager.getColor(51, 153, 0));
		btnGiri.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnGiri.setText("G\u0130R\u0130\u015E");
		btnGiri.setBounds(363, 475, 75, 118);
		
		Button btnIptal = new Button(shlGiriEkran, SWT.NONE);
		btnIptal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				Pass.setText(" ");
			}
		});
		btnIptal.setText("\u0130PTAL");
		btnIptal.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnIptal.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnIptal.setBounds(363, 343, 75, 118);

	}
}
