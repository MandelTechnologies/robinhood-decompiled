package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GooglePayRepository.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0012J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u001eR\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "context", "Landroid/content/Context;", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "logger", "Lcom/stripe/android/core/Logger;", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;)V", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "existingPaymentMethodRequired", "", "allowCreditCards", "paymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/core/Logger;)V", "googlePayAvailabilityClient", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "getGooglePayAvailabilityClient", "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "googlePayAvailabilityClient$delegate", "Lkotlin/Lazy;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "isReady", "Lkotlinx/coroutines/flow/Flow;", "isReadyAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository, reason: use source file name */
/* loaded from: classes8.dex */
public final class GooglePayRepository2 implements GooglePayRepository {
    private final boolean allowCreditCards;
    private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
    private final Context context;
    private final GooglePayEnvironment environment;
    private final boolean existingPaymentMethodRequired;

    /* renamed from: googlePayAvailabilityClient$delegate, reason: from kotlin metadata */
    private final Lazy googlePayAvailabilityClient;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final Logger logger;
    private final PaymentsClientFactory paymentsClientFactory;

    /* compiled from: GooglePayRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository", m3645f = "GooglePayRepository.kt", m3646l = {100}, m3647m = "isReadyAsync")
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReadyAsync$1 */
    static final class C425261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C425261(Continuation<? super C425261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayRepository2.this.isReadyAsync(this);
        }
    }

    public GooglePayRepository2(Context context, GooglePayEnvironment environment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, PaymentsClientFactory paymentsClientFactory, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(billingAddressParameters, "billingAddressParameters");
        Intrinsics.checkNotNullParameter(paymentsClientFactory, "paymentsClientFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.environment = environment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z;
        this.allowCreditCards = z2;
        this.paymentsClientFactory = paymentsClientFactory;
        this.logger = logger;
        this.googlePayJsonFactory = new GooglePayJsonFactory(context, false, 2, null);
        this.googlePayAvailabilityClient = LazyKt.lazy(new Function0<GooglePayAvailabilityClient>() { // from class: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$googlePayAvailabilityClient$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final GooglePayAvailabilityClient invoke() {
                return GooglePayRepository.INSTANCE.getGooglePayAvailabilityClientFactory().create(this.this$0.paymentsClientFactory.create(this.this$0.environment));
            }
        });
    }

    public /* synthetic */ GooglePayRepository2(Context context, GooglePayEnvironment googlePayEnvironment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, PaymentsClientFactory paymentsClientFactory, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, googlePayEnvironment, billingAddressParameters, z, z2, (i & 32) != 0 ? new PaymentsClientFactory2(context) : paymentsClientFactory, (i & 64) != 0 ? Logger.INSTANCE.noop() : logger);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GooglePayRepository2(Context context, Config googlePayConfig, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(applicationContext, googlePayConfig.getEnvironment(), Convert.convert(googlePayConfig.getBillingAddressConfig()), googlePayConfig.getExistingPaymentMethodRequired(), googlePayConfig.getAllowCreditCards(), new PaymentsClientFactory2(context), logger);
    }

    private final GooglePayAvailabilityClient getGooglePayAvailabilityClient() {
        return (GooglePayAvailabilityClient) this.googlePayAvailabilityClient.getValue();
    }

    /* compiled from: GooglePayRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReady$1", m3645f = "GooglePayRepository.kt", m3646l = {80, 80}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReady$1 */
    static final class C425251 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C425251(Continuation<? super C425251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C425251 c425251 = GooglePayRepository2.this.new C425251(continuation);
            c425251.L$0 = obj;
            return c425251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C425251) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                GooglePayRepository2 googlePayRepository2 = GooglePayRepository2.this;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = googlePayRepository2.isReadyAsync(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
    public Flow<Boolean> isReady() {
        return FlowKt.flow(new C425251(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReadyAsync(Continuation<? super Boolean> continuation) {
        C425261 c425261;
        Object objM28550constructorimpl;
        GooglePayRepository2 googlePayRepository2;
        Object objM28550constructorimpl2;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C425261) {
            c425261 = (C425261) continuation;
            int i = c425261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425261.label = i - Integer.MIN_VALUE;
            } else {
                c425261 = new C425261(continuation);
            }
        }
        Object objIsReady = c425261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsReady);
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(IsReadyToPayRequest.fromJson(this.googlePayJsonFactory.createIsReadyToPayRequest(this.billingAddressParameters, boxing.boxBoolean(this.existingPaymentMethodRequired), boxing.boxBoolean(this.allowCreditCards)).toString()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM28553exceptionOrNullimpl2 = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl2 != null) {
                this.logger.error("Google Pay json parsing failed.", thM28553exceptionOrNullimpl2);
                return boxing.boxBoolean(false);
            }
            Intrinsics.checkNotNullExpressionValue(objM28550constructorimpl, "getOrElse(...)");
            IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) objM28550constructorimpl;
            try {
                GooglePayAvailabilityClient googlePayAvailabilityClient = getGooglePayAvailabilityClient();
                c425261.L$0 = this;
                c425261.label = 1;
                objIsReady = googlePayAvailabilityClient.isReady(isReadyToPayRequest, c425261);
                if (objIsReady == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googlePayRepository2 = this;
            } catch (Throwable th2) {
                th = th2;
                googlePayRepository2 = this;
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
                if (thM28553exceptionOrNullimpl != null) {
                }
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                if (Result.m28555isFailureimpl(objM28550constructorimpl2)) {
                }
                boolean zBooleanValue = ((Boolean) objM28550constructorimpl2).booleanValue();
                googlePayRepository2.logger.info("Google Pay ready? " + zBooleanValue);
                return boxing.boxBoolean(zBooleanValue);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            googlePayRepository2 = (GooglePayRepository2) c425261.L$0;
            try {
                ResultKt.throwOnFailure(objIsReady);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion32 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
                if (thM28553exceptionOrNullimpl != null) {
                }
                Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
                if (Result.m28555isFailureimpl(objM28550constructorimpl2)) {
                }
                boolean zBooleanValue2 = ((Boolean) objM28550constructorimpl2).booleanValue();
                googlePayRepository2.logger.info("Google Pay ready? " + zBooleanValue2);
                return boxing.boxBoolean(zBooleanValue2);
            }
        }
        objM28550constructorimpl2 = Result.m28550constructorimpl(boxing.boxBoolean(((Boolean) objIsReady).booleanValue()));
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl2);
        if (thM28553exceptionOrNullimpl != null) {
            googlePayRepository2.logger.error("Google Pay check failed.", thM28553exceptionOrNullimpl);
        }
        Boolean boolBoxBoolean22 = boxing.boxBoolean(false);
        if (Result.m28555isFailureimpl(objM28550constructorimpl2)) {
            objM28550constructorimpl2 = boolBoxBoolean22;
        }
        boolean zBooleanValue22 = ((Boolean) objM28550constructorimpl2).booleanValue();
        googlePayRepository2.logger.info("Google Pay ready? " + zBooleanValue22);
        return boxing.boxBoolean(zBooleanValue22);
    }
}
