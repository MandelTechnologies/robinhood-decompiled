package com.robinhood.shared.history.accounts;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagedList;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.accounts.AccountsHistoryDuxo;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeSubFilter;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: AccountsHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002;<B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"J*\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%0$2\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002JR\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010-2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\"H\u0002J\f\u00106\u001a\u000207*\u00020\u0016H\u0002J\f\u00108\u001a\u000209*\u00020:H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "accountsHistoryStore", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/shared/app/type/AppType;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "stateRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo$HistoryFetchParams;", "kotlin.jvm.PlatformType", "onCreate", "", "onAccountSelected", "accountNumber", "", "onTransactionFilterSelected", "transactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "onTransactionSubFilterSelected", "subFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "streamHistoryEvents", "Lio/reactivex/Observable;", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "params", "historyState", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$State;", "fetchHistory", "minervaAccountId", "Ljava/util/UUID;", "rhyAccountId", "futuresSubAccountId", "swapsSubAccountId", "rhsAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "accountTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "transactionTypeSubFilter", "matchInitialFilters", "", "toStaticInstrumentFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$InstrumentFilter;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$InstrumentFilter;", "HistoryFetchParams", "Companion", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AccountsHistoryDuxo extends OldBaseDuxo<AccountsHistoryViewState> implements HasSavedState {
    private final AccountsHistoryStore accountsHistoryStore;
    private final HistoryStore historyStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final PublishRelay<HistoryFetchParams> stateRelay;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountsHistoryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountsHistoryContract.InstrumentFilterType.values().length];
            try {
                iArr[AccountsHistoryContract.InstrumentFilterType.CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountsHistoryContract.InstrumentFilterType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountsHistoryContract.InstrumentFilterType.FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountsHistoryContract.InstrumentFilterType.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountsHistoryContract.InstrumentFilterType.PERPETUALS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsHistoryDuxo(HistoryStore historyStore, AccountsHistoryStore accountsHistoryStore, RegionGateProvider regionGateProvider, UserStore userStore, AppType appType, SavedStateHandle savedStateHandle) {
        super(new AccountsHistoryViewState(null, ((AccountsHistoryContract.Key) INSTANCE.getArgs(savedStateHandle)).getTransactionTypeFilter(), null, false, false, null, null, null, null, null, false, false, false, false, false, false, null, appType == AppType.RHC, 131068, null), null, 2, null);
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(accountsHistoryStore, "accountsHistoryStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.historyStore = historyStore;
        this.accountsHistoryStore = accountsHistoryStore;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        PublishRelay<HistoryFetchParams> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.stateRelay = publishRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observables observables = Observables.INSTANCE;
        Observable observableDistinctUntilChanged = getStates().map(new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$onCreate$transactionTypeCountsStream$1
            @Override // io.reactivex.functions.Function
            public final Optional<UUID> apply(AccountsHistoryViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getSelectedFuturesSubAccountId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged2 = getStates().map(new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$onCreate$transactionTypeCountsStream$2
            @Override // io.reactivex.functions.Function
            public final Optional<UUID> apply(AccountsHistoryViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getSelectedSwapsSubAccountId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableCombineLatest = Observable.combineLatest(observableDistinctUntilChanged, observableDistinctUntilChanged2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$onCreate$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [R, java.util.ArrayList, java.util.Collection] */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Optional optional = (Optional) t2;
                Optional optional2 = (Optional) t1;
                EnumEntries<AccountsHistoryTransactionTypeFilter> entries = AccountsHistoryTransactionTypeFilter.getEntries();
                ?? r4 = (R) new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
                Iterator<AccountsHistoryTransactionTypeFilter> it = entries.iterator();
                while (it.hasNext()) {
                    AccountsHistoryTransactionTypeFilter next = it.next();
                    HistoryStore historyStore = this.this$0.historyStore;
                    Observable observableJust = Observable.just(Optional2.INSTANCE);
                    Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                    Observable observableJust2 = Observable.just(next.supportedHistoryTransactionTypes());
                    Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
                    Observable observableJust3 = Observable.just(Instant.EPOCH);
                    Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
                    AccountsHistoryContract.InstrumentFilter instrumentFilter = ((AccountsHistoryContract.Key) AccountsHistoryDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentFilter();
                    r4.add(HistoryStore.count$default(historyStore, observableJust, observableJust2, observableJust3, (Observable) null, new HistoryStaticFilter(instrumentFilter != null ? this.this$0.toStaticInstrumentFilter(instrumentFilter) : null, null, null, null, null, (UUID) optional2.getOrNull(), (UUID) optional.getOrNull(), null, null, Boolean.valueOf(next == AccountsHistoryTransactionTypeFilter.GOLD_DEPOSIT_BOOST), 414, null), 8, (Object) null));
                }
                return r4;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observableDistinctUntilChanged3 = observableCombineLatest.switchMap(new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Set<AccountsHistoryTransactionTypeFilter>> apply(List<? extends Observable<Integer>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.combineLatest(it, new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo.onCreate.1.1
                    @Override // io.reactivex.functions.Function
                    public final Set<AccountsHistoryTransactionTypeFilter> apply(Object[] values) {
                        Intrinsics.checkNotNullParameter(values, "values");
                        ArrayList arrayList = new ArrayList(values.length);
                        int length = values.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            Object obj = values[i];
                            int i3 = i2 + 1;
                            AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter = AccountsHistoryTransactionTypeFilter.getEntries().get(i2);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                            arrayList.add(Tuples4.m3642to(accountsHistoryTransactionTypeFilter, (Integer) obj));
                            i++;
                            i2 = i3;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : arrayList) {
                            if (((Number) ((Tuples2) t).component2()).intValue() > 0) {
                                arrayList2.add(t);
                            }
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList2.size());
                        Iterator<T> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add((AccountsHistoryTransactionTypeFilter) ((Tuples2) it2.next()).component1());
                        }
                        Set<AccountsHistoryTransactionTypeFilter> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                        return setUnmodifiableSet;
                    }
                });
            }
        }).subscribeOn(Schedulers.m3346io()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$3(this.f$0, (Set) obj);
            }
        });
        EnumEntries<AccountsHistoryTransactionTypeSubFilter> entries = AccountsHistoryTransactionTypeSubFilter.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        for (AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter : entries) {
            HistoryStore historyStore = this.historyStore;
            Observable observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            Observable observableJust2 = Observable.just(accountsHistoryTransactionTypeSubFilter.supportedHistoryTransactionTypes());
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            Observable observableJust3 = Observable.just(Instant.EPOCH);
            Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
            arrayList.add(HistoryStore.count$default(historyStore, observableJust, observableJust2, observableJust3, (Observable) null, (HistoryStaticFilter) null, 24, (Object) null));
        }
        Observable observableDistinctUntilChanged4 = Observable.combineLatest(arrayList, new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final Set<AccountsHistoryTransactionTypeSubFilter> apply(Object[] values) {
                Intrinsics.checkNotNullParameter(values, "values");
                ArrayList arrayList2 = new ArrayList(values.length);
                int length = values.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Object obj = values[i];
                    int i3 = i2 + 1;
                    AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter2 = AccountsHistoryTransactionTypeSubFilter.getEntries().get(i2);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    arrayList2.add(Tuples4.m3642to(accountsHistoryTransactionTypeSubFilter2, (Integer) obj));
                    i++;
                    i2 = i3;
                }
                ArrayList arrayList3 = new ArrayList();
                for (T t : arrayList2) {
                    if (((Number) ((Tuples2) t).component2()).intValue() > 0) {
                        arrayList3.add(t);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList3.size());
                Iterator<T> it = arrayList3.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((AccountsHistoryTransactionTypeSubFilter) ((Tuples2) it.next()).component1());
                }
                Set<AccountsHistoryTransactionTypeSubFilter> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                return setUnmodifiableSet;
            }
        }).subscribeOn(Schedulers.m3346io()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$6(this.f$0, (Set) obj);
            }
        });
        Observable observableThrottleLatest = this.stateRelay.switchMap(new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo.onCreate.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples3<HistoryFetchParams, PagedList<StatefulHistoryEvent<HistoryEvent>>, PagedList<StatefulHistoryEvent<HistoryEvent>>>> apply(HistoryFetchParams state) {
                Intrinsics.checkNotNullParameter(state, "state");
                Observables observables2 = Observables.INSTANCE;
                Observable observableJust4 = Observable.just(state);
                Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
                Observable observableCombineLatest2 = observables2.combineLatest(observableJust4, AccountsHistoryDuxo.this.streamHistoryEvents(state, HistoryEvent.State.PENDING), AccountsHistoryDuxo.this.streamHistoryEvents(state, HistoryEvent.State.SETTLED));
                if (!(((AccountsHistoryContract.Key) AccountsHistoryDuxo.INSTANCE.getArgs((HasSavedState) AccountsHistoryDuxo.this)).getHasTransactions() && AccountsHistoryDuxo.this.matchInitialFilters(state))) {
                    return observableCombineLatest2;
                }
                Observable<T> observableFilter = observableCombineLatest2.filter(new Predicate() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$onCreate$5$1$1
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(Tuples3<AccountsHistoryDuxo.HistoryFetchParams, ? extends PagedList<StatefulHistoryEvent<HistoryEvent>>, ? extends PagedList<StatefulHistoryEvent<HistoryEvent>>> tuples3) {
                        Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                        return (tuples3.component2().isEmpty() && tuples3.component3().isEmpty()) ? false : true;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
                return observableFilter;
            }
        }).distinctUntilChanged().throttleLatest(350L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$8(this.f$0, (Tuples3) obj);
            }
        });
        Observable<List<AccountsHistoryStore.HistoryAccountFilterViewInfo>> observableDistinctUntilChanged5 = this.accountsHistoryStore.streamAccounts().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$10(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged6 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged6, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$12(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, CryptoRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged7, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$14(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged8 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged8, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$16(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged9 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, FuturesTradingRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged9, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$18(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged10 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EventContractsRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged10, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged10, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$20(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged11 = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, AdvisoryRegionGate.INSTANCE, false, 2, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged11, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged11, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$22(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged12 = this.userStore.getUser().map(new Function() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo.onCreate.14
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrigin().getLocality();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged12, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged12, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$24(this.f$0, (CountryCode.Supported) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AccountsHistoryDuxo accountsHistoryDuxo, final Set set) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$3$lambda$2(set, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$3$lambda$2(Set set, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(set);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, extensions2.toPersistentSet(set), null, false, false, false, false, false, false, null, false, 261887, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(AccountsHistoryDuxo accountsHistoryDuxo, final Set set) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$6$lambda$5(set, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$6$lambda$5(Set set, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(set);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, extensions2.toPersistentSet(set), false, false, false, false, false, false, null, false, 261631, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(AccountsHistoryDuxo accountsHistoryDuxo, Tuples3 tuples3) {
        final PagedList pagedList = (PagedList) tuples3.component2();
        final PagedList pagedList2 = (PagedList) tuples3.component3();
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$8$lambda$7(pagedList, pagedList2, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$8$lambda$7(PagedList pagedList, PagedList pagedList2, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, pagedList, pagedList2, null, null, null, false, false, false, false, false, false, null, false, 262023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(final AccountsHistoryDuxo accountsHistoryDuxo, final List list) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$10$lambda$9(list, accountsHistoryDuxo, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$10$lambda$9(List list, AccountsHistoryDuxo accountsHistoryDuxo, AccountsHistoryViewState applyMutation) {
        AccountsHistoryTransactionTypeFilter selectedTransactionTypeFilter;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(applyMutation.getSelectedAccountTypeFilter()).supports(applyMutation.getSelectedTransactionTypeFilter())) {
            selectedTransactionTypeFilter = applyMutation.getSelectedTransactionTypeFilter();
        } else {
            selectedTransactionTypeFilter = AccountsHistoryTransactionTypeFilter.ALL;
        }
        AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter = selectedTransactionTypeFilter;
        AccountsHistoryStore.HistoryAccountFilterViewInfo selectedAccountTypeFilter = applyMutation.getSelectedAccountTypeFilter();
        if (selectedAccountTypeFilter == null) {
            Intrinsics.checkNotNull(list);
            selectedAccountTypeFilter = AccountsHistoryExtensions.loadFirstSelectedAccountTypeFilter(list, (AccountsHistoryContract.Key) INSTANCE.getArgs(accountsHistoryDuxo.getSavedStateHandle()));
        }
        Intrinsics.checkNotNull(list);
        AccountsHistoryViewState accountsHistoryViewStateCopy$default = AccountsHistoryViewState.copy$default(applyMutation, selectedAccountTypeFilter, accountsHistoryTransactionTypeFilter, null, false, false, null, null, extensions2.toPersistentList(list), null, null, false, false, false, false, false, false, null, false, 262012, null);
        accountsHistoryDuxo.fetchHistory(accountsHistoryViewStateCopy$default.getSelectedMinervaAccountId(), accountsHistoryViewStateCopy$default.getSelectedRhyAccountId(), accountsHistoryViewStateCopy$default.getSelectedFuturesSubAccountId(), accountsHistoryViewStateCopy$default.getSelectedSwapsSubAccountId(), accountsHistoryViewStateCopy$default.getRhsAccountContext(), AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(accountsHistoryViewStateCopy$default.getSelectedAccountTypeFilter()), accountsHistoryViewStateCopy$default.getSelectedTransactionTypeFilter(), accountsHistoryViewStateCopy$default.getSelectedTransactionTypeSubFilter());
        return accountsHistoryViewStateCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$12$lambda$11(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$12$lambda$11(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, bool.booleanValue(), false, false, false, false, false, null, false, 261119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$14(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$14$lambda$13(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$14$lambda$13(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, bool.booleanValue(), false, false, false, false, null, false, 260095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$16(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$16$lambda$15(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$16$lambda$15(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, false, bool.booleanValue(), false, false, false, null, false, 258047, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$18$lambda$17(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$18$lambda$17(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, false, false, bool.booleanValue(), false, false, null, false, 253951, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$20(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$20$lambda$19(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$20$lambda$19(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, false, false, false, bool.booleanValue(), false, null, false, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$22(AccountsHistoryDuxo accountsHistoryDuxo, final Boolean bool) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$22$lambda$21(bool, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$22$lambda$21(Boolean bool, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, false, false, false, false, bool.booleanValue(), null, false, 229375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$24(AccountsHistoryDuxo accountsHistoryDuxo, final CountryCode.Supported supported) {
        accountsHistoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onCreate$lambda$24$lambda$23(supported, (AccountsHistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onCreate$lambda$24$lambda$23(CountryCode.Supported supported, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AccountsHistoryViewState.copy$default(applyMutation, null, null, null, false, false, null, null, null, null, null, false, false, false, false, false, false, supported, false, 196607, null);
    }

    public final void onAccountSelected(final String accountNumber) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onAccountSelected$lambda$25(accountNumber, this, (AccountsHistoryViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onAccountSelected$lambda$25(String str, AccountsHistoryDuxo accountsHistoryDuxo, AccountsHistoryViewState applyMutation) {
        AccountsHistoryTransactionTypeFilter selectedTransactionTypeFilter;
        AccountsHistoryTransactionTypeSubFilter selectedTransactionTypeSubFilter;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfoFindFromAccountNumber = str != null ? AccountsHistoryStoreExtensions.findFromAccountNumber(applyMutation.getAccounts(), str) : null;
        if (Intrinsics.areEqual(applyMutation.getSelectedAccountTypeFilter(), historyAccountFilterViewInfoFindFromAccountNumber)) {
            return applyMutation;
        }
        if (AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(historyAccountFilterViewInfoFindFromAccountNumber).supports(applyMutation.getSelectedTransactionTypeFilter())) {
            selectedTransactionTypeFilter = applyMutation.getSelectedTransactionTypeFilter();
        } else {
            selectedTransactionTypeFilter = AccountsHistoryTransactionTypeFilter.ALL;
        }
        AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter = selectedTransactionTypeFilter;
        if (accountsHistoryTransactionTypeFilter.supports(applyMutation.getSelectedTransactionTypeSubFilter())) {
            selectedTransactionTypeSubFilter = applyMutation.getSelectedTransactionTypeSubFilter();
        } else {
            selectedTransactionTypeSubFilter = AccountsHistoryTransactionTypeSubFilter.ALL;
        }
        AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter = selectedTransactionTypeSubFilter;
        AccountsHistoryViewState accountsHistoryViewStateCopy$default = AccountsHistoryViewState.copy$default(applyMutation, historyAccountFilterViewInfoFindFromAccountNumber, accountsHistoryTransactionTypeFilter, accountsHistoryTransactionTypeSubFilter, true, false, null, null, null, null, null, false, false, false, false, false, false, null, false, 262016, null);
        accountsHistoryDuxo.fetchHistory(accountsHistoryViewStateCopy$default.getSelectedMinervaAccountId(), accountsHistoryViewStateCopy$default.getSelectedRhyAccountId(), accountsHistoryViewStateCopy$default.getSelectedFuturesSubAccountId(), accountsHistoryViewStateCopy$default.getSelectedSwapsSubAccountId(), accountsHistoryViewStateCopy$default.getRhsAccountContext(), AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(historyAccountFilterViewInfoFindFromAccountNumber), accountsHistoryTransactionTypeFilter, accountsHistoryTransactionTypeSubFilter);
        return accountsHistoryViewStateCopy$default;
    }

    public final void onTransactionFilterSelected(final AccountsHistoryTransactionTypeFilter transactionTypeFilter) {
        Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
        applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onTransactionFilterSelected$lambda$26(transactionTypeFilter, this, (AccountsHistoryViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onTransactionFilterSelected$lambda$26(AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, AccountsHistoryDuxo accountsHistoryDuxo, AccountsHistoryViewState applyMutation) {
        AccountsHistoryTransactionTypeSubFilter selectedTransactionTypeSubFilter;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getSelectedTransactionTypeFilter() == accountsHistoryTransactionTypeFilter) {
            return applyMutation;
        }
        if (accountsHistoryTransactionTypeFilter.supports(applyMutation.getSelectedTransactionTypeSubFilter())) {
            selectedTransactionTypeSubFilter = applyMutation.getSelectedTransactionTypeSubFilter();
        } else {
            selectedTransactionTypeSubFilter = AccountsHistoryTransactionTypeSubFilter.ALL;
        }
        AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter = selectedTransactionTypeSubFilter;
        AccountsHistoryViewState accountsHistoryViewStateCopy$default = AccountsHistoryViewState.copy$default(applyMutation, null, accountsHistoryTransactionTypeFilter, accountsHistoryTransactionTypeSubFilter, true, false, null, null, null, null, null, false, false, false, false, false, false, null, false, 262017, null);
        accountsHistoryDuxo.fetchHistory(accountsHistoryViewStateCopy$default.getSelectedMinervaAccountId(), accountsHistoryViewStateCopy$default.getSelectedRhyAccountId(), accountsHistoryViewStateCopy$default.getSelectedFuturesSubAccountId(), accountsHistoryViewStateCopy$default.getSelectedSwapsSubAccountId(), accountsHistoryViewStateCopy$default.getRhsAccountContext(), AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(applyMutation.getSelectedAccountTypeFilter()), accountsHistoryTransactionTypeFilter, accountsHistoryTransactionTypeSubFilter);
        return accountsHistoryViewStateCopy$default;
    }

    public final void onTransactionSubFilterSelected(final AccountsHistoryTransactionTypeSubFilter subFilter) {
        Intrinsics.checkNotNullParameter(subFilter, "subFilter");
        applyMutation(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryDuxo.onTransactionSubFilterSelected$lambda$27(subFilter, this, (AccountsHistoryViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountsHistoryViewState onTransactionSubFilterSelected$lambda$27(AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter, AccountsHistoryDuxo accountsHistoryDuxo, AccountsHistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getSelectedTransactionTypeSubFilter() == accountsHistoryTransactionTypeSubFilter) {
            return applyMutation;
        }
        AccountsHistoryViewState accountsHistoryViewStateCopy$default = AccountsHistoryViewState.copy$default(applyMutation, null, null, accountsHistoryTransactionTypeSubFilter, true, false, null, null, null, null, null, false, false, false, false, false, false, null, false, 262019, null);
        accountsHistoryDuxo.fetchHistory(accountsHistoryViewStateCopy$default.getSelectedMinervaAccountId(), accountsHistoryViewStateCopy$default.getSelectedRhyAccountId(), accountsHistoryViewStateCopy$default.getSelectedFuturesSubAccountId(), accountsHistoryViewStateCopy$default.getSelectedSwapsSubAccountId(), accountsHistoryViewStateCopy$default.getRhsAccountContext(), AccountsHistoryStoreExtensions.getAccountTypeForSelectedAccount(applyMutation.getSelectedAccountTypeFilter()), accountsHistoryViewStateCopy$default.getSelectedTransactionTypeFilter(), accountsHistoryTransactionTypeSubFilter);
        return accountsHistoryViewStateCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<PagedList<StatefulHistoryEvent<HistoryEvent>>> streamHistoryEvents(HistoryFetchParams params, HistoryEvent.State historyState) {
        Set<HistoryTransactionType> supportedHistoryTransactionTypes = params.getSupportedHistoryTransactionTypes();
        HistoryStore historyStore = this.historyStore;
        Observable observableJust = Observable.just(Optional3.asOptional(historyState));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable observableJust2 = Observable.just(supportedHistoryTransactionTypes);
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Observable observableJust3 = Observable.just(Instant.EPOCH);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        UUID minervaAccountId = params.getMinervaAccountId();
        HistoryStaticFilter.RhsAccountContext rhsAccountContext = params.getRhsAccountContext();
        UUID rhyAccountId = params.getRhyAccountId();
        UUID futuresSubAccountId = params.getFuturesSubAccountId();
        UUID swapsSubAccountId = params.getSwapsSubAccountId();
        Boolean boolIsCrypto = params.getAccountTypeFilter().isCrypto();
        Boolean boolIsBrokerage = params.getAccountTypeFilter().isBrokerage();
        boolean z = params.getTransactionTypeFilter() == AccountsHistoryTransactionTypeFilter.GOLD_DEPOSIT_BOOST;
        AccountsHistoryContract.InstrumentFilter instrumentFilter = ((AccountsHistoryContract.Key) INSTANCE.getArgs((HasSavedState) this)).getInstrumentFilter();
        return HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, new HistoryStaticFilter(instrumentFilter != null ? toStaticInstrumentFilter(instrumentFilter) : null, rhsAccountContext, null, minervaAccountId, rhyAccountId, futuresSubAccountId, swapsSubAccountId, boolIsCrypto, boolIsBrokerage, Boolean.valueOf(z), 4, null), 0, 40, null);
    }

    private final void fetchHistory(UUID minervaAccountId, UUID rhyAccountId, UUID futuresSubAccountId, UUID swapsSubAccountId, HistoryStaticFilter.RhsAccountContext rhsAccountContext, AccountsHistoryAccountTypeFilter accountTypeFilter, AccountsHistoryTransactionTypeFilter transactionTypeFilter, AccountsHistoryTransactionTypeSubFilter transactionTypeSubFilter) {
        this.stateRelay.accept(new HistoryFetchParams(minervaAccountId, rhyAccountId, futuresSubAccountId, swapsSubAccountId, rhsAccountContext, accountTypeFilter, transactionTypeFilter, transactionTypeSubFilter));
    }

    /* compiled from: AccountsHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Jc\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00063"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo$HistoryFetchParams;", "", "minervaAccountId", "Ljava/util/UUID;", "rhyAccountId", "futuresSubAccountId", "swapsSubAccountId", "rhsAccountContext", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "accountTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "transactionTypeFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "transactionTypeSubFilter", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;)V", "getMinervaAccountId", "()Ljava/util/UUID;", "getRhyAccountId", "getFuturesSubAccountId", "getSwapsSubAccountId", "getRhsAccountContext", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter$RhsAccountContext;", "getAccountTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "getTransactionTypeFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeFilter;", "getTransactionTypeSubFilter", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryTransactionTypeSubFilter;", "supportedHistoryTransactionTypes", "", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getSupportedHistoryTransactionTypes", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HistoryFetchParams {
        public static final int $stable = 8;
        private final AccountsHistoryAccountTypeFilter accountTypeFilter;
        private final UUID futuresSubAccountId;
        private final UUID minervaAccountId;
        private final HistoryStaticFilter.RhsAccountContext rhsAccountContext;
        private final UUID rhyAccountId;
        private final UUID swapsSubAccountId;
        private final AccountsHistoryTransactionTypeFilter transactionTypeFilter;
        private final AccountsHistoryTransactionTypeSubFilter transactionTypeSubFilter;

        public static /* synthetic */ HistoryFetchParams copy$default(HistoryFetchParams historyFetchParams, UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, HistoryStaticFilter.RhsAccountContext rhsAccountContext, AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter, AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter, AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = historyFetchParams.minervaAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = historyFetchParams.rhyAccountId;
            }
            if ((i & 4) != 0) {
                uuid3 = historyFetchParams.futuresSubAccountId;
            }
            if ((i & 8) != 0) {
                uuid4 = historyFetchParams.swapsSubAccountId;
            }
            if ((i & 16) != 0) {
                rhsAccountContext = historyFetchParams.rhsAccountContext;
            }
            if ((i & 32) != 0) {
                accountsHistoryAccountTypeFilter = historyFetchParams.accountTypeFilter;
            }
            if ((i & 64) != 0) {
                accountsHistoryTransactionTypeFilter = historyFetchParams.transactionTypeFilter;
            }
            if ((i & 128) != 0) {
                accountsHistoryTransactionTypeSubFilter = historyFetchParams.transactionTypeSubFilter;
            }
            AccountsHistoryTransactionTypeFilter accountsHistoryTransactionTypeFilter2 = accountsHistoryTransactionTypeFilter;
            AccountsHistoryTransactionTypeSubFilter accountsHistoryTransactionTypeSubFilter2 = accountsHistoryTransactionTypeSubFilter;
            HistoryStaticFilter.RhsAccountContext rhsAccountContext2 = rhsAccountContext;
            AccountsHistoryAccountTypeFilter accountsHistoryAccountTypeFilter2 = accountsHistoryAccountTypeFilter;
            return historyFetchParams.copy(uuid, uuid2, uuid3, uuid4, rhsAccountContext2, accountsHistoryAccountTypeFilter2, accountsHistoryTransactionTypeFilter2, accountsHistoryTransactionTypeSubFilter2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getMinervaAccountId() {
            return this.minervaAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getRhyAccountId() {
            return this.rhyAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getFuturesSubAccountId() {
            return this.futuresSubAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getSwapsSubAccountId() {
            return this.swapsSubAccountId;
        }

        /* renamed from: component5, reason: from getter */
        public final HistoryStaticFilter.RhsAccountContext getRhsAccountContext() {
            return this.rhsAccountContext;
        }

        /* renamed from: component6, reason: from getter */
        public final AccountsHistoryAccountTypeFilter getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        /* renamed from: component7, reason: from getter */
        public final AccountsHistoryTransactionTypeFilter getTransactionTypeFilter() {
            return this.transactionTypeFilter;
        }

        /* renamed from: component8, reason: from getter */
        public final AccountsHistoryTransactionTypeSubFilter getTransactionTypeSubFilter() {
            return this.transactionTypeSubFilter;
        }

        public final HistoryFetchParams copy(UUID minervaAccountId, UUID rhyAccountId, UUID futuresSubAccountId, UUID swapsSubAccountId, HistoryStaticFilter.RhsAccountContext rhsAccountContext, AccountsHistoryAccountTypeFilter accountTypeFilter, AccountsHistoryTransactionTypeFilter transactionTypeFilter, AccountsHistoryTransactionTypeSubFilter transactionTypeSubFilter) {
            Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeSubFilter, "transactionTypeSubFilter");
            return new HistoryFetchParams(minervaAccountId, rhyAccountId, futuresSubAccountId, swapsSubAccountId, rhsAccountContext, accountTypeFilter, transactionTypeFilter, transactionTypeSubFilter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HistoryFetchParams)) {
                return false;
            }
            HistoryFetchParams historyFetchParams = (HistoryFetchParams) other;
            return Intrinsics.areEqual(this.minervaAccountId, historyFetchParams.minervaAccountId) && Intrinsics.areEqual(this.rhyAccountId, historyFetchParams.rhyAccountId) && Intrinsics.areEqual(this.futuresSubAccountId, historyFetchParams.futuresSubAccountId) && Intrinsics.areEqual(this.swapsSubAccountId, historyFetchParams.swapsSubAccountId) && Intrinsics.areEqual(this.rhsAccountContext, historyFetchParams.rhsAccountContext) && this.accountTypeFilter == historyFetchParams.accountTypeFilter && this.transactionTypeFilter == historyFetchParams.transactionTypeFilter && this.transactionTypeSubFilter == historyFetchParams.transactionTypeSubFilter;
        }

        public int hashCode() {
            UUID uuid = this.minervaAccountId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.rhyAccountId;
            int iHashCode2 = (iHashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31;
            UUID uuid3 = this.futuresSubAccountId;
            int iHashCode3 = (iHashCode2 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31;
            UUID uuid4 = this.swapsSubAccountId;
            int iHashCode4 = (iHashCode3 + (uuid4 == null ? 0 : uuid4.hashCode())) * 31;
            HistoryStaticFilter.RhsAccountContext rhsAccountContext = this.rhsAccountContext;
            return ((((((iHashCode4 + (rhsAccountContext != null ? rhsAccountContext.hashCode() : 0)) * 31) + this.accountTypeFilter.hashCode()) * 31) + this.transactionTypeFilter.hashCode()) * 31) + this.transactionTypeSubFilter.hashCode();
        }

        public String toString() {
            return "HistoryFetchParams(minervaAccountId=" + this.minervaAccountId + ", rhyAccountId=" + this.rhyAccountId + ", futuresSubAccountId=" + this.futuresSubAccountId + ", swapsSubAccountId=" + this.swapsSubAccountId + ", rhsAccountContext=" + this.rhsAccountContext + ", accountTypeFilter=" + this.accountTypeFilter + ", transactionTypeFilter=" + this.transactionTypeFilter + ", transactionTypeSubFilter=" + this.transactionTypeSubFilter + ")";
        }

        public HistoryFetchParams(UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4, HistoryStaticFilter.RhsAccountContext rhsAccountContext, AccountsHistoryAccountTypeFilter accountTypeFilter, AccountsHistoryTransactionTypeFilter transactionTypeFilter, AccountsHistoryTransactionTypeSubFilter transactionTypeSubFilter) {
            Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeFilter, "transactionTypeFilter");
            Intrinsics.checkNotNullParameter(transactionTypeSubFilter, "transactionTypeSubFilter");
            this.minervaAccountId = uuid;
            this.rhyAccountId = uuid2;
            this.futuresSubAccountId = uuid3;
            this.swapsSubAccountId = uuid4;
            this.rhsAccountContext = rhsAccountContext;
            this.accountTypeFilter = accountTypeFilter;
            this.transactionTypeFilter = transactionTypeFilter;
            this.transactionTypeSubFilter = transactionTypeSubFilter;
        }

        public final UUID getMinervaAccountId() {
            return this.minervaAccountId;
        }

        public final UUID getRhyAccountId() {
            return this.rhyAccountId;
        }

        public final UUID getFuturesSubAccountId() {
            return this.futuresSubAccountId;
        }

        public final UUID getSwapsSubAccountId() {
            return this.swapsSubAccountId;
        }

        public final HistoryStaticFilter.RhsAccountContext getRhsAccountContext() {
            return this.rhsAccountContext;
        }

        public final AccountsHistoryAccountTypeFilter getAccountTypeFilter() {
            return this.accountTypeFilter;
        }

        public final AccountsHistoryTransactionTypeFilter getTransactionTypeFilter() {
            return this.transactionTypeFilter;
        }

        public final AccountsHistoryTransactionTypeSubFilter getTransactionTypeSubFilter() {
            return this.transactionTypeSubFilter;
        }

        public final Set<HistoryTransactionType> getSupportedHistoryTransactionTypes() {
            return CollectionsKt.intersect(CollectionsKt.intersect(this.accountTypeFilter.getSupportedHistoryTransactionTypes(), this.transactionTypeFilter.supportedHistoryTransactionTypes()), this.transactionTypeSubFilter.supportedHistoryTransactionTypes());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean matchInitialFilters(HistoryFetchParams historyFetchParams) {
        AccountsHistoryAccountTypeFilter accountTypeFilter = historyFetchParams.getAccountTypeFilter();
        Companion companion = INSTANCE;
        return accountTypeFilter == ((AccountsHistoryContract.Key) companion.getArgs((HasSavedState) this)).getAccountTypeFilter() && historyFetchParams.getTransactionTypeFilter() == ((AccountsHistoryContract.Key) companion.getArgs((HasSavedState) this)).getTransactionTypeFilter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryStaticFilter.InstrumentFilter toStaticInstrumentFilter(AccountsHistoryContract.InstrumentFilter instrumentFilter) {
        HistoryStaticFilter.InstrumentFilterType instrumentFilterType;
        UUID id = instrumentFilter.getId();
        int i = WhenMappings.$EnumSwitchMapping$0[instrumentFilter.getType().ordinal()];
        if (i == 1) {
            instrumentFilterType = HistoryStaticFilter.InstrumentFilterType.CRYPTO;
        } else if (i == 2) {
            instrumentFilterType = HistoryStaticFilter.InstrumentFilterType.EQUITY;
        } else if (i == 3) {
            instrumentFilterType = HistoryStaticFilter.InstrumentFilterType.FUTURES;
        } else if (i == 4) {
            instrumentFilterType = HistoryStaticFilter.InstrumentFilterType.EVENT;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            instrumentFilterType = HistoryStaticFilter.InstrumentFilterType.PERPETUALS;
        }
        return new HistoryStaticFilter.InstrumentFilter(id, instrumentFilterType);
    }

    /* compiled from: AccountsHistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "<init>", "()V", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountsHistoryDuxo, AccountsHistoryContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountsHistoryContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AccountsHistoryContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountsHistoryContract.Key getArgs(AccountsHistoryDuxo accountsHistoryDuxo) {
            return (AccountsHistoryContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, accountsHistoryDuxo);
        }
    }
}
