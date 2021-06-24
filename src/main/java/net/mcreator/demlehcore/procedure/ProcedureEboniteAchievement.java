package net.mcreator.demlehcore.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.demlehcore.item.ItemMiniumPickaxe;
import net.mcreator.demlehcore.block.BlockEboniteOre;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Map;
import java.util.Iterator;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureEboniteAchievement extends ElementsDemlehcoreMod.ModElement {
	public ProcedureEboniteAchievement(ElementsDemlehcoreMod instance) {
		super(instance, 162);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure EboniteAchievement!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure EboniteAchievement!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure EboniteAchievement!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure EboniteAchievement!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure EboniteAchievement!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemMiniumPickaxe.block, (int) (1)).getItem())
				&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockEboniteOre.block.getDefaultState()
						.getBlock()))) {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager()
						.getAdvancement(new ResourceLocation("demlehcore:ebonite_first_time"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", (int) event.getPos().getX());
		dependencies.put("y", (int) event.getPos().getY());
		dependencies.put("z", (int) event.getPos().getZ());
		dependencies.put("px", (int) entity.posX);
		dependencies.put("py", (int) entity.posY);
		dependencies.put("pz", (int) entity.posZ);
		dependencies.put("world", event.getWorld());
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
