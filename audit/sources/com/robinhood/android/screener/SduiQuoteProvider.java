package com.robinhood.android.screener;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel2;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiQuoteProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/screener/SduiQuoteProvider;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Quote;", "instrumentId", "", "feature-lib-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SduiQuoteProvider implements SduiPollableScreenerItemsViewModel2 {
    public static final int $stable = 8;
    private final QuoteStore quoteStore;

    public SduiQuoteProvider(QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.quoteStore = quoteStore;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel2
    public Observable<Quote> streamQuote(String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.quoteStore.getStreamQuote().asObservable(StringsKt.toUuid(instrumentId));
    }
}
