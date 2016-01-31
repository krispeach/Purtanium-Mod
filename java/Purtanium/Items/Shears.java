package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.item.ItemShears;

public class Shears extends ItemShears 
{	
	public Shears()
	{
		setMaxDamage(400);
		setUnlocalizedName("purtaniumshears");
		setTextureName(Strings.MODID + ":shears");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}