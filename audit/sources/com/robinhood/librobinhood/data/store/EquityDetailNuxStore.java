package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.FractionalEquityDetailNuxPref;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.prefs.LongSetPreference;
import io.reactivex.Single;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Singles;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.threeten.extra.Days;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: EquityDetailNuxStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "fractionalEquityDetailNuxPref", "Lcom/robinhood/prefs/LongSetPreference;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/prefs/LongSetPreference;)V", "markEquityDetailNuxShown", "", "shouldShowEquityDetailNux", "Lio/reactivex/Single;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "checkTimestampForEquityDetailNux", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EquityDetailNuxStore {
    public static final int EQUITY_DETAIL_NUX_MAX_IMPRESSIONS = 3;
    public static final int EQUITY_DETAIL_NUX_SEPARATION_DAYS = 7;
    private final LongSetPreference fractionalEquityDetailNuxPref;
    private final OrderStore orderStore;
    private final QuoteStore quoteStore;
    private final StockDetailStore stockDetailStore;

    public EquityDetailNuxStore(StockDetailStore stockDetailStore, OrderStore orderStore, QuoteStore quoteStore, @FractionalEquityDetailNuxPref LongSetPreference fractionalEquityDetailNuxPref) {
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(fractionalEquityDetailNuxPref, "fractionalEquityDetailNuxPref");
        this.stockDetailStore = stockDetailStore;
        this.orderStore = orderStore;
        this.quoteStore = quoteStore;
        this.fractionalEquityDetailNuxPref = fractionalEquityDetailNuxPref;
    }

    public final void markEquityDetailNuxShown() {
        LongSetPreference longSetPreference = this.fractionalEquityDetailNuxPref;
        longSetPreference.setValues(SetsKt.plus(longSetPreference.getValues(), Long.valueOf(System.currentTimeMillis())));
    }

    public final Single<Boolean> shouldShowEquityDetailNux(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Singles singles = Singles.INSTANCE;
        Single<Boolean> singleFirstOrError = this.stockDetailStore.isPreIpoObservable(instrument.getId()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        Single<Boolean> singleFirstOrError2 = this.orderStore.hasAtLeastOneOrderForAllAccounts().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError2, "firstOrError(...)");
        Single<Quote> singleFirstOrError3 = this.quoteStore.getStreamQuote().asObservable(instrument.getId()).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError3, "firstOrError(...)");
        Single<Boolean> singleZip = Single.zip(singleFirstOrError, singleFirstOrError2, singleFirstOrError3, new Function3<T1, T2, T3, R>() { // from class: com.robinhood.librobinhood.data.store.EquityDetailNuxStore$shouldShowEquityDetailNux$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                return (R) Boolean.valueOf(!((Boolean) t2).booleanValue() && !((Boolean) t1).booleanValue() && ((Quote) t3).getLastTradePrice().getDecimalValue().compareTo(BigDecimal.TEN) > 0 && this.this$0.checkTimestampForEquityDetailNux());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
        return singleZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkTimestampForEquityDetailNux() {
        List listSorted = CollectionsKt.sorted(this.fractionalEquityDetailNuxPref.getValues());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSorted, 10));
        Iterator it = listSorted.iterator();
        while (it.hasNext()) {
            arrayList.add(Instant.ofEpochMilli(((Number) it.next()).longValue()));
        }
        Instant instantNow = Instant.now();
        if (arrayList.size() >= 3) {
            return false;
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Instant instant = (Instant) CollectionsKt.last((List) arrayList);
        Intrinsics.checkNotNull(instant);
        Instant instantPlus = instant.plus((TemporalAmount) Days.m3991of(7));
        Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
        return !instantPlus.isAfter(instantNow);
    }
}
