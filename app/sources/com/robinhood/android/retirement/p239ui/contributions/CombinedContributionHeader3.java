package com.robinhood.android.retirement.p239ui.contributions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CombinedContributionHeader.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/contributions/ContributionRingStyle;", "", "<init>", "(Ljava/lang/String;I)V", "MATCH", "FEDERAL_LIMIT", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionRingStyle, reason: use source file name */
/* loaded from: classes5.dex */
public final class CombinedContributionHeader3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CombinedContributionHeader3[] $VALUES;
    public static final CombinedContributionHeader3 MATCH = new CombinedContributionHeader3("MATCH", 0);
    public static final CombinedContributionHeader3 FEDERAL_LIMIT = new CombinedContributionHeader3("FEDERAL_LIMIT", 1);

    private static final /* synthetic */ CombinedContributionHeader3[] $values() {
        return new CombinedContributionHeader3[]{MATCH, FEDERAL_LIMIT};
    }

    public static EnumEntries<CombinedContributionHeader3> getEntries() {
        return $ENTRIES;
    }

    private CombinedContributionHeader3(String str, int i) {
    }

    static {
        CombinedContributionHeader3[] combinedContributionHeader3Arr$values = $values();
        $VALUES = combinedContributionHeader3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(combinedContributionHeader3Arr$values);
    }

    public static CombinedContributionHeader3 valueOf(String str) {
        return (CombinedContributionHeader3) Enum.valueOf(CombinedContributionHeader3.class, str);
    }

    public static CombinedContributionHeader3[] values() {
        return (CombinedContributionHeader3[]) $VALUES.clone();
    }
}
