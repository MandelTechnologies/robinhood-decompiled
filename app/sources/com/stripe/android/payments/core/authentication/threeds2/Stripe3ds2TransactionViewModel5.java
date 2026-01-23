package com.stripe.android.payments.core.authentication.threeds2;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.StripePaymentController;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel2;
import com.stripe.android.stripe3ds2.transaction.ChallengeParameters;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$startChallengeFlow$2", m3645f = "Stripe3ds2TransactionViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$startChallengeFlow$2, reason: use source file name */
/* loaded from: classes22.dex */
final class Stripe3ds2TransactionViewModel5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Stripe3ds2TransactionViewModel2.StartChallenge>, Object> {
    final /* synthetic */ Stripe3ds2AuthResult.Ares $ares;
    final /* synthetic */ int $maxTimeout;
    final /* synthetic */ String $sourceId;
    final /* synthetic */ Transaction $transaction;
    int label;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe3ds2TransactionViewModel5(Stripe3ds2AuthResult.Ares ares, Transaction transaction, int i, Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, String str, Continuation<? super Stripe3ds2TransactionViewModel5> continuation) {
        super(2, continuation);
        this.$ares = ares;
        this.$transaction = transaction;
        this.$maxTimeout = i;
        this.this$0 = stripe3ds2TransactionViewModel;
        this.$sourceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe3ds2TransactionViewModel5(this.$ares, this.$transaction, this.$maxTimeout, this.this$0, this.$sourceId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Stripe3ds2TransactionViewModel2.StartChallenge> continuation) {
        return ((Stripe3ds2TransactionViewModel5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long cHALLENGE_DELAY$payments_core_release = StripePaymentController.INSTANCE.getCHALLENGE_DELAY$payments_core_release();
            this.label = 1;
            if (DelayKt.delay(cHALLENGE_DELAY$payments_core_release, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ChallengeParameters challengeParameters = new ChallengeParameters(this.$ares.getThreeDSServerTransId(), this.$ares.getAcsTransId(), null, this.$ares.getAcsSignedContent(), null, 20, null);
        Transaction transaction = this.$transaction;
        int i2 = this.$maxTimeout;
        String clientSecret = this.this$0.args.getStripeIntent().getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        return new Stripe3ds2TransactionViewModel2.StartChallenge(transaction.createInitChallengeArgs(challengeParameters, i2, new IntentData(clientSecret, this.$sourceId, this.this$0.getThreeDS2RequestOptions().getApiKey(), this.this$0.getThreeDS2RequestOptions().getStripeAccount())));
    }
}
