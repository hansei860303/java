package InterfaceClass;

import OverrideClass.Foo;

public class Bar extends Foo implements Version {

	@Override
	public String getVersion() {
		return "Bar�N���X�@version 1.0";
	}

}
