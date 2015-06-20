package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.help.RegisterHelper;
import com.github.Fearon8.FactoryCraft.items.FactoryCraftItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    static ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 2048, 9.0F, 4.0F, 14);
	
	public static Item SteelIngot = new FactoryCraftItem().setUnlocalizedName("SteelIngot");
	public static Item handleSteel = new FactoryCraftItem().setUnlocalizedName("handleSteel");
	public static Item anthracite = new FactoryCraftItem().setUnlocalizedName("anthracite");
	public static Item rawCarbonDust = new FactoryCraftItem().setUnlocalizedName("rawCarbonDust");
	public static Item pureCarbonDust = new FactoryCraftItem().setUnlocalizedName("pureCarbonDust");
	public static Item SteelSword = new ItemFactoryCraftSword(STEEL).setUnlocalizedName("SteelSword");
    public static Item SteelPickaxe = new ItemFactoryCraftPickaxe(STEEL).setUnlocalizedName("SteelPickaxe");
	public static Item SteelShovel = new ItemFactoryCraftShovel(STEEL).setUnlocalizedName("SteelShovel");
	public static Item SteelAxe = new ItemFactoryCraftAxe(STEEL).setUnlocalizedName("SteelAxe");
          
	  public static void init()
	      {
	    	RegisterHelper.registerItem(anthracite);
	    	RegisterHelper.registerItem(rawCarbonDust);
	    	RegisterHelper.registerItem(pureCarbonDust);
		    RegisterHelper.registerItem(SteelIngot);
	    	RegisterHelper.registerItem(handleSteel);
	    	RegisterHelper.registerItem(anthracite);
	        RegisterHelper.registerItem(SteelSword);
	        RegisterHelper.registerItem(SteelPickaxe);
	        RegisterHelper.registerItem(SteelShovel);
	        RegisterHelper.registerItem(SteelAxe);
          }
}



