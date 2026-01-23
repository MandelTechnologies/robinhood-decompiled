package com.robinhood.shared.crypto.acats;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoAcatsDestinations.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/AssetListType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFERABLE_CRYPTO", "NON_TRANSFERABLE_CASH", "NON_TRANSFERABLE_CRYPTO", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AssetListType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetListType[] $VALUES;
    public static final AssetListType TRANSFERABLE_CRYPTO = new AssetListType("TRANSFERABLE_CRYPTO", 0);
    public static final AssetListType NON_TRANSFERABLE_CASH = new AssetListType("NON_TRANSFERABLE_CASH", 1);
    public static final AssetListType NON_TRANSFERABLE_CRYPTO = new AssetListType("NON_TRANSFERABLE_CRYPTO", 2);

    private static final /* synthetic */ AssetListType[] $values() {
        return new AssetListType[]{TRANSFERABLE_CRYPTO, NON_TRANSFERABLE_CASH, NON_TRANSFERABLE_CRYPTO};
    }

    public static EnumEntries<AssetListType> getEntries() {
        return $ENTRIES;
    }

    private AssetListType(String str, int i) {
    }

    static {
        AssetListType[] assetListTypeArr$values = $values();
        $VALUES = assetListTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetListTypeArr$values);
    }

    public static AssetListType valueOf(String str) {
        return (AssetListType) Enum.valueOf(AssetListType.class, str);
    }

    public static AssetListType[] values() {
        return (AssetListType[]) $VALUES.clone();
    }
}
