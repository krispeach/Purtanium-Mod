package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class Sword extends ItemSword 
{
	public Sword() 
	{
		super(PurtaniumItems.purtaniumTool);
		setUnlocalizedName("purtaniumsword");
		setTextureName(Strings.MODID + ":sword");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}