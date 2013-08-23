package amaror.rc.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import amaror.rc.lib.BlockInfos;

public class ModBlocks {
	
	//Mod - Block instances
	public static Block EssenceExtractor;
	
	public static void init(){
		
		EssenceExtractor = new BlockEExtractor(BlockInfos.EEXTRACTOR_ID);
		GameRegistry.registerBlock(EssenceExtractor, BlockInfos.EEXTRACTOR_KEY);
	}
	
	public static void addNames(){
		LanguageRegistry.addName(EssenceExtractor, BlockInfos.EEXTRACTOR_NAME);
	}
}
