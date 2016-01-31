package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class PickAxe extends ItemPickaxe
{
	public PickAxe() 
	{
		super(PurtaniumItems.purtaniumTool);
		setUnlocalizedName("purtaniumpickaxe");
		setTextureName(Strings.MODID + ":pickaxe");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}