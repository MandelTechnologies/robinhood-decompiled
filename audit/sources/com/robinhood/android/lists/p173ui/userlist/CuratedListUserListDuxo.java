package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellHelper;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.data.CuratedListEligibleItemsFetcher;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.lists.p173ui.userlist.CuratedListUserListDuxo;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.regiongate.WatchlistPositionsTabSwipeToTradeRegionGate;
import com.robinhood.android.regiongate.WatchlistTabRegionGate;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CryptoHistoricalStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedList3;
import com.robinhood.models.p320db.CuratedListItems;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.shared.store.lists.store.CuratedListItemViewModeStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: CuratedListUserListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001EBY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020!J\u0006\u0010)\u001a\u00020!J\u0006\u0010*\u001a\u00020!J\u0010\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010%J\u000e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020%J\u0006\u0010/\u001a\u00020!J\u000e\u00100\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dJ\u000e\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u001dH\u0002J\u000e\u00107\u001a\u00020!2\u0006\u00106\u001a\u00020\u001dJ\u000e\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020:J\b\u0010?\u001a\u00020%H\u0002J\u0006\u0010@\u001a\u00020!J\u0016\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020DR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010;\u001a\u00020<*\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eligibleItemsFetcher", "Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "curatedListItemViewModeStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoHistoricalStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/common/data/CuratedListEligibleItemsFetcher;Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemViewModeStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoHistoricalStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "listId", "Ljava/util/UUID;", "getListId", "()Ljava/util/UUID;", "onResume", "", "onWatchListItemBuy", "instrumentId", "accountNumber", "", "context", "Landroid/content/Context;", "clearPendingBuy", "enterEditMode", "exitEditMode", "setEditedEmoji", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "onTitleChanged", "title", "sendEdits", "removeInstrument", "removeCryptoItem", "currencyPairId", "removeFuturesContractItem", "contractId", "removeCuratedListItem", "itemId", "synchronizeListDeleteItem", "sortList", "selectedSortOption", "Lcom/robinhood/models/ui/SortOption;", "shouldReset", "", "getShouldReset", "(Lcom/robinhood/models/ui/SortOption;)Z", "getLocalMidnightTimestamp", "toggleDisclosureState", "synchronizeListPositionChange", "movedItemId", "newPosition", "", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListUserListDuxo extends OldBaseDuxo<CuratedListUserListViewState> implements HasSavedState {
    private static final long MIN_LOADING_TIME_IN_MILLIS = 500;
    private final BuySellStore buySellStore;
    private final CryptoHistoricalStore cryptoHistoricalStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CuratedListItemViewModeStore curatedListItemViewModeStore;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final CuratedListEligibleItemsFetcher eligibleItemsFetcher;
    private final ExperimentsStore experimentsStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListUserListDuxo(CuratedListEligibleItemsFetcher eligibleItemsFetcher, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, CuratedListItemViewModeStore curatedListItemViewModeStore, CryptoQuoteStore cryptoQuoteStore, CryptoHistoricalStore cryptoHistoricalStore, ExperimentsStore experimentsStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, SavedStateHandle savedStateHandle) {
        super(new CuratedListUserListViewState(null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048575, null), null, 2, null);
        Intrinsics.checkNotNullParameter(eligibleItemsFetcher, "eligibleItemsFetcher");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(curatedListItemViewModeStore, "curatedListItemViewModeStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalStore, "cryptoHistoricalStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eligibleItemsFetcher = eligibleItemsFetcher;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.curatedListItemViewModeStore = curatedListItemViewModeStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoHistoricalStore = cryptoHistoricalStore;
        this.experimentsStore = experimentsStore;
        this.buySellStore = buySellStore;
        this.regionGateProvider = regionGateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getListId() {
        return ((CuratedListKey.UserList) INSTANCE.getArgs((HasSavedState) this)).getListId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        CuratedListStore curatedListStore = this.curatedListStore;
        UUID listId = getListId();
        ApiCuratedList.OwnerType ownerType = ApiCuratedList.OwnerType.CUSTOM;
        curatedListStore.refreshList(false, listId, ownerType);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.streamCuratedList(getListId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$1(this.f$0, (CuratedList) obj);
            }
        });
        Observable observableRefCount = CuratedListEligibleItemsFetcher.streamCuratedListEligibleItems$default(this.eligibleItemsFetcher, getListId(), null, false, 6, null).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$3(this.f$0, (List) obj);
            }
        });
        Observable map = observableRefCount.map(CuratedListUserListDuxo2.INSTANCE);
        Observable observableSwitchMap = map.switchMap(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<CryptoQuote>> apply(List<UUID> currencyPairIds) {
                Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
                return CuratedListUserListDuxo.this.cryptoQuoteStore.getPollCryptoQuotes().asObservable(currencyPairIds);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        Observable observableSwitchMap2 = map.switchMap(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.onResume.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Object> apply(List<UUID> currencyPairIds) {
                Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
                return CuratedListUserListDuxo.this.cryptoHistoricalStore.poll(currencyPairIds, GraphSelection.TWENTY_FOUR_HOURS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListItemViewModeStore.streamCuratedListItemViewModeOrDefault(getListId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$5(this.f$0, (CuratedListViewMode) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.streamDeletedLists(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$7(this.f$0, (Set) obj);
            }
        });
        Observable observableDistinctUntilChanged = this.curatedListItemsStore.streamCuratedListItems(getListId()).map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.onResume.7
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CuratedListItems it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getHasFuturesContracts());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$9(this.f$0, (Boolean) obj);
            }
        });
        CuratedListItemsStore.refreshListItems$default(this.curatedListItemsStore, false, getListId(), ownerType, null, null, null, 56, null);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, WatchlistPositionsTabSwipeToTradeRegionGate.INSTANCE, false, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, WatchlistTabRegionGate.INSTANCE, false, 2, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$onResume$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) Boolean.valueOf(((Boolean) t1).booleanValue() || ((Boolean) t2).booleanValue());
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        LifecycleHost.DefaultImpls.bind$default(this, observableCombineLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$12(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableDistinctUntilChanged2 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$14(this.f$0, (Boolean) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged3 = ExperimentsKt.streamWithExperiment(this.regionGateProvider, this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, true).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$16(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(CuratedListUserListDuxo curatedListUserListDuxo, final CuratedList curatedList) {
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$1$lambda$0(curatedList, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$1$lambda$0(CuratedList curatedList, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, curatedList, null, null, null, null, false, false, null, null, new SortOption(curatedList.getChildSortOrder(), curatedList.getChildSortDirection()), null, false, false, false, false, false, null, null, false, false, 1048062, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(CuratedListUserListDuxo curatedListUserListDuxo, final List list) {
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$3$lambda$2(list, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$3$lambda$2(List list, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return CuratedListUserListViewState.copy$default(applyMutation, null, list, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048541, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(CuratedListUserListDuxo curatedListUserListDuxo, final CuratedListViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$5$lambda$4(viewMode, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$5$lambda$4(CuratedListViewMode curatedListViewMode, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, curatedListViewMode, false, false, false, false, false, null, null, false, false, 1047551, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(CuratedListUserListDuxo curatedListUserListDuxo, Set deletedLists) {
        Intrinsics.checkNotNullParameter(deletedLists, "deletedLists");
        if (deletedLists.contains(curatedListUserListDuxo.getListId())) {
            curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListDuxo.onResume$lambda$7$lambda$6((CuratedListUserListViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$7$lambda$6(CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, new UiEvent(Unit.INSTANCE), null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048567, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$9(CuratedListUserListDuxo curatedListUserListDuxo, final Boolean bool) {
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$9$lambda$8(bool, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$9$lambda$8(Boolean bool, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, bool.booleanValue(), false, false, false, null, null, false, false, 1044479, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(CuratedListUserListDuxo curatedListUserListDuxo, final boolean z) {
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$12$lambda$11(z, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$12$lambda$11(boolean z, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, z, false, false, null, null, false, false, 1040383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(CuratedListUserListDuxo curatedListUserListDuxo, final Boolean bool) {
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$14$lambda$13(bool, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$14$lambda$13(Boolean bool, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, bool.booleanValue(), false, 786431, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(CuratedListUserListDuxo curatedListUserListDuxo, final Boolean bool) {
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onResume$lambda$16$lambda$15(bool, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onResume$lambda$16$lambda$15(Boolean bool, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, false, bool.booleanValue(), false, null, null, false, false, 1032191, null);
    }

    /* compiled from: CuratedListUserListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$onWatchListItemBuy$1", m3645f = "CuratedListUserListDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$onWatchListItemBuy$1 */
    static final class C209231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C209231(UUID uuid, String str, Context context, Continuation<? super C209231> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
            this.$accountNumber = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CuratedListUserListDuxo.this.new C209231(this.$instrumentId, this.$accountNumber, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C209231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<BuySellData> buySellData = CuratedListUserListDuxo.this.buySellStore.getBuySellData(this.$instrumentId, this.$accountNumber);
                this.label = 1;
                obj = FlowKt.first(buySellData, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuySellData buySellData2 = (BuySellData) obj;
            final boolean isBuyToOpenEnabled = buySellData2 != null ? buySellData2.getIsBuyToOpenEnabled() : false;
            final String tradabilityError = null;
            if (!isBuyToOpenEnabled && buySellData2 != null) {
                Context context = this.$context;
                CuratedListUserListDuxo curatedListUserListDuxo = CuratedListUserListDuxo.this;
                tradabilityError = BuySellHelper.INSTANCE.getTradabilityError(context, buySellData2, curatedListUserListDuxo.getStatesFlow().getValue().getSubzeroEnabled(), curatedListUserListDuxo.getStatesFlow().getValue().isInEtfSupportedRegion());
            }
            CuratedListUserListDuxo curatedListUserListDuxo2 = CuratedListUserListDuxo.this;
            final UUID uuid = this.$instrumentId;
            curatedListUserListDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$onWatchListItemBuy$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CuratedListUserListDuxo.C209231.invokeSuspend$lambda$1(isBuyToOpenEnabled, tradabilityError, uuid, (CuratedListUserListViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListUserListViewState invokeSuspend$lambda$1(boolean z, String str, UUID uuid, CuratedListUserListViewState curatedListUserListViewState) {
            return CuratedListUserListViewState.copy$default(curatedListUserListViewState, null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, z, str, uuid, false, false, 819199, null);
        }
    }

    public final void onWatchListItemBuy(UUID instrumentId, String accountNumber, Context context) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C209231(instrumentId, accountNumber, context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState clearPendingBuy$lambda$17(CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 917503, null);
    }

    public final void clearPendingBuy() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.clearPendingBuy$lambda$17((CuratedListUserListViewState) obj);
            }
        });
    }

    public final void enterEditMode() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.enterEditMode$lambda$18((CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState enterEditMode$lambda$18(CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, applyMutation.getInternalCuratedListEligibleItems(), null, null, false, true, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048507, null);
    }

    public final void exitEditMode() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.exitEditMode$lambda$19((CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState exitEditMode$lambda$19(CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 523839, null);
    }

    public final void setEditedEmoji(final String emoji) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.setEditedEmoji$lambda$20(emoji, (CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState setEditedEmoji$lambda$20(String str, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, str, null, null, null, false, false, false, false, false, null, null, false, false, 1048447, null);
    }

    public final void onTitleChanged(final String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.onTitleChanged$lambda$21(title, (CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState onTitleChanged$lambda$21(String str, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, str, null, null, false, false, false, false, false, null, null, false, false, 1048319, null);
    }

    public final void sendEdits() {
        Observable<R> observableSwitchMapSingle = getStates().take(1L).switchMapSingle(new C209241());
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.sendEdits$lambda$22(this.f$0, obj);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.sendEdits$lambda$24(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CuratedListUserListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sendEdits$1 */
    static final class C209241<T, R> implements Function {
        C209241() {
        }

        @Override // io.reactivex.functions.Function
        public final SingleSource<? extends Object> apply(CuratedListUserListViewState state) {
            Completable completableUpdateListItems;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.getIsEditingWithChanges()) {
                CuratedListUserListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sendEdits$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListUserListDuxo.C209241.apply$lambda$0((CuratedListUserListViewState) obj);
                    }
                });
                CuratedList curatedList = state.getCuratedList();
                Intrinsics.checkNotNull(curatedList);
                List<CuratedListEligible> previewCuratedListEligibleItems = state.getPreviewCuratedListEligibleItems();
                if (state.getReorderedInEditMode() || state.isItemRemoved()) {
                    completableUpdateListItems = CuratedListUserListDuxo.this.curatedListItemsStore.updateListItems(CuratedListUserListDuxo.this.getListId(), ApiCuratedList.OwnerType.CUSTOM, previewCuratedListEligibleItems);
                } else {
                    completableUpdateListItems = Completable.complete();
                    Intrinsics.checkNotNull(completableUpdateListItems);
                }
                CuratedListStore curatedListStore = CuratedListUserListDuxo.this.curatedListStore;
                UUID id = curatedList.getId();
                String editedTitle = state.getEditedTitle();
                if (editedTitle == null) {
                    editedTitle = curatedList.getDisplayName();
                }
                Single<T> singleDoOnSuccess = completableUpdateListItems.andThen(CuratedListStore.updateList$default(curatedListStore, id, editedTitle, state.getEditedEmoji(), null, null, 24, null)).doOnSuccess(new AnonymousClass2(CuratedListUserListDuxo.this, previewCuratedListEligibleItems));
                Intrinsics.checkNotNull(singleDoOnSuccess);
                return singleDoOnSuccess;
            }
            Single singleJust = Single.just(Unit.INSTANCE);
            Intrinsics.checkNotNull(singleJust);
            return singleJust;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListUserListViewState apply$lambda$0(CuratedListUserListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, true, 524287, null);
        }

        /* compiled from: CuratedListUserListDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sendEdits$1$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements Consumer {
            final /* synthetic */ List<CuratedListEligible> $previewList;
            final /* synthetic */ CuratedListUserListDuxo this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(CuratedListUserListDuxo curatedListUserListDuxo, List<? extends CuratedListEligible> list) {
                this.this$0 = curatedListUserListDuxo;
                this.$previewList = list;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCuratedList apiCuratedList) {
                CuratedListUserListDuxo curatedListUserListDuxo = this.this$0;
                final List<CuratedListEligible> list = this.$previewList;
                curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sendEdits$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListUserListDuxo.C209241.AnonymousClass2.accept$lambda$0(list, (CuratedListUserListViewState) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CuratedListUserListViewState accept$lambda$0(List list, CuratedListUserListViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                return CuratedListUserListViewState.copy$default(applyMutation, null, list, list, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048569, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEdits$lambda$22(CuratedListUserListDuxo curatedListUserListDuxo, Object obj) {
        curatedListUserListDuxo.exitEditMode();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEdits$lambda$24(CuratedListUserListDuxo curatedListUserListDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.sendEdits$lambda$24$lambda$23(throwable, (CuratedListUserListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState sendEdits$lambda$24$lambda$23(Throwable th, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 524271, null);
    }

    public final void removeInstrument(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        removeCuratedListItem(instrumentId);
    }

    public final void removeCryptoItem(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        removeCuratedListItem(currencyPairId);
    }

    public final void removeFuturesContractItem(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        removeCuratedListItem(contractId);
    }

    private final void removeCuratedListItem(final UUID itemId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.removeCuratedListItem$lambda$26(itemId, (CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState removeCuratedListItem$lambda$26(UUID uuid, CuratedListUserListViewState applyMutation) {
        Object next;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Iterator<T> it = applyMutation.getPreviewCuratedListEligibleItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((CuratedListEligible) next).getCuratedListItem().getId(), uuid)) {
                break;
            }
        }
        CuratedListEligible curatedListEligible = (CuratedListEligible) next;
        return curatedListEligible != null ? CuratedListUserListViewState.copy$default(applyMutation, null, null, CollectionsKt.minus(applyMutation.getPreviewCuratedListEligibleItems(), curatedListEligible), null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048571, null) : applyMutation;
    }

    public final void synchronizeListDeleteItem(UUID itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Completable completableSwitchMapCompletable = getStates().take(1L).switchMapCompletable(new C209271(itemId));
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* compiled from: CuratedListUserListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$synchronizeListDeleteItem$1 */
    static final class C209271<T, R> implements Function {
        final /* synthetic */ UUID $itemId;

        C209271(UUID uuid) {
            this.$itemId = uuid;
        }

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(CuratedListUserListViewState state) {
            T next;
            Intrinsics.checkNotNullParameter(state, "state");
            List<CuratedListEligible> internalCuratedListEligibleItems = state.getInternalCuratedListEligibleItems();
            List<CuratedListEligible> internalCuratedListEligibleItems2 = state.getInternalCuratedListEligibleItems();
            UUID uuid = this.$itemId;
            Iterator<T> it = internalCuratedListEligibleItems2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((CuratedListEligible) next).getCuratedListItem().getId(), uuid)) {
                    break;
                }
            }
            CuratedListEligible curatedListEligible = next;
            if (curatedListEligible != null) {
                final List listMinus = CollectionsKt.minus(internalCuratedListEligibleItems, curatedListEligible);
                CuratedListUserListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$synchronizeListDeleteItem$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListUserListDuxo.C209271.apply$lambda$1(listMinus, (CuratedListUserListViewState) obj);
                    }
                });
                return CuratedListUserListDuxo.this.curatedListStore.removeFromList(CuratedListUserListDuxo.this.getListId(), curatedListEligible.getCuratedListItem().getId(), curatedListEligible.getCuratedListItem().getObjectType()).doOnError(new AnonymousClass2(CuratedListUserListDuxo.this, internalCuratedListEligibleItems));
            }
            return Completable.complete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListUserListViewState apply$lambda$1(List list, CuratedListUserListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListUserListViewState.copy$default(applyMutation, null, list, null, null, null, false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048573, null);
        }

        /* compiled from: CuratedListUserListDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$synchronizeListDeleteItem$1$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements Consumer {
            final /* synthetic */ List<CuratedListEligible> $previousList;
            final /* synthetic */ CuratedListUserListDuxo this$0;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(CuratedListUserListDuxo curatedListUserListDuxo, List<? extends CuratedListEligible> list) {
                this.this$0 = curatedListUserListDuxo;
                this.$previousList = list;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(final Throwable th) {
                CuratedListUserListDuxo curatedListUserListDuxo = this.this$0;
                final List<CuratedListEligible> list = this.$previousList;
                curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$synchronizeListDeleteItem$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CuratedListUserListDuxo.C209271.AnonymousClass2.accept$lambda$0(list, th, (CuratedListUserListViewState) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CuratedListUserListViewState accept$lambda$0(List list, Throwable th, CuratedListUserListViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                return CuratedListUserListViewState.copy$default(applyMutation, null, list, null, null, new UiEvent(th), false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048557, null);
            }
        }
    }

    public final void sortList(final SortOption selectedSortOption) {
        Intrinsics.checkNotNullParameter(selectedSortOption, "selectedSortOption");
        if (getShouldReset(selectedSortOption)) {
            selectedSortOption = new SortOption(ApiCuratedList.SortOrder.CUSTOM, ApiCuratedList.SortDirection.ASCENDING);
        }
        Observable<CuratedListUserListViewState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable<R> map = observableTake.map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sortList$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CuratedListUserListViewState) it).getCuratedList());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CuratedListUserListDuxo$sortList$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDoOnSubscribe = ObservableDelay2.minTimeInFlight$default(ObservablesKt.filterIsPresent(map), 500L, null, 2, null).switchMapSingle(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.sortList.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends CuratedList> apply(CuratedList curatedList) {
                Intrinsics.checkNotNullParameter(curatedList, "curatedList");
                return CuratedListStore.updateList$default(CuratedListUserListDuxo.this.curatedListStore, curatedList.getId(), curatedList.getDisplayName(), null, selectedSortOption.getSortOrder(), selectedSortOption.getSortDirection(), 4, null).map(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.sortList.2.1
                    @Override // io.reactivex.functions.Function
                    public final CuratedList apply(ApiCuratedList p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return CuratedList3.toDbModel(p0);
                    }
                });
            }
        }).doOnSubscribe(new C209263());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.sortList$lambda$28(this.f$0, selectedSortOption, (CuratedList) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.sortList$lambda$30(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CuratedListUserListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sortList$3 */
    static final class C209263<T> implements Consumer {
        C209263() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListUserListViewState accept$lambda$0(CuratedListUserListViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, true, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048543, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CuratedListUserListDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$sortList$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListDuxo.C209263.accept$lambda$0((CuratedListUserListViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortList$lambda$28(CuratedListUserListDuxo curatedListUserListDuxo, SortOption sortOption, CuratedList curatedList) {
        curatedListUserListDuxo.curatedListItemViewModeStore.updateViewMode(curatedListUserListDuxo.getListId(), SortOrders.getViewMode(sortOption.getSortOrder()));
        curatedListUserListDuxo.curatedListItemsStore.refreshListItems(true, curatedList.getId(), curatedList.getOwnerType(), sortOption.getSortOrder(), sortOption.getSortDirection(), curatedListUserListDuxo.getLocalMidnightTimestamp());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sortList$lambda$30(CuratedListUserListDuxo curatedListUserListDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListDuxo.sortList$lambda$30$lambda$29(t, (CuratedListUserListViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState sortList$lambda$30$lambda$29(Throwable th, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), false, false, null, null, null, null, false, false, false, false, false, null, null, false, false, 1048527, null);
    }

    private final boolean getShouldReset(SortOption sortOption) {
        return sortOption.getSortDirection() == ApiCuratedList.SortDirection.EMPTY || sortOption.getSortOrder() == ApiCuratedList.SortOrder.UNKNOWN;
    }

    private final String getLocalMidnightTimestamp() {
        String str = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_INSTANT);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final void toggleDisclosureState() {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.toggleDisclosureState$lambda$31((CuratedListUserListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState toggleDisclosureState$lambda$31(CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, null, null, null, false, false, null, null, null, null, !applyMutation.getExpandDisclosure(), false, false, false, false, null, null, false, false, 1046527, null);
    }

    public final void synchronizeListPositionChange(final UUID movedItemId, final int newPosition) {
        Intrinsics.checkNotNullParameter(movedItemId, "movedItemId");
        Observable<R> observableSwitchMap = getStates().take(1L).switchMap(new Function() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo.synchronizeListPositionChange.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<List<CuratedListEligible>, Boolean>> apply(CuratedListUserListViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                List<CuratedListEligible> curatedListEligibleItems = state.getCuratedListEligibleItems();
                int i = newPosition;
                if (i < 0 || i > curatedListEligibleItems.size()) {
                    return Observable.empty();
                }
                return Observable.just(Tuples4.m3642to(curatedListEligibleItems, Boolean.valueOf(state.isEditing())));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListUserListDuxo.synchronizeListPositionChange$lambda$35(newPosition, this, movedItemId, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit synchronizeListPositionChange$lambda$35(int i, CuratedListUserListDuxo curatedListUserListDuxo, UUID uuid, Tuples2 tuples2) {
        Object next;
        List list = (List) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        final List<? extends CuratedListEligible> mutableList = CollectionsKt.toMutableList((Collection) list);
        Iterator it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((CuratedListEligible) next).getCuratedListItem().getId(), uuid)) {
                break;
            }
        }
        Intrinsics.checkNotNull(next);
        CuratedListEligible curatedListEligible = (CuratedListEligible) next;
        mutableList.remove(curatedListEligible);
        mutableList.add(i, curatedListEligible);
        final SortOption sortOption = new SortOption(ApiCuratedList.SortOrder.CUSTOM, ApiCuratedList.SortDirection.EMPTY);
        if (zBooleanValue) {
            curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListDuxo.synchronizeListPositionChange$lambda$35$lambda$33(mutableList, sortOption, (CuratedListUserListViewState) obj);
                }
            });
        } else {
            curatedListUserListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.userlist.CuratedListUserListDuxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListUserListDuxo.synchronizeListPositionChange$lambda$35$lambda$34(mutableList, sortOption, (CuratedListUserListViewState) obj);
                }
            });
            curatedListUserListDuxo.curatedListItemsStore.updateListItems(curatedListUserListDuxo.getListId(), ApiCuratedList.OwnerType.CUSTOM, mutableList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState synchronizeListPositionChange$lambda$35$lambda$33(List list, SortOption sortOption, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, null, list, null, null, false, false, null, null, sortOption, null, false, false, false, false, false, null, null, false, false, 1048059, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListUserListViewState synchronizeListPositionChange$lambda$35$lambda$34(List list, SortOption sortOption, CuratedListUserListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListUserListViewState.copy$default(applyMutation, null, list, null, null, null, false, false, null, null, sortOption, null, false, false, false, false, false, null, null, false, false, 1048061, null);
    }

    /* compiled from: CuratedListUserListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListDuxo;", "Lcom/robinhood/android/common/contracts/CuratedListKey$UserList;", "<init>", "()V", "MIN_LOADING_TIME_IN_MILLIS", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CuratedListUserListDuxo, CuratedListKey.UserList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CuratedListKey.UserList getArgs(SavedStateHandle savedStateHandle) {
            return (CuratedListKey.UserList) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CuratedListKey.UserList getArgs(CuratedListUserListDuxo curatedListUserListDuxo) {
            return (CuratedListKey.UserList) DuxoCompanion.DefaultImpls.getArgs(this, curatedListUserListDuxo);
        }
    }
}
