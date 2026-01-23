package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.CustomerSession;
import com.stripe.android.R$string;
import com.stripe.android.R$style;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeletePaymentMethodDialogFactory.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019BO\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0013R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m3636d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "", "context", "Landroid/content/Context;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "productUsage", "", "", "onDeletedPaymentMethodCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Landroidx/appcompat/app/AlertDialog;", "paymentMethod", "onDeletedPaymentMethod", "onDeletedPaymentMethod$payments_core_release", "PaymentMethodDeleteListener", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class DeletePaymentMethodDialogFactory {
    private final PaymentMethodsAdapter adapter;
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Context context;
    private final Object customerSession;
    private final Function1<PaymentMethod, Unit> onDeletedPaymentMethodCallback;
    private final Set<String> productUsage;

    /* compiled from: DeletePaymentMethodDialogFactory.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "<init>", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class PaymentMethodDeleteListener implements CustomerSession.PaymentMethodRetrievalListener {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletePaymentMethodDialogFactory(Context context, PaymentMethodsAdapter adapter, CardDisplayTextFactory cardDisplayTextFactory, Object obj, Set<String> productUsage, Function1<? super PaymentMethod, Unit> onDeletedPaymentMethodCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(cardDisplayTextFactory, "cardDisplayTextFactory");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.context = context;
        this.adapter = adapter;
        this.cardDisplayTextFactory = cardDisplayTextFactory;
        this.customerSession = obj;
        this.productUsage = productUsage;
        this.onDeletedPaymentMethodCallback = onDeletedPaymentMethodCallback;
    }

    public final /* synthetic */ AlertDialog create(final PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.context, R$style.StripeAlertDialogStyle).setTitle(R$string.stripe_delete_payment_method_prompt_title).setMessage(card != null ? this.cardDisplayTextFactory.createUnstyled$payments_core_release(card) : null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.DeletePaymentMethodDialogFactory$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeletePaymentMethodDialogFactory.create$lambda$1(this.f$0, paymentMethod, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.DeletePaymentMethodDialogFactory$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DeletePaymentMethodDialogFactory.create$lambda$2(this.f$0, paymentMethod, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.DeletePaymentMethodDialogFactory$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                DeletePaymentMethodDialogFactory.create$lambda$3(this.f$0, paymentMethod, dialogInterface);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$1(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.onDeletedPaymentMethod$payments_core_release(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$2(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$3(DeletePaymentMethodDialogFactory this$0, PaymentMethod paymentMethod, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paymentMethod, "$paymentMethod");
        this$0.adapter.resetPaymentMethod$payments_core_release(paymentMethod);
    }

    public final /* synthetic */ void onDeletedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.adapter.deletePaymentMethod$payments_core_release(paymentMethod);
        String str = paymentMethod.id;
        if (str != null) {
            Object obj = this.customerSession;
            if (Result.m28555isFailureimpl(obj)) {
                obj = null;
            }
            CustomerSession customerSession = (CustomerSession) obj;
            if (customerSession != null) {
                customerSession.detachPaymentMethod$payments_core_release(str, this.productUsage, new PaymentMethodDeleteListener());
            }
        }
        this.onDeletedPaymentMethodCallback.invoke(paymentMethod);
    }
}
