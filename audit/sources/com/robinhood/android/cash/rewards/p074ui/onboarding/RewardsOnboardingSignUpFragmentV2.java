package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.composables.RoundupOnboardingSignUpComposable;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.Security;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u0003456B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\r\u0010,\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020$H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onStop", "onSecondaryButtonClicked", "", "dialogId", "", "passthroughArgs", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpViewStateV2;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingSignUpFragmentV2 extends GenericComposeFragment implements RegionGated, RhBottomSheetDialogFragment.OnClickListener {
    public static final String APY_PLACEHOLDER = "{{ .INTEREST_APY }}";
    public static final String BONUS_PERCENTAGE_PLACEHOLDER = "{{ .PERCENTAGE }}";
    public static final String OLD_TICKER_PLACEHOLDER = "{{ .OLD_TICKER }}";
    public static final String TICKER_PLACEHOLDER = "{{ .NEW_TICKER }}";
    public EventLogger eventLogger;
    private Context loggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingSignUpFragmentV2.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RewardsOnboardingSignUpDuxoV2.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RewardsOnboardingSignUpFragmentV2.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen loggingScreen = new Screen(Screen.Name.ROUNDUP_ENROLL_REVIEW, null, null, null, 14, null);

    /* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Callbacks;", "", "onSignUpComplete", "", "investmentType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetSymbol", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSignUpComplete(ApiAssetType investmentType, String assetSymbol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(RewardsOnboardingSignUpFragmentV2 rewardsOnboardingSignUpFragmentV2, int i, Composer composer, int i2) {
        rewardsOnboardingSignUpFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final RewardsOnboardingSignUpDuxoV2 getDuxo() {
        return (RewardsOnboardingSignUpDuxoV2) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getOnboardingContext(((Args) INSTANCE.getArgs((Fragment) this)).getAction());
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Context context;
        super.onStart();
        Observable<RewardsOnboardingSignUpViewStateV2> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102351(this));
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context2 = this.loggingContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        } else {
            context = context2;
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    /* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2$onStart$1 */
    /* synthetic */ class C102351 extends FunctionReferenceImpl implements Function1<RewardsOnboardingSignUpViewStateV2, Unit> {
        C102351(Object obj) {
            super(1, obj, RewardsOnboardingSignUpFragmentV2.class, "bind", "bind(Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpViewStateV2;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsOnboardingSignUpViewStateV2 rewardsOnboardingSignUpViewStateV2) {
            invoke2(rewardsOnboardingSignUpViewStateV2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsOnboardingSignUpViewStateV2 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsOnboardingSignUpFragmentV2) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context = this.loggingContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        }
        EventLogger.DefaultImpls.logScreenDisappear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingSignUpViewStateV2 ComposeContent$lambda$1(SnapshotState4<RewardsOnboardingSignUpViewStateV2> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == C10176R.id.dialog_id_rewards_onboarding_sign_up_learn_more) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string2 = getString(C10176R.string.rewards_learn_more_url);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            return true;
        }
        return super.onSecondaryButtonClicked(dialogId, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RewardsOnboardingSignUpViewStateV2 state) {
        UiEvent<Unit> actionSuccessEvent = state.getActionSuccessEvent();
        if ((actionSuccessEvent != null ? actionSuccessEvent.consume() : null) != null) {
            Callbacks callbacks = getCallbacks();
            InvestmentTarget selectedInvestmentTarget = state.getSelectedInvestmentTarget();
            callbacks.onSignUpComplete(selectedInvestmentTarget != null ? selectedInvestmentTarget.getTargetType() : null, state.getSelectedInvestmentSymbol());
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getActionErrorEvent());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2122328337);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122328337, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2.ComposeContent (RewardsOnboardingSignUpFragmentV2.kt:109)");
            }
            final SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new RewardsOnboardingSignUpViewStateV2(false, null, null, ((Args) INSTANCE.getArgs((Fragment) this)).getInvestmentTarget().getInstrumentSymbol(), null, null, null, 119, null), composerStartRestartGroup, 0);
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(325594819, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    String displaySymbol;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(325594819, i3, -1, "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2.ComposeContent.<anonymous> (RewardsOnboardingSignUpFragmentV2.kt:116)");
                    }
                    String selectedInvestmentSymbol = RewardsOnboardingSignUpFragmentV2.ComposeContent$lambda$1(snapshotState4SubscribeAsState).getSelectedInvestmentSymbol();
                    Security currentInvestment = RewardsOnboardingSignUpFragmentV2.ComposeContent$lambda$1(snapshotState4SubscribeAsState).getCurrentInvestment();
                    if (currentInvestment == null || (displaySymbol = currentInvestment.getDisplaySymbol()) == null) {
                        displaySymbol = "";
                    }
                    String str = displaySymbol;
                    Companion companion = RewardsOnboardingSignUpFragmentV2.INSTANCE;
                    RoundupOnboardingSignUpComposable.RoundupOnboardingSignUpComposable(selectedInvestmentSymbol, str, ((Args) companion.getArgs((Fragment) RewardsOnboardingSignUpFragmentV2.this)).getReviewContent(), RewardsOnboardingSignUpFragmentV2.ComposeContent$lambda$1(snapshotState4SubscribeAsState).getBrokerageInterestRate() + "%", (Args) companion.getArgs((Fragment) RewardsOnboardingSignUpFragmentV2.this), RewardsOnboardingSignUpFragmentV2.this.getDuxo(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingSignUpFragmentV2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsOnboardingSignUpFragmentV2.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Args;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "reviewContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "bonus", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;Lcom/robinhood/recurring/models/db/InvestmentTarget;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "getInvestmentTarget", "()Lcom/robinhood/recurring/models/db/InvestmentTarget;", "getReviewContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "getBonus", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final LegacyIntentKey.RewardsOnboarding.Action action;
        private final RewardsOnboardingContent bonus;
        private final InvestmentTarget investmentTarget;
        private final RewardsOnboardingContent reviewContent;

        /* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(LegacyIntentKey.RewardsOnboarding.Action.valueOf(parcel.readString()), (InvestmentTarget) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardsOnboardingContent.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action.name());
            dest.writeParcelable(this.investmentTarget, flags);
            RewardsOnboardingContent rewardsOnboardingContent = this.reviewContent;
            if (rewardsOnboardingContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent.writeToParcel(dest, flags);
            }
            RewardsOnboardingContent rewardsOnboardingContent2 = this.bonus;
            if (rewardsOnboardingContent2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent2.writeToParcel(dest, flags);
            }
        }

        public Args(LegacyIntentKey.RewardsOnboarding.Action action, InvestmentTarget investmentTarget, RewardsOnboardingContent rewardsOnboardingContent, RewardsOnboardingContent rewardsOnboardingContent2) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
            this.action = action;
            this.investmentTarget = investmentTarget;
            this.reviewContent = rewardsOnboardingContent;
            this.bonus = rewardsOnboardingContent2;
        }

        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        public final InvestmentTarget getInvestmentTarget() {
            return this.investmentTarget;
        }

        public final RewardsOnboardingContent getReviewContent() {
            return this.reviewContent;
        }

        public final RewardsOnboardingContent getBonus() {
            return this.bonus;
        }
    }

    /* compiled from: RewardsOnboardingSignUpFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Args;", "<init>", "()V", "APY_PLACEHOLDER", "", "BONUS_PERCENTAGE_PLACEHOLDER", "TICKER_PLACEHOLDER", "OLD_TICKER_PLACEHOLDER", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOnboardingSignUpFragmentV2, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsOnboardingSignUpFragmentV2 rewardsOnboardingSignUpFragmentV2) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOnboardingSignUpFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOnboardingSignUpFragmentV2 newInstance(Args args) {
            return (RewardsOnboardingSignUpFragmentV2) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOnboardingSignUpFragmentV2 rewardsOnboardingSignUpFragmentV2, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOnboardingSignUpFragmentV2, args);
        }
    }
}
