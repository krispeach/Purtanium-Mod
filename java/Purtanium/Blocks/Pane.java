package Purtanium.Blocks;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockPane;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Pane extends BlockPane {

	private IIcon field_150102_N;
	
	public Pane() {
		super("purtanium_bars", "purtanium_bars", Material.iron, true);
		setHardness(7.0F);
		setResistance(40.0F);
		setStepSound(soundTypeMetal);
		setBlockName("purtaniumbars");
		setCreativeTab(Purtanium.tabPurtanium);
	}	
	
	@Override
	public IIcon func_150097_e()
    {
        return this.field_150102_N;
    }
	
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(Strings.MODID + ":bars");
        this.field_150102_N = p_149651_1_.registerIcon(Strings.MODID + ":bars");
    }
}