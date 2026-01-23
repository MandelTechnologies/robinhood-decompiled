package com.robinhood.android.retirement.onboarding.submit;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementIneligibleBottomSheetKey;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.lib.RetirementFlowDeeplinkExitManager;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitEvent;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkOrDismissAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RetirementSignUpFlowSubmitFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003:;<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0016J\r\u0010,\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\b\u00100\u001a\u00020\u001cH\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0016J\t\u00104\u001a\u00020+H\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006=²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/retirement/onboarding/submit/SubmitScreenCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "duxo", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onDialogDismissed", "", "id", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "consumeEvent", "event", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitEvent;", "onBackPressed", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "contactSupport", "onCloseClick", "refresh", "continueOnSuccess", "state", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$Success;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-retirement-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowSubmitFragment extends GenericComposeFragment implements AutoLoggableFragment, SubmitScreenCallbacks, RegionGated {
    public static final int $stable = 0;
    private static final String INELIGIBLE_ALERT_TAG = "ineligible_alert";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFlowSubmitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    private final Screen eventScreen = new Screen(Screen.Name.RETIREMENT_SIGNUP_LOADING, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementSignUpFlowSubmitDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: RetirementSignUpFlowSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Callbacks;", "", "onAccountSubmitError", "", "onSignUpComplete", "accountNumber", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAccountSubmitError();

        void onSignUpComplete(String accountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment, int i, Composer composer, int i2) {
        retirementSignUpFlowSubmitFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementSignUpFlowSubmitDuxo getDuxo() {
        return (RetirementSignUpFlowSubmitDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onAccountSubmitError();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C271441(null), 1, null);
    }

    /* compiled from: RetirementSignUpFlowSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment$onViewCreated$1", m3645f = "RetirementSignUpFlowSubmitFragment.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment$onViewCreated$1 */
    static final class C271441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C271441(Continuation<? super C271441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementSignUpFlowSubmitFragment.this.new C271441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RetirementSignUpFlowSubmitFragment.this.getDuxo().getEventFlow());
                final RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment = RetirementSignUpFlowSubmitFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementSignupSubmitEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementSignupSubmitEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementSignupSubmitEvent> eventConsumerInvoke;
                        final RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment2 = retirementSignUpFlowSubmitFragment;
                        if ((event.getData() instanceof RetirementSignupSubmitEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m18189invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18189invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    retirementSignUpFlowSubmitFragment2.consumeEvent((RetirementSignupSubmitEvent) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementSignupSubmitViewState ComposeContent$lambda$0(SnapshotState4<? extends RetirementSignupSubmitViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeEvent(RetirementSignupSubmitEvent event) throws Throwable {
        if (event instanceof RetirementSignupSubmitEvent.Ineligible) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new RetirementIneligibleBottomSheetKey(((RetirementSignupSubmitEvent.Ineligible) event).getBottomSheet(), getEventScreen(), true), null, 2, null).show(getChildFragmentManager(), INELIGIBLE_ALERT_TAG);
        } else {
            if (!(event instanceof RetirementSignupSubmitEvent.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((RetirementSignupSubmitEvent.Error) event).getCause(), true, false, 0, null, 56, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1228085659);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1228085659, i2, -1, "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent (RetirementSignUpFlowSubmitFragment.kt:111)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(574655517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(574655517, i3, -1, "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.<anonymous> (RetirementSignUpFlowSubmitFragment.kt:114)");
                    }
                    final RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment = RetirementSignUpFlowSubmitFragment.this;
                    final SnapshotState4<RetirementSignupSubmitViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1809982376, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1809982376, i4, -1, "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.<anonymous>.<anonymous> (RetirementSignUpFlowSubmitFragment.kt:115)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, retirementSignUpFlowSubmitFragment.getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null);
                            final RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment2 = retirementSignUpFlowSubmitFragment;
                            final SnapshotState4<RetirementSignupSubmitViewState> snapshotState42 = snapshotState4;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(41750291, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(41750291, i5, -1, "com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RetirementSignUpFlowSubmitFragment.kt:121)");
                                    }
                                    RetirementSignUpFlowSubmitContentKt.SubmitScreen(RetirementSignUpFlowSubmitFragment.ComposeContent$lambda$0(snapshotState42), retirementSignUpFlowSubmitFragment2, null, composer4, 0, 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.SubmitScreenCallbacks
    public void contactSupport() {
        requireActivity().finish();
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, null, false, 6, null);
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.SubmitScreenCallbacks
    public void onCloseClick() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.SubmitScreenCallbacks
    public void refresh() {
        getDuxo().submitAndPoll();
    }

    @Override // com.robinhood.android.retirement.onboarding.submit.SubmitScreenCallbacks
    public void continueOnSuccess(RetirementSignupSubmitViewState.Success state) {
        Intrinsics.checkNotNullParameter(state, "state");
        DeeplinkOrDismissAction button_action = state.getResponse().getEnd_view_model().getButton_action();
        if (!(button_action instanceof DeeplinkOrDismissAction.Dismiss)) {
            if (!(button_action instanceof DeeplinkOrDismissAction.Deeplink)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!state.getIgnoreExitDeepLink()) {
                RetirementFlowDeeplinkExitManager.INSTANCE.setRetirementSignUpFlowExitedByDeeplink(Boolean.TRUE);
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((DeeplinkOrDismissAction.Deeplink) button_action).getValue2().getUri()), null, null, false, null, 60, null);
            }
        }
        getCallbacks().onSignUpComplete(state.getResponse().getAccount_number());
    }

    /* compiled from: RetirementSignUpFlowSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JG\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Args;", "Landroid/os/Parcelable;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "ignoreExitDeepLink", "", "entryPoint", "", "refId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;ZLjava/lang/String;Ljava/util/UUID;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getSignedAgreements", "()Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "getIgnoreExitDeepLink", "()Z", "getEntryPoint", "()Ljava/lang/String;", "getRefId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final String entryPoint;
        private final boolean ignoreExitDeepLink;
        private final ManagementType managementType;
        private final UUID refId;
        private final RetirementSignUpFlowSignedAgreements signedAgreements;

        /* compiled from: RetirementSignUpFlowSubmitFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(BrokerageAccountType.valueOf(parcel.readString()), ManagementType.valueOf(parcel.readString()), RetirementSignUpFlowSignedAgreements.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, ManagementType managementType, RetirementSignUpFlowSignedAgreements retirementSignUpFlowSignedAgreements, boolean z, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.accountType;
            }
            if ((i & 2) != 0) {
                managementType = args.managementType;
            }
            if ((i & 4) != 0) {
                retirementSignUpFlowSignedAgreements = args.signedAgreements;
            }
            if ((i & 8) != 0) {
                z = args.ignoreExitDeepLink;
            }
            if ((i & 16) != 0) {
                str = args.entryPoint;
            }
            if ((i & 32) != 0) {
                uuid = args.refId;
            }
            String str2 = str;
            UUID uuid2 = uuid;
            return args.copy(brokerageAccountType, managementType, retirementSignUpFlowSignedAgreements, z, str2, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final ManagementType getManagementType() {
            return this.managementType;
        }

        /* renamed from: component3, reason: from getter */
        public final RetirementSignUpFlowSignedAgreements getSignedAgreements() {
            return this.signedAgreements;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getRefId() {
            return this.refId;
        }

        public final Args copy(BrokerageAccountType accountType, ManagementType managementType, RetirementSignUpFlowSignedAgreements signedAgreements, boolean ignoreExitDeepLink, String entryPoint, UUID refId) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new Args(accountType, managementType, signedAgreements, ignoreExitDeepLink, entryPoint, refId);
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
            return this.accountType == args.accountType && this.managementType == args.managementType && Intrinsics.areEqual(this.signedAgreements, args.signedAgreements) && this.ignoreExitDeepLink == args.ignoreExitDeepLink && Intrinsics.areEqual(this.entryPoint, args.entryPoint) && Intrinsics.areEqual(this.refId, args.refId);
        }

        public int hashCode() {
            int iHashCode = ((((((this.accountType.hashCode() * 31) + this.managementType.hashCode()) * 31) + this.signedAgreements.hashCode()) * 31) + Boolean.hashCode(this.ignoreExitDeepLink)) * 31;
            String str = this.entryPoint;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.refId.hashCode();
        }

        public String toString() {
            return "Args(accountType=" + this.accountType + ", managementType=" + this.managementType + ", signedAgreements=" + this.signedAgreements + ", ignoreExitDeepLink=" + this.ignoreExitDeepLink + ", entryPoint=" + this.entryPoint + ", refId=" + this.refId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
            dest.writeString(this.managementType.name());
            this.signedAgreements.writeToParcel(dest, flags);
            dest.writeInt(this.ignoreExitDeepLink ? 1 : 0);
            dest.writeString(this.entryPoint);
            dest.writeSerializable(this.refId);
        }

        public Args(BrokerageAccountType accountType, ManagementType managementType, RetirementSignUpFlowSignedAgreements signedAgreements, boolean z, String str, UUID refId) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            Intrinsics.checkNotNullParameter(signedAgreements, "signedAgreements");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.accountType = accountType;
            this.managementType = managementType;
            this.signedAgreements = signedAgreements;
            this.ignoreExitDeepLink = z;
            this.entryPoint = str;
            this.refId = refId;
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final ManagementType getManagementType() {
            return this.managementType;
        }

        public final RetirementSignUpFlowSignedAgreements getSignedAgreements() {
            return this.signedAgreements;
        }

        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final UUID getRefId() {
            return this.refId;
        }
    }

    /* compiled from: RetirementSignUpFlowSubmitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSubmitFragment$Args;", "<init>", "()V", "INELIGIBLE_ALERT_TAG", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementSignUpFlowSubmitFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowSubmitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFlowSubmitFragment newInstance(Args args) {
            return (RetirementSignUpFlowSubmitFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFlowSubmitFragment retirementSignUpFlowSubmitFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFlowSubmitFragment, args);
        }
    }
}
