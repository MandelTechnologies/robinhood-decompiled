package com.robinhood.android.gold.subscription.store;

import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.subscription.api.GoldSubscribeRequest;
import com.robinhood.android.gold.subscription.api.GoldSubscribeResponse;
import com.robinhood.android.gold.subscription.api.GoldSubscriptionApi;
import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanRequest;
import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanResponse;
import com.robinhood.android.gold.subscription.api.GoldUnsubscribeRequest;
import com.robinhood.android.gold.subscription.api.GoldUnsubscribeResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.margin.MarginSettingsStore;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.regiongate.GoldRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.subscription.api.MarginUpgradePlans2;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSubscriptionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001,BI\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020 H\u0086@¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020#H\u0086@¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020#J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'J\u001a\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010+0*0'R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/gold/subscription/api/GoldSubscriptionApi;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;", "unifiedAccountStore", "Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/gold/subscription/api/GoldSubscriptionApi;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;Lcom/robinhood/android/lib/store/margin/MarginSettingsStore;Lcom/robinhood/librobinhood/data/store/phoenix/UnifiedAccountStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/store/StoreBundle;)V", "subscribe", "Lcom/robinhood/android/gold/subscription/api/GoldSubscribeResponse;", "request", "Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;", "(Lcom/robinhood/android/gold/subscription/api/GoldSubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "Lcom/robinhood/android/gold/subscription/api/GoldUnsubscribeResponse;", "subscriptionId", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchSubscriptionPlan", "Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanResponse;", "Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanRequest;", "(Lcom/robinhood/android/gold/subscription/api/GoldSwitchSubscriptionPlanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downgrade", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStores", "streamGoldSubscriptionState", "Lio/reactivex/Observable;", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "streamGoldSubscriptionInfo", "Lkotlin/Pair;", "", "GoldSubscriptionState", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GoldSubscriptionStore extends Store {
    private final AccountProvider accountProvider;
    private final GoldSubscriptionApi api;
    private final MarginSettingsStore marginSettingsStore;
    private final MarginSubscriptionStore marginSubscriptionStore;
    private final TraderPortfolioStore portfolioStore;
    private final RegionGateProvider regionGateProvider;
    private final UnifiedAccountStore unifiedAccountStore;

    /* compiled from: GoldSubscriptionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.subscription.store.GoldSubscriptionStore", m3645f = "GoldSubscriptionStore.kt", m3646l = {63}, m3647m = "downgrade")
    /* renamed from: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$downgrade$1 */
    /* loaded from: classes10.dex */
    static final class C179281 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C179281(Continuation<? super C179281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldSubscriptionStore.this.downgrade(this);
        }
    }

    /* compiled from: GoldSubscriptionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.subscription.store.GoldSubscriptionStore", m3645f = "GoldSubscriptionStore.kt", m3646l = {38}, m3647m = "subscribe")
    /* renamed from: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$subscribe$1 */
    /* loaded from: classes10.dex */
    static final class C179311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C179311(Continuation<? super C179311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldSubscriptionStore.this.subscribe(null, this);
        }
    }

    /* compiled from: GoldSubscriptionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.subscription.store.GoldSubscriptionStore", m3645f = "GoldSubscriptionStore.kt", m3646l = {52}, m3647m = "switchSubscriptionPlan")
    /* renamed from: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$switchSubscriptionPlan$1 */
    /* loaded from: classes10.dex */
    static final class C179321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C179321(Continuation<? super C179321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldSubscriptionStore.this.switchSubscriptionPlan(null, this);
        }
    }

    /* compiled from: GoldSubscriptionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.subscription.store.GoldSubscriptionStore", m3645f = "GoldSubscriptionStore.kt", m3646l = {45}, m3647m = "unsubscribe")
    /* renamed from: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$unsubscribe$1 */
    /* loaded from: classes10.dex */
    static final class C179331 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C179331(Continuation<? super C179331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoldSubscriptionStore.this.unsubscribe(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSubscriptionStore(GoldSubscriptionApi api, AccountProvider accountProvider, TraderPortfolioStore portfolioStore, MarginSubscriptionStore marginSubscriptionStore, MarginSettingsStore marginSettingsStore, UnifiedAccountStore unifiedAccountStore, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "marginSubscriptionStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(unifiedAccountStore, "unifiedAccountStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
        this.marginSubscriptionStore = marginSubscriptionStore;
        this.marginSettingsStore = marginSettingsStore;
        this.unifiedAccountStore = unifiedAccountStore;
        this.regionGateProvider = regionGateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object subscribe(GoldSubscribeRequest goldSubscribeRequest, Continuation<? super GoldSubscribeResponse> continuation) {
        C179311 c179311;
        if (continuation instanceof C179311) {
            c179311 = (C179311) continuation;
            int i = c179311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c179311.label = i - Integer.MIN_VALUE;
            } else {
                c179311 = new C179311(continuation);
            }
        }
        Object objSubscribe = c179311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c179311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSubscribe);
            GoldSubscriptionApi goldSubscriptionApi = this.api;
            c179311.label = 1;
            objSubscribe = goldSubscriptionApi.subscribe(goldSubscribeRequest, c179311);
            if (objSubscribe == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSubscribe);
        }
        this.accountProvider.refresh(true);
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
        return objSubscribe;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unsubscribe(UUID uuid, Continuation<? super GoldUnsubscribeResponse> continuation) {
        C179331 c179331;
        if (continuation instanceof C179331) {
            c179331 = (C179331) continuation;
            int i = c179331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c179331.label = i - Integer.MIN_VALUE;
            } else {
                c179331 = new C179331(continuation);
            }
        }
        Object objUnsubscribe = c179331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c179331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUnsubscribe);
            GoldSubscriptionApi goldSubscriptionApi = this.api;
            GoldUnsubscribeRequest goldUnsubscribeRequest = new GoldUnsubscribeRequest(uuid);
            c179331.label = 1;
            objUnsubscribe = goldSubscriptionApi.unsubscribe(goldUnsubscribeRequest, c179331);
            if (objUnsubscribe == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUnsubscribe);
        }
        this.accountProvider.refresh(true);
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
        return objUnsubscribe;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object switchSubscriptionPlan(GoldSwitchSubscriptionPlanRequest goldSwitchSubscriptionPlanRequest, Continuation<? super GoldSwitchSubscriptionPlanResponse> continuation) {
        C179321 c179321;
        if (continuation instanceof C179321) {
            c179321 = (C179321) continuation;
            int i = c179321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c179321.label = i - Integer.MIN_VALUE;
            } else {
                c179321 = new C179321(continuation);
            }
        }
        Object objSwitchSubscriptionPlan = c179321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c179321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSwitchSubscriptionPlan);
            GoldSubscriptionApi goldSubscriptionApi = this.api;
            c179321.label = 1;
            objSwitchSubscriptionPlan = goldSubscriptionApi.switchSubscriptionPlan(goldSwitchSubscriptionPlanRequest, c179321);
            if (objSwitchSubscriptionPlan == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSwitchSubscriptionPlan);
        }
        this.accountProvider.refresh(true);
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
        return objSwitchSubscriptionPlan;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downgrade(Continuation<? super Unit> continuation) {
        C179281 c179281;
        if (continuation instanceof C179281) {
            c179281 = (C179281) continuation;
            int i = c179281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c179281.label = i - Integer.MIN_VALUE;
            } else {
                c179281 = new C179281(continuation);
            }
        }
        Object obj = c179281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c179281.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            GoldSubscriptionApi goldSubscriptionApi = this.api;
            c179281.label = 1;
            if (goldSubscriptionApi.downgrade(c179281) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        refreshStores();
        return Unit.INSTANCE;
    }

    public final void refreshStores() {
        this.accountProvider.refresh(true);
        this.portfolioStore.refreshIndividualAccountPortfolio(true);
        this.marginSubscriptionStore.refreshCurrentMarginSubscription(true);
    }

    public final Observable<GoldSubscriptionState> streamGoldSubscriptionState() {
        Observable observableSwitchMap = streamGoldSubscriptionInfo().switchMap(new Function() { // from class: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore.streamGoldSubscriptionState.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends GoldSubscriptionState> apply(Tuples2<? extends GoldSubscriptionState, Boolean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.just(it.getFirst());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Tuples2<GoldSubscriptionState, Boolean>> streamGoldSubscriptionInfo() {
        Observable<Tuples2<GoldSubscriptionState, Boolean>> observableSwitchMap = RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GoldRegionGate.INSTANCE, false, 2, null).switchMap(new Function() { // from class: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore.streamGoldSubscriptionInfo.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<GoldSubscriptionState, Boolean>> apply(Boolean allowed) {
                Intrinsics.checkNotNullParameter(allowed, "allowed");
                if (!allowed.booleanValue()) {
                    Observable observableJust = Observable.just(new Tuples2(GoldSubscriptionState.INELIGIBLE_FOR_GOLD, null));
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
                Observables observables = Observables.INSTANCE;
                Observable<List<MarginUpgradePlans2>> observableOnErrorReturn = GoldSubscriptionStore.this.marginSettingsStore.getMarginSubscriptionPlans().toObservable().onErrorReturn(new Function() { // from class: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore.streamGoldSubscriptionInfo.1.1
                    @Override // io.reactivex.functions.Function
                    public final List<MarginUpgradePlans2> apply(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return CollectionsKt.emptyList();
                    }
                });
                Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
                Observable<T> observable = MarginSubscriptionStore.checkCurrentMarginSubscription$default(GoldSubscriptionStore.this.marginSubscriptionStore, false, 1, null).toObservable();
                Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
                Observable observableCombineLatest = Observable.combineLatest(observableOnErrorReturn, observable, GoldSubscriptionStore.this.unifiedAccountStore.streamIndividualAccountOptional(), GoldSubscriptionStore.this.accountProvider.streamIndividualAccountOptional(), new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.gold.subscription.store.GoldSubscriptionStore$streamGoldSubscriptionInfo$1$apply$$inlined$combineLatest$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function4
                    public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                        GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState;
                        MarginSubscription3 plan;
                        Account.Balances balances;
                        Intrinsics.checkParameterIsNotNull(t1, "t1");
                        Intrinsics.checkParameterIsNotNull(t2, "t2");
                        Intrinsics.checkParameterIsNotNull(t3, "t3");
                        Intrinsics.checkParameterIsNotNull(t4, "t4");
                        Optional optional = (Optional) t2;
                        UnifiedAccountV2 unifiedAccountV2 = (UnifiedAccountV2) ((Optional) t3).component1();
                        Account account = (Account) ((Optional) t4).component1();
                        MarginUpgradePlans2 marginUpgradePlans2 = (MarginUpgradePlans2) CollectionsKt.singleOrNull((List) t1);
                        if (unifiedAccountV2 == null) {
                            goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.NO_BROKERAGE_ACCOUNT;
                        } else if (account != null && (balances = account.getBalances()) != null && balances.isPatternDayTrader()) {
                            goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.PATTERN_DAY_TRADER;
                        } else {
                            MarginSubscription marginSubscription = (MarginSubscription) optional.getOrNull();
                            if (marginSubscription != null && (plan = marginSubscription.getPlan()) != null && plan.is24Karat()) {
                                goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.ALREADY_GOLD;
                            } else if (unifiedAccountV2.getAccountBuyingPower().isNegative()) {
                                goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.ACCOUNT_DEFICIT;
                            } else if (marginUpgradePlans2 != null && marginUpgradePlans2.is24KaratGold()) {
                                goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.ELIGIBLE_FOR_GOLD;
                            } else {
                                goldSubscriptionState = GoldSubscriptionStore.GoldSubscriptionState.INELIGIBLE_FOR_GOLD;
                            }
                        }
                        MarginSubscription marginSubscription2 = (MarginSubscription) optional.getOrNull();
                        return (R) new Tuples2(goldSubscriptionState, Boolean.valueOf(marginSubscription2 != null ? marginSubscription2.isGoldDefaultOptIn() : false));
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
                return observableCombineLatest;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoldSubscriptionStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore$GoldSubscriptionState;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_GOLD", "ELIGIBLE_FOR_GOLD", "INELIGIBLE_FOR_GOLD", "NO_BROKERAGE_ACCOUNT", "ACCOUNT_DEFICIT", "PATTERN_DAY_TRADER", "lib-gold-subscription_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class GoldSubscriptionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GoldSubscriptionState[] $VALUES;
        public static final GoldSubscriptionState ALREADY_GOLD = new GoldSubscriptionState("ALREADY_GOLD", 0);
        public static final GoldSubscriptionState ELIGIBLE_FOR_GOLD = new GoldSubscriptionState("ELIGIBLE_FOR_GOLD", 1);
        public static final GoldSubscriptionState INELIGIBLE_FOR_GOLD = new GoldSubscriptionState("INELIGIBLE_FOR_GOLD", 2);
        public static final GoldSubscriptionState NO_BROKERAGE_ACCOUNT = new GoldSubscriptionState("NO_BROKERAGE_ACCOUNT", 3);
        public static final GoldSubscriptionState ACCOUNT_DEFICIT = new GoldSubscriptionState("ACCOUNT_DEFICIT", 4);
        public static final GoldSubscriptionState PATTERN_DAY_TRADER = new GoldSubscriptionState("PATTERN_DAY_TRADER", 5);

        private static final /* synthetic */ GoldSubscriptionState[] $values() {
            return new GoldSubscriptionState[]{ALREADY_GOLD, ELIGIBLE_FOR_GOLD, INELIGIBLE_FOR_GOLD, NO_BROKERAGE_ACCOUNT, ACCOUNT_DEFICIT, PATTERN_DAY_TRADER};
        }

        public static EnumEntries<GoldSubscriptionState> getEntries() {
            return $ENTRIES;
        }

        private GoldSubscriptionState(String str, int i) {
        }

        static {
            GoldSubscriptionState[] goldSubscriptionStateArr$values = $values();
            $VALUES = goldSubscriptionStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(goldSubscriptionStateArr$values);
        }

        public static GoldSubscriptionState valueOf(String str) {
            return (GoldSubscriptionState) Enum.valueOf(GoldSubscriptionState.class, str);
        }

        public static GoldSubscriptionState[] values() {
            return (GoldSubscriptionState[]) $VALUES.clone();
        }
    }
}
