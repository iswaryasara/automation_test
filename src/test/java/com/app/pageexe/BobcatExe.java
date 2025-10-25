package com.app.pageexe;

import com.app.base.Base;
import com.app.pageobject.BobcatLoc;

import net.bytebuddy.implementation.MethodCall.ArgumentLoader;

public class BobcatExe extends BobcatLoc{
	public static void browserlaunch() {
	Base.browserLaunch();

}
public static void OpenUrl() {
	Base.loadUrl(null);
}
public static void Alert() {
	Base.click(getAlert());
}
public static void Equipment()
{
	Base.click(getEquipment());
}
public static void Loaders()
{
	//Base.click(getloader());
	System.out.println(getloader().getText());
}
public static void miniE()
{
	//Base.click(getmini());
	System.out.println(getmini().getText());
}
public static void Fork()
{
	//Base.click(getfork());
	System.out.println(getfork().getText());
}
public  static void portable() {
	//Base.click(getportable());
	System.out.println(getportable().getText());
}
}
