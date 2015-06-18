package com.github.Fearon8.FactoryCraft.init;

public class ModBlocks()
{ 
	public static Block SteelBlock = new BlockSteel();
	
	public static void init()
    {
     

	RegisterHelper.registerBlock(SteelBlock);

    }
}
