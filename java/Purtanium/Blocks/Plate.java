package Purtanium.Blocks;

import Purtanium.Purtanium;
import net.minecraft.block.BlockPressurePlateWeighted;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class Plate extends BlockPressurePlateWeighted {

	public Plate(String p_i45436_1_, Material p_i45436_2_,
			int p_i45436_3_) {
		super(p_i45436_1_, p_i45436_2_, p_i45436_3_);
		setHardness(7.0F);
		setResistance(40.0F);
		setStepSound(soundTypeMetal);
		setBlockName("purtaniumplate");
		setCreativeTab(Purtanium.tabPurtanium);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = PurtaniumBlocks.Block.getIcon(0, 0);
    }
}