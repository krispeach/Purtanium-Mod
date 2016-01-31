package Purtanium;

import Purtanium.Blocks.PurtaniumBlocks;
import Purtanium.Entitys.PurtaniumEntitys;
import Purtanium.Food.PurtaniumFoods;
import Purtanium.Items.PurtaniumItems;
import Purtanium.World.PurtaniumWorld;
import Purtanium.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAnvilBlock;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Strings.MODID,name= Strings.NAME, version = Strings.MODID)
public class Purtanium 
{	
	//regions Properties
	
	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="Purtanium.ClientProxy", serverSide="Purtanium.CommonProxy")
    public static CommonProxy proxy;
	
	@Metadata
    public static ModMetadata meta;
	
    // The instance of your mod that Forge uses.
    @Instance(Strings.MODID)
    public static Purtanium modInstance;
    
    //public static DamageSource PurpleAnvil = new DamageSource(Strings.MODID + ":anvil");
    
    public static final CreativeTabs tabPurtanium = new CreativeTabs("Purtanium")
    {
    	@Override public Item getTabIconItem() { return PurtaniumBlocks.Ingot;}    	
    };
    //endregion Properties
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent)
    {
    	PurtaniumBlocks.mainRegistry();
    	PurtaniumItems.mainRegistry();
    	PurtaniumEntitys.mainRegistry();
    	PurtaniumFoods.mainRegistry();
    	PurtaniumWorld.mainRegistry();
	}
    
    @EventHandler
    public void init(FMLInitializationEvent event) 
    {
            proxy.registerRenderers();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
            // Stub Method
    }
}