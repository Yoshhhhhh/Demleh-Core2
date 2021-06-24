
package net.mcreator.demlehcore.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.demlehcore.procedure.ProcedureMagmaHelmetProcedure;
import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;
import java.util.HashMap;

@ElementsDemlehcoreMod.ModElement.Tag
public class ItemMagmaHelmet extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:magma_helmethelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("demlehcore:magma_helmetbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("demlehcore:magma_helmetlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("demlehcore:magma_helmetboots")
	public static final Item boots = null;
	public ItemMagmaHelmet(ElementsDemlehcoreMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MAGMA_HELMET", "demlehcore:magma2__", 35, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1.7999999999999998f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureMagmaHelmetProcedure.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("magma_helmethelmet").setRegistryName("magma_helmethelmet").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("demlehcore:magma_helmethelmet", "inventory"));
	}
}
