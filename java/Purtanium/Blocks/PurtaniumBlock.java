package Purtanium.Blocks;

import java.util.Random;

import Purtanium.Purtanium;
import Purtanium.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class PurtaniumBlock extends Block {

	public PurtaniumBlock(Material arg0) {
		super(arg0);
		setHardness(5.0F); // 33% harder than diamond
		setResistance(40.0F);
		setStepSound(Block.soundTypeMetal);
        setBlockName("purtaniumblock");
        setCreativeTab(Purtanium.tabPurtanium);
		setBlockTextureName(Strings.MODID + ":block");
		setHarvestLevel("pickaxe", 3);
	}
}