package com.robinhood.android.gold.upgrade.unified.component;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldUnifiedBottomBar.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/component/GoldUnifiedCtaStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ACHROMATIC", "GOLD_SPARKLE", "GOLD_STATIC", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.component.GoldUnifiedCtaStyle, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedBottomBar3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldUnifiedBottomBar3[] $VALUES;
    public static final GoldUnifiedBottomBar3 ACHROMATIC = new GoldUnifiedBottomBar3("ACHROMATIC", 0);
    public static final GoldUnifiedBottomBar3 GOLD_SPARKLE = new GoldUnifiedBottomBar3("GOLD_SPARKLE", 1);
    public static final GoldUnifiedBottomBar3 GOLD_STATIC = new GoldUnifiedBottomBar3("GOLD_STATIC", 2);

    private static final /* synthetic */ GoldUnifiedBottomBar3[] $values() {
        return new GoldUnifiedBottomBar3[]{ACHROMATIC, GOLD_SPARKLE, GOLD_STATIC};
    }

    public static EnumEntries<GoldUnifiedBottomBar3> getEntries() {
        return $ENTRIES;
    }

    private GoldUnifiedBottomBar3(String str, int i) {
    }

    static {
        GoldUnifiedBottomBar3[] goldUnifiedBottomBar3Arr$values = $values();
        $VALUES = goldUnifiedBottomBar3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldUnifiedBottomBar3Arr$values);
    }

    public static GoldUnifiedBottomBar3 valueOf(String str) {
        return (GoldUnifiedBottomBar3) Enum.valueOf(GoldUnifiedBottomBar3.class, str);
    }

    public static GoldUnifiedBottomBar3[] values() {
        return (GoldUnifiedBottomBar3[]) $VALUES.clone();
    }
}
