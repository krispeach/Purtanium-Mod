package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class Axe extends ItemAxe 
{
	public Axe() 
	{
		super(PurtaniumItems.purtaniumTool);
		setUnlocalizedName("purtaniumaxe");
		setTextureName(Strings.MODID + ":axe");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}