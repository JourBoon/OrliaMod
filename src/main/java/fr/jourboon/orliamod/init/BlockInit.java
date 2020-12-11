package fr.jourboon.orliamod.init;

import java.util.ArrayList;

import fr.jourboon.orliamod.objects.blocks.AngeliteBlock;
import fr.jourboon.orliamod.objects.blocks.AngeliteOre;
import fr.jourboon.orliamod.objects.blocks.BlockBase;
import fr.jourboon.orliamod.objects.blocks.CaveBlock;
import fr.jourboon.orliamod.objects.blocks.NecrotiqueBlock;
import fr.jourboon.orliamod.objects.blocks.NecrotiqueOre;
import fr.jourboon.orliamod.objects.blocks.OnyxOre;
import fr.jourboon.orliamod.objects.blocks.StarOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final ArrayList<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NECROTIQUE_ORE = new NecrotiqueOre("necrotique_ore", Material.ROCK);
	public static final Block ANGELITE_ORE = new AngeliteOre("angelite_ore", Material.ROCK);
	public static final Block ONYX_ORE = new OnyxOre("onyx_ore", Material.ROCK);
	public static final Block STAR_ORE = new StarOre("star_ore", Material.ROCK);
	public static final Block NECROTIQUE_BLOCK = new NecrotiqueBlock("necrotique_block", Material.IRON);
	public static final Block ANGELITE_BLOCK = new AngeliteBlock("angelite_block", Material.IRON);

	
	
	
	public static final Block CAVE_BLOCK = new CaveBlock("cave_block", Material.GLASS);
}
