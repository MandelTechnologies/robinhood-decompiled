package com.robinhood.android.lib.store.mcw.data;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformQuickConversionRequest.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionRequest;", "", "refId", "Ljava/util/UUID;", "accountNumber", "", "sourceCurrency", "Ljava/util/Currency;", "usdToPurchase", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/Currency;Ljava/math/BigDecimal;)V", "getRefId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getSourceCurrency", "()Ljava/util/Currency;", "getUsdToPurchase", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-mcw_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PerformQuickConversionRequest {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID refId;
    private final Currency sourceCurrency;
    private final BigDecimal usdToPurchase;

    public static /* synthetic */ PerformQuickConversionRequest copy$default(PerformQuickConversionRequest performQuickConversionRequest, UUID uuid, String str, Currency currency, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = performQuickConversionRequest.refId;
        }
        if ((i & 2) != 0) {
            str = performQuickConversionRequest.accountNumber;
        }
        if ((i & 4) != 0) {
            currency = performQuickConversionRequest.sourceCurrency;
        }
        if ((i & 8) != 0) {
            bigDecimal = performQuickConversionRequest.usdToPurchase;
        }
        return performQuickConversionRequest.copy(uuid, str, currency, bigDecimal);
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
    public final Currency getSourceCurrency() {
        return this.sourceCurrency;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getUsdToPurchase() {
        return this.usdToPurchase;
    }

    public final PerformQuickConversionRequest copy(UUID refId, String accountNumber, Currency sourceCurrency, BigDecimal usdToPurchase) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(usdToPurchase, "usdToPurchase");
        return new PerformQuickConversionRequest(refId, accountNumber, sourceCurrency, usdToPurchase);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformQuickConversionRequest)) {
            return false;
        }
        PerformQuickConversionRequest performQuickConversionRequest = (PerformQuickConversionRequest) other;
        return Intrinsics.areEqual(this.refId, performQuickConversionRequest.refId) && Intrinsics.areEqual(this.accountNumber, performQuickConversionRequest.accountNumber) && Intrinsics.areEqual(this.sourceCurrency, performQuickConversionRequest.sourceCurrency) && Intrinsics.areEqual(this.usdToPurchase, performQuickConversionRequest.usdToPurchase);
    }

    public int hashCode() {
        return (((((this.refId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.sourceCurrency.hashCode()) * 31) + this.usdToPurchase.hashCode();
    }

    public String toString() {
        return "PerformQuickConversionRequest(refId=" + this.refId + ", accountNumber=" + this.accountNumber + ", sourceCurrency=" + this.sourceCurrency + ", usdToPurchase=" + this.usdToPurchase + ")";
    }

    public PerformQuickConversionRequest(UUID refId, String accountNumber, Currency sourceCurrency, BigDecimal usdToPurchase) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(usdToPurchase, "usdToPurchase");
        this.refId = refId;
        this.accountNumber = accountNumber;
        this.sourceCurrency = sourceCurrency;
        this.usdToPurchase = usdToPurchase;
    }

    public final UUID getRefId() {
        return this.refId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Currency getSourceCurrency() {
        return this.sourceCurrency;
    }

    public final BigDecimal getUsdToPurchase() {
        return this.usdToPurchase;
    }
}
