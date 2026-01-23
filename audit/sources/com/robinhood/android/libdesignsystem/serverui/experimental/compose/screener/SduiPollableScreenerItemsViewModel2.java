package com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener;

import com.robinhood.models.p320db.Quote;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiPollableScreenerItemsViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;", "", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Quote;", "instrumentId", "", "Noop", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.QuoteProvider, reason: use source file name */
/* loaded from: classes8.dex */
public interface SduiPollableScreenerItemsViewModel2 {

    /* renamed from: Noop, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Observable<Quote> streamQuote(String instrumentId);

    /* compiled from: SduiPollableScreenerItemsViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider$Noop;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/screener/QuoteProvider;", "<init>", "()V", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Quote;", "instrumentId", "", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.QuoteProvider$Noop, reason: from kotlin metadata */
    public static final class Companion implements SduiPollableScreenerItemsViewModel2 {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.screener.SduiPollableScreenerItemsViewModel2
        public Observable<Quote> streamQuote(String instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Observable<Quote> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
    }
}
