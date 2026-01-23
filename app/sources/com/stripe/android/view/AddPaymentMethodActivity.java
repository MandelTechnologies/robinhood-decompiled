package com.stripe.android.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.text.util.LinkifyCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.R$string;
import com.stripe.android.Stripe;
import com.stripe.android.databinding.StripeAddPaymentMethodActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.utils.ActivityUtils2;
import com.stripe.android.view.AddPaymentMethodActivityStarter2;
import com.stripe.android.view.AddPaymentMethodViewModel;
import com.stripe.android.view.Args;
import com.stripe.android.view.CardInputListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: AddPaymentMethodActivity.kt */
@Metadata(m3635d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u000f\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0002J\u001f\u00102\u001a\u00020*2\u0006\u0010$\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u000104H\u0000¢\u0006\u0002\b5J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u00107\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020*H\u0016J\u0012\u0010<\u001a\u00020*2\b\u0010=\u001a\u0004\u0018\u00010>H\u0014J\u0010\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020\u0017H\u0014J\b\u0010A\u001a\u00020*H\u0014J\b\u0010B\u001a\u00020*H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\b\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020!8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b&\u0010'¨\u0006D"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/StripeActivity;", "()V", "addPaymentMethodView", "Lcom/stripe/android/view/AddPaymentMethodView;", "getAddPaymentMethodView", "()Lcom/stripe/android/view/AddPaymentMethodView;", "addPaymentMethodView$delegate", "Lkotlin/Lazy;", "args", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getArgs", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args$delegate", "cardInputListener", "com/stripe/android/view/AddPaymentMethodActivity$cardInputListener$1", "Lcom/stripe/android/view/AddPaymentMethodActivity$cardInputListener$1;", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType$delegate", "shouldAttachToCustomer", "", "getShouldAttachToCustomer", "()Z", "shouldAttachToCustomer$delegate", "stripe", "Lcom/stripe/android/Stripe;", "getStripe", "()Lcom/stripe/android/Stripe;", "stripe$delegate", "titleStringRes", "", "getTitleStringRes", "()I", "viewModel", "Lcom/stripe/android/view/AddPaymentMethodViewModel;", "getViewModel", "()Lcom/stripe/android/view/AddPaymentMethodViewModel;", "viewModel$delegate", "attachPaymentMethodToCustomer", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "configureView", "createFooterView", "Landroid/view/View;", "contentRoot", "Landroid/view/ViewGroup;", "createPaymentMethod", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPaymentMethod$payments_core_release", "createPaymentMethodView", "finishWithPaymentMethod", "finishWithResult", "result", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "onActionSave", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onProgressBarVisibilityChanged", "visible", "onResume", "onUserInteraction", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AddPaymentMethodActivity extends StripeActivity {

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    /* renamed from: args$delegate, reason: from kotlin metadata */
    private final Lazy args = LazyKt.lazy(new Function0<Args>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$args$2
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

    /* renamed from: stripe$delegate, reason: from kotlin metadata */
    private final Lazy stripe = LazyKt.lazy(new Function0<Stripe>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$stripe$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Stripe invoke() {
            PaymentConfiguration paymentConfiguration = this.this$0.getArgs().getPaymentConfiguration();
            if (paymentConfiguration == null) {
                paymentConfiguration = PaymentConfiguration.INSTANCE.getInstance(this.this$0);
            }
            Context applicationContext = this.this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new Stripe(applicationContext, paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId(), false, null, 24, null);
        }
    });

    /* renamed from: paymentMethodType$delegate, reason: from kotlin metadata */
    private final Lazy paymentMethodType = LazyKt.lazy(new Function0<PaymentMethod.Type>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$paymentMethodType$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final PaymentMethod.Type invoke() {
            return this.this$0.getArgs().getPaymentMethodType();
        }
    });

    /* renamed from: shouldAttachToCustomer$delegate, reason: from kotlin metadata */
    private final Lazy shouldAttachToCustomer = LazyKt.lazy(new Function0<Boolean>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$shouldAttachToCustomer$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getPaymentMethodType().isReusable && this.this$0.getArgs().getShouldAttachToCustomer());
        }
    });

    /* renamed from: addPaymentMethodView$delegate, reason: from kotlin metadata */
    private final Lazy addPaymentMethodView = LazyKt.lazy(new Function0<AddPaymentMethodView>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$addPaymentMethodView$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AddPaymentMethodView invoke() {
            AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
            AddPaymentMethodView addPaymentMethodViewCreatePaymentMethodView = addPaymentMethodActivity.createPaymentMethodView(addPaymentMethodActivity.getArgs());
            addPaymentMethodViewCreatePaymentMethodView.setId(R$id.stripe_add_payment_method_form);
            return addPaymentMethodViewCreatePaymentMethodView;
        }
    });
    private final AddPaymentMethodActivity$cardInputListener$1 cardInputListener = new CardInputListener() { // from class: com.stripe.android.view.AddPaymentMethodActivity$cardInputListener$1
        @Override // com.stripe.android.view.CardInputListener
        public void onCvcComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onExpirationComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onFocusChange(CardInputListener.FocusField focusField) {
            Intrinsics.checkNotNullParameter(focusField, "focusField");
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onPostalCodeComplete() {
        }

        @Override // com.stripe.android.view.CardInputListener
        public void onCardComplete() {
            this.this$0.getViewModel().onCardNumberCompleted$payments_core_release();
        }
    };

    /* compiled from: AddPaymentMethodActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Netbanking.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.stripe.android.view.AddPaymentMethodActivity$cardInputListener$1] */
    public AddPaymentMethodActivity() {
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AddPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$viewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return new AddPaymentMethodViewModel.Factory(this.this$0.getStripe(), this.this$0.getArgs());
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.view.AddPaymentMethodActivity$special$$inlined$viewModels$default$3
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
    public final Args getArgs() {
        return (Args) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Stripe getStripe() {
        return (Stripe) this.stripe.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethod.Type getPaymentMethodType() {
        return (PaymentMethod.Type) this.paymentMethodType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldAttachToCustomer() {
        return ((Boolean) this.shouldAttachToCustomer.getValue()).booleanValue();
    }

    private final AddPaymentMethodView getAddPaymentMethodView() {
        return (AddPaymentMethodView) this.addPaymentMethodView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddPaymentMethodViewModel getViewModel() {
        return (AddPaymentMethodViewModel) this.viewModel.getValue();
    }

    private final int getTitleStringRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i == 1) {
            return R$string.stripe_title_add_a_card;
        }
        if (i == 2) {
            return R$string.stripe_title_bank_account;
        }
        if (i == 3) {
            return R$string.stripe_title_bank_account;
        }
        throw new IllegalArgumentException("Unsupported Payment Method type: " + getPaymentMethodType().code);
    }

    @Override // com.stripe.android.view.StripeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ActivityUtils2.argsAreInvalid(this, new Function0<Unit>() { // from class: com.stripe.android.view.AddPaymentMethodActivity.onCreate.1
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
                AddPaymentMethodActivity.this.getArgs();
            }
        })) {
            return;
        }
        getViewModel().onFormShown$payments_core_release();
        configureView(getArgs());
        setResult(-1, new Intent().putExtras(AddPaymentMethodActivityStarter2.Canceled.INSTANCE.toBundle()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getAddPaymentMethodView().requestFocus();
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        super.onUserInteraction();
        getViewModel().onFormInteracted$payments_core_release();
    }

    private final void configureView(Args args) {
        Integer windowFlags = args.getWindowFlags();
        if (windowFlags != null) {
            getWindow().addFlags(windowFlags.intValue());
        }
        getViewStub$payments_core_release().setLayoutResource(R$layout.stripe_add_payment_method_activity);
        View viewInflate = getViewStub$payments_core_release().inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        StripeAddPaymentMethodActivityBinding stripeAddPaymentMethodActivityBindingBind = StripeAddPaymentMethodActivityBinding.bind((ViewGroup) viewInflate);
        Intrinsics.checkNotNullExpressionValue(stripeAddPaymentMethodActivityBindingBind, "bind(...)");
        stripeAddPaymentMethodActivityBindingBind.root.addView(getAddPaymentMethodView());
        LinearLayout root = stripeAddPaymentMethodActivityBindingBind.root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        View viewCreateFooterView = createFooterView(root);
        if (viewCreateFooterView != null) {
            getAddPaymentMethodView().setAccessibilityTraversalBefore(viewCreateFooterView.getId());
            viewCreateFooterView.setAccessibilityTraversalAfter(getAddPaymentMethodView().getId());
            stripeAddPaymentMethodActivityBindingBind.root.addView(viewCreateFooterView);
        }
        setTitle(getTitleStringRes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddPaymentMethodView createPaymentMethodView(Args args) {
        int i = WhenMappings.$EnumSwitchMapping$0[getPaymentMethodType().ordinal()];
        if (i == 1) {
            AddPaymentMethodCardView addPaymentMethodCardView = new AddPaymentMethodCardView(this, null, 0, args.getBillingAddressFields(), 6, null);
            addPaymentMethodCardView.setCardInputListener(this.cardInputListener);
            return addPaymentMethodCardView;
        }
        if (i == 2) {
            return AddPaymentMethodFpxView.INSTANCE.create$payments_core_release(this);
        }
        if (i == 3) {
            return AddPaymentMethodNetbankingView.INSTANCE.create$payments_core_release(this);
        }
        throw new IllegalArgumentException("Unsupported Payment Method type: " + getPaymentMethodType().code);
    }

    private final View createFooterView(ViewGroup contentRoot) {
        if (getArgs().getAddPaymentMethodFooterLayoutId() <= 0) {
            return null;
        }
        View viewInflate = getLayoutInflater().inflate(getArgs().getAddPaymentMethodFooterLayoutId(), contentRoot, false);
        viewInflate.setId(R$id.stripe_add_payment_method_footer);
        if (viewInflate instanceof TextView) {
            TextView textView = (TextView) viewInflate;
            LinkifyCompat.addLinks(textView, 15);
            ViewCompat.enableAccessibleClickableSpanSupport(viewInflate);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return viewInflate;
    }

    @Override // com.stripe.android.view.StripeActivity
    public void onActionSave() {
        getViewModel().onSaveClicked$payments_core_release();
        createPaymentMethod$payments_core_release(getViewModel(), getAddPaymentMethodView().getCreateParams());
    }

    public final void createPaymentMethod$payments_core_release(AddPaymentMethodViewModel viewModel, PaymentMethodCreateParams params) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (params == null) {
            return;
        }
        setProgressBarVisible(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new AddPaymentMethodActivity$createPaymentMethod$1(viewModel, params, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachPaymentMethodToCustomer(PaymentMethod paymentMethod) {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(CustomerSession.INSTANCE.getInstance());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1(this, (CustomerSession) objM28550constructorimpl, paymentMethod, null), 3, null);
        } else {
            finishWithResult(new AddPaymentMethodActivityStarter2.Failure(thM28553exceptionOrNullimpl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithPaymentMethod(PaymentMethod paymentMethod) {
        finishWithResult(new AddPaymentMethodActivityStarter2.Success(paymentMethod));
    }

    private final void finishWithResult(AddPaymentMethodActivityStarter2 result) {
        setProgressBarVisible(false);
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    @Override // com.stripe.android.view.StripeActivity
    protected void onProgressBarVisibilityChanged(boolean visible) {
        getAddPaymentMethodView().setCommunicatingProgress(visible);
    }
}
