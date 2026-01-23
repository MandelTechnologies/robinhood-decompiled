package com.robinhood.android.embeddedDetail;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmbeddedDetailAssetType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailAssetType;", "", "<init>", "(Ljava/lang/String;I)V", "STOCK", "ETF", "CRYPTO", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddedDetailAssetType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmbeddedDetailAssetType[] $VALUES;
    public static final EmbeddedDetailAssetType STOCK = new EmbeddedDetailAssetType("STOCK", 0);
    public static final EmbeddedDetailAssetType ETF = new EmbeddedDetailAssetType("ETF", 1);
    public static final EmbeddedDetailAssetType CRYPTO = new EmbeddedDetailAssetType("CRYPTO", 2);

    private static final /* synthetic */ EmbeddedDetailAssetType[] $values() {
        return new EmbeddedDetailAssetType[]{STOCK, ETF, CRYPTO};
    }

    public static EnumEntries<EmbeddedDetailAssetType> getEntries() {
        return $ENTRIES;
    }

    private EmbeddedDetailAssetType(String str, int i) {
    }

    static {
        EmbeddedDetailAssetType[] embeddedDetailAssetTypeArr$values = $values();
        $VALUES = embeddedDetailAssetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(embeddedDetailAssetTypeArr$values);
    }

    public static EmbeddedDetailAssetType valueOf(String str) {
        return (EmbeddedDetailAssetType) Enum.valueOf(EmbeddedDetailAssetType.class, str);
    }

    public static EmbeddedDetailAssetType[] values() {
        return (EmbeddedDetailAssetType[]) $VALUES.clone();
    }
}
