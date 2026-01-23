package com.robinhood.android.common.gold;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LegacyGoldUpgradeAgreementDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UNREVIEWED", "REVIEWED", "ACCEPTED", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementLoadedStatus, reason: use source file name */
/* loaded from: classes2.dex */
public final class LegacyGoldUpgradeAgreementDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LegacyGoldUpgradeAgreementDataState2[] $VALUES;
    public static final LegacyGoldUpgradeAgreementDataState2 UNREVIEWED = new LegacyGoldUpgradeAgreementDataState2("UNREVIEWED", 0);
    public static final LegacyGoldUpgradeAgreementDataState2 REVIEWED = new LegacyGoldUpgradeAgreementDataState2("REVIEWED", 1);
    public static final LegacyGoldUpgradeAgreementDataState2 ACCEPTED = new LegacyGoldUpgradeAgreementDataState2("ACCEPTED", 2);

    private static final /* synthetic */ LegacyGoldUpgradeAgreementDataState2[] $values() {
        return new LegacyGoldUpgradeAgreementDataState2[]{UNREVIEWED, REVIEWED, ACCEPTED};
    }

    public static EnumEntries<LegacyGoldUpgradeAgreementDataState2> getEntries() {
        return $ENTRIES;
    }

    private LegacyGoldUpgradeAgreementDataState2(String str, int i) {
    }

    static {
        LegacyGoldUpgradeAgreementDataState2[] legacyGoldUpgradeAgreementDataState2Arr$values = $values();
        $VALUES = legacyGoldUpgradeAgreementDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(legacyGoldUpgradeAgreementDataState2Arr$values);
    }

    public static LegacyGoldUpgradeAgreementDataState2 valueOf(String str) {
        return (LegacyGoldUpgradeAgreementDataState2) Enum.valueOf(LegacyGoldUpgradeAgreementDataState2.class, str);
    }

    public static LegacyGoldUpgradeAgreementDataState2[] values() {
        return (LegacyGoldUpgradeAgreementDataState2[]) $VALUES.clone();
    }
}
