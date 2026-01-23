package com.stripe.android.googlepaylauncher;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher3;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.injection.DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.StripeRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayPaymentMethodLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002/0B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001f\u001a\u00020 H\u0007J\u0016\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0086@¢\u0006\u0002\u0010$J\u0015\u0010%\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020\u0019H\u0087@¢\u0006\u0002\u0010)J\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020#0+H\u0086@¢\u0006\u0002\u0010)J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0013R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_googleResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "googlePayResult", "Lkotlinx/coroutines/flow/StateFlow;", "getGooglePayResult$payments_core_release", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "", "hasLaunched", "getHasLaunched$payments_core_release", "()Z", "setHasLaunched$payments_core_release", "(Z)V", "createPaymentDataRequest", "Lorg/json/JSONObject;", "createPaymentMethod", "paymentData", "Lcom/google/android/gms/wallet/PaymentData;", "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo$payments_core_release", "isReadyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPaymentData", "Lcom/google/android/gms/tasks/Task;", "updateResult", "", "result", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherViewModel extends ViewModel {
    private final StateFlow2<GooglePayPaymentMethodLauncher3> _googleResult;
    private final GooglePayPaymentMethodLauncherContractV2.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final GooglePayRepository googlePayRepository;
    private final StateFlow<GooglePayPaymentMethodLauncher3> googlePayResult;
    private final PaymentsClient paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GooglePayPaymentMethodLauncherViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", m3645f = "GooglePayPaymentMethodLauncherViewModel.kt", m3646l = {103}, m3647m = "createPaymentMethod")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$createPaymentMethod$1 */
    static final class C425391 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C425391(Continuation<? super C425391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayPaymentMethodLauncherViewModel.this.createPaymentMethod(null, this);
        }
    }

    /* compiled from: GooglePayPaymentMethodLauncherViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel", m3645f = "GooglePayPaymentMethodLauncherViewModel.kt", m3646l = {88, 93}, m3647m = "loadPaymentData")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$loadPaymentData$1 */
    static final class C425401 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C425401(Continuation<? super C425401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GooglePayPaymentMethodLauncherViewModel.this.loadPaymentData(this);
        }
    }

    public GooglePayPaymentMethodLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options requestOptions, GooglePayPaymentMethodLauncherContractV2.Args args, StripeRepository stripeRepository, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(googlePayJsonFactory, "googlePayJsonFactory");
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        StateFlow2<GooglePayPaymentMethodLauncher3> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(null);
        this._googleResult = stateFlow2MutableStateFlow;
        this.googlePayResult = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    public final boolean getHasLaunched$payments_core_release() {
        return Intrinsics.areEqual(this.savedStateHandle.get("has_launched"), Boolean.TRUE);
    }

    public final void setHasLaunched$payments_core_release(boolean z) {
        this.savedStateHandle.set("has_launched", Boolean.valueOf(z));
    }

    public final StateFlow<GooglePayPaymentMethodLauncher3> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final void updateResult(GooglePayPaymentMethodLauncher3 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.setValue(result);
    }

    public final Object isReadyToPay(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepository.isReady(), continuation);
    }

    public final JSONObject createPaymentDataRequest() {
        return GooglePayJsonFactory.createPaymentDataRequest$default(this.googlePayJsonFactory, createTransactionInfo$payments_core_release(this.args), Convert.convert(this.args.getConfig().getBillingAddressConfig()), null, this.args.getConfig().getIsEmailRequired(), new GooglePayJsonFactory.MerchantInfo(this.args.getConfig().getMerchantName()), Boolean.valueOf(this.args.getConfig().getAllowCreditCards()), 4, null);
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(GooglePayPaymentMethodLauncherContractV2.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new GooglePayJsonFactory.TransactionInfo(args.getCurrencyCode(), GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, args.getConfig().getMerchantCountryCode(), args.getTransactionId(), Long.valueOf(args.getAmount()), args.getLabel(), GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentData(Continuation<? super Task<PaymentData>> continuation) {
        C425401 c425401;
        GooglePayPaymentMethodLauncherViewModel googlePayPaymentMethodLauncherViewModel;
        if (continuation instanceof C425401) {
            c425401 = (C425401) continuation;
            int i = c425401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425401.label = i - Integer.MIN_VALUE;
            } else {
                c425401 = new C425401(continuation);
            }
        }
        Object objIsReadyToPay = c425401.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425401.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsReadyToPay);
            c425401.L$0 = this;
            c425401.label = 1;
            objIsReadyToPay = isReadyToPay(c425401);
            if (objIsReadyToPay != coroutine_suspended) {
                googlePayPaymentMethodLauncherViewModel = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIsReadyToPay);
            return objIsReadyToPay;
        }
        googlePayPaymentMethodLauncherViewModel = (GooglePayPaymentMethodLauncherViewModel) c425401.L$0;
        ResultKt.throwOnFailure(objIsReadyToPay);
        if (!((Boolean) objIsReadyToPay).booleanValue()) {
            throw new IllegalStateException("Google Pay is unavailable.");
        }
        Task<PaymentData> taskLoadPaymentData = googlePayPaymentMethodLauncherViewModel.paymentsClient.loadPaymentData(PaymentDataRequest.fromJson(googlePayPaymentMethodLauncherViewModel.createPaymentDataRequest().toString()));
        Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
        c425401.L$0 = null;
        c425401.label = 2;
        Object objAwaitTask$default = TasksKt.awaitTask$default(taskLoadPaymentData, null, c425401, 1, null);
        return objAwaitTask$default == coroutine_suspended ? coroutine_suspended : objAwaitTask$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethod(PaymentData paymentData, Continuation<? super GooglePayPaymentMethodLauncher3> continuation) throws JSONException {
        C425391 c425391;
        Object objMo26876createPaymentMethod0E7RQCE;
        if (continuation instanceof C425391) {
            c425391 = (C425391) continuation;
            int i = c425391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425391.label = i - Integer.MIN_VALUE;
            } else {
                c425391 = new C425391(continuation);
            }
        }
        Object obj = c425391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425391.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethodCreateParams paymentMethodCreateParamsCreateFromGooglePay = PaymentMethodCreateParams.INSTANCE.createFromGooglePay(new JSONObject(paymentData.toJson()));
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = this.requestOptions;
            c425391.label = 1;
            objMo26876createPaymentMethod0E7RQCE = stripeRepository.mo26876createPaymentMethod0E7RQCE(paymentMethodCreateParamsCreateFromGooglePay, options, c425391);
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
            return new GooglePayPaymentMethodLauncher3.Completed((PaymentMethod) objMo26876createPaymentMethod0E7RQCE);
        }
        if (thM28553exceptionOrNullimpl instanceof APIConnectionException) {
            i3 = 3;
        } else if (thM28553exceptionOrNullimpl instanceof InvalidRequestException) {
            i3 = 2;
        }
        return new GooglePayPaymentMethodLauncher3.Failed(thM28553exceptionOrNullimpl, i3);
    }

    /* compiled from: GooglePayPaymentMethodLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final GooglePayPaymentMethodLauncherContractV2.Args args;

        public Factory(GooglePayPaymentMethodLauncherContractV2.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            final Application applicationRequireApplication = CreationExtrasKtx.requireApplication(extras);
            GooglePayPaymentMethodLauncherViewModel viewModel = DaggerGooglePayPaymentMethodLauncherViewModelFactoryComponent.builder().context(applicationRequireApplication).enableLogging(false).publishableKeyProvider(new Function0<String>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$Factory$create$subComponentBuilder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return PaymentConfiguration.INSTANCE.getInstance(applicationRequireApplication).getPublishableKey();
                }
            }).stripeAccountIdProvider(new Function0<String>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel$Factory$create$subComponentBuilder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return PaymentConfiguration.INSTANCE.getInstance(applicationRequireApplication).getStripeAccountId();
                }
            }).productUsage(SetsKt.setOf("GooglePayPaymentMethodLauncher")).googlePayConfig(this.args.getConfig()).build().getSubcomponentBuilder().args(this.args).savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.create");
            return viewModel;
        }
    }

    /* compiled from: GooglePayPaymentMethodLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Companion;", "", "()V", "HAS_LAUNCHED_KEY", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
