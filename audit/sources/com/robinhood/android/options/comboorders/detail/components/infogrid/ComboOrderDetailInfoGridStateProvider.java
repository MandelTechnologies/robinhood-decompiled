package com.robinhood.android.options.comboorders.detail.components.infogrid;

import android.content.res.Resources;
import com.robinhood.android.common.options.StringHelper;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.combo.p206db.ComboOrderSalesTax;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrderLeg;
import com.robinhood.android.options.comboorders.detail.extensions.UiComboOrders;
import com.robinhood.android.options.historydetail.C23150R;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: ComboOrderDetailInfoGridStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J8\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getGridItems", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailGridItemViewState;", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "withholdingAmount", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "shouldShowCatFeeNewCopy", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ComboOrderDetailInfoGridStateProvider implements StateProvider<ComboOrderDetailInfoGridDataState, ComboOrderDetailInfoGridViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public ComboOrderDetailInfoGridStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public ComboOrderDetailInfoGridViewState reduce(ComboOrderDetailInfoGridDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getUiComboOrder() == null || dataState.getUserLocale() == null) {
            return new ComboOrderDetailInfoGridViewState(extensions2.persistentListOf(), false);
        }
        return new ComboOrderDetailInfoGridViewState(getGridItems(this.resources, dataState.getUiComboOrder(), dataState.getWithholdingAmountResponse(), dataState.getShouldShowCatFeeNewCopy(), dataState.getUserLocale()), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImmutableList3<ComboOrderDetailInfoGridViewState2> getGridItems(Resources resources, UiComboOrder uiComboOrder, WithholdingAmount withholdingAmount, boolean shouldShowCatFeeNewCopy, CountryCode.Supported userLocale) throws Resources.NotFoundException {
        String estCostOrCreditLabelString;
        String string2;
        BigDecimal contractFees;
        BigDecimal goldSavings;
        ArrayList arrayList = new ArrayList();
        if (uiComboOrder.getHasSingleOptionLeg()) {
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState4 = ComboOrderDetailInfoGridViewState4.TYPE;
            String string3 = resources.getString(C23150R.string.option_order_detail_side);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState4, string3, UiComboOrders.getOrderTypeString(uiComboOrder, resources)));
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState42 = ComboOrderDetailInfoGridViewState4.POSITION_EFFECT;
            String string4 = resources.getString(C23150R.string.option_order_detail_position_effect);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState42, string4, UiComboOrders.getPositionEffectString(uiComboOrder, resources)));
        }
        ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState43 = ComboOrderDetailInfoGridViewState4.TIME_IN_FORCE;
        String string5 = resources.getString(C23150R.string.option_order_detail_time_in_force);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState43, string5, UiComboOrders.getTimeInForceString(uiComboOrder, resources)));
        ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState44 = ComboOrderDetailInfoGridViewState4.SUBMITTED_DATETIME;
        String string6 = resources.getString(C23150R.string.option_order_detail_submitted);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        Instant createdAt = uiComboOrder.getComboOrder().getCreatedAt();
        InstantFormatter instantFormatter = InstantFormatter.LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE;
        arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState44, string6, instantFormatter.format((InstantFormatter) createdAt)));
        BigDecimal totalExecutionPrice = uiComboOrder.getTotalExecutionPrice();
        BigDecimal processedQuantity = uiComboOrder.getComboOrder().getProcessedQuantity();
        if (uiComboOrder.getComboOrder().getPrice() != null) {
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState45 = ComboOrderDetailInfoGridViewState4.LIMIT_PRICE;
            String string7 = resources.getString(C23150R.string.option_order_detail_limit_price);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState45, string7, UiComboOrders.getOrderPriceString(uiComboOrder, resources, uiComboOrder.getComboOrder().getPrice())));
        }
        if (BigDecimals7.isPositive(processedQuantity)) {
            Instant latestExecution = uiComboOrder.getLatestExecution();
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState46 = ComboOrderDetailInfoGridViewState4.FILLED_DATETIME;
            String string8 = resources.getString(C23150R.string.option_order_detail_filled_date);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String str = latestExecution != null ? instantFormatter.format((InstantFormatter) latestExecution) : null;
            if (str == null) {
                str = "";
            }
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState46, string8, str));
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState47 = ComboOrderDetailInfoGridViewState4.FILLED_QUANTITY;
            String string9 = resources.getString(C23150R.string.option_order_detail_filled_quantity);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            String string10 = resources.getString(C23150R.string.option_order_detail_filled_quantity_value, Formats.getIntegerFormat().format(processedQuantity), Formats.getPriceFormat().format(BigDecimals7.safeDivide(totalExecutionPrice, processedQuantity)));
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState47, string9, string10));
        }
        BigDecimal stopPrice = uiComboOrder.getComboOrder().getStopPrice();
        if (stopPrice != null) {
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState48 = ComboOrderDetailInfoGridViewState4.STOP_TRIGGER_PRICE;
            String string11 = resources.getString(C23150R.string.option_order_detail_stop_price);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState48, string11, Formats.getPriceFormat().format(stopPrice)));
        }
        ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState49 = ComboOrderDetailInfoGridViewState4.QUANTITY;
        String string12 = resources.getString(C23150R.string.option_order_detail_quantity_label);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState49, string12, String.valueOf(uiComboOrder.getComboOrder().getQuantity().intValue())));
        String backupWithholdingAmountString = withholdingAmount != null ? WithholdingAmount2.getBackupWithholdingAmountString(withholdingAmount) : null;
        if (backupWithholdingAmountString != null) {
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState410 = ComboOrderDetailInfoGridViewState4.BACKUP_WITHHOLDING;
            String string13 = resources.getString(C23150R.string.option_order_detail_backup_withholding);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState410, string13, backupWithholdingAmountString));
        }
        BigDecimal netCreditAmount = withholdingAmount != null ? WithholdingAmount2.getNetCreditAmount(withholdingAmount, uiComboOrder.getComboOrder().getProcessedPremium()) : null;
        if (netCreditAmount != null) {
            ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState411 = ComboOrderDetailInfoGridViewState4.NET_CREDIT;
            String string14 = resources.getString(C23150R.string.option_order_detail_net_credit);
            Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
            arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState411, string14, Formats.getPriceFormat().format(netCreditAmount)));
        }
        if (uiComboOrder.getComboOrder().getDerivedState().hasExecutions()) {
            if (!uiComboOrder.getComboOrder().getDerivedState().isFinal()) {
                estCostOrCreditLabelString = StringHelper.getEstCostOrCreditLabelString(resources, uiComboOrder.getComboOrder().getNetAmountDirection());
                arrayList.add(new DefaultGridItem(ComboOrderDetailInfoGridViewState4.COST_CREDIT, estCostOrCreditLabelString, Formats.getPriceFormat().format(uiComboOrder.getComboOrder().getNetAmount())));
                ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState412 = ComboOrderDetailInfoGridViewState4.REGULATORY_FEE;
                if (!shouldShowCatFeeNewCopy) {
                }
                Intrinsics.checkNotNull(string2);
                arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState412, string2, Formats.getPriceFormat().format(uiComboOrder.getComboOrder().getRegulatoryFees())));
                contractFees = uiComboOrder.getComboOrder().getContractFees();
                if (contractFees != null) {
                    ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState413 = ComboOrderDetailInfoGridViewState4.CONTRACT_FEE;
                    String string15 = resources.getString(C23150R.string.option_order_detail_contract_fee);
                    Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                    arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState413, string15, Formats.getPriceFormat().format(contractFees)));
                }
                while (r1.hasNext()) {
                }
                goldSavings = uiComboOrder.getComboOrder().getGoldSavings();
                if (goldSavings != null) {
                    ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState414 = ComboOrderDetailInfoGridViewState4.GOLD_SAVINGS;
                    String string16 = resources.getString(C23150R.string.gated_gold_option_order_detail_gold_savings);
                    Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                    arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState414, string16, Formats.getPriceFormat().format(goldSavings)));
                }
            } else {
                List<UiComboOrderLeg> legs = uiComboOrder.getLegs();
                if (!(legs instanceof Collection) || !legs.isEmpty()) {
                    Iterator<T> it = legs.iterator();
                    while (it.hasNext()) {
                        if (((UiComboOrderLeg) it.next()).getLeg().getSide() == OrderSide.SELL) {
                            estCostOrCreditLabelString = StringHelper.getEstCostOrCreditLabelString(resources, uiComboOrder.getComboOrder().getNetAmountDirection());
                            break;
                        }
                    }
                }
                estCostOrCreditLabelString = StringHelper.getTotalCostCreditLabelString(resources, uiComboOrder.getComboOrder().getNetAmountDirection());
                arrayList.add(new DefaultGridItem(ComboOrderDetailInfoGridViewState4.COST_CREDIT, estCostOrCreditLabelString, Formats.getPriceFormat().format(uiComboOrder.getComboOrder().getNetAmount())));
                ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState4122 = ComboOrderDetailInfoGridViewState4.REGULATORY_FEE;
                if (!shouldShowCatFeeNewCopy) {
                    string2 = resources.getString(C23150R.string.option_order_detail_est_regulatory_fees_label);
                } else {
                    string2 = resources.getString(C23150R.string.option_order_detail_regulatory_fees_label);
                }
                Intrinsics.checkNotNull(string2);
                arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState4122, string2, Formats.getPriceFormat().format(uiComboOrder.getComboOrder().getRegulatoryFees())));
                contractFees = uiComboOrder.getComboOrder().getContractFees();
                if (contractFees != null && (contractFees.compareTo(BigDecimal.ZERO) > 0 || Intrinsics.areEqual(userLocale, CountryCode.Supported.UnitedKingdom.INSTANCE))) {
                    ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState4132 = ComboOrderDetailInfoGridViewState4.CONTRACT_FEE;
                    String string152 = resources.getString(C23150R.string.option_order_detail_contract_fee);
                    Intrinsics.checkNotNullExpressionValue(string152, "getString(...)");
                    arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState4132, string152, Formats.getPriceFormat().format(contractFees)));
                }
                for (ComboOrderSalesTax comboOrderSalesTax : uiComboOrder.getSalesTax()) {
                    if (comboOrderSalesTax.getFee().compareTo(BigDecimal.ZERO) >= 0) {
                        arrayList.add(new DefaultGridItem(ComboOrderDetailInfoGridViewState4.SALES_TAX, comboOrderSalesTax.getDisplayName(), Formats.getPriceFormat().format(comboOrderSalesTax.getFee())));
                    }
                }
                goldSavings = uiComboOrder.getComboOrder().getGoldSavings();
                if (goldSavings != null && goldSavings.compareTo(BigDecimal.ZERO) > 0) {
                    ComboOrderDetailInfoGridViewState4 comboOrderDetailInfoGridViewState4142 = ComboOrderDetailInfoGridViewState4.GOLD_SAVINGS;
                    String string162 = resources.getString(C23150R.string.gated_gold_option_order_detail_gold_savings);
                    Intrinsics.checkNotNullExpressionValue(string162, "getString(...)");
                    arrayList.add(new DefaultGridItem(comboOrderDetailInfoGridViewState4142, string162, Formats.getPriceFormat().format(goldSavings)));
                }
            }
        }
        return extensions2.toPersistentList(arrayList);
    }
}
