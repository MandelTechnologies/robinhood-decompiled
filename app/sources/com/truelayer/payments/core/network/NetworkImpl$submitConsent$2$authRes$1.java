package com.truelayer.payments.core.network;

import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.payments.AuthorizationFlowResponse;
import com.truelayer.payments.core.domain.payments.PaymentContext;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.network.mandates.api.MandatesApi;
import com.truelayer.payments.core.network.payments.api.PaymentApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(m3644c = "com.truelayer.payments.core.network.NetworkImpl$submitConsent$2$authRes$1", m3645f = "NetworkImpl.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class NetworkImpl$submitConsent$2$authRes$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>>, Object> {
    final /* synthetic */ PaymentContext $paymentContext;
    int label;
    final /* synthetic */ NetworkImpl this$0;

    /* compiled from: NetworkImpl.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentContext.PaymentType.values().length];
            try {
                iArr[PaymentContext.PaymentType.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentContext.PaymentType.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImpl$submitConsent$2$authRes$1(PaymentContext paymentContext, NetworkImpl networkImpl, Continuation<? super NetworkImpl$submitConsent$2$authRes$1> continuation) {
        super(2, continuation);
        this.$paymentContext = paymentContext;
        this.this$0 = networkImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkImpl$submitConsent$2$authRes$1(this.$paymentContext, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Outcome<? extends AuthorizationFlowResponse, ? extends CoreError>> continuation) {
        return ((NetworkImpl$submitConsent$2$authRes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (Outcome) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (Outcome) obj;
        }
        ResultKt.throwOnFailure(obj);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$paymentContext.getPaymentType().ordinal()];
        if (i2 == 1) {
            PaymentApi paymentApi = this.this$0.paymentsApi;
            String resourceToken = this.$paymentContext.getResourceToken();
            UUID idempotencyKey = this.$paymentContext.getIdempotencyKey();
            String paymentId = this.$paymentContext.getPaymentId();
            this.label = 1;
            obj = paymentApi.submitConsent(resourceToken, idempotencyKey, paymentId, this);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            MandatesApi mandatesApi = this.this$0.mandatesApi;
            String resourceToken2 = this.$paymentContext.getResourceToken();
            UUID idempotencyKey2 = this.$paymentContext.getIdempotencyKey();
            String paymentId2 = this.$paymentContext.getPaymentId();
            this.label = 2;
            obj = mandatesApi.submitConsent(resourceToken2, idempotencyKey2, paymentId2, this);
        }
        return coroutine_suspended;
    }
}
