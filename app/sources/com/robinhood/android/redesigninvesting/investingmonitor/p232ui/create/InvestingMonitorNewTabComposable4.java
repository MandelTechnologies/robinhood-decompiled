package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.create;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorNewTabComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/create/State;", "", "<init>", "(Ljava/lang/String;I)V", "HIDE_BOTTOMSHEET", "SHOW_BOTTOMSHEET", "CREATE_WATCHLIST", "CREATE_SCREENER", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.create.State, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorNewTabComposable4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestingMonitorNewTabComposable4[] $VALUES;
    public static final InvestingMonitorNewTabComposable4 HIDE_BOTTOMSHEET = new InvestingMonitorNewTabComposable4("HIDE_BOTTOMSHEET", 0);
    public static final InvestingMonitorNewTabComposable4 SHOW_BOTTOMSHEET = new InvestingMonitorNewTabComposable4("SHOW_BOTTOMSHEET", 1);
    public static final InvestingMonitorNewTabComposable4 CREATE_WATCHLIST = new InvestingMonitorNewTabComposable4("CREATE_WATCHLIST", 2);
    public static final InvestingMonitorNewTabComposable4 CREATE_SCREENER = new InvestingMonitorNewTabComposable4("CREATE_SCREENER", 3);

    private static final /* synthetic */ InvestingMonitorNewTabComposable4[] $values() {
        return new InvestingMonitorNewTabComposable4[]{HIDE_BOTTOMSHEET, SHOW_BOTTOMSHEET, CREATE_WATCHLIST, CREATE_SCREENER};
    }

    public static EnumEntries<InvestingMonitorNewTabComposable4> getEntries() {
        return $ENTRIES;
    }

    private InvestingMonitorNewTabComposable4(String str, int i) {
    }

    static {
        InvestingMonitorNewTabComposable4[] investingMonitorNewTabComposable4Arr$values = $values();
        $VALUES = investingMonitorNewTabComposable4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(investingMonitorNewTabComposable4Arr$values);
    }

    public static InvestingMonitorNewTabComposable4 valueOf(String str) {
        return (InvestingMonitorNewTabComposable4) Enum.valueOf(InvestingMonitorNewTabComposable4.class, str);
    }

    public static InvestingMonitorNewTabComposable4[] values() {
        return (InvestingMonitorNewTabComposable4[]) $VALUES.clone();
    }
}
