package Purtanium.Blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Purtanium.Purtanium;
import Purtanium.Items.PurtaniumItems;
import Purtanium.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Cauldron extends BlockCauldron{
	
	@SideOnly(Side.CLIENT)
    private IIcon field_150029_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150028_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_150030_M;
    
    public Cauldron() {
		super();
		setHardness(4.0F);
		setBlockName("purtaniumcauldron");
		setBlockTextureName(Strings.MODID + ":cauldron");
		setCreativeTab(Purtanium.tabPurtanium);
	}
	
    @SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_150028_b : (p_149691_1_ == 0 ? this.field_150030_M : this.blockIcon);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150029_a = p_149651_1_.registerIcon(Strings.MODID + ":cauldron_inner");
        this.field_150028_b = p_149651_1_.registerIcon(Strings.MODID + ":cauldron_top");
        this.field_150030_M = p_149651_1_.registerIcon(Strings.MODID + ":cauldron_bottom");
        this.blockIcon = p_149651_1_.registerIcon(Strings.MODID + ":cauldron_side");
    }
	
	@SideOnly(Side.CLIENT)
    public static IIcon getCauldronIcon(String p_150026_0_)
    {
		final Cauldron Cauldron = (Cauldron)Block.blockRegistry.getObject("purtaniumcauldron");
		return p_150026_0_.equals("inner") ? Cauldron.field_150029_a : (p_150026_0_.equals("bottom") ? Cauldron.field_150030_M : null);
    }
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return PurtaniumItems.Cauldron;
    }
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return PurtaniumItems.Cauldron;
    }
}