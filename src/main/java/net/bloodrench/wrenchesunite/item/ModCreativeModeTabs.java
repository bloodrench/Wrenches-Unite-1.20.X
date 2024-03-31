package net.bloodrench.wrenchesunite.item;

import net.bloodrench.wrenchesunite.WrenchesUnite;
import net.bloodrench.wrenchesunite.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WrenchesUnite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODDED_MATS_TAB = CREATIVE_MODE_TABS.register("wrenchesunitemats", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.REFINEDDINETHERATE.get()))
            .title(Component.translatable("creativetab.wrenchesunitematstab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModBlocks.BLOCK_OF_BOOM.get());
                pOutput.accept(ModItems.STICK_OF_BOOM.get());
                pOutput.accept(ModItems.BLOBDINETHERATE.get());
                pOutput.accept(ModItems.REFINEDDINETHERATE.get());
            })
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
