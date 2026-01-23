package com.robinhood.android.lib.store.mcw.data;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConvertCurrencyRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/ConvertCurrencyRequest;", "", "refId", "Ljava/util/UUID;", "accountNumber", "", "symbolId", "amountToConvert", "Ljava/math/BigDecimal;", "fromCurrency", "Ljava/util/Currency;", "toCurrency", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/util/Currency;)V", "getRefId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getSymbolId", "getAmountToConvert", "()Ljava/math/BigDecimal;", "getFromCurrency", "()Ljava/util/Currency;", "getToCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConvertCurrencyRequest {
    public static final int $stable = 8;
    private final String accountNumber;
    private final BigDecimal amountToConvert;
    private final Currency fromCurrency;
    private final UUID refId;
    private final String symbolId;
    private final Currency toCurrency;

    public static /* synthetic */ ConvertCurrencyRequest copy$default(ConvertCurrencyRequest convertCurrencyRequest, UUID uuid, String str, String str2, BigDecimal bigDecimal, Currency currency, Currency currency2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = convertCurrencyRequest.refId;
        }
        if ((i & 2) != 0) {
            str = convertCurrencyRequest.accountNumber;
        }
        if ((i & 4) != 0) {
            str2 = convertCurrencyRequest.symbolId;
        }
        if ((i & 8) != 0) {
            bigDecimal = convertCurrencyRequest.amountToConvert;
        }
        if ((i & 16) != 0) {
            currency = convertCurrencyRequest.fromCurrency;
        }
        if ((i & 32) != 0) {
            currency2 = convertCurrencyRequest.toCurrency;
        }
        Currency currency3 = currency;
        Currency currency4 = currency2;
        return convertCurrencyRequest.copy(uuid, str, str2, bigDecimal, currency3, currency4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRefId() {
        return this.refId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbolId() {
        return this.symbolId;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAmountToConvert() {
        return this.amountToConvert;
    }

    /* renamed from: component5, reason: from getter */
    public final Currency getFromCurrency() {
        return this.fromCurrency;
    }

    /* renamed from: component6, reason: from getter */
    public final Currency getToCurrency() {
        return this.toCurrency;
    }

    public final ConvertCurrencyRequest copy(UUID refId, String accountNumber, String symbolId, BigDecimal amountToConvert, Currency fromCurrency, Currency toCurrency) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(symbolId, "symbolId");
        Intrinsics.checkNotNullParameter(amountToConvert, "amountToConvert");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        return new ConvertCurrencyRequest(refId, accountNumber, symbolId, amountToConvert, fromCurrency, toCurrency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConvertCurrencyRequest)) {
            return false;
        }
        ConvertCurrencyRequest convertCurrencyRequest = (ConvertCurrencyRequest) other;
        return Intrinsics.areEqual(this.refId, convertCurrencyRequest.refId) && Intrinsics.areEqual(this.accountNumber, convertCurrencyRequest.accountNumber) && Intrinsics.areEqual(this.symbolId, convertCurrencyRequest.symbolId) && Intrinsics.areEqual(this.amountToConvert, convertCurrencyRequest.amountToConvert) && Intrinsics.areEqual(this.fromCurrency, convertCurrencyRequest.fromCurrency) && Intrinsics.areEqual(this.toCurrency, convertCurrencyRequest.toCurrency);
    }

    public int hashCode() {
        return (((((((((this.refId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.symbolId.hashCode()) * 31) + this.amountToConvert.hashCode()) * 31) + this.fromCurrency.hashCode()) * 31) + this.toCurrency.hashCode();
    }

    public String toString() {
        return "ConvertCurrencyRequest(refId=" + this.refId + ", accountNumber=" + this.accountNumber + ", symbolId=" + this.symbolId + ", amountToConvert=" + this.amountToConvert + ", fromCurrency=" + this.fromCurrency + ", toCurrency=" + this.toCurrency + ")";
    }

    public ConvertCurrencyRequest(UUID refId, String accountNumber, String symbolId, BigDecimal amountToConvert, Currency fromCurrency, Currency toCurrency) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(symbolId, "symbolId");
        Intrinsics.checkNotNullParameter(amountToConvert, "amountToConvert");
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        this.refId = refId;
        this.accountNumber = accountNumber;
        this.symbolId = symbolId;
        this.amountToConvert = amountToConvert;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSymbolId() {
        return this.symbolId;
    }

    public final BigDecimal getAmountToConvert() {
        return this.amountToConvert;
    }

    public final Currency getFromCurrency() {
        return this.fromCurrency;
    }

    public final Currency getToCurrency() {
        return this.toCurrency;
    }
}
