package com.stripe.android.payments.core.authentication.threeds2;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel2;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 [2\u00020\u0001:\u0001[Be\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ<\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0086@¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b5\u00106J0\u0010;\u001a\u00020\u001c2\u0006\u00107\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00108\u001a\u00020*2\u0006\u0010$\u001a\u00020#H\u0081@¢\u0006\u0004\b9\u0010:J\u0018\u0010>\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020<H\u0086@¢\u0006\u0004\b>\u0010?J0\u0010F\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010 \u001a\u00020\u001f2\u0006\u00108\u001a\u00020*2\u0006\u0010B\u001a\u00020#H\u0081@¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010IR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010NR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010OR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010PR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010QR\"\u0010R\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010Q\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0017\u0010W\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "args", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "threeDs2Service", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "challengeResultProcessor", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "initChallengeRepository", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "", "isInstantApp", "<init>", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Z)V", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "stripe3ds2Fingerprint", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "begin3ds2Auth", "(Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "transaction", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "timeout", "Lkotlin/Result;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "perform3ds2AuthenticationRequest-yxL6bBk", "(Lcom/stripe/android/stripe3ds2/transaction/Transaction;Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "perform3ds2AuthenticationRequest", "", "fallbackRedirectUrl", "on3ds2AuthFallback", "(Ljava/lang/String;)Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "startFrictionlessFlow", "()Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "challengeResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "processChallengeResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Flow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "sourceId", "on3ds2AuthSuccess$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "on3ds2AuthSuccess", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "initChallenge", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "ares", "maxTimeout", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "startChallengeFlow$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChallengeFlow", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/SavedStateHandle;", "Z", "hasCompleted", "getHasCompleted", "()Z", "setHasCompleted", "(Z)V", "threeDS2RequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getThreeDS2RequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class Stripe3ds2TransactionViewModel extends ViewModel {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Stripe3ds2TransactionContract.Args args;
    private final Stripe3ds2ChallengeResultProcessor challengeResultProcessor;
    private boolean hasCompleted;
    private final InitChallengeRepository initChallengeRepository;
    private final boolean isInstantApp;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeRepository;
    private final ApiRequest.Options threeDS2RequestOptions;
    private final StripeThreeDs2Service threeDs2Service;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", m3645f = "Stripe3ds2TransactionViewModel.kt", m3646l = {108, 115}, m3647m = "begin3ds2Auth")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$begin3ds2Auth$1 */
    static final class C425911 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C425911(Continuation<? super C425911> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2TransactionViewModel.this.begin3ds2Auth(null, this);
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", m3645f = "Stripe3ds2TransactionViewModel.kt", m3646l = {73}, m3647m = "start3ds2Flow")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1 */
    static final class C425941 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C425941(Continuation<? super C425941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2TransactionViewModel.this.start3ds2Flow(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Stripe3ds2TransactionViewModel(Stripe3ds2TransactionContract.Args args, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2Service threeDs2Service, MessageVersionRegistry messageVersionRegistry, Stripe3ds2ChallengeResultProcessor challengeResultProcessor, InitChallengeRepository initChallengeRepository, CoroutineContext workContext, SavedStateHandle savedStateHandle, boolean z) {
        ApiRequest.Options requestOptions;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(threeDs2Service, "threeDs2Service");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(challengeResultProcessor, "challengeResultProcessor");
        Intrinsics.checkNotNullParameter(initChallengeRepository, "initChallengeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = threeDs2Service;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = challengeResultProcessor;
        this.initChallengeRepository = initChallengeRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z;
        this.hasCompleted = savedStateHandle.contains("key_next_step");
        String publishableKey = args.getNextActionData().getPublishableKey();
        if (publishableKey == null) {
            requestOptions = args.getRequestOptions();
        } else {
            String str = publishableKey.length() <= 0 ? null : publishableKey;
            if (str != null) {
                requestOptions = new ApiRequest.Options(str, null, null, 6, null);
            }
        }
        this.threeDS2RequestOptions = requestOptions;
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final ApiRequest.Options getThreeDS2RequestOptions() {
        return this.threeDS2RequestOptions;
    }

    public final Object processChallengeResult(ChallengeResult challengeResult, Continuation<? super Unvalidated> continuation) {
        return this.challengeResultProcessor.process(challengeResult, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start3ds2Flow(Continuation<? super Stripe3ds2TransactionViewModel2> continuation) {
        C425941 c425941;
        Throwable th;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C425941) {
            c425941 = (C425941) continuation;
            int i = c425941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425941.label = i - Integer.MIN_VALUE;
            } else {
                c425941 = new C425941(continuation);
            }
        }
        Object objBegin3ds2Auth = c425941.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objBegin3ds2Auth);
            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, null, 62, null));
            try {
                Result.Companion companion = Result.INSTANCE;
                Stripe3ds2Fingerprint stripe3ds2Fingerprint = new Stripe3ds2Fingerprint(this.args.getNextActionData());
                c425941.L$0 = this;
                c425941.label = 1;
                objBegin3ds2Auth = begin3ds2Auth(stripe3ds2Fingerprint, c425941);
                if (objBegin3ds2Auth == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripe3ds2TransactionViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                stripe3ds2TransactionViewModel = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                stripe3ds2TransactionViewModel.savedStateHandle.set("key_next_step", boxing.boxBoolean(true));
                stripe3ds2TransactionViewModel.hasCompleted = true;
                return objM28550constructorimpl;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) c425941.L$0;
            try {
                ResultKt.throwOnFailure(objBegin3ds2Auth);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl != null) {
                }
                stripe3ds2TransactionViewModel.savedStateHandle.set("key_next_step", boxing.boxBoolean(true));
                stripe3ds2TransactionViewModel.hasCompleted = true;
                return objM28550constructorimpl;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((Stripe3ds2TransactionViewModel2) objBegin3ds2Auth);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            stripe3ds2TransactionViewModel.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripe3ds2TransactionViewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, null, 62, null));
            String str = null;
            int i3 = 0;
            objM28550constructorimpl = new Stripe3ds2TransactionViewModel2.Complete(new Unvalidated(str, i3, StripeException.INSTANCE.create(thM28553exceptionOrNullimpl), false, null, null, null, 123, null));
        }
        stripe3ds2TransactionViewModel.savedStateHandle.set("key_next_step", boxing.boxBoolean(true));
        stripe3ds2TransactionViewModel.hasCompleted = true;
        return objM28550constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r1 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object begin3ds2Auth(Stripe3ds2Fingerprint stripe3ds2Fingerprint, Continuation<? super Stripe3ds2TransactionViewModel2> continuation) {
        C425911 c425911;
        Transaction transaction;
        Object value;
        int i;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        Stripe3ds2Fingerprint stripe3ds2Fingerprint2;
        if (continuation instanceof C425911) {
            c425911 = (C425911) continuation;
            int i2 = c425911.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c425911.label = i2 - Integer.MIN_VALUE;
            } else {
                c425911 = new C425911(continuation);
            }
        }
        C425911 c4259112 = c425911;
        Object objOn3ds2AuthSuccess$payments_core_release = c4259112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c4259112.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
            Transaction transactionCreateTransaction = this.threeDs2Service.createTransaction(this.args.getSdkTransactionId(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerId(), this.messageVersionRegistry.getCurrent(), this.args.getStripeIntent().getIsLiveMode(), stripe3ds2Fingerprint.getDirectoryServerName(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getRootCerts(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerPublicKey(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getKeyId(), this.args.getConfig().getUiCustomization().getUiCustomization());
            int timeout = this.args.getConfig().getTimeout();
            ApiRequest.Options options = this.threeDS2RequestOptions;
            c4259112.L$0 = this;
            c4259112.L$1 = stripe3ds2Fingerprint;
            c4259112.L$2 = transactionCreateTransaction;
            c4259112.I$0 = timeout;
            c4259112.label = 1;
            Object objM26928perform3ds2AuthenticationRequestyxL6bBk = m26928perform3ds2AuthenticationRequestyxL6bBk(transactionCreateTransaction, stripe3ds2Fingerprint, options, timeout, c4259112);
            if (objM26928perform3ds2AuthenticationRequestyxL6bBk != coroutine_suspended) {
                transaction = transactionCreateTransaction;
                value = objM26928perform3ds2AuthenticationRequestyxL6bBk;
                i = timeout;
                stripe3ds2TransactionViewModel = this;
                stripe3ds2Fingerprint2 = stripe3ds2Fingerprint;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
            return (Stripe3ds2TransactionViewModel2) objOn3ds2AuthSuccess$payments_core_release;
        }
        int i4 = c4259112.I$0;
        Transaction transaction2 = (Transaction) c4259112.L$2;
        stripe3ds2Fingerprint2 = (Stripe3ds2Fingerprint) c4259112.L$1;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel2 = (Stripe3ds2TransactionViewModel) c4259112.L$0;
        ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
        value = ((Result) objOn3ds2AuthSuccess$payments_core_release).getValue();
        transaction = transaction2;
        stripe3ds2TransactionViewModel = stripe3ds2TransactionViewModel2;
        i = i4;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl == null) {
            String source = stripe3ds2Fingerprint2.getSource();
            c4259112.L$0 = null;
            c4259112.L$1 = null;
            c4259112.L$2 = null;
            c4259112.label = 2;
            objOn3ds2AuthSuccess$payments_core_release = stripe3ds2TransactionViewModel.on3ds2AuthSuccess$payments_core_release((Stripe3ds2AuthResult) value, transaction, source, i, c4259112);
        } else {
            return new Stripe3ds2TransactionViewModel2.Complete(new Unvalidated(null, 0, StripeException.INSTANCE.create(thM28553exceptionOrNullimpl), false, null, null, null, 123, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: perform3ds2AuthenticationRequest-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26928perform3ds2AuthenticationRequestyxL6bBk(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, int i, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        Stripe3ds2TransactionViewModel3 stripe3ds2TransactionViewModel3;
        if (continuation instanceof Stripe3ds2TransactionViewModel3) {
            stripe3ds2TransactionViewModel3 = (Stripe3ds2TransactionViewModel3) continuation;
            int i2 = stripe3ds2TransactionViewModel3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripe3ds2TransactionViewModel3.label = i2 - Integer.MIN_VALUE;
            } else {
                stripe3ds2TransactionViewModel3 = new Stripe3ds2TransactionViewModel3(this, continuation);
            }
        }
        Stripe3ds2TransactionViewModel3 stripe3ds2TransactionViewModel32 = stripe3ds2TransactionViewModel3;
        Object objWithContext = stripe3ds2TransactionViewModel32.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = stripe3ds2TransactionViewModel32.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            Stripe3ds2TransactionViewModel4 stripe3ds2TransactionViewModel4 = new Stripe3ds2TransactionViewModel4(transaction, stripe3ds2Fingerprint, i, this, options, null);
            stripe3ds2TransactionViewModel32.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, stripe3ds2TransactionViewModel4, stripe3ds2TransactionViewModel32);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object on3ds2AuthSuccess$payments_core_release(Stripe3ds2AuthResult stripe3ds2AuthResult, Transaction transaction, String str, int i, Continuation<? super Stripe3ds2TransactionViewModel2> continuation) {
        String strJoinToString$default;
        Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.getAres();
        if (ares != null) {
            if (ares.isChallenge()) {
                Object objStartChallengeFlow$payments_core_release = startChallengeFlow$payments_core_release(ares, transaction, str, i, continuation);
                return objStartChallengeFlow$payments_core_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartChallengeFlow$payments_core_release : (Stripe3ds2TransactionViewModel2) objStartChallengeFlow$payments_core_release;
            }
            return startFrictionlessFlow();
        }
        if (stripe3ds2AuthResult.getFallbackRedirectUrl() != null) {
            return on3ds2AuthFallback(stripe3ds2AuthResult.getFallbackRedirectUrl());
        }
        Stripe3ds2AuthResult.ThreeDS2Error error = stripe3ds2AuthResult.getError();
        if (error != null) {
            strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"Code: " + error.getErrorCode(), "Detail: " + error.getErrorDetail(), "Description: " + error.getErrorDescription(), "Component: " + error.getErrorComponent()}), ", ", null, null, 0, null, null, 62, null);
            if (strJoinToString$default == null) {
                strJoinToString$default = "Invalid 3DS2 authentication response";
            }
        }
        return new Stripe3ds2TransactionViewModel2.Complete(new Unvalidated(null, 0, StripeException.INSTANCE.create(new RuntimeException("Error encountered during 3DS2 authentication request. " + strJoinToString$default)), false, null, null, null, 123, null));
    }

    private final Stripe3ds2TransactionViewModel2 on3ds2AuthFallback(String fallbackRedirectUrl) {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, null, 62, null));
        String id = this.args.getStripeIntent().getId();
        if (id == null) {
            id = "";
        }
        int requestCode$payments_core_release = StripePaymentController.INSTANCE.getRequestCode$payments_core_release(this.args.getStripeIntent());
        String clientSecret = this.args.getStripeIntent().getClientSecret();
        return new Stripe3ds2TransactionViewModel2.StartFallback(new PaymentBrowserAuthContract.Args(id, requestCode$payments_core_release, clientSecret != null ? clientSecret : "", fallbackRedirectUrl, null, this.args.getEnableLogging(), null, this.args.getRequestOptions().getStripeAccount(), true, false, this.args.getStatusBarColor(), this.threeDS2RequestOptions.getApiKey(), this.isInstantApp, null, false, 25152, null));
    }

    private final Stripe3ds2TransactionViewModel2 startFrictionlessFlow() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, null, 62, null));
        return new Stripe3ds2TransactionViewModel2.Complete(new Unvalidated(this.args.getStripeIntent().getClientSecret(), 0, null, false, null, null, this.args.getRequestOptions().getStripeAccount(), 62, null));
    }

    public final Object initChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        return this.initChallengeRepository.startChallenge(initChallengeArgs, continuation);
    }

    public final Object startChallengeFlow$payments_core_release(Stripe3ds2AuthResult.Ares ares, Transaction transaction, String str, int i, Continuation<? super Stripe3ds2TransactionViewModel2.StartChallenge> continuation) {
        return BuildersKt.withContext(this.workContext, new Stripe3ds2TransactionViewModel5(ares, transaction, i, this, str, null), continuation);
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$Companion;", "", "()V", "KEY_HAS_COMPLETED", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
