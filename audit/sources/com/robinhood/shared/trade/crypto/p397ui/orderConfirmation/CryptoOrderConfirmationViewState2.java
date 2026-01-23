package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/ConfirmationScreenStep;", "", "<init>", "(Ljava/lang/String;I)V", "RECEIPT", "AGGRESSIVE_UPSELL", "FEE_TIER_STATUS", "FEE_TIER_UPGRADED", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.ConfirmationScreenStep, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderConfirmationViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoOrderConfirmationViewState2[] $VALUES;
    public static final CryptoOrderConfirmationViewState2 RECEIPT = new CryptoOrderConfirmationViewState2("RECEIPT", 0);
    public static final CryptoOrderConfirmationViewState2 AGGRESSIVE_UPSELL = new CryptoOrderConfirmationViewState2("AGGRESSIVE_UPSELL", 1);
    public static final CryptoOrderConfirmationViewState2 FEE_TIER_STATUS = new CryptoOrderConfirmationViewState2("FEE_TIER_STATUS", 2);
    public static final CryptoOrderConfirmationViewState2 FEE_TIER_UPGRADED = new CryptoOrderConfirmationViewState2("FEE_TIER_UPGRADED", 3);

    private static final /* synthetic */ CryptoOrderConfirmationViewState2[] $values() {
        return new CryptoOrderConfirmationViewState2[]{RECEIPT, AGGRESSIVE_UPSELL, FEE_TIER_STATUS, FEE_TIER_UPGRADED};
    }

    public static EnumEntries<CryptoOrderConfirmationViewState2> getEntries() {
        return $ENTRIES;
    }

    private CryptoOrderConfirmationViewState2(String str, int i) {
    }

    static {
        CryptoOrderConfirmationViewState2[] cryptoOrderConfirmationViewState2Arr$values = $values();
        $VALUES = cryptoOrderConfirmationViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoOrderConfirmationViewState2Arr$values);
    }

    public static CryptoOrderConfirmationViewState2 valueOf(String str) {
        return (CryptoOrderConfirmationViewState2) Enum.valueOf(CryptoOrderConfirmationViewState2.class, str);
    }

    public static CryptoOrderConfirmationViewState2[] values() {
        return (CryptoOrderConfirmationViewState2[]) $VALUES.clone();
    }
}
