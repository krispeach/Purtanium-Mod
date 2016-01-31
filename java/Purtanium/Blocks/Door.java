package Purtanium.Blocks;

import java.util.Random;

import Purtanium.Purtanium;
import Purtanium.Items.PurtaniumItems;
import Purtanium.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Door extends BlockDoor {
	
	public Door(Material material){
		super(material);
		setHardness(7.0F);
		setResistance(40.0F);
		setStepSound(soundTypeMetal);
		setBlockName("purtaniumdoor");
		disableStats();
		setBlockTextureName(Strings.MODID + ":door");		
	}
	
	@Override 
	public Item getItem(World world, int arg1, int arg2, int arg3)
	{
		return PurtaniumItems.Door;
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return (p_149650_1_ & 8) != 0 ? null : PurtaniumItems.Door;
    }
}