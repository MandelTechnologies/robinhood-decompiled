package com.stripe.android.payments.paymentlauncher;

import android.app.Application;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams2;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.utils.MapUtils;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002NOB\u0093\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0002\u0010\u001eJ.\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u0002022\u0006\u0010,\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5J\u001d\u00106\u001a\u0002022\u0006\u00107\u001a\u00020\u000f2\u0006\u00103\u001a\u000204H\u0000¢\u0006\u0002\b8J\u001c\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0:2\u0006\u0010,\u001a\u00020-H\u0002J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0:2\u0006\u00107\u001a\u00020\u000fH\u0002J\u0012\u0010<\u001a\u0002022\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0002J\u0015\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@J2\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020&2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010+2\u0014\b\u0002\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0:H\u0002J\u0016\u0010E\u001a\u0002022\f\u0010F\u001a\b\u0012\u0004\u0012\u00020+0GH\u0002J\u001d\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0000¢\u0006\u0002\bMR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "isPaymentIntent", "", "stripeApiRepository", "Lcom/stripe/android/networking/StripeRepository;", "nextActionHandlerRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "apiRequestOptionsProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "threeDs1IntentReturnUrlMap", "", "", "lazyPaymentIntentFlowResultProcessor", "Ldagger/Lazy;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "lazySetupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "isInstantApp", "(ZLcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;Lcom/stripe/android/payments/DefaultReturnUrl;Ljavax/inject/Provider;Ljava/util/Map;Ldagger/Lazy;Ldagger/Lazy;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Z)V", "confirmActionRequested", "getConfirmActionRequested", "()Z", "hasStarted", "getHasStarted", "internalPaymentResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "getInternalPaymentResult$payments_core_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "confirmIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "returnUrl", "confirmIntent-0E7RQCE", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmStripeIntent", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "confirmStripeIntent$payments_core_release", "handleNextActionForStripeIntent", "clientSecret", "handleNextActionForStripeIntent$payments_core_release", "logConfirmStarted", "", "logHandleNextActionStarted", "logReturnUrl", "onPaymentFlowResult", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onPaymentFlowResult$payments_core_release", "postInternalResult", "stripeInternalResult", "intent", "analyticsParams", "postResult", "stripeIntentResult", "Lcom/stripe/android/StripeIntentResult;", "register", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "register$payments_core_release", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class PaymentLauncherViewModel extends ViewModel {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final DefaultReturnUrl defaultReturnUrl;
    private final StateFlow2<InternalPaymentResult> internalPaymentResult;
    private final boolean isInstantApp;
    private final boolean isPaymentIntent;
    private final Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor;
    private final Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor;
    private final PaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeApiRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    public PaymentLauncherViewModel(boolean z, StripeRepository stripeApiRepository, PaymentNextActionHandlerRegistry nextActionHandlerRegistry, DefaultReturnUrl defaultReturnUrl, Provider<ApiRequest.Options> apiRequestOptionsProvider, Map<String, String> threeDs1IntentReturnUrlMap, Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor, Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext uiContext, SavedStateHandle savedStateHandle, boolean z2) {
        Intrinsics.checkNotNullParameter(stripeApiRepository, "stripeApiRepository");
        Intrinsics.checkNotNullParameter(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
        Intrinsics.checkNotNullParameter(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.isPaymentIntent = z;
        this.stripeApiRepository = stripeApiRepository;
        this.nextActionHandlerRegistry = nextActionHandlerRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = apiRequestOptionsProvider;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.lazyPaymentIntentFlowResultProcessor = lazyPaymentIntentFlowResultProcessor;
        this.lazySetupIntentFlowResultProcessor = lazySetupIntentFlowResultProcessor;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = uiContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z2;
        this.internalPaymentResult = StateFlow4.MutableStateFlow(null);
    }

    private final boolean getHasStarted() {
        Boolean bool = (Boolean) this.savedStateHandle.get("key_has_started");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean getConfirmActionRequested() {
        Boolean bool = (Boolean) this.savedStateHandle.get("confirm_action_requested");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final StateFlow2<InternalPaymentResult> getInternalPaymentResult$payments_core_release() {
        return this.internalPaymentResult;
    }

    public final void register$payments_core_release(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.nextActionHandlerRegistry.onNewActivityResultCaller(activityResultCaller, new PaymentLauncherViewModel$register$1(this));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.this$0.nextActionHandlerRegistry.onLauncherInvalidated();
                super.onDestroy(owner);
            }
        });
    }

    public final void confirmStripeIntent$payments_core_release(ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new PaymentLauncherViewModel$confirmStripeIntent$1(this, confirmStripeIntentParams, host, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> logConfirmStarted(ConfirmStripeIntentParams confirmStripeIntentParams) {
        PaymentMethodCreateParams paymentMethodCreateParamsCreateParams = ConfirmStripeIntentParams2.createParams(confirmStripeIntentParams);
        Map<String, String> mapFilterNotNullValues = MapUtils.filterNotNullValues(MapsKt.mapOf(Tuples4.m3642to("payment_method_type", paymentMethodCreateParamsCreateParams != null ? paymentMethodCreateParamsCreateParams.getCode() : null), Tuples4.m3642to("intent_id", PaymentLauncherViewModelKt.toStripeId(confirmStripeIntentParams.getClientSecret()))));
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherConfirmStarted, mapFilterNotNullValues));
        return mapFilterNotNullValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: confirmIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26952confirmIntent0E7RQCE(ConfirmStripeIntentParams confirmStripeIntentParams, String str, Continuation<? super Result<? extends StripeIntent>> continuation) {
        PaymentLauncherViewModel$confirmIntent$1 paymentLauncherViewModel$confirmIntent$1;
        if (continuation instanceof PaymentLauncherViewModel$confirmIntent$1) {
            paymentLauncherViewModel$confirmIntent$1 = (PaymentLauncherViewModel$confirmIntent$1) continuation;
            int i = paymentLauncherViewModel$confirmIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                paymentLauncherViewModel$confirmIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                paymentLauncherViewModel$confirmIntent$1 = new PaymentLauncherViewModel$confirmIntent$1(this, continuation);
            }
        }
        Object obj = paymentLauncherViewModel$confirmIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = paymentLauncherViewModel$confirmIntent$1.label;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        confirmStripeIntentParams.setReturnUrl(str);
        ConfirmStripeIntentParams confirmStripeIntentParamsWithShouldUseStripeSdk = confirmStripeIntentParams.withShouldUseStripeSdk(true);
        if (confirmStripeIntentParamsWithShouldUseStripeSdk instanceof ConfirmPaymentIntentParams) {
            ApiRequest.Options options = this.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(options, "get(...)");
            List<String> list = EXPAND_PAYMENT_METHOD;
            paymentLauncherViewModel$confirmIntent$1.label = 1;
            Object objMo26872confirmPaymentIntentBWLJW6A = this.stripeApiRepository.mo26872confirmPaymentIntentBWLJW6A((ConfirmPaymentIntentParams) confirmStripeIntentParamsWithShouldUseStripeSdk, options, list, paymentLauncherViewModel$confirmIntent$1);
            if (objMo26872confirmPaymentIntentBWLJW6A != coroutine_suspended) {
                return objMo26872confirmPaymentIntentBWLJW6A;
            }
        } else {
            if (!(confirmStripeIntentParamsWithShouldUseStripeSdk instanceof ConfirmSetupIntentParams)) {
                throw new NoWhenBranchMatchedException();
            }
            ApiRequest.Options options2 = this.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(options2, "get(...)");
            List<String> list2 = EXPAND_PAYMENT_METHOD;
            paymentLauncherViewModel$confirmIntent$1.label = 2;
            Object objMo26873confirmSetupIntentBWLJW6A = this.stripeApiRepository.mo26873confirmSetupIntentBWLJW6A((ConfirmSetupIntentParams) confirmStripeIntentParamsWithShouldUseStripeSdk, options2, list2, paymentLauncherViewModel$confirmIntent$1);
            if (objMo26873confirmSetupIntentBWLJW6A != coroutine_suspended) {
                return objMo26873confirmSetupIntentBWLJW6A;
            }
        }
        return coroutine_suspended;
    }

    public final void handleNextActionForStripeIntent$payments_core_release(String clientSecret, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this, clientSecret, host, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> logHandleNextActionStarted(String clientSecret) {
        Map<String, String> mapMapOf = MapsKt.mapOf(Tuples4.m3642to("intent_id", PaymentLauncherViewModelKt.toStripeId(clientSecret)));
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherNextActionStarted, mapMapOf));
        return mapMapOf;
    }

    public final void onPaymentFlowResult$payments_core_release(Unvalidated paymentFlowResult) {
        Intrinsics.checkNotNullParameter(paymentFlowResult, "paymentFlowResult");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new PaymentLauncherViewModel$onPaymentFlowResult$1(this, paymentFlowResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postResult(StripeIntentResult<? extends StripeIntent> stripeIntentResult) {
        InternalPaymentResult completed;
        int outcome = stripeIntentResult.getOutcome();
        if (outcome == 1) {
            completed = new InternalPaymentResult.Completed(stripeIntentResult.getIntent());
        } else if (outcome == 2) {
            completed = new InternalPaymentResult.Failed(new LocalStripeException(stripeIntentResult.getFailureMessage(), "failedIntentOutcomeError"));
        } else if (outcome == 3) {
            completed = InternalPaymentResult.Canceled.INSTANCE;
        } else if (outcome == 4) {
            completed = new InternalPaymentResult.Failed(new LocalStripeException("Payment fails due to time out. \n" + stripeIntentResult.getFailureMessage(), "timedOutIntentOutcomeError"));
        } else {
            completed = new InternalPaymentResult.Failed(new LocalStripeException("Payment fails due to unknown error. \n" + stripeIntentResult.getFailureMessage(), "unknownIntentOutcomeError"));
        }
        postInternalResult$default(this, completed, stripeIntentResult.getIntent(), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void postInternalResult$default(PaymentLauncherViewModel paymentLauncherViewModel, InternalPaymentResult internalPaymentResult, StripeIntent stripeIntent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            stripeIntent = null;
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        paymentLauncherViewModel.postInternalResult(internalPaymentResult, stripeIntent, map);
    }

    private final void postInternalResult(InternalPaymentResult stripeInternalResult, StripeIntent intent, Map<String, String> analyticsParams) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        Map<String, String> mapEmptyMap;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type2;
        StripeIntent.Status status;
        String clientSecret;
        StateFlow2<InternalPaymentResult> stateFlow2 = this.internalPaymentResult;
        if (getConfirmActionRequested()) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.PaymentLauncherConfirmFinished;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.PaymentLauncherNextActionFinished;
        }
        String str = null;
        Tuples2 tuples2M3642to = Tuples4.m3642to("intent_id", (intent == null || (clientSecret = intent.getClientSecret()) == null) ? null : PaymentLauncherViewModelKt.toStripeId(clientSecret));
        Tuples2 tuples2M3642to2 = Tuples4.m3642to("status", (intent == null || (status = intent.getStatus()) == null) ? null : status.getCode());
        if (intent != null && (paymentMethod = intent.getPaymentMethod()) != null && (type2 = paymentMethod.type) != null) {
            str = type2.code;
        }
        Map mapFilterNotNullValues = MapUtils.filterNotNullValues(MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, Tuples4.m3642to("payment_method_type", str)));
        if (stripeInternalResult instanceof InternalPaymentResult.Failed) {
            mapEmptyMap = ErrorReporter.INSTANCE.getAdditionalParamsFromStripeException(StripeException.INSTANCE.create(((InternalPaymentResult.Failed) stripeInternalResult).getThrowable()));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(paymentAnalyticsEvent, MapsKt.plus(MapsKt.plus(analyticsParams, mapFilterNotNullValues), mapEmptyMap)));
        stateFlow2.setValue(stripeInternalResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logReturnUrl(String returnUrl) {
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

    /* compiled from: PaymentLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "(Lkotlin/jvm/functions/Function0;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final Function0<PaymentLauncherContract.Args> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends PaymentLauncherContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0064  */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            final PaymentLauncherContract.Args argsInvoke = this.argsSupplier.invoke();
            Application applicationRequireApplication = CreationExtrasKtx.requireApplication(extras);
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentLauncherViewModelSubcomponent.Builder viewModelSubcomponentBuilder = DaggerPaymentLauncherViewModelFactoryComponent.builder().context(applicationRequireApplication).enableLogging(argsInvoke.getEnableLogging()).publishableKeyProvider(new Function0<String>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$create$subcomponentBuilder$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return argsInvoke.getPublishableKey();
                }
            }).stripeAccountIdProvider(new Function0<String>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$create$subcomponentBuilder$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return argsInvoke.getStripeAccountId();
                }
            }).productUsage(argsInvoke.getProductUsage()).includePaymentSheetNextHandlers(argsInvoke.getIncludePaymentSheetNextHandlers()).build().getViewModelSubcomponentBuilder();
            boolean z = false;
            if (argsInvoke instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) argsInvoke).getConfirmStripeIntentParams();
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    z = true;
                } else if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!(argsInvoke instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs)) {
                if (!(argsInvoke instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            PaymentLauncherViewModel viewModel = viewModelSubcomponentBuilder.isPaymentIntent(z).savedStateHandle(savedStateHandleCreateSavedStateHandle).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return viewModel;
        }
    }
}
