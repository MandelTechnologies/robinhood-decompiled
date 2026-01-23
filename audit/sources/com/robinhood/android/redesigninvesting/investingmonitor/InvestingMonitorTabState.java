package com.robinhood.android.redesigninvesting.investingmonitor;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorTabState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/InvestingMonitorTabState;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_TAB", "HIDE_TAB", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorTabState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestingMonitorTabState[] $VALUES;
    public static final InvestingMonitorTabState SHOW_TAB = new InvestingMonitorTabState("SHOW_TAB", 0);
    public static final InvestingMonitorTabState HIDE_TAB = new InvestingMonitorTabState("HIDE_TAB", 1);

    private static final /* synthetic */ InvestingMonitorTabState[] $values() {
        return new InvestingMonitorTabState[]{SHOW_TAB, HIDE_TAB};
    }

    public static EnumEntries<InvestingMonitorTabState> getEntries() {
        return $ENTRIES;
    }

    private InvestingMonitorTabState(String str, int i) {
    }

    static {
        InvestingMonitorTabState[] investingMonitorTabStateArr$values = $values();
        $VALUES = investingMonitorTabStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investingMonitorTabStateArr$values);
    }

    public static InvestingMonitorTabState valueOf(String str) {
        return (InvestingMonitorTabState) Enum.valueOf(InvestingMonitorTabState.class, str);
    }

    public static InvestingMonitorTabState[] values() {
        return (InvestingMonitorTabState[]) $VALUES.clone();
    }
}
