package com.robinhood.android.transfers.recurring.p270ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.databinding.MergeRowRecurringInvestmentHookBinding;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AutomaticDepositRecurringInvestmentHookViewRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositRecurringInvestmentHookViewRow;", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/transfers/recurring/databinding/MergeRowRecurringInvestmentHookBinding;", "getBinding", "()Lcom/robinhood/android/transfers/recurring/databinding/MergeRowRecurringInvestmentHookBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "hookCard", "Landroid/view/View;", "getHookCard", "()Landroid/view/View;", "hookCta", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getHookCta", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AutomaticDepositRecurringInvestmentHookViewRow extends RdsCardView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AutomaticDepositRecurringInvestmentHookViewRow.class, "binding", "getBinding()Lcom/robinhood/android/transfers/recurring/databinding/MergeRowRecurringInvestmentHookBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final View hookCard;
    private final RdsButton hookCta;

    public /* synthetic */ AutomaticDepositRecurringInvestmentHookViewRow(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomaticDepositRecurringInvestmentHookViewRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C30439R.layout.merge_row_recurring_investment_hook, true);
        this.binding = ViewBinding5.viewBinding(this, AutomaticDepositRecurringInvestmentHookViewRow2.INSTANCE);
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.hookCard = root;
        RdsButton recurringInvestmentsHookCta = getBinding().recurringInvestmentsHookCta;
        Intrinsics.checkNotNullExpressionValue(recurringInvestmentsHookCta, "recurringInvestmentsHookCta");
        this.hookCta = recurringInvestmentsHookCta;
    }

    private final MergeRowRecurringInvestmentHookBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRowRecurringInvestmentHookBinding) value;
    }

    public final View getHookCard() {
        return this.hookCard;
    }

    public final RdsButton getHookCta() {
        return this.hookCta;
    }
}
