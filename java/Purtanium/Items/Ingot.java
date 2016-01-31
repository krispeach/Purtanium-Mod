package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class Ingot extends Item 
{
	public Ingot() 
	{
		setMaxStackSize(64);
		setUnlocalizedName("purtaniumingot");
		setTextureName(Strings.MODID + ":ingot");
		setCreativeTab(Purtanium.tabPurtanium);
	}	
}