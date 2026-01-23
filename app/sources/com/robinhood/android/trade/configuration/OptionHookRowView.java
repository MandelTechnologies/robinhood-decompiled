package com.robinhood.android.trade.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionHookRowView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OptionHookRowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "upsellContainer", "Landroid/view/View;", "getUpsellContainer", "()Landroid/view/View;", "upsellContainer$delegate", "Lkotlin/properties/ReadOnlyProperty;", AccountOverviewOptionsSettingCard4.CTA, "Landroid/widget/TextView;", "getCta", "()Landroid/widget/TextView;", "cta$delegate", "bind", "", "isUk", "", "Companion", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionHookRowView extends FrameLayout {

    /* renamed from: cta$delegate, reason: from kotlin metadata */
    private final Interfaces2 cta;

    /* renamed from: upsellContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 upsellContainer;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionHookRowView.class, "upsellContainer", "getUpsellContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionHookRowView.class, AccountOverviewOptionsSettingCard4.CTA, "getCta()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionHookRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C29312R.layout.merge_option_hook_row, true);
        this.upsellContainer = BindViewDelegate2.bindView$default(this, C29312R.id.upsell_container, null, 2, null);
        this.cta = BindViewDelegate2.bindView$default(this, C29312R.id.cta, null, 2, null);
    }

    public final View getUpsellContainer() {
        return (View) this.upsellContainer.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getCta() {
        return (TextView) this.cta.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(boolean isUk) {
        int i;
        TextView cta = getCta();
        Resources resources = getResources();
        if (isUk) {
            i = C29312R.string.gated_options_uk_order_options_hook_cta;
        } else {
            i = C29312R.string.gated_options_order_options_hook_cta;
        }
        cta.setText(resources.getText(i));
    }

    /* compiled from: OptionHookRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OptionHookRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/trade/configuration/OptionHookRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionHookRowView> {
        private final /* synthetic */ Inflater<OptionHookRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionHookRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionHookRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C29312R.layout.include_option_hook_row);
        }
    }
}
