package com.robinhood.android.event.detail.builders;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuildMultiTradeBarData.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/detail/builders/Side;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.builders.Side, reason: use source file name */
/* loaded from: classes3.dex */
final class BuildMultiTradeBarData2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BuildMultiTradeBarData2[] $VALUES;
    public static final BuildMultiTradeBarData2 LEFT = new BuildMultiTradeBarData2("LEFT", 0);
    public static final BuildMultiTradeBarData2 RIGHT = new BuildMultiTradeBarData2("RIGHT", 1);

    private static final /* synthetic */ BuildMultiTradeBarData2[] $values() {
        return new BuildMultiTradeBarData2[]{LEFT, RIGHT};
    }

    public static EnumEntries<BuildMultiTradeBarData2> getEntries() {
        return $ENTRIES;
    }

    private BuildMultiTradeBarData2(String str, int i) {
    }

    static {
        BuildMultiTradeBarData2[] buildMultiTradeBarData2Arr$values = $values();
        $VALUES = buildMultiTradeBarData2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(buildMultiTradeBarData2Arr$values);
    }

    public static BuildMultiTradeBarData2 valueOf(String str) {
        return (BuildMultiTradeBarData2) Enum.valueOf(BuildMultiTradeBarData2.class, str);
    }

    public static BuildMultiTradeBarData2[] values() {
        return (BuildMultiTradeBarData2[]) $VALUES.clone();
    }
}
