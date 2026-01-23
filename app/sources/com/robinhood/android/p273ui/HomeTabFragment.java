package com.robinhood.android.p273ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCaller;
import com.plaid.internal.EnumC7081g;
import com.robinhood.WatchlistFragmentCallbacks;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.banking.experiments.TransfersRedesignExperiment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.data.prefs.HasVisitedBrokerageWatchlistHomePref;
import com.robinhood.android.common.data.prefs.HasVisitedEquityDetailPref;
import com.robinhood.android.common.p088ui.BaseTabFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.dashboard.store.HomeDashboardStore;
import com.robinhood.android.home.contracts.HomeDashboardKey;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.home.contracts.HomeTabFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorFragmentKey;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: HomeTabFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u000208H\u0016J\b\u0010<\u001a\u000208H\u0002J\b\u0010=\u001a\u000208H\u0014J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u000208H\u0002J\u000e\u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020DJ\u0010\u0010E\u001a\u0002082\u0006\u0010F\u001a\u00020GH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001e\u0010.\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00104\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/ui/HomeTabFragment;", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "Lcom/robinhood/WatchlistFragmentCallbacks;", "Lcom/robinhood/shared/home/contracts/AccountSelectorTabLinkIntentHandler;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "setPositionStore", "(Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "suggestedAmountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "getSuggestedAmountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "setSuggestedAmountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "homeDashboardStore", "Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "getHomeDashboardStore", "()Lcom/robinhood/android/dashboard/store/HomeDashboardStore;", "setHomeDashboardStore", "(Lcom/robinhood/android/dashboard/store/HomeDashboardStore;)V", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "getAccountSelectorHomeManager", "()Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "setAccountSelectorHomeManager", "(Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasVisitedBrokerageWatchlistHomePref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedBrokerageWatchlistHomePref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedBrokerageWatchlistHomePref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "hasVisitedEquityDetailPref", "getHasVisitedEquityDetailPref", "setHasVisitedEquityDetailPref", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setFragmentForHomeDashboard", "showRootFragment", "showEquityDetail", "key", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "logEquityDetailFirstVisitEvent", "setDashboard", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "handleDeeplinkAccountTabSwitch", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class HomeTabFragment extends BaseTabFragment implements WatchlistFragmentCallbacks, AccountSelectorTabLinkIntentHandler {
    public AccountSelectorHomeManager accountSelectorHomeManager;
    public AnalyticsLogger analytics;
    public ExperimentsStore experimentsStore;

    @HasVisitedBrokerageWatchlistHomePref
    public BooleanPreference hasVisitedBrokerageWatchlistHomePref;

    @HasVisitedEquityDetailPref
    public BooleanPreference hasVisitedEquityDetailPref;
    public HomeDashboardStore homeDashboardStore;
    public PositionStore positionStore;
    public SuggestedAmountsStore suggestedAmountStore;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public HomeTabFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.useDesignSystemToolbar = true;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final PositionStore getPositionStore() {
        PositionStore positionStore = this.positionStore;
        if (positionStore != null) {
            return positionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionStore");
        return null;
    }

    public final void setPositionStore(PositionStore positionStore) {
        Intrinsics.checkNotNullParameter(positionStore, "<set-?>");
        this.positionStore = positionStore;
    }

    public final SuggestedAmountsStore getSuggestedAmountStore() {
        SuggestedAmountsStore suggestedAmountsStore = this.suggestedAmountStore;
        if (suggestedAmountsStore != null) {
            return suggestedAmountsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suggestedAmountStore");
        return null;
    }

    public final void setSuggestedAmountStore(SuggestedAmountsStore suggestedAmountsStore) {
        Intrinsics.checkNotNullParameter(suggestedAmountsStore, "<set-?>");
        this.suggestedAmountStore = suggestedAmountsStore;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final HomeDashboardStore getHomeDashboardStore() {
        HomeDashboardStore homeDashboardStore = this.homeDashboardStore;
        if (homeDashboardStore != null) {
            return homeDashboardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeDashboardStore");
        return null;
    }

    public final void setHomeDashboardStore(HomeDashboardStore homeDashboardStore) {
        Intrinsics.checkNotNullParameter(homeDashboardStore, "<set-?>");
        this.homeDashboardStore = homeDashboardStore;
    }

    public final AccountSelectorHomeManager getAccountSelectorHomeManager() {
        AccountSelectorHomeManager accountSelectorHomeManager = this.accountSelectorHomeManager;
        if (accountSelectorHomeManager != null) {
            return accountSelectorHomeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountSelectorHomeManager");
        return null;
    }

    public final void setAccountSelectorHomeManager(AccountSelectorHomeManager accountSelectorHomeManager) {
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "<set-?>");
        this.accountSelectorHomeManager = accountSelectorHomeManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    public final BooleanPreference getHasVisitedBrokerageWatchlistHomePref() {
        BooleanPreference booleanPreference = this.hasVisitedBrokerageWatchlistHomePref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedBrokerageWatchlistHomePref");
        return null;
    }

    public final void setHasVisitedBrokerageWatchlistHomePref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedBrokerageWatchlistHomePref = booleanPreference;
    }

    public final BooleanPreference getHasVisitedEquityDetailPref() {
        BooleanPreference booleanPreference = this.hasVisitedEquityDetailPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedEquityDetailPref");
        return null;
    }

    public final void setHasVisitedEquityDetailPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedEquityDetailPref = booleanPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            showRootFragment();
        }
        setFragmentForHomeDashboard();
        Completable completableSwitchMapCompletable = ExperimentsProvider.DefaultImpls.streamVariant$default(getExperimentsStore(), TransfersRedesignExperiment.INSTANCE, SimpleVariant.CONTROL, false, 4, null).filter(new Predicate() { // from class: com.robinhood.android.ui.HomeTabFragment.onCreate.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(SimpleVariant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it != SimpleVariant.CONTROL;
            }
        }).switchMapCompletable(new Function() { // from class: com.robinhood.android.ui.HomeTabFragment.onCreate.2

            /* compiled from: HomeTabFragment.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.HomeTabFragment$onCreate$2$1", m3645f = "HomeTabFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.HomeTabFragment$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ SimpleVariant $variant;
                int label;
                final /* synthetic */ HomeTabFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(HomeTabFragment homeTabFragment, SimpleVariant simpleVariant, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = homeTabFragment;
                    this.$variant = simpleVariant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$variant, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job jobRefresh = this.this$0.getSuggestedAmountStore().refresh(false, this.$variant.getServerValue());
                        this.label = 1;
                        if (jobRefresh.join(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(SimpleVariant variant) {
                Intrinsics.checkNotNullParameter(variant, "variant");
                HomeTabFragment homeTabFragment = HomeTabFragment.this;
                return RxFactory.DefaultImpls.rxCompletable$default(homeTabFragment, null, new AnonymousClass1(homeTabFragment, variant, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        handleDeeplink();
    }

    private final void setFragmentForHomeDashboard() {
        Fragment fragmentCreateFragment$default;
        if (getAccountSelectorHomeManager().isAccountSelectorEnabled()) {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), AccountSelectorFragmentKey.INSTANCE, null, 2, null);
        } else {
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), HomeDashboardKey.INSTANCE, null, 2, null);
        }
        setRootFragmentIfDifferent(fragmentCreateFragment$default);
    }

    @Override // com.robinhood.android.common.p088ui.BaseTabFragment
    protected void showRootFragment() {
        if (!getHasVisitedBrokerageWatchlistHomePref().get()) {
            bind(getPositionStore().hasIndividualAccountPositions(), LifecycleEvent.ON_STOP).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.HomeTabFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeTabFragment.showRootFragment$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }
        setFragmentForHomeDashboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRootFragment$lambda$0(HomeTabFragment homeTabFragment, boolean z) {
        if (!z) {
            homeTabFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_FIRST_VISIT_OF_BROKERAGE_WATCHLIST_HOME);
        }
        homeTabFragment.getHasVisitedBrokerageWatchlistHomePref().set(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.WatchlistFragmentCallbacks
    public void showEquityDetail(LegacyFragmentKey.EquityInstrumentDetail key) {
        Intrinsics.checkNotNullParameter(key, "key");
        logEquityDetailFirstVisitEvent();
        replaceFragment(getNavigator().createFragment(key, PerformanceMetricEventData.Source.SOURCE_HOME));
    }

    private final void logEquityDetailFirstVisitEvent() {
        if (getHasVisitedEquityDetailPref().get()) {
            return;
        }
        bind(getPositionStore().hasIndividualAccountPositions(), LifecycleEvent.ON_STOP).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.HomeTabFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeTabFragment.logEquityDetailFirstVisitEvent$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logEquityDetailFirstVisitEvent$lambda$1(HomeTabFragment homeTabFragment, boolean z) {
        if (!z) {
            homeTabFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_FIRST_VISIT_OF_EQUITY_DETAIL);
        }
        homeTabFragment.getHasVisitedEquityDetailPref().set(true);
        return Unit.INSTANCE;
    }

    public final void setDashboard(HomeDashboardType dashboardType) {
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        getHomeDashboardStore().setHomeDashboardType(dashboardType);
    }

    @Override // com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler
    public void handleDeeplinkAccountTabSwitch(TabLinkIntentKey tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        ActivityResultCaller rootFragment = getRootFragment();
        AccountSelectorTabLinkIntentHandler accountSelectorTabLinkIntentHandler = rootFragment instanceof AccountSelectorTabLinkIntentHandler ? (AccountSelectorTabLinkIntentHandler) rootFragment : null;
        if (accountSelectorTabLinkIntentHandler != null) {
            accountSelectorTabLinkIntentHandler.handleDeeplinkAccountTabSwitch(tabIntentKey);
        }
    }

    /* compiled from: HomeTabFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/ui/HomeTabFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/ui/HomeTabFragment;", "Lcom/robinhood/android/home/contracts/HomeTabFragmentKey;", "<init>", "()V", "newInstance", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<HomeTabFragment, HomeTabFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(HomeTabFragmentKey homeTabFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, homeTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public HomeTabFragmentKey getArgs(HomeTabFragment homeTabFragment) {
            return (HomeTabFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, homeTabFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public HomeTabFragment newInstance(HomeTabFragmentKey homeTabFragmentKey) {
            return (HomeTabFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, homeTabFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(HomeTabFragment homeTabFragment, HomeTabFragmentKey homeTabFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, homeTabFragment, homeTabFragmentKey);
        }

        public final HomeTabFragment newInstance() {
            return new HomeTabFragment();
        }
    }
}
