package thau;

import net.fabricmc.api.ModInitializer;

public class Thau implements ModInitializer {
	@Override
	public void onInitialize() {
		ItemsHandler.initialize();
		BlocksHandler.initialize();
		ItemGroupsHandler.initialize();
	}
}