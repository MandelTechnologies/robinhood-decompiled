package com.stripe.android.googlepaylauncher;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.StripePaymentController;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.CreationExtrasKtx;
import com.stripe.android.googlepaylauncher.BillingAddressConfig;
import com.stripe.android.googlepaylauncher.GooglePayLauncher3;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 N2\u00020\u0001:\u0002NOBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J$\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0006\u001a\u00020\u0007H\u0087@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J7\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u000102H\u0001¢\u0006\u0004\b=\u0010>J \u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0081@¢\u0006\u0004\bD\u0010EJ\u000e\u0010F\u001a\u00020$H\u0087@¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020+J\u0016\u0010I\u001a\u00020+2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CJ\"\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001901H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010GJ\u000e\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020\u001cR\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R$\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentController", "Lcom/stripe/android/PaymentController;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "_googlePayLaunchTask", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "_googleResult", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "googlePayLaunchTask", "Lkotlinx/coroutines/flow/SharedFlow;", "getGooglePayLaunchTask", "()Lkotlinx/coroutines/flow/SharedFlow;", "googlePayResult", "getGooglePayResult$payments_core_release", "value", "", "hasLaunched", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "confirmStripeIntent", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentDataRequest", "Lkotlin/Result;", "", "createPaymentDataRequest-gIAlu-s", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "currencyCode", "amount", "", AnnotatedPrivateKey.LABEL, "createTransactionInfo$payments_core_release", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "getResultFromConfirmation", "requestCode", "", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "getResultFromConfirmation$payments_core_release", "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isReadyToPay", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markTaskAsLaunched", "onConfirmResult", "resolveLoadPaymentDataTask", "resolveLoadPaymentDataTask-IoAF18A", "updateResult", "result", "Companion", "Factory", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GooglePayLauncherViewModel extends ViewModel {
    private final SharedFlow2<Task<PaymentData>> _googlePayLaunchTask;
    private final SharedFlow2<GooglePayLauncher3> _googleResult;
    private final GooglePayLauncherContract.Args args;
    private final ErrorReporter errorReporter;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final SharedFlow<Task<PaymentData>> googlePayLaunchTask;
    private final GooglePayRepository googlePayRepository;
    private final SharedFlow<GooglePayLauncher3> googlePayResult;
    private final PaymentController paymentController;
    private final PaymentsClient paymentsClient;
    private final ApiRequest.Options requestOptions;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;
    public static final int $stable = 8;

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAddressConfig.Format.values().length];
            try {
                iArr[BillingAddressConfig.Format.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAddressConfig.Format.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GooglePayLauncherViewModel(PaymentsClient paymentsClient, ApiRequest.Options requestOptions, GooglePayLauncherContract.Args args, StripeRepository stripeRepository, PaymentController paymentController, GooglePayJsonFactory googlePayJsonFactory, GooglePayRepository googlePayRepository, SavedStateHandle savedStateHandle, ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(paymentsClient, "paymentsClient");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentController, "paymentController");
        Intrinsics.checkNotNullParameter(googlePayJsonFactory, "googlePayJsonFactory");
        Intrinsics.checkNotNullParameter(googlePayRepository, "googlePayRepository");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.paymentsClient = paymentsClient;
        this.requestOptions = requestOptions;
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.googlePayJsonFactory = googlePayJsonFactory;
        this.googlePayRepository = googlePayRepository;
        this.savedStateHandle = savedStateHandle;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        SharedFlow2<GooglePayLauncher3> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        this._googleResult = sharedFlow2MutableSharedFlow$default;
        this.googlePayResult = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default);
        SharedFlow2<Task<PaymentData>> sharedFlow2MutableSharedFlow$default2 = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        this._googlePayLaunchTask = sharedFlow2MutableSharedFlow$default2;
        this.googlePayLaunchTask = FlowKt.asSharedFlow(sharedFlow2MutableSharedFlow$default2);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), workContext, null, new C425291(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasLaunched() {
        return Intrinsics.areEqual(this.savedStateHandle.get("has_launched"), Boolean.TRUE);
    }

    private final void setHasLaunched(boolean z) {
        this.savedStateHandle.set("has_launched", Boolean.valueOf(z));
    }

    public final SharedFlow<GooglePayLauncher3> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final SharedFlow<Task<PaymentData>> getGooglePayLaunchTask() {
        return this.googlePayLaunchTask;
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$1", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {75, 77}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$1 */
    static final class C425291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425291(Continuation<? super C425291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new C425291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (r1.emit((com.google.android.gms.tasks.Task) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM26850resolveLoadPaymentDataTaskIoAF18A;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!GooglePayLauncherViewModel.this.getHasLaunched()) {
                    GooglePayLauncherViewModel googlePayLauncherViewModel = GooglePayLauncherViewModel.this;
                    this.label = 1;
                    objM26850resolveLoadPaymentDataTaskIoAF18A = googlePayLauncherViewModel.m26850resolveLoadPaymentDataTaskIoAF18A(this);
                    if (objM26850resolveLoadPaymentDataTaskIoAF18A != coroutine_suspended) {
                        GooglePayLauncherViewModel googlePayLauncherViewModel2 = GooglePayLauncherViewModel.this;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26850resolveLoadPaymentDataTaskIoAF18A);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM26850resolveLoadPaymentDataTaskIoAF18A = ((Result) obj).getValue();
            GooglePayLauncherViewModel googlePayLauncherViewModel22 = GooglePayLauncherViewModel.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26850resolveLoadPaymentDataTaskIoAF18A);
            if (thM28553exceptionOrNullimpl != null) {
                SharedFlow2 sharedFlow2 = googlePayLauncherViewModel22._googlePayLaunchTask;
                this.label = 2;
            } else {
                googlePayLauncherViewModel22.updateResult(new GooglePayLauncher3.Failed(thM28553exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateResult(GooglePayLauncher3 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this._googleResult.tryEmit(result);
    }

    public final Object isReadyToPay(Continuation<? super Boolean> continuation) {
        return FlowKt.first(this.googlePayRepository.isReady(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: createPaymentDataRequest-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26851createPaymentDataRequestgIAlus(GooglePayLauncherContract.Args args, Continuation<? super Result<String>> continuation) {
        GooglePayLauncherViewModel4 googlePayLauncherViewModel4;
        Object objM26909retrieveSetupIntentBWLJW6A$default;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        Object objM26908retrievePaymentIntentBWLJW6A$default;
        Object objM28550constructorimpl;
        GooglePayJsonFactory.BillingAddressParameters.Format format2;
        GooglePayLauncherContract.Args args2 = args;
        if (continuation instanceof GooglePayLauncherViewModel4) {
            googlePayLauncherViewModel4 = (GooglePayLauncherViewModel4) continuation;
            int i = googlePayLauncherViewModel4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel4.label = i - Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel4 = new GooglePayLauncherViewModel4(this, continuation);
            }
        }
        GooglePayLauncherViewModel4 googlePayLauncherViewModel42 = googlePayLauncherViewModel4;
        Object obj = googlePayLauncherViewModel42.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = googlePayLauncherViewModel42.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (args2 instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                StripeRepository stripeRepository = this.stripeRepository;
                String clientSecret = args2.getClientSecret();
                ApiRequest.Options options = this.requestOptions;
                googlePayLauncherViewModel42.L$0 = this;
                googlePayLauncherViewModel42.L$1 = args2;
                googlePayLauncherViewModel42.label = 1;
                objM26908retrievePaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m26908retrievePaymentIntentBWLJW6A$default(stripeRepository, clientSecret, options, null, googlePayLauncherViewModel42, 4, null);
                if (objM26908retrievePaymentIntentBWLJW6A$default != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (Result.m28556isSuccessimpl(objM26908retrievePaymentIntentBWLJW6A$default)) {
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(objM26908retrievePaymentIntentBWLJW6A$default);
                }
            } else if (args2 instanceof GooglePayLauncherContract.SetupIntentArgs) {
                StripeRepository stripeRepository2 = this.stripeRepository;
                String clientSecret2 = args2.getClientSecret();
                ApiRequest.Options options2 = this.requestOptions;
                googlePayLauncherViewModel42.L$0 = this;
                googlePayLauncherViewModel42.L$1 = args2;
                googlePayLauncherViewModel42.label = 2;
                objM26909retrieveSetupIntentBWLJW6A$default = StripeRepository.DefaultImpls.m26909retrieveSetupIntentBWLJW6A$default(stripeRepository2, clientSecret2, options2, null, googlePayLauncherViewModel42, 4, null);
                if (objM26909retrieveSetupIntentBWLJW6A$default != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (Result.m28556isSuccessimpl(objM26909retrieveSetupIntentBWLJW6A$default)) {
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl(objM26909retrieveSetupIntentBWLJW6A$default);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel42.L$1;
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel42.L$0;
            ResultKt.throwOnFailure(obj);
            objM26908retrievePaymentIntentBWLJW6A$default = ((Result) obj).getValue();
            if (Result.m28556isSuccessimpl(objM26908retrievePaymentIntentBWLJW6A$default)) {
                PaymentIntent paymentIntent = (PaymentIntent) objM26908retrievePaymentIntentBWLJW6A$default;
                String currency = paymentIntent.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                objM26908retrievePaymentIntentBWLJW6A$default = createTransactionInfo$payments_core_release$default(googlePayLauncherViewModel, paymentIntent, currency, null, ((GooglePayLauncherContract.PaymentIntentArgs) args2).getLabel(), 4, null);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(objM26908retrievePaymentIntentBWLJW6A$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            args2 = (GooglePayLauncherContract.Args) googlePayLauncherViewModel42.L$1;
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel42.L$0;
            ResultKt.throwOnFailure(obj);
            objM26909retrieveSetupIntentBWLJW6A$default = ((Result) obj).getValue();
            if (Result.m28556isSuccessimpl(objM26909retrieveSetupIntentBWLJW6A$default)) {
                GooglePayLauncherContract.SetupIntentArgs setupIntentArgs = (GooglePayLauncherContract.SetupIntentArgs) args2;
                objM26909retrieveSetupIntentBWLJW6A$default = googlePayLauncherViewModel.createTransactionInfo$payments_core_release((SetupIntent) objM26909retrieveSetupIntentBWLJW6A$default, setupIntentArgs.getCurrencyCode(), setupIntentArgs.getAmount(), setupIntentArgs.getLabel());
            }
            objM28550constructorimpl = Result.m28550constructorimpl(objM26909retrieveSetupIntentBWLJW6A$default);
        }
        if (!Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            return Result.m28550constructorimpl(objM28550constructorimpl);
        }
        GooglePayJsonFactory.TransactionInfo transactionInfo = (GooglePayJsonFactory.TransactionInfo) objM28550constructorimpl;
        GooglePayJsonFactory googlePayJsonFactory = googlePayLauncherViewModel.googlePayJsonFactory;
        GooglePayJsonFactory.MerchantInfo merchantInfo = new GooglePayJsonFactory.MerchantInfo(args2.getConfig().getMerchantName());
        boolean isRequired = args2.getConfig().getBillingAddressConfig().getIsRequired();
        int i3 = WhenMappings.$EnumSwitchMapping$0[args2.getConfig().getBillingAddressConfig().getFormat().ordinal()];
        if (i3 == 1) {
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return Result.m28550constructorimpl(GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(isRequired, format2, args2.getConfig().getBillingAddressConfig().getIsPhoneNumberRequired()), null, args2.getConfig().getIsEmailRequired(), merchantInfo, boxing.boxBoolean(args2.getConfig().getAllowCreditCards()), 4, null).toString());
    }

    public static /* synthetic */ GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release$default(GooglePayLauncherViewModel googlePayLauncherViewModel, StripeIntent stripeIntent, String str, Long l, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return googlePayLauncherViewModel.createTransactionInfo$payments_core_release(stripeIntent, str, l, str2);
    }

    public final GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_release(StripeIntent stripeIntent, String currencyCode, Long amount, String label) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (stripeIntent instanceof PaymentIntent) {
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final, this.args.getConfig().getMerchantCountryCode(), stripeIntent.getId(), ((PaymentIntent) stripeIntent).getAmount(), null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase);
        }
        if (stripeIntent instanceof SetupIntent) {
            return new GooglePayJsonFactory.TransactionInfo(currencyCode, GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Estimated, this.args.getConfig().getMerchantCountryCode(), stripeIntent.getId(), Long.valueOf(amount != null ? amount.longValue() : 0L), label, GooglePayJsonFactory.TransactionInfo.CheckoutOption.Default);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (r8 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:18:0x004a, B:27:0x0062, B:29:0x006a, B:30:0x0071, B:31:0x0078), top: B:60:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[Catch: all -> 0x004e, TryCatch #2 {all -> 0x004e, blocks: (B:18:0x004a, B:27:0x0062, B:29:0x006a, B:30:0x0071, B:31:0x0078), top: B:60:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[PHI: r8
      0x00ba: PHI (r8v30 java.lang.Object) = (r8v20 java.lang.Object), (r8v22 java.lang.Object) binds: [B:42:0x00a6, B:46:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: resolveLoadPaymentDataTask-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m26850resolveLoadPaymentDataTaskIoAF18A(Continuation<? super Result<? extends Task<PaymentData>>> continuation) {
        GooglePayLauncherViewModel6 googlePayLauncherViewModel6;
        GooglePayLauncherViewModel googlePayLauncherViewModel;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        Object objM28550constructorimpl2;
        Object objM28550constructorimpl3;
        if (continuation instanceof GooglePayLauncherViewModel6) {
            googlePayLauncherViewModel6 = (GooglePayLauncherViewModel6) continuation;
            int i = googlePayLauncherViewModel6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel6.label = i - Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel6 = new GooglePayLauncherViewModel6(this, continuation);
            }
        }
        Object objIsReadyToPay = googlePayLauncherViewModel6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = googlePayLauncherViewModel6.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsReadyToPay);
            try {
                Result.Companion companion = Result.INSTANCE;
                googlePayLauncherViewModel6.L$0 = this;
                googlePayLauncherViewModel6.label = 1;
                objIsReadyToPay = isReadyToPay(googlePayLauncherViewModel6);
                if (objIsReadyToPay != coroutine_suspended) {
                    googlePayLauncherViewModel = this;
                    if (!((Boolean) objIsReadyToPay).booleanValue()) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                googlePayLauncherViewModel = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl == null) {
                }
                if (!Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
                }
                return Result.m28550constructorimpl(objM28550constructorimpl3);
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objIsReadyToPay);
                objM28550constructorimpl3 = (Task) objIsReadyToPay;
                return Result.m28550constructorimpl(objM28550constructorimpl3);
            }
            googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel6.L$0;
            ResultKt.throwOnFailure(objIsReadyToPay);
            objM28550constructorimpl2 = ((Result) objIsReadyToPay).getValue();
            if (!Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
                try {
                    objM28550constructorimpl3 = Result.m28550constructorimpl(PaymentDataRequest.fromJson((String) objM28550constructorimpl2));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl2 = ResultKt.createFailure(th2);
                }
                if (Result.m28556isSuccessimpl(objM28550constructorimpl3)) {
                    Task<PaymentData> taskLoadPaymentData = googlePayLauncherViewModel.paymentsClient.loadPaymentData((PaymentDataRequest) objM28550constructorimpl3);
                    Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
                    googlePayLauncherViewModel6.L$0 = null;
                    googlePayLauncherViewModel6.label = 3;
                    objIsReadyToPay = TasksKt.awaitTask$default(taskLoadPaymentData, null, googlePayLauncherViewModel6, 1, null);
                }
            } else {
                objM28550constructorimpl3 = Result.m28550constructorimpl(objM28550constructorimpl2);
                if (Result.m28556isSuccessimpl(objM28550constructorimpl3)) {
                }
            }
            return Result.m28550constructorimpl(objM28550constructorimpl3);
        }
        googlePayLauncherViewModel = (GooglePayLauncherViewModel) googlePayLauncherViewModel6.L$0;
        try {
            ResultKt.throwOnFailure(objIsReadyToPay);
            if (!((Boolean) objIsReadyToPay).booleanValue()) {
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } else {
                throw new IllegalStateException("Google Pay is unavailable.");
            }
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion22 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            }
            if (!Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
            }
            return Result.m28550constructorimpl(objM28550constructorimpl3);
        }
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            GooglePayLauncherContract.Args args = googlePayLauncherViewModel.args;
            googlePayLauncherViewModel6.L$0 = googlePayLauncherViewModel;
            googlePayLauncherViewModel6.label = 2;
            objM28550constructorimpl2 = googlePayLauncherViewModel.m26851createPaymentDataRequestgIAlus(args, googlePayLauncherViewModel6);
            if (objM28550constructorimpl2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        if (!Result.m28556isSuccessimpl(objM28550constructorimpl2)) {
        }
        return Result.m28550constructorimpl(objM28550constructorimpl3);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$confirmStripeIntent$1", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$confirmStripeIntent$1 */
    static final class C425301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ PaymentMethodCreateParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425301(PaymentMethodCreateParams paymentMethodCreateParams, AuthActivityStarterHost authActivityStarterHost, Continuation<? super C425301> continuation) {
            super(2, continuation);
            this.$params = paymentMethodCreateParams;
            this.$host = authActivityStarterHost;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new C425301(this.$params, this.$host, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ConfirmStripeIntentParams confirmStripeIntentParamsCreate$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayLauncherContract.Args args = GooglePayLauncherViewModel.this.args;
                if (args instanceof GooglePayLauncherContract.PaymentIntentArgs) {
                    confirmStripeIntentParamsCreate$default = ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, this.$params, GooglePayLauncherViewModel.this.args.getClientSecret(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                } else if (args instanceof GooglePayLauncherContract.SetupIntentArgs) {
                    confirmStripeIntentParamsCreate$default = ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, this.$params, GooglePayLauncherViewModel.this.args.getClientSecret(), null, null, 12, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentController paymentController = GooglePayLauncherViewModel.this.paymentController;
                AuthActivityStarterHost authActivityStarterHost = this.$host;
                ApiRequest.Options options = GooglePayLauncherViewModel.this.requestOptions;
                this.label = 1;
                if (paymentController.startConfirmAndAuth(authActivityStarterHost, confirmStripeIntentParamsCreate$default, options, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void confirmStripeIntent(AuthActivityStarterHost host, PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(params, "params");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.workContext, null, new C425301(params, host, null), 2, null);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1", m3645f = "GooglePayLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$onConfirmResult$1 */
    static final class C425311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425311(int i, Intent intent, Continuation<? super C425311> continuation) {
            super(2, continuation);
            this.$requestCode = i;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherViewModel.this.new C425311(this.$requestCode, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r1.emit((com.stripe.android.googlepaylauncher.GooglePayLauncher3) r6, r5) == r0) goto L15;
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
                GooglePayLauncherViewModel googlePayLauncherViewModel = GooglePayLauncherViewModel.this;
                int i2 = this.$requestCode;
                Intent intent = this.$data;
                this.label = 1;
                obj = googlePayLauncherViewModel.getResultFromConfirmation$payments_core_release(i2, intent, this);
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
            SharedFlow2 sharedFlow2 = GooglePayLauncherViewModel.this._googleResult;
            this.label = 2;
        }
    }

    public final void onConfirmResult(int requestCode, Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), this.workContext, null, new C425311(requestCode, data, null), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getResultFromConfirmation$payments_core_release(int i, Intent intent, Continuation<? super GooglePayLauncher3> continuation) {
        GooglePayLauncherViewModel5 googlePayLauncherViewModel5;
        Object objM28550constructorimpl;
        if (continuation instanceof GooglePayLauncherViewModel5) {
            googlePayLauncherViewModel5 = (GooglePayLauncherViewModel5) continuation;
            int i2 = googlePayLauncherViewModel5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googlePayLauncherViewModel5.label = i2 - Integer.MIN_VALUE;
            } else {
                googlePayLauncherViewModel5 = new GooglePayLauncherViewModel5(this, continuation);
            }
        }
        Object obj = googlePayLauncherViewModel5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = googlePayLauncherViewModel5.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.paymentController.shouldHandlePaymentResult(i, intent)) {
                PaymentController paymentController = this.paymentController;
                googlePayLauncherViewModel5.label = 1;
                objM28550constructorimpl = paymentController.mo26836getPaymentIntentResultgIAlus(intent, googlePayLauncherViewModel5);
            } else if (this.paymentController.shouldHandleSetupResult(i, intent)) {
                PaymentController paymentController2 = this.paymentController;
                googlePayLauncherViewModel5.label = 2;
                objM28550constructorimpl = paymentController2.mo26837getSetupIntentResultgIAlus(intent, googlePayLauncherViewModel5);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected confirmation result.");
                this.errorReporter.report(ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_UNEXPECTED_CONFIRM_RESULT, StripeException.INSTANCE.create(illegalStateException), MapsKt.mapOf(Tuples4.m3642to("request_code", String.valueOf(i))));
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(illegalStateException));
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM28550constructorimpl = ((Result) obj).getValue();
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            return GooglePayLauncher3.Completed.INSTANCE;
        }
        return new GooglePayLauncher3.Failed(thM28553exceptionOrNullimpl);
    }

    public final void markTaskAsLaunched() {
        setHasLaunched(true);
        this._googlePayLaunchTask.tryEmit(null);
    }

    /* compiled from: GooglePayLauncherViewModel.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        private final GooglePayLauncherContract.Args args;
        private final boolean enableLogging;
        private final CoroutineContext workContext;

        public Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.args = args;
            this.enableLogging = z;
            this.workContext = workContext;
        }

        public /* synthetic */ Factory(GooglePayLauncherContract.Args args, boolean z, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(args, (i & 2) != 0 ? false : z, (i & 4) != 0 ? Dispatchers.getIO() : coroutineContext);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application applicationRequireApplication = CreationExtrasKtx.requireApplication(extras);
            GooglePayEnvironment environment = this.args.getConfig().getEnvironment();
            Logger companion = Logger.INSTANCE.getInstance(this.enableLogging);
            PaymentConfiguration companion2 = PaymentConfiguration.INSTANCE.getInstance(applicationRequireApplication);
            final String publishableKey = companion2.getPublishableKey();
            String stripeAccountId = companion2.getStripeAccountId();
            Set of = SetsKt.setOf("GooglePayLauncher");
            AppInfo appInfo = null;
            StripeNetworkClient stripeNetworkClient = null;
            AnalyticsRequestExecutor analyticsRequestExecutor = null;
            FraudDetectionDataRepository fraudDetectionDataRepository = null;
            CardAccountRangeRepository.Factory factory = null;
            StripeApiRepository stripeApiRepository = new StripeApiRepository(applicationRequireApplication, new Function0<String>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$Factory$create$stripeRepository$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return publishableKey;
                }
            }, appInfo, companion, this.workContext, of, stripeNetworkClient, analyticsRequestExecutor, fraudDetectionDataRepository, factory, new PaymentAnalyticsRequestFactory(applicationRequireApplication, publishableKey, (Set<String>) of), null, null, null, null, 31684, null);
            return new GooglePayLauncherViewModel(new PaymentsClientFactory2(applicationRequireApplication).create(environment), new ApiRequest.Options(publishableKey, stripeAccountId, null, 4, null), this.args, stripeApiRepository, new StripePaymentController(applicationRequireApplication, new Function0<String>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$Factory$create$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return publishableKey;
                }
            }, stripeApiRepository, this.enableLogging, this.workContext, null, null, null, null, 480, null), new GooglePayJsonFactory(new GooglePayConfig(publishableKey, stripeAccountId), this.args.getConfig().isJcbEnabled$payments_core_release()), new GooglePayRepository2(applicationRequireApplication, this.args.getConfig().getEnvironment(), Convert.convert(this.args.getConfig().getBillingAddressConfig()), this.args.getConfig().getExistingPaymentMethodRequired(), this.args.getConfig().getAllowCreditCards(), null, companion, 32, null), SavedStateHandleSupport.createSavedStateHandle(extras), ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, applicationRequireApplication, null, 2, null), this.workContext);
        }
    }
}
