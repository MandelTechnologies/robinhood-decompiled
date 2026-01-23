package com.robinhood.android.marketdatadisclosure;

import com.robinhood.models.p320db.MarketIdentificationCode;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.QuoteSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarketDataDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0003¨\u0006\u000b"}, m3636d2 = {"isAskNasdaq", "", "Lcom/robinhood/models/db/Quote;", "(Lcom/robinhood/models/db/Quote;)Z", "isAskBoats", "isAskBruce", "isAskConsolidated", "isBidNasdaq", "isBidBoats", "isBidBruce", "isBidConsolidated", "lib-market-data-disclosure_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDataStateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarketDataDisclosureDataState2 {
    public static final boolean isAskNasdaq(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getAskMic() == MarketIdentificationCode.NASDAQ && quote.getAskSource() == QuoteSource.NLS;
    }

    public static final boolean isAskBoats(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getAskMic() == MarketIdentificationCode.BOATS || quote.getAskSource() == QuoteSource.BOATS;
    }

    public static final boolean isAskBruce(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getAskMic() == MarketIdentificationCode.BRUCE || quote.getAskSource() == QuoteSource.BRUCE;
    }

    public static final boolean isAskConsolidated(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getAskSource() == QuoteSource.CONSOLIDATED;
    }

    public static final boolean isBidNasdaq(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getBidMic() == MarketIdentificationCode.NASDAQ && quote.getBidSource() == QuoteSource.NLS;
    }

    public static final boolean isBidBoats(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getBidMic() == MarketIdentificationCode.BOATS || quote.getBidSource() == QuoteSource.BOATS;
    }

    public static final boolean isBidBruce(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getBidMic() == MarketIdentificationCode.BRUCE || quote.getBidSource() == QuoteSource.BRUCE;
    }

    public static final boolean isBidConsolidated(Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "<this>");
        return quote.getBidSource() == QuoteSource.CONSOLIDATED;
    }
}
