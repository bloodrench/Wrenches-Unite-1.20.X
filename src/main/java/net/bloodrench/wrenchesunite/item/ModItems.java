package net.bloodrench.wrenchesunite.item;

import net.bloodrench.wrenchesunite.WrenchesUnite;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WrenchesUnite.MOD_ID);

    public static final RegistryObject<Item> BLOBDINETHERATE = ITEMS.register("blobdinetherate", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> REFINEDDINETHERATE = ITEMS.register("refineddinetherate", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> STICK_OF_BOOM = ITEMS.register("stick_of_boom", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
