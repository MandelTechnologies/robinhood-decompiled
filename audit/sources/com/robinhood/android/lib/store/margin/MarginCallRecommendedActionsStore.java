package com.robinhood.android.lib.store.margin;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginCallRecommendedActionsStore;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.BrokebackMarginApi;
import com.robinhood.models.api.MarginRecommendedActions;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: MarginCallRecommendedActionsStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/store/margin/MarginCallRecommendedActionsStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "brokebackMarginApi", "Lcom/robinhood/models/api/BrokebackMarginApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/models/api/BrokebackMarginApi;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/store/StoreBundle;)V", "getEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/MarginRecommendedActions;", "pollIndividualAccountRecommendedActions", "Lio/reactivex/Observable;", "pollRecommendedActionsForAccountNumber", "accountNumber", "lib-store-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginCallRecommendedActionsStore extends Store {
    private final AccountProvider accountProvider;
    private final BrokebackMarginApi brokebackMarginApi;
    private final Endpoint<String, MarginRecommendedActions> getEndpoint;
    private final InstrumentStore instrumentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginCallRecommendedActionsStore(AccountProvider accountProvider, BrokebackMarginApi brokebackMarginApi, InstrumentStore instrumentStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokebackMarginApi, "brokebackMarginApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.accountProvider = accountProvider;
        this.brokebackMarginApi = brokebackMarginApi;
        this.instrumentStore = instrumentStore;
        this.getEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MarginCallRecommendedActionsStore2(brokebackMarginApi), getLogoutKillswitch(), new MarginCallRecommendedActionsStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<MarginRecommendedActions> pollIndividualAccountRecommendedActions() {
        Observable observableFlatMapObservable = this.accountProvider.getIndividualAccountNumberMaybe().flatMapObservable(new Function() { // from class: com.robinhood.android.lib.store.margin.MarginCallRecommendedActionsStore.pollIndividualAccountRecommendedActions.1
            @Override // io.reactivex.functions.Function
            public final Observable<MarginRecommendedActions> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return MarginCallRecommendedActionsStore.this.pollRecommendedActionsForAccountNumber(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        return observableFlatMapObservable;
    }

    public final Observable<MarginRecommendedActions> pollRecommendedActionsForAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Endpoint<String, MarginRecommendedActions> endpoint = this.getEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        Observable<MarginRecommendedActions> observableDoOnNext = asObservable(Endpoint.DefaultImpls.poll$default(endpoint, accountNumber, durationOfMinutes, null, 4, null)).doOnNext(new C205771());
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        return observableDoOnNext;
    }

    /* compiled from: MarginCallRecommendedActionsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.store.margin.MarginCallRecommendedActionsStore$pollRecommendedActionsForAccountNumber$1 */
    static final class C205771<T> implements Consumer {
        C205771() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID accept$lambda$0(MarginRecommendedActions.Sell it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstrumentId();
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(MarginRecommendedActions marginRecommendedActions) {
            MarginCallRecommendedActionsStore.this.instrumentStore.pingInstruments(marginRecommendedActions.getSells(), new Function1() { // from class: com.robinhood.android.lib.store.margin.MarginCallRecommendedActionsStore$pollRecommendedActionsForAccountNumber$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginCallRecommendedActionsStore.C205771.accept$lambda$0((MarginRecommendedActions.Sell) obj);
                }
            });
        }
    }
}
