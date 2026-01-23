package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcher4;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.stripe.android.R$id;
import com.stripe.android.R$menu;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.StripePaymentAuthWebViewActivityBinding;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: PaymentAuthWebViewActivity.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0017\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0014J\u0010\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020-H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006."}, m3636d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "get_args", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args$delegate", "Lkotlin/Lazy;", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "logger$delegate", "viewBinding", "Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel$delegate", "cancelIntentSource", "", "createResultIntent", "Landroid/content/Intent;", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "customizeToolbar", "onAuthComplete", "error", "", "onAuthComplete$payments_core_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<StripePaymentAuthWebViewActivityBinding>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripePaymentAuthWebViewActivityBinding invoke() {
            StripePaymentAuthWebViewActivityBinding stripePaymentAuthWebViewActivityBindingInflate = StripePaymentAuthWebViewActivityBinding.inflate(this.this$0.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(stripePaymentAuthWebViewActivityBindingInflate, "inflate(...)");
            return stripePaymentAuthWebViewActivityBindingInflate;
        }
    });

    /* renamed from: _args$delegate, reason: from kotlin metadata */
    private final Lazy _args = LazyKt.lazy(new Function0<PaymentBrowserAuthContract.Args>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$_args$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentBrowserAuthContract.Args invoke() {
            PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.INSTANCE;
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            return companion.parseArgs$payments_core_release(intent);
        }
    });

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final Lazy logger = LazyKt.lazy(new Function0<Logger>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$logger$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Logger invoke() {
            Logger.Companion companion = Logger.INSTANCE;
            PaymentBrowserAuthContract.Args args = this.this$0.get_args();
            boolean z = false;
            if (args != null && args.getEnableLogging()) {
                z = true;
            }
            return companion.getInstance(z);
        }
    });

    public PaymentAuthWebViewActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentAuthWebViewActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = this.this$0.getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
                Logger logger = this.this$0.getLogger();
                PaymentBrowserAuthContract.Args args = this.this$0.get_args();
                if (args != null) {
                    return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3
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
    public final StripePaymentAuthWebViewActivityBinding getViewBinding() {
        return (StripePaymentAuthWebViewActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentBrowserAuthContract.Args get_args() {
        return (PaymentBrowserAuthContract.Args) this._args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    private final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentBrowserAuthContract.Args args = get_args();
        if (args == null) {
            setResult(0);
            finish();
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.AUTH_WEB_VIEW_NULL_ARGS, null, null, 6, null);
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        customizeToolbar();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcher4.addCallback$default(onBackPressedDispatcher, null, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity.onCreate.1
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
                if (PaymentAuthWebViewActivity.this.getViewBinding().webView.canGoBack()) {
                    PaymentAuthWebViewActivity.this.getViewBinding().webView.goBack();
                } else {
                    PaymentAuthWebViewActivity.this.cancelIntentSource();
                }
            }
        }, 3, null);
        String clientSecret = args.getClientSecret();
        setResult(-1, createResultIntent(getViewModel().getPaymentResult$payments_core_release()));
        if (StringsKt.isBlank(clientSecret)) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            ErrorReporter.Companion companion2 = ErrorReporter.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion2, applicationContext2, null, 2, null), ErrorReporter.UnexpectedErrorEvent.AUTH_WEB_VIEW_BLANK_CLIENT_SECRET, null, null, 6, null);
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        StateFlow2 stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426782(stateFlow2MutableStateFlow, this, null), 3, null);
        final PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), stateFlow2MutableStateFlow, clientSecret, args.getReturnUrl(), new PaymentAuthWebViewActivity4(this), new PaymentAuthWebViewActivity5(this));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity.onCreate.3
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
                paymentAuthWebViewClient.setHasLoadedBlank$payments_core_release(true);
            }
        });
        getViewBinding().webView.setWebViewClient(paymentAuthWebViewClient);
        getViewBinding().webView.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        getViewModel().logStart();
        getViewBinding().webView.loadUrl(args.getUrl(), getViewModel().getExtraHeaders());
    }

    /* compiled from: PaymentAuthWebViewActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$2", m3645f = "PaymentAuthWebViewActivity.kt", m3646l = {95}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$2 */
    static final class C426782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StateFlow2<Boolean> $isPagedLoaded;
        int label;
        final /* synthetic */ PaymentAuthWebViewActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426782(StateFlow2<Boolean> stateFlow2, PaymentAuthWebViewActivity paymentAuthWebViewActivity, Continuation<? super C426782> continuation) {
            super(2, continuation);
            this.$isPagedLoaded = stateFlow2;
            this.this$0 = paymentAuthWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C426782(this.$isPagedLoaded, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<Boolean> stateFlow2 = this.$isPagedLoaded;
                final PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.this$0;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            CircularProgressIndicator progressBar = paymentAuthWebViewActivity.getViewBinding().progressBar;
                            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                            progressBar.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow2.collect(flowCollector, this) == coroutine_suspended) {
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

    public final void onAuthComplete$payments_core_release(Throwable error) {
        if (error != null) {
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter errorReporterCreateFallbackInstance$default = ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null);
            ErrorReporter.ExpectedErrorEvent expectedErrorEvent = ErrorReporter.ExpectedErrorEvent.AUTH_WEB_VIEW_FAILURE;
            StripeException.Companion companion2 = StripeException.INSTANCE;
            ErrorReporter.DefaultImpls.report$default(errorReporterCreateFallbackInstance$default, expectedErrorEvent, companion2.create(error), null, 4, null);
            getViewModel().logError();
            setResult(-1, createResultIntent(Unvalidated.copy$default(getViewModel().getPaymentResult$payments_core_release(), null, 2, companion2.create(error), true, null, null, null, 113, null)));
        } else {
            getViewModel().logComplete();
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R$menu.stripe_payment_auth_web_view_menu, menu);
        String buttonText$payments_core_release = getViewModel().getButtonText();
        if (buttonText$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(R$id.action_close).setTitle(buttonText$payments_core_release);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == R$id.action_close) {
            cancelIntentSource();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelIntentSource() {
        setResult(-1, getViewModel().getCancellationResult$payments_core_release());
        finish();
    }

    private final void customizeToolbar() {
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitle$payments_core_release = getViewModel().getToolbarTitle();
        if (toolbarTitle$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            getViewBinding().toolbar.setTitle(CustomizeUtils.INSTANCE.buildStyledText(this, toolbarTitle$payments_core_release.getText(), toolbarTitle$payments_core_release.getToolbarCustomization()));
        }
        String toolbarBackgroundColor$payments_core_release = getViewModel().getToolbarBackgroundColor();
        if (toolbarBackgroundColor$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int color = Color.parseColor(toolbarBackgroundColor$payments_core_release);
            getViewBinding().toolbar.setBackgroundColor(color);
            CustomizeUtils.INSTANCE.setStatusBarColor(this, color);
        }
    }

    private final Intent createResultIntent(Unvalidated paymentFlowResult) {
        Intent intentPutExtras = new Intent().putExtras(paymentFlowResult.toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }
}
