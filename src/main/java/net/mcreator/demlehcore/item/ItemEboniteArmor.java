
package net.mcreator.demlehcore.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class ItemEboniteArmor extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:ebonitearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("demlehcore:ebonitearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("demlehcore:ebonitearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("demlehcore:ebonitearmorboots")
	public static final Item boots = null;
	public ItemEboniteArmor(ElementsDemlehcoreMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EBONITEARMOR", "demlehcore:ebonite__", 60, new int[]{3, 7, 9, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3.6f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ebonitearmorhelmet")
				.setRegistryName("ebonitearmorhelmet").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ebonitearmorbody")
				.setRegistryName("ebonitearmorbody").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ebonitearmorlegs")
				.setRegistryName("ebonitearmorlegs").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ebonitearmorboots")
				.setRegistryName("ebonitearmorboots").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("demlehcore:ebonitearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("demlehcore:ebonitearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("demlehcore:ebonitearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("demlehcore:ebonitearmorboots", "inventory"));
	}
}
