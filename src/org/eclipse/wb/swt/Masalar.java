package org.eclipse.wb.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Masalar {

	protected Shell shlMasalar;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Masalar window = new Masalar();
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
		shlMasalar.open();
		shlMasalar.layout();
		while (!shlMasalar.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMasalar = new Shell();
		shlMasalar.setSize(961, 560);
		shlMasalar.setText("MASALAR");
		
		TabFolder tabFolder = new TabFolder(shlMasalar, SWT.NONE);
		tabFolder.setBackground(SWTResourceManager.getColor(255, 102, 51));
		tabFolder.setBounds(32, 10, 722, 497);
		formToolkit.adapt(tabFolder);
		formToolkit.paintBordersFor(tabFolder);
		
		TabItem tbýtmBahe = new TabItem(tabFolder, SWT.NONE);
		tbýtmBahe.setText("BAH\u00C7E");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		tbýtmBahe.setControl(composite);
		formToolkit.paintBordersFor(composite);
		
		Button btnBahe = new Button(composite, SWT.NONE);
		btnBahe.setBackground(SWTResourceManager.getColor(204, 102, 0));
		btnBahe.setText("Masa 1");
		btnBahe.setBounds(103, 42, 90, 63);
		formToolkit.adapt(btnBahe, true, true);
		
		Button btnMasa_3 = new Button(composite, SWT.NONE);
		btnMasa_3.setText("Masa 5");
		btnMasa_3.setBounds(103, 111, 90, 63);
		formToolkit.adapt(btnMasa_3, true, true);
		
		Button btnMasa_7 = new Button(composite, SWT.NONE);
		btnMasa_7.setText("Masa 8");
		btnMasa_7.setBounds(103, 260, 90, 63);
		formToolkit.adapt(btnMasa_7, true, true);
		
		Button btnMasa = new Button(composite, SWT.NONE);
		btnMasa.setText("Masa 2");
		btnMasa.setBounds(199, 42, 90, 63);
		formToolkit.adapt(btnMasa, true, true);
		
		Button btnMasa_4 = new Button(composite, SWT.NONE);
		btnMasa_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMasa_4.setText("Masa 5");
		btnMasa_4.setBounds(199, 111, 90, 63);
		formToolkit.adapt(btnMasa_4, true, true);
		
		Button btnMasa_8 = new Button(composite, SWT.NONE);
		btnMasa_8.setText("Masa 9");
		btnMasa_8.setBounds(199, 260, 90, 63);
		formToolkit.adapt(btnMasa_8, true, true);
		
		Button btnMasa_1 = new Button(composite, SWT.NONE);
		btnMasa_1.setText("Masa 3");
		btnMasa_1.setBounds(295, 42, 90, 63);
		formToolkit.adapt(btnMasa_1, true, true);
		
		Button btnMasa_5 = new Button(composite, SWT.NONE);
		btnMasa_5.setText("Masa 6");
		btnMasa_5.setBounds(295, 111, 90, 63);
		formToolkit.adapt(btnMasa_5, true, true);
		
		Button btnMasa_9 = new Button(composite, SWT.NONE);
		btnMasa_9.setText("Masa 10");
		btnMasa_9.setBounds(295, 260, 90, 63);
		formToolkit.adapt(btnMasa_9, true, true);
		
		Button btnMasa_11 = new Button(composite, SWT.NONE);
		btnMasa_11.setText("Masa 12");
		btnMasa_11.setBounds(103, 329, 90, 63);
		formToolkit.adapt(btnMasa_11, true, true);
		
		Button btnMasa_12 = new Button(composite, SWT.NONE);
		btnMasa_12.setText("Masa 13");
		btnMasa_12.setBounds(199, 329, 90, 63);
		formToolkit.adapt(btnMasa_12, true, true);
		
		Button btnMasa_13 = new Button(composite, SWT.NONE);
		btnMasa_13.setText("Masa 14");
		btnMasa_13.setBounds(295, 329, 90, 63);
		formToolkit.adapt(btnMasa_13, true, true);
		
		Button btnMasa_2 = new Button(composite, SWT.NONE);
		btnMasa_2.setText("Masa 4");
		btnMasa_2.setBounds(391, 42, 90, 63);
		formToolkit.adapt(btnMasa_2, true, true);
		
		Button btnMasa_6 = new Button(composite, SWT.NONE);
		btnMasa_6.setText("Masa 7");
		btnMasa_6.setBounds(391, 111, 90, 63);
		formToolkit.adapt(btnMasa_6, true, true);
		
		Button btnMasa_10 = new Button(composite, SWT.NONE);
		btnMasa_10.setText("Masa 11");
		btnMasa_10.setBounds(391, 260, 90, 63);
		formToolkit.adapt(btnMasa_10, true, true);
		
		Button btnMasa_14 = new Button(composite, SWT.NONE);
		btnMasa_14.setText("Masa 15");
		btnMasa_14.setBounds(391, 329, 90, 63);
		formToolkit.adapt(btnMasa_14, true, true);
		
		Label lblG = new Label(composite, SWT.NONE);
		lblG.setText("G");
		lblG.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblG.setAlignment(SWT.CENTER);
		lblG.setBounds(64, 197, 70, 38);
		formToolkit.adapt(lblG, true, true);
		
		Label lblI_1 = new Label(composite, SWT.NONE);
		lblI_1.setText("\u0130");
		lblI_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblI_1.setAlignment(SWT.CENTER);
		lblI_1.setBounds(170, 197, 70, 38);
		formToolkit.adapt(lblI_1, true, true);
		
		Label lblR_2 = new Label(composite, SWT.NONE);
		lblR_2.setText("R");
		lblR_2.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblR_2.setAlignment(SWT.CENTER);
		lblR_2.setBounds(267, 197, 70, 38);
		formToolkit.adapt(lblR_2, true, true);
		
		Label lblI_2 = new Label(composite, SWT.NONE);
		lblI_2.setText("\u0130");
		lblI_2.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblI_2.setAlignment(SWT.CENTER);
		lblI_2.setBounds(364, 197, 70, 38);
		formToolkit.adapt(lblI_2, true, true);
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText("\u015E");
		label_4.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		label_4.setAlignment(SWT.CENTER);
		label_4.setBounds(461, 197, 70, 38);
		formToolkit.adapt(label_4, true, true);
		
		TabItem tbýtmSalon_1 = new TabItem(tabFolder, SWT.NONE);
		tbýtmSalon_1.setText("SALON");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		tbýtmSalon_1.setControl(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
		Button btnSalon = new Button(composite_1, SWT.NONE);
		btnSalon.setBounds(10, 27, 90, 63);
		formToolkit.adapt(btnSalon, true, true);
		btnSalon.setText("Salon 1");
		
		Button btnSalon_1 = new Button(composite_1, SWT.NONE);
		btnSalon_1.setText("Salon 2");
		btnSalon_1.setBounds(106, 27, 90, 63);
		formToolkit.adapt(btnSalon_1, true, true);
		
		Button btnSalon_2 = new Button(composite_1, SWT.NONE);
		btnSalon_2.setText("Salon 3");
		btnSalon_2.setBounds(202, 27, 90, 63);
		formToolkit.adapt(btnSalon_2, true, true);
		
		Button btnSalon_18 = new Button(composite_1, SWT.NONE);
		btnSalon_18.setText("Salon 19");
		btnSalon_18.setBounds(391, 27, 90, 63);
		formToolkit.adapt(btnSalon_18, true, true);
		
		Button btnSalon_19 = new Button(composite_1, SWT.NONE);
		btnSalon_19.setText("Salon 20");
		btnSalon_19.setBounds(486, 27, 90, 63);
		formToolkit.adapt(btnSalon_19, true, true);
		
		Button btnSalon_20 = new Button(composite_1, SWT.NONE);
		btnSalon_20.setText("Salon 21");
		btnSalon_20.setBounds(582, 27, 90, 63);
		formToolkit.adapt(btnSalon_20, true, true);
		
		Button btnSalon_3 = new Button(composite_1, SWT.NONE);
		btnSalon_3.setText("Salon 4");
		btnSalon_3.setBounds(10, 96, 90, 63);
		formToolkit.adapt(btnSalon_3, true, true);
		
		Button btnSalon_4 = new Button(composite_1, SWT.NONE);
		btnSalon_4.setText("Salon 5");
		btnSalon_4.setBounds(106, 96, 90, 63);
		formToolkit.adapt(btnSalon_4, true, true);
		
		Button btnSalon_5 = new Button(composite_1, SWT.NONE);
		btnSalon_5.setText("Salon 6");
		btnSalon_5.setBounds(202, 96, 90, 63);
		formToolkit.adapt(btnSalon_5, true, true);
		
		Button btnSalon_21 = new Button(composite_1, SWT.NONE);
		btnSalon_21.setText("Salon 22");
		btnSalon_21.setBounds(391, 96, 90, 63);
		formToolkit.adapt(btnSalon_21, true, true);
		
		Button btnSalon_22 = new Button(composite_1, SWT.NONE);
		btnSalon_22.setText("Salon 23");
		btnSalon_22.setBounds(486, 96, 90, 63);
		formToolkit.adapt(btnSalon_22, true, true);
		
		Button btnSalon_23 = new Button(composite_1, SWT.NONE);
		btnSalon_23.setText("Salon 24");
		btnSalon_23.setBounds(582, 96, 90, 63);
		formToolkit.adapt(btnSalon_23, true, true);
		
		Button btnSalon_6 = new Button(composite_1, SWT.NONE);
		btnSalon_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSalon_6.setText("Salon 7");
		btnSalon_6.setBounds(10, 165, 90, 63);
		formToolkit.adapt(btnSalon_6, true, true);
		
		Button btnSalon_7 = new Button(composite_1, SWT.NONE);
		btnSalon_7.setText("Salon 8");
		btnSalon_7.setBounds(106, 165, 90, 63);
		formToolkit.adapt(btnSalon_7, true, true);
		
		Button btnSalon_8 = new Button(composite_1, SWT.NONE);
		btnSalon_8.setText("Salon 9");
		btnSalon_8.setBounds(202, 165, 90, 63);
		formToolkit.adapt(btnSalon_8, true, true);
		
		Button btnSalon_24 = new Button(composite_1, SWT.NONE);
		btnSalon_24.setText("Salon 25");
		btnSalon_24.setBounds(391, 165, 90, 63);
		formToolkit.adapt(btnSalon_24, true, true);
		
		Button btnSalon_25 = new Button(composite_1, SWT.NONE);
		btnSalon_25.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		btnSalon_25.setText("Salon 26");
		btnSalon_25.setBounds(486, 165, 90, 63);
		formToolkit.adapt(btnSalon_25, true, true);
		
		Button btnSalon_26 = new Button(composite_1, SWT.NONE);
		btnSalon_26.setText("Salon 28");
		btnSalon_26.setBounds(582, 165, 90, 63);
		formToolkit.adapt(btnSalon_26, true, true);
		
		Label lblK = new Label(composite_1, SWT.NONE);
		lblK.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblK.setAlignment(SWT.CENTER);
		lblK.setBounds(308, 40, 70, 38);
		formToolkit.adapt(lblK, true, true);
		lblK.setText("K");
		
		Label lblO = new Label(composite_1, SWT.NONE);
		lblO.setText("O");
		lblO.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblO.setAlignment(SWT.CENTER);
		lblO.setBounds(308, 96, 70, 38);
		formToolkit.adapt(lblO, true, true);
		
		Label lblR = new Label(composite_1, SWT.NONE);
		lblR.setText("R");
		lblR.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblR.setAlignment(SWT.CENTER);
		lblR.setBounds(308, 152, 70, 38);
		formToolkit.adapt(lblR, true, true);
		
		Label lblI = new Label(composite_1, SWT.NONE);
		lblI.setText("\u0130");
		lblI.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblI.setAlignment(SWT.CENTER);
		lblI.setBounds(308, 212, 70, 38);
		formToolkit.adapt(lblI, true, true);
		
		Label lblD = new Label(composite_1, SWT.NONE);
		lblD.setText("D");
		lblD.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblD.setAlignment(SWT.CENTER);
		lblD.setBounds(308, 272, 70, 38);
		formToolkit.adapt(lblD, true, true);
		
		Label lblO_1 = new Label(composite_1, SWT.NONE);
		lblO_1.setText("O");
		lblO_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblO_1.setAlignment(SWT.CENTER);
		lblO_1.setBounds(308, 328, 70, 38);
		formToolkit.adapt(lblO_1, true, true);
		
		Label lblR_1 = new Label(composite_1, SWT.NONE);
		lblR_1.setText("R");
		lblR_1.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.BOLD | SWT.ITALIC));
		lblR_1.setAlignment(SWT.CENTER);
		lblR_1.setBounds(308, 385, 70, 38);
		formToolkit.adapt(lblR_1, true, true);
		
		Button btnSalon_15 = new Button(composite_1, SWT.NONE);
		btnSalon_15.setText("Salon 16");
		btnSalon_15.setBounds(10, 372, 90, 63);
		formToolkit.adapt(btnSalon_15, true, true);
		
		Button btnSalon_9 = new Button(composite_1, SWT.NONE);
		btnSalon_9.setText("Salon 10");
		btnSalon_9.setBounds(10, 234, 90, 63);
		formToolkit.adapt(btnSalon_9, true, true);
		
		Button btnSalon_12 = new Button(composite_1, SWT.NONE);
		btnSalon_12.setText("Salon 13");
		btnSalon_12.setBounds(10, 303, 90, 63);
		formToolkit.adapt(btnSalon_12, true, true);
		
		Button btnSalon_10 = new Button(composite_1, SWT.NONE);
		btnSalon_10.setText("Salon 11");
		btnSalon_10.setBounds(106, 234, 90, 63);
		formToolkit.adapt(btnSalon_10, true, true);
		
		Button btnSalon_13 = new Button(composite_1, SWT.NONE);
		btnSalon_13.setText("Salon 14");
		btnSalon_13.setBounds(106, 303, 90, 63);
		formToolkit.adapt(btnSalon_13, true, true);
		
		Button btnSalon_16 = new Button(composite_1, SWT.NONE);
		btnSalon_16.setText("Salon 17");
		btnSalon_16.setBounds(106, 372, 90, 63);
		formToolkit.adapt(btnSalon_16, true, true);
		
		Button btnSalon_17 = new Button(composite_1, SWT.NONE);
		btnSalon_17.setText("Salon 18");
		btnSalon_17.setBounds(202, 372, 90, 63);
		formToolkit.adapt(btnSalon_17, true, true);
		
		Button btnSalon_14 = new Button(composite_1, SWT.NONE);
		btnSalon_14.setText("Salon 15");
		btnSalon_14.setBounds(202, 303, 90, 63);
		formToolkit.adapt(btnSalon_14, true, true);
		
		Button btnSalon_11 = new Button(composite_1, SWT.NONE);
		btnSalon_11.setText("Salon 12");
		btnSalon_11.setBounds(202, 234, 90, 63);
		formToolkit.adapt(btnSalon_11, true, true);
		
		Button btnSalon_35 = new Button(composite_1, SWT.NONE);
		btnSalon_35.setText("Salon 37");
		btnSalon_35.setBounds(582, 372, 90, 63);
		formToolkit.adapt(btnSalon_35, true, true);
		
		Button btnSalon_34 = new Button(composite_1, SWT.NONE);
		btnSalon_34.setText("Salon 36");
		btnSalon_34.setBounds(486, 372, 90, 63);
		formToolkit.adapt(btnSalon_34, true, true);
		
		Button btnSalon_27 = new Button(composite_1, SWT.NONE);
		btnSalon_27.setText("Salon 29");
		btnSalon_27.setBounds(391, 234, 90, 63);
		formToolkit.adapt(btnSalon_27, true, true);
		
		Button btnSalon_33 = new Button(composite_1, SWT.NONE);
		btnSalon_33.setText("Salon 35");
		btnSalon_33.setBounds(391, 372, 90, 63);
		formToolkit.adapt(btnSalon_33, true, true);
		
		Button btnSalon_28 = new Button(composite_1, SWT.NONE);
		btnSalon_28.setText("Salon 30");
		btnSalon_28.setBounds(486, 234, 90, 63);
		formToolkit.adapt(btnSalon_28, true, true);
		
		Button btnSalon_29 = new Button(composite_1, SWT.NONE);
		btnSalon_29.setText("Salon 31");
		btnSalon_29.setBounds(582, 234, 90, 63);
		formToolkit.adapt(btnSalon_29, true, true);
		
		Button btnSalon_30 = new Button(composite_1, SWT.NONE);
		btnSalon_30.setText("Salon 32");
		btnSalon_30.setBounds(391, 305, 90, 63);
		formToolkit.adapt(btnSalon_30, true, true);
		
		Button btnSalon_31 = new Button(composite_1, SWT.NONE);
		btnSalon_31.setText("Salon 33");
		btnSalon_31.setBounds(486, 305, 90, 63);
		formToolkit.adapt(btnSalon_31, true, true);
		
		Button btnSalon_32 = new Button(composite_1, SWT.NONE);
		btnSalon_32.setText("Salon 34");
		btnSalon_32.setBounds(582, 303, 90, 63);
		formToolkit.adapt(btnSalon_32, true, true);
		
		Button btnNewButton = new Button(shlMasalar, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnNewButton.setBounds(760, 35, 155, 131);
		formToolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("GER\u0130 D\u00D6N");
		
		Button btnSipariEkle = new Button(shlMasalar, SWT.NONE);
		btnSipariEkle.setText("YEN\u0130 S\u0130PAR\u0130\u015E");
		btnSipariEkle.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		btnSipariEkle.setBounds(760, 370, 155, 131);
		formToolkit.adapt(btnSipariEkle, true, true);
		
		Button button = new Button(shlMasalar, SWT.NONE);
		button.setBackground(SWTResourceManager.getColor(255, 102, 51));
		button.setText("\u0130LAVE");
		button.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.BOLD));
		button.setBounds(760, 201, 155, 131);
		formToolkit.adapt(button, true, true);

	}
}
