package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.robinhood.android.common.equitydetail.performance.PerformanceView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.recommendations.C25978R;
import com.robinhood.android.recommendations.databinding.MergeLearnMoreRowViewBinding;
import com.robinhood.android.recommendations.p224ui.walkthrough.learnmore.RecommendationsLearnMoreViewState;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: LearnMoreRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/LearnMoreRowView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/RecommendationsLearnMoreViewState$ExpandableRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/recommendations/databinding/MergeLearnMoreRowViewBinding;", "getBinding", "()Lcom/robinhood/android/recommendations/databinding/MergeLearnMoreRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "trailingIconTint", "Landroid/content/res/ColorStateList;", "bind", "", "state", "toggleExpandedContent", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class LearnMoreRowView extends LinearLayout implements Bindable<RecommendationsLearnMoreViewState.ExpandableRow> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LearnMoreRowView.class, "binding", "getBinding()Lcom/robinhood/android/recommendations/databinding/MergeLearnMoreRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final ColorStateList trailingIconTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, LearnMoreRowView3.INSTANCE);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        this.trailingIconTint = colorStateListValueOf;
        ViewGroups.inflate(this, C25978R.layout.merge_learn_more_row_view, true);
    }

    private final MergeLearnMoreRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeLearnMoreRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RecommendationsLearnMoreViewState.ExpandableRow state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        final MergeLearnMoreRowViewBinding binding = getBinding();
        binding.row.setPrimaryText(state.getTitle());
        binding.row.setMetadataPrimaryText(state.getValue());
        RdsRowView row = binding.row;
        Intrinsics.checkNotNullExpressionValue(row, "row");
        OnClickListeners.onClick(row, new LearnMoreRowView2(this));
        final RdsRowView row2 = binding.row;
        Intrinsics.checkNotNullExpressionValue(row2, "row");
        final ViewTreeObserver viewTreeObserver = row2.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.recommendations.ui.walkthrough.learnmore.LearnMoreRowView$bind$lambda$1$$inlined$safeOnPreDraw$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = row2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    RdsRowView rdsRowView = binding.row;
                    Context context2 = this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    rdsRowView.setTrailingIconDrawable(Contexts7.getThemeDrawable(context2, C20690R.attr.iconCaretDown16dp));
                    binding.row.setTrailingIconTint(this.trailingIconTint);
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                row2.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        LinearLayout expandedContentContainer = binding.expandedContentContainer;
        Intrinsics.checkNotNullExpressionValue(expandedContentContainer, "expandedContentContainer");
        expandedContentContainer.setVisibility(8);
        binding.expandedContentText.setText(state.getExpandedContent());
        PerformanceView performanceTable = binding.performanceTable;
        Intrinsics.checkNotNullExpressionValue(performanceTable, "performanceTable");
        performanceTable.setVisibility(state.getEtpDetails() != null ? 0 : 8);
        if (state.getEtpDetails() != null) {
            binding.performanceTable.bind(state.getEtpDetails());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleExpandedContent() {
        LinearLayout expandedContentContainer = getBinding().expandedContentContainer;
        Intrinsics.checkNotNullExpressionValue(expandedContentContainer, "expandedContentContainer");
        boolean z = expandedContentContainer.getVisibility() == 0;
        int i = !z ? C20690R.attr.iconCaretUp16dp : C20690R.attr.iconCaretDown16dp;
        RdsRowView rdsRowView = getBinding().row;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsRowView.setTrailingIconDrawable(Contexts7.getThemeDrawable(context, i));
        getBinding().row.setTrailingIconTint(this.trailingIconTint);
        LinearLayout expandedContentContainer2 = getBinding().expandedContentContainer;
        Intrinsics.checkNotNullExpressionValue(expandedContentContainer2, "expandedContentContainer");
        expandedContentContainer2.setVisibility(z ? 8 : 0);
    }

    /* compiled from: LearnMoreRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/LearnMoreRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/recommendations/ui/walkthrough/learnmore/LearnMoreRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<LearnMoreRowView> {
        private final /* synthetic */ Inflater<LearnMoreRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public LearnMoreRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (LearnMoreRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25978R.layout.include_learn_more_row);
        }
    }
}
