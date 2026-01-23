package com.robinhood.android.common.recurring.intro;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.MergeRecurringInvestmentGraphColumnViewBinding;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RecurringInvestmentGraphColumnView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0017@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/intro/RecurringInvestmentGraphColumnView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphColumnViewBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphColumnViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "format", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "value", "", "investedAmount", "getInvestedAmount", "()I", "setInvestedAmount", "(I)V", "", "columnLabel", "getColumnLabel", "()Ljava/lang/String;", "setColumnLabel", "(Ljava/lang/String;)V", "", "columnBarHeightRatio", "getColumnBarHeightRatio", "()F", "setColumnBarHeightRatio", "(F)V", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringInvestmentGraphColumnView extends LinearLayout {
    private static final float WEIGHT_SUM = 1.0f;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private float columnBarHeightRatio;
    private String columnLabel;
    private final NumberFormatter format;
    private int investedAmount;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringInvestmentGraphColumnView.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/MergeRecurringInvestmentGraphColumnViewBinding;", 0))};
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringInvestmentGraphColumnView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        setGravity(81);
        setWeightSum(1.0f);
        ViewGroups.inflate(this, C11595R.layout.merge_recurring_investment_graph_column_view, true);
        this.binding = ViewBinding5.viewBinding(this, RecurringInvestmentGraphColumnView2.INSTANCE);
        this.format = Formats.getWholeNumberAmountFormat();
        this.columnLabel = "";
        this.columnBarHeightRatio = 1.0f;
    }

    private final MergeRecurringInvestmentGraphColumnViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRecurringInvestmentGraphColumnViewBinding) value;
    }

    public final int getInvestedAmount() {
        return this.investedAmount;
    }

    public final void setInvestedAmount(int i) {
        this.investedAmount = i;
        getBinding().investedText.setText(this.format.format(Integer.valueOf(i)));
    }

    public final String getColumnLabel() {
        return this.columnLabel;
    }

    public final void setColumnLabel(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.columnLabel = value;
        getBinding().columnLabel.setText(value);
    }

    public final float getColumnBarHeightRatio() {
        return this.columnBarHeightRatio;
    }

    public final void setColumnBarHeightRatio(float f) {
        this.columnBarHeightRatio = f;
        ViewGroup.LayoutParams layoutParams = getBinding().columnBar.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).weight = f;
    }
}
