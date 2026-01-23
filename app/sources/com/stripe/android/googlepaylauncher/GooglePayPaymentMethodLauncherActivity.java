package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.Bundle2;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.gms.wallet.contract.TaskResultContracts$GetPaymentDataResult;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher3;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.uicore.utils.AnimationConstants2;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONException;

/* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "taskResult", "", "onGooglePayResult", "(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V", "paymentData", "(Lcom/google/android/gms/wallet/PaymentData;)V", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "result", "updateResult", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", "finishWithResult", "setFadeAnimations", "", "googlePayStatusCode", "googlePayStatusCodeToErrorCode", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "viewModel", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter$delegate", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherActivity extends AppCompatActivity {
    private GooglePayPaymentMethodLauncherContractV2.Args args;

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0<ErrorReporter>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$errorReporter$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ErrorReporter invoke() {
            return ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, this.this$0, null, 2, null);
        }
    });

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    private final int googlePayStatusCodeToErrorCode(int googlePayStatusCode) {
        if (googlePayStatusCode != 7) {
            return googlePayStatusCode != 10 ? 1 : 2;
        }
        return 3;
    }

    public GooglePayPaymentMethodLauncherActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GooglePayPaymentMethodLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                GooglePayPaymentMethodLauncherContractV2.Args args = this.this$0.args;
                if (args == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("args");
                    args = null;
                }
                return new GooglePayPaymentMethodLauncherViewModel.Factory(args);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GooglePayPaymentMethodLauncherViewModel getViewModel() {
        return (GooglePayPaymentMethodLauncherViewModel) this.viewModel.getValue();
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setFadeAnimations();
        GooglePayPaymentMethodLauncherContractV2.Args.Companion companion = GooglePayPaymentMethodLauncherContractV2.Args.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        GooglePayPaymentMethodLauncherContractV2.Args argsFromIntent = companion.fromIntent(intent);
        if (argsFromIntent == null) {
            finishWithResult(new GooglePayPaymentMethodLauncher3.Failed(new RuntimeException("GooglePayPaymentMethodLauncherActivity was started without arguments."), 2));
            return;
        }
        this.args = argsFromIntent;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C425341(null), 3, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncherActivity.onCreate$lambda$0(this.f$0, (ApiTaskResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        if (getViewModel().getHasLaunched$payments_core_release()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C425352(activityResultLauncherRegisterForActivityResult, null), 3, null);
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1", m3645f = "GooglePayPaymentMethodLauncherActivity.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$1 */
    static final class C425341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425341(Continuation<? super C425341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new C425341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<GooglePayPaymentMethodLauncher3> googlePayResult$payments_core_release = GooglePayPaymentMethodLauncherActivity.this.getViewModel().getGooglePayResult$payments_core_release();
                final GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                FlowCollector<? super GooglePayPaymentMethodLauncher3> flowCollector = new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GooglePayPaymentMethodLauncher3) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(GooglePayPaymentMethodLauncher3 googlePayPaymentMethodLauncher3, Continuation<? super Unit> continuation) {
                        if (googlePayPaymentMethodLauncher3 != null) {
                            googlePayPaymentMethodLauncherActivity.finishWithResult(googlePayPaymentMethodLauncher3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (googlePayResult$payments_core_release.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(GooglePayPaymentMethodLauncherActivity this$0, ApiTaskResult apiTaskResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(apiTaskResult);
        this$0.onGooglePayResult((ApiTaskResult<PaymentData>) apiTaskResult);
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2", m3645f = "GooglePayPaymentMethodLauncherActivity.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2 */
    static final class C425352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425352(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super C425352> continuation) {
            super(2, continuation);
            this.$googlePayLauncher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C425352 c425352 = GooglePayPaymentMethodLauncherActivity.this.new C425352(this.$googlePayLauncher, continuation);
            c425352.L$0 = obj;
            return c425352;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = GooglePayPaymentMethodLauncherActivity.this;
                    Result.Companion companion = Result.INSTANCE;
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    GooglePayPaymentMethodLauncherActivity3 googlePayPaymentMethodLauncherActivity3 = new GooglePayPaymentMethodLauncherActivity3(googlePayPaymentMethodLauncherActivity, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, googlePayPaymentMethodLauncherActivity3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((Task) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            ActivityResultLauncher<Task<PaymentData>> activityResultLauncher = this.$googlePayLauncher;
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                googlePayPaymentMethodLauncherActivity2.updateResult(new GooglePayPaymentMethodLauncher3.Failed(thM28553exceptionOrNullimpl, 1));
            } else {
                activityResultLauncher.launch((Task) objM28550constructorimpl);
                googlePayPaymentMethodLauncherActivity2.getViewModel().setHasLaunched$payments_core_release(true);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        setFadeAnimations();
    }

    private final void onGooglePayResult(ApiTaskResult<PaymentData> taskResult) {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                onGooglePayResult(result);
                return;
            } else {
                ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                updateResult(new GooglePayPaymentMethodLauncher3.Failed(new RuntimeException("Google Pay failed with missing data."), 1));
                return;
            }
        }
        if (statusCode == 16) {
            updateResult(GooglePayPaymentMethodLauncher3.Canceled.INSTANCE);
            return;
        }
        Status status = taskResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt.mapOf(Tuples4.m3642to("status_message", statusMessage), Tuples4.m3642to("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        GooglePayPaymentMethodLauncherViewModel viewModel = getViewModel();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        viewModel.updateResult(new GooglePayPaymentMethodLauncher3.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : "")), googlePayStatusCodeToErrorCode(status.getStatusCode())));
    }

    /* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$1", m3645f = "GooglePayPaymentMethodLauncherActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onGooglePayResult$1 */
    static final class C425361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentData $paymentData;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425361(PaymentData paymentData, Continuation<? super C425361> continuation) {
            super(2, continuation);
            this.$paymentData = paymentData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncherActivity.this.new C425361(this.$paymentData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JSONException {
            GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity2 = GooglePayPaymentMethodLauncherActivity.this;
                GooglePayPaymentMethodLauncherViewModel viewModel = googlePayPaymentMethodLauncherActivity2.getViewModel();
                PaymentData paymentData = this.$paymentData;
                this.L$0 = googlePayPaymentMethodLauncherActivity2;
                this.label = 1;
                Object objCreatePaymentMethod = viewModel.createPaymentMethod(paymentData, this);
                if (objCreatePaymentMethod == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googlePayPaymentMethodLauncherActivity = googlePayPaymentMethodLauncherActivity2;
                obj = objCreatePaymentMethod;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            googlePayPaymentMethodLauncherActivity.finishWithResult((GooglePayPaymentMethodLauncher3) obj);
            return Unit.INSTANCE;
        }
    }

    private final void onGooglePayResult(PaymentData paymentData) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C425361(paymentData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateResult(GooglePayPaymentMethodLauncher3 result) {
        getViewModel().updateResult(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayPaymentMethodLauncher3 result) {
        setResult(-1, new Intent().putExtras(Bundle2.bundleOf(Tuples4.m3642to("extra_result", result))));
        finish();
    }

    private final void setFadeAnimations() {
        AnimationConstants2.fadeOut(this);
    }
}
