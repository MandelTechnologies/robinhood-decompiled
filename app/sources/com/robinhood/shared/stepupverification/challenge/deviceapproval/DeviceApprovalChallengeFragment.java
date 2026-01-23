package com.robinhood.shared.stepupverification.challenge.deviceapproval;

import android.content.Context;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.workflow.p358ui.screens.DeviceApprovalChallengeScreen;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeViewState;
import com.robinhood.shared.security.contracts.DeviceApprovalChallengeFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowCallbacks;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeEvent;
import com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DeviceApprovalChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010 \u001a\u00020!H\u0017¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "getDuxo", "()Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "handleEvent", "event", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeEvent;", "Companion", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DeviceApprovalChallengeFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeviceApprovalChallengeFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DeviceApprovalChallengeDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(WorkflowCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof WorkflowCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.WORKFLOW_DEVICE_APPROVAL_CHALLENGE, null, null, null, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(DeviceApprovalChallengeFragment deviceApprovalChallengeFragment, int i, Composer composer, int i2) {
        deviceApprovalChallengeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceApprovalChallengeDuxo getDuxo() {
        return (DeviceApprovalChallengeDuxo) this.duxo.getValue();
    }

    private final WorkflowCallbacks getCallbacks() {
        return (WorkflowCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        String string2 = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((Fragment) this)).getWorkflowId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String name = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getName();
        String string3 = ((DeviceApprovalChallengeFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getBlockId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new StepUpVerificationContext(null, string2, name, string3, String.valueOf(((DeviceApprovalChallengeFragmentKey) companion.getArgs((Fragment) this)).getWorkflowScreen().getLoggingIdentifier()), null, null, 97, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -262145, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<DeviceApprovalChallengeEvent> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(919756091);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919756091, i2, -1, "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment.ComposeContent (DeviceApprovalChallengeFragment.kt:47)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<DeviceApprovalChallengeEvent>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DeviceApprovalChallengeFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof DeviceApprovalChallengeEvent) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<DeviceApprovalChallengeEvent> value = eventFlow.getValue();
            Event<DeviceApprovalChallengeEvent> event = value;
            if (!((event != null ? event.getData() : null) instanceof DeviceApprovalChallengeEvent)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<DeviceApprovalChallengeEvent> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof DeviceApprovalChallengeEvent) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25704invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25704invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.handleEvent((DeviceApprovalChallengeEvent) eventComposeContent$lambda$1.getData());
                    }
                });
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-328573370, true, new C398182(snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceApprovalChallengeFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: DeviceApprovalChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$2 */
    static final class C398182 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<DeviceApprovalChallengeViewState> $viewState$delegate;

        C398182(SnapshotState4<DeviceApprovalChallengeViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328573370, i, -1, "com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment.ComposeContent.<anonymous> (DeviceApprovalChallengeFragment.kt:53)");
            }
            DeviceApprovalChallengeViewState deviceApprovalChallengeViewStateComposeContent$lambda$0 = DeviceApprovalChallengeFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(DeviceApprovalChallengeFragment.this);
            final DeviceApprovalChallengeFragment deviceApprovalChallengeFragment = DeviceApprovalChallengeFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceApprovalChallengeFragment.C398182.invoke$lambda$1$lambda$0(deviceApprovalChallengeFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(DeviceApprovalChallengeFragment.this);
            final DeviceApprovalChallengeFragment deviceApprovalChallengeFragment2 = DeviceApprovalChallengeFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceApprovalChallengeFragment.C398182.invoke$lambda$3$lambda$2(deviceApprovalChallengeFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.deviceapproval.DeviceApprovalChallengeFragment$ComposeContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            DeviceApprovalChallengeComposable.DeviceApprovalChallengeComposable(deviceApprovalChallengeViewStateComposeContent$lambda$0, function0, function02, (Function0) objRememberedValue3, null, composer, DeviceApprovalChallengeViewState.$stable | 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DeviceApprovalChallengeFragment deviceApprovalChallengeFragment) {
            EventLogger.DefaultImpls.logTap$default(deviceApprovalChallengeFragment.getEventLogger(), UserInteractionEventData.Action.RESEND_CHALLENGE, deviceApprovalChallengeFragment.getEventScreen(), null, null, deviceApprovalChallengeFragment.getScreenEventContext(), false, 44, null);
            deviceApprovalChallengeFragment.getDuxo().resendNotification();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(DeviceApprovalChallengeFragment deviceApprovalChallengeFragment) {
            EventLogger.DefaultImpls.logTap$default(deviceApprovalChallengeFragment.getEventLogger(), UserInteractionEventData.Action.CHALLENGE_FALLBACK, deviceApprovalChallengeFragment.getEventScreen(), null, null, deviceApprovalChallengeFragment.getScreenEventContext(), false, 44, null);
            deviceApprovalChallengeFragment.getDuxo().onSecondaryCtaClicked();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.BACK, getEventScreen(), null, null, getScreenEventContext(), false, 44, null);
        getCallbacks().finishWithRequest(DeviceApprovalChallengeScreen.Action.CustomerAbandon.INSTANCE, ((DeviceApprovalChallengeFragmentKey) INSTANCE.getArgs((Fragment) this)).getWorkflowScreen());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceApprovalChallengeViewState ComposeContent$lambda$0(SnapshotState4<DeviceApprovalChallengeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<DeviceApprovalChallengeEvent> ComposeContent$lambda$1(SnapshotState4<Event<DeviceApprovalChallengeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(DeviceApprovalChallengeEvent event) {
        if (!(event instanceof DeviceApprovalChallengeEvent.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        WorkflowErrorResponses.handleWorkflowError$default(fragmentActivityRequireActivity, ((DeviceApprovalChallengeEvent.Error) event).getThrowable(), 0, 2, null);
    }

    /* compiled from: DeviceApprovalChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeFragment;", "Lcom/robinhood/shared/security/contracts/DeviceApprovalChallengeFragmentKey;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DeviceApprovalChallengeFragment, DeviceApprovalChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(DeviceApprovalChallengeFragmentKey deviceApprovalChallengeFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, deviceApprovalChallengeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DeviceApprovalChallengeFragmentKey getArgs(DeviceApprovalChallengeFragment deviceApprovalChallengeFragment) {
            return (DeviceApprovalChallengeFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, deviceApprovalChallengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DeviceApprovalChallengeFragment newInstance(DeviceApprovalChallengeFragmentKey deviceApprovalChallengeFragmentKey) {
            return (DeviceApprovalChallengeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, deviceApprovalChallengeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DeviceApprovalChallengeFragment deviceApprovalChallengeFragment, DeviceApprovalChallengeFragmentKey deviceApprovalChallengeFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, deviceApprovalChallengeFragment, deviceApprovalChallengeFragmentKey);
        }
    }
}
