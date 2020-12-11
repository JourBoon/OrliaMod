package fr.jourboon.orliamod.objects.armor;

import java.util.List;

import fr.jourboon.orliamod.Main;
import fr.jourboon.orliamod.init.ItemInit;
import fr.jourboon.orliamod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorAngelite extends ItemArmor implements IHasModel {

	public ArmorAngelite(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() instanceof ArmorAngelite) {
				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1));
		}
		
		if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() instanceof ArmorAngelite) {
					player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3));
		}
				
		if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() instanceof ArmorAngelite) {
			
		}
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 3));
					
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof ArmorAngelite) {
						player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1));
		}
				/*if(!player.hasAchievement(ModAchievements.achievementFireResist)) {
					player.addStat(ModAchievements.achievementFireResist);
				}*/
		
			
		
	 
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> dataList, boolean bool) { 
		dataList.add("\u00A74Edit your tooltip here.");
		dataList.add("\u00A74Edit your tooltip here.");    
	}
}

