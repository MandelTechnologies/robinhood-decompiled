package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcher4;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.uicore.utils.AnimationConstants2;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: PaymentLauncherConfirmationActivity.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010!\u001a\u00020\u001c8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0010\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "result", "", "finishWithResult", "(Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs$delegate", "Lkotlin/Lazy;", "getStarterArgs", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "starterArgs", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$payments_core_release$annotations", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "viewModel$delegate", "getViewModel$payments_core_release", "()Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "getViewModel$payments_core_release$annotations", "viewModel", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class PaymentLauncherConfirmationActivity extends AppCompatActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* renamed from: starterArgs$delegate, reason: from kotlin metadata */
    private final Lazy starterArgs = LazyKt.lazy(new Function0<PaymentLauncherContract.Args>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$starterArgs$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentLauncherContract.Args invoke() {
            PaymentLauncherContract.Args.Companion companion = PaymentLauncherContract.Args.INSTANCE;
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            return companion.fromIntent(intent);
        }
    });
    private ViewModelProvider.Factory viewModelFactory = new PaymentLauncherViewModel.Factory(new Function0<PaymentLauncherContract.Args>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$viewModelFactory$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentLauncherContract.Args invoke() {
            PaymentLauncherContract.Args starterArgs = this.this$0.getStarterArgs();
            if (starterArgs != null) {
                return starterArgs;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    });

    public PaymentLauncherConfirmationActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentLauncherViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.this$0.getViewModelFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$special$$inlined$viewModels$default$3
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
    public final PaymentLauncherContract.Args getStarterArgs() {
        return (PaymentLauncherContract.Args) this.starterArgs.getValue();
    }

    /* renamed from: getViewModelFactory$payments_core_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    public final PaymentLauncherViewModel getViewModel$payments_core_release() {
        return (PaymentLauncherViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM28550constructorimpl;
        PaymentLauncherContract.Args starterArgs;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            starterArgs = getStarterArgs();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (starterArgs != null) {
            objM28550constructorimpl = Result.m28550constructorimpl(starterArgs);
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                finishWithResult(new InternalPaymentResult.Failed(thM28553exceptionOrNullimpl));
                ErrorReporter.Companion companion3 = ErrorReporter.INSTANCE;
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion3, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.PAYMENT_LAUNCHER_CONFIRMATION_NULL_ARGS, StripeException.INSTANCE.create(thM28553exceptionOrNullimpl), null, 4, null);
                return;
            }
            PaymentLauncherContract.Args args = (PaymentLauncherContract.Args) objM28550constructorimpl;
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
            OnBackPressedDispatcher4.addCallback$default(onBackPressedDispatcher, null, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity.onCreate.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(OnBackPressedCallback addCallback) {
                    Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                    invoke2(onBackPressedCallback);
                    return Unit.INSTANCE;
                }
            }, 3, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426112(null), 3, null);
            getViewModel$payments_core_release().register$payments_core_release(this, this);
            AuthActivityStarterHost authActivityStarterHostCreate = AuthActivityStarterHost.INSTANCE.create(this, args.getStatusBarColor());
            if (args instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                getViewModel$payments_core_release().confirmStripeIntent$payments_core_release(((PaymentLauncherContract.Args.IntentConfirmationArgs) args).getConfirmStripeIntentParams(), authActivityStarterHostCreate);
                return;
            } else if (args instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs) {
                getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.PaymentIntentNextActionArgs) args).getPaymentIntentClientSecret(), authActivityStarterHostCreate);
                return;
            } else {
                if (args instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs) {
                    getViewModel$payments_core_release().handleNextActionForStripeIntent$payments_core_release(((PaymentLauncherContract.Args.SetupIntentNextActionArgs) args).getSetupIntentClientSecret(), authActivityStarterHostCreate);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("PaymentLauncherConfirmationActivity was started without arguments");
    }

    /* compiled from: PaymentLauncherConfirmationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$onCreate$2", m3645f = "PaymentLauncherConfirmationActivity.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity$onCreate$2 */
    static final class C426112 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426112(Continuation<? super C426112> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentLauncherConfirmationActivity.this.new C426112(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426112) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<InternalPaymentResult> internalPaymentResult$payments_core_release = PaymentLauncherConfirmationActivity.this.getViewModel$payments_core_release().getInternalPaymentResult$payments_core_release();
                final PaymentLauncherConfirmationActivity paymentLauncherConfirmationActivity = PaymentLauncherConfirmationActivity.this;
                FlowCollector<? super InternalPaymentResult> flowCollector = new FlowCollector() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InternalPaymentResult) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(InternalPaymentResult internalPaymentResult, Continuation<? super Unit> continuation) {
                        if (internalPaymentResult != null) {
                            paymentLauncherConfirmationActivity.finishWithResult(internalPaymentResult);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (internalPaymentResult$payments_core_release.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstants2.fadeOut(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(InternalPaymentResult result) {
        setResult(-1, new Intent().putExtras(result.toBundle$payments_core_release()));
        finish();
    }
}
