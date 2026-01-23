package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroBottomSheetFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroViewState;
import com.robinhood.android.cash.rewards.p074ui.onboarding.composables.RoundupOnboardingIntroComposable;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RewardsOnboardingIntroFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0003./0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J\b\u0010\"\u001a\u00020\u001dH\u0016J\r\u0010#\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\t\u0010'\u001a\u00020(H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onStop", "onDestroyView", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "RewardsOnboardingV2Callbacks", "Args", "Companion", "feature-cash-rewards_externalDebug", "viewState", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingIntroFragmentV2 extends GenericComposeFragment implements RegionGated {
    public static final String BONUS_PERCENTAGE_PLACEHOLDER = "{{ .PERCENTAGE }}";
    public EventLogger eventLogger;
    private Context loggingContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsOnboardingIntroFragmentV2.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RewardsOnboardingV2Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RewardsOnboardingIntroDuxo.class);
    private final Screen loggingScreen = new Screen(Screen.Name.ROUNDUP_ENROLL_INTRO, null, null, null, 14, null);

    /* compiled from: RewardsOnboardingIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", "", "onIntroComplete", "", "shouldShowBrokerageAccountCreation", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RewardsOnboardingV2Callbacks {
        void onIntroComplete(boolean shouldShowBrokerageAccountCreation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(RewardsOnboardingIntroFragmentV2 rewardsOnboardingIntroFragmentV2, int i, Composer composer, int i2) {
        rewardsOnboardingIntroFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final RewardsOnboardingV2Callbacks getCallbacks() {
        return (RewardsOnboardingV2Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RewardsOnboardingIntroDuxo getDuxo() {
        return (RewardsOnboardingIntroDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getOnboardingContext(((Args) INSTANCE.getArgs((Fragment) this)).getAction());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger eventLogger = getEventLogger();
        Screen screen = this.loggingScreen;
        Context context = this.loggingContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT);
            context = null;
        }
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, context, 13, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(670481035);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(670481035, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2.ComposeContent (RewardsOnboardingIntroFragmentV2.kt:66)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState = RewardsOnboardingIntroViewState.BrokerageAccountState.HAS_ACCOUNT;
            RewardsOnboardingV2Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsOnboardingIntroFragmentV2.ComposeContent$lambda$2$lambda$1(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Args args = (Args) INSTANCE.getArgs((Fragment) this);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            ImmutableList immutableList = extensions2.toImmutableList(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getOnboardingSteps());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsOnboardingIntroFragmentV2.ComposeContent$lambda$4$lambda$3(this.f$0, (RewardsOnboardingIntroBottomSheetFragment.Args) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            RoundupOnboardingIntroComposable.RoundupOnboardingIntroComposable(brokerageAccountState, callbacks, function1, args, parentFragmentManager, immutableList, (Function1) objRememberedValue2, composerStartRestartGroup, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroFragmentV2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsOnboardingIntroFragmentV2.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(RewardsOnboardingIntroFragmentV2 rewardsOnboardingIntroFragmentV2, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Navigator navigator = rewardsOnboardingIntroFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rewardsOnboardingIntroFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(RewardsOnboardingIntroFragmentV2 rewardsOnboardingIntroFragmentV2, RewardsOnboardingIntroBottomSheetFragment.Args it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment = (RewardsOnboardingIntroBottomSheetFragment) RewardsOnboardingIntroBottomSheetFragment.INSTANCE.newInstance((Parcelable) it);
        FragmentManager childFragmentManager = rewardsOnboardingIntroFragmentV2.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rewardsOnboardingIntroBottomSheetFragment.show(childFragmentManager, "IntroLearnMore");
        return Unit.INSTANCE;
    }

    private static final RewardsOnboardingIntroViewState ComposeContent$lambda$0(SnapshotState4<RewardsOnboardingIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground1));
        }
    }

    /* compiled from: RewardsOnboardingIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Args;", "Landroid/os/Parcelable;", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "introTitleContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "introOnboardingSteps", "", "bottomDisclosure", "bonus", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Ljava/util/List;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;)V", "getAction", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$RewardsOnboarding$Action;", "getIntroTitleContent", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "getIntroOnboardingSteps", "()Ljava/util/List;", "getBottomDisclosure", "getBonus", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final LegacyIntentKey.RewardsOnboarding.Action action;
        private final RewardsOnboardingContent bonus;
        private final RewardsOnboardingContent bottomDisclosure;
        private final List<RewardsOnboardingContent> introOnboardingSteps;
        private final RewardsOnboardingContent introTitleContent;

        /* compiled from: RewardsOnboardingIntroFragmentV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LegacyIntentKey.RewardsOnboarding.Action actionValueOf = LegacyIntentKey.RewardsOnboarding.Action.valueOf(parcel.readString());
                RewardsOnboardingContent rewardsOnboardingContentCreateFromParcel = parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RewardsOnboardingContent.CREATOR.createFromParcel(parcel));
                }
                return new Args(actionValueOf, rewardsOnboardingContentCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : RewardsOnboardingContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RewardsOnboardingContent.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, List list, RewardsOnboardingContent rewardsOnboardingContent2, RewardsOnboardingContent rewardsOnboardingContent3, int i, Object obj) {
            if ((i & 1) != 0) {
                action = args.action;
            }
            if ((i & 2) != 0) {
                rewardsOnboardingContent = args.introTitleContent;
            }
            if ((i & 4) != 0) {
                list = args.introOnboardingSteps;
            }
            if ((i & 8) != 0) {
                rewardsOnboardingContent2 = args.bottomDisclosure;
            }
            if ((i & 16) != 0) {
                rewardsOnboardingContent3 = args.bonus;
            }
            RewardsOnboardingContent rewardsOnboardingContent4 = rewardsOnboardingContent3;
            List list2 = list;
            return args.copy(action, rewardsOnboardingContent, list2, rewardsOnboardingContent2, rewardsOnboardingContent4);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final RewardsOnboardingContent getIntroTitleContent() {
            return this.introTitleContent;
        }

        public final List<RewardsOnboardingContent> component3() {
            return this.introOnboardingSteps;
        }

        /* renamed from: component4, reason: from getter */
        public final RewardsOnboardingContent getBottomDisclosure() {
            return this.bottomDisclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final RewardsOnboardingContent getBonus() {
            return this.bonus;
        }

        public final Args copy(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent introTitleContent, List<RewardsOnboardingContent> introOnboardingSteps, RewardsOnboardingContent bottomDisclosure, RewardsOnboardingContent bonus) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(introOnboardingSteps, "introOnboardingSteps");
            return new Args(action, introTitleContent, introOnboardingSteps, bottomDisclosure, bonus);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.action == args.action && Intrinsics.areEqual(this.introTitleContent, args.introTitleContent) && Intrinsics.areEqual(this.introOnboardingSteps, args.introOnboardingSteps) && Intrinsics.areEqual(this.bottomDisclosure, args.bottomDisclosure) && Intrinsics.areEqual(this.bonus, args.bonus);
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            RewardsOnboardingContent rewardsOnboardingContent = this.introTitleContent;
            int iHashCode2 = (((iHashCode + (rewardsOnboardingContent == null ? 0 : rewardsOnboardingContent.hashCode())) * 31) + this.introOnboardingSteps.hashCode()) * 31;
            RewardsOnboardingContent rewardsOnboardingContent2 = this.bottomDisclosure;
            int iHashCode3 = (iHashCode2 + (rewardsOnboardingContent2 == null ? 0 : rewardsOnboardingContent2.hashCode())) * 31;
            RewardsOnboardingContent rewardsOnboardingContent3 = this.bonus;
            return iHashCode3 + (rewardsOnboardingContent3 != null ? rewardsOnboardingContent3.hashCode() : 0);
        }

        public String toString() {
            return "Args(action=" + this.action + ", introTitleContent=" + this.introTitleContent + ", introOnboardingSteps=" + this.introOnboardingSteps + ", bottomDisclosure=" + this.bottomDisclosure + ", bonus=" + this.bonus + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.action.name());
            RewardsOnboardingContent rewardsOnboardingContent = this.introTitleContent;
            if (rewardsOnboardingContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent.writeToParcel(dest, flags);
            }
            List<RewardsOnboardingContent> list = this.introOnboardingSteps;
            dest.writeInt(list.size());
            Iterator<RewardsOnboardingContent> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            RewardsOnboardingContent rewardsOnboardingContent2 = this.bottomDisclosure;
            if (rewardsOnboardingContent2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent2.writeToParcel(dest, flags);
            }
            RewardsOnboardingContent rewardsOnboardingContent3 = this.bonus;
            if (rewardsOnboardingContent3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardsOnboardingContent3.writeToParcel(dest, flags);
            }
        }

        public Args(LegacyIntentKey.RewardsOnboarding.Action action, RewardsOnboardingContent rewardsOnboardingContent, List<RewardsOnboardingContent> introOnboardingSteps, RewardsOnboardingContent rewardsOnboardingContent2, RewardsOnboardingContent rewardsOnboardingContent3) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(introOnboardingSteps, "introOnboardingSteps");
            this.action = action;
            this.introTitleContent = rewardsOnboardingContent;
            this.introOnboardingSteps = introOnboardingSteps;
            this.bottomDisclosure = rewardsOnboardingContent2;
            this.bonus = rewardsOnboardingContent3;
        }

        public final LegacyIntentKey.RewardsOnboarding.Action getAction() {
            return this.action;
        }

        public final RewardsOnboardingContent getIntroTitleContent() {
            return this.introTitleContent;
        }

        public final List<RewardsOnboardingContent> getIntroOnboardingSteps() {
            return this.introOnboardingSteps;
        }

        public final RewardsOnboardingContent getBottomDisclosure() {
            return this.bottomDisclosure;
        }

        public final RewardsOnboardingContent getBonus() {
            return this.bonus;
        }
    }

    /* compiled from: RewardsOnboardingIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Args;", "<init>", "()V", "BONUS_PERCENTAGE_PLACEHOLDER", "", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOnboardingIntroFragmentV2, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsOnboardingIntroFragmentV2 rewardsOnboardingIntroFragmentV2) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOnboardingIntroFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOnboardingIntroFragmentV2 newInstance(Args args) {
            return (RewardsOnboardingIntroFragmentV2) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOnboardingIntroFragmentV2 rewardsOnboardingIntroFragmentV2, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOnboardingIntroFragmentV2, args);
        }
    }
}
