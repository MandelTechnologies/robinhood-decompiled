package com.robinhood.android.investmentstracker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestmentsTrackerNativeAction.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY_CLICKED", "CONNECT_ACCOUNT_CLICKED", "MANAGE_ACCOUNTS_CLICKED", "SPAN_SELECTED", "SWITCHER_SELECTED", "ALLOCATION_BAR_SELECTED", "METADATA_SELECTED", "METADATA_RECONNECT_SELECTED", "ACCOUNT_CELL_RECONNECT_SELECTED", "CATEGORY_PERCENTAGE_ITEM_CLICKED", "ALLOCATION_BAR_TOP_SELECTED", "UPSELL_CLOSE_CARD_CLICKED", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestmentsTrackerNativeAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerNativeAction[] $VALUES;
    public static final InvestmentsTrackerNativeAction CATEGORY_CLICKED = new InvestmentsTrackerNativeAction("CATEGORY_CLICKED", 0);
    public static final InvestmentsTrackerNativeAction CONNECT_ACCOUNT_CLICKED = new InvestmentsTrackerNativeAction("CONNECT_ACCOUNT_CLICKED", 1);
    public static final InvestmentsTrackerNativeAction MANAGE_ACCOUNTS_CLICKED = new InvestmentsTrackerNativeAction("MANAGE_ACCOUNTS_CLICKED", 2);
    public static final InvestmentsTrackerNativeAction SPAN_SELECTED = new InvestmentsTrackerNativeAction("SPAN_SELECTED", 3);
    public static final InvestmentsTrackerNativeAction SWITCHER_SELECTED = new InvestmentsTrackerNativeAction("SWITCHER_SELECTED", 4);
    public static final InvestmentsTrackerNativeAction ALLOCATION_BAR_SELECTED = new InvestmentsTrackerNativeAction("ALLOCATION_BAR_SELECTED", 5);
    public static final InvestmentsTrackerNativeAction METADATA_SELECTED = new InvestmentsTrackerNativeAction("METADATA_SELECTED", 6);
    public static final InvestmentsTrackerNativeAction METADATA_RECONNECT_SELECTED = new InvestmentsTrackerNativeAction("METADATA_RECONNECT_SELECTED", 7);
    public static final InvestmentsTrackerNativeAction ACCOUNT_CELL_RECONNECT_SELECTED = new InvestmentsTrackerNativeAction("ACCOUNT_CELL_RECONNECT_SELECTED", 8);
    public static final InvestmentsTrackerNativeAction CATEGORY_PERCENTAGE_ITEM_CLICKED = new InvestmentsTrackerNativeAction("CATEGORY_PERCENTAGE_ITEM_CLICKED", 9);
    public static final InvestmentsTrackerNativeAction ALLOCATION_BAR_TOP_SELECTED = new InvestmentsTrackerNativeAction("ALLOCATION_BAR_TOP_SELECTED", 10);
    public static final InvestmentsTrackerNativeAction UPSELL_CLOSE_CARD_CLICKED = new InvestmentsTrackerNativeAction("UPSELL_CLOSE_CARD_CLICKED", 11);

    private static final /* synthetic */ InvestmentsTrackerNativeAction[] $values() {
        return new InvestmentsTrackerNativeAction[]{CATEGORY_CLICKED, CONNECT_ACCOUNT_CLICKED, MANAGE_ACCOUNTS_CLICKED, SPAN_SELECTED, SWITCHER_SELECTED, ALLOCATION_BAR_SELECTED, METADATA_SELECTED, METADATA_RECONNECT_SELECTED, ACCOUNT_CELL_RECONNECT_SELECTED, CATEGORY_PERCENTAGE_ITEM_CLICKED, ALLOCATION_BAR_TOP_SELECTED, UPSELL_CLOSE_CARD_CLICKED};
    }

    public static EnumEntries<InvestmentsTrackerNativeAction> getEntries() {
        return $ENTRIES;
    }

    private InvestmentsTrackerNativeAction(String str, int i) {
    }

    static {
        InvestmentsTrackerNativeAction[] investmentsTrackerNativeActionArr$values = $values();
        $VALUES = investmentsTrackerNativeActionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerNativeActionArr$values);
    }

    public static InvestmentsTrackerNativeAction valueOf(String str) {
        return (InvestmentsTrackerNativeAction) Enum.valueOf(InvestmentsTrackerNativeAction.class, str);
    }

    public static InvestmentsTrackerNativeAction[] values() {
        return (InvestmentsTrackerNativeAction[]) $VALUES.clone();
    }
}
