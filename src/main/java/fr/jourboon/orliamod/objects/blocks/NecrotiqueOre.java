package fr.jourboon.orliamod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NecrotiqueOre extends BlockBase{
	
	public NecrotiqueOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(15.0F);
		setResistance(13.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}

}
