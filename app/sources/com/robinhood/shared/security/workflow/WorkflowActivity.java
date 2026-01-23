package com.robinhood.shared.security.workflow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.shared.security.contracts.WorkflowIntentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowCallbacks;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.security.workflow.WorkflowActivity;
import com.robinhood.shared.security.workflow.WorkflowEvent;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: WorkflowActivity.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowCallbacks;", "Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/security/workflow/WorkflowDuxo;", "getDuxo", "()Lcom/robinhood/shared/security/workflow/WorkflowDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finishWithRequest", "action", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreenAction;", "screen", "Lcom/robinhood/models/workflow/ui/screens/UiWorkflowScreen;", "onDialogDismissed", "id", "", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/workflow/WorkflowEvent;", "Companion", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class WorkflowActivity extends BaseActivity implements WorkflowCallbacks, BaseDialogFragment.OnDismissListener {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public WorkflowActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, WorkflowDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WorkflowDuxo getDuxo() {
        return (WorkflowDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<WorkflowEvent> event) {
        EventConsumer<WorkflowEvent> eventConsumerInvoke;
        EventConsumer<WorkflowEvent> eventConsumerInvoke2;
        EventConsumer<WorkflowEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof WorkflowEvent.Replace) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.security.workflow.WorkflowActivity$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25692invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25692invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    WorkflowEvent.Replace replace = (WorkflowEvent.Replace) event.getData();
                    UiWorkflowScreen screen = replace.getScreen();
                    WorkflowActivity.Companion companion = WorkflowActivity.INSTANCE;
                    FragmentKey fragmentKey = WorkflowScreens.toFragmentKey(screen, ((WorkflowIntentKey) companion.getExtras((Activity) this)).getId());
                    if (fragmentKey != null) {
                        Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(this.getNavigator(), fragmentKey, null, 2, null);
                        if (replace.getAnimate()) {
                            this.replaceFragment(fragmentCreateFragment$default);
                            return;
                        } else {
                            this.replaceFragmentWithoutAnimation(fragmentCreateFragment$default);
                            return;
                        }
                    }
                    WorkflowActivity workflowActivity = this;
                    CrashReporter.INSTANCE.reportNonFatal(new IllegalArgumentException("Unknown screen name"), false, new EventMetadata(SentryTeam.AUTH_AND_SAFETY, null, MapsKt.mapOf(Tuples4.m3642to("workflowId", ((WorkflowIntentKey) companion.getExtras((Activity) workflowActivity)).getId()), Tuples4.m3642to("blockId", replace.getScreen().getBlockId())), 2, null));
                    RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(workflowActivity).setId(C39756R.id.dialog_id_unknown_screen).setUseDesignSystemOverlay(true).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(C11048R.string.general_error_summary, new Object[0]);
                    FragmentManager supportFragmentManager = workflowActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    RhDialogFragment.Builder.show$default(message, supportFragmentManager, "workflowError", false, 4, null);
                }
            });
        }
        if ((event.getData() instanceof WorkflowEvent.Exit) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.security.workflow.WorkflowActivity$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25693invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25693invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    NavigationActivityResultContract3.finishWithResult$default(this, ((WorkflowEvent.Exit) event.getData()).getStatus(), 0, 2, null);
                }
            });
        }
        if (!(event.getData() instanceof WorkflowEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.security.workflow.WorkflowActivity$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25694invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25694invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                WorkflowErrorResponses.handleWorkflowError(this, ((WorkflowEvent.Error) event.getData()).getThrowable(), C39756R.id.dialog_id_workflow_error);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShimmerLoadingFragment.Args.NavButtonType navButtonType = null;
        Object[] objArr = 0;
        if (savedInstanceState == null) {
            getDuxo().loadWorkflow();
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Generic(false, 1, null), navButtonType, 2, objArr == true ? 1 : 0)));
        }
        BaseActivity.collectDuxoState$default(this, null, new C397601(null), 1, null);
    }

    /* compiled from: WorkflowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.WorkflowActivity$onCreate$1", m3645f = "WorkflowActivity.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.security.workflow.WorkflowActivity$onCreate$1 */
    static final class C397601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C397601(Continuation<? super C397601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorkflowActivity.this.new C397601(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WorkflowActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.security.workflow.WorkflowActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ WorkflowActivity $tmp0;

            AnonymousClass1(WorkflowActivity workflowActivity) {
                this.$tmp0 = workflowActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, WorkflowActivity.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<WorkflowEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C397601.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<WorkflowEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(WorkflowActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WorkflowActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(WorkflowActivity workflowActivity, Event event, Continuation continuation) {
            workflowActivity.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.security.lib.workflow.WorkflowCallbacks
    public void finishWithRequest(UiWorkflowScreenAction action, UiWorkflowScreen screen) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screen, "screen");
        getDuxo().sendFinishingRequest(action, screen);
        NavigationActivityResultContract3.finishWithResult$default(this, UiWorkflowStatus.DENIED, 0, 2, null);
    }

    @Override // com.robinhood.android.common.ui.BaseDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C39756R.id.dialog_id_unknown_screen || id == C39756R.id.dialog_id_workflow_error) {
            finish();
        }
    }

    /* compiled from: WorkflowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/security/workflow/WorkflowActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/security/workflow/WorkflowActivity;", "Lcom/robinhood/shared/security/contracts/WorkflowIntentKey;", "<init>", "()V", "feature-workflow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<WorkflowActivity, WorkflowIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public WorkflowIntentKey getExtras(WorkflowActivity workflowActivity) {
            return (WorkflowIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, workflowActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, WorkflowIntentKey workflowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, workflowIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, WorkflowIntentKey workflowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, workflowIntentKey);
        }
    }
}
