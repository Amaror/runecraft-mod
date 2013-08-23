package amaror.rc;

import amaror.rc.blocks.ModBlocks;
import amaror.rc.configuration.ConfigHandler;
import amaror.rc.core.proxy.CommonProxy;
import amaror.rc.lib.Reference;
import amaror.rc.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(channels = {Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class )
public class Runecraft 
{
	
	
	@Instance(Reference.MOD_ID)
	public static Runecraft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		proxy.initSounds();
		proxy.initRenderers();
		
		ModBlocks.init();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		ModBlocks.addNames();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}

}
