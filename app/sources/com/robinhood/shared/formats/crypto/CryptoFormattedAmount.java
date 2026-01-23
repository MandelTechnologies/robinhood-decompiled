package com.robinhood.shared.formats.crypto;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFormattedAmount.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "", "quantity", "Ljava/math/BigDecimal;", "quantityString", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getQuantity", "()Ljava/math/BigDecimal;", "getQuantityString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-formats-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoFormattedAmount {
    private final BigDecimal quantity;
    private final String quantityString;

    public static /* synthetic */ CryptoFormattedAmount copy$default(CryptoFormattedAmount cryptoFormattedAmount, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cryptoFormattedAmount.quantity;
        }
        if ((i & 2) != 0) {
            str = cryptoFormattedAmount.quantityString;
        }
        return cryptoFormattedAmount.copy(bigDecimal, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuantityString() {
        return this.quantityString;
    }

    public final CryptoFormattedAmount copy(BigDecimal quantity, String quantityString) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quantityString, "quantityString");
        return new CryptoFormattedAmount(quantity, quantityString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoFormattedAmount)) {
            return false;
        }
        CryptoFormattedAmount cryptoFormattedAmount = (CryptoFormattedAmount) other;
        return Intrinsics.areEqual(this.quantity, cryptoFormattedAmount.quantity) && Intrinsics.areEqual(this.quantityString, cryptoFormattedAmount.quantityString);
    }

    public int hashCode() {
        return (this.quantity.hashCode() * 31) + this.quantityString.hashCode();
    }

    public String toString() {
        return "CryptoFormattedAmount(quantity=" + this.quantity + ", quantityString=" + this.quantityString + ")";
    }

    public CryptoFormattedAmount(BigDecimal quantity, String quantityString) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(quantityString, "quantityString");
        this.quantity = quantity;
        this.quantityString = quantityString;
    }

    public final BigDecimal getQuantity() {
        return this.quantity;
    }

    public final String getQuantityString() {
        return this.quantityString;
    }
}
