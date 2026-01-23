package com.robinhood.android.search.newsfeed.marketupdates;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.market.updates.p332db.MarketIndicator;
import com.robinhood.models.market.updates.p332db.MarketIndices;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.StringsKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewsFeedMarketIndicesViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketIndicesViewDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/search/newsfeed/marketupdates/NewsFeedMarketIndicesViewState;", "marketIndicesStore", "Lcom/robinhood/librobinhood/data/store/marketupdates/MarketIndicesStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/librobinhood/data/store/marketupdates/MarketIndicesStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Landroid/view/View;)V", "marketIndexKeysRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "", "cryptoKeysRelay", "onStart", "", "setNewsFeedContentMarketIndicators", "indicators", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedMarketIndicesViewDuxo extends ViewDuxo<NewsFeedMarketIndicesViewState> {
    public static final int $stable = 8;
    private final BehaviorRelay<List<String>> cryptoKeysRelay;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final BehaviorRelay<List<String>> marketIndexKeysRelay;
    private final MarketIndicesStore marketIndicesStore;

    public NewsFeedMarketIndicesViewDuxo(MarketIndicesStore marketIndicesStore, CryptoQuoteStore cryptoQuoteStore, View hostView) {
        Intrinsics.checkNotNullParameter(marketIndicesStore, "marketIndicesStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        NewsFeedMarketIndicesViewState newsFeedMarketIndicesViewState = new NewsFeedMarketIndicesViewState(null, null, null, 7, null);
        super(hostView, newsFeedMarketIndicesViewState, null, 4, null);
        this.marketIndicesStore = marketIndicesStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        BehaviorRelay<List<String>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.marketIndexKeysRelay = behaviorRelayCreate;
        BehaviorRelay<List<String>> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.cryptoKeysRelay = behaviorRelayCreate2;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMap = this.marketIndexKeysRelay.distinctUntilChanged().replay(1).refCount().switchMap(new Function() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketIndices> apply(List<String> keys) {
                Intrinsics.checkNotNullParameter(keys, "keys");
                return NewsFeedMarketIndicesViewDuxo.this.marketIndicesStore.streamMarketIndices(keys);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedMarketIndicesViewDuxo.onStart$lambda$1(this.f$0, (MarketIndices) obj);
            }
        });
        Observable<R> map = this.cryptoKeysRelay.distinctUntilChanged().replay(1).refCount().map(new Function() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$onStart$cryptoUuidsObs$1
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(List<String> keys) {
                UUID uuid;
                Intrinsics.checkNotNullParameter(keys, "keys");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = keys.iterator();
                while (it.hasNext()) {
                    try {
                        uuid = StringsKt.toUuid((String) it.next());
                    } catch (IllegalArgumentException unused) {
                        uuid = null;
                    }
                    if (uuid != null) {
                        arrayList.add(uuid);
                    }
                }
                return arrayList;
            }
        });
        Observable observableSwitchMap2 = map.switchMap(new Function() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CryptoQuote>> apply(List<UUID> uuids) {
                Intrinsics.checkNotNullParameter(uuids, "uuids");
                return NewsFeedMarketIndicesViewDuxo.this.cryptoQuoteStore.pollCryptoQuotes(Durations.INSTANCE.getFIVE_SECONDS()).asObservable(uuids);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable observableSwitchMap3 = map.switchMap(new Function() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CryptoQuote>> apply(List<UUID> uuids) {
                Intrinsics.checkNotNullParameter(uuids, "uuids");
                return NewsFeedMarketIndicesViewDuxo.this.cryptoQuoteStore.getStreamCryptoQuotes().asObservable(uuids);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedMarketIndicesViewDuxo.onStart$lambda$4(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(NewsFeedMarketIndicesViewDuxo newsFeedMarketIndicesViewDuxo, final MarketIndices marketIndices) {
        newsFeedMarketIndicesViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedMarketIndicesViewDuxo.onStart$lambda$1$lambda$0(marketIndices, (NewsFeedMarketIndicesViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedMarketIndicesViewState onStart$lambda$1$lambda$0(MarketIndices marketIndices, NewsFeedMarketIndicesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Map mutableMap = MapsKt.toMutableMap(applyMutation.getMarketIndicesMap());
        for (MarketIndicator marketIndicator : marketIndices.getIndicators()) {
            mutableMap.put(marketIndicator.getKey(), marketIndicator);
        }
        return NewsFeedMarketIndicesViewState.copy$default(applyMutation, null, mutableMap, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(NewsFeedMarketIndicesViewDuxo newsFeedMarketIndicesViewDuxo, final List list) {
        newsFeedMarketIndicesViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedMarketIndicesViewDuxo.onStart$lambda$4$lambda$3(list, (NewsFeedMarketIndicesViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedMarketIndicesViewState onStart$lambda$4$lambda$3(List list, NewsFeedMarketIndicesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Map mutableMap = MapsKt.toMutableMap(applyMutation.getCryptoQuotesMap());
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CryptoQuote cryptoQuote = (CryptoQuote) it.next();
            mutableMap.put(cryptoQuote.getId().toString(), cryptoQuote);
        }
        return NewsFeedMarketIndicesViewState.copy$default(applyMutation, null, null, mutableMap, 3, null);
    }

    public final void setNewsFeedContentMarketIndicators(final List<Content.MarketIndicator> indicators) {
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        List<Content.MarketIndicator> list = indicators;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((Content.MarketIndicator) obj).getIndicatorType(), Content.MarketIndicator.MARKET_INDEX_TYPE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Content.MarketIndicator) it.next()).getIndicatorKey());
        }
        this.marketIndexKeysRelay.accept(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((Content.MarketIndicator) obj2).getIndicatorType(), Content.MarketIndicator.CRYPTO_TYPE)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Content.MarketIndicator) it2.next()).getIndicatorKey());
        }
        this.cryptoKeysRelay.accept(arrayList4);
        applyMutation(new Function1() { // from class: com.robinhood.android.search.newsfeed.marketupdates.NewsFeedMarketIndicesViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return NewsFeedMarketIndicesViewDuxo.setNewsFeedContentMarketIndicators$lambda$9(indicators, (NewsFeedMarketIndicesViewState) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedMarketIndicesViewState setNewsFeedContentMarketIndicators$lambda$9(List list, NewsFeedMarketIndicesViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return NewsFeedMarketIndicesViewState.copy$default(applyMutation, list, null, null, 6, null);
    }
}
