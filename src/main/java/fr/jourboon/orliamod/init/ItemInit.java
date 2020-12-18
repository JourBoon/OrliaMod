package fr.jourboon.orliamod.init;

import java.util.ArrayList;

import fr.jourboon.orliamod.objects.ItemRadar;
import fr.jourboon.orliamod.objects.armor.ArmorAngelite;
import fr.jourboon.orliamod.objects.armor.ArmorBase;
import fr.jourboon.orliamod.objects.armor.ArmorNecrotique;
import fr.jourboon.orliamod.objects.items.ItemBase;
import fr.jourboon.orliamod.objects.items.ItemSusano;
import fr.jourboon.orliamod.objects.tools.AngeliteAxe;
import fr.jourboon.orliamod.objects.tools.AngelitePickaxe;
import fr.jourboon.orliamod.objects.tools.AngeliteSpade;
import fr.jourboon.orliamod.objects.tools.AngeliteSword;
import fr.jourboon.orliamod.objects.tools.NecrotiqueAxe;
import fr.jourboon.orliamod.objects.tools.NecrotiquePickaxe;
import fr.jourboon.orliamod.objects.tools.NecrotiqueSpade;
import fr.jourboon.orliamod.objects.tools.NecrotiqueSword;
import fr.jourboon.orliamod.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {
	
	
	public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_MATERIAL_NECRO = EnumHelper.addToolMaterial("tool_necro", 3, 1600, 25.5F , 9.0F, 4);
	public static final ToolMaterial TOOL_MATERIAL_ANGEL = EnumHelper.addToolMaterial("tool_angel", 3, 1600, 25.5F , 9.0F, 4);
	public static final ArmorMaterial ARMOR_MATERIAL_NECRO = EnumHelper.addArmorMaterial("armor_necro", Reference.MODID + ":necrotiquearmor", 150, new int[]{5, 8, 10, 5}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F);
	public static final ArmorMaterial ARMOR_MATERIAL_ANGEL = EnumHelper.addArmorMaterial("armor_angel", Reference.MODID + ":angelite", 150, new int[]{5, 8, 10, 5}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.5F);
	
	//NECROTIQUE
	public static final Item NECROTIQUE = new ItemBase("necrotique");
	public static final Item NECROTIQUE_INGOT = new ItemBase("necrotique_ingot");
	
	//OUTILSNECRO
	public static final Item NECROTIQUE_PICKAXE = new NecrotiquePickaxe("necrotique_pickaxe", TOOL_MATERIAL_NECRO);
	public static final Item NECROTIQUE_SWORD = new NecrotiqueSword("necrotique_sword", TOOL_MATERIAL_NECRO);
	public static final Item NECROTIQUE_AXE = new NecrotiqueAxe("necrotique_axe", TOOL_MATERIAL_NECRO);
	public static final Item NECROTIQUE_SPADE = new NecrotiqueSpade("necrotique_spade", TOOL_MATERIAL_NECRO);
	
	//ARMORS
	public static final Item NECROTIQUE_HELMET = new ArmorNecrotique("necrotique_helmet", ARMOR_MATERIAL_NECRO, 2, EntityEquipmentSlot.HEAD);
	public static final Item NECROTIQUE_CHESTPLATE = new ArmorNecrotique("necrotique_chestplate", ARMOR_MATERIAL_NECRO, 1, EntityEquipmentSlot.CHEST);
	public static final Item NECROTIQUE_LEGGINGS = new ArmorNecrotique("necrotique_leggings", ARMOR_MATERIAL_NECRO, 1, EntityEquipmentSlot.LEGS);
	public static final Item NECROTIQUE_BOOTS = new ArmorNecrotique("necrotique_boots", ARMOR_MATERIAL_NECRO, 1, EntityEquipmentSlot.FEET);
	
	public static final Item ANGELITE_HELMET = new ArmorAngelite("angelite_helmet", ARMOR_MATERIAL_ANGEL, 2, EntityEquipmentSlot.HEAD);
	public static final Item ANGELITE_CHESTPLATE = new ArmorAngelite("angelite_chestplate", ARMOR_MATERIAL_ANGEL, 2, EntityEquipmentSlot.CHEST);
	public static final Item ANGELITE_LEGGINGS = new ArmorAngelite("angelite_leggings", ARMOR_MATERIAL_ANGEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item ANGELITE_BOOTS = new ArmorAngelite("angelite_boots", ARMOR_MATERIAL_ANGEL, 2, EntityEquipmentSlot.FEET);
	
	//ANGELITE
	public static final Item ANGELITE = new ItemBase("angelite");
	public static final Item ANGELITE_INGOT = new ItemBase("angelite_ingot");
	
	//OUTILS ANGELITE
	public static final Item ANGELITE_PICKAXE = new AngelitePickaxe("angelite_pickaxe", TOOL_MATERIAL_ANGEL);
	public static final Item ANGELITE_AXE = new AngeliteAxe("angelite_axe", TOOL_MATERIAL_ANGEL);
	public static final Item ANGELITE_SWORD = new AngeliteSword("angelite_sword", TOOL_MATERIAL_ANGEL);
	public static final Item ANGELITE_SPADE = new AngeliteSpade("angelite_spade", TOOL_MATERIAL_ANGEL);
	
	//ONYX
	public static final Item ONYX = new ItemBase("onyx");
	
	public static final Item RADAR = new ItemRadar("radar");
	
	public static final Item SUSANO = new ItemSusano("susano");
}
