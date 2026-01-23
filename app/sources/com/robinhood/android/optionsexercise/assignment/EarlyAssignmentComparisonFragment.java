package com.robinhood.android.optionsexercise.assignment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexercise.databinding.FragmentEarlyAssignmentComparisonBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EarlyAssignmentComparisonFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001b\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000b\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentComparisonFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", EarlyAssignmentComparisonFragment.ARG_ORDER_SIDE, "Lcom/robinhood/models/db/OrderSide;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "orderSide$delegate", "Lkotlin/Lazy;", EarlyAssignmentComparisonFragment.ARG_IS_UK, "", "()Z", "isUk$delegate", "binding", "Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentComparisonBinding;", "getBinding", "()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentComparisonBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class EarlyAssignmentComparisonFragment extends BaseFragment implements RegionGated {
    private static final String ARG_IS_UK = "isUk";
    private static final String ARG_ORDER_SIDE = "orderSide";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk;

    /* renamed from: orderSide$delegate, reason: from kotlin metadata */
    private final Lazy orderSide;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarlyAssignmentComparisonFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionsexercise/databinding/FragmentEarlyAssignmentComparisonBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyAssignmentComparisonFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public EarlyAssignmentComparisonFragment() {
        super(C24704R.layout.fragment_early_assignment_comparison);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.orderSide = Fragments2.argument(this, ARG_ORDER_SIDE);
        this.isUk = Fragments2.argument(this, ARG_IS_UK);
        this.binding = ViewBinding5.viewBinding(this, EarlyAssignmentComparisonFragment2.INSTANCE);
    }

    private final OrderSide getOrderSide() {
        return (OrderSide) this.orderSide.getValue();
    }

    private final boolean isUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    private final FragmentEarlyAssignmentComparisonBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentEarlyAssignmentComparisonBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView earlyAssignmentComparisonTitle = getBinding().earlyAssignmentComparisonTitle;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonTitle, "earlyAssignmentComparisonTitle");
        RhTextView earlyAssignmentComparisonTradeUnderlyingHeader = getBinding().earlyAssignmentComparisonTradeUnderlyingHeader;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonTradeUnderlyingHeader, "earlyAssignmentComparisonTradeUnderlyingHeader");
        RhTextView earlyAssignmentComparisonTradeUnderlyingDetail = getBinding().earlyAssignmentComparisonTradeUnderlyingDetail;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonTradeUnderlyingDetail, "earlyAssignmentComparisonTradeUnderlyingDetail");
        LinearLayout earlyAssignmentComparisonBuyUnderlyingCons = getBinding().earlyAssignmentComparisonBuyUnderlyingCons;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonBuyUnderlyingCons, "earlyAssignmentComparisonBuyUnderlyingCons");
        RhTextView earlyAssignmentComparisonSellUnderlyingCons = getBinding().earlyAssignmentComparisonSellUnderlyingCons;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonSellUnderlyingCons, "earlyAssignmentComparisonSellUnderlyingCons");
        RhTextView earlyAssignmentComparisonSubtitle = getBinding().earlyAssignmentComparisonSubtitle;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonSubtitle, "earlyAssignmentComparisonSubtitle");
        RhTextView earlyAssignmentComparisonDescription = getBinding().earlyAssignmentComparisonDescription;
        Intrinsics.checkNotNullExpressionValue(earlyAssignmentComparisonDescription, "earlyAssignmentComparisonDescription");
        earlyAssignmentComparisonSubtitle.setText(isUk() ? getString(C24704R.string.early_assignment_comparison_description_gb) : getString(C24704R.string.early_assignment_comparison_description));
        earlyAssignmentComparisonDescription.setText(isUk() ? getString(C24704R.string.early_assignment_comparison_exercise_detail_gb) : getString(C24704R.string.early_assignment_comparison_exercise_detail));
        int i = WhenMappings.$EnumSwitchMapping$0[getOrderSide().ordinal()];
        if (i == 1) {
            earlyAssignmentComparisonTitle.setText(getString(C24704R.string.early_assignment_comparison_buy_title));
            earlyAssignmentComparisonTradeUnderlyingHeader.setText(getString(C24704R.string.early_assignment_comparison_buy_underlying_header));
            earlyAssignmentComparisonTradeUnderlyingDetail.setText(isUk() ? getString(C24704R.string.early_assignment_comparison_buy_underlying_detail_gb) : getString(C24704R.string.early_assignment_comparison_buy_underlying_detail));
            earlyAssignmentComparisonBuyUnderlyingCons.setVisibility(0);
            earlyAssignmentComparisonSellUnderlyingCons.setVisibility(8);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            earlyAssignmentComparisonTitle.setText(getString(C24704R.string.early_assignment_comparison_sell_title));
            earlyAssignmentComparisonTradeUnderlyingHeader.setText(getString(C24704R.string.early_assignment_comparison_sell_underlying_header));
            earlyAssignmentComparisonTradeUnderlyingDetail.setText(isUk() ? getString(C24704R.string.early_assignment_comparison_sell_underlying_detail_gb) : getString(C24704R.string.early_assignment_comparison_sell_underlying_detail));
            earlyAssignmentComparisonBuyUnderlyingCons.setVisibility(8);
            earlyAssignmentComparisonSellUnderlyingCons.setVisibility(0);
        }
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    /* compiled from: EarlyAssignmentComparisonFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentComparisonFragment$Companion;", "", "<init>", "()V", "ARG_ORDER_SIDE", "", "ARG_IS_UK", "newInstance", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentComparisonFragment;", EarlyAssignmentComparisonFragment.ARG_ORDER_SIDE, "Lcom/robinhood/models/db/OrderSide;", EarlyAssignmentComparisonFragment.ARG_IS_UK, "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final EarlyAssignmentComparisonFragment newInstance(OrderSide orderSide, boolean isUk) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            EarlyAssignmentComparisonFragment earlyAssignmentComparisonFragment = new EarlyAssignmentComparisonFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(EarlyAssignmentComparisonFragment.ARG_ORDER_SIDE, orderSide);
            bundle.putBoolean(EarlyAssignmentComparisonFragment.ARG_IS_UK, isUk);
            earlyAssignmentComparisonFragment.setArguments(bundle);
            return earlyAssignmentComparisonFragment;
        }
    }
}
