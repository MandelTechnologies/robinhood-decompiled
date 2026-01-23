package com.robinhood.android.advancedchart;

import android.view.View;
import android.view.ViewTreeObserver;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipData2;
import com.robinhood.tooltips.TooltipManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartParentFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/android/advancedchart/AdvancedChartParentFragment$onViewCreated$listener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$listener$1, reason: use source file name */
/* loaded from: classes24.dex */
public final class AdvancedChartParentFragment4 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View $decorView;
    final /* synthetic */ AdvancedChartParentFragment this$0;

    AdvancedChartParentFragment4(AdvancedChartParentFragment advancedChartParentFragment, View view) {
        this.this$0 = advancedChartParentFragment;
        this.$decorView = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        View viewFindViewById = this.this$0.requireActivity().findViewById(C8502R.id.action_advanced_chart_learn_more);
        if (viewFindViewById != null) {
            this.$decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            TooltipManager tooltipManager = this.this$0.getTooltipManager();
            String string2 = this.this$0.getString(C15314R.string.advanced_chart_disclosure_tooltip_description);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TooltipData.Target target = TooltipData2.toTarget(viewFindViewById);
            final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
            TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData("advanced-chart-disclosure-tooltip", string2, target, null, new TooltipData.Behavior(null, null, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$listener$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AdvancedChartParentFragment4.onGlobalLayout$lambda$0(advancedChartParentFragment, (View) obj);
                }
            }, null, 11, null), 8, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGlobalLayout$lambda$0(AdvancedChartParentFragment advancedChartParentFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartParentFragment.getShownAdvancedChartDisclosureTooltipPref().set(true);
        return Unit.INSTANCE;
    }
}
