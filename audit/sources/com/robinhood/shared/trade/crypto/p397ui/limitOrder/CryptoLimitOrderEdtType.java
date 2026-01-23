package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoLimitOrderEdtType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderEdtType;", "", "<init>", "(Ljava/lang/String;I)V", "AMOUNT", "LIMIT_PRICE", "NONE", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLimitOrderEdtType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoLimitOrderEdtType[] $VALUES;
    public static final CryptoLimitOrderEdtType AMOUNT = new CryptoLimitOrderEdtType("AMOUNT", 0);
    public static final CryptoLimitOrderEdtType LIMIT_PRICE = new CryptoLimitOrderEdtType("LIMIT_PRICE", 1);
    public static final CryptoLimitOrderEdtType NONE = new CryptoLimitOrderEdtType("NONE", 2);

    private static final /* synthetic */ CryptoLimitOrderEdtType[] $values() {
        return new CryptoLimitOrderEdtType[]{AMOUNT, LIMIT_PRICE, NONE};
    }

    public static EnumEntries<CryptoLimitOrderEdtType> getEntries() {
        return $ENTRIES;
    }

    private CryptoLimitOrderEdtType(String str, int i) {
    }

    static {
        CryptoLimitOrderEdtType[] cryptoLimitOrderEdtTypeArr$values = $values();
        $VALUES = cryptoLimitOrderEdtTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoLimitOrderEdtTypeArr$values);
    }

    public static CryptoLimitOrderEdtType valueOf(String str) {
        return (CryptoLimitOrderEdtType) Enum.valueOf(CryptoLimitOrderEdtType.class, str);
    }

    public static CryptoLimitOrderEdtType[] values() {
        return (CryptoLimitOrderEdtType[]) $VALUES.clone();
    }
}
