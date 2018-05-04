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
		
		MenuItem mn�tmNewItem = new MenuItem(menu, SWT.NONE);
		mn�tmNewItem.setText("New Item");
		
		MenuItem mn�tmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mn�tmNewItem_1.setText("New Item");
		
		MenuItem mn�tmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mn�tmNewSubmenu.setText("New SubMenu");
		
		Menu menu_1 = new Menu(mn�tmNewSubmenu);
		mn�tmNewSubmenu.setMenu(menu_1);
		
		MenuItem mn�tmNewItem_2 = new MenuItem(menu_1, SWT.NONE);
		mn�tmNewItem_2.setText("New Item");

	}
}
