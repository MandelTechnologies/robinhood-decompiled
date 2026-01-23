package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.view.result.ActivityResultLauncher;
import com.google.android.instantapps.InstantApps;
import com.plaid.internal.EnumC7081g;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.DefaultAlipayRepository;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowFailureMessageFactory;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: StripePaymentController.kt */
@Metadata(m3635d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001eBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b.\u0010/J(\u00101\u001a\u00020*2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b1\u00102J!\u00105\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J!\u00107\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b7\u00106J$\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u001a2\u0006\u00104\u001a\u000203H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J$\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u001a2\u0006\u00104\u001a\u000203H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010:J(\u0010A\u001a\u00020*2\u0006\u0010%\u001a\u00020$2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\u0018H\u0097@¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010CR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010ER\u001e\u0010Y\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR \u0010]\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R \u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006f"}, m3636d2 = {"Lcom/stripe/android/StripePaymentController;", "Lcom/stripe/android/PaymentController;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "publishableKeyProvider", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/AlipayRepository;", "alipayRepository", "uiContext", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent-0E7RQCE", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent-0E7RQCE", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmSetupIntent", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "", "requestCode", "", "throwable", "", "handleError", "(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "returnUrl", "logReturnUrl", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "shouldHandlePaymentResult", "(ILandroid/content/Intent;)Z", "shouldHandleSetupResult", "Lcom/stripe/android/PaymentIntentResult;", "getPaymentIntentResult-gIAlu-s", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentIntentResult", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult-gIAlu-s", "getSetupIntentResult", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/networking/StripeRepository;", "Z", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/networking/AlipayRepository;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "paymentIntentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "setupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "isInstantApp", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lkotlin/Function1;", "Lcom/stripe/android/PaymentRelayStarter;", "paymentRelayStarterFactory", "Lkotlin/jvm/functions/Function1;", "", "threeDs1IntentReturnUrlMap", "Ljava/util/Map;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "nextActionHandlerRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class StripePaymentController implements PaymentController {
    private final AlipayRepository alipayRepository;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final boolean isInstantApp;
    private final PaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    private ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    private final StripeRepository stripeRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");
    private static final long CHALLENGE_DELAY = TimeUnit.SECONDS.toMillis(2);

    /* compiled from: StripePaymentController.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.StripePaymentController", m3645f = "StripePaymentController.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.f2773x8d9721ad, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE}, m3647m = "startConfirmAndAuth")
    /* renamed from: com.stripe.android.StripePaymentController$startConfirmAndAuth$1 */
    static final class C425081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C425081(Continuation<? super C425081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripePaymentController.this.startConfirmAndAuth(null, null, null, this);
        }
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandlePaymentResult(int requestCode, Intent data) {
        return requestCode == 50000 && data != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSetupResult(int requestCode, Intent data) {
        return requestCode == 50001 && data != null;
    }

    public StripePaymentController(Context context, Function0<String> publishableKeyProvider, StripeRepository stripeRepository, boolean z, CoroutineContext workContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext uiContext) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(alipayRepository, "alipayRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeRepository = stripeRepository;
        this.enableLogging = z;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.alipayRepository = alipayRepository;
        this.uiContext = uiContext;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
        Logger.Companion companion = Logger.INSTANCE;
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z), workContext);
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z), workContext);
        this.defaultReturnUrl = DefaultReturnUrl.INSTANCE.create(context);
        boolean zIsInstantApp = InstantApps.isInstantApp(context);
        this.isInstantApp = zIsInstantApp;
        this.paymentRelayStarterFactory = new Function1<AuthActivityStarterHost, PaymentRelayStarter>() { // from class: com.stripe.android.StripePaymentController$paymentRelayStarterFactory$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final PaymentRelayStarter invoke(AuthActivityStarterHost host) {
                Intrinsics.checkNotNullParameter(host, "host");
                ActivityResultLauncher activityResultLauncher = this.this$0.paymentRelayLauncher;
                if (activityResultLauncher != null) {
                    return new PaymentRelayStarter.Modern(activityResultLauncher);
                }
                return new PaymentRelayStarter.Legacy(host);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.threeDs1IntentReturnUrlMap = linkedHashMap;
        this.nextActionHandlerRegistry = DefaultPaymentNextActionHandlerRegistry.INSTANCE.createInstance(context, paymentAnalyticsRequestFactory, z, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.getDefaultProductUsageTokens$payments_core_release(), zIsInstantApp, false);
    }

    public /* synthetic */ StripePaymentController(Context context, final Function0 function0, StripeRepository stripeRepository, boolean z, CoroutineContext coroutineContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext coroutineContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        boolean z2 = (i & 8) != 0 ? false : z;
        CoroutineContext io2 = (i & 16) != 0 ? Dispatchers.getIO() : coroutineContext;
        AnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (i & 32) != 0 ? new DefaultAnalyticsRequestExecutor(Logger.INSTANCE.getInstance(z2), io2) : analyticsRequestExecutor;
        if ((i & 64) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext, new Provider() { // from class: com.stripe.android.StripePaymentController$$ExternalSyntheticLambda0
                @Override // javax.inject.Provider
                public final Object get() {
                    return StripePaymentController._init_$lambda$0(function0);
                }
            });
        } else {
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        this(context, function0, stripeRepository, z2, io2, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory2, (i & 128) != 0 ? new DefaultAlipayRepository(stripeRepository) : alipayRepository, (i & 256) != 0 ? Dispatchers.getMain() : coroutineContext2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        if (r5.handleNextAction(r10, r2, r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010e, code lost:
    
        if (r5.handleError(r10, r11, r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        C425081 c425081;
        String returnUrl;
        Object objM26842confirmSetupIntent0E7RQCE;
        StripePaymentController stripePaymentController;
        String id;
        if (continuation instanceof C425081) {
            c425081 = (C425081) continuation;
            int i = c425081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425081.label = i - Integer.MIN_VALUE;
            } else {
                c425081 = new C425081(continuation);
            }
        }
        Object obj = c425081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            logReturnUrl(confirmStripeIntentParams.getReturnUrl());
            if (this.isInstantApp) {
                returnUrl = confirmStripeIntentParams.getReturnUrl();
            } else {
                returnUrl = confirmStripeIntentParams.getReturnUrl();
                if (returnUrl == null || StringsKt.isBlank(returnUrl)) {
                    returnUrl = null;
                }
                if (returnUrl == null) {
                    returnUrl = this.defaultReturnUrl.getValue();
                }
            }
            if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) confirmStripeIntentParams;
                confirmPaymentIntentParams.setReturnUrl(returnUrl);
                c425081.L$0 = this;
                c425081.L$1 = authActivityStarterHost;
                c425081.L$2 = confirmStripeIntentParams;
                c425081.L$3 = options;
                c425081.L$4 = returnUrl;
                c425081.label = 1;
                objM26842confirmSetupIntent0E7RQCE = m26841confirmPaymentIntent0E7RQCE(confirmPaymentIntentParams, options, c425081);
            } else {
                if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) confirmStripeIntentParams;
                confirmSetupIntentParams.setReturnUrl(returnUrl);
                c425081.L$0 = this;
                c425081.L$1 = authActivityStarterHost;
                c425081.L$2 = confirmStripeIntentParams;
                c425081.L$3 = options;
                c425081.L$4 = returnUrl;
                c425081.label = 2;
                objM26842confirmSetupIntent0E7RQCE = m26842confirmSetupIntent0E7RQCE(confirmSetupIntentParams, options, c425081);
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            String str = (String) c425081.L$4;
            options = (ApiRequest.Options) c425081.L$3;
            confirmStripeIntentParams = (ConfirmStripeIntentParams) c425081.L$2;
            AuthActivityStarterHost authActivityStarterHost2 = (AuthActivityStarterHost) c425081.L$1;
            stripePaymentController = (StripePaymentController) c425081.L$0;
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            returnUrl = str;
            authActivityStarterHost = authActivityStarterHost2;
            objM26842confirmSetupIntent0E7RQCE = value;
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26842confirmSetupIntent0E7RQCE);
        if (thM28553exceptionOrNullimpl == null) {
            StripeIntent stripeIntent = (StripeIntent) objM26842confirmSetupIntent0E7RQCE;
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent.getId()) != null) {
                Map<String, String> map = stripePaymentController.threeDs1IntentReturnUrlMap;
                if (returnUrl == null) {
                    returnUrl = "";
                }
                map.put(id, returnUrl);
            }
            c425081.L$0 = null;
            c425081.L$1 = null;
            c425081.L$2 = null;
            c425081.L$3 = null;
            c425081.L$4 = null;
            c425081.label = 3;
        } else {
            int requestCode$payments_core_release = INSTANCE.getRequestCode$payments_core_release(confirmStripeIntentParams);
            c425081.L$0 = null;
            c425081.L$1 = null;
            c425081.L$2 = null;
            c425081.L$3 = null;
            c425081.L$4 = null;
            c425081.label = 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: confirmPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26841confirmPaymentIntent0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripePaymentController2 stripePaymentController2;
        if (continuation instanceof StripePaymentController2) {
            stripePaymentController2 = (StripePaymentController2) continuation;
            int i = stripePaymentController2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripePaymentController2.label = i - Integer.MIN_VALUE;
            } else {
                stripePaymentController2 = new StripePaymentController2(this, continuation);
            }
        }
        Object obj = stripePaymentController2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripePaymentController2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ConfirmPaymentIntentParams confirmPaymentIntentParamsWithShouldUseStripeSdk = confirmPaymentIntentParams.withShouldUseStripeSdk(true);
        List<String> list = EXPAND_PAYMENT_METHOD;
        stripePaymentController2.label = 1;
        Object objMo26872confirmPaymentIntentBWLJW6A = stripeRepository.mo26872confirmPaymentIntentBWLJW6A(confirmPaymentIntentParamsWithShouldUseStripeSdk, options, list, stripePaymentController2);
        return objMo26872confirmPaymentIntentBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo26872confirmPaymentIntentBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: confirmSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26842confirmSetupIntent0E7RQCE(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripePaymentController3 stripePaymentController3;
        if (continuation instanceof StripePaymentController3) {
            stripePaymentController3 = (StripePaymentController3) continuation;
            int i = stripePaymentController3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripePaymentController3.label = i - Integer.MIN_VALUE;
            } else {
                stripePaymentController3 = new StripePaymentController3(this, continuation);
            }
        }
        Object obj = stripePaymentController3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripePaymentController3.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ConfirmSetupIntentParams confirmSetupIntentParamsWithShouldUseStripeSdk = confirmSetupIntentParams.withShouldUseStripeSdk(true);
        List<String> list = EXPAND_PAYMENT_METHOD;
        stripePaymentController3.label = 1;
        Object objMo26873confirmSetupIntentBWLJW6A = stripeRepository.mo26873confirmSetupIntentBWLJW6A(confirmSetupIntentParamsWithShouldUseStripeSdk, options, list, stripePaymentController3);
        return objMo26873confirmSetupIntentBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo26873confirmSetupIntentBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: getPaymentIntentResult-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26836getPaymentIntentResultgIAlus(Intent intent, Continuation<? super Result<PaymentIntentResult>> continuation) {
        StripePaymentController4 stripePaymentController4;
        if (continuation instanceof StripePaymentController4) {
            stripePaymentController4 = (StripePaymentController4) continuation;
            int i = stripePaymentController4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripePaymentController4.label = i - Integer.MIN_VALUE;
            } else {
                stripePaymentController4 = new StripePaymentController4(this, continuation);
            }
        }
        Object obj = stripePaymentController4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripePaymentController4.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor = this.paymentIntentFlowResultProcessor;
        Unvalidated unvalidatedFromIntent = Unvalidated.INSTANCE.fromIntent(intent);
        stripePaymentController4.label = 1;
        Object objM26914processResultgIAlus = paymentIntentFlowResultProcessor.m26914processResultgIAlus(unvalidatedFromIntent, stripePaymentController4);
        return objM26914processResultgIAlus == coroutine_suspended ? coroutine_suspended : objM26914processResultgIAlus;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: getSetupIntentResult-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo26837getSetupIntentResultgIAlus(Intent intent, Continuation<? super Result<SetupIntentResult>> continuation) {
        StripePaymentController5 stripePaymentController5;
        if (continuation instanceof StripePaymentController5) {
            stripePaymentController5 = (StripePaymentController5) continuation;
            int i = stripePaymentController5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripePaymentController5.label = i - Integer.MIN_VALUE;
            } else {
                stripePaymentController5 = new StripePaymentController5(this, continuation);
            }
        }
        Object obj = stripePaymentController5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripePaymentController5.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        SetupIntentFlowResultProcessor setupIntentFlowResultProcessor = this.setupIntentFlowResultProcessor;
        Unvalidated unvalidatedFromIntent = Unvalidated.INSTANCE.fromIntent(intent);
        stripePaymentController5.label = 1;
        Object objM26914processResultgIAlus = setupIntentFlowResultProcessor.m26914processResultgIAlus(unvalidatedFromIntent, stripePaymentController5);
        return objM26914processResultgIAlus == coroutine_suspended ? coroutine_suspended : objM26914processResultgIAlus;
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.StripePaymentController$handleError$2", m3645f = "StripePaymentController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.StripePaymentController$handleError$2 */
    static final class C425072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425072(AuthActivityStarterHost authActivityStarterHost, Throwable th, int i, Continuation<? super C425072> continuation) {
            super(2, continuation);
            this.$host = authActivityStarterHost;
            this.$throwable = th;
            this.$requestCode = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripePaymentController.this.new C425072(this.$host, this.$throwable, this.$requestCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((PaymentRelayStarter) StripePaymentController.this.paymentRelayStarterFactory.invoke(this.$host)).start(new PaymentRelayStarter.Args.ErrorArgs(StripeException.INSTANCE.create(this.$throwable), this.$requestCode));
            return Unit.INSTANCE;
        }
    }

    private final Object handleError(AuthActivityStarterHost authActivityStarterHost, int i, Throwable th, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new C425072(authActivityStarterHost, th, i, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object objPerformNextAction = this.nextActionHandlerRegistry.getNextActionHandler(stripeIntent).performNextAction(authActivityStarterHost, stripeIntent, options, continuation);
        return objPerformNextAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformNextAction : Unit.INSTANCE;
    }

    private final void logReturnUrl(String returnUrl) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (Intrinsics.areEqual(returnUrl, this.defaultReturnUrl.getValue())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (returnUrl == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0007\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/stripe/android/StripePaymentController$Companion;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", "intent", "", "getRequestCode$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;)I", "getRequestCode", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "params", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)I", "", "CHALLENGE_DELAY", "J", "getCHALLENGE_DELAY$payments_core_release", "()J", "PAYMENT_REQUEST_CODE", "I", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(StripeIntent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (intent instanceof PaymentIntent) {
                return AchTransfer.MAX_DEPOSIT_LIMIT;
            }
            return 50001;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(ConfirmStripeIntentParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params instanceof ConfirmPaymentIntentParams) {
                return AchTransfer.MAX_DEPOSIT_LIMIT;
            }
            if (params instanceof ConfirmSetupIntentParams) {
                return 50001;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long getCHALLENGE_DELAY$payments_core_release() {
            return StripePaymentController.CHALLENGE_DELAY;
        }
    }
}
