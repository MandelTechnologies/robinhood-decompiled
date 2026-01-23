package com.robinhood.shared.trading.orderstate;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentOrderState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trading/orderstate/Quantity;", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-order-state_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Quantity implements InstrumentOrderState4 {
    private final BigDecimal amount;

    public static /* synthetic */ Quantity copy$default(Quantity quantity, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = quantity.amount;
        }
        return quantity.copy(bigDecimal);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final Quantity copy(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new Quantity(amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Quantity) && Intrinsics.areEqual(this.amount, ((Quantity) other).amount);
    }

    public int hashCode() {
        return this.amount.hashCode();
    }

    public String toString() {
        return "Quantity(amount=" + this.amount + ")";
    }

    public Quantity(BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }
}
