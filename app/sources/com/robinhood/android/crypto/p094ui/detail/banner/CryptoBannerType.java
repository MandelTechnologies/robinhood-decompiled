package com.robinhood.android.crypto.p094ui.detail.banner;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoBannerType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerType;", "", "<init>", "(Ljava/lang/String;I)V", "TRADE", "PERPETUALS", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoBannerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoBannerType[] $VALUES;
    public static final CryptoBannerType TRADE = new CryptoBannerType("TRADE", 0);
    public static final CryptoBannerType PERPETUALS = new CryptoBannerType("PERPETUALS", 1);

    private static final /* synthetic */ CryptoBannerType[] $values() {
        return new CryptoBannerType[]{TRADE, PERPETUALS};
    }

    public static EnumEntries<CryptoBannerType> getEntries() {
        return $ENTRIES;
    }

    private CryptoBannerType(String str, int i) {
    }

    static {
        CryptoBannerType[] cryptoBannerTypeArr$values = $values();
        $VALUES = cryptoBannerTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoBannerTypeArr$values);
    }

    public static CryptoBannerType valueOf(String str) {
        return (CryptoBannerType) Enum.valueOf(CryptoBannerType.class, str);
    }

    public static CryptoBannerType[] values() {
        return (CryptoBannerType[]) $VALUES.clone();
    }
}
