package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel2;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragmentFactory;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
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
import kotlinx.coroutines.Job;

/* compiled from: Stripe3ds2TransactionActivity.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "", "finishWithResult", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "getViewBinding", "()Lcom/stripe/android/databinding/Stripe3ds2TransactionLayoutBinding;", "viewBinding", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "getArgs", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "setArgs", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$payments_core_release", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$payments_core_release", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getViewModelFactory$payments_core_release$annotations", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "viewModel", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes22.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {
    public Stripe3ds2TransactionContract.Args args;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<Stripe3ds2TransactionLayoutBinding>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Stripe3ds2TransactionLayoutBinding invoke() {
            Stripe3ds2TransactionLayoutBinding stripe3ds2TransactionLayoutBindingInflate = Stripe3ds2TransactionLayoutBinding.inflate(this.this$0.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripe3ds2TransactionLayoutBindingInflate, "inflate(...)");
            return stripe3ds2TransactionLayoutBindingInflate;
        }
    });
    private ViewModelProvider.Factory viewModelFactory = new Stripe3ds2TransactionViewModel6(new Function0<Stripe3ds2TransactionContract.Args>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$viewModelFactory$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Stripe3ds2TransactionContract.Args invoke() {
            return this.this$0.getArgs();
        }
    });

    private final Stripe3ds2TransactionLayoutBinding getViewBinding() {
        return (Stripe3ds2TransactionLayoutBinding) this.viewBinding.getValue();
    }

    public final Stripe3ds2TransactionContract.Args getArgs() {
        Stripe3ds2TransactionContract.Args args = this.args;
        if (args != null) {
            return args;
        }
        Intrinsics.throwUninitializedPropertyAccessException("args");
        return null;
    }

    public final void setArgs(Stripe3ds2TransactionContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "<set-?>");
        this.args = args;
    }

    /* renamed from: getViewModelFactory$payments_core_release, reason: from getter */
    public final ViewModelProvider.Factory getViewModelFactory() {
        return this.viewModelFactory;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object objM28550constructorimpl;
        Stripe3ds2TransactionContract.Args argsFromIntent;
        Object objM28550constructorimpl2;
        Integer num;
        final Function0 function0 = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Stripe3ds2TransactionContract.Args.Companion companion2 = Stripe3ds2TransactionContract.Args.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            argsFromIntent = companion2.fromIntent(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (argsFromIntent == null) {
            throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.");
        }
        String accentColor = argsFromIntent.getConfig().getUiCustomization().getUiCustomization().getAccentColor();
        if (accentColor != null) {
            try {
                Intrinsics.checkNotNull(accentColor);
                objM28550constructorimpl2 = Result.m28550constructorimpl(Integer.valueOf(Color.parseColor(accentColor)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl2)) {
                objM28550constructorimpl2 = null;
            }
            num = (Integer) objM28550constructorimpl2;
        } else {
            num = null;
        }
        getSupportFragmentManager().setFragmentFactory(new ChallengeProgressFragmentFactory(argsFromIntent.getFingerprint().getDirectoryServerName(), argsFromIntent.getSdkTransactionId(), num));
        objM28550constructorimpl = Result.m28550constructorimpl(argsFromIntent);
        super.onCreate(savedInstanceState);
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            setArgs((Stripe3ds2TransactionContract.Args) objM28550constructorimpl);
            setContentView(getViewBinding().getRoot());
            Integer statusBarColor = getArgs().getStatusBarColor();
            if (statusBarColor != null) {
                getWindow().setStatusBarColor(statusBarColor.intValue());
            }
            final ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(Stripe3ds2TransactionViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    return this.getStore();
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$viewModel$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    return this.this$0.getViewModelFactory();
                }
            }, new Function0<CreationExtras>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$3
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
            final Function1<ChallengeResult, Job> function1 = new Function1<ChallengeResult, Job>() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* compiled from: Stripe3ds2TransactionActivity.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1", m3645f = "Stripe3ds2TransactionActivity.kt", m3646l = {83}, m3647m = "invokeSuspend")
                /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1 */
                static final class C425901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ ChallengeResult $challengeResult;
                    final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
                    Object L$0;
                    int label;
                    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C425901(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, ChallengeResult challengeResult, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super C425901> continuation) {
                        super(2, continuation);
                        this.this$0 = stripe3ds2TransactionActivity;
                        this.$challengeResult = challengeResult;
                        this.$viewModel$delegate = lazy;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C425901(this.this$0, this.$challengeResult, this.$viewModel$delegate, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C425901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.this$0;
                            Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModelOnCreate$lambda$6 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
                            ChallengeResult challengeResult = this.$challengeResult;
                            this.L$0 = stripe3ds2TransactionActivity2;
                            this.label = 1;
                            Object objProcessChallengeResult = stripe3ds2TransactionViewModelOnCreate$lambda$6.processChallengeResult(challengeResult, this);
                            if (objProcessChallengeResult == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
                            obj = objProcessChallengeResult;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                        stripe3ds2TransactionActivity.finishWithResult((Unvalidated) obj);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Job invoke(ChallengeResult challengeResult) {
                    Intrinsics.checkNotNullParameter(challengeResult, "challengeResult");
                    return BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this.this$0), null, null, new C425901(this.this$0, challengeResult, viewModelLazy, null), 3, null);
                }
            };
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0
                @Override // androidx.view.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    Stripe3ds2TransactionActivity.onCreate$lambda$7(function1, (ChallengeResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
            ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultCallback() { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$$ExternalSyntheticLambda1
                @Override // androidx.view.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    Stripe3ds2TransactionActivity.onCreate$lambda$8(this.f$0, (Unvalidated) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
            if (onCreate$lambda$6(viewModelLazy).getHasCompleted()) {
                return;
            }
            LifecycleOwner2.getLifecycleScope(this).launchWhenResumed(new C425893(activityResultLauncherRegisterForActivityResult, function1, activityResultLauncherRegisterForActivityResult2, viewModelLazy, null));
            return;
        }
        finishWithResult(new Unvalidated(null, 2, StripeException.INSTANCE.create(thM28553exceptionOrNullimpl), false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Stripe3ds2TransactionViewModel onCreate$lambda$6(Lazy<Stripe3ds2TransactionViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(Function1 onChallengeResult, ChallengeResult challengeResult) {
        Intrinsics.checkNotNullParameter(onChallengeResult, "$onChallengeResult");
        Intrinsics.checkNotNull(challengeResult);
        onChallengeResult.invoke(challengeResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(Stripe3ds2TransactionActivity this$0, Unvalidated unvalidated) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(unvalidated);
        this$0.finishWithResult(unvalidated);
    }

    /* compiled from: Stripe3ds2TransactionActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3", m3645f = "Stripe3ds2TransactionActivity.kt", m3646l = {103, 107}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$3 */
    static final class C425893 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<PaymentBrowserAuthContract.Args> $browserLauncher;
        final /* synthetic */ ActivityResultLauncher<ChallengeViewArgs> $challengeLauncher;
        final /* synthetic */ Function1<ChallengeResult, Job> $onChallengeResult;
        final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C425893(ActivityResultLauncher<ChallengeViewArgs> activityResultLauncher, Function1<? super ChallengeResult, ? extends Job> function1, ActivityResultLauncher<PaymentBrowserAuthContract.Args> activityResultLauncher2, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super C425893> continuation) {
            super(2, continuation);
            this.$challengeLauncher = activityResultLauncher;
            this.$onChallengeResult = function1;
            this.$browserLauncher = activityResultLauncher2;
            this.$viewModel$delegate = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Stripe3ds2TransactionActivity.this.new C425893(this.$challengeLauncher, this.$onChallengeResult, this.$browserLauncher, this.$viewModel$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C425893) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r5 == r0) goto L19;
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
                if (!Stripe3ds2TransactionActivity.this.isFinishing()) {
                    Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModelOnCreate$lambda$6 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
                    this.label = 1;
                    obj = stripe3ds2TransactionViewModelOnCreate$lambda$6.start3ds2Flow(this);
                    if (obj != coroutine_suspended) {
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
                InitChallengeResult initChallengeResult = (InitChallengeResult) obj;
                if (initChallengeResult instanceof InitChallengeResult.Start) {
                    this.$challengeLauncher.launch(((InitChallengeResult.Start) initChallengeResult).getChallengeViewArgs());
                } else if (initChallengeResult instanceof InitChallengeResult.End) {
                    this.$onChallengeResult.invoke(((InitChallengeResult.End) initChallengeResult).getChallengeResult());
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Stripe3ds2TransactionViewModel2 stripe3ds2TransactionViewModel2 = (Stripe3ds2TransactionViewModel2) obj;
            if (stripe3ds2TransactionViewModel2 instanceof Stripe3ds2TransactionViewModel2.StartChallenge) {
                Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModelOnCreate$lambda$62 = Stripe3ds2TransactionActivity.onCreate$lambda$6(this.$viewModel$delegate);
                InitChallengeArgs args = ((Stripe3ds2TransactionViewModel2.StartChallenge) stripe3ds2TransactionViewModel2).getArgs();
                this.label = 2;
                obj = stripe3ds2TransactionViewModelOnCreate$lambda$62.initChallenge(args, this);
            } else {
                if (stripe3ds2TransactionViewModel2 instanceof Stripe3ds2TransactionViewModel2.StartFallback) {
                    this.$browserLauncher.launch(((Stripe3ds2TransactionViewModel2.StartFallback) stripe3ds2TransactionViewModel2).getArgs());
                } else if (stripe3ds2TransactionViewModel2 instanceof Stripe3ds2TransactionViewModel2.Complete) {
                    Stripe3ds2TransactionActivity.this.finishWithResult(((Stripe3ds2TransactionViewModel2.Complete) stripe3ds2TransactionViewModel2).getResult());
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(Unvalidated paymentFlowResult) {
        setResult(-1, new Intent().putExtras(paymentFlowResult.toBundle()));
        finish();
    }
}
