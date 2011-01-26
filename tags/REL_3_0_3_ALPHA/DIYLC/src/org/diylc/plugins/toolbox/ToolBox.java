package org.diylc.plugins.toolbox;

import java.util.EnumSet;

import javax.swing.SwingConstants;

import org.diylc.common.BadPositionException;
import org.diylc.common.EventType;
import org.diylc.common.IPlugIn;
import org.diylc.common.IPlugInPort;


public class ToolBox implements IPlugIn {

	@Override
	public void connect(IPlugInPort plugInPort) {
		try {
			plugInPort.injectGUIComponent(new ComponentTabbedPane(plugInPort), SwingConstants.TOP);
		} catch (BadPositionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public EnumSet<EventType> getSubscribedEventTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void processMessage(EventType eventType, Object... params) {
		// TODO Auto-generated method stub

	}
}