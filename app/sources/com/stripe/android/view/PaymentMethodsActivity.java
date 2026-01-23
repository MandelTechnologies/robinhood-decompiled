package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcher4;
import androidx.view.result.ActivityResultLauncher;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.snackbar.Snackbar;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.CustomerSession;
import com.stripe.android.R$id;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.StripePaymentMethodsActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.utils.ActivityUtils2;
import com.stripe.android.view.AddPaymentMethodActivityStarter2;
import com.stripe.android.view.AlertDisplayer;
import com.stripe.android.view.Args;
import com.stripe.android.view.PaymentMethodsAdapter;
import com.stripe.android.view.PaymentMethodsViewModel;
import com.stripe.android.view.i18n.TranslatorManager;
import java.util.List;
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

/* compiled from: PaymentMethodsActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0002J\u001c\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u0001062\b\b\u0002\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000203H\u0002J\u0015\u0010:\u001a\u0002032\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=J\u0010\u0010>\u001a\u0002032\u0006\u00105\u001a\u000206H\u0002J\u0012\u0010?\u001a\u0002032\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\b\u0010B\u001a\u000203H\u0014J\b\u0010C\u001a\u00020\u001fH\u0016J\u0016\u0010D\u001a\u0002032\f\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b&\u0010'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m3636d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "getAdapter", "()Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "args", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "args$delegate", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "getCardDisplayTextFactory", "()Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory$delegate", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "getCustomerSession-d1pmJ48", "()Ljava/lang/Object;", "customerSession$delegate", "earlyExitDueToIllegalState", "", "startedFromPaymentSession", "getStartedFromPaymentSession", "()Z", "startedFromPaymentSession$delegate", "viewBinding", "Lcom/stripe/android/databinding/StripePaymentMethodsActivityBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/StripePaymentMethodsActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentMethodsViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentMethodsViewModel;", "viewModel$delegate", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "finishWithGooglePay", "", "finishWithResult", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "resultCode", "", "observePaymentMethodData", "onAddPaymentMethodResult", "result", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onAddPaymentMethodResult$payments_core_release", "onAddedPaymentMethod", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSupportNavigateUp", "setupRecyclerView", "addPaymentMethodLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentMethodsActivity extends AppCompatActivity {
    private boolean earlyExitDueToIllegalState;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<StripePaymentMethodsActivityBinding>() { // from class: com.stripe.android.view.PaymentMethodsActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripePaymentMethodsActivityBinding invoke() {
            StripePaymentMethodsActivityBinding stripePaymentMethodsActivityBindingInflate = StripePaymentMethodsActivityBinding.inflate(this.this$0.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripePaymentMethodsActivityBindingInflate, "inflate(...)");
            return stripePaymentMethodsActivityBindingInflate;
        }
    });

    /* renamed from: startedFromPaymentSession$delegate, reason: from kotlin metadata */
    private final Lazy startedFromPaymentSession = LazyKt.lazy(new Function0<Boolean>() { // from class: com.stripe.android.view.PaymentMethodsActivity$startedFromPaymentSession$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getArgs().getIsPaymentSessionActive());
        }
    });

    /* renamed from: customerSession$delegate, reason: from kotlin metadata */
    private final Lazy customerSession = LazyKt.lazy(new Function0<Result<? extends CustomerSession>>() { // from class: com.stripe.android.view.PaymentMethodsActivity$customerSession$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Result<? extends CustomerSession> invoke() {
            return Result.m28549boximpl(m26974invoked1pmJ48());
        }

        /* renamed from: invoke-d1pmJ48, reason: not valid java name */
        public final Object m26974invoked1pmJ48() {
            try {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(CustomerSession.INSTANCE.getInstance());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
        }
    });

    /* renamed from: cardDisplayTextFactory$delegate, reason: from kotlin metadata */
    private final Lazy cardDisplayTextFactory = LazyKt.lazy(new Function0<CardDisplayTextFactory>() { // from class: com.stripe.android.view.PaymentMethodsActivity$cardDisplayTextFactory$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CardDisplayTextFactory invoke() {
            return new CardDisplayTextFactory(this.this$0);
        }
    });

    /* renamed from: alertDisplayer$delegate, reason: from kotlin metadata */
    private final Lazy alertDisplayer = LazyKt.lazy(new Function0<AlertDisplayer.DefaultAlertDisplayer>() { // from class: com.stripe.android.view.PaymentMethodsActivity$alertDisplayer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AlertDisplayer.DefaultAlertDisplayer invoke() {
            return new AlertDisplayer.DefaultAlertDisplayer(this.this$0);
        }
    });

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0<Args>() { // from class: com.stripe.android.view.PaymentMethodsActivity$args$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Args invoke() {
            Args.Companion companion = Args.INSTANCE;
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            return companion.create$payments_core_release(intent);
        }
    });

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0<PaymentMethodsAdapter>() { // from class: com.stripe.android.view.PaymentMethodsActivity$adapter$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentMethodsAdapter invoke() {
            return new PaymentMethodsAdapter(this.this$0.getArgs(), this.this$0.getArgs().getPaymentMethodTypes$payments_core_release(), this.this$0.getViewModel().getSelectedPaymentMethodId(), this.this$0.getArgs().getShouldShowGooglePay(), this.this$0.getArgs().getUseGooglePay(), this.this$0.getArgs().getCanDeletePaymentMethods());
        }
    });

    public PaymentMethodsActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentMethodsViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.view.PaymentMethodsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.view.PaymentMethodsActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = this.this$0.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                return new PaymentMethodsViewModel.Factory(application, this.this$0.m26973getCustomerSessiond1pmJ48(), this.this$0.getArgs().getInitialPaymentMethodId(), this.this$0.getStartedFromPaymentSession());
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.view.PaymentMethodsActivity$special$$inlined$viewModels$default$3
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

    public final StripePaymentMethodsActivityBinding getViewBinding$payments_core_release() {
        return (StripePaymentMethodsActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getStartedFromPaymentSession() {
        return ((Boolean) this.startedFromPaymentSession.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCustomerSession-d1pmJ48, reason: not valid java name */
    public final Object m26973getCustomerSessiond1pmJ48() {
        return ((Result) this.customerSession.getValue()).getValue();
    }

    private final CardDisplayTextFactory getCardDisplayTextFactory() {
        return (CardDisplayTextFactory) this.cardDisplayTextFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Args getArgs() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodsViewModel getViewModel() {
        return (PaymentMethodsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodsAdapter getAdapter() {
        return (PaymentMethodsAdapter) this.adapter.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Result.m28555isFailureimpl(m26973getCustomerSessiond1pmJ48())) {
            finishWithResult(null, 0);
            return;
        }
        if (ActivityUtils2.argsAreInvalid(this, new Function0<Unit>() { // from class: com.stripe.android.view.PaymentMethodsActivity.onCreate.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PaymentMethodsActivity.this.getArgs();
            }
        })) {
            this.earlyExitDueToIllegalState = true;
            return;
        }
        setContentView(getViewBinding$payments_core_release().getRoot());
        Integer windowFlags = getArgs().getWindowFlags();
        if (windowFlags != null) {
            getWindow().addFlags(windowFlags.intValue());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcher4.addCallback$default(onBackPressedDispatcher, null, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.stripe.android.view.PaymentMethodsActivity.onCreate.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                paymentMethodsActivity.finishWithResult(paymentMethodsActivity.getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
            }
        }, 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426874(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426885(null), 3, null);
        ActivityResultLauncher<Args> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        observePaymentMethodData();
        setupRecyclerView(activityResultLauncherRegisterForActivityResult);
        setSupportActionBar(getViewBinding$payments_core_release().toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
        FrameLayout footerContainer = getViewBinding$payments_core_release().footerContainer;
        Intrinsics.checkNotNullExpressionValue(footerContainer, "footerContainer");
        View viewCreateFooterView = createFooterView(footerContainer);
        if (viewCreateFooterView != null) {
            getViewBinding$payments_core_release().recycler.setAccessibilityTraversalBefore(viewCreateFooterView.getId());
            viewCreateFooterView.setAccessibilityTraversalAfter(getViewBinding$payments_core_release().recycler.getId());
            getViewBinding$payments_core_release().footerContainer.addView(viewCreateFooterView);
            FrameLayout footerContainer2 = getViewBinding$payments_core_release().footerContainer;
            Intrinsics.checkNotNullExpressionValue(footerContainer2, "footerContainer");
            footerContainer2.setVisibility(0);
        }
        getViewBinding$payments_core_release().recycler.requestFocusFromTouch();
    }

    /* compiled from: PaymentMethodsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentMethodsActivity$onCreate$4", m3645f = "PaymentMethodsActivity.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentMethodsActivity$onCreate$4 */
    static final class C426874 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426874(Continuation<? super C426874> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodsActivity.this.new C426874(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426874) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<String> snackbarData$payments_core_release = PaymentMethodsActivity.this.getViewModel().getSnackbarData$payments_core_release();
                final PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                FlowCollector<? super String> flowCollector = new FlowCollector() { // from class: com.stripe.android.view.PaymentMethodsActivity.onCreate.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        if (str != null) {
                            Snackbar.make(paymentMethodsActivity.getViewBinding$payments_core_release().coordinator, str, -1).show();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (snackbarData$payments_core_release.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: PaymentMethodsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentMethodsActivity$onCreate$5", m3645f = "PaymentMethodsActivity.kt", m3646l = {120}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentMethodsActivity$onCreate$5 */
    static final class C426885 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426885(Continuation<? super C426885> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodsActivity.this.new C426885(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426885) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<Boolean> progressData$payments_core_release = PaymentMethodsActivity.this.getViewModel().getProgressData$payments_core_release();
                final PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.stripe.android.view.PaymentMethodsActivity.onCreate.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        LinearProgressIndicator progressBar = paymentMethodsActivity.getViewBinding$payments_core_release().progressBar;
                        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                        progressBar.setVisibility(z ? 0 : 8);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (progressData$payments_core_release.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void setupRecyclerView(final ActivityResultLauncher<Args> addPaymentMethodLauncher) {
        final DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory = new DeletePaymentMethodDialogFactory(this, getAdapter(), getCardDisplayTextFactory(), m26973getCustomerSessiond1pmJ48(), getViewModel().getProductUsage$payments_core_release(), new Function1<PaymentMethod, Unit>() { // from class: com.stripe.android.view.PaymentMethodsActivity$setupRecyclerView$deletePaymentMethodDialogFactory$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
                invoke2(paymentMethod);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PaymentMethod it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getViewModel().onPaymentMethodRemoved$payments_core_release(it);
            }
        });
        getAdapter().setListener$payments_core_release(new PaymentMethodsAdapter.Listener() { // from class: com.stripe.android.view.PaymentMethodsActivity.setupRecyclerView.1
            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onPaymentMethodClick(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                PaymentMethodsActivity.this.getViewBinding$payments_core_release().recycler.setTappedPaymentMethod$payments_core_release(paymentMethod);
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onAddPaymentMethodClick(Args args) {
                Intrinsics.checkNotNullParameter(args, "args");
                addPaymentMethodLauncher.launch(args);
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onGooglePayClick() {
                PaymentMethodsActivity.this.finishWithGooglePay();
            }

            @Override // com.stripe.android.view.PaymentMethodsAdapter.Listener
            public void onDeletePaymentMethodAction(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                deletePaymentMethodDialogFactory.create(paymentMethod).show();
            }
        });
        getViewBinding$payments_core_release().recycler.setAdapter(getAdapter());
        getViewBinding$payments_core_release().recycler.setPaymentMethodSelectedCallback$payments_core_release(new Function1<PaymentMethod, Unit>() { // from class: com.stripe.android.view.PaymentMethodsActivity.setupRecyclerView.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaymentMethod paymentMethod) {
                invoke2(paymentMethod);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PaymentMethod it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PaymentMethodsActivity.finishWithResult$default(PaymentMethodsActivity.this, it, 0, 2, null);
            }
        });
        if (getArgs().getCanDeletePaymentMethods()) {
            getViewBinding$payments_core_release().recycler.attachItemTouchHelper$payments_core_release(new PaymentMethodSwipeCallback(this, getAdapter(), new SwipeToDeleteCallbackListener(deletePaymentMethodDialogFactory)));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
        return true;
    }

    public final void onAddPaymentMethodResult$payments_core_release(AddPaymentMethodActivityStarter2 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof AddPaymentMethodActivityStarter2.Success) {
            onAddedPaymentMethod(((AddPaymentMethodActivityStarter2.Success) result).getPaymentMethod());
        }
    }

    private final void onAddedPaymentMethod(PaymentMethod paymentMethod) {
        PaymentMethod.Type type2 = paymentMethod.type;
        if (type2 != null && type2.isReusable) {
            getViewModel().onPaymentMethodAdded$payments_core_release(paymentMethod);
        } else {
            finishWithResult$default(this, paymentMethod, 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithGooglePay() {
        setResult(-1, new Intent().putExtras(new Result(null, true, 1, null).toBundle()));
        finish();
    }

    static /* synthetic */ void finishWithResult$default(PaymentMethodsActivity paymentMethodsActivity, PaymentMethod paymentMethod, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        paymentMethodsActivity.finishWithResult(paymentMethod, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(PaymentMethod paymentMethod, int resultCode) {
        Intent intent = new Intent();
        intent.putExtras(new Result(paymentMethod, getArgs().getUseGooglePay() && paymentMethod == null).toBundle());
        Unit unit = Unit.INSTANCE;
        setResult(resultCode, intent);
        finish();
    }

    private final View createFooterView(ViewGroup contentRoot) {
        if (getArgs().getPaymentMethodsFooterLayoutId() <= 0) {
            return null;
        }
        View viewInflate = getLayoutInflater().inflate(getArgs().getPaymentMethodsFooterLayoutId(), contentRoot, false);
        viewInflate.setId(R$id.stripe_payment_methods_footer);
        if (viewInflate instanceof TextView) {
            TextView textView = (TextView) viewInflate;
            LinkifyCompat.addLinks(textView, 15);
            ViewCompat.enableAccessibleClickableSpanSupport(viewInflate);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return viewInflate;
    }

    /* compiled from: PaymentMethodsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentMethodsActivity$observePaymentMethodData$1", m3645f = "PaymentMethodsActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentMethodsActivity$observePaymentMethodData$1 */
    static final class C426841 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C426841(Continuation<? super C426841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentMethodsActivity.this.new C426841(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<Result<List<PaymentMethod>>> paymentMethodsData$payments_core_release = PaymentMethodsActivity.this.getViewModel().getPaymentMethodsData$payments_core_release();
                final PaymentMethodsActivity paymentMethodsActivity = PaymentMethodsActivity.this;
                FlowCollector<? super Result<List<PaymentMethod>>> flowCollector = new FlowCollector() { // from class: com.stripe.android.view.PaymentMethodsActivity.observePaymentMethodData.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Result<? extends List<PaymentMethod>>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Result<? extends List<PaymentMethod>> result, Continuation<? super Unit> continuation) {
                        String message;
                        if (result != null) {
                            Object value = result.getValue();
                            PaymentMethodsActivity paymentMethodsActivity2 = paymentMethodsActivity;
                            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                            if (thM28553exceptionOrNullimpl == null) {
                                paymentMethodsActivity2.getAdapter().setPaymentMethods$payments_core_release((List) value);
                            } else {
                                AlertDisplayer alertDisplayer = paymentMethodsActivity2.getAlertDisplayer();
                                if (thM28553exceptionOrNullimpl instanceof StripeException) {
                                    StripeException stripeException = (StripeException) thM28553exceptionOrNullimpl;
                                    message = TranslatorManager.INSTANCE.getErrorMessageTranslator().translate(stripeException.getStatusCode(), thM28553exceptionOrNullimpl.getMessage(), stripeException.getStripeError());
                                } else {
                                    message = thM28553exceptionOrNullimpl.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                }
                                alertDisplayer.show(message);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (paymentMethodsData$payments_core_release.collect(flowCollector, this) == coroutine_suspended) {
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

    private final void observePaymentMethodData() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426841(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        if (!this.earlyExitDueToIllegalState) {
            PaymentMethodsViewModel viewModel = getViewModel();
            PaymentMethod selectedPaymentMethod$payments_core_release = getAdapter().getSelectedPaymentMethod$payments_core_release();
            viewModel.setSelectedPaymentMethodId$payments_core_release(selectedPaymentMethod$payments_core_release != null ? selectedPaymentMethod$payments_core_release.id : null);
        }
        super.onDestroy();
    }
}
