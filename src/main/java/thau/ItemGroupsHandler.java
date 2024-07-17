package thau;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ItemGroupsHandler {
    public static final ItemGroup THAU_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemsHandler.TIN_INGOT))
            .displayName(Text.translatable("itemGroup.thau.thau_main_group"))
            .entries((context, entries) -> {
                entries.add(ItemsHandler.TIN_INGOT);
                entries.add(ItemsHandler.RAW_TIN);
                entries.add(BlocksHandler.TIN_ORE.asItem());
            })
            .build();
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("thau", "thau_main_group"), THAU_ITEM_GROUP);
    }
}
