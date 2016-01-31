package Purtanium.Items;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.IIcon;

public class Shovel extends ItemSpade
{
	public Shovel() 
	{
		super(PurtaniumItems.purtaniumTool);
		setUnlocalizedName("purtaniumshovel");
		setTextureName(Strings.MODID + ":shovel");
		setCreativeTab(Purtanium.tabPurtanium);
	}
}