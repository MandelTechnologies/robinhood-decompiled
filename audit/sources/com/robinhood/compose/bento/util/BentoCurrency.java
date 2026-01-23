package com.robinhood.compose.bento.util;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BentoCurrency.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/compose/bento/util/BentoCurrency;", "", "flagAssetName", "", "currencyCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getFlagAssetName", "()Ljava/lang/String;", "getCurrencyCode", "USD", "GBP", "EUR", "SGD", "JPY", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoCurrency {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BentoCurrency[] $VALUES;
    public static final BentoCurrency EUR;
    public static final BentoCurrency GBP;
    public static final BentoCurrency JPY;
    public static final BentoCurrency SGD;
    public static final BentoCurrency USD;
    private final String currencyCode;
    private final String flagAssetName;

    private static final /* synthetic */ BentoCurrency[] $values() {
        return new BentoCurrency[]{USD, GBP, EUR, SGD, JPY};
    }

    public static EnumEntries<BentoCurrency> getEntries() {
        return $ENTRIES;
    }

    private BentoCurrency(String str, int i, String str2, String str3) {
        this.flagAssetName = str2;
        this.currencyCode = str3;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFlagAssetName() {
        return this.flagAssetName;
    }

    static {
        String currencyCode = Currencies.USD.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        USD = new BentoCurrency("USD", 0, CountryCode.COUNTRY_CODE_US, currencyCode);
        String currencyCode2 = Currencies.GBP.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
        GBP = new BentoCurrency("GBP", 1, CountryCode.COUNTRY_CODE_GB, currencyCode2);
        String currencyCode3 = Currencies.EUR.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode3, "getCurrencyCode(...)");
        EUR = new BentoCurrency("EUR", 2, "EU", currencyCode3);
        String currencyCode4 = Currencies.SGD.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode4, "getCurrencyCode(...)");
        SGD = new BentoCurrency("SGD", 3, CountryCode.COUNTRY_CODE_SG, currencyCode4);
        String currencyCode5 = Currencies.JPY.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode5, "getCurrencyCode(...)");
        JPY = new BentoCurrency("JPY", 4, CountryCode.COUNTRY_CODE_JP, currencyCode5);
        BentoCurrency[] bentoCurrencyArr$values = $values();
        $VALUES = bentoCurrencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(bentoCurrencyArr$values);
    }

    public static BentoCurrency valueOf(String str) {
        return (BentoCurrency) Enum.valueOf(BentoCurrency.class, str);
    }

    public static BentoCurrency[] values() {
        return (BentoCurrency[]) $VALUES.clone();
    }
}
