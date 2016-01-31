package Purtanium.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Purtanium.Purtanium;
import Purtanium.lib.Strings;

public class BucketMilk extends ItemBucketMilk 
{
	/** field for checking if the bucket has been filled. */
    private Block isFull;
    
	public BucketMilk() 
	{
		super();
		setUnlocalizedName("purtaniumbucketmilk");
		setTextureName(Strings.MODID + ":bucket_milk");
		setCreativeTab(Purtanium.tabPurtanium);
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        if (!p_77654_3_.capabilities.isCreativeMode)
        {
            --p_77654_1_.stackSize;
        }

        if (!p_77654_2_.isRemote)
        {
            p_77654_3_.curePotionEffects(p_77654_1_);
        }

        return p_77654_1_.stackSize <= 0 ? new ItemStack(PurtaniumItems.Bucket) : p_77654_1_;
    }
}