package com.robinhood.android.advisory.returns;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/ReturnsAnimPhase;", "", "<init>", "(Ljava/lang/String;I)V", "INTRO", "IN_PLACE", "REMOVAL", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.ReturnsAnimPhase, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsChart4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReturnsChart4[] $VALUES;
    public static final ReturnsChart4 INTRO = new ReturnsChart4("INTRO", 0);
    public static final ReturnsChart4 IN_PLACE = new ReturnsChart4("IN_PLACE", 1);
    public static final ReturnsChart4 REMOVAL = new ReturnsChart4("REMOVAL", 2);

    private static final /* synthetic */ ReturnsChart4[] $values() {
        return new ReturnsChart4[]{INTRO, IN_PLACE, REMOVAL};
    }

    public static EnumEntries<ReturnsChart4> getEntries() {
        return $ENTRIES;
    }

    private ReturnsChart4(String str, int i) {
    }

    static {
        ReturnsChart4[] returnsChart4Arr$values = $values();
        $VALUES = returnsChart4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(returnsChart4Arr$values);
    }

    public static ReturnsChart4 valueOf(String str) {
        return (ReturnsChart4) Enum.valueOf(ReturnsChart4.class, str);
    }

    public static ReturnsChart4[] values() {
        return (ReturnsChart4[]) $VALUES.clone();
    }
}
