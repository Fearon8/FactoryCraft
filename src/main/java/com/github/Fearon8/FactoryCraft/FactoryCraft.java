package com.github.Fearon8.FactoryCraft;

import com.github.Fearon8.FactoryCraft.crafting.ModRecipes;
import com.github.Fearon8.FactoryCraft.generation.FactoryCraftWorldGeneration;
import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.init.ModBlocks;
import com.github.Fearon8.FactoryCraft.init.ModItems;
import com.github.Fearon8.FactoryCraft.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FactoryCraft {
	
	FactoryCraftWorldGeneration eventWorldGen = new FactoryCraftWorldGeneration();
	
	/*@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;*/
	
	@Instance(Reference.MODID)
	public static FactoryCraft instance;
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		 ModItems.init();
		 ModBlocks.init();
		 GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
		 
    }
    
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	
	    {
	         ModRecipes.init();
	    }
  
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
    
   
}
