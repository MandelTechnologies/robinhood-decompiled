package com.robinhood.android.advanced.alert.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.databinding.ViewAlertHubIndicatorListItemBinding;
import com.robinhood.android.advanced.chart.IndicatorListItemView;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AlertHubIndicatorListItemView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001aB\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AlertHubIndicatorListItemView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "Lcom/robinhood/android/advanced/chart/IndicatorListItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/advanced/alert/databinding/ViewAlertHubIndicatorListItemBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/ViewAlertHubIndicatorListItemBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "bind", "", "state", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AlertHubIndicatorListItemView extends RdsRippleContainerView implements Bindable<IndicatorState>, IndicatorListItemView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private String id;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AlertHubIndicatorListItemView.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/ViewAlertHubIndicatorListItemBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertHubIndicatorListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AlertHubIndicatorListItemView2.INSTANCE);
        this.id = "";
    }

    private final ViewAlertHubIndicatorListItemBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewAlertHubIndicatorListItemBinding) value;
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
    public void bind(IndicatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getBinding().title.setText(state.getFullTitle());
        ImageView imageView = getBinding().dot;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, state.getColorRes())));
        setId(state.getId());
    }

    /* compiled from: AlertHubIndicatorListItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AlertHubIndicatorListItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/advanced/alert/view/AlertHubIndicatorListItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AlertHubIndicatorListItemView> {
        private final /* synthetic */ Inflater<AlertHubIndicatorListItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AlertHubIndicatorListItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AlertHubIndicatorListItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8387R.layout.view_alert_hub_indicator_list_item);
        }
    }
}
