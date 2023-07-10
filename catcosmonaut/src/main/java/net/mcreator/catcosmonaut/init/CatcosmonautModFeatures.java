
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.catcosmonaut.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.catcosmonaut.world.features.plants.CatFeature;
import net.mcreator.catcosmonaut.CatcosmonautMod;

@Mod.EventBusSubscriber
public class CatcosmonautModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CatcosmonautMod.MODID);
	public static final RegistryObject<Feature<?>> CAT = REGISTRY.register("cat", CatFeature::feature);
}
