package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.models.retirement.p194db.RetirementInvestmentAndTrade;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.portfolio.privacy.PortfolioPrivacyPref;
import com.robinhood.android.retirement.p239ui.RetirementDashboardEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.InboxBadgeStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementInvestmentAndTradeStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementNuxStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.InboxBadge;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.store.AsyncResult;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetirementDashboardDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*Bk\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$J\u0006\u0010%\u001a\u00020 J\u000e\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020$J\u0006\u0010(\u001a\u00020 J\u0006\u0010)\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;", "Lcom/robinhood/android/retirement/ui/RetirementDashboardEvent;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "matchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;", "retirementInvestmentAndTradeStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "retirementNuxStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;", "inboxBadgeStore", "Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementInvestmentAndTradeStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementNuxStore;Lcom/robinhood/librobinhood/data/store/InboxBadgeStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "initialize", "", "isEmbedded", "", "defaultAccountNumber", "", "refreshAccountSwitcher", "onRetirementAccountSelected", "accountNumber", "onRetirementOptionsAssetHomeTooltipSeen", "onRetirementOptionsAssetHomeOrTooltipClicked", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementDashboardDuxo extends BaseDuxo3<RetirementDashboardDataState, RetirementDashboardViewState, RetirementDashboardEvent> {
    public static final String TOOLTIP_IDENTIFIER = "asset-home-tooltip";
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AggregateOptionPositionStore aggregateOptionPositionStore;
    private final EventLogger eventLogger;
    private final InboxBadgeStore inboxBadgeStore;
    private final RetirementMatchStore matchStore;
    private final PerformanceChartStore performanceChartStore;
    private final BooleanPreference portfolioPrivacyPref;
    private final RetirementAccountSwitcherStore retirementAccountSwitcherStore;
    private final RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore;
    private final RetirementNuxStore retirementNuxStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Screen ANALYTICS_SCREEN = new Screen(Screen.Name.RETIREMENT_DASHBOARD, null, null, null, 14, null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementDashboardDuxo(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, RetirementMatchStore matchStore, RetirementAccountSwitcherStore retirementAccountSwitcherStore, RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore, PerformanceChartStore performanceChartStore, RetirementNuxStore retirementNuxStore, InboxBadgeStore inboxBadgeStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, @PortfolioPrivacyPref BooleanPreference portfolioPrivacyPref, DuxoBundle duxoBundle) {
        super(new RetirementDashboardDataState(null, null, null, null, null, false, null, false, false, null, false, false, false, 8191, null), RetirementDashboardDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(matchStore, "matchStore");
        Intrinsics.checkNotNullParameter(retirementAccountSwitcherStore, "retirementAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(retirementInvestmentAndTradeStore, "retirementInvestmentAndTradeStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(retirementNuxStore, "retirementNuxStore");
        Intrinsics.checkNotNullParameter(inboxBadgeStore, "inboxBadgeStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.matchStore = matchStore;
        this.retirementAccountSwitcherStore = retirementAccountSwitcherStore;
        this.retirementInvestmentAndTradeStore = retirementInvestmentAndTradeStore;
        this.performanceChartStore = performanceChartStore;
        this.retirementNuxStore = retirementNuxStore;
        this.inboxBadgeStore = inboxBadgeStore;
        this.eventLogger = eventLogger;
        this.accountAccessStore = accountAccessStore;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
    }

    public static /* synthetic */ void initialize$default(RetirementDashboardDuxo retirementDashboardDuxo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        retirementDashboardDuxo.initialize(z, str);
    }

    public final void initialize(final boolean isEmbedded, String defaultAccountNumber) {
        Observable observableDistinctUntilChanged;
        if (isEmbedded && defaultAccountNumber != null) {
            observableDistinctUntilChanged = Observable.just(defaultAccountNumber);
        } else {
            observableDistinctUntilChanged = ObservablesKt.filterIsPresent(this.retirementAccountSwitcherStore.streamActiveRetirementAccountNumber()).distinctUntilChanged();
        }
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$0(this.f$0, isEmbedded, (String) obj);
            }
        });
        Observable observableSwitchMap = observableDistinctUntilChanged.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$accountStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.this$0.accountProvider.streamAccount(it);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Account, Boolean>> apply(final Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                RetirementDashboardDuxo retirementDashboardDuxo = RetirementDashboardDuxo.this;
                return retirementDashboardDuxo.asObservable(retirementDashboardDuxo.accountAccessStore.getFeatureAccess(account, AccountFeature.OPTIONS_HAS_ACCESS)).map(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<Account, Boolean> apply(Boolean hasAccess) {
                        Intrinsics.checkNotNullParameter(hasAccess, "hasAccess");
                        return Tuples4.m3642to(account, hasAccess);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.retirementAccountSwitcherStore.streamAllRetirementAccounts(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$2(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.retirementAccountSwitcherStore.getRetirementAccountSwitcherQuery()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$3(this.f$0, (RetirementAccountSwitcher) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableSwitchMap2 = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RetirementInvestmentAndTrade> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                return RetirementDashboardDuxo.this.retirementInvestmentAndTradeStore.getStreamInvestmentAndTrade().asObservable(new RetirementInvestmentAndTradeStore.Request(accountNumber, RetirementDashboardDuxo.this.portfolioPrivacyPref.get()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        final RetirementNuxStore retirementNuxStore = this.retirementNuxStore;
        Observable observableSwitchMap3 = observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.7
            @Override // io.reactivex.functions.Function
            public final Observable<RetirementUninvestedViewModel> apply(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return retirementNuxStore.getUninvestedViewModel(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableSwitchMap2, observableSwitchMap3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$4(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableDistinctUntilChanged, this.portfolioPrivacyPref.getChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$5(this.f$0, (Tuples2) obj);
            }
        });
        InboxBadge latestBadgeResult = this.inboxBadgeStore.getLatestBadgeResult();
        if (latestBadgeResult != null) {
            applyMutation(new RetirementDashboardDuxo$initialize$10$1(latestBadgeResult, null));
        }
        LifecycleHost.DefaultImpls.bind$default(this, QueryKt.asObservable(this.matchStore.getQueryNoPolling()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$7(this.f$0, (RetirementMatchRate) obj);
            }
        });
        Observable observableSwitchMap4 = observableDistinctUntilChanged.doOnNext(new Consumer() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.12

            /* compiled from: RetirementDashboardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$12$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
                    return ((AnonymousClass1) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return RetirementDashboardDataState.copy$default((RetirementDashboardDataState) this.L$0, null, null, null, null, null, false, null, false, false, null, false, false, false, 8190, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(String str) {
                RetirementDashboardDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo.initialize.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Money, Direction>> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                RetirementDashboardDuxo retirementDashboardDuxo = RetirementDashboardDuxo.this;
                return retirementDashboardDuxo.asObservable(PerformanceChartStore.streamAccountMarketValuesAndDirection$default(retirementDashboardDuxo.performanceChartStore, accountNumber, PerformanceChartType.HISTORICAL_PORTFOLIO, null, 4, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.initialize$lambda$8(this.f$0, (Tuples2) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C2721115(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$0(RetirementDashboardDuxo retirementDashboardDuxo, boolean z, String str) {
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$1$1(str, z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$1(RetirementDashboardDuxo retirementDashboardDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        Account account = (Account) objComponent1;
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        if (((Boolean) objComponent2).booleanValue()) {
            AggregateOptionPositionStore.refresh$default(retirementDashboardDuxo.aggregateOptionPositionStore, true, null, account.getAccountNumber(), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$2(RetirementDashboardDuxo retirementDashboardDuxo, List retirementAccounts) {
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$4$1(retirementAccounts, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$3(RetirementDashboardDuxo retirementDashboardDuxo, RetirementAccountSwitcher switcher) {
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$5$1(switcher, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$4(RetirementDashboardDuxo retirementDashboardDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$8$1((RetirementInvestmentAndTrade) tuples2.component1(), (RetirementUninvestedViewModel) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$5(RetirementDashboardDuxo retirementDashboardDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        RetirementInvestmentAndTradeStore retirementInvestmentAndTradeStore = retirementDashboardDuxo.retirementInvestmentAndTradeStore;
        Intrinsics.checkNotNull(str);
        retirementInvestmentAndTradeStore.refreshInvestmentAndTrade(new RetirementInvestmentAndTradeStore.Request(str, zBooleanValue));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$7(RetirementDashboardDuxo retirementDashboardDuxo, RetirementMatchRate retirementMatchRate) {
        Intrinsics.checkNotNullParameter(retirementMatchRate, "retirementMatchRate");
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$11$1(retirementMatchRate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$8(RetirementDashboardDuxo retirementDashboardDuxo, Tuples2 tuples2) {
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$initialize$14$1((Money) tuples2.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$15", m3645f = "RetirementDashboardDuxo.kt", m3646l = {201}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$15 */
    static final class C2721115 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2721115(Continuation<? super C2721115> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementDashboardDuxo.this.new C2721115(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2721115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowShouldShowOptionsAssetHomeTooltip = RetirementDashboardDuxo.this.retirementNuxStore.shouldShowOptionsAssetHomeTooltip();
                this.label = 1;
                obj = FlowKt.first(flowShouldShowOptionsAssetHomeTooltip, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RetirementDashboardDuxo.this.applyMutation(new AnonymousClass1(((Boolean) obj).booleanValue(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: RetirementDashboardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$15$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$initialize$15$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
            final /* synthetic */ boolean $shouldShowRetirementOptionsAssetHomeTooltip;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$shouldShowRetirementOptionsAssetHomeTooltip = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$shouldShowRetirementOptionsAssetHomeTooltip, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
                return ((AnonymousClass1) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RetirementDashboardDataState.copy$default((RetirementDashboardDataState) this.L$0, null, null, null, null, null, false, null, false, false, null, this.$shouldShowRetirementOptionsAssetHomeTooltip, false, false, 7167, null);
            }
        }
    }

    public final void refreshAccountSwitcher() {
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.retirementAccountSwitcherStore.refreshAccountSwitcher()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementDashboardDuxo.refreshAccountSwitcher$lambda$9(this.f$0, (AsyncResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAccountSwitcher$lambda$9(RetirementDashboardDuxo retirementDashboardDuxo, AsyncResult switcherState) {
        Intrinsics.checkNotNullParameter(switcherState, "switcherState");
        retirementDashboardDuxo.applyMutation(new RetirementDashboardDuxo$refreshAccountSwitcher$1$1(switcherState, null));
        RetirementDashboardEvent retirementDashboardEventFrom = RetirementDashboardEvent.INSTANCE.from(switcherState);
        if (retirementDashboardEventFrom != null) {
            retirementDashboardDuxo.submit(retirementDashboardEventFrom);
        }
        return Unit.INSTANCE;
    }

    public final void onRetirementAccountSelected(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.retirementAccountSwitcherStore.setActiveRetirementAccountNumber(accountNumber);
    }

    /* compiled from: RetirementDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$onRetirementOptionsAssetHomeTooltipSeen$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$onRetirementOptionsAssetHomeTooltipSeen$1 */
    static final class C272161 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272161(Continuation<? super C272161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272161 c272161 = RetirementDashboardDuxo.this.new C272161(continuation);
            c272161.L$0 = obj;
            return c272161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
            return ((C272161) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RetirementDashboardDataState retirementDashboardDataState = (RetirementDashboardDataState) this.L$0;
            if (!retirementDashboardDataState.getRetirementOptionsAssetHomeTooltipSeen()) {
                RetirementDashboardDuxo.this.retirementNuxStore.recordOptionsAssetHomeTooltipShown();
                EventLogger.DefaultImpls.logAppear$default(RetirementDashboardDuxo.this.eventLogger, null, RetirementDashboardDuxo.INSTANCE.getANALYTICS_SCREEN$feature_retirement_tab_externalDebug(), new Component(Component.ComponentType.TOOLTIP, RetirementDashboardDuxo.TOOLTIP_IDENTIFIER, null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PositionsInstrumentType.OPTIONS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -8193, -1, 16383, null), 9, null);
                return RetirementDashboardDataState.copy$default(retirementDashboardDataState, null, null, null, null, null, false, null, false, false, null, false, true, false, 6143, null);
            }
            return RetirementDashboardDataState.copy$default(retirementDashboardDataState, null, null, null, null, null, false, null, false, false, null, false, false, false, 8191, null);
        }
    }

    public final void onRetirementOptionsAssetHomeTooltipSeen() {
        applyMutation(new C272161(null));
    }

    /* compiled from: RetirementDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$onRetirementOptionsAssetHomeOrTooltipClicked$1", m3645f = "RetirementDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDuxo$onRetirementOptionsAssetHomeOrTooltipClicked$1 */
    static final class C272151 extends ContinuationImpl7 implements Function2<RetirementDashboardDataState, Continuation<? super RetirementDashboardDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C272151(Continuation<? super C272151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C272151 c272151 = new C272151(continuation);
            c272151.L$0 = obj;
            return c272151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementDashboardDataState retirementDashboardDataState, Continuation<? super RetirementDashboardDataState> continuation) {
            return ((C272151) create(retirementDashboardDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementDashboardDataState.copy$default((RetirementDashboardDataState) this.L$0, null, null, null, null, null, false, null, false, false, null, false, false, false, 7167, null);
        }
    }

    public final void onRetirementOptionsAssetHomeOrTooltipClicked() {
        applyMutation(new C272151(null));
        this.retirementNuxStore.hideOptionsAssetHomeTooltip();
    }

    /* compiled from: RetirementDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDuxo$Companion;", "", "<init>", "()V", "ANALYTICS_SCREEN", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getANALYTICS_SCREEN$feature_retirement_tab_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "TOOLTIP_IDENTIFIER", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Screen getANALYTICS_SCREEN$feature_retirement_tab_externalDebug() {
            return RetirementDashboardDuxo.ANALYTICS_SCREEN;
        }
    }
}
