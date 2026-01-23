package com.robinhood.android.common.options.order;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderLimitPrice.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/LimitPriceWithSource;", "", "limitPrice", "Ljava/math/BigDecimal;", "source", "Lcom/robinhood/android/common/options/order/LimitPriceSource;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/common/options/order/LimitPriceSource;)V", "getLimitPrice", "()Ljava/math/BigDecimal;", "getSource", "()Lcom/robinhood/android/common/options/order/LimitPriceSource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LimitPriceWithSource {
    public static final int $stable = 8;
    private final BigDecimal limitPrice;
    private final OptionOrderLimitPrice source;

    public static /* synthetic */ LimitPriceWithSource copy$default(LimitPriceWithSource limitPriceWithSource, BigDecimal bigDecimal, OptionOrderLimitPrice optionOrderLimitPrice, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = limitPriceWithSource.limitPrice;
        }
        if ((i & 2) != 0) {
            optionOrderLimitPrice = limitPriceWithSource.source;
        }
        return limitPriceWithSource.copy(bigDecimal, optionOrderLimitPrice);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionOrderLimitPrice getSource() {
        return this.source;
    }

    public final LimitPriceWithSource copy(BigDecimal limitPrice, OptionOrderLimitPrice source) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        Intrinsics.checkNotNullParameter(source, "source");
        return new LimitPriceWithSource(limitPrice, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitPriceWithSource)) {
            return false;
        }
        LimitPriceWithSource limitPriceWithSource = (LimitPriceWithSource) other;
        return Intrinsics.areEqual(this.limitPrice, limitPriceWithSource.limitPrice) && this.source == limitPriceWithSource.source;
    }

    public int hashCode() {
        return (this.limitPrice.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "LimitPriceWithSource(limitPrice=" + this.limitPrice + ", source=" + this.source + ")";
    }

    public LimitPriceWithSource(BigDecimal limitPrice, OptionOrderLimitPrice source) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        Intrinsics.checkNotNullParameter(source, "source");
        this.limitPrice = limitPrice;
        this.source = source;
    }

    public final BigDecimal getLimitPrice() {
        return this.limitPrice;
    }

    public final OptionOrderLimitPrice getSource() {
        return this.source;
    }
}
