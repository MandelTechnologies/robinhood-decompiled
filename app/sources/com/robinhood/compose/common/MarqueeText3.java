package com.robinhood.compose.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarqueeText.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/compose/common/MarqueeLayers;", "", "<init>", "(Ljava/lang/String;I)V", "MainText", "SecondaryText", "Gradient", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.MarqueeLayers, reason: use source file name */
/* loaded from: classes15.dex */
final class MarqueeText3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarqueeText3[] $VALUES;
    public static final MarqueeText3 MainText = new MarqueeText3("MainText", 0);
    public static final MarqueeText3 SecondaryText = new MarqueeText3("SecondaryText", 1);
    public static final MarqueeText3 Gradient = new MarqueeText3("Gradient", 2);

    private static final /* synthetic */ MarqueeText3[] $values() {
        return new MarqueeText3[]{MainText, SecondaryText, Gradient};
    }

    public static EnumEntries<MarqueeText3> getEntries() {
        return $ENTRIES;
    }

    private MarqueeText3(String str, int i) {
    }

    static {
        MarqueeText3[] marqueeText3Arr$values = $values();
        $VALUES = marqueeText3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(marqueeText3Arr$values);
    }

    public static MarqueeText3 valueOf(String str) {
        return (MarqueeText3) Enum.valueOf(MarqueeText3.class, str);
    }

    public static MarqueeText3[] values() {
        return (MarqueeText3[]) $VALUES.clone();
    }
}
