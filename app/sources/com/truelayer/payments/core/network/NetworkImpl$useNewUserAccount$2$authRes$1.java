package com.truelayer.payments.core.network;

import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.payments.api.PaymentApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NetworkImpl.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/AuthorizationFlowResponse;", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$useNewUserAccount$2$authRes$1", m3645f = "NetworkImpl.kt", m3646l = {331}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class NetworkImpl$useNewUserAccount$2$authRes$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
    final /* synthetic */ PaymentContext $paymentContext;
    int label;
    final /* synthetic */ NetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImpl$useNewUserAccount$2$authRes$1(NetworkImpl networkImpl, PaymentContext paymentContext, Continuation<? super NetworkImpl$useNewUserAccount$2$authRes$1> continuation) {
        super(2, continuation);
        this.this$0 = networkImpl;
        this.$paymentContext = paymentContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkImpl$useNewUserAccount$2$authRes$1(this.this$0, this.$paymentContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return ((NetworkImpl$useNewUserAccount$2$authRes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaymentApi paymentApi = this.this$0.paymentsApi;
        String resourceToken = this.$paymentContext.getResourceToken();
        UUID idempotencyKey = this.$paymentContext.getIdempotencyKey();
        String paymentId = this.$paymentContext.getPaymentId();
        this.label = 1;
        Object objUseNewUserAccount = paymentApi.useNewUserAccount(resourceToken, idempotencyKey, paymentId, this);
        return objUseNewUserAccount == coroutine_suspended ? coroutine_suspended : objUseNewUserAccount;
    }
}
