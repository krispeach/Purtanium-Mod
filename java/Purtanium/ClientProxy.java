package Purtanium;

import Purtanium.Entitys.ModelElephant;
import Purtanium.Entitys.ModelPurtanium;
import Purtanium.Entitys.PurtaniumMob;
import Purtanium.Entitys.RenderMod;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy 
{
        @Override
        public void registerRenderers() 
        {
        	// This is for rendering entities and so forth later on
        	RenderingRegistry.registerEntityRenderingHandler(PurtaniumMob.class, new RenderMod(new ModelElephant(),0));
        }
        
        public int addArmor(String armor)
        {
        	return RenderingRegistry.addNewArmourRendererPrefix(armor);
        }
}