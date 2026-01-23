package com.robinhood.android.lib.trade.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderConfirmationRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0017\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "labelTextView", "Landroid/widget/TextView;", "getLabelTextView", "()Landroid/widget/TextView;", "labelTextView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "labelMetaTextView", "getLabelMetaTextView", "labelMetaTextView$delegate", "valueTextView", "getValueTextView", "valueTextView$delegate", "valueMetaTextView", "getValueMetaTextView", "valueMetaTextView$delegate", "bind", "", "state", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OrderConfirmationRowView extends ConstraintLayout implements Bindable<OrderConfirmationRowItem> {

    /* renamed from: labelMetaTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 labelMetaTextView;

    /* renamed from: labelTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 labelTextView;

    /* renamed from: valueMetaTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 valueMetaTextView;

    /* renamed from: valueTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 valueTextView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderConfirmationRowView.class, "labelTextView", "getLabelTextView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfirmationRowView.class, "labelMetaTextView", "getLabelMetaTextView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfirmationRowView.class, "valueTextView", "getValueTextView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfirmationRowView.class, "valueMetaTextView", "getValueMetaTextView()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmationRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C20649R.layout.merge_order_confirmation_row, true);
        this.labelTextView = BindViewDelegate2.bindView$default(this, C20649R.id.order_row_label_txt, null, 2, null);
        this.labelMetaTextView = BindViewDelegate2.bindView$default(this, C20649R.id.order_row_label_meta_txt, null, 2, null);
        this.valueTextView = BindViewDelegate2.bindView$default(this, C20649R.id.order_row_value_txt, null, 2, null);
        this.valueMetaTextView = BindViewDelegate2.bindView$default(this, C20649R.id.order_row_value_meta_txt, null, 2, null);
    }

    private final TextView getLabelTextView() {
        return (TextView) this.labelTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getLabelMetaTextView() {
        return (TextView) this.labelMetaTextView.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getValueTextView() {
        return (TextView) this.valueTextView.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getValueMetaTextView() {
        return (TextView) this.valueMetaTextView.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OrderConfirmationRowItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getLabelTextView().setText(state.getLabelText());
        TextViewsKt.setVisibilityText(getLabelMetaTextView(), state.getLabelMeta());
        getValueTextView().setText(state.getValueText());
        TextViewsKt.setVisibilityText(getValueMetaTextView(), state.getValueMeta());
    }

    /* compiled from: OrderConfirmationRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lib/trade/view/OrderConfirmationRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OrderConfirmationRowView> {
        private final /* synthetic */ Inflater<OrderConfirmationRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OrderConfirmationRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OrderConfirmationRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20649R.layout.include_order_confirmation_row_view);
        }
    }
}
