package com.stripe.android.stripe3ds2.transaction;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: TransactionTimer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\r\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J\u0011\u0010\u0017\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "timeoutMinutes", "", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(ILcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;)V", "mutableTimeoutFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "timeout", "Lkotlinx/coroutines/flow/StateFlow;", "getTimeout", "()Lkotlinx/coroutines/flow/StateFlow;", "timeoutMillis", "", "createTimeoutErrorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "onTimeout", "", "onTimeout$3ds2sdk_release", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer, reason: use source file name */
/* loaded from: classes26.dex */
public final class TransactionTimer2 implements TransactionTimer {
    private final ChallengeRequestData creqData;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final StateFlow2<Boolean> mutableTimeoutFlow;
    private final StateFlow<Boolean> timeout;
    private final long timeoutMillis;

    /* compiled from: TransactionTimer.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer", m3645f = "TransactionTimer.kt", m3646l = {35}, m3647m = "start")
    /* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer$start$1 */
    static final class C426221 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C426221(Continuation<? super C426221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionTimer2.this.start(this);
        }
    }

    public TransactionTimer2(int i, ErrorRequestExecutor errorRequestExecutor, ChallengeRequestData creqData) {
        Intrinsics.checkNotNullParameter(errorRequestExecutor, "errorRequestExecutor");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        this.errorRequestExecutor = errorRequestExecutor;
        this.creqData = creqData;
        this.timeoutMillis = TimeUnit.MINUTES.toMillis(i);
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this.mutableTimeoutFlow = stateFlow2MutableStateFlow;
        this.timeout = stateFlow2MutableStateFlow;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public StateFlow<Boolean> getTimeout() {
        return this.timeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(Continuation<? super Unit> continuation) {
        C426221 c426221;
        TransactionTimer2 transactionTimer2;
        if (continuation instanceof C426221) {
            c426221 = (C426221) continuation;
            int i = c426221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c426221.label = i - Integer.MIN_VALUE;
            } else {
                c426221 = new C426221(continuation);
            }
        }
        Object obj = c426221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c426221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.timeoutMillis;
            c426221.L$0 = this;
            c426221.label = 1;
            if (DelayKt.delay(j, c426221) == coroutine_suspended) {
                return coroutine_suspended;
            }
            transactionTimer2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transactionTimer2 = (TransactionTimer2) c426221.L$0;
            ResultKt.throwOnFailure(obj);
        }
        transactionTimer2.onTimeout$3ds2sdk_release();
        return Unit.INSTANCE;
    }

    public final void onTimeout$3ds2sdk_release() {
        this.errorRequestExecutor.executeAsync(createTimeoutErrorData());
        this.mutableTimeoutFlow.setValue(Boolean.TRUE);
    }

    private final ErrorData createTimeoutErrorData() {
        String threeDsServerTransId = this.creqData.getThreeDsServerTransId();
        String acsTransId = this.creqData.getAcsTransId();
        ProtocolError protocolError = ProtocolError.TransactionTimedout;
        return new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Timeout expiry reached for the transaction", null, this.creqData.getMessageVersion(), this.creqData.getSdkTransId(), EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, null);
    }
}
