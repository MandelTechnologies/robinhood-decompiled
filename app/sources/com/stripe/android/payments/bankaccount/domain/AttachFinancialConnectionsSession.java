package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachFinancialConnectionsSession.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "publishableKey", "", "linkedAccountSessionId", "clientSecret", "stripeAccountId", "forPaymentIntent-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "forSetupIntent-yxL6bBk", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class AttachFinancialConnectionsSession {
    private final StripeRepository stripeRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    public AttachFinancialConnectionsSession(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: forPaymentIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26919forPaymentIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<PaymentIntent>> continuation) {
        AttachFinancialConnectionsSession2 attachFinancialConnectionsSession2;
        Object objCreateFailure;
        Object objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk;
        if (continuation instanceof AttachFinancialConnectionsSession2) {
            attachFinancialConnectionsSession2 = (AttachFinancialConnectionsSession2) continuation;
            int i = attachFinancialConnectionsSession2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession2.label = i - Integer.MIN_VALUE;
            } else {
                attachFinancialConnectionsSession2 = new AttachFinancialConnectionsSession2(this, continuation);
            }
        }
        AttachFinancialConnectionsSession2 attachFinancialConnectionsSession22 = attachFinancialConnectionsSession2;
        Object obj = attachFinancialConnectionsSession22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = attachFinancialConnectionsSession22.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objCreateFailure = Result.m28550constructorimpl(new PaymentIntent.ClientSecret(str3));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objCreateFailure = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m28556isSuccessimpl(objCreateFailure)) {
                PaymentIntent.ClientSecret clientSecret = (PaymentIntent.ClientSecret) objCreateFailure;
                StripeRepository stripeRepository = this.stripeRepository;
                String value = clientSecret.getValue();
                String paymentIntentId = clientSecret.getPaymentIntentId();
                ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                List<String> list = EXPAND_PAYMENT_METHOD;
                attachFinancialConnectionsSession22.label = 1;
                objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = stripeRepository.mo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(value, paymentIntentId, str2, options, list, attachFinancialConnectionsSession22);
                if (objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Result.m28550constructorimpl(objCreateFailure);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = ((Result) obj).getValue();
        ResultKt.throwOnFailure(objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
        return Result.m28550constructorimpl((PaymentIntent) objMo26866attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: forSetupIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26920forSetupIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<SetupIntent>> continuation) {
        AttachFinancialConnectionsSession3 attachFinancialConnectionsSession3;
        Object objCreateFailure;
        Object objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk;
        if (continuation instanceof AttachFinancialConnectionsSession3) {
            attachFinancialConnectionsSession3 = (AttachFinancialConnectionsSession3) continuation;
            int i = attachFinancialConnectionsSession3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession3.label = i - Integer.MIN_VALUE;
            } else {
                attachFinancialConnectionsSession3 = new AttachFinancialConnectionsSession3(this, continuation);
            }
        }
        AttachFinancialConnectionsSession3 attachFinancialConnectionsSession32 = attachFinancialConnectionsSession3;
        Object obj = attachFinancialConnectionsSession32.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = attachFinancialConnectionsSession32.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objCreateFailure = Result.m28550constructorimpl(new SetupIntent.ClientSecret(str3));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objCreateFailure = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m28556isSuccessimpl(objCreateFailure)) {
                SetupIntent.ClientSecret clientSecret = (SetupIntent.ClientSecret) objCreateFailure;
                StripeRepository stripeRepository = this.stripeRepository;
                String value = clientSecret.getValue();
                String setupIntentId = clientSecret.getSetupIntentId();
                ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                List<String> list = EXPAND_PAYMENT_METHOD;
                attachFinancialConnectionsSession32.label = 1;
                objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk = stripeRepository.mo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk(value, setupIntentId, str2, options, list, attachFinancialConnectionsSession32);
                if (objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Result.m28550constructorimpl(objCreateFailure);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk = ((Result) obj).getValue();
        ResultKt.throwOnFailure(objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
        return Result.m28550constructorimpl((SetupIntent) objMo26867attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
    }

    /* compiled from: AttachFinancialConnectionsSession.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
