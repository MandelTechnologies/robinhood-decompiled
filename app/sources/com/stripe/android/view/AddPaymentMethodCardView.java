package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.stripe.android.databinding.StripeAddPaymentMethodCardViewBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPaymentMethodCardView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001!B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/stripe/android/view/BillingAddressFields;)V", "billingAddressWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "initEnterListeners", "", "activity", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "setCardInputListener", "listener", "Lcom/stripe/android/view/CardInputListener;", "setCommunicatingProgress", "communicating", "", "OnEditorActionListenerImpl", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AddPaymentMethodCardView extends AddPaymentMethodView {
    private final BillingAddressFields billingAddressFields;
    private final ShippingInfoWidget billingAddressWidget;
    private final CardMultilineWidget cardMultilineWidget;

    /* compiled from: AddPaymentMethodCardView.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAddressFields.values().length];
            try {
                iArr[BillingAddressFields.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingAddressFields.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillingAddressFields.PostalCode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i, BillingAddressFields billingAddressFields, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? BillingAddressFields.PostalCode : billingAddressFields);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i, BillingAddressFields billingAddressFields) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(billingAddressFields, "billingAddressFields");
        this.billingAddressFields = billingAddressFields;
        StripeAddPaymentMethodCardViewBinding stripeAddPaymentMethodCardViewBindingInflate = StripeAddPaymentMethodCardViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeAddPaymentMethodCardViewBindingInflate, "inflate(...)");
        CardMultilineWidget cardMultilineWidget = stripeAddPaymentMethodCardViewBindingInflate.cardMultilineWidget;
        Intrinsics.checkNotNullExpressionValue(cardMultilineWidget, "cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == BillingAddressFields.PostalCode);
        ShippingInfoWidget billingAddressWidget = stripeAddPaymentMethodCardViewBindingInflate.billingAddressWidget;
        Intrinsics.checkNotNullExpressionValue(billingAddressWidget, "billingAddressWidget");
        this.billingAddressWidget = billingAddressWidget;
        if (billingAddressFields == BillingAddressFields.Full) {
            billingAddressWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity != null) {
            initEnterListeners(addPaymentMethodActivity);
        }
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.billingAddressFields.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.cardMultilineWidget.getPaymentMethodCreateParams();
            }
            if (i == 3) {
                return this.cardMultilineWidget.getPaymentMethodCreateParams();
            }
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethodCreateParams.Card paymentMethodCard = this.cardMultilineWidget.getPaymentMethodCard();
        PaymentMethod.BillingDetails billingDetails = getBillingDetails();
        if (paymentMethodCard == null || billingDetails == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, billingDetails, (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        ShippingInformation shippingInformation;
        if (this.billingAddressFields != BillingAddressFields.Full || (shippingInformation = this.billingAddressWidget.getShippingInformation()) == null) {
            return null;
        }
        return PaymentMethod.BillingDetails.INSTANCE.create(shippingInformation);
    }

    private final void initEnterListeners(AddPaymentMethodActivity activity) {
        OnEditorActionListenerImpl onEditorActionListenerImpl = new OnEditorActionListenerImpl(activity, this, new KeyboardController(activity));
        this.cardMultilineWidget.getCardNumberEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getExpiryDateEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getCvcEditText().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getPostalCodeEditText().setOnEditorActionListener(onEditorActionListenerImpl);
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public void setCommunicatingProgress(boolean communicating) {
        this.cardMultilineWidget.setEnabled(!communicating);
    }

    public final void setCardInputListener(CardInputListener listener) {
        this.cardMultilineWidget.setCardInputListener(listener);
    }

    /* compiled from: AddPaymentMethodCardView.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView$OnEditorActionListenerImpl;", "Landroid/widget/TextView$OnEditorActionListener;", "activity", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "addPaymentMethodCardView", "Lcom/stripe/android/view/AddPaymentMethodCardView;", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "(Lcom/stripe/android/view/AddPaymentMethodActivity;Lcom/stripe/android/view/AddPaymentMethodCardView;Lcom/stripe/android/view/KeyboardController;)V", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class OnEditorActionListenerImpl implements TextView.OnEditorActionListener {
        private final AddPaymentMethodActivity activity;
        private final AddPaymentMethodCardView addPaymentMethodCardView;
        private final KeyboardController keyboardController;

        public OnEditorActionListenerImpl(AddPaymentMethodActivity activity, AddPaymentMethodCardView addPaymentMethodCardView, KeyboardController keyboardController) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(addPaymentMethodCardView, "addPaymentMethodCardView");
            Intrinsics.checkNotNullParameter(keyboardController, "keyboardController");
            this.activity = activity;
            this.addPaymentMethodCardView = addPaymentMethodCardView;
            this.keyboardController = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId != 6) {
                return false;
            }
            if (this.addPaymentMethodCardView.getCreateParams() != null) {
                this.keyboardController.hide();
            }
            this.activity.onActionSave();
            return true;
        }
    }
}
