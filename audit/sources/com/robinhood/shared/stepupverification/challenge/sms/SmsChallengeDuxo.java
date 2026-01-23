package com.robinhood.shared.stepupverification.challenge.sms;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.models.workflow.p358ui.screens.SmsChallengeScreen;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenAction;
import com.robinhood.models.workflow.p358ui.screens.UiWorkflowScreenActionResponse;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.SmsChallengeFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowActionResult;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputUtils;
import com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo;
import com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeEvent;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.time.annotation.ElapsedRealtime;
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
import kotlin.jvm.functions.Function1;
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
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: SmsChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001BBS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010$J\u0019\u0010)\u001a\u00020\u001c2\n\u0010(\u001a\u00060&j\u0002`'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u001c¢\u0006\u0004\b+\u0010$J\r\u0010,\u001a\u00020\u001c¢\u0006\u0004\b,\u0010$J\r\u0010-\u001a\u00020\u001c¢\u0006\u0004\b-\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010<\u001a\n ;*\u0004\u0018\u00010:0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeViewState;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "workflowManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "code", "", "submitCode", "(Ljava/lang/String;)V", "Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;", "result", "handleActionResult", "(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", "onCreate", "()V", "onResume", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "event", "handleKeyPress", "(Landroid/view/KeyEvent;)V", "resendCode", "fallback", "proceed", "Lcom/robinhood/shared/security/auth/AuthManager;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "Lcom/robinhood/shared/store/user/UserStore;", "Lj$/time/Clock;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lcom/robinhood/models/api/Challenge;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "j$/time/Instant", "kotlin.jvm.PlatformType", "nextSmsTime", "Lj$/time/Instant;", "", "getCanResendSms", "()Z", "canResendSms", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SmsChallengeDuxo extends BaseDuxo3<SmsChallengeDataState, SmsChallengeViewState, SmsChallengeEvent> implements HasSavedState {
    public static final int CODE_LENGTH = 6;
    private static final long SMS_RESEND_DELAY_SECONDS = 60;
    private final AuthManager authManager;
    private Challenge challenge;
    private final ChallengeManager challengeManager;
    private final Clock clock;
    private Instant nextSmsTime;
    private final ProfileInfoStore profileInfoStore;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;
    private final WorkflowManager workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SmsChallengeDuxo(AuthManager authManager, ChallengeManager challengeManager, ProfileInfoStore profileInfoStore, WorkflowManager workflowManager, UserStore userStore, @ElapsedRealtime Clock clock, SavedStateHandle savedStateHandle, SmsChallengeStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new SmsChallengeDataState(false, null, ((SmsChallengeFragmentKey) companion.getArgs(savedStateHandle)).getWorkflowScreen().getFallbackCtaText(), null, null, 27, null), stateProvider, duxoBundle);
        this.authManager = authManager;
        this.challengeManager = challengeManager;
        this.profileInfoStore = profileInfoStore;
        this.workflowManager = workflowManager;
        this.userStore = userStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.challenge = ((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen().getSheriffChallenge();
        this.nextSmsTime = clock.instant().plusSeconds(60L);
    }

    private final boolean getCanResendSms() {
        return this.clock.instant().isAfter(this.nextSmsTime);
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$onCreate$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$onCreate$1 */
    static final class C398431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398431(Continuation<? super C398431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmsChallengeDuxo.this.new C398431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SmsChallengeDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SmsChallengeDuxo $tmp0;

            AnonymousClass1(SmsChallengeDuxo smsChallengeDuxo) {
                this.$tmp0 = smsChallengeDuxo;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SmsChallengeDuxo.class, "handleActionResult", "handleActionResult(Lcom/robinhood/shared/security/lib/workflow/WorkflowActionResult;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(WorkflowActionResult workflowActionResult, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleActionResult = C398431.invokeSuspend$handleActionResult(this.$tmp0, workflowActionResult, continuation);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(SmsChallengeDuxo.this.workflowManager.getActionResultFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SmsChallengeDuxo.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleActionResult(SmsChallengeDuxo smsChallengeDuxo, WorkflowActionResult workflowActionResult, Continuation continuation) {
            smsChallengeDuxo.handleActionResult(workflowActionResult);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C398431(null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        if (this.authManager.isLoggedIn()) {
            UserStore.refresh$default(this.userStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.userStore.getUser(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SmsChallengeDuxo.onResume$lambda$0(this.f$0, (User) obj);
                }
            });
            ProfileInfoStore.refreshProfileInfo$default(this.profileInfoStore, false, 1, null);
            LifecycleHost.DefaultImpls.bind$default(this, this.profileInfoStore.streamProfileInfo(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SmsChallengeDuxo.onResume$lambda$1(this.f$0, (UiProfileInfo) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(SmsChallengeDuxo smsChallengeDuxo, User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        smsChallengeDuxo.applyMutation(new SmsChallengeDuxo2(user, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(SmsChallengeDuxo smsChallengeDuxo, UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(profileInfo, "profileInfo");
        smsChallengeDuxo.applyMutation(new SmsChallengeDuxo3(profileInfo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleKeyPress$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleKeyPress$1 */
    static final class C398421 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        final /* synthetic */ KeyEvent $event;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SmsChallengeDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398421(KeyEvent keyEvent, SmsChallengeDuxo smsChallengeDuxo, Continuation<? super C398421> continuation) {
            super(2, continuation);
            this.$event = keyEvent;
            this.this$0 = smsChallengeDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398421 c398421 = new C398421(this.$event, this.this$0, continuation);
            c398421.L$0 = obj;
            return c398421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398421) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String inputText;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SmsChallengeDataState smsChallengeDataState = (SmsChallengeDataState) this.L$0;
            if (KeyEvents2.isDelete(this.$event) && smsChallengeDataState.getInputText().length() <= 1) {
                inputText = "";
            } else if (KeyEvents2.isDelete(this.$event)) {
                inputText = StringsKt.dropLast(smsChallengeDataState.getInputText(), 1);
            } else if ((!KeyEvents2.isDigit(this.$event) || smsChallengeDataState.getInputText().length() < 6) && KeyEvents2.isDigit(this.$event)) {
                inputText = smsChallengeDataState.getInputText() + this.$event.getNumber();
            } else {
                inputText = smsChallengeDataState.getInputText();
            }
            String str = inputText;
            if (str.length() >= 6) {
                this.this$0.submitCode(str);
            }
            return SmsChallengeDataState.copy$default(smsChallengeDataState, false, str, null, null, null, 29, null);
        }
    }

    public final void handleKeyPress(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        applyMutation(new C398421(event, this, null));
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$resendCode$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$resendCode$1 */
    static final class C398451 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398451(Continuation<? super C398451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398451 c398451 = new C398451(continuation);
            c398451.L$0 = obj;
            return c398451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398451) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, true, null, null, null, null, 30, null);
        }
    }

    public final void resendCode() {
        if (getCanResendSms()) {
            applyMutation(new C398451(null));
            WorkflowManager workflowManager = this.workflowManager;
            Companion companion = INSTANCE;
            workflowManager.sendActionRequest(((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), SmsChallengeScreen.Action.Resend.INSTANCE, ((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
            return;
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        submit(new SmsChallengeEvent.ShowDialog(companion2.invoke(C39791R.string.challenge_dialog_error_title, new Object[0]), companion2.invoke(C39076R.string.challenge_verification_dialog_resend_rate_limit_message, new Object[0]), false, 4, null));
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$fallback$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$fallback$1 */
    static final class C398391 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398391(Continuation<? super C398391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398391 c398391 = new C398391(continuation);
            c398391.L$0 = obj;
            return c398391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398391) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, true, null, null, null, null, 30, null);
        }
    }

    public final void fallback() {
        applyMutation(new C398391(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), SmsChallengeScreen.Action.Fallback.INSTANCE, ((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$proceed$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$proceed$1 */
    static final class C398441 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398441(Continuation<? super C398441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398441 c398441 = new C398441(continuation);
            c398441.L$0 = obj;
            return c398441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398441) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, true, null, null, null, null, 30, null);
        }
    }

    public final void proceed() {
        applyMutation(new C398441(null));
        WorkflowManager workflowManager = this.workflowManager;
        Companion companion = INSTANCE;
        workflowManager.sendActionRequest(((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowId(), SmsChallengeScreen.Action.Proceed.INSTANCE, ((SmsChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getWorkflowScreen());
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {144}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1 */
    static final class C398461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398461(String str, Continuation<? super C398461> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmsChallengeDuxo.this.new C398461(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SmsChallengeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
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
            public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
                return ((AnonymousClass1) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, true, null, null, null, null, 30, null);
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
                    SmsChallengeDuxo.this.applyMutation(new AnonymousClass1(null));
                    SmsChallengeDuxo smsChallengeDuxo = SmsChallengeDuxo.this;
                    String str = this.$code;
                    Result.Companion companion = Result.INSTANCE;
                    ChallengeManager challengeManager = smsChallengeDuxo.challengeManager;
                    UUID id = smsChallengeDuxo.challenge.getId();
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
            SmsChallengeDuxo smsChallengeDuxo2 = SmsChallengeDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                smsChallengeDuxo2.proceed();
            }
            final SmsChallengeDuxo smsChallengeDuxo3 = SmsChallengeDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                smsChallengeDuxo3.applyMutation(new SmsChallengeDuxo4(null));
                if (ChallengeCodeInputUtils.INSTANCE.handleSubmitCodeError(thM28553exceptionOrNullimpl, new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SmsChallengeDuxo.C398461.invokeSuspend$lambda$3$lambda$2(smsChallengeDuxo3, (StringResource) obj2, (StringResource) obj3);
                    }
                }, new SmsChallengeDuxo5(smsChallengeDuxo3))) {
                    return Unit.INSTANCE;
                }
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thM28553exceptionOrNullimpl);
                String displayMessage = errorResponseExtractErrorResponse != null ? errorResponseExtractErrorResponse.getDisplayMessage() : null;
                if (displayMessage != null) {
                    StringResource.Companion companion3 = StringResource.INSTANCE;
                    smsChallengeDuxo3.submit(new SmsChallengeEvent.ShowDialog(companion3.invoke(C39791R.string.challenge_dialog_error_title, new Object[0]), companion3.invoke(displayMessage), true));
                } else {
                    smsChallengeDuxo3.submit(new SmsChallengeEvent.Error(thM28553exceptionOrNullimpl));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(SmsChallengeDuxo smsChallengeDuxo, StringResource stringResource, StringResource stringResource2) {
            smsChallengeDuxo.submit(new SmsChallengeEvent.ShowDialog(stringResource, stringResource2, false, 4, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitCode(String code) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C398461(code, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActionResult(WorkflowActionResult result) {
        UiWorkflowScreenAction action = result.getAction();
        if (action instanceof SmsChallengeScreen.Action.Resend) {
            applyMutation(new C398401(null));
            UiWorkflowScreenActionResponse uiWorkflowScreenActionResponseConsumeScreenActionResponse = result.consumeScreenActionResponse();
            if (uiWorkflowScreenActionResponseConsumeScreenActionResponse != null) {
                Challenge sheriffChallenge = ((SmsChallengeScreen.ActionResponse.Resend) uiWorkflowScreenActionResponseConsumeScreenActionResponse).getSheriffChallenge();
                this.challenge = sheriffChallenge;
                if (sheriffChallenge.getRemaining_retries() > 0) {
                    this.nextSmsTime = this.clock.instant().plusSeconds(60L);
                }
                withDataState(new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SmsChallengeDuxo.handleActionResult$lambda$3$lambda$2(this.f$0, (SmsChallengeDataState) obj);
                    }
                });
            }
            Throwable thConsumeError = result.consumeError();
            if (thConsumeError != null) {
                submit(new SmsChallengeEvent.Error(thConsumeError));
                return;
            }
            return;
        }
        if ((action instanceof SmsChallengeScreen.Action.Proceed) || (action instanceof SmsChallengeScreen.Action.Fallback)) {
            applyMutation(new C398414(null));
            Throwable thConsumeError2 = result.consumeError();
            if (thConsumeError2 != null) {
                submit(new SmsChallengeEvent.Error(thConsumeError2));
            }
        }
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleActionResult$1", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleActionResult$1 */
    static final class C398401 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398401(Continuation<? super C398401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398401 c398401 = new C398401(continuation);
            c398401.L$0 = obj;
            return c398401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398401) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, false, null, null, null, null, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleActionResult$lambda$3$lambda$2(SmsChallengeDuxo smsChallengeDuxo, SmsChallengeDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        smsChallengeDuxo.submit(new SmsChallengeEvent.ShowDialog(StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_title, new Object[0]), dataState.getResendCodeSuccessAlertBody(), false, 4, null));
        return Unit.INSTANCE;
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleActionResult$4", m3645f = "SmsChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$handleActionResult$4 */
    static final class C398414 extends ContinuationImpl7 implements Function2<SmsChallengeDataState, Continuation<? super SmsChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398414(Continuation<? super C398414> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398414 c398414 = new C398414(continuation);
            c398414.L$0 = obj;
            return c398414;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SmsChallengeDataState smsChallengeDataState, Continuation<? super SmsChallengeDataState> continuation) {
            return ((C398414) create(smsChallengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SmsChallengeDataState.copy$default((SmsChallengeDataState) this.L$0, false, null, null, null, null, 30, null);
        }
    }

    /* compiled from: SmsChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "Lcom/robinhood/shared/security/contracts/SmsChallengeFragmentKey;", "<init>", "()V", "CODE_LENGTH", "", "getCODE_LENGTH$feature_step_up_verification_externalDebug$annotations", "SMS_RESEND_DELAY_SECONDS", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SmsChallengeDuxo, SmsChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCODE_LENGTH$feature_step_up_verification_externalDebug$annotations */
        public static /* synthetic */ void m2841x374e000() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SmsChallengeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (SmsChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public SmsChallengeFragmentKey getArgs(SmsChallengeDuxo smsChallengeDuxo) {
            return (SmsChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, smsChallengeDuxo);
        }
    }
}
