package testpugin.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import testpugin.Activator;



public class SampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "testpugin.views.SampleView";

	@Override
	public void createPartControl(Composite arg0) {
		// TODO Auto-generated method stub
		
		
		// (not generated)

		Activator currentActivator = Activator.getDefault();
		
		Label labelTestPlugin = new Label(arg0, SWT.NONE);
		labelTestPlugin.setText( currentActivator.getMessage().getText() );
		
		//// (not generated)

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}



}