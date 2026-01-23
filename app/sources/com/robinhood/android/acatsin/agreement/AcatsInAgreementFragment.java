package com.robinhood.android.acatsin.agreement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementContract;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementEvent;
import com.robinhood.android.acatsin.agreement.AcatsInAgreementViewState;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.acatsin.util.RhToolbars;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006,²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "flow", "Lcom/robinhood/android/acatsin/util/AcatsFlow;", "getFlow", "()Lcom/robinhood/android/acatsin/util/AcatsFlow;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementEvent;", "Companion", "lib-acats-ui_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAgreementFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(AcatsInAgreementFragment acatsInAgreementFragment, int i, Composer composer, int i2) throws Throwable {
        acatsInAgreementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public AcatsInAgreementFragment() {
        super(null, AcatsFlowStep.AGREEMENT, 1, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAgreementContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInAgreementContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, AcatsInAgreementDuxo.class);
    }

    private final AcatsInAgreementContract.Callbacks getCallbacks() {
        return (AcatsInAgreementContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2, com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment
    public AcatsFlowStep2 getFlow() {
        return ((AcatsInAgreementContract.Key) INSTANCE.getArgs((Fragment) this)).getAcatsFlow();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_TERMS_AND_CONDITIONS;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInAgreementContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInAgreementContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInAgreementContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInAgreementDuxo getDuxo() {
        return (AcatsInAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-698075966);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-698075966, i2, -1, "com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment.ComposeContent (AcatsInAgreementFragment.kt:50)");
            }
            AcatsInAgreementViewState acatsInAgreementViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (acatsInAgreementViewStateComposeContent$lambda$0 instanceof AcatsInAgreementViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-836098245);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), true, true, 0, composerStartRestartGroup, 432, 8);
                composerStartRestartGroup.endReplaceGroup();
            } else if (acatsInAgreementViewStateComposeContent$lambda$0 instanceof AcatsInAgreementViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-148996700);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                AcatsInAgreementViewState.Loaded loaded = (AcatsInAgreementViewState.Loaded) acatsInAgreementViewStateComposeContent$lambda$0;
                com.robinhood.rosetta.eventlogging.Context screenEventContext = getScreenEventContext();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsInAgreementFragment.ComposeContent$lambda$2$lambda$1(this.f$0, (List) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAgreementFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AcatsInAgreementComposable.AcatsInAgreementComposable(loaded, screenEventContext, function1, (Function0) objRememberedValue2, modifierNavigationBarsPadding, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(acatsInAgreementViewStateComposeContent$lambda$0 instanceof AcatsInAgreementViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-836100056);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-836073096);
                composerStartRestartGroup.endReplaceGroup();
                ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((AcatsInAgreementViewState.Error) acatsInAgreementViewStateComposeContent$lambda$0).getThrowable(), true, false, 0, null, 56, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAgreementFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(AcatsInAgreementFragment acatsInAgreementFragment, List list) {
        acatsInAgreementFragment.getCallbacks().onSlipAgreementsUpdated(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(AcatsInAgreementFragment acatsInAgreementFragment) {
        acatsInAgreementFragment.getDuxo().signAgreement();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (((AcatsInAgreementContract.Key) INSTANCE.getArgs((Fragment) this)).isAcatsRetry()) {
            RhToolbars.setCenteredTitle(toolbar, C7686R.string.agreement_title_retry);
        } else {
            super.configureToolbar(toolbar);
        }
    }

    private static final AcatsInAgreementViewState ComposeContent$lambda$0(SnapshotState4<? extends AcatsInAgreementViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: AcatsInAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$onViewCreated$1", m3645f = "AcatsInAgreementFragment.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$onViewCreated$1 */
    static final class C77701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77701(Continuation<? super C77701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAgreementFragment.this.new C77701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInAgreementEvent>> eventFlow = AcatsInAgreementFragment.this.getDuxo().getEventFlow();
                final AcatsInAgreementFragment acatsInAgreementFragment = AcatsInAgreementFragment.this;
                FlowCollector<? super Event<AcatsInAgreementEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInAgreementEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsInAgreementEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInAgreementEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInAgreementFragment acatsInAgreementFragment2 = acatsInAgreementFragment;
                            if ((event.getData() instanceof AcatsInAgreementEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.agreement.AcatsInAgreementFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                        m10699invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10699invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInAgreementFragment2.handleEvent((AcatsInAgreementEvent) event.getData());
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C77701(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AcatsInAgreementEvent event) throws Throwable {
        if (event instanceof AcatsInAgreementEvent.AgreementSigned) {
            getCallbacks().onAgreementAccepted();
        } else {
            if (!(event instanceof AcatsInAgreementEvent.AgreementError)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, ((AcatsInAgreementEvent.AgreementError) event).getError(), false, false, 0, null, 60, null);
        }
    }

    /* compiled from: AcatsInAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementFragment;", "Lcom/robinhood/android/acatsin/agreement/AcatsInAgreementContract$Key;", "<init>", "()V", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInAgreementFragment, AcatsInAgreementContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInAgreementContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInAgreementContract.Key getArgs(AcatsInAgreementFragment acatsInAgreementFragment) {
            return (AcatsInAgreementContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInAgreementFragment newInstance(AcatsInAgreementContract.Key key) {
            return (AcatsInAgreementFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInAgreementFragment acatsInAgreementFragment, AcatsInAgreementContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInAgreementFragment, key);
        }
    }
}
