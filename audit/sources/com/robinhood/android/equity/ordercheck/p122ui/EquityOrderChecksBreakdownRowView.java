package com.robinhood.android.equity.ordercheck.p122ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.equityvalidation.C16020R;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksBreakdownRowViewBinding;
import com.robinhood.models.api.bonfire.ApiArithmeticType;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EquityOrderChecksBreakdownRowView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equity/ordercheck/ui/State;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownRowViewBinding;", "getBinding", "()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "displayString", "", "Lcom/robinhood/models/api/bonfire/ApiArithmeticType;", "Companion", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderChecksBreakdownRowView extends ConstraintLayout implements Bindable<State> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityOrderChecksBreakdownRowView.class, "binding", "getBinding()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityOrderChecksBreakdownRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiArithmeticType.values().length];
            try {
                iArr[ApiArithmeticType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiArithmeticType.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiArithmeticType.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiArithmeticType.MULTIPLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiArithmeticType.DIVIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderChecksBreakdownRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, EquityOrderChecksBreakdownRowView2.INSTANCE);
        ViewGroups.inflate(this, C16020R.layout.merge_equity_order_checks_breakdown_row_view, true);
    }

    private final MergeEquityOrderChecksBreakdownRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEquityOrderChecksBreakdownRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        VisibleEquityOrderChecksAlert.Section.BreakdownRow breakdownRow = state.getBreakdownRow();
        getBinding().dataRowLabelText.setText(breakdownRow.getTitle());
        getBinding().dataRowArithmeticText.setText(displayString(breakdownRow.getArithmeticType()));
        getBinding().dataRowValueText.setText(breakdownRow.getSubtitleMarkdown());
        View divider = getBinding().divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(state.getShowTopDivider() ? 0 : 8);
    }

    private final String displayString(ApiArithmeticType apiArithmeticType) {
        int i = WhenMappings.$EnumSwitchMapping$0[apiArithmeticType.ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return "+";
        }
        if (i == 3) {
            return "-";
        }
        if (i == 4) {
            return "x";
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return "/";
    }

    /* compiled from: EquityOrderChecksBreakdownRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksBreakdownRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EquityOrderChecksBreakdownRowView> {
        private final /* synthetic */ Inflater<EquityOrderChecksBreakdownRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EquityOrderChecksBreakdownRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EquityOrderChecksBreakdownRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C16020R.layout.include_equity_order_checks_breakdown_row_view);
        }
    }
}
