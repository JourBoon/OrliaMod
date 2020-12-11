package fr.jourboon.orliamod.objects;

import fr.jourboon.orliamod.Main;
import fr.jourboon.orliamod.init.ItemInit;
import fr.jourboon.orliamod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemRadar extends Item implements IHasModel
{
   private static EntityPlayer player;
   
   public static int durabilité = 90*20*60;
   
   public ItemRadar(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        setMaxDamage(durabilité);
        setMaxStackSize(1);      
        ItemInit.ITEMS.add(this);
    }
    
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRederer(this, 0);
    }
    
    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        player = (EntityPlayer)entityIn;
        
        stack = player.getHeldItem(EnumHand.MAIN_HAND);
        
        if(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemRadar)
        {
                if(durabilité >= 0)
                {
                    durabilité --;
                    stack.damageItem(1, player);
                }
                    
        }
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
    }
    
}

