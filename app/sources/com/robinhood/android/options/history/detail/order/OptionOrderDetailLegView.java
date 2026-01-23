package com.robinhood.android.options.history.detail.order;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.history.detail.extensions.UiOptionOrders;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrderExecution;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionOrderDetailLegView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u0019\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailLegView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "getTitleTxt", "()Landroid/widget/TextView;", "titleTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "sideTxt", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getSideTxt", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "sideTxt$delegate", "effectTxt", "getEffectTxt", "effectTxt$delegate", "filledTxt", "getFilledTxt", "filledTxt$delegate", "filledQuantityTxt", "getFilledQuantityTxt", "filledQuantityTxt$delegate", "bindLeg", "", Card.Icon.ORDER, "Lcom/robinhood/models/ui/UiOptionOrder;", "legIndex", "", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOrderDetailLegView extends LinearLayout {

    /* renamed from: effectTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 effectTxt;

    /* renamed from: filledQuantityTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 filledQuantityTxt;

    /* renamed from: filledTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 filledTxt;

    /* renamed from: sideTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 sideTxt;

    /* renamed from: titleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderDetailLegView.class, "titleTxt", "getTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderDetailLegView.class, "sideTxt", "getSideTxt()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderDetailLegView.class, "effectTxt", "getEffectTxt()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderDetailLegView.class, "filledTxt", "getFilledTxt()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderDetailLegView.class, "filledQuantityTxt", "getFilledQuantityTxt()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderDetailLegView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.titleTxt = BindViewDelegate2.bindView$default(this, C23086R.id.title_txt, null, 2, null);
        this.sideTxt = BindViewDelegate2.bindView$default(this, C23086R.id.option_order_detail_leg_side, null, 2, null);
        this.effectTxt = BindViewDelegate2.bindView$default(this, C23086R.id.option_order_detail_leg_effect, null, 2, null);
        this.filledTxt = BindViewDelegate2.bindView$default(this, C23086R.id.option_order_detail_leg_filled, null, 2, null);
        this.filledQuantityTxt = BindViewDelegate2.bindView$default(this, C23086R.id.option_order_detail_leg_filled_quantity, null, 2, null);
    }

    private final TextView getTitleTxt() {
        return (TextView) this.titleTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getSideTxt() {
        return (RdsDataRowView) this.sideTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsDataRowView getEffectTxt() {
        return (RdsDataRowView) this.effectTxt.getValue(this, $$delegatedProperties[2]);
    }

    private final RdsDataRowView getFilledTxt() {
        return (RdsDataRowView) this.filledTxt.getValue(this, $$delegatedProperties[3]);
    }

    private final RdsDataRowView getFilledQuantityTxt() {
        return (RdsDataRowView) this.filledQuantityTxt.getValue(this, $$delegatedProperties[4]);
    }

    public final void bindLeg(UiOptionOrder order, int legIndex) {
        Intrinsics.checkNotNullParameter(order, "order");
        UiOptionOrderLeg uiOptionOrderLeg = order.getLegs().get(legIndex);
        Resources resources = getResources();
        TextView titleTxt = getTitleTxt();
        Intrinsics.checkNotNull(resources);
        titleTxt.setText(UiOptionOrders.getDetailLegTitleString(order, resources, legIndex));
        getSideTxt().setValueText(UiOptionOrders.getOrderTypeString(order, resources, legIndex));
        getEffectTxt().setValueText(UiOptionOrders.getEffectString(uiOptionOrderLeg, resources));
        boolean zHasExecutions = uiOptionOrderLeg.hasExecutions();
        getFilledTxt().setVisibility(zHasExecutions ? 0 : 8);
        getFilledQuantityTxt().setVisibility(zHasExecutions ? 0 : 8);
        if (uiOptionOrderLeg.hasExecutions()) {
            getFilledTxt().setValueText(InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) ((OptionOrderExecution) CollectionsKt.first((List) uiOptionOrderLeg.getExecutions())).getTimestamp()));
            getFilledQuantityTxt().setValueText(String.valueOf(uiOptionOrderLeg.filledQuantity()));
        }
    }

    /* compiled from: OptionOrderDetailLegView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailLegView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailLegView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionOrderDetailLegView> {
        private final /* synthetic */ Inflater<OptionOrderDetailLegView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionOrderDetailLegView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionOrderDetailLegView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C23086R.layout.include_option_order_detail_leg);
        }
    }
}
