package com.robinhood.android.cash.merchantrewards.p073ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.RhyReferrerLandingKey;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: MerchantRewardsOverviewFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\bH\u0017¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ\u0010\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010,R\u001a\u00107\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010,R\u001a\u00109\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010,R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u00060>j\u0002`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O²\u0006\u0014\u0010\u0014\u001a\n N*\u0004\u0018\u00010\u00130\u00138\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", "<init>", "()V", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "offer", "", "onClickCashCardOffer", "(Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "merchantOffer", "showOfferDetails", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "j$/time/Instant", "startAt", "handleRewardHistoryButtonOnClick", "(Lj$/time/Instant;)V", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;", "state", "bind", "(Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;)V", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "onStart", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onRadTaskCompleted", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "Z", "getUseDesignSystemToolbar", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewDuxo;", "duxo", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "kotlin.jvm.PlatformType", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MerchantRewardsOverviewFragment extends GenericComposeFragment implements RegionGated, MerchantRewardsOfferDetailsBottomSheet.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Context loggingContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;
    private final boolean excludeFromSourceLogging = true;
    private final boolean excludeFromAnalyticsLogging = true;
    private final Screen loggingScreen = new Screen(Screen.Name.MERCHANT_REWARD_OFFER_PAGE, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment, int i, Composer composer, int i2) {
        merchantRewardsOverviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MerchantRewardsOverviewFragment() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this.loggingContext = new Context(0, 0, 0, null, objArr2, objArr3, objArr4, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.REWARDS, "merchant_rewards_general", "unknown", objArr, null, null, 56, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
        this.duxo = OldDuxos.oldDuxo(this, MerchantRewardsOverviewDuxo.class);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    private final MerchantRewardsOverviewDuxo getDuxo() {
        return (MerchantRewardsOverviewDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        final View viewAddCustomView$default = RhToolbar.addCustomView$default(toolbar, C10127R.layout.include_merchantrewards_overview_header, false, 8388613, 2, null);
        OnClickListeners.onClick(viewAddCustomView$default, new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantRewardsOverviewFragment.configureToolbar$lambda$1$lambda$0(this.f$0, viewAddCustomView$default);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit configureToolbar$lambda$1$lambda$0(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment, View view) {
        Navigator navigator = merchantRewardsOverviewFragment.getNavigator();
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new LegacyFragmentKey.RhyMerchantRewardsWelcome(true, null, 2, 0 == true ? 1 : 0), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C101661(this));
    }

    /* compiled from: MerchantRewardsOverviewFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$onStart$1 */
    /* synthetic */ class C101661 extends FunctionReferenceImpl implements Function1<MerchantRewardsOverviewViewState, Unit> {
        C101661(Object obj) {
            super(1, obj, MerchantRewardsOverviewFragment.class, "bind", "bind(Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MerchantRewardsOverviewViewState merchantRewardsOverviewViewState) {
            invoke2(merchantRewardsOverviewViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MerchantRewardsOverviewViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MerchantRewardsOverviewFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    private static final MerchantRewardsOverviewViewState ComposeContent$lambda$3(SnapshotState4<MerchantRewardsOverviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireBaseActivity().showBackArrowIcon();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2023369004);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023369004, i2, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment.ComposeContent (MerchantRewardsOverviewFragment.kt:109)");
            }
            Observable<MerchantRewardsOverviewViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(observableDistinctUntilChanged, new MerchantRewardsOverviewViewState(null, null, null, null, null, null, null, null, null, 511, null), composerStartRestartGroup, 0);
            Clock clock = getDuxo().getClock();
            MerchantRewardsOverviewViewState merchantRewardsOverviewViewStateComposeContent$lambda$3 = ComposeContent$lambda$3(snapshotState4SubscribeAsState);
            Intrinsics.checkNotNullExpressionValue(merchantRewardsOverviewViewStateComposeContent$lambda$3, "ComposeContent$lambda$3(...)");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MerchantRewardsOverviewFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new MerchantRewardsOverviewFragment3(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Screen screen = this.loggingScreen;
            Context context = this.loggingContext;
            Function1 function1 = (Function1) kFunction;
            Function1 function12 = (Function1) kFunction2;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MerchantRewardsOverviewFragment.ComposeContent$lambda$7$lambda$6(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            MerchantRewardsOverviewComposable4.MerchantRewardsOverviewComposable(merchantRewardsOverviewViewStateComposeContent$lambda$3, clock, function1, function12, screen, context, (Function0) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOverviewFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit ComposeContent$lambda$7$lambda$6(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment) {
        Navigator navigator = merchantRewardsOverviewFragment.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOverviewFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RhyUpgradeKey(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickCashCardOffer(CashCardOffer offer) {
        if (offer instanceof CashCardOffer.Merchant) {
            showOfferDetails(((CashCardOffer.Merchant) offer).getOffer());
        } else {
            if (!(offer instanceof CashCardOffer.RhyReferral)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, RhyReferrerLandingKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    private final void showOfferDetails(MerchantOfferV2 merchantOffer) {
        MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = (MerchantRewardsOfferDetailsBottomSheet) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new MerchantRewardsOfferDetailsBottomSheet.Args(merchantOffer, false, 2, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        merchantRewardsOfferDetailsBottomSheet.show(childFragmentManager, "MerchantRewardsOfferDetailsBottomSheetDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRewardHistoryButtonOnClick(Instant startAt) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.MerchantRewardHistory(startAt), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MerchantRewardsOverviewViewState state) {
        UiEvent<MerchantOfferV2> showMerchantOfferEvent = state.getShowMerchantOfferEvent();
        if (showMerchantOfferEvent != null) {
            showMerchantOfferEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewFragment.bind$lambda$9(this.f$0, (MerchantOfferV2) obj);
                }
            });
            return;
        }
        UiEvent<MerchantOfferV2> radTransferComplete = state.getRadTransferComplete();
        if (radTransferComplete != null) {
            radTransferComplete.consumeWith(new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewFragment.bind$lambda$10(this.f$0, (MerchantOfferV2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment, MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        merchantRewardsOverviewFragment.showOfferDetails(offer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment, MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        merchantRewardsOverviewFragment.showOfferDetails(offer);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.Callbacks
    public void onRadTaskCompleted(MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        getDuxo().radTransferComplete(offer);
    }

    /* compiled from: MerchantRewardsOverviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyMerchantRewardsOverview;", "<init>", "()V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MerchantRewardsOverviewFragment, LegacyFragmentKey.RhyMerchantRewardsOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyMerchantRewardsOverview rhyMerchantRewardsOverview) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyMerchantRewardsOverview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyMerchantRewardsOverview getArgs(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment) {
            return (LegacyFragmentKey.RhyMerchantRewardsOverview) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, merchantRewardsOverviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantRewardsOverviewFragment newInstance(LegacyFragmentKey.RhyMerchantRewardsOverview rhyMerchantRewardsOverview) {
            return (MerchantRewardsOverviewFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyMerchantRewardsOverview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantRewardsOverviewFragment merchantRewardsOverviewFragment, LegacyFragmentKey.RhyMerchantRewardsOverview rhyMerchantRewardsOverview) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, merchantRewardsOverviewFragment, rhyMerchantRewardsOverview);
        }
    }
}
