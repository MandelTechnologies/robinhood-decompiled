package com.robinhood.shared.stepupverification.loggedinchallenge;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.security.contracts.PathfinderLoggedInChallengeFragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo;
import com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeEvent;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoggedInChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "submitChallengeResult", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "error", "", "fallback", "userViewInput", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LoggedInChallengeDuxo extends BaseDuxo5<Unit, LoggedInChallengeEvent> implements HasSavedState {
    public static final String KEY_SHOULD_CREATE_CHALLENGE = "shouldCreateChallenge";
    private final ChallengeManager challengeManager;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedInChallengeDuxo(PathfinderStore pathfinderStore, ChallengeManager challengeManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.pathfinderStore = pathfinderStore;
        this.challengeManager = challengeManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Boolean bool = (Boolean) getSavedStateHandle().get(KEY_SHOULD_CREATE_CHALLENGE);
        if (bool != null ? bool.booleanValue() : true) {
            Companion companion = INSTANCE;
            LifecycleHost.DefaultImpls.bind$default(this, ChallengeManager.createChallenge$default(this.challengeManager, ((UserViewStatePageContext.LoggedInChallenge) ((PathfinderLoggedInChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getUserViewState().getTypeContext()).getContext().getSheriffFlowId(), (String) null, Boolean.FALSE, ((UserViewStatePageContext.LoggedInChallenge) ((PathfinderLoggedInChallengeFragmentKey) companion.getArgs((HasSavedState) this)).getUserViewState().getTypeContext()).getContext().getVerificationWorkflowId(), 2, (Object) null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoggedInChallengeDuxo.onCreate$lambda$0(this.f$0, (ChallengeManager.CreateChallengeResult) obj);
                }
            }, new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoggedInChallengeDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(LoggedInChallengeDuxo loggedInChallengeDuxo, ChallengeManager.CreateChallengeResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        loggedInChallengeDuxo.getSavedStateHandle().set(KEY_SHOULD_CREATE_CHALLENGE, Boolean.FALSE);
        Challenge challenge = result.getChallenge();
        Intrinsics.checkNotNull(challenge);
        loggedInChallengeDuxo.submit(new LoggedInChallengeEvent.ChallengeLoaded(challenge));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(LoggedInChallengeDuxo loggedInChallengeDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
        if (httpStatusCode != null && httpStatusCode.intValue() == 400) {
            loggedInChallengeDuxo.submitChallengeResult(null, false, true);
        } else {
            loggedInChallengeDuxo.submit(new LoggedInChallengeEvent.Error(throwable));
        }
        return Unit.INSTANCE;
    }

    public final void submitChallengeResult(UUID challengeId, boolean error, boolean fallback) {
        submitChallengeResult(new UserViewInput.LoggedInChallenge(challengeId, error, fallback));
    }

    /* compiled from: LoggedInChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo$submitChallengeResult$1", m3645f = "LoggedInChallengeDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo$submitChallengeResult$1 */
    static final class C398931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UserViewInput $userViewInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398931(UserViewInput userViewInput, Continuation<? super C398931> continuation) {
            super(2, continuation);
            this.$userViewInput = userViewInput;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoggedInChallengeDuxo.this.new C398931(this.$userViewInput, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = LoggedInChallengeDuxo.this.pathfinderStore;
                Companion companion = LoggedInChallengeDuxo.INSTANCE;
                UUID inquiryId = ((PathfinderLoggedInChallengeFragmentKey) companion.getArgs((HasSavedState) LoggedInChallengeDuxo.this)).getInquiryId();
                int sequence = ((PathfinderLoggedInChallengeFragmentKey) companion.getArgs((HasSavedState) LoggedInChallengeDuxo.this)).getUserViewState().getSequence();
                UserViewInput userViewInput = this.$userViewInput;
                final LoggedInChallengeDuxo loggedInChallengeDuxo = LoggedInChallengeDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeDuxo$submitChallengeResult$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(LoggedInChallengeDuxo.C398931.invokeSuspend$lambda$0(loggedInChallengeDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, userViewInput, function1, this) == coroutine_suspended) {
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
        public static final boolean invokeSuspend$lambda$0(LoggedInChallengeDuxo loggedInChallengeDuxo, Throwable th) {
            loggedInChallengeDuxo.submit(new LoggedInChallengeEvent.Error(th));
            return true;
        }
    }

    private final void submitChallengeResult(UserViewInput userViewInput) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C398931(userViewInput, null), 3, null);
    }

    /* compiled from: LoggedInChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0005¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeDuxo;", "Lcom/robinhood/android/security/contracts/PathfinderLoggedInChallengeFragmentKey;", "<init>", "()V", "KEY_SHOULD_CREATE_CHALLENGE", "", "getKEY_SHOULD_CREATE_CHALLENGE$feature_step_up_verification_externalDebug$annotations", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LoggedInChallengeDuxo, PathfinderLoggedInChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getKEY_SHOULD_CREATE_CHALLENGE$feature_step_up_verification_externalDebug$annotations */
        public static /* synthetic */ void m2844x9d05972c() {
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderLoggedInChallengeFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PathfinderLoggedInChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderLoggedInChallengeFragmentKey getArgs(LoggedInChallengeDuxo loggedInChallengeDuxo) {
            return (PathfinderLoggedInChallengeFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, loggedInChallengeDuxo);
        }
    }
}
