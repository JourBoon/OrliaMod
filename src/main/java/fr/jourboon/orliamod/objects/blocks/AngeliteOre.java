package fr.jourboon.orliamod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AngeliteOre extends BlockBase{

	
	public AngeliteOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(15.0F);
		setResistance(13.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}
}
