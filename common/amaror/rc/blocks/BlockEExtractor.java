 package amaror.rc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import amaror.rc.lib.BlockInfos;
import amaror.rc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


 
public class BlockEExtractor extends Block{
		
	@SideOnly(Side.CLIENT)
	private Icon EExtractorTopIcon;
	@SideOnly(Side.CLIENT)
	private Icon EExtractorBottomIcon;
	@SideOnly(Side.CLIENT)
	private Icon EExtractorSideIcon;
	
	public BlockEExtractor(int id){
		super(id, Material.wood);
			
		setCreativeTab(CreativeTabs.tabRedstone);
		setHardness(1F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfos.EEXTRACTOR_UNLOCALIZED_NAME);
	}
		
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register){
		EExtractorTopIcon = register.registerIcon(Reference.TEXTURE_LOCATION + ":" + BlockInfos.EEXTRACTOR_TOP);
		EExtractorSideIcon = register.registerIcon(Reference.TEXTURE_LOCATION + ":" + BlockInfos.EEXTRACTOR_SIDE);
		EExtractorBottomIcon = register.registerIcon(Reference.TEXTURE_LOCATION + ":" + BlockInfos.EEXTRACTOR_BOTTOM);
	}
		
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta){
		if(side == 0){
			return EExtractorBottomIcon;
		}
		else if(side == 1){
			return EExtractorTopIcon;
		}
		else{
			return EExtractorSideIcon;
		}
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if (player.isSneaking())
			return false;
		
		
		return true;
	}
		
}