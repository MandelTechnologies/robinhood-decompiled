package com.robinhood.security.prompts;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.PromptsStatusResponse;
import com.robinhood.utils.p408rx.Poll;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: PromptsChallengeStatusManager.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/coroutines/rx/RxFactory;)V", "pollChallengeStatus", "Lio/reactivex/Observable;", "Lcom/robinhood/models/api/PromptsStatusResponse;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "attempts", "", "pollChallengeStatus$lib_security_externalRelease", "Companion", "lib-security_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PromptsChallengeStatusManager {
    private static final long CHALLENGE_ATTEMPTS = 300;
    private static final long POLL_STATUS_INTERVAL_SECONDS = 2;
    private final RxFactory rxFactory;
    private final Sheriff sheriff;

    public PromptsChallengeStatusManager(Sheriff sheriff, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.sheriff = sheriff;
        this.rxFactory = rxFactory;
    }

    public final Observable<PromptsStatusResponse> pollChallengeStatus(Challenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        return pollChallengeStatus$lib_security_externalRelease(challenge.getId(), 300L);
    }

    /* compiled from: PromptsChallengeStatusManager.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/models/api/PromptsStatusResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.security.prompts.PromptsChallengeStatusManager$pollChallengeStatus$1", m3645f = "PromptsChallengeStatusManager.kt", m3646l = {31, 31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.security.prompts.PromptsChallengeStatusManager$pollChallengeStatus$1 */
    static final class C372911 extends ContinuationImpl7 implements Function2<Produce4<? super PromptsStatusResponse>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $challengeId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C372911(UUID uuid, Continuation<? super C372911> continuation) {
            super(2, continuation);
            this.$challengeId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C372911 c372911 = PromptsChallengeStatusManager.this.new C372911(this.$challengeId, continuation);
            c372911.L$0 = obj;
            return c372911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super PromptsStatusResponse> produce4, Continuation<? super Unit> continuation) {
            return ((C372911) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.send(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Produce4 produce4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produce4 = (Produce4) this.L$0;
                Sheriff sheriff = PromptsChallengeStatusManager.this.sheriff;
                UUID uuid = this.$challengeId;
                this.L$0 = produce4;
                this.label = 1;
                obj = sheriff.getPromptsChallengeStatus(uuid, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            produce4 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final Observable<PromptsStatusResponse> pollChallengeStatus$lib_security_externalRelease(UUID challengeId, long attempts) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Observable observableOnErrorReturn = RxFactory.DefaultImpls.rxObservable$default(this.rxFactory, null, new C372911(challengeId, null), 1, null).onErrorReturn(new Function() { // from class: com.robinhood.security.prompts.PromptsChallengeStatusManager.pollChallengeStatus.2
            @Override // io.reactivex.functions.Function
            public final PromptsStatusResponse apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new PromptsStatusResponse(PromptsStatusResponse.PromptsChallengeStatus.FAILED);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableOnErrorReturn, "onErrorReturn(...)");
        Observable observableCompose = observableOnErrorReturn.compose(new Poll(2L, TimeUnit.SECONDS, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<PromptsStatusResponse> observableSubscribeOn = observableCompose.take(attempts).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }
}
