package com.robinhood.android.investFlow.search.item;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryItems.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Card", "Chip", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemStyle, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoveryItems2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiscoveryItems2[] $VALUES;
    public static final DiscoveryItems2 Card = new DiscoveryItems2("Card", 0);
    public static final DiscoveryItems2 Chip = new DiscoveryItems2("Chip", 1);

    private static final /* synthetic */ DiscoveryItems2[] $values() {
        return new DiscoveryItems2[]{Card, Chip};
    }

    public static EnumEntries<DiscoveryItems2> getEntries() {
        return $ENTRIES;
    }

    private DiscoveryItems2(String str, int i) {
    }

    static {
        DiscoveryItems2[] discoveryItems2Arr$values = $values();
        $VALUES = discoveryItems2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(discoveryItems2Arr$values);
    }

    public static DiscoveryItems2 valueOf(String str) {
        return (DiscoveryItems2) Enum.valueOf(DiscoveryItems2.class, str);
    }

    public static DiscoveryItems2[] values() {
        return (DiscoveryItems2[]) $VALUES.clone();
    }
}
