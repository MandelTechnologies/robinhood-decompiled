package com.robinhood.android.options.statistics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.statistics.databinding.MergeOptionStrategyStatisticsViewBinding;
import com.robinhood.models.Decimals4;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OrderSide;
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

/* compiled from: OptionStrategyStatisticsView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u000fR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStrategyStatisticsView;", "Landroidx/gridlayout/widget/GridLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/options/statistics/databinding/MergeOptionStrategyStatisticsViewBinding;", "getBindings", "()Lcom/robinhood/android/options/statistics/databinding/MergeOptionStrategyStatisticsViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "disableChanceOfProfit", "Companion", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyStatisticsView extends GridLayout {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyStatisticsView.class, "bindings", "getBindings()Lcom/robinhood/android/options/statistics/databinding/MergeOptionStrategyStatisticsViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyStatisticsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C23799R.layout.merge_option_strategy_statistics_view, true);
        setColumnCount(3);
        this.bindings = ViewBinding5.viewBinding(this, OptionStrategyStatisticsView2.INSTANCE);
    }

    public /* synthetic */ OptionStrategyStatisticsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final MergeOptionStrategyStatisticsViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionStrategyStatisticsViewBinding) value;
    }

    public final void bind(OptionInstrumentQuote state, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        MergeOptionStrategyStatisticsViewBinding bindings = getBindings();
        bindings.markRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPriceFormat(), state.getMarkPrice(), null, 2, null));
        RdsDataRowView rdsDataRowView = bindings.lastTradeRow;
        NumberFormatter priceFormat = Formats.getPriceFormat();
        Decimals4 lastTradePrice = state.getLastTradePrice();
        rdsDataRowView.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(priceFormat, lastTradePrice != null ? lastTradePrice.getUnsignedValue() : null, null, 2, null));
        bindings.impliedVolatilityRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentFormat(), state.getImpliedVolatility(), null, 2, null));
        bindings.changeOfProfitRow.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(Formats.getPercentFormat(), state.getChanceOfProfit(orderSide), null, 2, null));
        bindings.volumeRow.setValueText(Formats.getIntegerFormat().format(state.getVolume()));
        bindings.openInterestRow.setValueText(Formats.getIntegerFormat().format(state.getOpenInterest()));
        bindings.previousCloseRow.setValueText(Formats.getPriceFormat().format(state.getPreviousClosePrice().getUnsignedValue()));
        RdsDataRowView rdsDataRowView2 = bindings.dailyHighRow;
        NumberFormatter priceFormat2 = Formats.getPriceFormat();
        Decimals4 highPrice = state.getHighPrice();
        rdsDataRowView2.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(priceFormat2, highPrice != null ? highPrice.getUnsignedValue() : null, null, 2, null));
        RdsDataRowView rdsDataRowView3 = bindings.dailyLowRow;
        NumberFormatter priceFormat3 = Formats.getPriceFormat();
        Decimals4 lowPrice = state.getLowPrice();
        rdsDataRowView3.setValueText(NumberFormatter.DefaultImpls.formatNullable$default(priceFormat3, lowPrice != null ? lowPrice.getUnsignedValue() : null, null, 2, null));
    }

    public final void disableChanceOfProfit() {
        removeViewAt(indexOfChild(getBindings().changeOfProfitRow));
    }

    /* compiled from: OptionStrategyStatisticsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStrategyStatisticsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/options/statistics/OptionStrategyStatisticsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionStrategyStatisticsView> {
        private final /* synthetic */ Inflater<OptionStrategyStatisticsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionStrategyStatisticsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionStrategyStatisticsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C23799R.layout.include_option_strategy_statistics_view);
        }
    }
}
