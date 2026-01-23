package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.core.networking.RetryDelaySupplier;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeIntentKtx;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Timeout6;

/* compiled from: PaymentFlowResultProcessor.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 C*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001CB?\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\nH$¢\u0006\u0002\u0010%J\u0018\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020#H\u0002J$\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010*\u001a\u00020+H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J:\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010/\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n01H¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J4\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u00105\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J:\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010/\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n01H¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00103J\u0010\u0010:\u001a\u00020;2\u0006\u0010!\u001a\u00020\u0002H\u0002J\u0018\u0010<\u001a\u00020;2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010=\u001a\u00020;H\u0002J\u0018\u0010>\u001a\u00020;2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010?\u001a\u00020#H\u0002J\u001b\u0010@\u001a\u00020;2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0002¢\u0006\u0002\u0010BR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002DE\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, m3636d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "T", "Lcom/stripe/android/model/StripeIntent;", "S", "Lcom/stripe/android/StripeIntentResult;", "", "context", "Landroid/content/Context;", "publishableKeyProvider", "Ljavax/inject/Provider;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "getStripeRepository", "()Lcom/stripe/android/networking/StripeRepository;", "cancelStripeIntentSource", "Lkotlin/Result;", "stripeIntentId", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "sourceId", "cancelStripeIntentSource-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "stripeIntent", "outcomeFromFlow", "", "failureMessage", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;", "determineFlowOutcome", "intent", "originalFlowOutcome", "processResult", "unvalidatedResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "processResult-gIAlu-s", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStripeIntent", "clientSecret", "expandFields", "", "refreshStripeIntent-BWLJW6A", "(Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStripeIntentUntilTerminalState", "originalIntent", "refreshStripeIntentUntilTerminalState-BWLJW6A", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "retrieveStripeIntent-BWLJW6A", "shouldCallRefreshIntent", "", "shouldCancelIntentSource", "shouldCancelSource", "shouldRefreshIntent", "flowOutcome", "shouldRetry", "stripeIntentResult", "(Ljava/lang/Object;)Z", "Companion", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public abstract class PaymentFlowResultProcessor<T extends StripeIntent, S extends StripeIntentResult<? extends T>> {
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final Logger logger;
    private final Provider<String> publishableKeyProvider;
    private final RetryDelaySupplier retryDelaySupplier;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    /* compiled from: PaymentFlowResultProcessor.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, stripeRepository, logger, coroutineContext, retryDelaySupplier);
    }

    /* renamed from: cancelStripeIntentSource-BWLJW6A, reason: not valid java name */
    protected abstract Object mo26913cancelStripeIntentSourceBWLJW6A(String str, ApiRequest.Options options, String str2, Continuation<? super Result<? extends T>> continuation);

    protected abstract S createStripeIntentResult(T stripeIntent, int outcomeFromFlow, String failureMessage);

    /* renamed from: refreshStripeIntent-BWLJW6A, reason: not valid java name */
    protected abstract Object mo26915refreshStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends T>> continuation);

    /* renamed from: retrieveStripeIntent-BWLJW6A, reason: not valid java name */
    protected abstract Object mo26916retrieveStripeIntentBWLJW6A(String str, ApiRequest.Options options, List<String> list, Continuation<? super Result<? extends T>> continuation);

    private PaymentFlowResultProcessor(Context context, Provider<String> provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier) {
        this.publishableKeyProvider = provider;
        this.stripeRepository = stripeRepository;
        this.logger = logger;
        this.workContext = coroutineContext;
        this.retryDelaySupplier = retryDelaySupplier;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
    }

    protected final StripeRepository getStripeRepository() {
        return this.stripeRepository;
    }

    public /* synthetic */ PaymentFlowResultProcessor(Context context, Provider provider, StripeRepository stripeRepository, Logger logger, CoroutineContext coroutineContext, RetryDelaySupplier retryDelaySupplier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, stripeRepository, logger, coroutineContext, (i & 32) != 0 ? new LinearRetryDelaySupplier() : retryDelaySupplier, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: processResult-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26914processResultgIAlus(Unvalidated unvalidated, Continuation<? super Result<? extends S>> continuation) {
        PaymentFlowResultProcessor$processResult$1 paymentFlowResultProcessor$processResult$1;
        if (continuation instanceof PaymentFlowResultProcessor$processResult$1) {
            paymentFlowResultProcessor$processResult$1 = (PaymentFlowResultProcessor$processResult$1) continuation;
            int i = paymentFlowResultProcessor$processResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentFlowResultProcessor$processResult$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentFlowResultProcessor$processResult$1 = new PaymentFlowResultProcessor$processResult$1(this, continuation);
            }
        }
        Object objWithContext = paymentFlowResultProcessor$processResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentFlowResultProcessor$processResult$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            PaymentFlowResultProcessor$processResult$2 paymentFlowResultProcessor$processResult$2 = new PaymentFlowResultProcessor$processResult$2(this, unvalidated, null);
            paymentFlowResultProcessor$processResult$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, paymentFlowResultProcessor$processResult$2, paymentFlowResultProcessor$processResult$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCancelIntentSource(StripeIntent stripeIntent, boolean shouldCancelSource) {
        return shouldCancelSource && stripeIntent.requiresAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldRefreshIntent(StripeIntent stripeIntent, int flowOutcome) {
        boolean z;
        boolean z2;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        boolean z3 = flowOutcome == 1 && StripeIntentKtx.shouldRefresh(stripeIntent);
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.Processing) {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if ((paymentMethod2 != null ? paymentMethod2.type : null) == PaymentMethod.Type.Card) {
                z = true;
            }
        } else {
            z = false;
        }
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
            PaymentMethod paymentMethod3 = stripeIntent.getPaymentMethod();
            if ((paymentMethod3 != null ? paymentMethod3.type : null) == PaymentMethod.Type.Card && stripeIntent.getNextActionType() == StripeIntent.NextActionType.UseStripeSdk) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        return z3 || z || z2 || (stripeIntent.requiresAction() && (paymentMethod = stripeIntent.getPaymentMethod()) != null && (type2 = paymentMethod.type) != null && (afterRedirectAction = type2.getAfterRedirectAction()) != null && afterRedirectAction.getShouldRefresh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int determineFlowOutcome(StripeIntent intent, int originalFlowOutcome) {
        StripeIntent.Status status = intent.getStatus();
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        return originalFlowOutcome;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldCallRefreshIntent(StripeIntent stripeIntent) {
        PaymentMethod.Type type2;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return ((paymentMethod == null || (type2 = paymentMethod.type) == null) ? null : type2.getAfterRedirectAction()) instanceof PaymentMethod.AfterRedirectAction.Refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r12 = r23;
        r10 = r7;
        r7 = r11;
        r11 = r24;
        r1 = r4;
        r4 = r7;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: refreshStripeIntentUntilTerminalState-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26912refreshStripeIntentUntilTerminalStateBWLJW6A(StripeIntent stripeIntent, String str, ApiRequest.Options options, Continuation<? super Result<? extends T>> continuation) {
        C42556x95b5fde5 c42556x95b5fde5;
        Object obj;
        PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef;
        StripeIntent stripeIntent2;
        int i;
        Ref.ObjectRef objectRef2;
        PaymentMethod.Type type2;
        PaymentMethod.AfterRedirectAction afterRedirectAction;
        T t;
        Ref.ObjectRef objectRef3;
        String str2 = str;
        ApiRequest.Options options2 = options;
        if (continuation instanceof C42556x95b5fde5) {
            c42556x95b5fde5 = (C42556x95b5fde5) continuation;
            int i2 = c42556x95b5fde5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c42556x95b5fde5.label = i2 - Integer.MIN_VALUE;
            } else {
                c42556x95b5fde5 = new C42556x95b5fde5(this, continuation);
            }
        }
        Object obj2 = c42556x95b5fde5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c42556x95b5fde5.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            int retryCount = (paymentMethod == null || (type2 = paymentMethod.type) == null || (afterRedirectAction = type2.getAfterRedirectAction()) == null) ? 5 : afterRedirectAction.getRetryCount();
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = retryCount;
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            if (shouldCallRefreshIntent(stripeIntent)) {
                List<String> list = EXPAND_PAYMENT_METHOD;
                c42556x95b5fde5.L$0 = this;
                c42556x95b5fde5.L$1 = stripeIntent;
                c42556x95b5fde5.L$2 = str2;
                c42556x95b5fde5.L$3 = options2;
                c42556x95b5fde5.L$4 = intRef2;
                c42556x95b5fde5.L$5 = objectRef4;
                c42556x95b5fde5.L$6 = objectRef4;
                c42556x95b5fde5.I$0 = retryCount;
                c42556x95b5fde5.label = 1;
                Object objMo26915refreshStripeIntentBWLJW6A = mo26915refreshStripeIntentBWLJW6A(str2, options2, list, c42556x95b5fde5);
                obj = objMo26915refreshStripeIntentBWLJW6A;
            } else {
                List<String> list2 = EXPAND_PAYMENT_METHOD;
                c42556x95b5fde5.L$0 = this;
                c42556x95b5fde5.L$1 = stripeIntent;
                c42556x95b5fde5.L$2 = str2;
                c42556x95b5fde5.L$3 = options2;
                c42556x95b5fde5.L$4 = intRef2;
                c42556x95b5fde5.L$5 = objectRef4;
                c42556x95b5fde5.L$6 = objectRef4;
                c42556x95b5fde5.I$0 = retryCount;
                c42556x95b5fde5.label = 2;
                Object objMo26916retrieveStripeIntentBWLJW6A = mo26916retrieveStripeIntentBWLJW6A(str2, options2, list2, c42556x95b5fde5);
                obj = objMo26916retrieveStripeIntentBWLJW6A;
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef3 = (Ref.ObjectRef) c42556x95b5fde5.L$0;
                ResultKt.throwOnFailure(obj2);
                return objectRef3.element;
            }
            i = c42556x95b5fde5.I$0;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) c42556x95b5fde5.L$6;
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) c42556x95b5fde5.L$5;
            Ref.IntRef intRef3 = (Ref.IntRef) c42556x95b5fde5.L$4;
            ApiRequest.Options options3 = (ApiRequest.Options) c42556x95b5fde5.L$3;
            String str3 = (String) c42556x95b5fde5.L$2;
            stripeIntent2 = (StripeIntent) c42556x95b5fde5.L$1;
            paymentFlowResultProcessor = (PaymentFlowResultProcessor) c42556x95b5fde5.L$0;
            ResultKt.throwOnFailure(obj2);
            Object value = ((Result) obj2).getValue();
            objectRef2 = objectRef5;
            str2 = str3;
            intRef = intRef3;
            objectRef = objectRef6;
            options2 = options3;
            t = value;
        }
        String str4 = str2;
        ApiRequest.Options options4 = options2;
        Ref.ObjectRef objectRef7 = objectRef;
        Ref.IntRef intRef4 = intRef;
        StripeIntent stripeIntent3 = stripeIntent2;
        PaymentFlowResultProcessor<T, S> paymentFlowResultProcessor2 = paymentFlowResultProcessor;
        objectRef2.element = t;
        long jMo26846maxDuration5sfh64U = paymentFlowResultProcessor2.retryDelaySupplier.mo26846maxDuration5sfh64U(i);
        C42557x95b5fde6 c42557x95b5fde6 = new C42557x95b5fde6(paymentFlowResultProcessor2, objectRef7, intRef4, i, stripeIntent3, str4, options4, null);
        c42556x95b5fde5.L$0 = objectRef7;
        c42556x95b5fde5.L$1 = null;
        c42556x95b5fde5.L$2 = null;
        c42556x95b5fde5.L$3 = null;
        c42556x95b5fde5.L$4 = null;
        c42556x95b5fde5.L$5 = null;
        c42556x95b5fde5.L$6 = null;
        c42556x95b5fde5.label = 3;
        if (Timeout6.m28790withTimeoutOrNullKLykuaI(jMo26846maxDuration5sfh64U, c42557x95b5fde6, c42556x95b5fde5) != coroutine_suspended) {
            objectRef3 = objectRef7;
            return objectRef3.element;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldRetry(Object stripeIntentResult) {
        boolean z;
        if (Result.m28555isFailureimpl(stripeIntentResult)) {
            stripeIntentResult = null;
        }
        StripeIntent stripeIntent = (StripeIntent) stripeIntentResult;
        if (stripeIntent == null) {
            return true;
        }
        boolean zRequiresAction = stripeIntent.requiresAction();
        if (stripeIntent.getStatus() != StripeIntent.Status.Processing) {
            z = false;
        } else {
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if ((paymentMethod != null ? paymentMethod.type : null) == PaymentMethod.Type.Card) {
                z = true;
            }
        }
        return zRequiresAction || z;
    }

    /* compiled from: PaymentFlowResultProcessor.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "MAX_RETRIES", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
        }
    }
}
