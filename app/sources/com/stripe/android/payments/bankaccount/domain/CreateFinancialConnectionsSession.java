package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams2;
import com.stripe.android.model.CreateFinancialConnectionsSessionParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateFinancialConnectionsSession.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Jh\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JH\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019J\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u00172\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/domain/CreateFinancialConnectionsSession;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "forDeferredPayments", "Lkotlin/Result;", "Lcom/stripe/android/model/FinancialConnectionsSession;", "publishableKey", "", "stripeAccountId", "elementsSessionId", "customerId", "onBehalfOf", "hostedSurface", "amount", "", "currency", "forDeferredPayments-tZkwj4A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forPaymentIntent", "clientSecret", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "forPaymentIntent-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "forSetupIntent-hUnOzRk", "toCreateSessionParams", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class CreateFinancialConnectionsSession {
    private final StripeRepository stripeRepository;

    public CreateFinancialConnectionsSession(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: forPaymentIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26922forPaymentIntenthUnOzRk(String str, String str2, String str3, String str4, CollectBankAccountLauncher collectBankAccountLauncher, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        CreateFinancialConnectionsSession3 createFinancialConnectionsSession3;
        Object objM28550constructorimpl;
        Object objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A;
        if (continuation instanceof CreateFinancialConnectionsSession3) {
            createFinancialConnectionsSession3 = (CreateFinancialConnectionsSession3) continuation;
            int i = createFinancialConnectionsSession3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createFinancialConnectionsSession3.label = i - Integer.MIN_VALUE;
            } else {
                createFinancialConnectionsSession3 = new CreateFinancialConnectionsSession3(this, continuation);
            }
        }
        Object obj = createFinancialConnectionsSession3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = createFinancialConnectionsSession3.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(new PaymentIntent.ClientSecret(str2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    return Result.m28550constructorimpl(objM28550constructorimpl);
                }
                StripeRepository stripeRepository = this.stripeRepository;
                String paymentIntentId = ((PaymentIntent.ClientSecret) objM28550constructorimpl).getPaymentIntentId();
                CreateFinancialConnectionsSessionParams createSessionParams = toCreateSessionParams(collectBankAccountLauncher, str2, str4);
                ApiRequest.Options options = new ApiRequest.Options(str, str3, null, 4, null);
                createFinancialConnectionsSession3.label = 1;
                objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A = stripeRepository.mo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A(paymentIntentId, createSessionParams, options, createFinancialConnectionsSession3);
                if (objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A);
            return Result.m28550constructorimpl((FinancialConnectionsSession) objMo26875createPaymentIntentFinancialConnectionsSessionBWLJW6A);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: forSetupIntent-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26923forSetupIntenthUnOzRk(String str, String str2, String str3, String str4, CollectBankAccountLauncher collectBankAccountLauncher, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        CreateFinancialConnectionsSession4 createFinancialConnectionsSession4;
        Object objM28550constructorimpl;
        Object objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A;
        if (continuation instanceof CreateFinancialConnectionsSession4) {
            createFinancialConnectionsSession4 = (CreateFinancialConnectionsSession4) continuation;
            int i = createFinancialConnectionsSession4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createFinancialConnectionsSession4.label = i - Integer.MIN_VALUE;
            } else {
                createFinancialConnectionsSession4 = new CreateFinancialConnectionsSession4(this, continuation);
            }
        }
        Object obj = createFinancialConnectionsSession4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = createFinancialConnectionsSession4.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(new SetupIntent.ClientSecret(str2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                    return Result.m28550constructorimpl(objM28550constructorimpl);
                }
                StripeRepository stripeRepository = this.stripeRepository;
                String setupIntentId = ((SetupIntent.ClientSecret) objM28550constructorimpl).getSetupIntentId();
                CreateFinancialConnectionsSessionParams createSessionParams = toCreateSessionParams(collectBankAccountLauncher, str2, str4);
                ApiRequest.Options options = new ApiRequest.Options(str, str3, null, 4, null);
                createFinancialConnectionsSession4.label = 1;
                objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A = stripeRepository.mo26878createSetupIntentFinancialConnectionsSessionBWLJW6A(setupIntentId, createSessionParams, options, createFinancialConnectionsSession4);
                if (objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A = ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A);
            return Result.m28550constructorimpl((FinancialConnectionsSession) objMo26878createSetupIntentFinancialConnectionsSessionBWLJW6A);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: forDeferredPayments-tZkwj4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26921forDeferredPaymentstZkwj4A(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Continuation<? super Result<FinancialConnectionsSession>> continuation) {
        CreateFinancialConnectionsSession2 createFinancialConnectionsSession2;
        if (continuation instanceof CreateFinancialConnectionsSession2) {
            createFinancialConnectionsSession2 = (CreateFinancialConnectionsSession2) continuation;
            int i = createFinancialConnectionsSession2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createFinancialConnectionsSession2.label = i - Integer.MIN_VALUE;
            } else {
                createFinancialConnectionsSession2 = new CreateFinancialConnectionsSession2(this, continuation);
            }
        }
        Object obj = createFinancialConnectionsSession2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = createFinancialConnectionsSession2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = new CreateFinancialConnectionsSessionForDeferredPaymentParams(str3, null, null, null, CreateFinancialConnectionsSessionForDeferredPaymentParams2.Automatic, str6, str4, str5, num, str7);
        ApiRequest.Options options = new ApiRequest.Options(str, str2, null, 4, null);
        createFinancialConnectionsSession2.label = 1;
        Object objMo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE = stripeRepository.mo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE(createFinancialConnectionsSessionForDeferredPaymentParams, options, createFinancialConnectionsSession2);
        return objMo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo26874createFinancialConnectionsSessionForDeferredPayments0E7RQCE;
    }

    private final CreateFinancialConnectionsSessionParams toCreateSessionParams(CollectBankAccountLauncher collectBankAccountLauncher, String str, String str2) {
        if (collectBankAccountLauncher instanceof CollectBankAccountLauncher.USBankAccount) {
            CollectBankAccountLauncher.USBankAccount uSBankAccount = (CollectBankAccountLauncher.USBankAccount) collectBankAccountLauncher;
            return new CreateFinancialConnectionsSessionParams.USBankAccount(str, uSBankAccount.getName(), uSBankAccount.getEmail(), str2);
        }
        if (collectBankAccountLauncher instanceof CollectBankAccountLauncher.InstantDebits) {
            return new CreateFinancialConnectionsSessionParams.InstantDebits(str, ((CollectBankAccountLauncher.InstantDebits) collectBankAccountLauncher).getEmail(), str2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
