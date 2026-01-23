package com.robinhood.shared.stepupverification.challenge;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.security.contracts.PathfinderChallenge;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.stepupverification.challenge.ChallengeDataState2;
import com.robinhood.shared.stepupverification.challenge.ChallengeDuxo;
import java.util.UUID;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDataState;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "stateProvider", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/shared/stepupverification/challenge/ChallengeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitChallengeResult", "", "result", "Lcom/robinhood/shared/lib/challenge/ChallengeVerificationResult;", "userViewInput", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "waitForResponse", "", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeDuxo extends BaseDuxo<ChallengeDataState, ChallengeViewState> implements HasSavedState {
    private static final String STATUS_ABANDON = "customer_abandon";
    private static final String STATUS_CONTINUE = "continue";
    private static final String STATUS_FALLBACK = "fallback";
    private static final String STATUS_RESEND = "resend";
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
    public ChallengeDuxo(PathfinderStore pathfinderStore, ChallengeStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ChallengeDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void submitChallengeResult(ChallengeVerificationResult result) {
        String str;
        if ((result instanceof ChallengeVerificationResult.Completed) || (result instanceof ChallengeVerificationResult.Failed)) {
            str = "continue";
        } else if (result instanceof ChallengeVerificationResult.Fallback) {
            str = STATUS_FALLBACK;
        } else if (result instanceof ChallengeVerificationResult.Resend) {
            str = STATUS_RESEND;
        } else {
            if (result != null) {
                throw new NoWhenBranchMatchedException();
            }
            str = STATUS_ABANDON;
        }
        submitChallengeResult(new UserViewInput.Challenge(str), result != null);
    }

    public static /* synthetic */ void submitChallengeResult$default(ChallengeDuxo challengeDuxo, UserViewInput userViewInput, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        challengeDuxo.submitChallengeResult(userViewInput, z);
    }

    /* compiled from: ChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$1", m3645f = "ChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$1 */
    static final class C397981 extends ContinuationImpl7 implements Function2<ChallengeDataState, Continuation<? super ChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C397981(Continuation<? super C397981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C397981 c397981 = new C397981(continuation);
            c397981.L$0 = obj;
            return c397981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChallengeDataState challengeDataState, Continuation<? super ChallengeDataState> continuation) {
            return ((C397981) create(challengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((ChallengeDataState) this.L$0).copy(ChallengeDataState2.Loading.INSTANCE);
        }
    }

    /* compiled from: ChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$2", m3645f = "ChallengeDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$2 */
    static final class C397992 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UserViewInput $userViewInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C397992(UserViewInput userViewInput, Continuation<? super C397992> continuation) {
            super(2, continuation);
            this.$userViewInput = userViewInput;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeDuxo.this.new C397992(this.$userViewInput, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C397992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = ChallengeDuxo.this.pathfinderStore;
                Companion companion = ChallengeDuxo.INSTANCE;
                UUID inquiryId = ((PathfinderChallenge) companion.getArgs((HasSavedState) ChallengeDuxo.this)).getInquiryId();
                int sequence = ((PathfinderChallenge) companion.getArgs((HasSavedState) ChallengeDuxo.this)).getUserViewState().getSequence();
                final UserViewInput userViewInput = this.$userViewInput;
                final ChallengeDuxo challengeDuxo = ChallengeDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(ChallengeDuxo.C397992.invokeSuspend$lambda$0(challengeDuxo, userViewInput, (Throwable) obj2));
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
        public static final boolean invokeSuspend$lambda$0(ChallengeDuxo challengeDuxo, UserViewInput userViewInput, Throwable th) {
            challengeDuxo.applyMutation(new ChallengeDuxo2(userViewInput, null));
            return true;
        }
    }

    public final void submitChallengeResult(UserViewInput userViewInput, boolean waitForResponse) {
        Intrinsics.checkNotNullParameter(userViewInput, "userViewInput");
        if (waitForResponse) {
            applyMutation(new C397981(null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C397992(userViewInput, null), 3, null);
        } else {
            PathfinderStore pathfinderStore = this.pathfinderStore;
            Companion companion = INSTANCE;
            pathfinderStore.sendUserInput(((PathfinderChallenge) companion.getArgs((HasSavedState) this)).getInquiryId(), ((PathfinderChallenge) companion.getArgs((HasSavedState) this)).getUserViewState().getSequence(), userViewInput);
            applyMutation(new C398003(null));
        }
    }

    /* compiled from: ChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$3", m3645f = "ChallengeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeDuxo$submitChallengeResult$3 */
    static final class C398003 extends ContinuationImpl7 implements Function2<ChallengeDataState, Continuation<? super ChallengeDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C398003(Continuation<? super C398003> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398003 c398003 = new C398003(continuation);
            c398003.L$0 = obj;
            return c398003;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ChallengeDataState challengeDataState, Continuation<? super ChallengeDataState> continuation) {
            return ((C398003) create(challengeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((ChallengeDataState) this.L$0).copy(ChallengeDataState2.Exit.INSTANCE);
        }
    }

    /* compiled from: ChallengeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/ChallengeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/challenge/ChallengeDuxo;", "Lcom/robinhood/android/security/contracts/PathfinderChallenge;", "<init>", "()V", "STATUS_ABANDON", "", "STATUS_CONTINUE", "STATUS_FALLBACK", "STATUS_RESEND", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ChallengeDuxo, PathfinderChallenge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderChallenge getArgs(SavedStateHandle savedStateHandle) {
            return (PathfinderChallenge) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PathfinderChallenge getArgs(ChallengeDuxo challengeDuxo) {
            return (PathfinderChallenge) DuxoCompanion.DefaultImpls.getArgs(this, challengeDuxo);
        }
    }
}
