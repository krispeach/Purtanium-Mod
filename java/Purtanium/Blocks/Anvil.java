package Purtanium.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.block.BlockAnvil;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Anvil extends BlockAnvil 
{
	public static final String[] anvilDamageNames = new String[] {"intact", "slightlyDamaged", "veryDamaged"};
	private static final String[] anvilIconNames = new String[] {"anvil_top_damaged_0", "anvil_top_damaged_1", "anvil_top_damaged_2"};
	
	@SideOnly(Side.CLIENT)
	private IIcon[] anvilIcons;
	
	public Anvil()
	{
		super();
		setHardness(7.0F);
		setResistance(4000.0F);
		setStepSound(soundTypeAnvil);
		setBlockName("purtaniumanvil");
		setBlockTextureName(Strings.MODID + ":anvil");
		setCreativeTab(Purtanium.tabPurtanium);
	}
	
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (this.anvilRenderSide == 3 && p_149691_1_ == 1)
        {
            int k = (p_149691_2_ >> 2) % this.anvilIcons.length;
            return this.anvilIcons[k];
        }
        else
        {
            return this.blockIcon;
        }
    }
	
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(Strings.MODID + ":anvil_base");
        this.anvilIcons = new IIcon[anvilIconNames.length];

        for (int i = 0; i < this.anvilIcons.length; ++i)
        {
            this.anvilIcons[i] = p_149651_1_.registerIcon(Strings.MODID + ":" + anvilIconNames[i]);
        }
    }
}