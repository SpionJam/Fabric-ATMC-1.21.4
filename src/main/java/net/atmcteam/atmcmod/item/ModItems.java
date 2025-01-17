package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Helper-Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ATMCMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ATMCMod.LOGGER.info("Registering Mod Items for " + ATMCMod.MOD_ID);
    }
}
