package com.robinhood.android.common.data;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.store.futures.FuturesPositionStore;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function5;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CuratedListEligibleItemsFetcher.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J4\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001aH\u0002J,\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a2\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u001aH\u0002J&\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001a*\b\u0012\u0004\u0012\u00020%0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002010\u001aH\u0002J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u001a0\u0019*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002J&\u00104\u001a\b\u0012\u0004\u0012\u0002050\u001a*\b\u0012\u0004\u0012\u00020%0\u001a2\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u001aH\u0002J^\u00108\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a2\f\u00109\u001a\b\u0012\u0004\u0012\u00020+0\u001a2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002000\u001a2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020$0\u001a2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002050\u001a2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002030\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010>\u001a\b\u0012\u0004\u0012\u00020%0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R$\u0010A\u001a\b\u0012\u0004\u0012\u00020%0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R$\u0010C\u001a\b\u0012\u0004\u0012\u00020%0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R$\u0010E\u001a\b\u0012\u0004\u0012\u00020%0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R$\u0010G\u001a\b\u0012\u0004\u0012\u00020%0\u001a*\b\u0012\u0004\u0012\u00020%0\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010@¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "futuresPositionStore", "Lcom/robinhood/store/futures/FuturesPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/store/futures/FuturesPositionStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/android/indexes/store/IndexStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/coroutines/rx/RxFactory;)V", "streamCuratedListEligibleItems", "Lio/reactivex/Observable;", "", "Lcom/robinhood/models/ui/CuratedListEligible;", "listId", "Ljava/util/UUID;", "numberOfItemsToFetch", "", "includeOptions", "", "(Ljava/util/UUID;Ljava/lang/Integer;Z)Lio/reactivex/Observable;", "toInstrumentCuratedListEligible", "Lcom/robinhood/models/ui/InstrumentCuratedListEligible;", "Lcom/robinhood/models/db/CuratedListItem;", "positions", "Lcom/robinhood/models/db/Position;", "optionPositions", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "toCryptoCuratedListEligible", "Lcom/robinhood/models/ui/CryptoCuratedListEligible;", CryptoDetailSource.HOLDINGS, "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "toFutureCuratedListEligible", "Lcom/robinhood/models/ui/FuturesCuratedListEligible;", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "toIndexCuratedListEligible", "Lcom/robinhood/models/ui/IndexCuratedListEligible;", "toOptionStrategyCuratedListEligible", "Lcom/robinhood/models/ui/OptionStrategyCuratedListEligible;", "strategyInfoList", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "toCuratedListEligibleItems", "cryptoCuratedListEligibleList", "futuresCuratedListEligibleList", "instrumentCuratedListEligibleList", "optionStrategyCuratedListEligibleList", "indexCuratedListEligibleList", "currencyPairs", "getCurrencyPairs", "(Ljava/util/List;)Ljava/util/List;", "futuresContracts", "getFuturesContracts", "indexContracts", "getIndexContracts", "instruments", "getInstruments", "optionStrategies", "getOptionStrategies", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CuratedListEligibleItemsFetcher {
    private final AccountProvider accountProvider;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final FuturesPositionStore futuresPositionStore;
    private final IndexStore indexStore;
    private final OptionChainStore optionChainStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionStrategyInfoStore optionStrategyInfoStore;
    private final PositionStore positionStore;
    private final RxFactory rxFactory;

    public CuratedListEligibleItemsFetcher(AccountProvider accountProvider, CryptoHoldingStore cryptoHoldingStore, FuturesPositionStore futuresPositionStore, PositionStore positionStore, OptionPositionStore optionPositionStore, CuratedListItemsStore curatedListItemsStore, OptionStrategyInfoStore optionStrategyInfoStore, IndexStore indexStore, OptionChainStore optionChainStore, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(futuresPositionStore, "futuresPositionStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.accountProvider = accountProvider;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.futuresPositionStore = futuresPositionStore;
        this.positionStore = positionStore;
        this.optionPositionStore = optionPositionStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.indexStore = indexStore;
        this.optionChainStore = optionChainStore;
        this.rxFactory = rxFactory;
    }

    public static /* synthetic */ Observable streamCuratedListEligibleItems$default(CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, UUID uuid, Integer num, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return curatedListEligibleItemsFetcher.streamCuratedListEligibleItems(uuid, num, z);
    }

    public final Observable<List<CuratedListEligible>> streamCuratedListEligibleItems(UUID listId, final Integer numberOfItemsToFetch, final boolean includeOptions) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Observable<List<CuratedListEligible>> observableSwitchMap = this.curatedListItemsStore.streamCuratedListItems(listId).map(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher.streamCuratedListEligibleItems.1
            @Override // io.reactivex.functions.Function
            public final List<CuratedListItem> apply(CuratedListItems curatedListItems) {
                Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
                Sequence sequenceAsSequence = CollectionsKt.asSequence(curatedListItems.getListItems());
                Integer num = numberOfItemsToFetch;
                return SequencesKt.toList(SequencesKt.take(sequenceAsSequence, num != null ? num.intValue() : curatedListItems.getListItems().size()));
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher.streamCuratedListEligibleItems.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CuratedListEligible>> apply(final List<CuratedListItem> curatedListItems) {
                Observable<R> observableJust;
                Observable<R> map;
                Observable<R> observable;
                Observable<T> observableConvertToObservable;
                Observable indexCuratedListEligible;
                Observable<R> map2;
                Intrinsics.checkNotNullParameter(curatedListItems, "curatedListItems");
                final List instruments = CuratedListEligibleItemsFetcher.this.getInstruments(curatedListItems);
                if (instruments.isEmpty()) {
                    map = Observable.just(CollectionsKt.emptyList());
                } else {
                    List list = instruments;
                    final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((CuratedListItem) it.next()).getId());
                    }
                    Observable<List<Position>> individualAccountPositionsForInstruments = CuratedListEligibleItemsFetcher.this.positionStore.getIndividualAccountPositionsForInstruments(arrayList);
                    if (includeOptions) {
                        Observable<Optional<String>> observableStreamIndividualAccountNumberOptional = CuratedListEligibleItemsFetcher.this.accountProvider.streamIndividualAccountNumberOptional();
                        final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher = CuratedListEligibleItemsFetcher.this;
                        observableJust = observableStreamIndividualAccountNumberOptional.switchMap(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$instrumentCuratedListEligibleObs$optionsPositionObs$1
                            @Override // io.reactivex.functions.Function
                            public final ObservableSource<? extends List<UiOptionInstrumentPosition>> apply(Optional<String> optional) {
                                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                                String strComponent1 = optional.component1();
                                if (strComponent1 == null) {
                                    Observable observableJust2 = Observable.just(CollectionsKt.emptyList());
                                    Intrinsics.checkNotNull(observableJust2);
                                    return observableJust2;
                                }
                                return curatedListEligibleItemsFetcher.optionPositionStore.getUiOptionPositionsForEquityInstruments(strComponent1, arrayList);
                            }
                        });
                    } else {
                        observableJust = Observable.just(CollectionsKt.emptyList());
                    }
                    Observables observables = Observables.INSTANCE;
                    Intrinsics.checkNotNull(observableJust);
                    Observable observableCombineLatest = observables.combineLatest(individualAccountPositionsForInstruments, observableJust);
                    final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher2 = CuratedListEligibleItemsFetcher.this;
                    map = observableCombineLatest.map(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$instrumentCuratedListEligibleObs$1
                        @Override // io.reactivex.functions.Function
                        public final List<InstrumentCuratedListEligible> apply(Tuples2<? extends List<Position>, ? extends List<UiOptionInstrumentPosition>> tuples2) {
                            Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                            List<Position> listComponent1 = tuples2.component1();
                            List<UiOptionInstrumentPosition> listComponent2 = tuples2.component2();
                            CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher3 = curatedListEligibleItemsFetcher2;
                            List<CuratedListItem> list2 = instruments;
                            Intrinsics.checkNotNull(listComponent2);
                            return curatedListEligibleItemsFetcher3.toInstrumentCuratedListEligible(list2, listComponent1, listComponent2);
                        }
                    });
                }
                Observable<R> observable2 = map;
                final List currencyPairs = CuratedListEligibleItemsFetcher.this.getCurrencyPairs(curatedListItems);
                if (currencyPairs.isEmpty()) {
                    observable = Observable.just(CollectionsKt.emptyList());
                } else {
                    CuratedListEligibleItemsFetcher.this.cryptoHoldingStore.refresh(false);
                    Observable observableFromIterable = Observable.fromIterable(currencyPairs);
                    final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher3 = CuratedListEligibleItemsFetcher.this;
                    Single<List<R>> list2 = observableFromIterable.concatMap(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$currencyPairObs$1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Optional<UiCryptoHolding>> apply(CuratedListItem curatedListItem) {
                            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
                            return curatedListEligibleItemsFetcher3.cryptoHoldingStore.streamCryptoHoldings(curatedListItem.getId()).take(1L);
                        }
                    }).toList();
                    final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher4 = CuratedListEligibleItemsFetcher.this;
                    observable = list2.map(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$currencyPairObs$2
                        @Override // io.reactivex.functions.Function
                        public final List<CryptoCuratedListEligible> apply(List<Optional<UiCryptoHolding>> forexHoldings) {
                            Intrinsics.checkNotNullParameter(forexHoldings, "forexHoldings");
                            return curatedListEligibleItemsFetcher4.toCryptoCuratedListEligible(currencyPairs, forexHoldings);
                        }
                    }).toObservable();
                }
                final List futuresContracts = CuratedListEligibleItemsFetcher.this.getFuturesContracts(curatedListItems);
                if (futuresContracts.isEmpty()) {
                    observableConvertToObservable = Observable.just(CollectionsKt.emptyList());
                    Intrinsics.checkNotNull(observableConvertToObservable);
                } else {
                    final Flow<List<UiFuturesPosition>> flowStreamAllPositions = CuratedListEligibleItemsFetcher.this.futuresPositionStore.streamAllPositions();
                    final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher5 = CuratedListEligibleItemsFetcher.this;
                    observableConvertToObservable = CuratedListEligibleItemsFetcher.this.rxFactory.convertToObservable(new Flow<List<? extends FuturesCuratedListEligible>>() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$apply$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends FuturesCuratedListEligible>> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamAllPositions.collect(new AnonymousClass2(flowCollector, curatedListEligibleItemsFetcher5, futuresContracts), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$apply$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ List $futuresContracts$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ CuratedListEligibleItemsFetcher this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$apply$$inlined$map$1$2", m3645f = "CuratedListEligibleItemsFetcher.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$apply$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher, List list) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = curatedListEligibleItemsFetcher;
                                this.$futuresContracts$inlined = list;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    List futureCuratedListEligible = this.this$0.toFutureCuratedListEligible(this.$futuresContracts$inlined, (List) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(futureCuratedListEligible, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                }
                Observable<T> observable3 = observableConvertToObservable;
                List indexContracts = CuratedListEligibleItemsFetcher.this.getIndexContracts(curatedListItems);
                if (indexContracts.isEmpty()) {
                    indexCuratedListEligible = Observable.just(CollectionsKt.emptyList());
                    Intrinsics.checkNotNull(indexCuratedListEligible);
                } else {
                    indexCuratedListEligible = CuratedListEligibleItemsFetcher.this.toIndexCuratedListEligible(indexContracts);
                }
                Observable observable4 = indexCuratedListEligible;
                final List optionStrategies = CuratedListEligibleItemsFetcher.this.getOptionStrategies(curatedListItems);
                if (optionStrategies.isEmpty()) {
                    map2 = Observable.just(CollectionsKt.emptyList());
                } else {
                    List optionStrategies2 = CuratedListEligibleItemsFetcher.this.getOptionStrategies(curatedListItems);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionStrategies2, 10));
                    Iterator<T> it2 = optionStrategies2.iterator();
                    while (it2.hasNext()) {
                        String strategyCode = ((CuratedListItem) it2.next()).getStrategyCode();
                        Intrinsics.checkNotNull(strategyCode);
                        arrayList2.add(strategyCode);
                    }
                    OptionStrategyInfoStore.refresh$default(CuratedListEligibleItemsFetcher.this.optionStrategyInfoStore, arrayList2, false, 2, null);
                    Observable<List<UiOptionStrategyInfo>> observableStreamUiStrategyInfo = CuratedListEligibleItemsFetcher.this.optionStrategyInfoStore.streamUiStrategyInfo(arrayList2);
                    final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher6 = CuratedListEligibleItemsFetcher.this;
                    map2 = observableStreamUiStrategyInfo.map(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$optionStrategiesObs$1
                        @Override // io.reactivex.functions.Function
                        public final List<OptionStrategyCuratedListEligible> apply(List<UiOptionStrategyInfo> optionStrategyInfo) {
                            Intrinsics.checkNotNullParameter(optionStrategyInfo, "optionStrategyInfo");
                            return curatedListEligibleItemsFetcher6.toOptionStrategyCuratedListEligible(optionStrategies, optionStrategyInfo);
                        }
                    });
                }
                Observable<R> observable5 = map2;
                Observables observables2 = Observables.INSTANCE;
                Intrinsics.checkNotNull(observable);
                Intrinsics.checkNotNull(observable2);
                Intrinsics.checkNotNull(observable5);
                final CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher7 = CuratedListEligibleItemsFetcher.this;
                Observable observableCombineLatest2 = Observable.combineLatest(observable, observable3, observable2, observable5, observable4, new Function5<T1, T2, T3, T4, T5, R>() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$streamCuratedListEligibleItems$2$apply$$inlined$combineLatest$1
                    @Override // io.reactivex.functions.Function5
                    public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        Intrinsics.checkParameterIsNotNull(t3, "t3");
                        Intrinsics.checkParameterIsNotNull(t4, "t4");
                        Intrinsics.checkParameterIsNotNull(t5, "t5");
                        List list3 = (List) t4;
                        List list4 = (List) t3;
                        List list5 = (List) t2;
                        List list6 = (List) t1;
                        CuratedListEligibleItemsFetcher curatedListEligibleItemsFetcher8 = curatedListEligibleItemsFetcher7;
                        Intrinsics.checkNotNull(curatedListItems);
                        return (R) curatedListEligibleItemsFetcher8.toCuratedListEligibleItems(curatedListItems, list6, list5, list4, list3, (List) t5);
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
                return observableCombineLatest2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<InstrumentCuratedListEligible> toInstrumentCuratedListEligible(List<CuratedListItem> list, List<Position> list2, List<UiOptionInstrumentPosition> list3) {
        List<Position> list4 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        for (Object obj : list4) {
            linkedHashMap.put(((Position) obj).getInstrument(), obj);
        }
        List<CuratedListItem> list5 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
        for (final CuratedListItem curatedListItem : list5) {
            List list6 = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(list3), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(CuratedListEligibleItemsFetcher.toInstrumentCuratedListEligible$lambda$5$lambda$1(curatedListItem, (UiOptionInstrumentPosition) obj2));
                }
            }), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CuratedListEligibleItemsFetcher.toInstrumentCuratedListEligible$lambda$5$lambda$2((UiOptionInstrumentPosition) obj2);
                }
            }));
            BigDecimal bigDecimalAdd = null;
            if (list6.isEmpty()) {
                list6 = null;
            }
            Position position = (Position) linkedHashMap.get(curatedListItem.getId());
            if (list6 != null) {
                bigDecimalAdd = BigDecimal.ZERO;
                for (Object obj2 : list6) {
                    Intrinsics.checkNotNull(bigDecimalAdd);
                    bigDecimalAdd = bigDecimalAdd.add((BigDecimal) obj2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                }
                Intrinsics.checkNotNull(bigDecimalAdd);
            }
            arrayList.add(new InstrumentCuratedListEligible(curatedListItem, position, bigDecimalAdd));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toInstrumentCuratedListEligible$lambda$5$lambda$1(CuratedListItem curatedListItem, UiOptionInstrumentPosition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OptionUnderlier optionUnderlier = it.getOptionUnderlier();
        return Intrinsics.areEqual(optionUnderlier != null ? optionUnderlier.getInstrumentId() : null, curatedListItem.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BigDecimal toInstrumentCuratedListEligible$lambda$5$lambda$2(UiOptionInstrumentPosition it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOptionInstrumentPosition().getDisplayQuantity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CryptoCuratedListEligible> toCryptoCuratedListEligible(List<CuratedListItem> list, List<? extends Optional<UiCryptoHolding>> list2) {
        Sequence sequenceMapNotNull = SequencesKt.mapNotNull(CollectionsKt.asSequence(list2), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListEligibleItemsFetcher.toCryptoCuratedListEligible$lambda$6((Optional) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceMapNotNull) {
            linkedHashMap.put(((UiCryptoHolding) obj).getCurrencyPairId(), obj);
        }
        List<CuratedListItem> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (CuratedListItem curatedListItem : list3) {
            arrayList.add(new CryptoCuratedListEligible(curatedListItem, (UiCryptoHolding) linkedHashMap.get(curatedListItem.getId())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiCryptoHolding toCryptoCuratedListEligible$lambda$6(Optional it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (UiCryptoHolding) it.getOrNull();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FuturesCuratedListEligible> toFutureCuratedListEligible(List<CuratedListItem> list, List<UiFuturesPosition> list2) {
        List<UiFuturesPosition> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((UiFuturesPosition) obj).getContractId(), obj);
        }
        List<CuratedListItem> list4 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (CuratedListItem curatedListItem : list4) {
            arrayList.add(new FuturesCuratedListEligible(curatedListItem, (UiFuturesPosition) linkedHashMap.get(curatedListItem.getId())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<List<IndexCuratedListEligible>> toIndexCuratedListEligible(final List<CuratedListItem> list) {
        Query<List<UUID>, List<Index>> indexListByIdsQuery = this.indexStore.getIndexListByIdsQuery();
        List<CuratedListItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CuratedListItem) it.next()).getId());
        }
        Observable<List<IndexCuratedListEligible>> map = indexListByIdsQuery.asObservable(arrayList).flatMap(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher.toIndexCuratedListEligible.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiOptionChain>> apply(List<Index> indexes) {
                Intrinsics.checkNotNullParameter(indexes, "indexes");
                Query<List<UUID>, List<UiOptionChain>> streamUiOptionChains = CuratedListEligibleItemsFetcher.this.optionChainStore.getStreamUiOptionChains();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = indexes.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList2, ((Index) it2.next()).getTradableChainIds());
                }
                return streamUiOptionChains.asObservable(arrayList2);
            }
        }).map(new Function() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher.toIndexCuratedListEligible.3
            @Override // io.reactivex.functions.Function
            public final List<IndexCuratedListEligible> apply(List<UiOptionChain> chains) {
                Intrinsics.checkNotNullParameter(chains, "chains");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (T t : chains) {
                    UUID indexUnderlyingId = ((UiOptionChain) t).getIndexUnderlyingId();
                    Object arrayList2 = linkedHashMap.get(indexUnderlyingId);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(indexUnderlyingId, arrayList2);
                    }
                    ((List) arrayList2).add(t);
                }
                List<CuratedListItem> list3 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (CuratedListItem curatedListItem : list3) {
                    List list4 = (List) linkedHashMap.get(curatedListItem.getId());
                    boolean z = false;
                    if (list4 != null) {
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator<T> it2 = list5.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (((UiOptionChain) it2.next()).getOptionChain().getExtendedHoursState().getHasExtendedHours()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    arrayList3.add(new IndexCuratedListEligible(curatedListItem, z));
                }
                return arrayList3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OptionStrategyCuratedListEligible> toOptionStrategyCuratedListEligible(List<CuratedListItem> list, List<UiOptionStrategyInfo> list2) {
        List<UiOptionStrategyInfo> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((UiOptionStrategyInfo) obj).getOptionStrategyInfo().getStrategyCode(), obj);
        }
        List<CuratedListItem> list4 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        for (CuratedListItem curatedListItem : list4) {
            String strategyCode = curatedListItem.getStrategyCode();
            Intrinsics.checkNotNull(strategyCode);
            UiOptionStrategyInfo uiOptionStrategyInfo = (UiOptionStrategyInfo) linkedHashMap.get(strategyCode);
            if (uiOptionStrategyInfo == null || uiOptionStrategyInfo.getLegs().isEmpty()) {
                uiOptionStrategyInfo = null;
            }
            arrayList.add(new OptionStrategyCuratedListEligible(curatedListItem, uiOptionStrategyInfo));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListEligible> toCuratedListEligibleItems(List<CuratedListItem> list, List<CryptoCuratedListEligible> list2, List<FuturesCuratedListEligible> list3, List<InstrumentCuratedListEligible> list4, List<OptionStrategyCuratedListEligible> list5, List<IndexCuratedListEligible> list6) {
        List<CryptoCuratedListEligible> list7 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list7, 10)), 16));
        for (Object obj : list7) {
            linkedHashMap.put(((CryptoCuratedListEligible) obj).getCuratedListItem().getId(), obj);
        }
        List<FuturesCuratedListEligible> list8 = list3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list8, 10)), 16));
        for (Object obj2 : list8) {
            linkedHashMap2.put(((FuturesCuratedListEligible) obj2).getCuratedListItem().getId(), obj2);
        }
        Map mapPlus = MapsKt.plus(linkedHashMap, linkedHashMap2);
        List<InstrumentCuratedListEligible> list9 = list4;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list9, 10)), 16));
        for (Object obj3 : list9) {
            linkedHashMap3.put(((InstrumentCuratedListEligible) obj3).getCuratedListItem().getId(), obj3);
        }
        Map mapPlus2 = MapsKt.plus(mapPlus, linkedHashMap3);
        List<OptionStrategyCuratedListEligible> list10 = list5;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list10, 10)), 16));
        for (Object obj4 : list10) {
            linkedHashMap4.put(((OptionStrategyCuratedListEligible) obj4).getCuratedListItem().getId(), obj4);
        }
        Map mapPlus3 = MapsKt.plus(mapPlus2, linkedHashMap4);
        List<IndexCuratedListEligible> list11 = list6;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list11, 10)), 16));
        for (Object obj5 : list11) {
            linkedHashMap5.put(((IndexCuratedListEligible) obj5).getCuratedListItem().getId(), obj5);
        }
        Map mapPlus4 = MapsKt.plus(mapPlus3, linkedHashMap5);
        List<CuratedListItem> list12 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
        Iterator<T> it = list12.iterator();
        while (it.hasNext()) {
            arrayList.add((CuratedListEligible) MapsKt.getValue(mapPlus4, ((CuratedListItem) it.next()).getId()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListItem> getCurrencyPairs(List<CuratedListItem> list) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListEligibleItemsFetcher._get_currencyPairs_$lambda$20((CuratedListItem) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_currencyPairs_$lambda$20(CuratedListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getObjectType() == CuratedListObjectType.CURRENCY_PAIR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListItem> getFuturesContracts(List<CuratedListItem> list) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListEligibleItemsFetcher._get_futuresContracts_$lambda$21((CuratedListItem) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_futuresContracts_$lambda$21(CuratedListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getObjectType() == CuratedListObjectType.FUTURES_CONTRACT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListItem> getIndexContracts(List<CuratedListItem> list) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListEligibleItemsFetcher._get_indexContracts_$lambda$22((CuratedListItem) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_indexContracts_$lambda$22(CuratedListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getObjectType() == CuratedListObjectType.INDEX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListItem> getInstruments(List<CuratedListItem> list) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListEligibleItemsFetcher._get_instruments_$lambda$23((CuratedListItem) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_instruments_$lambda$23(CuratedListItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getObjectType() == CuratedListObjectType.INSTRUMENT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CuratedListItem> getOptionStrategies(List<CuratedListItem> list) {
        return SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.android.common.data.CuratedListEligibleItemsFetcher$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CuratedListEligibleItemsFetcher._get_optionStrategies_$lambda$24((CuratedListItem) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_optionStrategies_$lambda$24(CuratedListItem curatedListItem) {
        Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
        return curatedListItem.getObjectType() == CuratedListObjectType.OPTION_STRATEGY && curatedListItem.getStrategyCode() != null;
    }
}
