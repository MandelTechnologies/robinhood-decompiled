package com.robinhood.store.futures;

import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FuturesLocaleStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesLocale;", "", "countryCode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", CountryCode.COUNTRY_CODE_US, "UK", "UNSUPPORTED", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.FuturesLocale, reason: use source file name */
/* loaded from: classes12.dex */
public final class FuturesLocaleStore2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesLocaleStore2[] $VALUES;
    private final String countryCode;

    /* renamed from: US */
    public static final FuturesLocaleStore2 f6324US = new FuturesLocaleStore2(CountryCode.COUNTRY_CODE_US, 0, CountryCode.COUNTRY_CODE_US);

    /* renamed from: UK */
    public static final FuturesLocaleStore2 f6323UK = new FuturesLocaleStore2("UK", 1, CountryCode.COUNTRY_CODE_GB);
    public static final FuturesLocaleStore2 UNSUPPORTED = new FuturesLocaleStore2("UNSUPPORTED", 2, null);

    private static final /* synthetic */ FuturesLocaleStore2[] $values() {
        return new FuturesLocaleStore2[]{f6324US, f6323UK, UNSUPPORTED};
    }

    public static EnumEntries<FuturesLocaleStore2> getEntries() {
        return $ENTRIES;
    }

    private FuturesLocaleStore2(String str, int i, String str2) {
        this.countryCode = str2;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    static {
        FuturesLocaleStore2[] futuresLocaleStore2Arr$values = $values();
        $VALUES = futuresLocaleStore2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresLocaleStore2Arr$values);
    }

    public static FuturesLocaleStore2 valueOf(String str) {
        return (FuturesLocaleStore2) Enum.valueOf(FuturesLocaleStore2.class, str);
    }

    public static FuturesLocaleStore2[] values() {
        return (FuturesLocaleStore2[]) $VALUES.clone();
    }
}
