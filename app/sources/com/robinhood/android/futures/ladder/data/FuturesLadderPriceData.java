package com.robinhood.android.futures.ladder.data;

import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.websocket.p410dx.models.BigDecimalWithNaN;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesLadderPriceData.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00018B\u0089\u0001\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010(\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003HÂ\u0003J\u001d\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010+J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010+J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0002\u0010+J\t\u00100\u001a\u00020\u0011HÂ\u0003J\u0090\u0001\u00101\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0006HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\"\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR%\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0013\u0010$\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u001cR\u0011\u0010&\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;", "", "bids", "", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "", "asks", "dxDomTimestamp", "", "lastTrade", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;", "dxTradeTimestamp", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "quoteTimestamp", "loggedDxDataIssue", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;Ljava/lang/Long;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Ljava/lang/Long;Z)V", "Ljava/lang/Long;", "quoteBid", "getQuoteBid", "()Lkotlin/Pair;", "quoteAsk", "getQuoteAsk", "lastTradePrice", "getLastTradePrice", "()Ljava/math/BigDecimal;", "displayedBids", "getDisplayedBids", "()Ljava/util/List;", "displayedAsks", "getDisplayedAsks", "topBid", "getTopBid", "topAsk", "getTopAsk", "isExperiencingDxDataDegradation", "()Z", "component1", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;Ljava/lang/Long;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Ljava/lang/Long;Z)Lcom/robinhood/android/futures/ladder/data/FuturesLadderPriceData;", "equals", "other", "hashCode", "toString", "", "Companion", "lib-futures-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class FuturesLadderPriceData {
    public static final long MAX_ALLOWED_DX_DATA_DELAY = 5000;
    private final List<Tuples2<BigDecimal, Integer>> asks;
    private final List<Tuples2<BigDecimal, Integer>> bids;
    private final Long dxDomTimestamp;
    private final Long dxTradeTimestamp;
    private final DxFeedData.Trade lastTrade;
    private final boolean loggedDxDataIssue;
    private final FuturesQuote quote;
    private final Long quoteTimestamp;
    public static final int $stable = 8;

    public FuturesLadderPriceData() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    private final List<Tuples2<BigDecimal, Integer>> component1() {
        return this.bids;
    }

    private final List<Tuples2<BigDecimal, Integer>> component2() {
        return this.asks;
    }

    /* renamed from: component3, reason: from getter */
    private final Long getDxDomTimestamp() {
        return this.dxDomTimestamp;
    }

    /* renamed from: component4, reason: from getter */
    private final DxFeedData.Trade getLastTrade() {
        return this.lastTrade;
    }

    /* renamed from: component5, reason: from getter */
    private final Long getDxTradeTimestamp() {
        return this.dxTradeTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    private final FuturesQuote getQuote() {
        return this.quote;
    }

    /* renamed from: component7, reason: from getter */
    private final Long getQuoteTimestamp() {
        return this.quoteTimestamp;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getLoggedDxDataIssue() {
        return this.loggedDxDataIssue;
    }

    public static /* synthetic */ FuturesLadderPriceData copy$default(FuturesLadderPriceData futuresLadderPriceData, List list, List list2, Long l, DxFeedData.Trade trade, Long l2, FuturesQuote futuresQuote, Long l3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = futuresLadderPriceData.bids;
        }
        if ((i & 2) != 0) {
            list2 = futuresLadderPriceData.asks;
        }
        if ((i & 4) != 0) {
            l = futuresLadderPriceData.dxDomTimestamp;
        }
        if ((i & 8) != 0) {
            trade = futuresLadderPriceData.lastTrade;
        }
        if ((i & 16) != 0) {
            l2 = futuresLadderPriceData.dxTradeTimestamp;
        }
        if ((i & 32) != 0) {
            futuresQuote = futuresLadderPriceData.quote;
        }
        if ((i & 64) != 0) {
            l3 = futuresLadderPriceData.quoteTimestamp;
        }
        if ((i & 128) != 0) {
            z = futuresLadderPriceData.loggedDxDataIssue;
        }
        Long l4 = l3;
        boolean z2 = z;
        Long l5 = l2;
        FuturesQuote futuresQuote2 = futuresQuote;
        return futuresLadderPriceData.copy(list, list2, l, trade, l5, futuresQuote2, l4, z2);
    }

    public final FuturesLadderPriceData copy(List<? extends Tuples2<? extends BigDecimal, Integer>> bids, List<? extends Tuples2<? extends BigDecimal, Integer>> asks, Long dxDomTimestamp, DxFeedData.Trade lastTrade, Long dxTradeTimestamp, FuturesQuote quote, Long quoteTimestamp, boolean loggedDxDataIssue) {
        return new FuturesLadderPriceData(bids, asks, dxDomTimestamp, lastTrade, dxTradeTimestamp, quote, quoteTimestamp, loggedDxDataIssue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesLadderPriceData)) {
            return false;
        }
        FuturesLadderPriceData futuresLadderPriceData = (FuturesLadderPriceData) other;
        return Intrinsics.areEqual(this.bids, futuresLadderPriceData.bids) && Intrinsics.areEqual(this.asks, futuresLadderPriceData.asks) && Intrinsics.areEqual(this.dxDomTimestamp, futuresLadderPriceData.dxDomTimestamp) && Intrinsics.areEqual(this.lastTrade, futuresLadderPriceData.lastTrade) && Intrinsics.areEqual(this.dxTradeTimestamp, futuresLadderPriceData.dxTradeTimestamp) && Intrinsics.areEqual(this.quote, futuresLadderPriceData.quote) && Intrinsics.areEqual(this.quoteTimestamp, futuresLadderPriceData.quoteTimestamp) && this.loggedDxDataIssue == futuresLadderPriceData.loggedDxDataIssue;
    }

    public int hashCode() {
        List<Tuples2<BigDecimal, Integer>> list = this.bids;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Tuples2<BigDecimal, Integer>> list2 = this.asks;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.dxDomTimestamp;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        DxFeedData.Trade trade = this.lastTrade;
        int iHashCode4 = (iHashCode3 + (trade == null ? 0 : trade.hashCode())) * 31;
        Long l2 = this.dxTradeTimestamp;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        FuturesQuote futuresQuote = this.quote;
        int iHashCode6 = (iHashCode5 + (futuresQuote == null ? 0 : futuresQuote.hashCode())) * 31;
        Long l3 = this.quoteTimestamp;
        return ((iHashCode6 + (l3 != null ? l3.hashCode() : 0)) * 31) + Boolean.hashCode(this.loggedDxDataIssue);
    }

    public String toString() {
        return "FuturesLadderPriceData(bids=" + this.bids + ", asks=" + this.asks + ", dxDomTimestamp=" + this.dxDomTimestamp + ", lastTrade=" + this.lastTrade + ", dxTradeTimestamp=" + this.dxTradeTimestamp + ", quote=" + this.quote + ", quoteTimestamp=" + this.quoteTimestamp + ", loggedDxDataIssue=" + this.loggedDxDataIssue + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesLadderPriceData(List<? extends Tuples2<? extends BigDecimal, Integer>> list, List<? extends Tuples2<? extends BigDecimal, Integer>> list2, Long l, DxFeedData.Trade trade, Long l2, FuturesQuote futuresQuote, Long l3, boolean z) {
        this.bids = list;
        this.asks = list2;
        this.dxDomTimestamp = l;
        this.lastTrade = trade;
        this.dxTradeTimestamp = l2;
        this.quote = futuresQuote;
        this.quoteTimestamp = l3;
        this.loggedDxDataIssue = z;
    }

    public /* synthetic */ FuturesLadderPriceData(List list, List list2, Long l, DxFeedData.Trade trade, Long l2, FuturesQuote futuresQuote, Long l3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : trade, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : futuresQuote, (i & 64) != 0 ? null : l3, (i & 128) != 0 ? false : z);
    }

    private final Tuples2<BigDecimal, Integer> getQuoteBid() {
        BigDecimal bidPrice;
        Integer bidSize;
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote == null || (bidPrice = futuresQuote.getBidPrice()) == null || (bidSize = this.quote.getBidSize()) == null) {
            return null;
        }
        return Tuples4.m3642to(bidPrice, Integer.valueOf(bidSize.intValue()));
    }

    private final Tuples2<BigDecimal, Integer> getQuoteAsk() {
        BigDecimal askPrice;
        Integer askSize;
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote == null || (askPrice = futuresQuote.getAskPrice()) == null || (askSize = this.quote.getAskSize()) == null) {
            return null;
        }
        return Tuples4.m3642to(askPrice, Integer.valueOf(askSize.intValue()));
    }

    public final BigDecimal getLastTradePrice() {
        BigDecimalWithNaN price;
        BigDecimal bigDecimal;
        DxFeedData.Trade trade = this.lastTrade;
        if (trade != null && (price = trade.getPrice()) != null && (bigDecimal = price.getBigDecimal()) != null) {
            return bigDecimal;
        }
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote != null) {
            return futuresQuote.getLastTradePrice();
        }
        return null;
    }

    public final List<Tuples2<BigDecimal, Integer>> getDisplayedBids() {
        List<Tuples2<BigDecimal, Integer>> list = this.bids;
        if (list != null) {
            return list;
        }
        Tuples2<BigDecimal, Integer> quoteBid = getQuoteBid();
        if (quoteBid != null) {
            return CollectionsKt.listOf(quoteBid);
        }
        return null;
    }

    public final List<Tuples2<BigDecimal, Integer>> getDisplayedAsks() {
        List<Tuples2<BigDecimal, Integer>> list = this.asks;
        if (list != null) {
            return list;
        }
        Tuples2<BigDecimal, Integer> quoteAsk = getQuoteAsk();
        if (quoteAsk != null) {
            return CollectionsKt.listOf(quoteAsk);
        }
        return null;
    }

    public final BigDecimal getTopBid() {
        Tuples2 tuples2;
        BigDecimal bigDecimal;
        List<Tuples2<BigDecimal, Integer>> list = this.bids;
        if (list != null && (tuples2 = (Tuples2) CollectionsKt.firstOrNull((List) list)) != null && (bigDecimal = (BigDecimal) tuples2.getFirst()) != null) {
            return bigDecimal;
        }
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote != null) {
            return futuresQuote.getBidPrice();
        }
        return null;
    }

    public final BigDecimal getTopAsk() {
        Tuples2 tuples2;
        BigDecimal bigDecimal;
        List<Tuples2<BigDecimal, Integer>> list = this.asks;
        if (list != null && (tuples2 = (Tuples2) CollectionsKt.firstOrNull((List) list)) != null && (bigDecimal = (BigDecimal) tuples2.getFirst()) != null) {
            return bigDecimal;
        }
        FuturesQuote futuresQuote = this.quote;
        if (futuresQuote != null) {
            return futuresQuote.getAskPrice();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, (r8 == null || (r8 = (kotlin.Tuples2) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r8)) == null) ? null : (java.math.BigDecimal) r8.getFirst()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isExperiencingDxDataDegradation() {
        Long l;
        BigDecimalWithNaN price;
        Tuples2 tuples2;
        if (this.quote != null && (l = this.quoteTimestamp) != null) {
            long jLongValue = l.longValue();
            Long l2 = this.dxDomTimestamp;
            BigDecimal bigDecimal = null;
            if (jLongValue - (l2 != null ? l2.longValue() : 0L) >= 5000) {
                BigDecimal bidPrice = this.quote.getBidPrice();
                List<Tuples2<BigDecimal, Integer>> list = this.bids;
                if (Intrinsics.areEqual(bidPrice, (list == null || (tuples2 = (Tuples2) CollectionsKt.firstOrNull((List) list)) == null) ? null : (BigDecimal) tuples2.getFirst())) {
                    BigDecimal askPrice = this.quote.getAskPrice();
                    List<Tuples2<BigDecimal, Integer>> list2 = this.asks;
                }
                return true;
            }
            long jLongValue2 = this.quoteTimestamp.longValue();
            Long l3 = this.dxTradeTimestamp;
            if (jLongValue2 - (l3 != null ? l3.longValue() : 0L) >= 5000) {
                BigDecimal lastTradePrice = this.quote.getLastTradePrice();
                DxFeedData.Trade trade = this.lastTrade;
                if (trade != null && (price = trade.getPrice()) != null) {
                    bigDecimal = price.getBigDecimal();
                }
                if (!Intrinsics.areEqual(lastTradePrice, bigDecimal)) {
                    return true;
                }
            }
        }
        return false;
    }
}
