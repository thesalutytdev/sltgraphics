package org.thesalutyt.sltgraphics.newapi;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Component {
    public static ITextComponent literal(String text) {
        return new StringTextComponent(text);
    }

    public static ITextComponent key(String key) {
        return new KeybindTextComponent(key);
    }

    public static ITextComponent empty() {
        return StringTextComponent.EMPTY;
    }

    public static ITextComponent translatable(String key) {
        return new TranslationTextComponent(key);
    }
}
