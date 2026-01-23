package com.robinhood.android.creditcard.p091ui.waitlist;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CreditCardWaitlistFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/UpgradeEligibility;", "", "<init>", "(Ljava/lang/String;I)V", "HAS_GOLD", "INELIGIBLE", "ELIGIBLE", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class UpgradeEligibility {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpgradeEligibility[] $VALUES;
    public static final UpgradeEligibility HAS_GOLD = new UpgradeEligibility("HAS_GOLD", 0);
    public static final UpgradeEligibility INELIGIBLE = new UpgradeEligibility("INELIGIBLE", 1);
    public static final UpgradeEligibility ELIGIBLE = new UpgradeEligibility("ELIGIBLE", 2);

    private static final /* synthetic */ UpgradeEligibility[] $values() {
        return new UpgradeEligibility[]{HAS_GOLD, INELIGIBLE, ELIGIBLE};
    }

    public static EnumEntries<UpgradeEligibility> getEntries() {
        return $ENTRIES;
    }

    private UpgradeEligibility(String str, int i) {
    }

    static {
        UpgradeEligibility[] upgradeEligibilityArr$values = $values();
        $VALUES = upgradeEligibilityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(upgradeEligibilityArr$values);
    }

    public static UpgradeEligibility valueOf(String str) {
        return (UpgradeEligibility) Enum.valueOf(UpgradeEligibility.class, str);
    }

    public static UpgradeEligibility[] values() {
        return (UpgradeEligibility[]) $VALUES.clone();
    }
}
