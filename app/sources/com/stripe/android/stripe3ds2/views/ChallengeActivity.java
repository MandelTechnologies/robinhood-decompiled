package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.Bundle2;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.OnBackPressedCallback;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.p418ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer2;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ChallengeActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 S2\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0003R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001a\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001a\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001a\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u001a\u001a\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cres", "", "startFragment", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "dismissKeyboard", "configureHeaderZone", "dismissDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onLowMemory", "", "level", "onTrimMemory", "(I)V", "onPause", "onResume", "onDestroy", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer$delegate", "Lkotlin/Lazy;", "getTransactionTimer", "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter$delegate", "getErrorReporter", "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment$delegate", "getFragment$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding$delegate", "getFragmentViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding$delegate", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler$delegate", "getChallengeActionHandler", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor$delegate", "getErrorRequestExecutor", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs$delegate", "getViewArgs", "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs", "Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController$delegate", "getKeyboardController", "()Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController", "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory$delegate", "getProgressDialogFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory", "Landroid/app/Dialog;", "progressDialog", "Landroid/app/Dialog;", "Companion", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ChallengeActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    private static final CoroutineDispatcher WORK_CONTEXT = Dispatchers.getIO();
    private Dialog progressDialog;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: transactionTimer$delegate, reason: from kotlin metadata */
    private final Lazy transactionTimer = LazyKt.lazy(new Function0<TransactionTimer2>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$transactionTimer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TransactionTimer2 invoke() {
            return new TransactionTimer2(this.this$0.getViewArgs().getTimeoutMins(), this.this$0.getErrorRequestExecutor(), this.this$0.getViewArgs().getCreqData());
        }
    });

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0<DefaultErrorReporter>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$errorReporter$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DefaultErrorReporter invoke() {
            Context applicationContext = this.this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(this.this$0.getViewArgs().getSdkTransactionId$3ds2sdk_release()), null, null, null, null, null, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
    });

    /* renamed from: fragment$delegate, reason: from kotlin metadata */
    private final Lazy fragment = LazyKt.lazy(new Function0<ChallengeFragment>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$fragment$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChallengeFragment invoke() {
            return (ChallengeFragment) this.this$0.getViewBinding$3ds2sdk_release().fragmentContainer.getFragment();
        }
    });

    /* renamed from: fragmentViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy fragmentViewBinding = LazyKt.lazy(new Function0<StripeChallengeFragmentBinding>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$fragmentViewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripeChallengeFragmentBinding invoke() {
            return this.this$0.getFragment$3ds2sdk_release().getViewBinding$3ds2sdk_release();
        }
    });

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<StripeChallengeActivityBinding>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripeChallengeActivityBinding invoke() {
            StripeChallengeActivityBinding stripeChallengeActivityBindingInflate = StripeChallengeActivityBinding.inflate(this.this$0.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripeChallengeActivityBindingInflate, "inflate(...)");
            return stripeChallengeActivityBindingInflate;
        }
    });

    /* renamed from: challengeActionHandler$delegate, reason: from kotlin metadata */
    private final Lazy challengeActionHandler = LazyKt.lazy(new Function0<ChallengeActionHandler.Default>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$challengeActionHandler$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChallengeActionHandler.Default invoke() {
            return new ChallengeActionHandler.Default(this.this$0.getViewArgs().getCreqData(), this.this$0.getErrorReporter(), this.this$0.getViewArgs().getCreqExecutorFactory(), ChallengeActivity.WORK_CONTEXT);
        }
    });

    /* renamed from: errorRequestExecutor$delegate, reason: from kotlin metadata */
    private final Lazy errorRequestExecutor = LazyKt.lazy(new Function0<ErrorRequestExecutor>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$errorRequestExecutor$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ErrorRequestExecutor invoke() {
            return new StripeErrorRequestExecutor.Factory(ChallengeActivity.WORK_CONTEXT).create(this.this$0.getViewArgs().getCreqExecutorConfig().getAcsUrl(), this.this$0.getErrorReporter());
        }
    });

    /* renamed from: viewArgs$delegate, reason: from kotlin metadata */
    private final Lazy viewArgs = LazyKt.lazy(new Function0<ChallengeViewArgs>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$viewArgs$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChallengeViewArgs invoke() {
            ChallengeViewArgs.Companion companion = ChallengeViewArgs.INSTANCE;
            Bundle extras = this.this$0.getIntent().getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Intrinsics.checkNotNull(extras);
            return companion.create(extras);
        }
    });

    /* renamed from: keyboardController$delegate, reason: from kotlin metadata */
    private final Lazy keyboardController = LazyKt.lazy(new Function0<KeyboardController>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$keyboardController$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeyboardController invoke() {
            return new KeyboardController(this.this$0);
        }
    });

    /* renamed from: progressDialogFactory$delegate, reason: from kotlin metadata */
    private final Lazy progressDialogFactory = LazyKt.lazy(new Function0<ChallengeSubmitDialogFactory>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$progressDialogFactory$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChallengeSubmitDialogFactory invoke() {
            ChallengeActivity challengeActivity = this.this$0;
            return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().getUiCustomization());
        }
    });

    public ChallengeActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return new ChallengeActivityViewModel.Factory(this.this$0.getChallengeActionHandler(), this.this$0.getTransactionTimer(), this.this$0.getErrorReporter(), ChallengeActivity.WORK_CONTEXT);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$3
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
    public final TransactionTimer getTransactionTimer() {
        return (TransactionTimer) this.transactionTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    public final ChallengeFragment getFragment$3ds2sdk_release() {
        return (ChallengeFragment) this.fragment.getValue();
    }

    public final StripeChallengeActivityBinding getViewBinding$3ds2sdk_release() {
        return (StripeChallengeActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeActionHandler getChallengeActionHandler() {
        return (ChallengeActionHandler) this.challengeActionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorRequestExecutor getErrorRequestExecutor() {
        return (ErrorRequestExecutor) this.errorRequestExecutor.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChallengeSubmitDialogFactory getProgressDialogFactory() {
        return (ChallengeSubmitDialogFactory) this.progressDialogFactory.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getSupportFragmentManager().setFragmentFactory(new ChallengeFragmentFactory(getViewArgs().getUiCustomization(), getTransactionTimer(), getErrorRequestExecutor(), getErrorReporter(), getChallengeActionHandler(), getViewArgs().getCresData().getUiType(), getViewArgs().getIntentData(), WORK_CONTEXT));
        super.onCreate(savedInstanceState);
        getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                ChallengeActivity.this.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
            }
        });
        getWindow().setFlags(8192, 8192);
        setContentView(getViewBinding$3ds2sdk_release().getRoot());
        getViewModel$3ds2sdk_release().getSubmitClicked().observe(this, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1<ChallengeAction, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChallengeAction challengeAction) {
                invoke2(challengeAction);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ChallengeAction challengeAction) {
                if (ChallengeActivity.this.isFinishing()) {
                    return;
                }
                ChallengeActivity.this.dismissKeyboard();
                ChallengeActivity challengeActivity = ChallengeActivity.this;
                Dialog dialogCreate = challengeActivity.getProgressDialogFactory().create();
                dialogCreate.show();
                challengeActivity.progressDialog = dialogCreate;
                ChallengeActivityViewModel viewModel$3ds2sdk_release = ChallengeActivity.this.getViewModel$3ds2sdk_release();
                Intrinsics.checkNotNull(challengeAction);
                viewModel$3ds2sdk_release.submit(challengeAction);
            }
        }));
        getViewModel$3ds2sdk_release().getShouldFinish().observe(this, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1<ChallengeResult, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChallengeResult challengeResult) {
                invoke2(challengeResult);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ChallengeResult challengeResult) {
                ChallengeActivity.this.setResult(-1, new Intent().putExtras(challengeResult.toBundle$3ds2sdk_release()));
                if (ChallengeActivity.this.isFinishing()) {
                    return;
                }
                ChallengeActivity.this.finish();
            }
        }));
        configureHeaderZone();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        getViewModel$3ds2sdk_release().getNextScreen().observe(this, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1<ChallengeResponseData, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChallengeResponseData challengeResponseData) {
                invoke2(challengeResponseData);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [T] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v7 */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ChallengeResponseData challengeResponseData) {
                ChallengeActivity.this.dismissDialog();
                if (challengeResponseData != null) {
                    ChallengeActivity.this.startFragment(challengeResponseData);
                    Ref.ObjectRef<String> objectRef2 = objectRef;
                    UiType uiType = challengeResponseData.getUiType();
                    ?? code = uiType != null ? uiType.getCode() : 0;
                    if (code == 0) {
                        code = "";
                    }
                    objectRef2.element = code;
                }
            }
        }));
        if (savedInstanceState == null) {
            getViewModel$3ds2sdk_release().onNextScreen(getViewArgs().getCresData());
        }
        getViewModel$3ds2sdk_release().getTimeout().observe(this, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    ChallengeActivity.this.getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout(objectRef.element, ChallengeActivity.this.getViewArgs().getCresData().getUiType(), ChallengeActivity.this.getViewArgs().getIntentData()));
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFragment(ChallengeResponseData cres) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        fragmentTransactionBeginTransaction.setCustomAnimations(animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT(), animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT());
        fragmentTransactionBeginTransaction.replace(getViewBinding$3ds2sdk_release().fragmentContainer.getId(), ChallengeFragment.class, Bundle2.bundleOf(Tuples4.m3642to("arg_cres", cres)));
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissKeyboard() {
        getKeyboardController().hide();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        getViewModel$3ds2sdk_release().setShouldRefreshUi(true);
        dismissKeyboard();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getViewModel$3ds2sdk_release().getShouldRefreshUi()) {
            getViewModel$3ds2sdk_release().onRefreshUi();
        }
    }

    private final void configureHeaderZone() {
        final ThreeDS2Button threeDS2ButtonCustomize = new HeaderZoneCustomizer(this).customize(getViewArgs().getUiCustomization().getToolbarCustomization(), getViewArgs().getUiCustomization().getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        if (threeDS2ButtonCustomize != null) {
            threeDS2ButtonCustomize.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.configureHeaderZone$lambda$1(threeDS2ButtonCustomize, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureHeaderZone$lambda$1(ThreeDS2Button threeDS2Button, ChallengeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        threeDS2Button.setClickable(false);
        this$0.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    /* compiled from: ChallengeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;", "", "()V", "WORK_CONTEXT", "Lkotlinx/coroutines/CoroutineDispatcher;", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
