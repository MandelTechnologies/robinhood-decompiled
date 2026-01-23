package com.stripe.android.payments.core.authentication.threeds2;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2", m3645f = "Stripe3ds2TransactionViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2, reason: use source file name */
/* loaded from: classes22.dex */
final class Stripe3ds2TransactionViewModel4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Stripe3ds2AuthResult>>, Object> {
    final /* synthetic */ ApiRequest.Options $requestOptions;
    final /* synthetic */ Stripe3ds2Fingerprint $stripe3ds2Fingerprint;
    final /* synthetic */ int $timeout;
    final /* synthetic */ Transaction $transaction;
    int label;
    final /* synthetic */ Stripe3ds2TransactionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe3ds2TransactionViewModel4(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, int i, Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel, ApiRequest.Options options, Continuation<? super Stripe3ds2TransactionViewModel4> continuation) {
        super(2, continuation);
        this.$transaction = transaction;
        this.$stripe3ds2Fingerprint = stripe3ds2Fingerprint;
        this.$timeout = i;
        this.this$0 = stripe3ds2TransactionViewModel;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe3ds2TransactionViewModel4(this.$transaction, this.$stripe3ds2Fingerprint, this.$timeout, this.this$0, this.$requestOptions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Stripe3ds2AuthResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Stripe3ds2AuthResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        return ((Stripe3ds2TransactionViewModel4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objMo26888start3ds2Auth0E7RQCE;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Transaction transaction = this.$transaction;
            this.label = 1;
            obj = transaction.createAuthenticationRequestParameters(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo26888start3ds2Auth0E7RQCE = ((Result) obj).getValue();
            return Result.m28549boximpl(objMo26888start3ds2Auth0E7RQCE);
        }
        ResultKt.throwOnFailure(obj);
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
        Stripe3ds2AuthParams stripe3ds2AuthParams = new Stripe3ds2AuthParams(this.$stripe3ds2Fingerprint.getSource(), authenticationRequestParameters.getSdkAppId(), authenticationRequestParameters.getSdkReferenceNumber(), authenticationRequestParameters.getSdkTransactionId().getValue(), authenticationRequestParameters.getDeviceData(), authenticationRequestParameters.getSdkEphemeralPublicKey(), authenticationRequestParameters.getMessageVersion(), this.$timeout, null);
        StripeRepository stripeRepository = this.this$0.stripeRepository;
        ApiRequest.Options options = this.$requestOptions;
        this.label = 2;
        objMo26888start3ds2Auth0E7RQCE = stripeRepository.mo26888start3ds2Auth0E7RQCE(stripe3ds2AuthParams, options, this);
    }
}
