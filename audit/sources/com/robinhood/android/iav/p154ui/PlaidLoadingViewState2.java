package com.robinhood.android.iav.p154ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaidLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/Action;", "", "<init>", "(Ljava/lang/String;I)V", "DEACTIVATE_ACCOUNT", "REACHED_LINKED_ACH_RELATIONSHIPS_LIMIT", "SHOW_PLAID_FLOW", "SHOW_MICRO_DEPOSITS_FLOW", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.iav.ui.Action, reason: use source file name */
/* loaded from: classes10.dex */
public final class PlaidLoadingViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlaidLoadingViewState2[] $VALUES;
    public static final PlaidLoadingViewState2 DEACTIVATE_ACCOUNT = new PlaidLoadingViewState2("DEACTIVATE_ACCOUNT", 0);
    public static final PlaidLoadingViewState2 REACHED_LINKED_ACH_RELATIONSHIPS_LIMIT = new PlaidLoadingViewState2("REACHED_LINKED_ACH_RELATIONSHIPS_LIMIT", 1);
    public static final PlaidLoadingViewState2 SHOW_PLAID_FLOW = new PlaidLoadingViewState2("SHOW_PLAID_FLOW", 2);
    public static final PlaidLoadingViewState2 SHOW_MICRO_DEPOSITS_FLOW = new PlaidLoadingViewState2("SHOW_MICRO_DEPOSITS_FLOW", 3);

    private static final /* synthetic */ PlaidLoadingViewState2[] $values() {
        return new PlaidLoadingViewState2[]{DEACTIVATE_ACCOUNT, REACHED_LINKED_ACH_RELATIONSHIPS_LIMIT, SHOW_PLAID_FLOW, SHOW_MICRO_DEPOSITS_FLOW};
    }

    public static EnumEntries<PlaidLoadingViewState2> getEntries() {
        return $ENTRIES;
    }

    private PlaidLoadingViewState2(String str, int i) {
    }

    static {
        PlaidLoadingViewState2[] plaidLoadingViewState2Arr$values = $values();
        $VALUES = plaidLoadingViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(plaidLoadingViewState2Arr$values);
    }

    public static PlaidLoadingViewState2 valueOf(String str) {
        return (PlaidLoadingViewState2) Enum.valueOf(PlaidLoadingViewState2.class, str);
    }

    public static PlaidLoadingViewState2[] values() {
        return (PlaidLoadingViewState2[]) $VALUES.clone();
    }
}
