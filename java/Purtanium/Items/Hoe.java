package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class Hoe extends ItemHoe 
{
	public Hoe() 
	{
		super(PurtaniumItems.purtaniumTool);
		setUnlocalizedName("purtaniumhoe");
		setTextureName(Strings.MODID + ":hoe");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}