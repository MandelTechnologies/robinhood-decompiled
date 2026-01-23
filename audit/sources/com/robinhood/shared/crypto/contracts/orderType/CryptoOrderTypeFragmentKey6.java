package com.robinhood.shared.crypto.contracts.orderType;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoOrderTypeFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/orderType/OrderType;", "", "<init>", "(Ljava/lang/String;I)V", "MARKET", "LIMIT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.contracts.orderType.OrderType, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderTypeFragmentKey6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoOrderTypeFragmentKey6[] $VALUES;
    public static final CryptoOrderTypeFragmentKey6 MARKET = new CryptoOrderTypeFragmentKey6("MARKET", 0);
    public static final CryptoOrderTypeFragmentKey6 LIMIT = new CryptoOrderTypeFragmentKey6("LIMIT", 1);

    private static final /* synthetic */ CryptoOrderTypeFragmentKey6[] $values() {
        return new CryptoOrderTypeFragmentKey6[]{MARKET, LIMIT};
    }

    public static EnumEntries<CryptoOrderTypeFragmentKey6> getEntries() {
        return $ENTRIES;
    }

    private CryptoOrderTypeFragmentKey6(String str, int i) {
    }

    static {
        CryptoOrderTypeFragmentKey6[] cryptoOrderTypeFragmentKey6Arr$values = $values();
        $VALUES = cryptoOrderTypeFragmentKey6Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoOrderTypeFragmentKey6Arr$values);
    }

    public static CryptoOrderTypeFragmentKey6 valueOf(String str) {
        return (CryptoOrderTypeFragmentKey6) Enum.valueOf(CryptoOrderTypeFragmentKey6.class, str);
    }

    public static CryptoOrderTypeFragmentKey6[] values() {
        return (CryptoOrderTypeFragmentKey6[]) $VALUES.clone();
    }
}
