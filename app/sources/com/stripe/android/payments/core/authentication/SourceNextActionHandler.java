package com.stripe.android.payments.core.authentication;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Source;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmSuppressWildcards;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SourceNextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\b\u0007\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0002\u0010\u001bJ&\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0094@¢\u0006\u0002\u0010 J&\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010 R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/Source;", "paymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "paymentRelayStarterFactory", "Lcom/stripe/android/PaymentRelayStarter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "enableLogging", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "publishableKeyProvider", "Lkotlin/Function0;", "", "isInstantApp", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Z)V", "bypassAuth", "", "host", "source", "stripeAccountId", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performNextActionOnResumed", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSourceAuth", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes22.dex */
public final class SourceNextActionHandler extends PaymentNextActionHandler<Source> {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final boolean enableLogging;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final CoroutineContext uiContext;

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, source, options, (Continuation<Unit>) continuation);
    }

    public SourceNextActionHandler(Function1<AuthActivityStarterHost, PaymentBrowserAuthStarter> paymentBrowserAuthStarterFactory, Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext uiContext, Function0<String> publishableKeyProvider, boolean z2) {
        Intrinsics.checkNotNullParameter(paymentBrowserAuthStarterFactory, "paymentBrowserAuthStarterFactory");
        Intrinsics.checkNotNullParameter(paymentRelayStarterFactory, "paymentRelayStarterFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        this.paymentBrowserAuthStarterFactory = paymentBrowserAuthStarterFactory;
        this.paymentRelayStarterFactory = paymentRelayStarterFactory;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.enableLogging = z;
        this.uiContext = uiContext;
        this.publishableKeyProvider = publishableKeyProvider;
        this.isInstantApp = z2;
    }

    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<Unit> continuation) {
        if (source.getFlow() == Source.Flow.Redirect) {
            Object objStartSourceAuth = startSourceAuth(authActivityStarterHost, source, options, continuation);
            return objStartSourceAuth == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartSourceAuth : Unit.INSTANCE;
        }
        Object objBypassAuth = bypassAuth(authActivityStarterHost, source, options.getStripeAccount(), continuation);
        return objBypassAuth == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBypassAuth : Unit.INSTANCE;
    }

    /* compiled from: SourceNextActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.SourceNextActionHandler$startSourceAuth$2", m3645f = "SourceNextActionHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.SourceNextActionHandler$startSourceAuth$2 */
    static final class C425802 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ ApiRequest.Options $requestOptions;
        final /* synthetic */ Source $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425802(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<C425802> continuation) {
            super(2, continuation);
            this.$host = authActivityStarterHost;
            this.$source = source;
            this.$requestOptions = options;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SourceNextActionHandler.this.new C425802(this.$host, this.$source, this.$requestOptions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation<Unit>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return ((C425802) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SourceNextActionHandler.this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(SourceNextActionHandler.this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceRedirect, null, null, null, null, null, 62, null));
            PaymentBrowserAuthStarter paymentBrowserAuthStarter = (PaymentBrowserAuthStarter) SourceNextActionHandler.this.paymentBrowserAuthStarterFactory.invoke(this.$host);
            String id = this.$source.getId();
            if (id == null) {
                id = "";
            }
            String clientSecret = this.$source.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            Source.Redirect redirect = this.$source.getRedirect();
            String url = redirect != null ? redirect.getUrl() : null;
            if (url == null) {
                url = "";
            }
            Source.Redirect redirect2 = this.$source.getRedirect();
            paymentBrowserAuthStarter.start(new PaymentBrowserAuthContract.Args(id, 50002, clientSecret, url, redirect2 != null ? redirect2.getReturnUrl() : null, SourceNextActionHandler.this.enableLogging, null, this.$requestOptions.getStripeAccount(), false, false, this.$host.getStatusBarColor(), (String) SourceNextActionHandler.this.publishableKeyProvider.invoke(), SourceNextActionHandler.this.isInstantApp, null, false, 25408, null));
            return Unit.INSTANCE;
        }
    }

    private final Object startSourceAuth(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new C425802(authActivityStarterHost, source, options, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: SourceNextActionHandler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.SourceNextActionHandler$bypassAuth$2", m3645f = "SourceNextActionHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.SourceNextActionHandler$bypassAuth$2 */
    static final class C425792 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ Source $source;
        final /* synthetic */ String $stripeAccountId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425792(AuthActivityStarterHost authActivityStarterHost, Source source, String str, Continuation<C425792> continuation) {
            super(2, continuation);
            this.$host = authActivityStarterHost;
            this.$source = source;
            this.$stripeAccountId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SourceNextActionHandler.this.new C425792(this.$host, this.$source, this.$stripeAccountId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation<Unit>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return ((C425792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((PaymentRelayStarter) SourceNextActionHandler.this.paymentRelayStarterFactory.invoke(this.$host)).start(new PaymentRelayStarter.Args.SourceArgs(this.$source, this.$stripeAccountId));
            return Unit.INSTANCE;
        }
    }

    private final Object bypassAuth(AuthActivityStarterHost authActivityStarterHost, Source source, String str, Continuation<Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new C425792(authActivityStarterHost, source, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
