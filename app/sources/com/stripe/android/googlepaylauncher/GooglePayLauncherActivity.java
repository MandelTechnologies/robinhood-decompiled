package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.Bundle2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
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
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.stripe.android.googlepaylauncher.GooglePayLauncher3;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.uicore.utils.AnimationConstants2;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Deprecated;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GooglePayLauncherActivity.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u0012\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0016\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "errorReporter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "viewModel$delegate", "finish", "", "finishWithResult", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGooglePayResult", "taskResult", "Lcom/google/android/gms/wallet/contract/ApiTaskResult;", "Lcom/google/android/gms/wallet/PaymentData;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GooglePayLauncherActivity extends AppCompatActivity {
    private GooglePayLauncherContract.Args args;

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0<ErrorReporter>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$errorReporter$2
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

    public GooglePayLauncherActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GooglePayLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                GooglePayLauncherContract.Args args = this.this$0.args;
                if (args == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("args");
                    args = null;
                }
                return new GooglePayLauncherViewModel.Factory(args, false, null, 6, null);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$special$$inlined$viewModels$default$3
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
    public final GooglePayLauncherViewModel getViewModel() {
        return (GooglePayLauncherViewModel) this.viewModel.getValue();
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM28550constructorimpl;
        GooglePayLauncherContract.Args argsFromIntent$payments_core_release;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            GooglePayLauncherContract.Args.Companion companion2 = GooglePayLauncherContract.Args.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            argsFromIntent$payments_core_release = companion2.fromIntent$payments_core_release(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (argsFromIntent$payments_core_release == null) {
            throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.");
        }
        objM28550constructorimpl = Result.m28550constructorimpl(argsFromIntent$payments_core_release);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            finishWithResult(new GooglePayLauncher3.Failed(thM28553exceptionOrNullimpl));
            return;
        }
        this.args = (GooglePayLauncherContract.Args) objM28550constructorimpl;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C425273(null), 3, null);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new TaskResultContracts$GetPaymentDataResult(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) throws JSONException {
                GooglePayLauncherActivity.onCreate$lambda$3(this.f$0, (ApiTaskResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C425284(activityResultLauncherRegisterForActivityResult, null), 3, null);
    }

    /* compiled from: GooglePayLauncherActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$3", m3645f = "GooglePayLauncherActivity.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$3 */
    static final class C425273 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C425273(Continuation<? super C425273> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new C425273(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425273) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<GooglePayLauncher3> googlePayResult$payments_core_release = GooglePayLauncherActivity.this.getViewModel().getGooglePayResult$payments_core_release();
                final GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                FlowCollector<? super GooglePayLauncher3> flowCollector = new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity.onCreate.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((GooglePayLauncher3) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(GooglePayLauncher3 googlePayLauncher3, Continuation<? super Unit> continuation) {
                        if (googlePayLauncher3 != null) {
                            googlePayLauncherActivity.finishWithResult(googlePayLauncher3);
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
    public static final void onCreate$lambda$3(GooglePayLauncherActivity this$0, ApiTaskResult apiTaskResult) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(apiTaskResult);
        this$0.onGooglePayResult(apiTaskResult);
    }

    /* compiled from: GooglePayLauncherActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4", m3645f = "GooglePayLauncherActivity.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4 */
    static final class C425284 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425284(ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super C425284> continuation) {
            super(2, continuation);
            this.$googlePayLauncher = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayLauncherActivity.this.new C425284(this.$googlePayLauncher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425284) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GooglePayLauncherActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4$1", m3645f = "GooglePayLauncherActivity.kt", m3646l = {77}, m3647m = "invokeSuspend")
        /* renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ActivityResultLauncher<Task<PaymentData>> $googlePayLauncher;
            int label;
            final /* synthetic */ GooglePayLauncherActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GooglePayLauncherActivity googlePayLauncherActivity, ActivityResultLauncher<Task<PaymentData>> activityResultLauncher, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = googlePayLauncherActivity;
                this.$googlePayLauncher = activityResultLauncher;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$googlePayLauncher, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Task<PaymentData>> googlePayLaunchTask = this.this$0.getViewModel().getGooglePayLaunchTask();
                    final ActivityResultLauncher<Task<PaymentData>> activityResultLauncher = this.$googlePayLauncher;
                    final GooglePayLauncherActivity googlePayLauncherActivity = this.this$0;
                    FlowCollector<? super Task<PaymentData>> flowCollector = new FlowCollector() { // from class: com.stripe.android.googlepaylauncher.GooglePayLauncherActivity.onCreate.4.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Task<PaymentData>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Task<PaymentData> task, Continuation<? super Unit> continuation) {
                            if (task != null) {
                                activityResultLauncher.launch(task);
                                googlePayLauncherActivity.getViewModel().markTaskAsLaunched();
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (googlePayLaunchTask.collect(flowCollector, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayLauncherActivity googlePayLauncherActivity = GooglePayLauncherActivity.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(googlePayLauncherActivity, this.$googlePayLauncher, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(googlePayLauncherActivity, state, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstants2.fadeOut(this);
    }

    private final void onGooglePayResult(ApiTaskResult<PaymentData> taskResult) throws JSONException {
        int statusCode = taskResult.getStatus().getStatusCode();
        if (statusCode == 0) {
            PaymentData result = taskResult.getResult();
            if (result != null) {
                getViewModel().confirmStripeIntent(AuthActivityStarterHost.Companion.create$default(AuthActivityStarterHost.INSTANCE, this, null, 2, null), PaymentMethodCreateParams.INSTANCE.createFromGooglePay(new JSONObject(result.toJson())));
                return;
            } else {
                ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6, null);
                getViewModel().updateResult(new GooglePayLauncher3.Failed(new RuntimeException("Google Pay missing result data.")));
                return;
            }
        }
        if (statusCode == 16) {
            getViewModel().updateResult(GooglePayLauncher3.Canceled.INSTANCE);
            return;
        }
        Status status = taskResult.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        ErrorReporter.DefaultImpls.report$default(getErrorReporter(), ErrorReporter.ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt.mapOf(Tuples4.m3642to("status_message", statusMessage), Tuples4.m3642to("status_code", String.valueOf(status.getStatusCode()))), 2, null);
        GooglePayLauncherViewModel viewModel = getViewModel();
        int statusCode2 = status.getStatusCode();
        String statusMessage2 = status.getStatusMessage();
        viewModel.updateResult(new GooglePayLauncher3.Failed(new RuntimeException("Google Pay failed with error " + statusCode2 + ": " + (statusMessage2 != null ? statusMessage2 : ""))));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case AchTransfer.MAX_DEPOSIT_LIMIT /* 50000 */:
            case 50001:
                GooglePayLauncherViewModel viewModel = getViewModel();
                if (data == null) {
                    data = new Intent();
                }
                viewModel.onConfirmResult(requestCode, data);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(GooglePayLauncher3 result) {
        setResult(-1, new Intent().putExtras(Bundle2.bundleOf(Tuples4.m3642to("extra_result", result))));
        finish();
    }
}
