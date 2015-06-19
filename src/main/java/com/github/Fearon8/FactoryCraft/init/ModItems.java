package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.help.RegisterHelper;
import com.github.Fearon8.FactoryCraft.items.FactoryCraftItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    static ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 666, 3.0F, 3.0F, 14);
	
	public static Item SteelIngot = new FactoryCraftItem().setUnlocalizedName("SteelIngot");
	
	public static Item SteelSword = new ItemFactoryCraftSword(STEEL).setUnlocalizedName("SteelSword");
    public static Item SteelPick = new ItemFactoryCraftPickaxe(STEEL).setUnlocalizedName("SteelPick");
	public static Item SteelShovel = new ItemFactoryCraftShovel(STEEL).setUnlocalizedName("SteelShovel");
	public static Item SteelAxe = new ItemFactoryCraftAxe(STEEL).setUnlocalizedName("SteelAxe");
	    public static void init()
	      {
	    	RegisterHelper.registerItem(SteelIngot);
	        RegisterHelper.registerItem(SteelSword);
	        RegisterHelper.registerItem(SteelPick);
	        RegisterHelper.registerItem(SteelShovel);
	        RegisterHelper.registerItem(SteelAxe);
          }
}



