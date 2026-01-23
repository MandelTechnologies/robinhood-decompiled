package com.stripe.android.view;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcher4;
import androidx.viewpager.widget.ViewPager;
import com.plaid.internal.EnumC7081g;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.R$string;
import com.stripe.android.databinding.StripePaymentFlowActivityBinding;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.utils.ActivityUtils2;
import com.stripe.android.view.Args;
import com.stripe.android.view.PaymentFlowViewModel;
import java.util.List;
import java.util.Set;
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

/* compiled from: PaymentFlowActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\b\u00107\u001a\u000201H\u0016J\u0012\u00108\u001a\u0002012\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=H\u0002J'\u0010>\u001a\u0002012\b\u0010?\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0000¢\u0006\u0002\bCJ\b\u0010D\u001a\u000201H\u0002J\u0016\u0010E\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\b\u0010F\u001a\u000201H\u0002J\u0016\u0010G\u001a\u0002012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0002J\"\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010?\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b#\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b-\u0010.¨\u0006N"}, m3636d2 = {"Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "args", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "args$delegate", "Lkotlin/Lazy;", "customerSession", "Lcom/stripe/android/CustomerSession;", "getCustomerSession", "()Lcom/stripe/android/CustomerSession;", "customerSession$delegate", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "getKeyboardController", "()Lcom/stripe/android/view/KeyboardController;", "keyboardController$delegate", "paymentFlowPagerAdapter", "Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "getPaymentFlowPagerAdapter", "()Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "paymentFlowPagerAdapter$delegate", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionConfig", "()Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig$delegate", "shippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "viewBinding", "Lcom/stripe/android/databinding/StripePaymentFlowActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripePaymentFlowActivityBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/view/PaymentFlowViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentFlowViewModel;", "viewModel$delegate", "viewPager", "Lcom/stripe/android/view/PaymentFlowViewPager;", "getViewPager", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager$delegate", "finishWithData", "", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "hasNextPage", "", "hasPreviousPage", "onActionSave", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onShippingInfoError", "error", "", "onShippingInfoSaved", "shippingInformation", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "onShippingInfoSaved$payments_core_release", "onShippingInfoSubmitted", "onShippingInfoValidated", "onShippingMethodSave", "onShippingMethodsReady", "validateShippingInformation", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PaymentFlowActivity extends StripeActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0<StripePaymentFlowActivityBinding>() { // from class: com.stripe.android.view.PaymentFlowActivity$viewBinding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final StripePaymentFlowActivityBinding invoke() {
            this.this$0.getViewStub$payments_core_release().setLayoutResource(R$layout.stripe_payment_flow_activity);
            View viewInflate = this.this$0.getViewStub$payments_core_release().inflate();
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            StripePaymentFlowActivityBinding stripePaymentFlowActivityBindingBind = StripePaymentFlowActivityBinding.bind((ViewGroup) viewInflate);
            Intrinsics.checkNotNullExpressionValue(stripePaymentFlowActivityBindingBind, "bind(...)");
            return stripePaymentFlowActivityBindingBind;
        }
    });

    /* renamed from: viewPager$delegate, reason: from kotlin metadata */
    private final Lazy viewPager = LazyKt.lazy(new Function0<PaymentFlowViewPager>() { // from class: com.stripe.android.view.PaymentFlowActivity$viewPager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentFlowViewPager invoke() {
            PaymentFlowViewPager shippingFlowViewpager = this.this$0.getViewBinding().shippingFlowViewpager;
            Intrinsics.checkNotNullExpressionValue(shippingFlowViewpager, "shippingFlowViewpager");
            return shippingFlowViewpager;
        }
    });

    /* renamed from: customerSession$delegate, reason: from kotlin metadata */
    private final Lazy customerSession = LazyKt.lazy(new Function0<CustomerSession>() { // from class: com.stripe.android.view.PaymentFlowActivity$customerSession$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CustomerSession invoke() {
            return CustomerSession.INSTANCE.getInstance();
        }
    });

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0<Args>() { // from class: com.stripe.android.view.PaymentFlowActivity$args$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Args invoke() {
            Args.Companion companion = Args.INSTANCE;
            Intent intent = this.this$0.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            return companion.create(intent);
        }
    });

    /* renamed from: paymentSessionConfig$delegate, reason: from kotlin metadata */
    private final Lazy paymentSessionConfig = LazyKt.lazy(new Function0<PaymentSessionConfig>() { // from class: com.stripe.android.view.PaymentFlowActivity$paymentSessionConfig$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentSessionConfig invoke() {
            return this.this$0.getArgs().getPaymentSessionConfig();
        }
    });

    /* renamed from: paymentFlowPagerAdapter$delegate, reason: from kotlin metadata */
    private final Lazy paymentFlowPagerAdapter = LazyKt.lazy(new Function0<PaymentFlowPagerAdapter>() { // from class: com.stripe.android.view.PaymentFlowActivity$paymentFlowPagerAdapter$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentFlowPagerAdapter invoke() {
            PaymentFlowActivity paymentFlowActivity = this.this$0;
            PaymentSessionConfig paymentSessionConfig = paymentFlowActivity.getPaymentSessionConfig();
            Set<String> allowedShippingCountryCodes = this.this$0.getPaymentSessionConfig().getAllowedShippingCountryCodes();
            final PaymentFlowActivity paymentFlowActivity2 = this.this$0;
            return new PaymentFlowPagerAdapter(paymentFlowActivity, paymentSessionConfig, allowedShippingCountryCodes, new Function1<ShippingMethod, Unit>() { // from class: com.stripe.android.view.PaymentFlowActivity$paymentFlowPagerAdapter$2.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ShippingMethod shippingMethod) {
                    invoke2(shippingMethod);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ShippingMethod it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    paymentFlowActivity2.getViewModel().setSelectedShippingMethod$payments_core_release(it);
                }
            });
        }
    });

    /* renamed from: keyboardController$delegate, reason: from kotlin metadata */
    private final Lazy keyboardController = LazyKt.lazy(new Function0<KeyboardController>() { // from class: com.stripe.android.view.PaymentFlowActivity$keyboardController$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final KeyboardController invoke() {
            return new KeyboardController(this.this$0);
        }
    });

    public PaymentFlowActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentFlowViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.view.PaymentFlowActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.view.PaymentFlowActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return new PaymentFlowViewModel.Factory(this.this$0.getCustomerSession(), this.this$0.getArgs().getPaymentSessionData());
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.view.PaymentFlowActivity$special$$inlined$viewModels$default$3
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
    public final StripePaymentFlowActivityBinding getViewBinding() {
        return (StripePaymentFlowActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewPager getViewPager() {
        return (PaymentFlowViewPager) this.viewPager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerSession getCustomerSession() {
        return (CustomerSession) this.customerSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Args getArgs() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSessionConfig getPaymentSessionConfig() {
        return (PaymentSessionConfig) this.paymentSessionConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowViewModel getViewModel() {
        return (PaymentFlowViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentFlowPagerAdapter getPaymentFlowPagerAdapter() {
        return (PaymentFlowPagerAdapter) this.paymentFlowPagerAdapter.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController.getValue();
    }

    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Resources.NotFoundException {
        super.onCreate(savedInstanceState);
        if (ActivityUtils2.argsAreInvalid(this, new Function0<Unit>() { // from class: com.stripe.android.view.PaymentFlowActivity.onCreate.1
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
                PaymentFlowActivity.this.getArgs();
            }
        })) {
            return;
        }
        Args.Companion companion = Args.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Integer windowFlags = companion.create(intent).getWindowFlags();
        if (windowFlags != null) {
            getWindow().addFlags(windowFlags.intValue());
        }
        ShippingInformation submittedShippingInfo = getViewModel().getSubmittedShippingInfo();
        if (submittedShippingInfo == null) {
            submittedShippingInfo = getPaymentSessionConfig().getPrepopulatedShippingInfo();
        }
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(getViewModel().getShippingMethods$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(getViewModel().getIsShippingInfoSubmitted());
        getPaymentFlowPagerAdapter().setShippingInformation$payments_core_release(submittedShippingInfo);
        getPaymentFlowPagerAdapter().setSelectedShippingMethod$payments_core_release(getViewModel().getSelectedShippingMethod());
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        final OnBackPressedCallback onBackPressedCallbackAddCallback$default = OnBackPressedDispatcher4.addCallback$default(onBackPressedDispatcher, null, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.stripe.android.view.PaymentFlowActivity$onCreate$onBackPressedCallback$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) throws Resources.NotFoundException {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback addCallback) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                this.this$0.getViewModel().setCurrentPage$payments_core_release(r2.getCurrentPage() - 1);
                this.this$0.getViewPager().setCurrentItem(this.this$0.getViewModel().getCurrentPage());
            }
        }, 3, null);
        getViewPager().setAdapter(getPaymentFlowPagerAdapter());
        getViewPager().addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.stripe.android.view.PaymentFlowActivity.onCreate.3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
                paymentFlowActivity.setTitle(paymentFlowActivity.getPaymentFlowPagerAdapter().getPageTitle(i));
                if (PaymentFlowActivity.this.getPaymentFlowPagerAdapter().getPageAt$payments_core_release(i) == PaymentFlowPage.ShippingInfo) {
                    PaymentFlowActivity.this.getViewModel().setShippingInfoSubmitted$payments_core_release(false);
                    PaymentFlowActivity.this.getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(false);
                }
                onBackPressedCallbackAddCallback$default.setEnabled(PaymentFlowActivity.this.hasPreviousPage());
            }
        });
        getViewPager().setCurrentItem(getViewModel().getCurrentPage());
        onBackPressedCallbackAddCallback$default.setEnabled(hasPreviousPage());
        setTitle(getPaymentFlowPagerAdapter().getPageTitle(getViewPager().getCurrentItem()));
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        if (PaymentFlowPage.ShippingInfo == getPaymentFlowPagerAdapter().getPageAt$payments_core_release(getViewPager().getCurrentItem())) {
            onShippingInfoSubmitted();
        } else {
            onShippingMethodSave();
        }
    }

    public final /* synthetic */ void onShippingInfoSaved$payments_core_release(ShippingInformation shippingInformation, List shippingMethods) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(shippingMethods, "shippingMethods");
        onShippingMethodsReady(shippingMethods);
        getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData(), false, false, 0L, 0L, shippingInformation, null, null, false, 239, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShippingInfoValidated(List<ShippingMethod> shippingMethods) {
        ShippingInformation shippingInformation = getViewModel().getPaymentSessionData().getShippingInformation();
        if (shippingInformation != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new PaymentFlowActivity$onShippingInfoValidated$1$1(this, shippingInformation, shippingMethods, null), 3, null);
        }
    }

    private final void onShippingMethodsReady(List<ShippingMethod> shippingMethods) throws Resources.NotFoundException {
        setProgressBarVisible(false);
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(shippingMethods);
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(true);
        if (hasNextPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage() + 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage());
            return;
        }
        finishWithData(getViewModel().getPaymentSessionData());
    }

    private final void onShippingInfoSubmitted() {
        getKeyboardController().hide();
        ShippingInformation shippingInfo = getShippingInfo();
        if (shippingInfo != null) {
            getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData(), false, false, 0L, 0L, shippingInfo, null, null, false, 239, null));
            setProgressBarVisible(true);
            validateShippingInformation(getPaymentSessionConfig().getShippingInformationValidator(), getPaymentSessionConfig().getShippingMethodsFactory(), shippingInfo);
        }
    }

    private final ShippingInformation getShippingInfo() {
        return ((ShippingInfoWidget) getViewPager().findViewById(R$id.shipping_info_widget)).getShippingInformation();
    }

    private final boolean hasNextPage() {
        return getViewPager().getCurrentItem() + 1 < getPaymentFlowPagerAdapter().getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasPreviousPage() {
        return getViewPager().getCurrentItem() != 0;
    }

    private final void onShippingMethodSave() {
        finishWithData(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData(), false, false, 0L, 0L, null, ((SelectShippingMethodWidget) getViewPager().findViewById(R$id.select_shipping_method_widget)).getSelectedShippingMethod(), null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
    }

    /* compiled from: PaymentFlowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.view.PaymentFlowActivity$validateShippingInformation$1", m3645f = "PaymentFlowActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.view.PaymentFlowActivity$validateShippingInformation$1 */
    static final class C426831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
        final /* synthetic */ ShippingInformation $shippingInformation;
        final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C426831(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation, Continuation<? super C426831> continuation) {
            super(2, continuation);
            this.$shippingInfoValidator = shippingInformationValidator;
            this.$shippingMethodsFactory = shippingMethodsFactory;
            this.$shippingInformation = shippingInformation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentFlowActivity.this.new C426831(this.$shippingInfoValidator, this.$shippingMethodsFactory, this.$shippingInformation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C426831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM26971validateShippingInformationBWLJW6A$payments_core_release;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PaymentFlowViewModel viewModel = PaymentFlowActivity.this.getViewModel();
                PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator = this.$shippingInfoValidator;
                PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = this.$shippingMethodsFactory;
                ShippingInformation shippingInformation = this.$shippingInformation;
                this.label = 1;
                objM26971validateShippingInformationBWLJW6A$payments_core_release = viewModel.m26971validateShippingInformationBWLJW6A$payments_core_release(shippingInformationValidator, shippingMethodsFactory, shippingInformation, this);
                if (objM26971validateShippingInformationBWLJW6A$payments_core_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM26971validateShippingInformationBWLJW6A$payments_core_release = ((Result) obj).getValue();
            }
            PaymentFlowActivity paymentFlowActivity = PaymentFlowActivity.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26971validateShippingInformationBWLJW6A$payments_core_release);
            if (thM28553exceptionOrNullimpl == null) {
                paymentFlowActivity.onShippingInfoValidated((List) objM26971validateShippingInformationBWLJW6A$payments_core_release);
            } else {
                paymentFlowActivity.onShippingInfoError(thM28553exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    private final void validateShippingInformation(PaymentSessionConfig.ShippingInformationValidator shippingInfoValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C426831(shippingInfoValidator, shippingMethodsFactory, shippingInformation, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShippingInfoError(Throwable error) {
        String message = error.getMessage();
        setProgressBarVisible(false);
        if (message != null && message.length() != 0) {
            showError(message);
        } else {
            String string2 = getString(R$string.stripe_invalid_shipping_information);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            showError(string2);
        }
        getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData(), false, false, 0L, 0L, null, null, null, false, 239, null));
    }

    private final void finishWithData(PaymentSessionData paymentSessionData) {
        setResult(-1, new Intent().putExtra("extra_payment_session_data", paymentSessionData));
        finish();
    }
}
