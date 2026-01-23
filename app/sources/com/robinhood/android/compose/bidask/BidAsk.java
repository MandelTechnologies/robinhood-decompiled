package com.robinhood.android.compose.bidask;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BidAskDetails.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/compose/bidask/BidAsk;", "", "bidPrice", "", "askPrice", "bidSize", "Ljava/math/BigDecimal;", "askSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBidPrice", "()Ljava/lang/String;", "getAskPrice", "getBidSize", "()Ljava/math/BigDecimal;", "getAskSize", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bid-ask_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BidAsk {
    public static final int $stable = 8;
    private final String askPrice;
    private final BigDecimal askSize;
    private final String bidPrice;
    private final BigDecimal bidSize;

    public static /* synthetic */ BidAsk copy$default(BidAsk bidAsk, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bidAsk.bidPrice;
        }
        if ((i & 2) != 0) {
            str2 = bidAsk.askPrice;
        }
        if ((i & 4) != 0) {
            bigDecimal = bidAsk.bidSize;
        }
        if ((i & 8) != 0) {
            bigDecimal2 = bidAsk.askSize;
        }
        return bidAsk.copy(str, str2, bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBidPrice() {
        return this.bidPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAskPrice() {
        return this.askPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final BigDecimal getBidSize() {
        return this.bidSize;
    }

    /* renamed from: component4, reason: from getter */
    public final BigDecimal getAskSize() {
        return this.askSize;
    }

    public final BidAsk copy(String bidPrice, String askPrice, BigDecimal bidSize, BigDecimal askSize) {
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(bidSize, "bidSize");
        Intrinsics.checkNotNullParameter(askSize, "askSize");
        return new BidAsk(bidPrice, askPrice, bidSize, askSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidAsk)) {
            return false;
        }
        BidAsk bidAsk = (BidAsk) other;
        return Intrinsics.areEqual(this.bidPrice, bidAsk.bidPrice) && Intrinsics.areEqual(this.askPrice, bidAsk.askPrice) && Intrinsics.areEqual(this.bidSize, bidAsk.bidSize) && Intrinsics.areEqual(this.askSize, bidAsk.askSize);
    }

    public int hashCode() {
        return (((((this.bidPrice.hashCode() * 31) + this.askPrice.hashCode()) * 31) + this.bidSize.hashCode()) * 31) + this.askSize.hashCode();
    }

    public String toString() {
        return "BidAsk(bidPrice=" + this.bidPrice + ", askPrice=" + this.askPrice + ", bidSize=" + this.bidSize + ", askSize=" + this.askSize + ")";
    }

    public BidAsk(String bidPrice, String askPrice, BigDecimal bidSize, BigDecimal askSize) {
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(bidSize, "bidSize");
        Intrinsics.checkNotNullParameter(askSize, "askSize");
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
        this.bidSize = bidSize;
        this.askSize = askSize;
    }

    public final String getBidPrice() {
        return this.bidPrice;
    }

    public final String getAskPrice() {
        return this.askPrice;
    }

    public final BigDecimal getBidSize() {
        return this.bidSize;
    }

    public final BigDecimal getAskSize() {
        return this.askSize;
    }
}
