package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.Unvalidated;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Stripe3ds2ChallengeResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "", "process", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public interface Stripe3ds2ChallengeResultProcessor {
    Object process(ChallengeResult challengeResult, Continuation<? super Unvalidated> continuation);
}
