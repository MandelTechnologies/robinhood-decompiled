package com.robinhood.android.cash.merchantrewards.p073ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MerchantRewardsOverviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "Header", "Offer", "Footer", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.ContentType, reason: use source file name */
/* loaded from: classes7.dex */
final class MerchantRewardsOverviewComposable3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MerchantRewardsOverviewComposable3[] $VALUES;
    public static final MerchantRewardsOverviewComposable3 Header = new MerchantRewardsOverviewComposable3("Header", 0);
    public static final MerchantRewardsOverviewComposable3 Offer = new MerchantRewardsOverviewComposable3("Offer", 1);
    public static final MerchantRewardsOverviewComposable3 Footer = new MerchantRewardsOverviewComposable3("Footer", 2);

    private static final /* synthetic */ MerchantRewardsOverviewComposable3[] $values() {
        return new MerchantRewardsOverviewComposable3[]{Header, Offer, Footer};
    }

    public static EnumEntries<MerchantRewardsOverviewComposable3> getEntries() {
        return $ENTRIES;
    }

    private MerchantRewardsOverviewComposable3(String str, int i) {
    }

    static {
        MerchantRewardsOverviewComposable3[] merchantRewardsOverviewComposable3Arr$values = $values();
        $VALUES = merchantRewardsOverviewComposable3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(merchantRewardsOverviewComposable3Arr$values);
    }

    public static MerchantRewardsOverviewComposable3 valueOf(String str) {
        return (MerchantRewardsOverviewComposable3) Enum.valueOf(MerchantRewardsOverviewComposable3.class, str);
    }

    public static MerchantRewardsOverviewComposable3[] values() {
        return (MerchantRewardsOverviewComposable3[]) $VALUES.clone();
    }
}
