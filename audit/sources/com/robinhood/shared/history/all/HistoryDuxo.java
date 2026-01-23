package com.robinhood.shared.history.all;

import androidx.lifecycle.SavedStateHandle;
import androidx.paging.PagedList;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.common.history.p082ui.HistoryFilter2;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.all.HistoryDuxo;
import com.robinhood.shared.history.all.NewHistoryFragment;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.extensions.Relays;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: HistoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/history/all/HistoryDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/history/all/HistoryViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/store/history/HistoryStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/user/UserStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "filterRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "kotlin.jvm.PlatformType", "<set-?>", "filter", "getFilter$delegate", "(Lcom/robinhood/shared/history/all/HistoryDuxo;)Ljava/lang/Object;", "getFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "setFilter", "(Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "onCreate", "", "Companion", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HistoryDuxo extends OldBaseDuxo<HistoryViewState> implements HasSavedState {
    private final AppType appType;
    private final BehaviorRelay<HistoryFilter> filterRelay;
    private final HistoryStore historyStore;
    private final RegionGateProvider regionGateProvider;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HistoryDuxo.class, "filter", "getFilter()Lcom/robinhood/android/common/history/ui/HistoryFilter;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HistoryDuxo(SavedStateHandle savedStateHandle, HistoryStore historyStore, RhyAccountStore rhyAccountStore, AppType appType, RegionGateProvider regionGateProvider, UserStore userStore) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Companion companion = INSTANCE;
        Set set = null;
        Integer num = null;
        PagedList pagedList = null;
        PagedList pagedList2 = null;
        PagedList pagedList3 = null;
        super(new HistoryViewState(set, ((NewHistoryFragment.Args) companion.getArgs(savedStateHandle)).getPreselectedHistoryFilter(), num, pagedList, pagedList2, pagedList3, ((NewHistoryFragment.Args) companion.getArgs(savedStateHandle)).getTransactionReference(), ((NewHistoryFragment.Args) companion.getArgs(savedStateHandle)).getFromDeepLink(), null, false, false, false, false, null, 16189, null), null, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
        this.historyStore = historyStore;
        this.rhyAccountStore = rhyAccountStore;
        this.appType = appType;
        this.regionGateProvider = regionGateProvider;
        this.userStore = userStore;
        BehaviorRelay<HistoryFilter> behaviorRelayCreateDefault = BehaviorRelay.createDefault(((NewHistoryFragment.Args) companion.getArgs(getSavedStateHandle())).getPreselectedHistoryFilter());
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.filterRelay = behaviorRelayCreateDefault;
    }

    public final HistoryFilter getFilter() {
        Object value = Relays.getValue(this.filterRelay, this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (HistoryFilter) value;
    }

    public final void setFilter(HistoryFilter historyFilter) {
        Intrinsics.checkNotNullParameter(historyFilter, "<set-?>");
        Relays.setValue(this.filterRelay, this, $$delegatedProperties[0], historyFilter);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<HistoryFilter> observableRefCount = this.filterRelay.distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        HistoryStore historyStore = this.historyStore;
        Companion companion = INSTANCE;
        final Map<HistoryFilter, Observable<Integer>> mapStreamCountsByFilter = HistoryFilter2.streamCountsByFilter(historyStore, ((NewHistoryFragment.Args) companion.getArgs((HasSavedState) this)).getFiltersToCount(), ((NewHistoryFragment.Args) companion.getArgs((HasSavedState) this)).getStaticFilter());
        LifecycleHost.DefaultImpls.bind$default(this, HistoryFilter2.toSelectableFilters(mapStreamCountsByFilter, this.appType, ((NewHistoryFragment.Args) companion.getArgs((HasSavedState) this)).getShowPersistentFiltersWithNoItems()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$1(this.f$0, (Set) obj);
            }
        });
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.shared.history.all.HistoryDuxo$onCreate$$inlined$switchMap$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((HistoryDuxo$onCreate$$inlined$switchMap$1<T, R>) obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends R> apply(final T t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return ((Observable) MapsKt.getValue(mapStreamCountsByFilter, (HistoryFilter) t)).map(new Function() { // from class: com.robinhood.shared.history.all.HistoryDuxo$onCreate$$inlined$switchMap$1.1
                    @Override // io.reactivex.functions.Function
                    public final R apply(Integer u) {
                        Intrinsics.checkNotNullParameter(u, "u");
                        Object obj = t;
                        Intrinsics.checkNotNull(obj);
                        return (R) Optional3.asOptional(u.intValue() == 0 ? ((HistoryFilter) obj).getEmptyStateTextResId() : null);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        Observable observableDistinctUntilChanged = observableSwitchMap.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Set<HistoryTransactionType> transactionTypes = ((NewHistoryFragment.Args) companion.getArgs((HasSavedState) this)).getTransactionTypes();
        if (transactionTypes == null) {
            Set<HistoryFilter> historyFilters = ((NewHistoryFragment.Args) companion.getArgs((HasSavedState) this)).getHistoryFilters();
            LinkedHashSet linkedHashSet = historyFilters instanceof Collection ? new LinkedHashSet(historyFilters.size()) : new LinkedHashSet();
            Iterator<T> it = historyFilters.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(((HistoryFilter) it.next()).getTransactionTypes());
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
            Iterator it2 = setUnmodifiableSet.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = SetsKt.plus((Set) next, (Iterable) it2.next());
            }
            transactionTypes = (Set) next;
        }
        final Observable observableJust = Observable.just(transactionTypes);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        Observable<R> observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.shared.history.all.HistoryDuxo$onCreate$typesFilter$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Set<HistoryTransactionType>> apply(HistoryFilter historyFilter) {
                Set<HistoryTransactionType> transactionTypes2;
                Intrinsics.checkNotNullParameter(historyFilter, "historyFilter");
                HistoryDuxo.Companion companion2 = HistoryDuxo.INSTANCE;
                if (historyFilter == ((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this.this$0)).getPreselectedHistoryFilter()) {
                    return observableJust;
                }
                if (((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this.this$0)).getTransactionTypes() != null) {
                    Set<HistoryTransactionType> transactionTypes3 = historyFilter.getTransactionTypes();
                    Set<HistoryTransactionType> transactionTypes4 = ((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this.this$0)).getTransactionTypes();
                    Intrinsics.checkNotNull(transactionTypes4);
                    transactionTypes2 = CollectionsKt.intersect(transactionTypes3, transactionTypes4);
                } else {
                    transactionTypes2 = historyFilter.getTransactionTypes();
                }
                Observable observableJust2 = Observable.just(transactionTypes2);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        HistoryStore historyStore2 = this.historyStore;
        Observable observableJust2 = Observable.just(Optional3.asOptional(HistoryEvent.State.PENDING));
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        Intrinsics.checkNotNull(observableSwitchMap2);
        Instant instant = Instant.EPOCH;
        Observable observableJust3 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
        Companion companion2 = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore2, observableJust2, observableSwitchMap2, observableJust3, null, ((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this)).getStaticFilter(), 0, 40, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$8(this.f$0, (PagedList) obj);
            }
        });
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNull(instantNow);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        Instant instant2 = Instants.toLocalDate(instantNow, zoneIdSystemDefault).minusDays(30L).atStartOfDay(ZoneId.systemDefault()).toInstant();
        HistoryStore historyStore3 = this.historyStore;
        HistoryEvent.State state = HistoryEvent.State.SETTLED;
        Observable observableJust4 = Observable.just(Optional3.asOptional(state));
        Intrinsics.checkNotNullExpressionValue(observableJust4, "just(...)");
        Observable observableJust5 = Observable.just(instant2);
        Intrinsics.checkNotNullExpressionValue(observableJust5, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore3, observableJust4, observableSwitchMap2, observableJust5, null, ((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this)).getStaticFilter(), 0, 40, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$10(this.f$0, (PagedList) obj);
            }
        });
        HistoryStore historyStore4 = this.historyStore;
        Observable observableJust6 = Observable.just(Optional3.asOptional(state));
        Intrinsics.checkNotNullExpressionValue(observableJust6, "just(...)");
        Observable observableJust7 = Observable.just(instant);
        Intrinsics.checkNotNullExpressionValue(observableJust7, "just(...)");
        Observable observableJust8 = Observable.just(Optional3.asOptional(instant2));
        Intrinsics.checkNotNullExpressionValue(observableJust8, "just(...)");
        LifecycleHost.DefaultImpls.bind$default(this, HistoryStore.stream$default(historyStore4, observableJust6, observableSwitchMap2, observableJust7, observableJust8, ((NewHistoryFragment.Args) companion2.getArgs((HasSavedState) this)).getStaticFilter(), 0, 32, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$12(this.f$0, (PagedList) obj);
            }
        });
        Observable observableStartWith = this.rhyAccountStore.streamSpendingAccount().map(new Function() { // from class: com.robinhood.shared.history.all.HistoryDuxo.onCreate.8
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<RhyAccount> it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(it3.getOrNull() != null);
            }
        }).startWith((Observable<R>) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableStartWith, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$14(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, CryptoRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$16(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, FuturesTradingRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EventContractsRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$20(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable observableDistinctUntilChanged2 = this.userStore.getUser().map(new Function() { // from class: com.robinhood.shared.history.all.HistoryDuxo.onCreate.13
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.getOrigin().getLocality();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$22(this.f$0, (CountryCode.Supported) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(HistoryDuxo historyDuxo, final Set selectableFilters) {
        Intrinsics.checkNotNullParameter(selectableFilters, "selectableFilters");
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$1$lambda$0(selectableFilters, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$1$lambda$0(Set set, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : set, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(HistoryDuxo historyDuxo, Optional optional) {
        final Integer num = (Integer) optional.component1();
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$4$lambda$3(num, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$4$lambda$3(Integer num, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : num, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(HistoryDuxo historyDuxo, final PagedList pendingItems) {
        Intrinsics.checkNotNullParameter(pendingItems, "pendingItems");
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$8$lambda$7(pendingItems, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$8$lambda$7(PagedList pagedList, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : pagedList, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(HistoryDuxo historyDuxo, final PagedList recentItems) {
        Intrinsics.checkNotNullParameter(recentItems, "recentItems");
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$10$lambda$9(recentItems, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$10$lambda$9(PagedList pagedList, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : pagedList, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(HistoryDuxo historyDuxo, final PagedList olderItems) {
        Intrinsics.checkNotNullParameter(olderItems, "olderItems");
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$12$lambda$11(olderItems, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$12$lambda$11(PagedList pagedList, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : pagedList, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$14(HistoryDuxo historyDuxo, final Boolean bool) {
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$14$lambda$13(bool, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$14$lambda$13(Boolean bool, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : bool.booleanValue(), (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$16(HistoryDuxo historyDuxo, final boolean z) {
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$16$lambda$15(z, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$16$lambda$15(boolean z, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : z, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$18(HistoryDuxo historyDuxo, final boolean z) {
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$18$lambda$17(z, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$18$lambda$17(boolean z, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : z, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$20(HistoryDuxo historyDuxo, final boolean z) {
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$20$lambda$19(z, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$20$lambda$19(boolean z, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : z, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$22(HistoryDuxo historyDuxo, final CountryCode.Supported supported) {
        historyDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.history.all.HistoryDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryDuxo.onCreate$lambda$22$lambda$21(supported, (HistoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HistoryViewState onCreate$lambda$22$lambda$21(CountryCode.Supported supported, HistoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy((16382 & 1) != 0 ? applyMutation.selectableFilters : null, (16382 & 2) != 0 ? applyMutation.selectedFilter : null, (16382 & 4) != 0 ? applyMutation.emptyStateTextResId : null, (16382 & 8) != 0 ? applyMutation.pendingItems : null, (16382 & 16) != 0 ? applyMutation.recentItems : null, (16382 & 32) != 0 ? applyMutation.olderItems : null, (16382 & 64) != 0 ? applyMutation.transactionReference : null, (16382 & 128) != 0 ? applyMutation.fromDeepLink : false, (16382 & 256) != 0 ? applyMutation.shouldShowTransactionDetail : null, (16382 & 512) != 0 ? applyMutation.inCryptoRegionGate : false, (16382 & 1024) != 0 ? applyMutation.inFuturesRegionGate : false, (16382 & 2048) != 0 ? applyMutation.inEcRegionGate : false, (16382 & 4096) != 0 ? applyMutation.hasSpendingAccount : false, (16382 & 8192) != 0 ? applyMutation.userLocality : supported);
    }

    /* compiled from: HistoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/history/all/HistoryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/history/all/HistoryDuxo;", "Lcom/robinhood/shared/history/all/NewHistoryFragment$Args;", "<init>", "()V", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<HistoryDuxo, NewHistoryFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewHistoryFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (NewHistoryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public NewHistoryFragment.Args getArgs(HistoryDuxo historyDuxo) {
            return (NewHistoryFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, historyDuxo);
        }
    }
}
