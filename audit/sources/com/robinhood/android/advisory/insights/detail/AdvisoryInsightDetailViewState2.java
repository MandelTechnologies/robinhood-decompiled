package com.robinhood.android.advisory.insights.detail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisoryInsightDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advisory/insights/detail/AudioButtonPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BAR", "BOTTOM_CTA", "NONE", "feature-advisory-insights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.insights.detail.AudioButtonPosition, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryInsightDetailViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisoryInsightDetailViewState2[] $VALUES;
    public static final AdvisoryInsightDetailViewState2 TOP_BAR = new AdvisoryInsightDetailViewState2("TOP_BAR", 0);
    public static final AdvisoryInsightDetailViewState2 BOTTOM_CTA = new AdvisoryInsightDetailViewState2("BOTTOM_CTA", 1);
    public static final AdvisoryInsightDetailViewState2 NONE = new AdvisoryInsightDetailViewState2("NONE", 2);

    private static final /* synthetic */ AdvisoryInsightDetailViewState2[] $values() {
        return new AdvisoryInsightDetailViewState2[]{TOP_BAR, BOTTOM_CTA, NONE};
    }

    public static EnumEntries<AdvisoryInsightDetailViewState2> getEntries() {
        return $ENTRIES;
    }

    private AdvisoryInsightDetailViewState2(String str, int i) {
    }

    static {
        AdvisoryInsightDetailViewState2[] advisoryInsightDetailViewState2Arr$values = $values();
        $VALUES = advisoryInsightDetailViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisoryInsightDetailViewState2Arr$values);
    }

    public static AdvisoryInsightDetailViewState2 valueOf(String str) {
        return (AdvisoryInsightDetailViewState2) Enum.valueOf(AdvisoryInsightDetailViewState2.class, str);
    }

    public static AdvisoryInsightDetailViewState2[] values() {
        return (AdvisoryInsightDetailViewState2[]) $VALUES.clone();
    }
}
