package com.robinhood.android.charts.segmented;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: util.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/charts/segmented/ScrubLineType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SCRUBBING_DISABLED", "SCRUB_LINE_INVISIBLE", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ScrubLineType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScrubLineType[] $VALUES;
    public static final ScrubLineType DEFAULT = new ScrubLineType("DEFAULT", 0);
    public static final ScrubLineType SCRUBBING_DISABLED = new ScrubLineType("SCRUBBING_DISABLED", 1);
    public static final ScrubLineType SCRUB_LINE_INVISIBLE = new ScrubLineType("SCRUB_LINE_INVISIBLE", 2);

    private static final /* synthetic */ ScrubLineType[] $values() {
        return new ScrubLineType[]{DEFAULT, SCRUBBING_DISABLED, SCRUB_LINE_INVISIBLE};
    }

    public static EnumEntries<ScrubLineType> getEntries() {
        return $ENTRIES;
    }

    private ScrubLineType(String str, int i) {
    }

    static {
        ScrubLineType[] scrubLineTypeArr$values = $values();
        $VALUES = scrubLineTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(scrubLineTypeArr$values);
    }

    public static ScrubLineType valueOf(String str) {
        return (ScrubLineType) Enum.valueOf(ScrubLineType.class, str);
    }

    public static ScrubLineType[] values() {
        return (ScrubLineType[]) $VALUES.clone();
    }
}
