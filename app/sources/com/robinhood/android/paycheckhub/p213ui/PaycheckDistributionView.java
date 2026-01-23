package com.robinhood.android.paycheckhub.p213ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.MergePaycheckDistributionViewBinding;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckDistributionView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionViewBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView$Callbacks;)V", "setPaycheck", "", "paycheck", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "Callbacks", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckDistributionView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckDistributionView.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;

    /* compiled from: PaycheckDistributionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionView$Callbacks;", "", "onNetDepositInfoIconClicked", "", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onNetDepositInfoIconClicked();
    }

    public /* synthetic */ PaycheckDistributionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckDistributionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C25434R.layout.merge_paycheck_distribution_view, true);
        this.binding = ViewBinding5.viewBinding(this, PaycheckDistributionView2.INSTANCE);
    }

    private final MergePaycheckDistributionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergePaycheckDistributionViewBinding) value;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void setPaycheck(PaycheckV2 paycheck) {
        Intrinsics.checkNotNullParameter(paycheck, "paycheck");
        MergePaycheckDistributionViewBinding binding = getBinding();
        binding.paycheckDistributionBarGraphView.setPaycheck(paycheck);
        LinearLayout paycheckDistributionBarGraphLegend = binding.paycheckDistributionBarGraphLegend;
        Intrinsics.checkNotNullExpressionValue(paycheckDistributionBarGraphLegend, "paycheckDistributionBarGraphLegend");
        paycheckDistributionBarGraphLegend.setVisibility(0);
        RhTextView rhTextView = binding.paycheckTotalInvested;
        BigDecimal investedAmount = paycheck.getInvestedAmount();
        Currency currency = Currencies.USD;
        rhTextView.setText(Money.format$default(Money3.toMoney(investedAmount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        RhTextView rhTextView2 = binding.paycheckTotalDeposited;
        BigDecimal bigDecimalSubtract = paycheck.getDollarAmount().subtract(paycheck.getInvestedAmount());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        rhTextView2.setText(Money.format$default(Money3.toMoney(bigDecimalSubtract, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        RhTextView paycheckTotalDepositedSecondaryText = binding.paycheckTotalDepositedSecondaryText;
        Intrinsics.checkNotNullExpressionValue(paycheckTotalDepositedSecondaryText, "paycheckTotalDepositedSecondaryText");
        OnClickListeners.onClick(paycheckTotalDepositedSecondaryText, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckDistributionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckDistributionView.setPaycheck$lambda$1$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPaycheck$lambda$1$lambda$0(PaycheckDistributionView paycheckDistributionView) {
        Callbacks callbacks = paycheckDistributionView.callbacks;
        if (callbacks != null) {
            callbacks.onNetDepositInfoIconClicked();
        }
        return Unit.INSTANCE;
    }
}
