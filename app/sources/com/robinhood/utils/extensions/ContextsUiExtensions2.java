package com.robinhood.utils.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContextsUiExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/extensions/DensitySpec;", "", "multiplier", "", "<init>", "(Ljava/lang/String;IF)V", "getMultiplier", "()F", "MDPI", "HDPI", "XHDPI", "XXHDPI", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.DensitySpec, reason: use source file name */
/* loaded from: classes21.dex */
public final class ContextsUiExtensions2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContextsUiExtensions2[] $VALUES;
    private final float multiplier;
    public static final ContextsUiExtensions2 MDPI = new ContextsUiExtensions2("MDPI", 0, 1.0f);
    public static final ContextsUiExtensions2 HDPI = new ContextsUiExtensions2("HDPI", 1, 1.5f);
    public static final ContextsUiExtensions2 XHDPI = new ContextsUiExtensions2("XHDPI", 2, 2.0f);
    public static final ContextsUiExtensions2 XXHDPI = new ContextsUiExtensions2("XXHDPI", 3, 3.0f);

    private static final /* synthetic */ ContextsUiExtensions2[] $values() {
        return new ContextsUiExtensions2[]{MDPI, HDPI, XHDPI, XXHDPI};
    }

    public static EnumEntries<ContextsUiExtensions2> getEntries() {
        return $ENTRIES;
    }

    private ContextsUiExtensions2(String str, int i, float f) {
        this.multiplier = f;
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    static {
        ContextsUiExtensions2[] contextsUiExtensions2Arr$values = $values();
        $VALUES = contextsUiExtensions2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(contextsUiExtensions2Arr$values);
    }

    public static ContextsUiExtensions2 valueOf(String str) {
        return (ContextsUiExtensions2) Enum.valueOf(ContextsUiExtensions2.class, str);
    }

    public static ContextsUiExtensions2[] values() {
        return (ContextsUiExtensions2[]) $VALUES.clone();
    }
}
