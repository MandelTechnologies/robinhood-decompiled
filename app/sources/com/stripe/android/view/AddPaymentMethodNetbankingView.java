package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.R$id;
import com.stripe.android.databinding.StripeBankListPaymentMethodBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddPaymentMethodNetbankingView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroidx/fragment/app/FragmentActivity;Landroid/util/AttributeSet;I)V", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "netbankingAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "selectedPosition", "Ljava/lang/Integer;", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AddPaymentMethodNetbankingView extends AddPaymentMethodView {
    private final AddPaymentMethodListAdapter netbankingAdapter;
    private Integer selectedPosition;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AddPaymentMethodNetbankingView(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AddPaymentMethodNetbankingView(FragmentActivity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
        Intrinsics.checkNotNullParameter(activity, "activity");
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(new ThemeConfig(activity), NetbankingBank.getEntries(), new Function1<Integer, Unit>() { // from class: com.stripe.android.view.AddPaymentMethodNetbankingView$netbankingAdapter$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i2) {
                this.this$0.selectedPosition = Integer.valueOf(i2);
            }
        });
        this.netbankingAdapter = addPaymentMethodListAdapter;
        StripeBankListPaymentMethodBinding stripeBankListPaymentMethodBindingInflate = StripeBankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        Intrinsics.checkNotNullExpressionValue(stripeBankListPaymentMethodBindingInflate, "inflate(...)");
        setId(R$id.stripe_payment_methods_add_netbanking);
        RecyclerView recyclerView = stripeBankListPaymentMethodBindingInflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer num = this.selectedPosition;
        if (num != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(num.intValue());
        }
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        Integer numValueOf = Integer.valueOf(this.netbankingAdapter.getSelectedPosition());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Netbanking(NetbankingBank.getEntries().get(this.netbankingAdapter.getSelectedPosition()).getCode()), (PaymentMethod.BillingDetails) null, (Map) null, (PaymentMethod.AllowRedisplay) null, 14, (Object) null);
    }

    /* compiled from: AddPaymentMethodNetbankingView.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "create$payments_core_release", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ AddPaymentMethodNetbankingView create$payments_core_release(FragmentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return new AddPaymentMethodNetbankingView(activity, null, 0, 6, null);
        }
    }
}
