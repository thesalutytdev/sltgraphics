package org.thesalutyt.sltgraphics.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import imgui.ImGui;
import imgui.flag.ImGuiConfigFlags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.thesalutyt.sltgraphics.Sltgraphics;
import org.thesalutyt.sltgraphics.client.imgui.ImGuiRenderer;

import java.util.function.LongSupplier;

@Mixin(RenderSystem.class)
public class RenderSystemMixin {
    @Inject( at = @At( value = "HEAD" ), method = "initRenderer(IZ)V" )
    private static void initRenderer(int p_initRenderer_0_, boolean p_initRenderer_1_, CallbackInfo ci) {
        Sltgraphics.LOGGER.info("Initializing ImGui");
        ImGuiRenderer.getInstance().init(()->{
            ImGui.getIO().addConfigFlags(ImGuiConfigFlags.ViewportsEnable);
            ImGui.getIO().addConfigFlags(ImGuiConfigFlags.DockingEnable);
        });
    }

    @Inject( at = @At( value = "HEAD"), method = "flipFrame(J)V" )
    private static void flipFrame(long p_69496_, CallbackInfo cbi) {
        RenderSystem.recordRenderCall(() -> ImGuiRenderer.getInstance().render());
    }
}

