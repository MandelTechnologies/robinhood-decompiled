package com.robinhood.android.common.portfolio.assetHomes;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExtendedAssetType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "OPTIONS", "CRYPTO", "FUTURES", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ExtendedAssetType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExtendedAssetType[] $VALUES;
    public static final ExtendedAssetType EQUITY = new ExtendedAssetType("EQUITY", 0);
    public static final ExtendedAssetType OPTIONS = new ExtendedAssetType("OPTIONS", 1);
    public static final ExtendedAssetType CRYPTO = new ExtendedAssetType("CRYPTO", 2);
    public static final ExtendedAssetType FUTURES = new ExtendedAssetType("FUTURES", 3);

    private static final /* synthetic */ ExtendedAssetType[] $values() {
        return new ExtendedAssetType[]{EQUITY, OPTIONS, CRYPTO, FUTURES};
    }

    public static EnumEntries<ExtendedAssetType> getEntries() {
        return $ENTRIES;
    }

    private ExtendedAssetType(String str, int i) {
    }

    static {
        ExtendedAssetType[] extendedAssetTypeArr$values = $values();
        $VALUES = extendedAssetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(extendedAssetTypeArr$values);
    }

    public static ExtendedAssetType valueOf(String str) {
        return (ExtendedAssetType) Enum.valueOf(ExtendedAssetType.class, str);
    }

    public static ExtendedAssetType[] values() {
        return (ExtendedAssetType[]) $VALUES.clone();
    }
}
