package Purtanium.Blocks;

import java.util.Random;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class Ore extends Block {

	public Ore(Material material) {
		super(material);
		setHardness(4.0F); // 33% harder than diamond
		setResistance(20.0F);
        setStepSound(Block.soundTypeStone);
        setBlockName("purtaniumore");
        setCreativeTab(Purtanium.tabPurtanium);
		setBlockTextureName(Strings.MODID + ":ore");
		setHarvestLevel("pickaxe", 3);		
	}
	
	private Random rand = new Random();
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune){
		if(getItemDropped(metadata, rand, fortune) != Item.getItemFromBlock(this) )
		{
			return 1 + rand.nextInt(15);
		}
		return 0;
	}
}
