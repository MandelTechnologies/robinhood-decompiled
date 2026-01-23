package com.robinhood.android.prompts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.prompts.PromptsHandlingEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.Challenge;
import com.robinhood.shared.security.contracts.PromptsHandlingInfo;
import com.robinhood.shared.security.prompts.PromptsFetchManager;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PromptsHandlingDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;", "Lcom/robinhood/android/prompts/PromptsHandlingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "promptsFetchManager", "Lcom/robinhood/shared/security/prompts/PromptsFetchManager;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/security/prompts/PromptsFetchManager;Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "approveChallenge", "", "denyChallenge", "fetchNextChallenge", "updateChallenge", "response", "", "Companion", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PromptsHandlingDuxo extends BaseDuxo5<PromptsHandlingViewState, PromptsHandlingEvent> implements HasSavedState {
    private static final String RESPONSE_APPROVE = "approve";
    private static final String RESPONSE_DENY = "deny";
    private final PromptsFetchManager promptsFetchManager;
    private final SavedStateHandle savedStateHandle;
    private final Sheriff sheriff;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptsHandlingDuxo(PromptsFetchManager promptsFetchManager, Sheriff sheriff, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PromptsHandlingViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(promptsFetchManager, "promptsFetchManager");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.promptsFetchManager = promptsFetchManager;
        this.sheriff = sheriff;
        this.savedStateHandle = savedStateHandle;
    }

    public final void approveChallenge() {
        updateChallenge(RESPONSE_APPROVE);
    }

    public final void denyChallenge() {
        updateChallenge(RESPONSE_DENY);
    }

    /* compiled from: PromptsHandlingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$fetchNextChallenge$1", m3645f = "PromptsHandlingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$fetchNextChallenge$1 */
    static final class C259361 extends ContinuationImpl7 implements Function2<PromptsHandlingViewState, Continuation<? super PromptsHandlingViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C259361(Continuation<? super C259361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C259361 c259361 = new C259361(continuation);
            c259361.L$0 = obj;
            return c259361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PromptsHandlingViewState promptsHandlingViewState, Continuation<? super PromptsHandlingViewState> continuation) {
            return ((C259361) create(promptsHandlingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PromptsHandlingViewState) this.L$0).copy(true);
        }
    }

    /* compiled from: PromptsHandlingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$fetchNextChallenge$2", m3645f = "PromptsHandlingDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$fetchNextChallenge$2 */
    static final class C259372 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C259372(Continuation<? super C259372> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PromptsHandlingDuxo.this.new C259372(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C259372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PromptsFetchManager promptsFetchManager = PromptsHandlingDuxo.this.promptsFetchManager;
                this.label = 1;
                obj = promptsFetchManager.fetchPendingChallengeHandlingInfo(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PromptsHandlingInfo promptsHandlingInfo = (PromptsHandlingInfo) obj;
            if (promptsHandlingInfo != null) {
                PromptsHandlingDuxo.this.submit(new PromptsHandlingEvent.ShowNextChallenge(promptsHandlingInfo));
            } else {
                PromptsHandlingDuxo.this.submit(PromptsHandlingEvent.Finished.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public final void fetchNextChallenge() {
        applyMutation(new C259361(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C259372(null), 3, null);
    }

    /* compiled from: PromptsHandlingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$1", m3645f = "PromptsHandlingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$1 */
    static final class C259381 extends ContinuationImpl7 implements Function2<PromptsHandlingViewState, Continuation<? super PromptsHandlingViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C259381(Continuation<? super C259381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C259381 c259381 = new C259381(continuation);
            c259381.L$0 = obj;
            return c259381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PromptsHandlingViewState promptsHandlingViewState, Continuation<? super PromptsHandlingViewState> continuation) {
            return ((C259381) create(promptsHandlingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PromptsHandlingViewState) this.L$0).copy(true);
        }
    }

    /* compiled from: PromptsHandlingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2", m3645f = "PromptsHandlingDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2 */
    static final class C259392 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C259392(String str, Continuation<? super C259392> continuation) {
            super(2, continuation);
            this.$response = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PromptsHandlingDuxo.this.new C259392(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C259392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Sheriff sheriff = PromptsHandlingDuxo.this.sheriff;
                    UUID challengeId = ((PromptsHandlingInfo) PromptsHandlingDuxo.INSTANCE.getArgs((HasSavedState) PromptsHandlingDuxo.this)).getChallengeId();
                    Challenge.Response response = new Challenge.Response(this.$response);
                    this.label = 1;
                    if (sheriff.respondChallenge(challengeId, response, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (Intrinsics.areEqual(this.$response, PromptsHandlingDuxo.RESPONSE_DENY)) {
                    PromptsHandlingDuxo.this.applyMutation(new AnonymousClass1(null));
                    PromptsHandlingDuxo.this.submit(PromptsHandlingEvent.ShowDeniedBottomSheet.INSTANCE);
                } else {
                    PromptsHandlingDuxo.this.fetchNextChallenge();
                }
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    PromptsHandlingDuxo.this.applyMutation(new AnonymousClass2(null));
                    PromptsHandlingDuxo.this.submit(new PromptsHandlingEvent.Error(th));
                } else {
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PromptsHandlingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2$1", m3645f = "PromptsHandlingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PromptsHandlingViewState, Continuation<? super PromptsHandlingViewState>, Object> {
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
            public final Object invoke(PromptsHandlingViewState promptsHandlingViewState, Continuation<? super PromptsHandlingViewState> continuation) {
                return ((AnonymousClass1) create(promptsHandlingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((PromptsHandlingViewState) this.L$0).copy(false);
            }
        }

        /* compiled from: PromptsHandlingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/prompts/PromptsHandlingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2$2", m3645f = "PromptsHandlingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.prompts.PromptsHandlingDuxo$updateChallenge$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PromptsHandlingViewState, Continuation<? super PromptsHandlingViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PromptsHandlingViewState promptsHandlingViewState, Continuation<? super PromptsHandlingViewState> continuation) {
                return ((AnonymousClass2) create(promptsHandlingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((PromptsHandlingViewState) this.L$0).copy(false);
            }
        }
    }

    private final void updateChallenge(String response) {
        applyMutation(new C259381(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C259392(response, null), 3, null);
    }

    /* compiled from: PromptsHandlingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/prompts/PromptsHandlingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/prompts/PromptsHandlingDuxo;", "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "<init>", "()V", "RESPONSE_APPROVE", "", "RESPONSE_DENY", "feature-prompts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PromptsHandlingDuxo, PromptsHandlingInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PromptsHandlingInfo getArgs(SavedStateHandle savedStateHandle) {
            return (PromptsHandlingInfo) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PromptsHandlingInfo getArgs(PromptsHandlingDuxo promptsHandlingDuxo) {
            return (PromptsHandlingInfo) DuxoCompanion.DefaultImpls.getArgs(this, promptsHandlingDuxo);
        }
    }
}
