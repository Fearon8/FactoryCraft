package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;

public class ItemFactoryCraftPickaxe extends ItemPickaxe
{
  public final ToolMaterial toolMaterial;
    
    public ItemFactoryCraftPickaxe(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabFactoryCraft);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }
}