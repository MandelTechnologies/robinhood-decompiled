package com.stripe.android;

import androidx.fragment.app.FragmentActivity;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.exception.CardException;
import com.stripe.android.hcaptcha.HCaptchaInterface;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.RadarSession;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.Token;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StripeKtx.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a \u0010\u0011\u001a\u00020\u0010*\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/Stripe;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "", "idempotencyKey", "stripeAccountId", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/Token;", "createCardToken", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/stripe/android/model/RadarSession;", "createRadarSession", "(Lcom/stripe/android/Stripe;Landroidx/fragment/app/FragmentActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.StripeKtxKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class StripeKtx {

    /* compiled from: StripeKtx.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.StripeKtxKt", m3645f = "StripeKtx.kt", m3646l = {109}, m3647m = "createPaymentMethod")
    /* renamed from: com.stripe.android.StripeKtxKt$createPaymentMethod$1 */
    static final class C425051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C425051(Continuation<? super C425051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtx.createPaymentMethod(null, null, null, null, this);
        }
    }

    /* compiled from: StripeKtx.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.StripeKtxKt", m3645f = "StripeKtx.kt", m3646l = {491, 508, 514}, m3647m = "createRadarSession")
    /* renamed from: com.stripe.android.StripeKtxKt$createRadarSession$1 */
    static final class C425061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C425061(Continuation<? super C425061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeKtx.createRadarSession(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createPaymentMethod(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super PaymentMethod> continuation) throws StripeException {
        C425051 c425051;
        Object objMo26876createPaymentMethod0E7RQCE;
        if (continuation instanceof C425051) {
            c425051 = (C425051) continuation;
            int i = c425051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425051.label = i - Integer.MIN_VALUE;
            } else {
                c425051 = new C425051(continuation);
            }
        }
        Object obj = c425051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425051.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), str2, str);
            c425051.label = 1;
            objMo26876createPaymentMethod0E7RQCE = stripeRepository.mo26876createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, c425051);
            if (objMo26876createPaymentMethod0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo26876createPaymentMethod0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo26876createPaymentMethod0E7RQCE);
        if (thM28553exceptionOrNullimpl == null) {
            return (StripeModel) objMo26876createPaymentMethod0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM28553exceptionOrNullimpl);
    }

    public static /* synthetic */ Object createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createPaymentMethod(stripe, paymentMethodCreateParams, str, str2, continuation);
    }

    public static /* synthetic */ Object createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, Continuation continuation, int i, Object obj) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId();
        }
        return createCardToken(stripe, cardParams, str, str2, continuation);
    }

    public static final Object createCardToken(Stripe stripe, CardParams cardParams, String str, String str2, Continuation<? super Token> continuation) throws CardException, InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        return stripe.createTokenOrThrow$payments_core_release(cardParams, str2, str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e5, code lost:
    
        if (r15 != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createRadarSession(Stripe stripe, FragmentActivity fragmentActivity, Continuation<? super RadarSession> continuation) throws StripeException {
        C425061 c425061;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        FragmentActivity fragmentActivity2;
        Object objMo26877createRadarSessiongIAlus;
        Object objM28550constructorimpl2;
        Stripe stripe2;
        RadarSessionWithHCaptcha radarSessionWithHCaptcha;
        if (continuation instanceof C425061) {
            c425061 = (C425061) continuation;
            int i = c425061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425061.label = i - Integer.MIN_VALUE;
            } else {
                c425061 = new C425061(continuation);
            }
        }
        C425061 c4250612 = c425061;
        Object obj = c4250612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4250612.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = stripe.getStripeRepository();
            ApiRequest.Options options = new ApiRequest.Options(stripe.getPublishableKey(), stripe.getStripeAccountId(), null, 4, null);
            c4250612.L$0 = stripe;
            fragmentActivity2 = fragmentActivity;
            c4250612.L$1 = fragmentActivity2;
            c4250612.label = 1;
            objMo26877createRadarSessiongIAlus = stripeRepository.mo26877createRadarSessiongIAlus(options, c4250612);
            if (objMo26877createRadarSessiongIAlus != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            FragmentActivity fragmentActivity3 = (FragmentActivity) c4250612.L$1;
            Stripe stripe3 = (Stripe) c4250612.L$0;
            ResultKt.throwOnFailure(obj);
            objMo26877createRadarSessiongIAlus = ((Result) obj).getValue();
            fragmentActivity2 = fragmentActivity3;
            stripe = stripe3;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM28550constructorimpl2 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(objM28550constructorimpl2);
                objM28550constructorimpl = Result.m28550constructorimpl(objM28550constructorimpl2);
                Object objM28550constructorimpl3 = Result.m28556isSuccessimpl(objM28550constructorimpl) ? Result.m28550constructorimpl(new RadarSession(((RadarSessionWithHCaptcha) objM28550constructorimpl).getId())) : Result.m28550constructorimpl(objM28550constructorimpl);
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl3);
                if (thM28553exceptionOrNullimpl == null) {
                    return (StripeModel) objM28550constructorimpl3;
                }
                throw StripeException.INSTANCE.create(thM28553exceptionOrNullimpl);
            }
            radarSessionWithHCaptcha = (RadarSessionWithHCaptcha) c4250612.L$1;
            stripe2 = (Stripe) c4250612.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            Stripe stripe4 = stripe2;
            StripeRepository stripeRepository2 = stripe4.getStripeRepository();
            String id = radarSessionWithHCaptcha.getId();
            ApiRequest.Options options2 = new ApiRequest.Options(stripe4.getPublishableKey(), stripe4.getStripeAccountId(), null, 4, null);
            c4250612.L$0 = null;
            c4250612.L$1 = null;
            c4250612.label = 3;
            objM28550constructorimpl2 = stripeRepository2.mo26868attachHCaptchaToRadarSessionyxL6bBk(id, str, null, options2, c4250612);
        }
        if (!Result.m28556isSuccessimpl(objMo26877createRadarSessiongIAlus)) {
            objM28550constructorimpl = Result.m28550constructorimpl(objMo26877createRadarSessiongIAlus);
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            }
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl3);
            if (thM28553exceptionOrNullimpl == null) {
            }
        } else {
            RadarSessionWithHCaptcha radarSessionWithHCaptcha2 = (RadarSessionWithHCaptcha) objMo26877createRadarSessiongIAlus;
            String passiveCaptchaSiteKey = radarSessionWithHCaptcha2.getPassiveCaptchaSiteKey();
            if (passiveCaptchaSiteKey == null || passiveCaptchaSiteKey.length() == 0 || fragmentActivity2 == null) {
                objM28550constructorimpl2 = Result.m28550constructorimpl(radarSessionWithHCaptcha2);
                ResultKt.throwOnFailure(objM28550constructorimpl2);
                objM28550constructorimpl = Result.m28550constructorimpl(objM28550constructorimpl2);
                if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                }
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl3);
                if (thM28553exceptionOrNullimpl == null) {
                }
            } else {
                String passiveCaptchaRqdata = radarSessionWithHCaptcha2.getPassiveCaptchaRqdata();
                c4250612.L$0 = stripe;
                c4250612.L$1 = radarSessionWithHCaptcha2;
                c4250612.label = 2;
                Object objPerformPassiveHCaptcha = HCaptchaInterface.performPassiveHCaptcha(fragmentActivity2, passiveCaptchaSiteKey, passiveCaptchaRqdata, c4250612);
                if (objPerformPassiveHCaptcha == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripe2 = stripe;
                radarSessionWithHCaptcha = radarSessionWithHCaptcha2;
                obj = objPerformPassiveHCaptcha;
                String str2 = (String) obj;
                Stripe stripe42 = stripe2;
                StripeRepository stripeRepository22 = stripe42.getStripeRepository();
                String id2 = radarSessionWithHCaptcha.getId();
                ApiRequest.Options options22 = new ApiRequest.Options(stripe42.getPublishableKey(), stripe42.getStripeAccountId(), null, 4, null);
                c4250612.L$0 = null;
                c4250612.L$1 = null;
                c4250612.label = 3;
                objM28550constructorimpl2 = stripeRepository22.mo26868attachHCaptchaToRadarSessionyxL6bBk(id2, str2, null, options22, c4250612);
            }
        }
    }

    public static /* synthetic */ Object createRadarSession$default(Stripe stripe, FragmentActivity fragmentActivity, Continuation continuation, int i, Object obj) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        if ((i & 1) != 0) {
            fragmentActivity = null;
        }
        return createRadarSession(stripe, fragmentActivity, continuation);
    }
}
