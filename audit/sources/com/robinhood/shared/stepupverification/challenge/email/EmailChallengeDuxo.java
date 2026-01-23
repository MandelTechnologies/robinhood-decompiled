package com.robinhood.shared.stepupverification.challenge.email;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.workflow.p358ui.screens.EmailChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenActionResponse;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.contracts.EmailChallengeFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputUtils;
import com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo;
import com.robinhood.shared.stepupverification.challenge.email.EmailChallengeEvent;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EmailChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001%B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0017J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeViewState;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "onCreate", "", "handleKeyPress", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "resendCode", "fallback", "proceed", "submitCode", "code", "", "handleActionResult", "result", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EmailChallengeDuxo extends BaseDuxo3<EmailChallengeDataState, EmailChallengeViewState, EmailChallengeEvent> implements HasSavedState {
    public static final int CODE_LENGTH = 6;
    private Challenge challenge;
    private final ChallengeManager challengeManager;
    private final SavedStateHandle savedStateHandle;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EmailChallengeDuxo(ChallengeManager challengeManager, WorkflowManager workflowManager, SavedStateHandle savedStateHandle, EmailChallengeStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new EmailChallengeDataState(false, null, ((EmailChallengeFragmentKey) companion.getArgs(savedStateHandle)).getWorkflowScreen().getFallbackCtaText(), 3, null), stateProvider, duxoBundle);
        this.challengeManager = challengeManager;
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
        this.challenge = ((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffChallenge();
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$onCreate$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$onCreate$1 */
    static final class C398281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398281(Continuation<? super C398281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailChallengeDuxo.this.new C398281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EmailChallengeDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ EmailChallengeDuxo $tmp0;

            AnonymousClass1(EmailChallengeDuxo emailChallengeDuxo) {
                this.$tmp0 = emailChallengeDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, EmailChallengeDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C398281.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
                return objInvokeSuspend$handleActionResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleActionResult : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((WorkflowActionResult) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(EmailChallengeDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EmailChallengeDuxo.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(EmailChallengeDuxo emailChallengeDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            emailChallengeDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C398281(null));
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleKeyPress$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleKeyPress$1 */
    static final class C398271 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        final /* synthetic */ KeyEvent $event;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EmailChallengeDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398271(KeyEvent keyEvent, EmailChallengeDuxo emailChallengeDuxo, Continuation<? super C398271> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
            this.this$0 = emailChallengeDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398271 c398271 = new C398271(this.$event, this.this$0, continuation);
            c398271.L$0 = obj;
            return c398271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398271) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String inputText;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EmailChallengeDataState emailChallengeDataState = (EmailChallengeDataState) this.L$0;
            if (KeyEvents2.isDelete(this.$event) && emailChallengeDataState.getInputText().length() <= 1) {
                inputText = "";
            } else if (KeyEvents2.isDelete(this.$event)) {
                inputText = StringsKt.dropLast(emailChallengeDataState.getInputText(), 1);
            } else if ((!KeyEvents2.isDigit(this.$event) || emailChallengeDataState.getInputText().length() < 6) && KeyEvents2.isDigit(this.$event)) {
                inputText = emailChallengeDataState.getInputText() + this.$event.getNumber();
            } else {
                inputText = emailChallengeDataState.getInputText();
            }
            String str = inputText;
            if (str.length() >= 6) {
                this.this$0.submitCode(str);
            }
            return EmailChallengeDataState.copy$default(emailChallengeDataState, false, str, null, 5, null);
        }
    }

    public final void handleKeyPress(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C398271(event, this, null));
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$resendCode$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$resendCode$1 */
    static final class C398301 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398301(Continuation<? super C398301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398301 c398301 = new C398301(continuation);
            c398301.L$0 = obj;
            return c398301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398301) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, true, null, null, 6, null);
        }
    }

    public final void resendCode() {
        applyMutation(new C398301(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), EmailChallengeScreen.Action.Resend.INSTANCE, ((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$fallback$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$fallback$1 */
    static final class C398241 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398241(Continuation<? super C398241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398241 c398241 = new C398241(continuation);
            c398241.L$0 = obj;
            return c398241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398241) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, true, null, null, 6, null);
        }
    }

    public final void fallback() {
        applyMutation(new C398241(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), EmailChallengeScreen.Action.Fallback.INSTANCE, ((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$proceed$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$proceed$1 */
    static final class C398291 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398291(Continuation<? super C398291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398291 c398291 = new C398291(continuation);
            c398291.L$0 = obj;
            return c398291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398291) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, true, null, null, 6, null);
        }
    }

    public final void proceed() {
        applyMutation(new C398291(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), EmailChallengeScreen.Action.Proceed.INSTANCE, ((EmailChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1 */
    static final class C398311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398311(String str, Continuation<? super C398311> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailChallengeDuxo.this.new C398311(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EmailChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
                return ((AnonymousClass1) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, true, null, null, 6, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EmailChallengeDuxo.this.applyMutation(new AnonymousClass1(null));
                    EmailChallengeDuxo emailChallengeDuxo = EmailChallengeDuxo.this;
                    String str = this.$code;
                    Result.Companion companion = Result.INSTANCE;
                    ChallengeManager challengeManager = emailChallengeDuxo.challengeManager;
                    UUID id = emailChallengeDuxo.challenge.getId();
                    this.label = 1;
                    obj = challengeManager.submitCode(id, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((Challenge) obj);
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            EmailChallengeDuxo emailChallengeDuxo2 = EmailChallengeDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                emailChallengeDuxo2.proceed();
            }
            final EmailChallengeDuxo emailChallengeDuxo3 = EmailChallengeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                emailChallengeDuxo3.applyMutation(new EmailChallengeDuxo2(null));
                if (ChallengeCodeInputUtils.INSTANCE.handleSubmitCodeError(thM28553exceptionOrNullimpl, new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$submitCode$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return EmailChallengeDuxo.C398311.invokeSuspend$lambda$3$lambda$2(emailChallengeDuxo3, (StringResource) obj2, (StringResource) obj3);
                    }
                }, new EmailChallengeDuxo3(emailChallengeDuxo3))) {
                    return Unit.INSTANCE;
                }
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thM28553exceptionOrNullimpl);
                String displayMessage = errorResponseExtractErrorResponse != null ? errorResponseExtractErrorResponse.getDisplayMessage() : null;
                if (displayMessage != null) {
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    emailChallengeDuxo3.submit(new EmailChallengeEvent.ShowDialog(companion3.invoke(C39791R.string.challenge_dialog_error_title, new Object[0]), companion3.invoke(displayMessage), true));
                } else {
                    emailChallengeDuxo3.submit(new EmailChallengeEvent.Error(thM28553exceptionOrNullimpl));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(EmailChallengeDuxo emailChallengeDuxo, StringResource stringResource, StringResource stringResource2) {
            emailChallengeDuxo.submit(new EmailChallengeEvent.ShowDialog(stringResource, stringResource2, false, 4, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitCode(String code) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C398311(code, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        UiWorkflowScreenAction action = result.getAction();
        if (action instanceof EmailChallengeScreen.Action.Resend) {
            applyMutation(new C398251(null));
            UiWorkflowScreenActionResponse uiWorkflowScreenActionResponseConsumeScreenActionResponse = result.consumeScreenActionResponse();
            if (uiWorkflowScreenActionResponseConsumeScreenActionResponse != null) {
                this.challenge = ((EmailChallengeScreen.ActionResponse.Resend) uiWorkflowScreenActionResponseConsumeScreenActionResponse).getSheriffChallenge();
                StringResource.Companion companion = StringResource.INSTANCE;
                submit(new EmailChallengeEvent.ShowDialog(companion.invoke(C39076R.string.challenge_verification_dialog_resend_title, new Object[0]), companion.invoke(C39076R.string.challenge_verification_dialog_resend_message_email, new Object[0]), false, 4, null));
            }
            Throwable thConsumeError = result.consumeError();
            if (thConsumeError != null) {
                submit(new EmailChallengeEvent.Error(thConsumeError));
                return;
            }
            return;
        }
        if ((action instanceof EmailChallengeScreen.Action.Proceed) || (action instanceof EmailChallengeScreen.Action.Fallback)) {
            applyMutation(new C398264(null));
            Throwable thConsumeError2 = result.consumeError();
            if (thConsumeError2 != null) {
                submit(new EmailChallengeEvent.Error(thConsumeError2));
            }
        }
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleActionResult$1", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleActionResult$1 */
    static final class C398251 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398251(Continuation<? super C398251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398251 c398251 = new C398251(continuation);
            c398251.L$0 = obj;
            return c398251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398251) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, false, null, null, 6, null);
        }
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleActionResult$4", m3645f = "EmailChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeDuxo$handleActionResult$4 */
    static final class C398264 extends ContinuationImpl7 implements Function2<EmailChallengeDataState, Continuation<? super EmailChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398264(Continuation<? super C398264> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398264 c398264 = new C398264(continuation);
            c398264.L$0 = obj;
            return c398264;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EmailChallengeDataState emailChallengeDataState, Continuation<? super EmailChallengeDataState> continuation) {
            return ((C398264) create(emailChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EmailChallengeDataState.copy$default((EmailChallengeDataState) this.L$0, false, null, null, 6, null);
        }
    }

    /* compiled from: EmailChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;", "Lcom/robinhood/shared/security/contracts/EmailChallengeFragmentKey;", "<init>", "()V", "CODE_LENGTH", "", "getCODE_LENGTH$feature_step_up_verification_externalDebug$annotations", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EmailChallengeDuxo, EmailChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCODE_LENGTH$feature_step_up_verification_externalDebug$annotations */
        public static /* synthetic */ void m2840x374e000() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailChallengeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (EmailChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EmailChallengeFragmentKey getArgs(EmailChallengeDuxo emailChallengeDuxo) {
            return (EmailChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, emailChallengeDuxo);
        }
    }
}
