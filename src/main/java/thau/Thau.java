package thau;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class Thau implements ModInitializer {
	public static final RegistryKey<PlacedFeature> TIN_ORE_SMALL_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("thau","tin_ore_small"));
	public static final RegistryKey<PlacedFeature> TIN_ORE_LARGE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("thau","tin_ore_large"));
	
	@Override
	public void onInitialize() {
		ItemsHandler.initialize();
		BlocksHandler.initialize();
		ItemGroupsHandler.initialize();
		
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), Feature.UNDERGROUND_ORES, TIN_ORE_SMALL_PLACED_KEY);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), Feature.UNDERGROUND_ORES, TIN_ORE_LARGE_PLACED_KEY);
	}
}