package com.robinhood.android.trade.equity.p261ui.configuration.price;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderPriceFragmentEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent;", "", "QuoteFetchError", "InitialPriceEvent", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface OrderPriceFragmentEvent {

    /* compiled from: OrderPriceFragmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent$QuoteFetchError;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class QuoteFetchError implements OrderPriceFragmentEvent {
        public static final int $stable = 0;
        public static final QuoteFetchError INSTANCE = new QuoteFetchError();

        private QuoteFetchError() {
        }
    }

    /* compiled from: OrderPriceFragmentEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent$InitialPriceEvent;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitialPriceEvent implements OrderPriceFragmentEvent {
        public static final int $stable = 8;
        private final BigDecimal price;

        public static /* synthetic */ InitialPriceEvent copy$default(InitialPriceEvent initialPriceEvent, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = initialPriceEvent.price;
            }
            return initialPriceEvent.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        public final InitialPriceEvent copy(BigDecimal price) {
            return new InitialPriceEvent(price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitialPriceEvent) && Intrinsics.areEqual(this.price, ((InitialPriceEvent) other).price);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.price;
            if (bigDecimal == null) {
                return 0;
            }
            return bigDecimal.hashCode();
        }

        public String toString() {
            return "InitialPriceEvent(price=" + this.price + ")";
        }

        public InitialPriceEvent(BigDecimal bigDecimal) {
            this.price = bigDecimal;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }
    }
}
