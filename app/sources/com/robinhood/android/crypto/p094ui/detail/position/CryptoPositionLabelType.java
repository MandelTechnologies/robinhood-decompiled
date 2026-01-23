package com.robinhood.android.crypto.p094ui.detail.position;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoPositionLabelType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionLabelType;", "", "<init>", "(Ljava/lang/String;I)V", "RETURNS", "AVERAGE_COST", "PORTFOLIO_DIVERSITY", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPositionLabelType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoPositionLabelType[] $VALUES;
    public static final CryptoPositionLabelType RETURNS = new CryptoPositionLabelType("RETURNS", 0);
    public static final CryptoPositionLabelType AVERAGE_COST = new CryptoPositionLabelType("AVERAGE_COST", 1);
    public static final CryptoPositionLabelType PORTFOLIO_DIVERSITY = new CryptoPositionLabelType("PORTFOLIO_DIVERSITY", 2);

    private static final /* synthetic */ CryptoPositionLabelType[] $values() {
        return new CryptoPositionLabelType[]{RETURNS, AVERAGE_COST, PORTFOLIO_DIVERSITY};
    }

    public static EnumEntries<CryptoPositionLabelType> getEntries() {
        return $ENTRIES;
    }

    private CryptoPositionLabelType(String str, int i) {
    }

    static {
        CryptoPositionLabelType[] cryptoPositionLabelTypeArr$values = $values();
        $VALUES = cryptoPositionLabelTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoPositionLabelTypeArr$values);
    }

    public static CryptoPositionLabelType valueOf(String str) {
        return (CryptoPositionLabelType) Enum.valueOf(CryptoPositionLabelType.class, str);
    }

    public static CryptoPositionLabelType[] values() {
        return (CryptoPositionLabelType[]) $VALUES.clone();
    }
}
