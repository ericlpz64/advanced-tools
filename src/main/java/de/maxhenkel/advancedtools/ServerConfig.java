package de.maxhenkel.advancedtools;

import de.maxhenkel.corelib.config.ConfigBase;
import net.minecraftforge.common.ForgeConfigSpec;

public class ServerConfig extends ConfigBase {

    public final ForgeConfigSpec.BooleanValue toolItemsNeverDespawn;
    public final ForgeConfigSpec.BooleanValue toolItemsIndestructible;

    public ServerConfig(ForgeConfigSpec.Builder builder) {
        super(builder);
        toolItemsNeverDespawn = builder
                .comment("If tool items should never despawn")
                .define("tool_items_never_despawn", false);
        toolItemsIndestructible = builder
                .comment("If tool items should be indestructible")
                .define("tool_items_indestructible", false);
    }

}
