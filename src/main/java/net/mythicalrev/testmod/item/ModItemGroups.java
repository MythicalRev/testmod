package net.mythicalrev.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mythicalrev.testmod.TestMod;
import net.mythicalrev.testmod.block.ModBlocks;

public class ModItemGroups {
public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(TestMod.MOD_ID, "ruby"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                    entries.add(ModItems.RUBY);
                    entries.add(ModItems.RAW_RUBY);

                    entries.add(ModBlocks.RUBY_BLOCK);
                    entries.add(ModBlocks.RAW_RUBY_BLOCK);

                    entries.add(ModBlocks.RUBY_ORE);
                    entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                    entries.add(ModBlocks.NETHER_RUBY_ORE);
                    entries.add(ModBlocks.END_STONE_RUBY_ORE);

                    entries.add(ModItems.METAL_DETECTOR);
                }).build());

    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups");
    }

}
