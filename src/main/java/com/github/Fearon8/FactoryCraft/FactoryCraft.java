package com.github.Fearon8.FactoryCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.github.Fearon8.FactoryCraft.crafting.ModRecipes;
import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.init.ModBlocks;
import com.github.Fearon8.FactoryCraft.init.ModItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class FactoryCraft {
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		 ModItems.init();
		 ModBlocks.init();
    }
    
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
    	ModRecipes.init();
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }

}
