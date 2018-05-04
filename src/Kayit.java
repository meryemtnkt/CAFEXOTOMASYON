import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;

public class Kayit {
	private DataBindingContext m_bindingContext;

	protected Shell shlMasaSipari;
	private Text text;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				try {
					Kayit window = new Kayit();
					window.open();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMasaSipari.open();
		shlMasaSipari.layout();
		while (!shlMasaSipari.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMasaSipari = new Shell();
		shlMasaSipari.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		shlMasaSipari.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shlMasaSipari.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		shlMasaSipari.setMinimumSize(new Point(50, 47));
		shlMasaSipari.setSize(1243, 768);
		shlMasaSipari.setText("KASA / MASA S\u0130PAR\u0130\u015E");
		
		Group grpMen = new Group(shlMasaSipari, SWT.NONE);
		grpMen.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		grpMen.setText("MEN\u00DC");
		grpMen.setBounds(10, 96, 285, 447);
		
		Button btnYemekler = new Button(grpMen, SWT.NONE);
		btnYemekler.setBounds(33, 34, 225, 74);
		btnYemekler.setText("    FASTFOOD");
		btnYemekler.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\hamburger.png"));
		btnYemekler.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnYemekler.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnYemekler.setBackground(SWTResourceManager.getColor(50, 205, 50));
		
		Button btnTatllar = new Button(grpMen, SWT.NONE);
		btnTatllar.setBounds(33, 114, 225, 74);
		btnTatllar.setText("   TATLILAR");
		btnTatllar.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\muffin.png"));
		btnTatllar.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnTatllar.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnTatllar.setBackground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		
		Button btnDondurma = new Button(grpMen, SWT.NONE);
		btnDondurma.setBounds(33, 194, 225, 74);
		btnDondurma.setText("  DONDURMA");
		btnDondurma.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\ice-cream.png"));
		btnDondurma.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnDondurma.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnDondurma.setBackground(SWTResourceManager.getColor(255, 204, 51));
		
		Button btnScakIecekler = new Button(grpMen, SWT.NONE);
		btnScakIecekler.setBounds(33, 274, 225, 74);
		btnScakIecekler.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cup (1).png"));
		btnScakIecekler.setText("SICAK \u0130\u00C7ECEKLER");
		btnScakIecekler.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnScakIecekler.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnScakIecekler.setBackground(SWTResourceManager.getColor(255, 51, 51));
		
		Button btnSoukIecekler = new Button(grpMen, SWT.NONE);
		btnSoukIecekler.setBounds(33, 354, 225, 74);
		btnSoukIecekler.setText("SO\u011EUK \u0130\u00C7ECEKLER");
		btnSoukIecekler.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cola (2).png"));
		btnSoukIecekler.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnSoukIecekler.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnSoukIecekler.setBackground(SWTResourceManager.getColor(0, 102, 204));
		
		Group grpSipariler = new Group(shlMasaSipari, SWT.NONE);
		grpSipariler.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		grpSipariler.setText("S\u0130PAR\u0130\u015ELER");
		grpSipariler.setBounds(643, 96, 336, 447);
		
		Group grpMenIerik = new Group(shlMasaSipari, SWT.NONE);
		grpMenIerik.setText("MEN\u00DC \u0130\u00C7ER\u0130K");
		grpMenIerik.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		grpMenIerik.setBounds(301, 96, 336, 447);
		
		Group grpAdet = new Group(shlMasaSipari, SWT.NONE);
		grpAdet.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		grpAdet.setText("ADET");
		grpAdet.setBounds(985, 96, 198, 287);
		
		Button btnNewButton_1 = new Button(grpAdet, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnNewButton_1.setBounds(20, 237, 94, 40);
		btnNewButton_1.setText("C");
		
		Button button_8 = new Button(grpAdet, SWT.NONE);
		button_8.setText("1");
		button_8.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_8.setBounds(20, 99, 44, 40);
		
		text = new Text(grpAdet, SWT.BORDER);
		text.setBounds(20, 43, 144, 40);
		
		Button button_9 = new Button(grpAdet, SWT.NONE);
		button_9.setText("2");
		button_9.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_9.setBounds(70, 99, 44, 40);
		
		Button button = new Button(grpAdet, SWT.NONE);
		button.setText("3");
		button.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button.setBounds(120, 99, 44, 40);
		
		Button button_1 = new Button(grpAdet, SWT.NONE);
		button_1.setText("4");
		button_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_1.setBounds(20, 145, 44, 40);
		
		Button button_2 = new Button(grpAdet, SWT.NONE);
		button_2.setText("5");
		button_2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_2.setBounds(70, 145, 44, 40);
		
		Button button_3 = new Button(grpAdet, SWT.NONE);
		button_3.setText("6");
		button_3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_3.setBounds(120, 145, 44, 40);
		
		Button button_4 = new Button(grpAdet, SWT.NONE);
		button_4.setText("7");
		button_4.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_4.setBounds(20, 191, 44, 40);
		
		Button button_5 = new Button(grpAdet, SWT.NONE);
		button_5.setText("8");
		button_5.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_5.setBounds(70, 191, 44, 40);
		
		Button button_6 = new Button(grpAdet, SWT.NONE);
		button_6.setText("9");
		button_6.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_6.setBounds(120, 191, 44, 40);
		
		Button button_7 = new Button(grpAdet, SWT.NONE);
		button_7.setText("0");
		button_7.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		button_7.setBounds(120, 237, 44, 40);
		
		Button btnSipariEkran = new Button(shlMasaSipari, SWT.NONE);
		btnSipariEkran.setText(" Sipari\u015F \u0130ptal");
		btnSipariEkran.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\cancel"));
		btnSipariEkran.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnSipariEkran.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnSipariEkran.setBackground(SWTResourceManager.getColor(255, 0, 0));
		btnSipariEkran.setBounds(985, 469, 198, 59);
		
		Button btnSipariOnay = new Button(shlMasaSipari, SWT.NONE);
		btnSipariOnay.setText(" Sipari\u015F Onay");
		btnSipariOnay.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\ok-mark (1).png"));
		btnSipariOnay.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnSipariOnay.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnSipariOnay.setBackground(SWTResourceManager.getColor(51, 153, 0));
		btnSipariOnay.setBounds(985, 404, 198, 59);
		
		Label lblGarson = new Label(shlMasaSipari, SWT.NONE);
		lblGarson.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		lblGarson.setBounds(731, 39, 70, 20);
		lblGarson.setText("Garson");
		
		text_2 = new Text(shlMasaSipari, SWT.BORDER);
		text_2.setBounds(831, 36, 135, 26);
		
		Button btnMasa = new Button(shlMasaSipari, SWT.NONE);
		btnMasa.setAlignment(SWT.LEFT);
		btnMasa.setText("    MASA 41");
		btnMasa.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\dining-table (1).png"));
		btnMasa.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnMasa.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnMasa.setBackground(SWTResourceManager.getColor(255, 102, 0));
		btnMasa.setBounds(10, 19, 285, 43);
		
		Button btnGeriDn = new Button(shlMasaSipari, SWT.NONE);
		btnGeriDn.setText(" GER\u0130 D\u00D6N");
		btnGeriDn.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\left (1).png"));
		btnGeriDn.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnGeriDn.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnGeriDn.setBackground(SWTResourceManager.getColor(255, 102, 0));
		btnGeriDn.setBounds(985, 28, 198, 43);
		
		Group grpdemeler = new Group(shlMasaSipari, SWT.NONE);
		grpdemeler.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD | SWT.ITALIC));
		grpdemeler.setText("\u00D6DEMELER");
		grpdemeler.setBounds(298, 549, 681, 144);
		
		Label lblAraToplam = new Label(grpdemeler, SWT.NONE);
		lblAraToplam.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblAraToplam.setBounds(10, 71, 92, 20);
		lblAraToplam.setText("Ara Toplam");
		
		text_3 = new Text(grpdemeler, SWT.BORDER);
		text_3.setBounds(129, 100, 175, 26);
		
		Label lblGenelTutar = new Label(grpdemeler, SWT.NONE);
		lblGenelTutar.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblGenelTutar.setBounds(10, 103, 92, 20);
		lblGenelTutar.setText("Genel Tutar");
		
		text_4 = new Text(grpdemeler, SWT.BORDER);
		text_4.setBounds(129, 68, 175, 26);
		
		Label lbldemeekli = new Label(grpdemeler, SWT.NONE);
		lbldemeekli.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lbldemeekli.setBounds(10, 37, 97, 20);
		lbldemeekli.setText("\u00D6deme \u015Eekli");
		
		Combo combo = new Combo(grpdemeler, SWT.NONE);
		combo.setItems(new String[] {"Nakit", "Kredi Kart\u0131"});
		combo.setBounds(129, 34, 175, 28);
		
		Button btndemeYap = new Button(grpdemeler, SWT.NONE);
		btndemeYap.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\turkish-lira.png"));
		btndemeYap.setText(" \u00D6deme Yap");
		btndemeYap.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btndemeYap.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btndemeYap.setBackground(SWTResourceManager.getColor(102, 205, 170));
		btndemeYap.setBounds(344, 45, 161, 78);
		
		Button btnHesabKapat = new Button(grpdemeler, SWT.NONE);
		btnHesabKapat.setBounds(511, 44, 158, 81);
		btnHesabKapat.setText(" Hesab\u0131 Kapat");
		btnHesabKapat.setImage(SWTResourceManager.getImage("C:\\Users\\TANKUT\\Desktop\\workspaces\\Masa\\icon\\list.png"));
		btnHesabKapat.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnHesabKapat.setFont(SWTResourceManager.getFont("Berlin Sans FB Demi", 9, SWT.BOLD));
		btnHesabKapat.setBackground(SWTResourceManager.getColor(255, 51, 51));
		m_bindingContext = initDataBindings();

	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}
}
