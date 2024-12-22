package org.thesalutyt.sltgraphics.mixin;

import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public class MainMixin {
    @Inject( at = @At( value = "HEAD" ), method = "main" )
    private static void main(String[] p_main_0_, CallbackInfo ci) {
        System.out.println("Hello world!");
    }
}
