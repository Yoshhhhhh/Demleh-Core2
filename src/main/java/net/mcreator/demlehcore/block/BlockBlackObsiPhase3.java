
package net.mcreator.demlehcore.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.demlehcore.procedure.ProcedureXPBreakBlackObsi;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;
import java.util.HashMap;

@ElementsDemlehcoreMod.ModElement.Tag
public class BlockBlackObsiPhase3 extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:blackobsiphase3")
	public static final Block block = null;
	public BlockBlackObsiPhase3(ElementsDemlehcoreMod instance) {
		super(instance, 115);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("blackobsiphase3"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("demlehcore:blackobsiphase3", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("blackobsiphase3");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 4);
			setHardness(25F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(null);
		}

		@Override
		public void onBlockDestroyedByExplosion(World world, BlockPos pos, Explosion e) {
			super.onBlockDestroyedByExplosion(world, pos, e);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureXPBreakBlackObsi.executeProcedure($_dependencies);
			}
		}
	}
}
