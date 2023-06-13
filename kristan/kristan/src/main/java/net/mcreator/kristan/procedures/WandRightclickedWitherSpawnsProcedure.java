package net.mcreator.kristan.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WandRightclickedWitherSpawnsProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double y, double z) {
		execute(null, world, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new Warden(EntityType.WARDEN, _level);
			entityToSpawn.moveTo(5, y, z, 8, 12);
			entityToSpawn.setYBodyRot(8);
			entityToSpawn.setYHeadRot(8);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
