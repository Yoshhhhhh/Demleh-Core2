
package net.mcreator.demlehcore.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class BlockSouffreBlock extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:souffreblock")
	public static final Block block = null;
	public BlockSouffreBlock(ElementsDemlehcoreMod instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("souffreblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("demlehcore:souffreblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("souffreblock");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabDemleh.tab);
		}
	}
}
