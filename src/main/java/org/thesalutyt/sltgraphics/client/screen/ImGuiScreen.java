package org.thesalutyt.sltgraphics.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.ParametersAreNonnullByDefault;

public abstract class ImGuiScreen extends Screen {

    public ImGuiScreen(ITextComponent component) {
        super(component);
    }

    @Override
    @ParametersAreNonnullByDefault
    public abstract void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks);
}
