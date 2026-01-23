package com.robinhood.android.gold.upgrade.unified.screen;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GoldUnifiedSingleAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/unified/screen/GoldUnifiedSingleAgreementReviewStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNREVIEWED", "REVIEWED", "ACCEPTED", "feature-gold-upgrade_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementReviewStatus, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedSingleAgreementViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldUnifiedSingleAgreementViewState2[] $VALUES;
    public static final GoldUnifiedSingleAgreementViewState2 UNREVIEWED = new GoldUnifiedSingleAgreementViewState2("UNREVIEWED", 0);
    public static final GoldUnifiedSingleAgreementViewState2 REVIEWED = new GoldUnifiedSingleAgreementViewState2("REVIEWED", 1);
    public static final GoldUnifiedSingleAgreementViewState2 ACCEPTED = new GoldUnifiedSingleAgreementViewState2("ACCEPTED", 2);

    private static final /* synthetic */ GoldUnifiedSingleAgreementViewState2[] $values() {
        return new GoldUnifiedSingleAgreementViewState2[]{UNREVIEWED, REVIEWED, ACCEPTED};
    }

    public static EnumEntries<GoldUnifiedSingleAgreementViewState2> getEntries() {
        return $ENTRIES;
    }

    private GoldUnifiedSingleAgreementViewState2(String str, int i) {
    }

    static {
        GoldUnifiedSingleAgreementViewState2[] goldUnifiedSingleAgreementViewState2Arr$values = $values();
        $VALUES = goldUnifiedSingleAgreementViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldUnifiedSingleAgreementViewState2Arr$values);
    }

    public static GoldUnifiedSingleAgreementViewState2 valueOf(String str) {
        return (GoldUnifiedSingleAgreementViewState2) Enum.valueOf(GoldUnifiedSingleAgreementViewState2.class, str);
    }

    public static GoldUnifiedSingleAgreementViewState2[] values() {
        return (GoldUnifiedSingleAgreementViewState2[]) $VALUES.clone();
    }
}
