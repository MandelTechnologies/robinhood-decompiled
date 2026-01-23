package com.robinhood.android.advisory.returns;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReturnsChart.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/BarColorState;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT_SELECTED", "LIGHT_UNSELECTED", "DARK_SELECTED", "DARK_UNSELECTED", "Companion", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.returns.BarColorState, reason: use source file name */
/* loaded from: classes7.dex */
public final class ReturnsChart2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReturnsChart2[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ReturnsChart2 LIGHT_SELECTED = new ReturnsChart2("LIGHT_SELECTED", 0);
    public static final ReturnsChart2 LIGHT_UNSELECTED = new ReturnsChart2("LIGHT_UNSELECTED", 1);
    public static final ReturnsChart2 DARK_SELECTED = new ReturnsChart2("DARK_SELECTED", 2);
    public static final ReturnsChart2 DARK_UNSELECTED = new ReturnsChart2("DARK_UNSELECTED", 3);

    private static final /* synthetic */ ReturnsChart2[] $values() {
        return new ReturnsChart2[]{LIGHT_SELECTED, LIGHT_UNSELECTED, DARK_SELECTED, DARK_UNSELECTED};
    }

    public static EnumEntries<ReturnsChart2> getEntries() {
        return $ENTRIES;
    }

    private ReturnsChart2(String str, int i) {
    }

    static {
        ReturnsChart2[] returnsChart2Arr$values = $values();
        $VALUES = returnsChart2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(returnsChart2Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ReturnsChart.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advisory/returns/BarColorState$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/advisory/returns/BarColorState;", "isSelected", "", "isDay", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.returns.BarColorState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReturnsChart2 from(boolean isSelected, boolean isDay) {
            if (isDay && isSelected) {
                return ReturnsChart2.LIGHT_SELECTED;
            }
            if (isDay && !isSelected) {
                return ReturnsChart2.LIGHT_UNSELECTED;
            }
            if (!isDay && isSelected) {
                return ReturnsChart2.DARK_SELECTED;
            }
            return ReturnsChart2.DARK_UNSELECTED;
        }
    }

    public static ReturnsChart2 valueOf(String str) {
        return (ReturnsChart2) Enum.valueOf(ReturnsChart2.class, str);
    }

    public static ReturnsChart2[] values() {
        return (ReturnsChart2[]) $VALUES.clone();
    }
}
