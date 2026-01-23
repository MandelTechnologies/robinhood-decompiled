package com.stripe.android;

import android.content.Context;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Token;
import com.stripe.android.model.TokenParams;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Stripe.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB?\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u000b\u0010\u0014B3\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0015B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\u0016JK\u0010 \u001a\u00020\u001f\"\b\b\u0000\u0010\u0018*\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J6\u0010#\u001a\u00020\u001f\"\b\b\u0000\u0010\u0018*\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0082@¢\u0006\u0004\b#\u0010$J=\u0010)\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020(0\u0019H\u0007¢\u0006\u0004\b)\u0010*J.\u00100\u001a\u00020-2\u0006\u0010,\u001a\u00020+2\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0006H\u0080@¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b;\u00109¨\u0006="}, m3636d2 = {"Lcom/stripe/android/Stripe;", "", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/PaymentController;", "paymentController", "", "publishableKey", "stripeAccountId", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "Landroid/content/Context;", "context", "", "enableLogging", "", "Lcom/stripe/android/StripeApiBeta;", "betas", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "(Landroid/content/Context;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Z)V", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/core/model/StripeModel;", "T", "Lcom/stripe/android/ApiResultCallback;", "callback", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "apiMethod", "", "executeAsyncForResult", "(Lcom/stripe/android/ApiResultCallback;Lkotlin/jvm/functions/Function1;)V", "result", "dispatchResult", "(Ljava/lang/Object;Lcom/stripe/android/ApiResultCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "idempotencyKey", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/ApiResultCallback;)V", "Lcom/stripe/android/model/TokenParams;", "tokenParams", "Lcom/stripe/android/model/Token;", "createTokenOrThrow$payments_core_release", "(Lcom/stripe/android/model/TokenParams;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTokenOrThrow", "Lcom/stripe/android/networking/StripeRepository;", "getStripeRepository$payments_core_release", "()Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/PaymentController;", "getPaymentController$payments_core_release", "()Lcom/stripe/android/PaymentController;", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "()Ljava/lang/String;", "Lkotlin/coroutines/CoroutineContext;", "getPublishableKey$payments_core_release", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Stripe {
    private static AppInfo appInfo;
    private final PaymentController paymentController;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    public static final String API_VERSION = ApiVersion.INSTANCE.get().getCode();
    private static boolean advancedFraudSignalsEnabled = true;

    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.publishableKey = new ApiKeyValidator().requireValid(publishableKey);
    }

    /* renamed from: getStripeRepository$payments_core_release, reason: from getter */
    public final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    /* renamed from: getStripeAccountId$payments_core_release, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    /* renamed from: getPublishableKey$payments_core_release, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public /* synthetic */ Stripe(Context context, String str, String str2, boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (Set<? extends StripeApiBeta>) ((i & 16) != 0 ? SetsKt.emptySet() : set));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public Stripe(Context context, final String publishableKey, String str, boolean z, Set<? extends StripeApiBeta> betas) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(betas, "betas");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        this(applicationContext, new StripeApiRepository(applicationContext2, new Function0<String>() { // from class: com.stripe.android.Stripe.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return publishableKey;
            }
        }, appInfo, Logger.INSTANCE.getInstance(z), null, null, null, null, null, null, null, null, betas, null, null, 28656, null), ApiKeyValidator.INSTANCE.get().requireValid(publishableKey), str, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Stripe(Context context, StripeRepository stripeRepository, final String str, String str2, boolean z) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(stripeRepository, new StripePaymentController(applicationContext, new Function0<String>() { // from class: com.stripe.android.Stripe.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return str;
            }
        }, stripeRepository, z, null, null, null, null, null, 496, null), str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe(StripeRepository stripeRepository, PaymentController paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, Dispatchers.getIO());
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
    }

    public static /* synthetic */ void createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, ApiResultCallback apiResultCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.stripeAccountId;
        }
        stripe.createPaymentMethod(paymentMethodCreateParams, str, str2, apiResultCallback);
    }

    /* compiled from: Stripe.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.Stripe$createPaymentMethod$1", m3645f = "Stripe.kt", m3646l = {779}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.Stripe$createPaymentMethod$1 */
    static final class C425021 extends ContinuationImpl7 implements Function1<Continuation<? super Result<? extends PaymentMethod>>, Object> {
        final /* synthetic */ String $idempotencyKey;
        final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425021(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super C425021> continuation) {
            super(1, continuation);
            this.$paymentMethodCreateParams = paymentMethodCreateParams;
            this.$stripeAccountId = str;
            this.$idempotencyKey = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return Stripe.this.new C425021(this.$paymentMethodCreateParams, this.$stripeAccountId, this.$idempotencyKey, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends PaymentMethod>> continuation) {
            return invoke2((Continuation<? super Result<PaymentMethod>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<PaymentMethod>> continuation) {
            return ((C425021) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objMo26876createPaymentMethod0E7RQCE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StripeRepository stripeRepository = Stripe.this.getStripeRepository();
                PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
                ApiRequest.Options options = new ApiRequest.Options(Stripe.this.getPublishableKey(), this.$stripeAccountId, this.$idempotencyKey);
                this.label = 1;
                objMo26876createPaymentMethod0E7RQCE = stripeRepository.mo26876createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, this);
                if (objMo26876createPaymentMethod0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo26876createPaymentMethod0E7RQCE = ((Result) obj).getValue();
            }
            return Result.m28549boximpl(objMo26876createPaymentMethod0E7RQCE);
        }
    }

    @JvmOverloads
    public final void createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams, String idempotencyKey, String stripeAccountId, ApiResultCallback<? super PaymentMethod> callback) {
        Intrinsics.checkNotNullParameter(paymentMethodCreateParams, "paymentMethodCreateParams");
        Intrinsics.checkNotNullParameter(callback, "callback");
        executeAsyncForResult(callback, new C425021(paymentMethodCreateParams, stripeAccountId, idempotencyKey, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTokenOrThrow$payments_core_release(TokenParams tokenParams, String str, String str2, Continuation<? super Token> continuation) throws StripeException {
        Stripe2 stripe2;
        Object objMo26879createToken0E7RQCE;
        if (continuation instanceof Stripe2) {
            stripe2 = (Stripe2) continuation;
            int i = stripe2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripe2.label = i - Integer.MIN_VALUE;
            } else {
                stripe2 = new Stripe2(this, continuation);
            }
        }
        Object obj = stripe2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripe2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = new ApiRequest.Options(this.publishableKey, str, str2);
            stripe2.label = 1;
            objMo26879createToken0E7RQCE = stripeRepository.mo26879createToken0E7RQCE(tokenParams, options, stripe2);
            if (objMo26879createToken0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo26879createToken0E7RQCE = ((Result) obj).getValue();
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo26879createToken0E7RQCE);
        if (thM28553exceptionOrNullimpl == null) {
            return objMo26879createToken0E7RQCE;
        }
        throw StripeException.INSTANCE.create(thM28553exceptionOrNullimpl);
    }

    /* compiled from: Stripe.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/stripe/android/core/model/StripeModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.Stripe$executeAsyncForResult$1", m3645f = "Stripe.kt", m3646l = {1839, 1840}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.Stripe$executeAsyncForResult$1 */
    static final class C425041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Result<? extends T>>, Object> $apiMethod;
        final /* synthetic */ ApiResultCallback<T> $callback;
        int label;
        final /* synthetic */ Stripe this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C425041(Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> function1, Stripe stripe, ApiResultCallback<? super T> apiResultCallback, Continuation<? super C425041> continuation) {
            super(2, continuation);
            this.$apiMethod = function1;
            this.this$0 = stripe;
            this.$callback = apiResultCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425041(this.$apiMethod, this.this$0, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r1.dispatchResult(r5, r3, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Result<? extends T>>, Object> function1 = this.$apiMethod;
                this.label = 1;
                obj = function1.invoke(this);
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
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            Stripe stripe = this.this$0;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            this.label = 2;
        }
    }

    private final <T extends StripeModel> void executeAsyncForResult(ApiResultCallback<? super T> callback, Function1<? super Continuation<? super Result<? extends T>>, ? extends Object> apiMethod) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(this.workContext), null, null, new C425041(apiMethod, this, callback, null), 3, null);
    }

    /* compiled from: Stripe.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lcom/stripe/android/core/model/StripeModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.Stripe$dispatchResult$2", m3645f = "Stripe.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.Stripe$dispatchResult$2 */
    static final class C425032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiResultCallback<T> $callback;
        final /* synthetic */ Object $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C425032(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super C425032> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.$callback = apiResultCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C425032(this.$result, this.$callback, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$result;
            ApiResultCallback<T> apiResultCallback = this.$callback;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
            if (thM28553exceptionOrNullimpl == null) {
                apiResultCallback.onSuccess((StripeModel) obj2);
            } else {
                apiResultCallback.onError(StripeException.INSTANCE.create(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends StripeModel> Object dispatchResult(Object obj, ApiResultCallback<? super T> apiResultCallback, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C425032(obj, apiResultCallback, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: Stripe.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/stripe/android/Stripe$Companion;", "", "<init>", "()V", "Lcom/stripe/android/core/AppInfo;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "getAppInfo", "()Lcom/stripe/android/core/AppInfo;", "setAppInfo", "(Lcom/stripe/android/core/AppInfo;)V", "getAppInfo$annotations", "", "advancedFraudSignalsEnabled", "Z", "getAdvancedFraudSignalsEnabled", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "getAdvancedFraudSignalsEnabled$annotations", "", "API_VERSION", "Ljava/lang/String;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppInfo getAppInfo() {
            return Stripe.appInfo;
        }

        public final boolean getAdvancedFraudSignalsEnabled() {
            return Stripe.advancedFraudSignalsEnabled;
        }

        public final void setAdvancedFraudSignalsEnabled(boolean z) {
            Stripe.advancedFraudSignalsEnabled = z;
        }
    }
}
