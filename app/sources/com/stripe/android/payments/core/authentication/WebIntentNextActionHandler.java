package com.stripe.android.payments.core.authentication;

import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebIntentNextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B}\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019Jr\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010(J&\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,H\u0094@¢\u0006\u0002\u0010-J\f\u0010.\u001a\u00020/*\u000200H\u0002J\f\u0010.\u001a\u00020/*\u000201H\u0002J\u0014\u0010.\u001a\u00020/*\u0002022\u0006\u0010*\u001a\u00020\u0002H\u0002J\u001a\u0010.\u001a\u00020/*\u0002032\u0006\u0010*\u001a\u00020\u0002H\u0082@¢\u0006\u0002\u00104J\u0014\u0010.\u001a\u00020/*\u0002052\u0006\u0010*\u001a\u00020\u0002H\u0002J\f\u0010.\u001a\u00020/*\u000206H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "enableLogging", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", "isInstantApp", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "redirectResolver", "Lcom/stripe/android/payments/core/authentication/RedirectResolver;", "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;ZLcom/stripe/android/payments/DefaultReturnUrl;Lcom/stripe/android/payments/core/authentication/RedirectResolver;)V", "beginWebAuth", "", "host", "stripeIntent", "requestCode", "", "clientSecret", "authUrl", "stripeAccount", "returnUrl", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", Constants.REFERRER, "forceInAppWebView", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performNextActionOnResumed", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "webAuthParams", "Lcom/stripe/android/payments/core/authentication/WebAuthParams;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$CashAppRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayVoucherDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "(Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SwishRedirect;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmSuppressWildcards
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class WebIntentNextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final RedirectResolver redirectResolver;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    /* compiled from: WebIntentNextActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler", m3645f = "WebIntentNextActionHandler.kt", m3646l = {54, 73}, m3647m = "performNextActionOnResumed")
    /* renamed from: com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$performNextActionOnResumed$1 */
    static final class C425821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C425821(Continuation<C425821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebIntentNextActionHandler.this.performNextActionOnResumed2((AuthActivityStarterHost) null, (StripeIntent) null, (ApiRequest.Options) null, (Continuation<Unit>) this);
        }
    }

    /* compiled from: WebIntentNextActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler", m3645f = "WebIntentNextActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "webAuthParams")
    /* renamed from: com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$webAuthParams$2 */
    static final class C425832 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C425832(Continuation<C425832> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebIntentNextActionHandler.this.webAuthParams(null, null, this);
        }
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<Unit>) continuation);
    }

    public WebIntentNextActionHandler(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, Function0<String> publishableKeyProvider, boolean z2, DefaultReturnUrl defaultReturnUrl, RedirectResolver redirectResolver) {
        Intrinsics.checkNotNullParameter(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
        Intrinsics.checkNotNullParameter(redirectResolver, "redirectResolver");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z;
        this.uiContext = uiContext;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z2;
        this.defaultReturnUrl = defaultReturnUrl;
        this.redirectResolver = redirectResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<Unit> continuation) {
        C425821 c425821;
        AuthActivityStarterHost authActivityStarterHost2;
        ApiRequest.Options options2;
        WebAuthParams webAuthParams;
        WebIntentNextActionHandler webIntentNextActionHandler;
        int requestCode$payments_core_release;
        String clientSecret;
        String authUrl;
        String stripeAccount;
        String returnUrl;
        boolean shouldCancelSource;
        boolean shouldCancelIntentOnUserNavigation;
        String referrer;
        boolean forceInAppWebView;
        StripeIntent stripeIntent2 = stripeIntent;
        if (continuation instanceof C425821) {
            c425821 = (C425821) continuation;
            int i = c425821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425821.label = i - Integer.MIN_VALUE;
            } else {
                c425821 = new C425821(continuation);
            }
        }
        Object objWebAuthParams = c425821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWebAuthParams);
            Object nextActionData = stripeIntent2.getNextActionData();
            if (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) {
                webAuthParams = webAuthParams((StripeIntent.NextActionData.SdkData.Use3DS1) nextActionData, stripeIntent2);
                authActivityStarterHost2 = authActivityStarterHost;
                options2 = options;
            } else if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
                c425821.L$0 = this;
                authActivityStarterHost2 = authActivityStarterHost;
                c425821.L$1 = authActivityStarterHost2;
                c425821.L$2 = stripeIntent2;
                options2 = options;
                c425821.L$3 = options2;
                c425821.label = 1;
                objWebAuthParams = webAuthParams((StripeIntent.NextActionData.RedirectToUrl) nextActionData, stripeIntent2, c425821);
                if (objWebAuthParams == coroutine_suspended) {
                    return coroutine_suspended;
                }
                webIntentNextActionHandler = this;
            } else {
                authActivityStarterHost2 = authActivityStarterHost;
                options2 = options;
                if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                    webAuthParams = webAuthParams((StripeIntent.NextActionData.AlipayRedirect) nextActionData);
                } else if (nextActionData instanceof StripeIntent.NextActionData.DisplayVoucherDetails) {
                    webAuthParams = webAuthParams((StripeIntent.NextActionData.DisplayVoucherDetails) nextActionData, stripeIntent2);
                } else if (nextActionData instanceof StripeIntent.NextActionData.CashAppRedirect) {
                    webAuthParams = webAuthParams((StripeIntent.NextActionData.CashAppRedirect) nextActionData);
                } else if (nextActionData instanceof StripeIntent.NextActionData.SwishRedirect) {
                    webAuthParams = webAuthParams((StripeIntent.NextActionData.SwishRedirect) nextActionData);
                } else {
                    throw new IllegalArgumentException("WebAuthenticator can't process nextActionData: " + nextActionData);
                }
            }
            webIntentNextActionHandler = this;
            requestCode$payments_core_release = StripePaymentController.INSTANCE.getRequestCode$payments_core_release(stripeIntent2);
            clientSecret = stripeIntent2.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            authUrl = webAuthParams.getAuthUrl();
            stripeAccount = options2.getStripeAccount();
            returnUrl = webAuthParams.getReturnUrl();
            shouldCancelSource = webAuthParams.getShouldCancelSource();
            shouldCancelIntentOnUserNavigation = webAuthParams.getShouldCancelIntentOnUserNavigation();
            referrer = webAuthParams.getReferrer();
            forceInAppWebView = webAuthParams.getForceInAppWebView();
            c425821.L$0 = null;
            c425821.L$1 = null;
            c425821.L$2 = null;
            c425821.L$3 = null;
            c425821.label = 2;
            if (webIntentNextActionHandler.beginWebAuth(authActivityStarterHost2, stripeIntent2, requestCode$payments_core_release, clientSecret, authUrl, stripeAccount, returnUrl, shouldCancelSource, shouldCancelIntentOnUserNavigation, referrer, forceInAppWebView, c425821) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWebAuthParams);
            return Unit.INSTANCE;
        }
        ApiRequest.Options options3 = (ApiRequest.Options) c425821.L$3;
        StripeIntent stripeIntent3 = (StripeIntent) c425821.L$2;
        AuthActivityStarterHost authActivityStarterHost3 = (AuthActivityStarterHost) c425821.L$1;
        WebIntentNextActionHandler webIntentNextActionHandler2 = (WebIntentNextActionHandler) c425821.L$0;
        ResultKt.throwOnFailure(objWebAuthParams);
        options2 = options3;
        stripeIntent2 = stripeIntent3;
        authActivityStarterHost2 = authActivityStarterHost3;
        webIntentNextActionHandler = webIntentNextActionHandler2;
        webAuthParams = (WebAuthParams) objWebAuthParams;
        requestCode$payments_core_release = StripePaymentController.INSTANCE.getRequestCode$payments_core_release(stripeIntent2);
        clientSecret = stripeIntent2.getClientSecret();
        if (clientSecret == null) {
        }
        authUrl = webAuthParams.getAuthUrl();
        stripeAccount = options2.getStripeAccount();
        returnUrl = webAuthParams.getReturnUrl();
        shouldCancelSource = webAuthParams.getShouldCancelSource();
        shouldCancelIntentOnUserNavigation = webAuthParams.getShouldCancelIntentOnUserNavigation();
        referrer = webAuthParams.getReferrer();
        forceInAppWebView = webAuthParams.getForceInAppWebView();
        c425821.L$0 = null;
        c425821.L$1 = null;
        c425821.L$2 = null;
        c425821.L$3 = null;
        c425821.label = 2;
        if (webIntentNextActionHandler.beginWebAuth(authActivityStarterHost2, stripeIntent2, requestCode$payments_core_release, clientSecret, authUrl, stripeAccount, returnUrl, shouldCancelSource, shouldCancelIntentOnUserNavigation, referrer, forceInAppWebView, c425821) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: WebIntentNextActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$beginWebAuth$2", m3645f = "WebIntentNextActionHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$beginWebAuth$2 */
    static final class C425812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $authUrl;
        final /* synthetic */ String $clientSecret;
        final /* synthetic */ boolean $forceInAppWebView;
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ String $referrer;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ String $returnUrl;
        final /* synthetic */ boolean $shouldCancelIntentOnUserNavigation;
        final /* synthetic */ boolean $shouldCancelSource;
        final /* synthetic */ String $stripeAccount;
        final /* synthetic */ StripeIntent $stripeIntent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425812(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, Continuation<C425812> continuation) {
            super(2, continuation);
            this.$host = authActivityStarterHost;
            this.$stripeIntent = stripeIntent;
            this.$requestCode = i;
            this.$clientSecret = str;
            this.$authUrl = str2;
            this.$returnUrl = str3;
            this.$stripeAccount = str4;
            this.$shouldCancelSource = z;
            this.$shouldCancelIntentOnUserNavigation = z2;
            this.$referrer = str5;
            this.$forceInAppWebView = z3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebIntentNextActionHandler.this.new C425812(this.$host, this.$stripeIntent, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, this.$stripeAccount, this.$shouldCancelSource, this.$shouldCancelIntentOnUserNavigation, this.$referrer, this.$forceInAppWebView, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation<Unit>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return ((C425812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentBrowserAuthStarter paymentBrowserAuthStarter = (PaymentBrowserAuthStarter) WebIntentNextActionHandler.this.paymentBrowserAuthStarterFactory.invoke(this.$host);
                String id = this.$stripeIntent.getId();
                if (id == null) {
                    id = "";
                }
                paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(id, this.$requestCode, this.$clientSecret, this.$authUrl, this.$returnUrl, WebIntentNextActionHandler.this.enableLogging, null, this.$stripeAccount, this.$shouldCancelSource, this.$shouldCancelIntentOnUserNavigation, this.$host.getStatusBarColor(), (String) WebIntentNextActionHandler.this.publishableKeyProvider.invoke(), WebIntentNextActionHandler.this.isInstantApp, this.$referrer, this.$forceInAppWebView, 64, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Object beginWebAuth(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, Continuation<Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new C425812(authActivityStarterHost, stripeIntent, i, str, str2, str4, str3, z, z2, str5, z3, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final WebAuthParams webAuthParams(StripeIntent.NextActionData.SdkData.Use3DS1 use3DS1, StripeIntent stripeIntent) {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1Sdk, null, null, null, null, null, 62, null));
        String url = use3DS1.getUrl();
        String id = stripeIntent.getId();
        return new WebAuthParams(url, id != null ? this.threeDs1IntentReturnUrlMap.remove(id) : null, true, false, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object webAuthParams(StripeIntent.NextActionData.RedirectToUrl redirectToUrl, StripeIntent stripeIntent, Continuation<WebAuthParams> continuation) {
        C425832 c425832;
        if (continuation instanceof C425832) {
            c425832 = (C425832) continuation;
            int i = c425832.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425832.label = i - Integer.MIN_VALUE;
            } else {
                c425832 = new C425832(continuation);
            }
        }
        Object objInvoke = c425832.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425832.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, null, 62, null));
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if (Intrinsics.areEqual(paymentMethod != null ? paymentMethod.code : null, PaymentMethod.Type.WeChatPay.code)) {
                RedirectResolver redirectResolver = this.redirectResolver;
                String string2 = redirectToUrl.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                c425832.L$0 = redirectToUrl;
                c425832.label = 1;
                objInvoke = redirectResolver.invoke(string2, c425832);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                String string3 = redirectToUrl.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                return new WebAuthParams(string3, redirectToUrl.getReturnUrl(), false, false, null, false, 60, null);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redirectToUrl = (StripeIntent.NextActionData.RedirectToUrl) c425832.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        return new WebAuthParams((String) objInvoke, redirectToUrl.getReturnUrl(), false, false, redirectToUrl.getUrl().toString(), true, 4, null);
    }

    private final WebAuthParams webAuthParams(StripeIntent.NextActionData.AlipayRedirect alipayRedirect) {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthRedirect, null, null, null, null, null, 62, null));
        String string2 = alipayRedirect.getWebViewUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new WebAuthParams(string2, alipayRedirect.getReturnUrl(), false, false, null, false, 60, null);
    }

    private final WebAuthParams webAuthParams(StripeIntent.NextActionData.DisplayVoucherDetails displayVoucherDetails, StripeIntent stripeIntent) {
        String hostedVoucherUrl = displayVoucherDetails.getHostedVoucherUrl();
        Intrinsics.checkNotNull(hostedVoucherUrl);
        String str = hostedVoucherUrl.length() > 0 ? hostedVoucherUrl : null;
        if (str != null) {
            return new WebAuthParams(str, null, false, false, null, false, 52, null);
        }
        StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
        throw new IllegalArgumentException("null hostedVoucherUrl for " + (nextActionType != null ? nextActionType.getCode() : null));
    }

    private final WebAuthParams webAuthParams(StripeIntent.NextActionData.CashAppRedirect cashAppRedirect) {
        return new WebAuthParams(cashAppRedirect.getMobileAuthUrl(), this.defaultReturnUrl.getValue(), false, false, null, false, 52, null);
    }

    private final WebAuthParams webAuthParams(StripeIntent.NextActionData.SwishRedirect swishRedirect) {
        return new WebAuthParams(swishRedirect.getMobileAuthUrl(), this.defaultReturnUrl.getValue(), false, false, null, false, 52, null);
    }
}
