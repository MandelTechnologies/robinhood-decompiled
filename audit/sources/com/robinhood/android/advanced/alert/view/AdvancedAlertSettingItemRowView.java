package com.robinhood.android.advanced.alert.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.databinding.MergeAdvancedAlertItemRowViewBinding;
import com.robinhood.android.advanced.chart.IndicatorListItemView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.utils.p409ui.view.Inflater;
import io.noties.markwon.Markwon;
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

/* compiled from: AdvancedAlertSettingItemRowView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020%H\u0016J\u001c\u00103\u001a\u0002012\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u000201\u0018\u000105J&\u00106\u001a\u0002012\u0006\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0010J\b\u0010;\u001a\u000201H\u0014R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010-\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AdvancedAlertSettingItemRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/android/advanced/chart/IndicatorListItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "binding", "Lcom/robinhood/android/advanced/alert/databinding/MergeAdvancedAlertItemRowViewBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/MergeAdvancedAlertItemRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "", "isChecked", "()Z", "setChecked", "(Z)V", "showBottomDivider", "getShowBottomDivider", "setShowBottomDivider", "showEditBtn", "getShowEditBtn", "setShowEditBtn", "setEnabled", "", "enabled", "onCheckedChanged", "listener", "Lkotlin/Function1;", "bind", "settingItem", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "uiResourceTitle", "uiResourceSubtitle", "onDetachedFromWindow", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedAlertSettingItemRowView extends Hammer_AdvancedAlertSettingItemRowView implements IndicatorListItemView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private String id;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedAlertSettingItemRowView.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/MergeAdvancedAlertItemRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAlertSettingItemRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.id = "";
        View.inflate(context, C8387R.layout.merge_advanced_alert_item_row_view, this);
        this.binding = ViewBinding5.viewBinding(this, AdvancedAlertSettingItemRowView2.INSTANCE);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    private final MergeAdvancedAlertItemRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAdvancedAlertItemRowViewBinding) value;
    }

    public final CharSequence getPrimaryText() {
        return getBinding().rowTextContainer.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        getBinding().rowTextContainer.setPrimaryText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return getBinding().rowTextContainer.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        getBinding().rowTextContainer.setSecondaryText(charSequence);
    }

    public final boolean isChecked() {
        return getBinding().rowToggleSwitch.isChecked();
    }

    public final void setChecked(boolean z) throws Resources.NotFoundException {
        getBinding().rowToggleSwitch.setChecked(z);
    }

    public final boolean getShowBottomDivider() {
        View rowBottomDivider = getBinding().rowBottomDivider;
        Intrinsics.checkNotNullExpressionValue(rowBottomDivider, "rowBottomDivider");
        return rowBottomDivider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        View rowBottomDivider = getBinding().rowBottomDivider;
        Intrinsics.checkNotNullExpressionValue(rowBottomDivider, "rowBottomDivider");
        rowBottomDivider.setVisibility(z ? 0 : 8);
    }

    public final boolean getShowEditBtn() {
        ImageView rowEditIcon = getBinding().rowEditIcon;
        Intrinsics.checkNotNullExpressionValue(rowEditIcon, "rowEditIcon");
        return rowEditIcon.getVisibility() == 0;
    }

    public final void setShowEditBtn(boolean z) {
        getBinding().rowEditIcon.setVisibility(z ? 0 : 4);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getBinding().rowTextContainer.setEnabled(enabled);
        getBinding().rowToggleSwitch.setEnabled(enabled);
    }

    public final void onCheckedChanged(final Function1<? super Boolean, Unit> listener) {
        if (listener != null) {
            getBinding().rowToggleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.robinhood.android.advanced.alert.view.AdvancedAlertSettingItemRowView.onCheckedChanged.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    listener.invoke(Boolean.valueOf(z));
                }
            });
        } else {
            getBinding().rowToggleSwitch.setOnCheckedChangeListener(null);
        }
    }

    public static /* synthetic */ void bind$default(AdvancedAlertSettingItemRowView advancedAlertSettingItemRowView, AlertHubSettingItem alertHubSettingItem, String str, String str2, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        advancedAlertSettingItemRowView.bind(alertHubSettingItem, str, str2);
    }

    public final void bind(AlertHubSettingItem settingItem, String uiResourceTitle, String uiResourceSubtitle) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(settingItem, "settingItem");
        String id = settingItem.getId();
        if (id == null) {
            id = "";
        }
        setId(id);
        Markwon markwon = getMarkwon();
        if (uiResourceTitle == null) {
            uiResourceTitle = "";
        }
        setPrimaryText(markwon.toMarkdown(uiResourceTitle));
        setSecondaryText(uiResourceSubtitle);
        setChecked(settingItem.getEnabled());
        String id2 = settingItem.getId();
        setShowEditBtn((id2 == null || id2.length() == 0 || !settingItem.getEnabled()) ? false : true);
        setShowBottomDivider(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getBinding().rowToggleSwitch.setOnCheckedChangeListener(null);
    }

    /* compiled from: AdvancedAlertSettingItemRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AdvancedAlertSettingItemRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/advanced/alert/view/AdvancedAlertSettingItemRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AdvancedAlertSettingItemRowView> {
        private final /* synthetic */ Inflater<AdvancedAlertSettingItemRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AdvancedAlertSettingItemRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AdvancedAlertSettingItemRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8387R.layout.include_advanced_alert_item_row_view);
        }
    }
}
