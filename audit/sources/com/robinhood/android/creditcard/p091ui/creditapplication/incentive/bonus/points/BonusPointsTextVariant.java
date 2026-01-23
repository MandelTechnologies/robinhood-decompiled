package com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BonusPointsTextVariant.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/incentive/bonus/points/BonusPointsTextVariant;", "", "<init>", "(Ljava/lang/String;I)V", "BONUS_POINTS_10K", "BONUS_POINTS_15K", "BONUS_POINTS_20K", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BonusPointsTextVariant {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BonusPointsTextVariant[] $VALUES;
    public static final BonusPointsTextVariant BONUS_POINTS_10K = new BonusPointsTextVariant("BONUS_POINTS_10K", 0);
    public static final BonusPointsTextVariant BONUS_POINTS_15K = new BonusPointsTextVariant("BONUS_POINTS_15K", 1);
    public static final BonusPointsTextVariant BONUS_POINTS_20K = new BonusPointsTextVariant("BONUS_POINTS_20K", 2);

    private static final /* synthetic */ BonusPointsTextVariant[] $values() {
        return new BonusPointsTextVariant[]{BONUS_POINTS_10K, BONUS_POINTS_15K, BONUS_POINTS_20K};
    }

    public static EnumEntries<BonusPointsTextVariant> getEntries() {
        return $ENTRIES;
    }

    private BonusPointsTextVariant(String str, int i) {
    }

    static {
        BonusPointsTextVariant[] bonusPointsTextVariantArr$values = $values();
        $VALUES = bonusPointsTextVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bonusPointsTextVariantArr$values);
    }

    public static BonusPointsTextVariant valueOf(String str) {
        return (BonusPointsTextVariant) Enum.valueOf(BonusPointsTextVariant.class, str);
    }

    public static BonusPointsTextVariant[] values() {
        return (BonusPointsTextVariant[]) $VALUES.clone();
    }
}
