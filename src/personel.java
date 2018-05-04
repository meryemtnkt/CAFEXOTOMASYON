import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class personel {

	protected Shell shlPersonelEkle;
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
			personel window = new personel();
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
		shlPersonelEkle.open();
		shlPersonelEkle.layout();
		while (!shlPersonelEkle.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlPersonelEkle = new Shell();
		shlPersonelEkle.setSize(713, 502);
		shlPersonelEkle.setText("PERSONEL EKLE");
		
		Label lblNewLabel = new Label(shlPersonelEkle, SWT.NONE);
		lblNewLabel.setBounds(55, 93, 70, 20);
		lblNewLabel.setText("AD ");
		
		Label lblNewLabel_1 = new Label(shlPersonelEkle, SWT.NONE);
		lblNewLabel_1.setBounds(55, 133, 70, 20);
		lblNewLabel_1.setText("SOYAD");
		
		text = new Text(shlPersonelEkle, SWT.BORDER);
		text.setBounds(155, 48, 176, 26);
		
		text_1 = new Text(shlPersonelEkle, SWT.BORDER);
		text_1.setBounds(155, 90, 176, 26);
		
		text_2 = new Text(shlPersonelEkle, SWT.BORDER);
		text_2.setBounds(155, 130, 176, 26);
		
		text_3 = new Text(shlPersonelEkle, SWT.BORDER);
		text_3.setBounds(155, 173, 176, 26);
		
		Label lblNewLabel_2 = new Label(shlPersonelEkle, SWT.NONE);
		lblNewLabel_2.setBounds(55, 51, 70, 20);
		lblNewLabel_2.setText("TC");
		
		Label lblNewLabel_3 = new Label(shlPersonelEkle, SWT.NONE);
		lblNewLabel_3.setBounds(55, 179, 70, 20);
		lblNewLabel_3.setText("TELEFON");
		
		text_4 = new Text(shlPersonelEkle, SWT.BORDER);
		text_4.setBounds(445, 214, 176, 26);
		
		text_5 = new Text(shlPersonelEkle, SWT.BORDER);
		text_5.setBounds(155, 214, 176, 91);
		
		text_6 = new Text(shlPersonelEkle, SWT.BORDER);
		text_6.setBounds(445, 280, 176, 26);
		
		Label lblEmail = new Label(shlPersonelEkle, SWT.NONE);
		lblEmail.setBounds(362, 217, 70, 20);
		lblEmail.setText("E-MA\u0130L");
		
		Label lblAdres = new Label(shlPersonelEkle, SWT.NONE);
		lblAdres.setBounds(55, 217, 70, 20);
		lblAdres.setText("ADRES");
		
		Label lblGrevi = new Label(shlPersonelEkle, SWT.NONE);
		lblGrevi.setBounds(362, 249, 70, 20);
		lblGrevi.setText("G\u00D6REV\u0130");
		
		Label lblifre = new Label(shlPersonelEkle, SWT.NONE);
		lblifre.setBounds(369, 285, 70, 20);
		lblifre.setText("\u015E\u0130FRE");
		
		Combo combo = new Combo(shlPersonelEkle, SWT.NONE);
		combo.setBounds(445, 246, 176, 28);
		
		Label label = new Label(shlPersonelEkle, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\if_Edit-Male-User_49585.png"));
		label.setBounds(362, 51, 259, 162);
		
		Button button = new Button(shlPersonelEkle, SWT.NONE);
		button.setText(" GER\u0130 D\u00D6N");
		button.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\left (1).png"));
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		button.setBackground(SWTResourceManager.getColor(255, 102, 0));
		button.setBounds(20, 326, 198, 59);
		
		Button btnKaydet = new Button(shlPersonelEkle, SWT.NONE);
		btnKaydet.setText(" KAYDET");
		btnKaydet.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\ok-mark (1).png"));
		btnKaydet.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnKaydet.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnKaydet.setBackground(SWTResourceManager.getColor(51, 153, 0));
		btnKaydet.setBounds(433, 326, 198, 59);
		
		Button btnNewButton = new Button(shlPersonelEkle, SWT.NONE);
		btnNewButton.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\eraser.png"));
		btnNewButton.setBackground(SWTResourceManager.getColor(51, 153, 255));
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnNewButton.setBounds(224, 326, 198, 59);
		btnNewButton.setText("TEM\u0130ZLE");

	}
}
