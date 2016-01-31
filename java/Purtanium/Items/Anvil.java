package Purtanium.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Purtanium.Purtanium;
import Purtanium.Blocks.PurtaniumBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;

public class Anvil extends ItemMultiTexture 
{
	public Anvil()
	{
		super(PurtaniumBlocks.Anvil, PurtaniumBlocks.Anvil, PurtaniumBlocks.Anvil.anvilDamageNames);		
	}
	
	/**
     * Returns the metadata of the block which this Item (ItemBlock) can place
     */
    public int getMetadata(int p_77647_1_)
    {
        return p_77647_1_ << 2;
    }
}