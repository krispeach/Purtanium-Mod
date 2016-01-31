package Purtanium.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.block.BlockHopper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class Hopper extends BlockHopper{

	@SideOnly(Side.CLIENT)
    private IIcon field_149921_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_149923_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_149924_N;
	
	public Hopper(){
		super();
		setHardness(7.0F);
		setResistance(20.0F);
		setStepSound(soundTypeWood);
		setBlockName("purtaniumhopper");
		setBlockTextureName(Strings.MODID + ":hopper");
		setCreativeTab(Purtanium.tabPurtanium);
	}
	
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149923_M : this.field_149921_b;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149921_b = p_149651_1_.registerIcon(Strings.MODID + ":hopper_outside");
        this.field_149923_M = p_149651_1_.registerIcon(Strings.MODID + ":hopper_top");
        this.field_149924_N = p_149651_1_.registerIcon(Strings.MODID + ":hopper_inside");
    }
	
	@SideOnly(Side.CLIENT)
    public static IIcon getHopperIcon(String p_149916_0_)
    {
        return p_149916_0_.equals(Strings.MODID + ":hopper_outside") ? PurtaniumBlocks.Hopper.field_149921_b : (p_149916_0_.equals(Strings.MODID + ":hopper_inside") ? PurtaniumBlocks.Hopper.field_149924_N : null);
    }
	
	@Override
	public String getItemIconName()
    {
        return Strings.MODID + ":hopper";
    }
}