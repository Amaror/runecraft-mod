package amaror.rc.configuration;

import java.io.File;

import amaror.rc.lib.BlockInfos;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	
	public static void init(File configurationFile){
		Configuration config = new Configuration(configurationFile);
		
		config.load();
		
		//Block ID's
		BlockInfos.EEXTRACTOR_ID = config.getBlock("Block ID'S", BlockInfos.EEXTRACTOR_KEY, BlockInfos.EEXTRACTOR_DEFAULT_ID).getInt();
		
		config.save();
	}

}
