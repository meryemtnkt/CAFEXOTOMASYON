import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;

public class yonetici1 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			yonetici1 window = new yonetici1();
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
		shell.setSize(841, 665);
		shell.setText("SWT Application");
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mnýtmNewItem = new MenuItem(menu, SWT.NONE);
		mnýtmNewItem.setText("New Item");
		
		MenuItem mnýtmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mnýtmNewItem_1.setText("New Item");
		
		MenuItem mnýtmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mnýtmNewSubmenu.setText("New SubMenu");
		
		Menu menu_1 = new Menu(mnýtmNewSubmenu);
		mnýtmNewSubmenu.setMenu(menu_1);
		
		MenuItem mnýtmNewItem_2 = new MenuItem(menu_1, SWT.NONE);
		mnýtmNewItem_2.setText("New Item");

	}
}
