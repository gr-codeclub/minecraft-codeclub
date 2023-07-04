
package net.mcreator.rougayatou.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.rougayatou.world.features.treedecorators.RougayatouBiomeTrunkDecorator;
import net.mcreator.rougayatou.world.features.treedecorators.RougayatouBiomeLeaveDecorator;
import net.mcreator.rougayatou.world.features.treedecorators.RougayatouBiomeFruitDecorator;
import net.mcreator.rougayatou.init.RougayatouModEntities;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class RougayatouBiomeBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 1f),
					0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-1f, 1f),
					0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-39322).waterColor(-26215).waterFogColor(-6710785).skyColor(-39322).foliageColorOverride(-13057).grassColorOverride(-26215)
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.BUBBLE, 0.021f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("rougayatou:tree_rougayatou_biome",
						FeatureUtils.register("rougayatou:tree_rougayatou_biome", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.PINK_STAINED_GLASS.defaultBlockState()), new StraightTrunkPlacer(7, 2, 0),
										BlockStateProvider.simple(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1))
										.decorators(ImmutableList.of(RougayatouBiomeLeaveDecorator.INSTANCE, RougayatouBiomeTrunkDecorator.INSTANCE, RougayatouBiomeFruitDecorator.INSTANCE)).build()),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("rougayatou:grass_rougayatou_biome", VegetationFeatures.PATCH_GRASS,
				List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("rougayatou:flower_rougayatou_biome", VegetationFeatures.FLOWER_DEFAULT,
				List.of(CountPlacement.of(4), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.AXOLOTLS, new MobSpawnSettings.SpawnerData(RougayatouModEntities.HAPPY.get(), 21, 70, 109));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.BEE, 20, 4, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(1.8f).downfall(0.6f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
