package com.robinhood.android.equitytradeladder.prefs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityPostTradeLadderFtuxState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_SEEN", "SHOW_FLATTEN_ORDERS_TOOLTIP", "SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP", "SHOW_FTUX_EDUCATION_TOOLIP", "ALREADY_SEEN", "nextState", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class EquityPostTradeLadderFtuxState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityPostTradeLadderFtuxState[] $VALUES;
    public static final EquityPostTradeLadderFtuxState NOT_SEEN = new EquityPostTradeLadderFtuxState("NOT_SEEN", 0) { // from class: com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState.NOT_SEEN
        /* renamed from: nextState, reason: collision with other method in class */
        public Void m14066nextState() {
            return null;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState
        public /* bridge */ /* synthetic */ EquityPostTradeLadderFtuxState nextState() {
            return (EquityPostTradeLadderFtuxState) m14066nextState();
        }
    };
    public static final EquityPostTradeLadderFtuxState SHOW_FLATTEN_ORDERS_TOOLTIP = new EquityPostTradeLadderFtuxState("SHOW_FLATTEN_ORDERS_TOOLTIP", 1) { // from class: com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState.SHOW_FLATTEN_ORDERS_TOOLTIP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState
        public EquityPostTradeLadderFtuxState nextState() {
            return EquityPostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP;
        }
    };
    public static final EquityPostTradeLadderFtuxState SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP = new EquityPostTradeLadderFtuxState("SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP", 2) { // from class: com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState.SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState
        public EquityPostTradeLadderFtuxState nextState() {
            return EquityPostTradeLadderFtuxState.SHOW_FTUX_EDUCATION_TOOLIP;
        }
    };
    public static final EquityPostTradeLadderFtuxState SHOW_FTUX_EDUCATION_TOOLIP = new EquityPostTradeLadderFtuxState("SHOW_FTUX_EDUCATION_TOOLIP", 3) { // from class: com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState.SHOW_FTUX_EDUCATION_TOOLIP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState
        public EquityPostTradeLadderFtuxState nextState() {
            return EquityPostTradeLadderFtuxState.ALREADY_SEEN;
        }
    };
    public static final EquityPostTradeLadderFtuxState ALREADY_SEEN = new EquityPostTradeLadderFtuxState("ALREADY_SEEN", 4) { // from class: com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState.ALREADY_SEEN
        @Override // com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState
        public EquityPostTradeLadderFtuxState nextState() {
            return this;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    };

    private static final /* synthetic */ EquityPostTradeLadderFtuxState[] $values() {
        return new EquityPostTradeLadderFtuxState[]{NOT_SEEN, SHOW_FLATTEN_ORDERS_TOOLTIP, SHOW_PNL_AND_PRICE_SWITCHER_TOOLTIP, SHOW_FTUX_EDUCATION_TOOLIP, ALREADY_SEEN};
    }

    public /* synthetic */ EquityPostTradeLadderFtuxState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<EquityPostTradeLadderFtuxState> getEntries() {
        return $ENTRIES;
    }

    public abstract EquityPostTradeLadderFtuxState nextState();

    private EquityPostTradeLadderFtuxState(String str, int i) {
    }

    static {
        EquityPostTradeLadderFtuxState[] equityPostTradeLadderFtuxStateArr$values = $values();
        $VALUES = equityPostTradeLadderFtuxStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityPostTradeLadderFtuxStateArr$values);
    }

    public static EquityPostTradeLadderFtuxState valueOf(String str) {
        return (EquityPostTradeLadderFtuxState) Enum.valueOf(EquityPostTradeLadderFtuxState.class, str);
    }

    public static EquityPostTradeLadderFtuxState[] values() {
        return (EquityPostTradeLadderFtuxState[]) $VALUES.clone();
    }
}
