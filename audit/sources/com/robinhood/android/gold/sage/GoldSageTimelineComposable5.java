package com.robinhood.android.gold.sage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldSageTimelineComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/TimelinePositionType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_COMPLETE", "SECOND_INCOMPLETE", "BETWEEN_INCOMPLETE", "BOTTOM_INCOMPLETE", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.TimelinePositionType, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageTimelineComposable5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldSageTimelineComposable5[] $VALUES;
    public static final GoldSageTimelineComposable5 TOP_COMPLETE = new GoldSageTimelineComposable5("TOP_COMPLETE", 0);
    public static final GoldSageTimelineComposable5 SECOND_INCOMPLETE = new GoldSageTimelineComposable5("SECOND_INCOMPLETE", 1);
    public static final GoldSageTimelineComposable5 BETWEEN_INCOMPLETE = new GoldSageTimelineComposable5("BETWEEN_INCOMPLETE", 2);
    public static final GoldSageTimelineComposable5 BOTTOM_INCOMPLETE = new GoldSageTimelineComposable5("BOTTOM_INCOMPLETE", 3);

    private static final /* synthetic */ GoldSageTimelineComposable5[] $values() {
        return new GoldSageTimelineComposable5[]{TOP_COMPLETE, SECOND_INCOMPLETE, BETWEEN_INCOMPLETE, BOTTOM_INCOMPLETE};
    }

    public static EnumEntries<GoldSageTimelineComposable5> getEntries() {
        return $ENTRIES;
    }

    private GoldSageTimelineComposable5(String str, int i) {
    }

    static {
        GoldSageTimelineComposable5[] goldSageTimelineComposable5Arr$values = $values();
        $VALUES = goldSageTimelineComposable5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldSageTimelineComposable5Arr$values);
    }

    public static GoldSageTimelineComposable5 valueOf(String str) {
        return (GoldSageTimelineComposable5) Enum.valueOf(GoldSageTimelineComposable5.class, str);
    }

    public static GoldSageTimelineComposable5[] values() {
        return (GoldSageTimelineComposable5[]) $VALUES.clone();
    }
}
