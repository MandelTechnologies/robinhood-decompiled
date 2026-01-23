package com.robinhood.android.newsfeed.p200ui;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Quote;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuoteFetcher.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/ui/QuoteFetcher;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/librobinhood/data/store/QuoteStore;)V", "instrumentIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Ljava/util/UUID;", "setInstrumentId", "", "instrumentId", "streamQuote", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Quote;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class QuoteFetcher {
    public static final int $stable = 8;
    private final AppType appType;
    private final BehaviorRelay<Optional<UUID>> instrumentIdRelay;
    private final QuoteStore quoteStore;

    public QuoteFetcher(AppType appType, QuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.appType = appType;
        this.quoteStore = quoteStore;
        BehaviorRelay<Optional<UUID>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate;
    }

    public final void setInstrumentId(UUID instrumentId) {
        this.instrumentIdRelay.accept(Optional3.asOptional(instrumentId));
    }

    public final Observable<Optional<Quote>> streamQuote() {
        Observable observableSwitchMap = this.instrumentIdRelay.switchMap(new Function() { // from class: com.robinhood.android.newsfeed.ui.QuoteFetcher.streamQuote.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Quote>> apply(Optional<UUID> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                UUID uuidComponent1 = optional.component1();
                if (uuidComponent1 == null || QuoteFetcher.this.appType == AppType.RHC) {
                    return Observable.just(Optional2.INSTANCE);
                }
                return ObservablesKt.toOptionals(QuoteFetcher.this.quoteStore.getStreamQuote().asObservable(uuidComponent1)).startWith((Observable) Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }
}
