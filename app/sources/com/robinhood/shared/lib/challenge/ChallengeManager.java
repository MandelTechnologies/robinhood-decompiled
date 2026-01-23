package com.robinhood.shared.lib.challenge;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.CreateChallengeResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.app.type.AppType;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChallengeManager.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00011B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0015J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bJ=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001cJE\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0086@¢\u0006\u0002\u0010$J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0012J\u001e\u0010+\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/coroutines/rx/RxFactory;)V", "alwaysSkipPrompt", "", "getAlwaysSkipPrompt", "()Z", "createBackupCodeChallenge", "Lio/reactivex/Single;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager$CreateChallengeResult;", "flowId", "", "email", "skipPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Single;", "createChallenge", "flow", "Lcom/robinhood/models/api/Challenge$Flow;", "verificationWorkflowId", "Ljava/util/UUID;", "(Lcom/robinhood/models/api/Challenge$Flow;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "recreateChallenge", "oldChallenge", "Lcom/robinhood/models/api/Challenge;", "(Ljava/lang/String;Lcom/robinhood/models/api/Challenge;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/Single;", "createLoggedOutChallenge", "request", "Lcom/robinhood/models/api/Challenge$LoggedOutCreateChallengeRequest;", "(Lcom/robinhood/models/api/Challenge$LoggedOutCreateChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/api/Challenge$CreateChallengeRequest;", "retryChallenge", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitChallenge", "code", "submitCode", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceChallenge", "challengeType", "Lcom/robinhood/models/api/Challenge$Type;", "(Ljava/util/UUID;Lcom/robinhood/models/api/Challenge$Type;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CreateChallengeResult", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeManager {
    public static final int $stable = 8;
    private final AppType appType;
    private final RxFactory rxFactory;
    private final Sheriff sheriff;

    /* compiled from: ChallengeManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.lib.challenge.ChallengeManager", m3645f = "ChallengeManager.kt", m3646l = {95}, m3647m = "createLoggedOutChallenge")
    /* renamed from: com.robinhood.shared.lib.challenge.ChallengeManager$createLoggedOutChallenge$1 */
    static final class C390741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C390741(Continuation<? super C390741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChallengeManager.this.createLoggedOutChallenge(null, this);
        }
    }

    public ChallengeManager(Sheriff sheriff, AppType appType, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.sheriff = sheriff;
        this.appType = appType;
        this.rxFactory = rxFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAlwaysSkipPrompt() {
        return this.appType == AppType.RHC;
    }

    /* compiled from: ChallengeManager.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/ChallengeManager$CreateChallengeResult;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CreateChallengeResult {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ CreateChallengeResult copy$default(CreateChallengeResult createChallengeResult, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = createChallengeResult.challenge;
            }
            return createChallengeResult.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final CreateChallengeResult copy(Challenge challenge) {
            return new CreateChallengeResult(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateChallengeResult) && Intrinsics.areEqual(this.challenge, ((CreateChallengeResult) other).challenge);
        }

        public int hashCode() {
            Challenge challenge = this.challenge;
            if (challenge == null) {
                return 0;
            }
            return challenge.hashCode();
        }

        public String toString() {
            return "CreateChallengeResult(challenge=" + this.challenge + ")";
        }

        public CreateChallengeResult(Challenge challenge) {
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    public static /* synthetic */ Single createBackupCodeChallenge$default(ChallengeManager challengeManager, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        return challengeManager.createBackupCodeChallenge(str, str2, bool);
    }

    public final Single<CreateChallengeResult> createBackupCodeChallenge(String flowId, String email, Boolean skipPrompt) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return createChallenge(flowId, new Challenge.CreateChallengeRequest(Challenge.Flow.BACKUP_CODE.getId(), true, email, skipPrompt, null, null, null, 112, null));
    }

    public static /* synthetic */ Single createChallenge$default(ChallengeManager challengeManager, Challenge.Flow flow, String str, Boolean bool, UUID uuid, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        return challengeManager.createChallenge(flow, str, bool, uuid);
    }

    public final Single<CreateChallengeResult> createChallenge(Challenge.Flow flow, String email, Boolean skipPrompt, UUID verificationWorkflowId) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        return createChallenge(flow.getId(), new Challenge.CreateChallengeRequest(flow.getId(), true, email, skipPrompt, null, null, verificationWorkflowId, 48, null));
    }

    public static /* synthetic */ Single createChallenge$default(ChallengeManager challengeManager, String str, String str2, Boolean bool, UUID uuid, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            uuid = null;
        }
        return challengeManager.createChallenge(str, str2, bool, uuid);
    }

    public final Single<CreateChallengeResult> createChallenge(String flowId, String email, Boolean skipPrompt, UUID verificationWorkflowId) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return createChallenge(flowId, new Challenge.CreateChallengeRequest(flowId, true, email, skipPrompt, null, null, verificationWorkflowId, 48, null));
    }

    public static /* synthetic */ Single recreateChallenge$default(ChallengeManager challengeManager, String str, Challenge challenge, UUID uuid, String str2, Boolean bool, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return challengeManager.recreateChallenge(str, challenge, uuid, str2, bool);
    }

    public final Single<CreateChallengeResult> recreateChallenge(String flowId, Challenge oldChallenge, UUID verificationWorkflowId, String email, Boolean skipPrompt) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return createChallenge(flowId, new Challenge.CreateChallengeRequest(flowId, true, email, skipPrompt, oldChallenge != null ? oldChallenge.getId() : null, oldChallenge != null ? oldChallenge.getSilent() : null, verificationWorkflowId));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoggedOutChallenge(Challenge.LoggedOutCreateChallengeRequest loggedOutCreateChallengeRequest, Continuation<? super CreateChallengeResult> continuation) {
        C390741 c390741;
        if (continuation instanceof C390741) {
            c390741 = (C390741) continuation;
            int i = c390741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c390741.label = i - Integer.MIN_VALUE;
            } else {
                c390741 = new C390741(continuation);
            }
        }
        Object objCreateChallengeForLoggedOutFlow = c390741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c390741.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateChallengeForLoggedOutFlow);
            Sheriff sheriff = this.sheriff;
            c390741.label = 1;
            objCreateChallengeForLoggedOutFlow = sheriff.createChallengeForLoggedOutFlow(loggedOutCreateChallengeRequest, c390741);
            if (objCreateChallengeForLoggedOutFlow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateChallengeForLoggedOutFlow);
        }
        CreateChallengeResponse createChallengeResponse = (CreateChallengeResponse) objCreateChallengeForLoggedOutFlow;
        if (createChallengeResponse.getChallenge_required()) {
            return new CreateChallengeResult(createChallengeResponse.getChallenge());
        }
        return new CreateChallengeResult(null);
    }

    /* compiled from: ChallengeManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/lib/challenge/ChallengeManager$CreateChallengeResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.lib.challenge.ChallengeManager$createChallenge$1", m3645f = "ChallengeManager.kt", m3646l = {113, 115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.lib.challenge.ChallengeManager$createChallenge$1 */
    static final class C390731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CreateChallengeResult>, Object> {
        final /* synthetic */ String $flowId;
        final /* synthetic */ Challenge.CreateChallengeRequest $request;
        int label;
        final /* synthetic */ ChallengeManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390731(Challenge.CreateChallengeRequest createChallengeRequest, ChallengeManager challengeManager, String str, Continuation<? super C390731> continuation) {
            super(2, continuation);
            this.$request = createChallengeRequest;
            this.this$0 = challengeManager;
            this.$flowId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C390731(this.$request, this.this$0, this.$flowId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CreateChallengeResult> continuation) {
            return ((C390731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            if (r15 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
        
            if (r15 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CreateChallengeResponse createChallengeResponse;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Challenge.CreateChallengeRequest createChallengeRequestCopy$default = Challenge.CreateChallengeRequest.copy$default(this.$request, null, false, null, this.this$0.getAlwaysSkipPrompt() ? boxing.boxBoolean(true) : this.$request.getSkipPrompt(), null, null, null, 119, null);
                if (Intrinsics.areEqual(this.$flowId, Challenge.Flow.RESET_PASSWORD_WHEN_LOGGED_OUT.getId())) {
                    Sheriff sheriff = this.this$0.sheriff;
                    this.label = 1;
                    obj = sheriff.createChallengeForForgotPasswordFlow(createChallengeRequestCopy$default, this);
                } else {
                    Sheriff sheriff2 = this.this$0.sheriff;
                    this.label = 2;
                    obj = sheriff2.createChallengeForFlow(createChallengeRequestCopy$default, this);
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                createChallengeResponse = (CreateChallengeResponse) obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                createChallengeResponse = (CreateChallengeResponse) obj;
            }
            if (createChallengeResponse.getChallenge_required()) {
                return new CreateChallengeResult(createChallengeResponse.getChallenge());
            }
            return new CreateChallengeResult(null);
        }
    }

    private final Single<CreateChallengeResult> createChallenge(String flowId, Challenge.CreateChallengeRequest request) {
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C390731(request, this, flowId, null), 1, null);
    }

    public final Object retryChallenge(UUID uuid, Continuation<? super Challenge> continuation) {
        return this.sheriff.retryChallenge(uuid, continuation);
    }

    /* compiled from: ChallengeManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/Challenge;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.lib.challenge.ChallengeManager$submitChallenge$1", m3645f = "ChallengeManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.lib.challenge.ChallengeManager$submitChallenge$1 */
    static final class C390751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Challenge>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ String $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390751(UUID uuid, String str, Continuation<? super C390751> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChallengeManager.this.new C390751(this.$challengeId, this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Challenge> continuation) {
            return ((C390751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Sheriff sheriff = ChallengeManager.this.sheriff;
            UUID uuid = this.$challengeId;
            Challenge.Response response = new Challenge.Response(this.$code);
            this.label = 1;
            Object objSubmitChallenge = sheriff.submitChallenge(uuid, response, this);
            return objSubmitChallenge == coroutine_suspended ? coroutine_suspended : objSubmitChallenge;
        }
    }

    public final Single<Challenge> submitChallenge(UUID challengeId, String code) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(code, "code");
        return RxFactory.DefaultImpls.rxSingle$default(this.rxFactory, null, new C390751(challengeId, code, null), 1, null);
    }

    public final Object submitCode(UUID uuid, String str, Continuation<? super Challenge> continuation) {
        return this.sheriff.submitChallenge(uuid, new Challenge.Response(str), continuation);
    }

    public final Object replaceChallenge(UUID uuid, Challenge.Type type2, Continuation<? super Challenge> continuation) {
        return this.sheriff.replaceChallenge(uuid, type2, continuation);
    }
}
