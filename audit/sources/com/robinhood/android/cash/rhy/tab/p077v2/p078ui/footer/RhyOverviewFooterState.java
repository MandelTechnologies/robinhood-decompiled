package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.footer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhyOverviewFooterState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/footer/RhyOverviewFooterState;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_CARD", "SHOW_TRANSFER_BUTTON", "HIDE_ALL", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyOverviewFooterState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhyOverviewFooterState[] $VALUES;
    public static final RhyOverviewFooterState SHOW_CARD = new RhyOverviewFooterState("SHOW_CARD", 0);
    public static final RhyOverviewFooterState SHOW_TRANSFER_BUTTON = new RhyOverviewFooterState("SHOW_TRANSFER_BUTTON", 1);
    public static final RhyOverviewFooterState HIDE_ALL = new RhyOverviewFooterState("HIDE_ALL", 2);

    private static final /* synthetic */ RhyOverviewFooterState[] $values() {
        return new RhyOverviewFooterState[]{SHOW_CARD, SHOW_TRANSFER_BUTTON, HIDE_ALL};
    }

    public static EnumEntries<RhyOverviewFooterState> getEntries() {
        return $ENTRIES;
    }

    private RhyOverviewFooterState(String str, int i) {
    }

    static {
        RhyOverviewFooterState[] rhyOverviewFooterStateArr$values = $values();
        $VALUES = rhyOverviewFooterStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhyOverviewFooterStateArr$values);
    }

    public static RhyOverviewFooterState valueOf(String str) {
        return (RhyOverviewFooterState) Enum.valueOf(RhyOverviewFooterState.class, str);
    }

    public static RhyOverviewFooterState[] values() {
        return (RhyOverviewFooterState[]) $VALUES.clone();
    }
}
