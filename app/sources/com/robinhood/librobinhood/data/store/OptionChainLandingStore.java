package com.robinhood.librobinhood.data.store;

import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionMarketHoursParam;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionChainLandingStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainLandingStore;", "Lcom/robinhood/store/Store;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/librobinhood/data/store/OptionChainPageState;", "pageState", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "", "isTradeOnExpirationEnabled", "", "selloutTimeToExpiration", "isIndexOptionsExtendedHoursEnabled", "Lio/reactivex/Observable;", "", "processOptionPageState", "(Lcom/robinhood/librobinhood/data/store/OptionChainPageState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;ZJZ)Lio/reactivex/Observable;", "Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;", "state", "useNextTradableExpirationDate", "getIndexForOptionChainLandingPage", "(Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;Z)Lio/reactivex/Observable;", "getIndexForNextTradableExpirationDate", "(Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;)Lio/reactivex/Observable;", "Lj$/time/Clock;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionChainLandingStore extends Store {
    public static final int CHAIN_LANDING_NO_OP = -1;
    private final Clock clock;
    private final MarketHoursStore marketHoursStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainLandingStore(Clock clock, MarketHoursStore marketHoursStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.clock = clock;
        this.marketHoursStore = marketHoursStore;
    }

    public static /* synthetic */ Observable getIndexForOptionChainLandingPage$default(OptionChainLandingStore optionChainLandingStore, OptionChainLandingPageUnderlyingState optionChainLandingPageUnderlyingState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return optionChainLandingStore.getIndexForOptionChainLandingPage(optionChainLandingPageUnderlyingState, z);
    }

    public final Observable<Integer> getIndexForOptionChainLandingPage(OptionChainLandingPageUnderlyingState state, boolean useNextTradableExpirationDate) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getOptionChainPageStates().isEmpty() || state.getCurrentOrNextMarketDates() == null) {
            Observable<Integer> observableJust = Observable.just(-1);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        if (useNextTradableExpirationDate) {
            return getIndexForNextTradableExpirationDate(state);
        }
        Observable<Integer> observableJust2 = Observable.just(-1);
        Intrinsics.checkNotNull(observableJust2);
        return observableJust2;
    }

    public final Observable<Integer> getIndexForNextTradableExpirationDate(final OptionChainLandingPageUnderlyingState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getCurrentOrNextMarketDates() == null) {
            Observable<Integer> observableJust = Observable.just(-1);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            return observableJust;
        }
        Observable<Integer> observable = Observable.fromIterable(state.getOptionChainPageStates()).concatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionChainLandingStore.getIndexForNextTradableExpirationDate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Integer> apply(OptionChainPageState dataState) {
                Intrinsics.checkNotNullParameter(dataState, "dataState");
                if (dataState.getSelloutTimeToExpiration() != null) {
                    OptionChainLandingStore optionChainLandingStore = OptionChainLandingStore.this;
                    OptionChainLandingPageUnderlyingState optionChainLandingPageUnderlyingState = state;
                    Observable observableProcessOptionPageState = optionChainLandingStore.processOptionPageState(dataState, optionChainLandingPageUnderlyingState.getCurrentOrNextMarketDates(), optionChainLandingPageUnderlyingState.isTradeOnExpirationEnabled(), r0.intValue(), optionChainLandingPageUnderlyingState.isIndexOptionsExtendedHoursEnabled());
                    if (observableProcessOptionPageState != null) {
                        return observableProcessOptionPageState;
                    }
                }
                return Observable.just(-1);
            }
        }).first(-1).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<Integer> processOptionPageState(final OptionChainPageState pageState, OptionCurrentOrNextMarketDates currentOrNextMarketDates, final boolean isTradeOnExpirationEnabled, final long selloutTimeToExpiration, final boolean isIndexOptionsExtendedHoursEnabled) {
        UiOptionChain uiOptionChain = pageState.getUiOptionChain();
        final LocalDate expirationDate = pageState.getExpirationDate();
        Instant instantNow = Instant.now(this.clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        final OptionMarketHoursParam optionMarketHoursParam = OptionMarketHoursParam2.getOptionMarketHoursParam(uiOptionChain, expirationDate, Instants.toLocalDate(instantNow, ZoneIds.INSTANCE.getNEW_YORK()));
        final LocalDate date = currentOrNextMarketDates.getDate(optionMarketHoursParam);
        Observable map = this.marketHoursStore.getMarketHoursToday().take(1L).filter(new Predicate() { // from class: com.robinhood.librobinhood.data.store.OptionChainLandingStore.processOptionPageState.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (!isTradeOnExpirationEnabled || !Intrinsics.areEqual(date, expirationDate)) {
                    return expirationDate.compareTo((ChronoLocalDate) date) > 0;
                }
                Instant optionCloseTime = OptionMarketHoursParam2.getOptionCloseTime(marketHours, optionMarketHoursParam, isIndexOptionsExtendedHoursEnabled);
                if (pageState.isEquityChain()) {
                    return Instant.now(this.clock).compareTo(optionCloseTime.minusSeconds(selloutTimeToExpiration)) < 0;
                }
                return (pageState.isIndexAMChain() && Instant.now(this.clock).compareTo(optionCloseTime) < 0) || pageState.isIndexPMChain();
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionChainLandingStore.processOptionPageState.2
            @Override // io.reactivex.functions.Function
            public final Integer apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "<unused var>");
                return Integer.valueOf(pageState.getOriginalIndex());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
