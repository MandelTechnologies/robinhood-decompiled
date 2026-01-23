package com.robinhood.android.investmentstracker.viewmodels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestmentsTrackerComponentType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY_SECTION", "BUTTON", "UPSELL", "MANAGE_EXTERNAL_ACCOUNTS", "PERFORMANCE_CHART", "PERFORMANCE_CHART_HEADER", "METADATA", "ALLOCATION_SWITCHER", "CATEGORY_PERCENTAGE", "ALLOCATION_BAR", "DISCLOSURE_MARKDOWN", "UPSELL_CARD", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestmentsTrackerComponentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerComponentType[] $VALUES;
    public static final InvestmentsTrackerComponentType CATEGORY_SECTION = new InvestmentsTrackerComponentType("CATEGORY_SECTION", 0);
    public static final InvestmentsTrackerComponentType BUTTON = new InvestmentsTrackerComponentType("BUTTON", 1);
    public static final InvestmentsTrackerComponentType UPSELL = new InvestmentsTrackerComponentType("UPSELL", 2);
    public static final InvestmentsTrackerComponentType MANAGE_EXTERNAL_ACCOUNTS = new InvestmentsTrackerComponentType("MANAGE_EXTERNAL_ACCOUNTS", 3);
    public static final InvestmentsTrackerComponentType PERFORMANCE_CHART = new InvestmentsTrackerComponentType("PERFORMANCE_CHART", 4);
    public static final InvestmentsTrackerComponentType PERFORMANCE_CHART_HEADER = new InvestmentsTrackerComponentType("PERFORMANCE_CHART_HEADER", 5);
    public static final InvestmentsTrackerComponentType METADATA = new InvestmentsTrackerComponentType("METADATA", 6);
    public static final InvestmentsTrackerComponentType ALLOCATION_SWITCHER = new InvestmentsTrackerComponentType("ALLOCATION_SWITCHER", 7);
    public static final InvestmentsTrackerComponentType CATEGORY_PERCENTAGE = new InvestmentsTrackerComponentType("CATEGORY_PERCENTAGE", 8);
    public static final InvestmentsTrackerComponentType ALLOCATION_BAR = new InvestmentsTrackerComponentType("ALLOCATION_BAR", 9);
    public static final InvestmentsTrackerComponentType DISCLOSURE_MARKDOWN = new InvestmentsTrackerComponentType("DISCLOSURE_MARKDOWN", 10);
    public static final InvestmentsTrackerComponentType UPSELL_CARD = new InvestmentsTrackerComponentType("UPSELL_CARD", 11);

    private static final /* synthetic */ InvestmentsTrackerComponentType[] $values() {
        return new InvestmentsTrackerComponentType[]{CATEGORY_SECTION, BUTTON, UPSELL, MANAGE_EXTERNAL_ACCOUNTS, PERFORMANCE_CHART, PERFORMANCE_CHART_HEADER, METADATA, ALLOCATION_SWITCHER, CATEGORY_PERCENTAGE, ALLOCATION_BAR, DISCLOSURE_MARKDOWN, UPSELL_CARD};
    }

    public static EnumEntries<InvestmentsTrackerComponentType> getEntries() {
        return $ENTRIES;
    }

    private InvestmentsTrackerComponentType(String str, int i) {
    }

    static {
        InvestmentsTrackerComponentType[] investmentsTrackerComponentTypeArr$values = $values();
        $VALUES = investmentsTrackerComponentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerComponentTypeArr$values);
    }

    public static InvestmentsTrackerComponentType valueOf(String str) {
        return (InvestmentsTrackerComponentType) Enum.valueOf(InvestmentsTrackerComponentType.class, str);
    }

    public static InvestmentsTrackerComponentType[] values() {
        return (InvestmentsTrackerComponentType[]) $VALUES.clone();
    }
}
