package fr.jourboon.orliamod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CaveBlock extends BlockBase{

	
	public CaveBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.ANVIL);
		setHardness(5.0F);
		setResistance(8.0F);
		setHarvestLevel("pickaxe", 1);
		
		
	}
}
