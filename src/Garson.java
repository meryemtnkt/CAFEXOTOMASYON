import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Garson {

	protected Shell shlGarsonMasa;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Garson window = new Garson();
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
		shlGarsonMasa.open();
		shlGarsonMasa.layout();
		while (!shlGarsonMasa.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlGarsonMasa = new Shell();
		shlGarsonMasa.setSize(1418, 713);
		shlGarsonMasa.setText("GARSON / MASA S\u0130PAR\u0130\u015E");
		
		Group group = new Group(shlGarsonMasa, SWT.NONE);
		group.setText("MEN\u00DC");
		group.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		group.setBounds(20, 95, 285, 447);
		
		Button button = new Button(group, SWT.NONE);
		button.setText("    FASTFOOD");
		button.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\hamburger.png"));
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button.setBackground(SWTResourceManager.getColor(50, 205, 50));
		button.setBounds(33, 34, 225, 74);
		
		Button button_1 = new Button(group, SWT.NONE);
		button_1.setText("   TATLILAR");
		button_1.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\muffin.png"));
		button_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_1.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		button_1.setBounds(33, 114, 225, 74);
		
		Button button_2 = new Button(group, SWT.NONE);
		button_2.setText("  DONDURMA");
		button_2.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\ice-cream.png"));
		button_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_2.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_2.setBackground(SWTResourceManager.getColor(255, 204, 51));
		button_2.setBounds(33, 194, 225, 74);
		
		Button button_3 = new Button(group, SWT.NONE);
		button_3.setText("SICAK \u0130\u00C7ECEKLER");
		button_3.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cup (1).png"));
		button_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_3.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_3.setBackground(SWTResourceManager.getColor(255, 51, 51));
		button_3.setBounds(33, 274, 225, 74);
		
		Button button_4 = new Button(group, SWT.NONE);
		button_4.setText("SO\u011EUK \u0130\u00C7ECEKLER");
		button_4.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cola (2).png"));
		button_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_4.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_4.setBackground(SWTResourceManager.getColor(0, 102, 204));
		button_4.setBounds(33, 354, 225, 74);
		
		Button button_5 = new Button(shlGarsonMasa, SWT.NONE);
		button_5.setText("    MASA 41");
		button_5.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\dining-table (1).png"));
		button_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_5.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_5.setBackground(SWTResourceManager.getColor(255, 102, 0));
		button_5.setAlignment(SWT.LEFT);
		button_5.setBounds(10, 26, 285, 43);
		
		Group group_1 = new Group(shlGarsonMasa, SWT.NONE);
		group_1.setText("MEN\u00DC \u0130\u00C7ER\u0130K");
		group_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		group_1.setBounds(311, 95, 336, 447);
		
		Group group_2 = new Group(shlGarsonMasa, SWT.NONE);
		group_2.setText("S\u0130PAR\u0130\u015ELER");
		group_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		group_2.setBounds(653, 95, 336, 447);
		
		Label label = new Label(shlGarsonMasa, SWT.NONE);
		label.setText("Garson");
		label.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		label.setBounds(729, 46, 70, 20);
		
		text = new Text(shlGarsonMasa, SWT.BORDER);
		text.setBounds(837, 43, 135, 26);
		
		Button button_6 = new Button(shlGarsonMasa, SWT.NONE);
		button_6.setText(" GER\u0130 D\u00D6N");
		button_6.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\left (1).png"));
		button_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_6.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_6.setBackground(SWTResourceManager.getColor(255, 102, 0));
		button_6.setBounds(995, 26, 198, 43);
		
		Group group_3 = new Group(shlGarsonMasa, SWT.NONE);
		group_3.setText("ADET");
		group_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		group_3.setBounds(995, 95, 198, 287);
		
		Button button_7 = new Button(group_3, SWT.NONE);
		button_7.setText("C");
		button_7.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_7.setBounds(20, 237, 94, 40);
		
		Button button_8 = new Button(group_3, SWT.NONE);
		button_8.setText("1");
		button_8.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_8.setBounds(20, 99, 44, 40);
		
		text_1 = new Text(group_3, SWT.BORDER);
		text_1.setBounds(20, 43, 144, 40);
		
		Button button_9 = new Button(group_3, SWT.NONE);
		button_9.setText("2");
		button_9.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_9.setBounds(70, 99, 44, 40);
		
		Button button_10 = new Button(group_3, SWT.NONE);
		button_10.setText("3");
		button_10.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_10.setBounds(120, 99, 44, 40);
		
		Button button_11 = new Button(group_3, SWT.NONE);
		button_11.setText("4");
		button_11.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_11.setBounds(20, 145, 44, 40);
		
		Button button_12 = new Button(group_3, SWT.NONE);
		button_12.setText("5");
		button_12.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_12.setBounds(70, 145, 44, 40);
		
		Button button_13 = new Button(group_3, SWT.NONE);
		button_13.setText("6");
		button_13.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_13.setBounds(120, 145, 44, 40);
		
		Button button_14 = new Button(group_3, SWT.NONE);
		button_14.setText("7");
		button_14.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_14.setBounds(20, 191, 44, 40);
		
		Button button_15 = new Button(group_3, SWT.NONE);
		button_15.setText("8");
		button_15.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_15.setBounds(70, 191, 44, 40);
		
		Button button_16 = new Button(group_3, SWT.NONE);
		button_16.setText("9");
		button_16.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_16.setBounds(120, 191, 44, 40);
		
		Button button_17 = new Button(group_3, SWT.NONE);
		button_17.setText("0");
		button_17.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_17.setBounds(120, 237, 44, 40);
		
		Button button_18 = new Button(shlGarsonMasa, SWT.NONE);
		button_18.setText(" Sipari\u015F Onay");
		button_18.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\ok-mark (1).png"));
		button_18.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_18.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_18.setBackground(SWTResourceManager.getColor(51, 153, 0));
		button_18.setBounds(995, 407, 198, 59);
		
		Button button_19 = new Button(shlGarsonMasa, SWT.NONE);
		button_19.setText(" Sipari\u015F \u0130ptal");
		button_19.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cancel"));
		button_19.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_19.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button_19.setBackground(SWTResourceManager.getColor(255, 0, 0));
		button_19.setBounds(995, 483, 198, 59);
		
		Button btnAdisyonkart = new Button(shlGarsonMasa, SWT.NONE);
		btnAdisyonkart.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\103514-32.png"));
		btnAdisyonkart.setText("  Adisyon Yazd\u0131r");
		btnAdisyonkart.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnAdisyonkart.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnAdisyonkart.setBackground(SWTResourceManager.getColor(102, 205, 170));
		btnAdisyonkart.setBounds(653, 555, 336, 78);

	}

}
