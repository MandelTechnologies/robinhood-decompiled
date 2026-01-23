package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "", "submit", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ChallengeActionHandler {
    Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lkotlin/coroutines/CoroutineContext;)V", "challengeRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;Lkotlin/coroutines/CoroutineContext;)V", "executeChallengeRequest", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Default implements ChallengeActionHandler {
        private final ChallengeRequestExecutor challengeRequestExecutor;
        private final ChallengeRequestData creqData;
        private final ErrorReporter errorReporter;
        private final CoroutineContext workContext;
        private static final long CREQ_DELAY = TimeUnit.SECONDS.toMillis(1);

        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor challengeRequestExecutor, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(challengeRequestExecutor, "challengeRequestExecutor");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.creqData = creqData;
            this.errorReporter = errorReporter;
            this.challengeRequestExecutor = challengeRequestExecutor;
            this.workContext = workContext;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor.Factory creqExecutorFactory, CoroutineContext workContext) {
            this(creqData, errorReporter, creqExecutorFactory.create(errorReporter, workContext), workContext);
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler
        public Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation) {
            return BuildersKt.withContext(this.workContext, new ChallengeActionHandler3(this, challengeAction, null), continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(8:12|41|13|28|33|(1:35)|36|(1:45)(2:39|40))(2:17|18))(1:19))(3:20|(1:23)|26)|43|24|(6:27|28|33|(0)|36|(0)(0))|26) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        
            r9 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object executeChallengeRequest(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
            ChallengeActionHandler2 challengeActionHandler2;
            Default r2;
            Default r0;
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            if (continuation instanceof ChallengeActionHandler2) {
                challengeActionHandler2 = (ChallengeActionHandler2) continuation;
                int i = challengeActionHandler2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    challengeActionHandler2.label = i - Integer.MIN_VALUE;
                } else {
                    challengeActionHandler2 = new ChallengeActionHandler2(this, continuation);
                }
            }
            Object objExecute = challengeActionHandler2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = challengeActionHandler2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objExecute);
                long j = CREQ_DELAY;
                challengeActionHandler2.L$0 = this;
                challengeActionHandler2.L$1 = challengeRequestData;
                challengeActionHandler2.label = 1;
                if (DelayKt.delay(j, challengeActionHandler2) != coroutine_suspended) {
                    r2 = this;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                challengeRequestData = (ChallengeRequestData) challengeActionHandler2.L$1;
                r0 = (Default) challengeActionHandler2.L$0;
                try {
                    ResultKt.throwOnFailure(objExecute);
                    objM28550constructorimpl = Result.m28550constructorimpl((ChallengeRequestResult) objExecute);
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl2 != null) {
                    }
                }
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                    r0.errorReporter.reportError(new RuntimeException(StringsKt.trimIndent("\n                            Failed to execute challenge request.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                        "), thM28553exceptionOrNullimpl));
                }
                Throwable thM28553exceptionOrNullimpl22 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                return thM28553exceptionOrNullimpl22 != null ? objM28550constructorimpl : new ChallengeRequestResult.RuntimeError(thM28553exceptionOrNullimpl22);
            }
            challengeRequestData = (ChallengeRequestData) challengeActionHandler2.L$1;
            r2 = (Default) challengeActionHandler2.L$0;
            ResultKt.throwOnFailure(objExecute);
            Result.Companion companion2 = Result.INSTANCE;
            ChallengeRequestExecutor challengeRequestExecutor = r2.challengeRequestExecutor;
            challengeActionHandler2.L$0 = r2;
            challengeActionHandler2.L$1 = challengeRequestData;
            challengeActionHandler2.label = 2;
            objExecute = challengeRequestExecutor.execute(challengeRequestData, challengeActionHandler2);
            if (objExecute != coroutine_suspended) {
                r0 = r2;
                objM28550constructorimpl = Result.m28550constructorimpl((ChallengeRequestResult) objExecute);
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                Throwable thM28553exceptionOrNullimpl222 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl222 != null) {
                }
            }
            return coroutine_suspended;
        }
    }
}
