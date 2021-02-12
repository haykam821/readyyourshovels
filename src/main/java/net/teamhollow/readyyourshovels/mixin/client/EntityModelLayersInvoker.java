package net.teamhollow.readyyourshovels.mixin.client;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EntityModelLayers.class)
public interface EntityModelLayersInvoker {
    @SuppressWarnings("unused")
    @Invoker("register")
    static EntityModelLayer register(String id, String layer) {
        throw new AssertionError();
    }
}
