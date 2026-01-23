package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.view.compose.ComponentActivity6;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.directdeposit.p101ui.DirectDepositSetupActivity;
import com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentDuxo2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.transfers.contracts.DirectDepositBrokerageExperimentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.serverdriven.experimental.api.DirectDepositToBrokeragePageAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DirectDepositBrokerageExperimentActivity.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositBrokerageExperimentActivity extends BaseActivity implements RhDialogFragment.OnDismissListener {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DirectDepositBrokerageExperimentDuxo.class);
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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
    public final DirectDepositBrokerageExperimentDuxo getDuxo() {
        return (DirectDepositBrokerageExperimentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View viewFindViewById = findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(viewFindViewById, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, new Screen(Screen.Name.DIRECT_DEPOSIT_HUB, null, null, null, 14, null), null, null, null, 29, null);
        BaseActivity.collectDuxoState$default(this, null, new C140541(null), 1, null);
        BaseActivity.collectDuxoState$default(this, null, new C140552(null), 1, null);
    }

    /* compiled from: DirectDepositBrokerageExperimentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$1", m3645f = "DirectDepositBrokerageExperimentActivity.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$1 */
    static final class C140541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C140541(Continuation<? super C140541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositBrokerageExperimentActivity.this.new C140541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DirectDepositBrokerageExperimentViewState> stateFlow = DirectDepositBrokerageExperimentActivity.this.getDuxo().getStateFlow();
                final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity = DirectDepositBrokerageExperimentActivity.this;
                FlowCollector<? super DirectDepositBrokerageExperimentViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((DirectDepositBrokerageExperimentViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState, Continuation<? super Unit> continuation) {
                        final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity2 = directDepositBrokerageExperimentActivity;
                        ComponentActivity6.setContent$default(directDepositBrokerageExperimentActivity2, null, ComposableLambda3.composableLambdaInstance(377032562, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i2) {
                                if ((i2 & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(377032562, i2, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentActivity.kt:44)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.DIRECT_DEPOSIT_HUB, null, null, null, 14, null), null, null, null, null, 61, null);
                                final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity3 = directDepositBrokerageExperimentActivity2;
                                final DirectDepositBrokerageExperimentViewState directDepositBrokerageExperimentViewState2 = directDepositBrokerageExperimentViewState;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-1137980569, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.1.1.1.1
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
                                            ComposerKt.traceEventStart(-1137980569, i3, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DirectDepositBrokerageExperimentActivity.kt:49)");
                                        }
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer2.changedInstance(directDepositBrokerageExperimentActivity3);
                                        final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity4 = directDepositBrokerageExperimentActivity3;
                                        Object objRememberedValue = composer2.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$1$1$1$1$1$1
                                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                                public final boolean mo15941handle(DirectDepositToBrokeragePageAction action) {
                                                    Intrinsics.checkNotNullParameter(action, "action");
                                                    return DirectDepositToBrokeragePageActionExtensions.handleDirectDepositAction(directDepositBrokerageExperimentActivity4, action);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        DirectDepositBrokerageExperimentPage4.DirectDepositBrokerageExperimentPage(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(directDepositBrokerageExperimentActivity3)), directDepositBrokerageExperimentActivity3.getOnBackPressedDispatcher(), directDepositBrokerageExperimentViewState2, null, (SduiActionHandler) objRememberedValue, composer2, 0, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: DirectDepositBrokerageExperimentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$2", m3645f = "DirectDepositBrokerageExperimentActivity.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$2 */
    static final class C140552 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C140552(Continuation<? super C140552> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositBrokerageExperimentActivity.this.new C140552(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C140552) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<DirectDepositBrokerageExperimentDuxo2>> eventFlow = DirectDepositBrokerageExperimentActivity.this.getDuxo().getEventFlow();
                final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity = DirectDepositBrokerageExperimentActivity.this;
                FlowCollector<? super Event<DirectDepositBrokerageExperimentDuxo2>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<DirectDepositBrokerageExperimentDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<DirectDepositBrokerageExperimentDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<DirectDepositBrokerageExperimentDuxo2> eventConsumerInvoke;
                        if (event != null) {
                            final DirectDepositBrokerageExperimentActivity directDepositBrokerageExperimentActivity2 = directDepositBrokerageExperimentActivity;
                            if ((event.getData() instanceof DirectDepositBrokerageExperimentDuxo2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.DirectDepositBrokerageExperimentActivity$onCreate$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m13308invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m13308invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if (!(((DirectDepositBrokerageExperimentDuxo2) event.getData()) instanceof DirectDepositBrokerageExperimentDuxo2.ShowError)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(directDepositBrokerageExperimentActivity2).setMessage(C11048R.string.error_description, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]);
                                        FragmentManager supportFragmentManager = directDepositBrokerageExperimentActivity2.getSupportFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "error", false, 4, null);
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

    /* compiled from: DirectDepositBrokerageExperimentActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/ddbrokerageexperiment/DirectDepositBrokerageExperimentActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/directdeposit/ui/DirectDepositSetupActivity;", "Lcom/robinhood/android/transfers/contracts/DirectDepositBrokerageExperimentKey;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DirectDepositSetupActivity, DirectDepositBrokerageExperimentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DirectDepositBrokerageExperimentKey getExtras(DirectDepositSetupActivity directDepositSetupActivity) {
            return (DirectDepositBrokerageExperimentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, directDepositSetupActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DirectDepositBrokerageExperimentKey directDepositBrokerageExperimentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, directDepositBrokerageExperimentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, DirectDepositBrokerageExperimentKey directDepositBrokerageExperimentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, directDepositBrokerageExperimentKey);
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        finish();
    }
}
