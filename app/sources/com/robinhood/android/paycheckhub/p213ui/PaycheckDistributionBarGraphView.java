package com.robinhood.android.paycheckhub.p213ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.MergePaycheckDistributionBarGraphViewBinding;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.utils.extensions.ViewGroups;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckDistributionBarGraphView.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDistributionBarGraphView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionBarGraphViewBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionBarGraphViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "setPaycheck", "", "paycheck", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckDistributionBarGraphView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckDistributionBarGraphView.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/MergePaycheckDistributionBarGraphViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public /* synthetic */ PaycheckDistributionBarGraphView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckDistributionBarGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        ViewGroups.inflate(this, C25434R.layout.merge_paycheck_distribution_bar_graph_view, true);
        this.binding = ViewBinding5.viewBinding(this, PaycheckDistributionBarGraphView2.INSTANCE);
    }

    private final MergePaycheckDistributionBarGraphViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergePaycheckDistributionBarGraphViewBinding) value;
    }

    public final void setPaycheck(PaycheckV2 paycheck) {
        Intrinsics.checkNotNullParameter(paycheck, "paycheck");
        BigDecimal bigDecimalDivide = paycheck.getInvestedAmount().divide(paycheck.getDollarAmount(), RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        float fFloatValue = bigDecimalDivide.floatValue();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, fFloatValue);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1, 1 - fFloatValue);
        MergePaycheckDistributionBarGraphViewBinding binding = getBinding();
        binding.paycheckAmountInvested.setLayoutParams(layoutParams);
        binding.paycheckAmountReceived.setLayoutParams(layoutParams2);
    }
}
