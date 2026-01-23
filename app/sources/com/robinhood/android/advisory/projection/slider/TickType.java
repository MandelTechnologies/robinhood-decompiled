package com.robinhood.android.advisory.projection.slider;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/slider/TickType;", "", "<init>", "(Ljava/lang/String;I)V", "MINOR", "MAJOR", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class TickType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TickType[] $VALUES;
    public static final TickType MINOR = new TickType("MINOR", 0);
    public static final TickType MAJOR = new TickType("MAJOR", 1);

    private static final /* synthetic */ TickType[] $values() {
        return new TickType[]{MINOR, MAJOR};
    }

    public static EnumEntries<TickType> getEntries() {
        return $ENTRIES;
    }

    private TickType(String str, int i) {
    }

    static {
        TickType[] tickTypeArr$values = $values();
        $VALUES = tickTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tickTypeArr$values);
    }

    public static TickType valueOf(String str) {
        return (TickType) Enum.valueOf(TickType.class, str);
    }

    public static TickType[] values() {
        return (TickType[]) $VALUES.clone();
    }
}
