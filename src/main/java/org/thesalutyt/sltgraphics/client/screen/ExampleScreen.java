package org.thesalutyt.sltgraphics.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import imgui.internal.ImGui;
import org.thesalutyt.sltgraphics.client.imgui.ImGuiRenderer;
import org.thesalutyt.sltgraphics.newapi.Component;

public class ExampleScreen extends ImGuiScreen {
    public ExampleScreen() {
        super(Component.literal("Example Screen"));
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        ImGuiRenderer.getInstance().draw(() -> {
            ImGui.showDemoWindow();
            ImGui.showUserGuide();
            ImGui.showFontSelector("Hello World!");

            ImGui.text("Hello World!");
        });
    }
}
