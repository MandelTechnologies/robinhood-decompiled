package com.robinhood.android.advancedchart.config;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.advanced.chart.IndicatorListItemView;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.databinding.ViewIndicatorListItemBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AdvancedChartIndicatorListItemView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0002 !B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/advancedchart/config/IndicatorViewItemState;", "Lcom/robinhood/android/advanced/chart/IndicatorListItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/advancedchart/databinding/ViewIndicatorListItemBinding;", "getBinding", "()Lcom/robinhood/android/advancedchart/databinding/ViewIndicatorListItemBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Callbacks;", "getCallbacks$feature_advanced_chart_externalDebug", "()Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Callbacks;", "setCallbacks$feature_advanced_chart_externalDebug", "(Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Callbacks;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "bind", "", "state", "Callbacks", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorListItemView extends ConstraintLayout implements Bindable<IndicatorViewItemState>, IndicatorListItemView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    private String id;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedChartIndicatorListItemView.class, "binding", "getBinding()Lcom/robinhood/android/advancedchart/databinding/ViewIndicatorListItemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvancedChartIndicatorListItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Callbacks;", "", "onIndicatorToggled", "", "id", "", "onAddIndicatorButtonClicked", "onIndicatorClicked", "apiTechnicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddIndicatorButtonClicked();

        void onIndicatorClicked(ApiTechnicalIndicator apiTechnicalIndicator);

        void onIndicatorToggled(String id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedChartIndicatorListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AdvancedChartIndicatorListItemView2.INSTANCE);
        this.id = "";
    }

    private final ViewIndicatorListItemBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewIndicatorListItemBinding) value;
    }

    /* renamed from: getCallbacks$feature_advanced_chart_externalDebug, reason: from getter */
    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks$feature_advanced_chart_externalDebug(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // android.view.View, com.robinhood.android.advanced.chart.IndicatorListItemView
    public String getId() {
        return this.id;
    }

    @Override // com.robinhood.android.advanced.chart.IndicatorListItemView
    public void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(IndicatorViewItemState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().title.setText(state.getIndicatorState().getFullTitle());
        ImageView imageView = getBinding().dot;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, state.getIndicatorState().getColorRes())));
        setId(state.getIndicatorState().getId());
        RdsToggleView toggle = getBinding().toggle;
        Intrinsics.checkNotNullExpressionValue(toggle, "toggle");
        toggle.setVisibility(state.getShowToggle() ? 0 : 8);
        getBinding().toggle.setChecked(Intrinsics.areEqual(state.getIndicatorState().getSelected(), Boolean.TRUE));
        getBinding().toggle.onCheckedChanged(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListItemView.bind$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(AdvancedChartIndicatorListItemView advancedChartIndicatorListItemView, boolean z) {
        Callbacks callbacks = advancedChartIndicatorListItemView.callbacks;
        if (callbacks != null) {
            callbacks.onIndicatorToggled(advancedChartIndicatorListItemView.getId());
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartIndicatorListItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AdvancedChartIndicatorListItemView> {
        private final /* synthetic */ Inflater<AdvancedChartIndicatorListItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AdvancedChartIndicatorListItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AdvancedChartIndicatorListItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8502R.layout.view_indicator_list_item);
        }
    }
}
