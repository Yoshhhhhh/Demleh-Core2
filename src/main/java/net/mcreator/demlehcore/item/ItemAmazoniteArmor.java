
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
public class ItemAmazoniteArmor extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:amazonitearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("demlehcore:amazonitearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("demlehcore:amazonitearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("demlehcore:amazonitearmorboots")
	public static final Item boots = null;
	public ItemAmazoniteArmor(ElementsDemlehcoreMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AMAZONITEARMOR", "demlehcore:amazonite__", 45, new int[]{3, 6, 8, 3}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("amazonitearmorhelmet")
				.setRegistryName("amazonitearmorhelmet").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("amazonitearmorbody")
				.setRegistryName("amazonitearmorbody").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("amazonitearmorlegs")
				.setRegistryName("amazonitearmorlegs").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("amazonitearmorboots")
				.setRegistryName("amazonitearmorboots").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("demlehcore:amazonitearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("demlehcore:amazonitearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("demlehcore:amazonitearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("demlehcore:amazonitearmorboots", "inventory"));
	}
}
