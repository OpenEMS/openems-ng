package io.openems.impl.device.ess;

import io.openems.api.device.Device;
import io.openems.api.device.Ess;
import io.openems.api.general.data.IntegerValue;
import io.openems.api.general.data.Value;
import io.openems.api.general.data.element.Element;
import io.openems.api.general.dataaccess.IsItem;

public class Commercial extends Device implements Ess {

	private Element soc;
	
	private Element activePower;
	
	@IsItem
	public Element getSoc(){
		return soc;
	}
	
	@IsItem
	public Element getActivePower(){
		return activePower;
	}
	
	public void writeActivePower(Value v){
		soc.setValue(v);
		activePower.setValue(v);
		System.out.println(v.toString());
	}
	
	public Commercial(String name) {
		super(name);
		soc = new Element();
		activePower = new Element();
	}

}
