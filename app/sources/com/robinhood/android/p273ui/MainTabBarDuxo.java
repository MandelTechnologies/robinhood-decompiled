package com.robinhood.android.p273ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.tab.GoldTabExperimentStore;
import com.robinhood.android.gold.tab.GoldTabState;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.android.lib.creditcard.prefs.CreditCardWaitlistResumeAppBadgePref;
import com.robinhood.android.libs.tab.CurrentTabManager;
import com.robinhood.android.p273ui.MainTabBarEvent;
import com.robinhood.android.p273ui.tabs.TabUtils;
import com.robinhood.android.p273ui.tooltip.WatchlistTabTooltipService;
import com.robinhood.android.redesign.accounttab.prefs.AccountSelectorHomeManager;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.investingmonitor.InvestingMonitorTabState;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.android.regiongate.WatchlistTabRegionGate;
import com.robinhood.android.regiongate.experiment.WatchlistRedesignExperiment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.component.BentoTabBarState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.McDucklingBadgeStore;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.contracts.gold_tab_service.proto.p491v1.GetGoldTabEligibleStatesRequestDto;
import microgram.contracts.gold_tab_service.proto.p491v1.GetGoldTabEligibleStatesResponseDto;
import microgram.contracts.gold_tab_service.proto.p491v1.GoldTabServiceService;

/* compiled from: MainTabBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001>B{\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0004\b\"\u0010#J\b\u0010*\u001a\u00020+H\u0016J\u0006\u0010,\u001a\u00020+J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020+H\u0002J\b\u0010/\u001a\u00020+H\u0002J\u0018\u00100\u001a\u00020+2\u0006\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000204J\u000e\u00100\u001a\u00020+2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020+2\b\u00108\u001a\u0004\u0018\u000109J\u0006\u0010:\u001a\u00020+J\u0014\u0010;\u001a\u00020+2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002020=R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/ui/MainTabBarDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/ui/MainTabBarDataState;", "Lcom/robinhood/android/ui/MainTabBarViewState;", "Lcom/robinhood/android/ui/MainTabBarEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "goldTabExperimentsStore", "Lcom/robinhood/android/gold/tab/GoldTabExperimentStore;", "redesignInvestingExperimentStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "mcDucklingBadgeStore", "Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "accountSelectorHomeManager", "Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;", "watchlistTabTooltipService", "Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "homeTabShouldBadgePref", "Lcom/robinhood/prefs/BooleanPreference;", "currentTabManager", "Lcom/robinhood/android/libs/tab/CurrentTabManager;", "stateProvider", "Lcom/robinhood/android/ui/MainTabBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/tab/GoldTabExperimentStore;Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/McDucklingBadgeStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/redesign/accounttab/prefs/AccountSelectorHomeManager;Lcom/robinhood/android/ui/tooltip/WatchlistTabTooltipService;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/libs/tab/CurrentTabManager;Lcom/robinhood/android/ui/MainTabBarStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "microgramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "goldTabService", "Lmicrogram/contracts/gold_tab_service/proto/v1/GoldTabServiceService;", "onCreate", "", "onWatchlistTooltipAppear", "onResume", "checkInvestingTabExperiment", "checkGoldExperiment", "onTabSelected", "tab", "Lcom/robinhood/compose/bento/component/BentoTabBarState$Tab;", "addCurrentTabToBackStack", "", "watchlistScreen", "Lcom/robinhood/android/home/contracts/WatchlistScreen;", "onCreditCardTabOverlayChanged", "creditCardTabStyle", "Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "onCurrentTabReselected", "updateTabStack", "tabStack", "Ljava/util/Stack;", "Companion", "feature-tab-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MainTabBarDuxo extends BaseDuxo3<MainTabBarDataState, MainTabBarViewState, MainTabBarEvent> implements HasSavedState {
    private static final String SAVED_TAB = "saved_tab";
    private final AccountSelectorHomeManager accountSelectorHomeManager;
    private final CurrentTabManager currentTabManager;
    private final ExperimentsStore experimentStore;
    private final GoldTabExperimentStore goldTabExperimentsStore;
    private final GoldTabServiceService goldTabService;
    private final BooleanPreference homeTabShouldBadgePref;
    private final McDucklingBadgeStore mcDucklingBadgeStore;
    private final MicrogramComponent microgramComponent;
    private final RedesignInvestingExperimentStore redesignInvestingExperimentStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;
    private final WatchlistTabTooltipService watchlistTabTooltipService;
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MainTabBarDuxo(GoldTabExperimentStore goldTabExperimentsStore, RedesignInvestingExperimentStore redesignInvestingExperimentStore, UserStore userStore, McDucklingBadgeStore mcDucklingBadgeStore, RegionGateProvider regionGateProvider, ExperimentsStore experimentStore, AccountSelectorHomeManager accountSelectorHomeManager, WatchlistTabTooltipService watchlistTabTooltipService, MicrogramComponent.Factory microgramComponentFactory, @CreditCardWaitlistResumeAppBadgePref BooleanPreference homeTabShouldBadgePref, CurrentTabManager currentTabManager, MainTabBarStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(goldTabExperimentsStore, "goldTabExperimentsStore");
        Intrinsics.checkNotNullParameter(redesignInvestingExperimentStore, "redesignInvestingExperimentStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(mcDucklingBadgeStore, "mcDucklingBadgeStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(accountSelectorHomeManager, "accountSelectorHomeManager");
        Intrinsics.checkNotNullParameter(watchlistTabTooltipService, "watchlistTabTooltipService");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(homeTabShouldBadgePref, "homeTabShouldBadgePref");
        Intrinsics.checkNotNullParameter(currentTabManager, "currentTabManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        BentoTabBarState.Tab tab = (BentoTabBarState.Tab) savedStateHandle.get(SAVED_TAB);
        super(new MainTabBarDataState(tab == null ? BentoTabBarState.Tab.PORTFOLIO : tab, null, null, null, null, null, false, false, false, false, null, 2046, null), stateProvider, duxoBundle);
        this.goldTabExperimentsStore = goldTabExperimentsStore;
        this.redesignInvestingExperimentStore = redesignInvestingExperimentStore;
        this.userStore = userStore;
        this.mcDucklingBadgeStore = mcDucklingBadgeStore;
        this.regionGateProvider = regionGateProvider;
        this.experimentStore = experimentStore;
        this.accountSelectorHomeManager = accountSelectorHomeManager;
        this.watchlistTabTooltipService = watchlistTabTooltipService;
        this.homeTabShouldBadgePref = homeTabShouldBadgePref;
        this.currentTabManager = currentTabManager;
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-gold-tab-service", null, 2, null), null, 4, null);
        this.microgramComponent = microgramComponentCreate$default;
        this.goldTabService = (GoldTabServiceService) microgramComponentCreate$default.getServiceLocator().getClient(GoldTabServiceService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        this.currentTabManager.setCurrentTab(BentoTabBarState.Tab.PORTFOLIO);
        LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.MainTabBarDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabBarDuxo.onCreate$lambda$0(this.f$0, (User) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged = this.homeTabShouldBadgePref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.ui.MainTabBarDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabBarDuxo.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        getLifecycleScope().launchWhenCreated(new C313063(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313074(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313085(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313096(null), 3, null);
        applyMutation(new C313107(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(MainTabBarDuxo mainTabBarDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        mainTabBarDuxo.applyMutation(new MainTabBarDuxo2(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MainTabBarDuxo mainTabBarDuxo, Boolean bool) {
        mainTabBarDuxo.applyMutation(new MainTabBarDuxo3(bool, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$3", m3645f = "MainTabBarDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$3 */
    static final class C313063 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313063(Continuation<? super C313063> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313063(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313063) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Operators.connectWhen$default(MainTabBarDuxo.this.mcDucklingBadgeStore.streamBadgeResult(), Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(MainTabBarDuxo.this.regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showBadge", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$3$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$3$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506381 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ boolean $showBadge;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506381(boolean z, Continuation<? super C506381> continuation) {
                    super(2, continuation);
                    this.$showBadge = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506381 c506381 = new C506381(this.$showBadge, continuation);
                    c506381.L$0 = obj;
                    return c506381;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((C506381) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    BentoTabBarState.BadgeState badgeState;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) this.L$0;
                    if (this.$showBadge) {
                        badgeState = BentoTabBarState.BadgeState.NORMAL;
                    } else {
                        badgeState = BentoTabBarState.BadgeState.NONE;
                    }
                    Map mutableMap = MapsKt.toMutableMap(mainTabBarDataState.getBadges());
                    mutableMap.put(BentoTabBarState.Tab.SPENDING, badgeState);
                    Unit unit = Unit.INSTANCE;
                    return MainTabBarDataState.copy$default(mainTabBarDataState, null, mutableMap, null, null, null, null, false, false, false, false, null, 2045, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506381(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$4", m3645f = "MainTabBarDuxo.kt", m3646l = {123}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$4 */
    static final class C313074 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313074(Continuation<? super C313074> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313074(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313074) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamRegionGateStateFlow = MainTabBarDuxo.this.regionGateProvider.streamRegionGateStateFlow(WatchlistTabRegionGate.INSTANCE, false);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inRegionGate", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$4$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.Z$0;
                    if (z) {
                        this.this$0.experimentStore.logExposure(WatchlistRedesignExperiment.INSTANCE);
                    }
                    this.this$0.applyMutation(new C506391(z, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$4$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506391 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ boolean $inRegionGate;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506391(boolean z, Continuation<? super C506391> continuation) {
                    super(2, continuation);
                    this.$inRegionGate = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506391 c506391 = new C506391(this.$inRegionGate, continuation);
                    c506391.L$0 = obj;
                    return c506391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((C506391) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, null, null, null, false, this.$inRegionGate, false, false, null, 1919, null);
                }
            }
        }
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$5", m3645f = "MainTabBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$5 */
    static final class C313085 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313085(Continuation<? super C313085> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313085(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313085) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shouldShow", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$5$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$5$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$5$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506401 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ boolean $shouldShow;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506401(boolean z, Continuation<? super C506401> continuation) {
                    super(2, continuation);
                    this.$shouldShow = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506401 c506401 = new C506401(this.$shouldShow, continuation);
                    c506401.L$0 = obj;
                    return c506401;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((C506401) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, null, null, null, false, false, false, this.$shouldShow, null, 1535, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506401(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowShouldShowTooltip = MainTabBarDuxo.this.watchlistTabTooltipService.shouldShowTooltip();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowShouldShowTooltip, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$6", m3645f = "MainTabBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$6 */
    static final class C313096 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313096(Continuation<? super C313096> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313096(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313096) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(MainTabBarDuxo.this.regionGateProvider, StocksAndSharesIsaRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "showIsaTab", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$6$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$6$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506411 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ boolean $showIsaTab;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506411(boolean z, Continuation<? super C506411> continuation) {
                    super(2, continuation);
                    this.$showIsaTab = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506411 c506411 = new C506411(this.$showIsaTab, continuation);
                    c506411.L$0 = obj;
                    return c506411;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((C506411) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, null, null, null, this.$showIsaTab, false, false, false, null, 1983, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506411(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreate$7", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreate$7 */
    static final class C313107 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C313107(Continuation<? super C313107> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313107 c313107 = MainTabBarDuxo.this.new C313107(continuation);
            c313107.L$0 = obj;
            return c313107;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
            return ((C313107) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, null, null, null, false, false, MainTabBarDuxo.this.accountSelectorHomeManager.isAccountSelectorEnabled(), false, null, 1791, null);
        }
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onWatchlistTooltipAppear$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onWatchlistTooltipAppear$1 */
    static final class C313131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313131(Continuation<? super C313131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MainTabBarDuxo.this.watchlistTabTooltipService.markTooltipSeen();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onWatchlistTooltipAppear() {
        this.experimentStore.logExposure(WatchlistRedesignExperiment.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313131(null), 3, null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        checkGoldExperiment();
        checkInvestingTabExperiment();
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1", m3645f = "MainTabBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1 */
    static final class C313051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313051(Continuation<? super C313051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Operators.connectWhen$default(MainTabBarDuxo.this.redesignInvestingExperimentStore.isMonitorTabInternalExperimentEnabled(), Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(MainTabBarDuxo.this.regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null), null, 2, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MainTabBarDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isMember", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1$1$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkInvestingTabExperiment$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506371 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ boolean $isMember;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506371(boolean z, Continuation<? super C506371> continuation) {
                    super(2, continuation);
                    this.$isMember = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506371 c506371 = new C506371(this.$isMember, continuation);
                    c506371.L$0 = obj;
                    return c506371;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((C506371) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    InvestingMonitorTabState investingMonitorTabState;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) this.L$0;
                    if (this.$isMember) {
                        investingMonitorTabState = InvestingMonitorTabState.SHOW_TAB;
                    } else {
                        investingMonitorTabState = InvestingMonitorTabState.HIDE_TAB;
                    }
                    return MainTabBarDataState.copy$default(mainTabBarDataState, null, null, null, null, null, investingMonitorTabState, false, false, false, false, null, 2015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506371(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void checkInvestingTabExperiment() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313051(null), 3, null);
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1", m3645f = "MainTabBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1 */
    static final class C313041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313041(Continuation<? super C313041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainTabBarDuxo.this.new C313041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldTabServiceService goldTabServiceService = MainTabBarDuxo.this.goldTabService;
                GetGoldTabEligibleStatesRequestDto getGoldTabEligibleStatesRequestDto = new GetGoldTabEligibleStatesRequestDto();
                this.label = 1;
                obj = goldTabServiceService.GetGoldTabEligibleStates(getGoldTabEligibleStatesRequestDto, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            final List<String> states = ((GetGoldTabEligibleStatesResponseDto) obj).getStates();
            Observable observableStreamRegionGateState$default = RegionGateProvider.DefaultImpls.streamRegionGateState$default(MainTabBarDuxo.this.regionGateProvider, SpendingRegionGate.INSTANCE, false, 2, null);
            final MainTabBarDuxo mainTabBarDuxo = MainTabBarDuxo.this;
            Observable observableSwitchMap = observableStreamRegionGateState$default.switchMap(new Function() { // from class: com.robinhood.android.ui.MainTabBarDuxo.checkGoldExperiment.1.1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends GoldTabState> apply(Boolean isInSpendingRegionGate) {
                    Intrinsics.checkNotNullParameter(isInSpendingRegionGate, "isInSpendingRegionGate");
                    if (isInSpendingRegionGate.booleanValue()) {
                        return mainTabBarDuxo.goldTabExperimentsStore.streamGoldTabExperiment(states);
                    }
                    Observable observableJust = Observable.just(GoldTabState.NONE);
                    Intrinsics.checkNotNull(observableJust);
                    return observableJust;
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(observableSwitchMap), Integer.MAX_VALUE, null, 2, null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(MainTabBarDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: MainTabBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/gold/tab/GoldTabState;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1$2", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldTabState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MainTabBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(MainTabBarDuxo mainTabBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = mainTabBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldTabState goldTabState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(goldTabState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MainTabBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1$2$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$checkGoldExperiment$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
                final /* synthetic */ GoldTabState $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(GoldTabState goldTabState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = goldTabState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
                    return ((AnonymousClass1) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) this.L$0;
                    GoldTabState goldTabState = this.$state;
                    Intrinsics.checkNotNull(goldTabState);
                    return MainTabBarDataState.copy$default(mainTabBarDataState, null, null, null, null, goldTabState, null, false, false, false, false, null, 2031, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((GoldTabState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void checkGoldExperiment() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313041(null), 3, null);
    }

    public static /* synthetic */ void onTabSelected$default(MainTabBarDuxo mainTabBarDuxo, BentoTabBarState.Tab tab, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mainTabBarDuxo.onTabSelected(tab, z);
    }

    public final void onTabSelected(BentoTabBarState.Tab tab, boolean addCurrentTabToBackStack) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.currentTabManager.setCurrentTab(tab);
        getSavedStateHandle().set(SAVED_TAB, tab);
        applyMutation(new C313121(tab, addCurrentTabToBackStack, null));
        if (tab == BentoTabBarState.Tab.PORTFOLIO) {
            this.homeTabShouldBadgePref.set(false);
        }
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onTabSelected$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onTabSelected$1 */
    static final class C313121 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
        final /* synthetic */ boolean $addCurrentTabToBackStack;
        final /* synthetic */ BentoTabBarState.Tab $tab;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313121(BentoTabBarState.Tab tab, boolean z, Continuation<? super C313121> continuation) {
            super(2, continuation);
            this.$tab = tab;
            this.$addCurrentTabToBackStack = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313121 c313121 = new C313121(this.$tab, this.$addCurrentTabToBackStack, continuation);
            c313121.L$0 = obj;
            return c313121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
            return ((C313121) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MainTabBarDataState mainTabBarDataState = (MainTabBarDataState) this.L$0;
            if (this.$tab == BentoTabBarState.Tab.PORTFOLIO) {
                mainTabBarDataState.getTabStack().clear();
            } else if (mainTabBarDataState.getTabStack().contains(this.$tab)) {
                while (mainTabBarDataState.getTabStack().contains(this.$tab)) {
                    mainTabBarDataState.getTabStack().pop();
                }
            } else if (this.$addCurrentTabToBackStack) {
                boxing.boxBoolean(mainTabBarDataState.getTabStack().add(mainTabBarDataState.getSelectedTab()));
            }
            return MainTabBarDataState.copy$default(mainTabBarDataState, this.$tab, null, mainTabBarDataState.getTabStack(), null, null, null, false, false, false, false, null, 2042, null);
        }
    }

    public final void onTabSelected(final WatchListIntentKey2 watchlistScreen) {
        Intrinsics.checkNotNullParameter(watchlistScreen, "watchlistScreen");
        withDataState(new Function1() { // from class: com.robinhood.android.ui.MainTabBarDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainTabBarDuxo.onTabSelected$lambda$3(watchlistScreen, this, (MainTabBarDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTabSelected$lambda$3(WatchListIntentKey2 watchListIntentKey2, MainTabBarDuxo mainTabBarDuxo, MainTabBarDataState ds) {
        BentoTabBarState.Tab bentoTab;
        Intrinsics.checkNotNullParameter(ds, "ds");
        CountryCode.Supported locality = ds.getLocality();
        if (locality != null && (bentoTab = TabUtils.toBentoTab(watchListIntentKey2, locality)) != null) {
            onTabSelected$default(mainTabBarDuxo, bentoTab, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$onCreditCardTabOverlayChanged$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$onCreditCardTabOverlayChanged$1 */
    static final class C313111 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
        final /* synthetic */ CreditCardTabStyle $creditCardTabStyle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313111(CreditCardTabStyle creditCardTabStyle, Continuation<? super C313111> continuation) {
            super(2, continuation);
            this.$creditCardTabStyle = creditCardTabStyle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313111 c313111 = new C313111(this.$creditCardTabStyle, continuation);
            c313111.L$0 = obj;
            return c313111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
            return ((C313111) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, null, null, null, null, false, false, false, false, this.$creditCardTabStyle, 1023, null);
        }
    }

    public final void onCreditCardTabOverlayChanged(CreditCardTabStyle creditCardTabStyle) {
        applyMutation(new C313111(creditCardTabStyle, null));
    }

    public final void onCurrentTabReselected() {
        submit(MainTabBarEvent.CurrentTabReselectedEvent.INSTANCE);
    }

    /* compiled from: MainTabBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/ui/MainTabBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.ui.MainTabBarDuxo$updateTabStack$1", m3645f = "MainTabBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.ui.MainTabBarDuxo$updateTabStack$1 */
    static final class C313141 extends ContinuationImpl7 implements Function2<MainTabBarDataState, Continuation<? super MainTabBarDataState>, Object> {
        final /* synthetic */ Stack<BentoTabBarState.Tab> $tabStack;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313141(Stack<BentoTabBarState.Tab> stack, Continuation<? super C313141> continuation) {
            super(2, continuation);
            this.$tabStack = stack;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313141 c313141 = new C313141(this.$tabStack, continuation);
            c313141.L$0 = obj;
            return c313141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MainTabBarDataState mainTabBarDataState, Continuation<? super MainTabBarDataState> continuation) {
            return ((C313141) create(mainTabBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MainTabBarDataState.copy$default((MainTabBarDataState) this.L$0, null, null, this.$tabStack, null, null, null, false, false, false, false, null, 2043, null);
        }
    }

    public final void updateTabStack(Stack<BentoTabBarState.Tab> tabStack) {
        Intrinsics.checkNotNullParameter(tabStack, "tabStack");
        applyMutation(new C313141(tabStack, null));
    }
}
