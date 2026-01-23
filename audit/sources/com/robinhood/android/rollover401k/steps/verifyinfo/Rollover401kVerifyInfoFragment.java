package com.robinhood.android.rollover401k.steps.verifyinfo;

import android.net.Uri;
import android.os.Bundle;
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
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoDuxo;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.ExceptionsH;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: Rollover401kVerifyInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001(B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\t\u0010\"\u001a\u00020\u000eH\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackTapped", "onSubmitInfo", "consumeEvents", "event", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoDuxo$RolloverVerifyInfoEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rollover-401k_externalDebug", "viewState", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class Rollover401kVerifyInfoFragment extends GenericActionHandlingFragment implements Rollover401kVerifyInfoScreen, RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, Rollover401kVerifyInfoDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment, int i, Composer composer, int i2) {
        rollover401kVerifyInfoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rollover401kVerifyInfoDuxo getDuxo() {
        return (Rollover401kVerifyInfoDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RETIREMENT_401K_ROLLOVER_VERIFY_INFO, null, null, null, 14, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1550075710);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1550075710, i2, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent (Rollover401kVerifyInfoFragment.kt:37)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1454666573, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1454666573, i3, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.<anonymous> (Rollover401kVerifyInfoFragment.kt:43)");
                    }
                    final Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment = Rollover401kVerifyInfoFragment.this;
                    final SnapshotState4<Rollover401kVerifyInfoViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1055171006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(1055171006, i4, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.<anonymous>.<anonymous> (Rollover401kVerifyInfoFragment.kt:44)");
                            }
                            final Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment2 = rollover401kVerifyInfoFragment;
                            final SnapshotState4<Rollover401kVerifyInfoViewState> snapshotState42 = snapshotState4;
                            ActionHandlingFragment2.ContentWithDialog(rollover401kVerifyInfoFragment2, ComposableLambda3.rememberComposableLambda(-1154457958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.1.1.1
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
                                        ComposerKt.traceEventStart(-1154457958, i5, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (Rollover401kVerifyInfoFragment.kt:45)");
                                    }
                                    Rollover401kVerifyInfoScreen2.Rollover401kVerifyInfoScreen(Rollover401kVerifyInfoFragment.ComposeContent$lambda$0(snapshotState42), rollover401kVerifyInfoFragment2, null, composer4, 0, 4);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kVerifyInfoFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C277841(null), 1, null);
    }

    /* compiled from: Rollover401kVerifyInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$onViewCreated$1", m3645f = "Rollover401kVerifyInfoFragment.kt", m3646l = {59}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$onViewCreated$1 */
    static final class C277841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277841(Continuation<? super C277841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kVerifyInfoFragment.this.new C277841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent>> eventFlow = Rollover401kVerifyInfoFragment.this.getDuxo().getEventFlow();
                final Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment = Rollover401kVerifyInfoFragment.this;
                FlowCollector<? super Event<Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent> eventConsumerInvoke;
                        if (event != null) {
                            final Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment2 = rollover401kVerifyInfoFragment;
                            if ((event.getData() instanceof Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m18458invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18458invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        rollover401kVerifyInfoFragment2.consumeEvents((Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreen
    public void onBackTapped() {
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreen
    public void onSubmitInfo() {
        getDuxo().submitUserInfo();
    }

    /* compiled from: Rollover401kVerifyInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$consumeEvents$1", m3645f = "Rollover401kVerifyInfoFragment.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoFragment$consumeEvents$1 */
    static final class C277831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C277831(Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent rolloverVerifyInfoEvent, Continuation<? super C277831> continuation) {
            super(2, continuation);
            this.$event = rolloverVerifyInfoEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Rollover401kVerifyInfoFragment.this.new C277831(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Navigator navigator = Rollover401kVerifyInfoFragment.this.getNavigator();
                android.content.Context contextRequireContext = Rollover401kVerifyInfoFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Uri uri = Uri.parse(((Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent.NavigateForward) this.$event).getDeeplink());
                this.label = 1;
                if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, this, 28, null) == coroutine_suspended) {
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
    public final void consumeEvents(Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent event) throws Throwable {
        if (event instanceof Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent.NavigateForward) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277831(event, null), 3, null);
        } else {
            if (!(event instanceof Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent.NetworkError)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((Rollover401kVerifyInfoDuxo.RolloverVerifyInfoEvent.NetworkError) event).getThrowable(), false, false, 0, null, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rollover401kVerifyInfoViewState ComposeContent$lambda$0(SnapshotState4<Rollover401kVerifyInfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: Rollover401kVerifyInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoFragment;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<Rollover401kVerifyInfoFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((Rollover401kVerifyInfoFragment) fragment);
        }

        public Void getArgs(Rollover401kVerifyInfoFragment rollover401kVerifyInfoFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, rollover401kVerifyInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kVerifyInfoFragment newInstance() {
            return (Rollover401kVerifyInfoFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public Rollover401kVerifyInfoFragment newInstance(Void r1) {
            return (Rollover401kVerifyInfoFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
