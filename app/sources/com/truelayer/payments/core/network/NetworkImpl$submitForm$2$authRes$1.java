package com.truelayer.payments.core.network;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.experience.api.PaymentsExperienceApi;
import java.util.Map;
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
@DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitForm$2$authRes$1", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.f2778x3356acf6}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class NetworkImpl$submitForm$2$authRes$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
    final /* synthetic */ Map<String, String> $inputs;
    final /* synthetic */ PaymentContext $paymentContext;
    int label;
    final /* synthetic */ NetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImpl$submitForm$2$authRes$1(NetworkImpl networkImpl, PaymentContext paymentContext, Map<String, String> map, Continuation<? super NetworkImpl$submitForm$2$authRes$1> continuation) {
        super(2, continuation);
        this.this$0 = networkImpl;
        this.$paymentContext = paymentContext;
        this.$inputs = map;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkImpl$submitForm$2$authRes$1(this.this$0, this.$paymentContext, this.$inputs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return ((NetworkImpl$submitForm$2$authRes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaymentsExperienceApi paymentsExperienceApi = this.this$0.experienceApi;
        String resourceToken = this.$paymentContext.getResourceToken();
        String paymentId = this.$paymentContext.getPaymentId();
        UUID idempotencyKey = this.$paymentContext.getIdempotencyKey();
        Map<String, String> map = this.$inputs;
        this.label = 1;
        Object objSubmitEncryptedForm = paymentsExperienceApi.submitEncryptedForm(resourceToken, idempotencyKey, paymentId, map, this);
        return objSubmitEncryptedForm == coroutine_suspended ? coroutine_suspended : objSubmitEncryptedForm;
    }
}
