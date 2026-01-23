package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualSettlement;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiPerpetualSettlementValues.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m3636d2 = {"historyRowLabelText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualSettlement;", "getHistoryRowLabelText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualSettlement;)Lcom/robinhood/utils/resource/StringResource;", "historyRowValueText", "", "getHistoryRowValueText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualSettlement;)Ljava/lang/String;", "historyRowSecondaryValueText", "getHistoryRowSecondaryValueText", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.UiPerpetualSettlementValuesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiPerpetualSettlementValues {
    public static final StringResource getHistoryRowLabelText(UiPerpetualSettlement uiPerpetualSettlement) {
        String symbol;
        Intrinsics.checkNotNullParameter(uiPerpetualSettlement, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C33018R.string.order_settlement_history_row_label_text;
        PerpetualContract perpetualContract = uiPerpetualSettlement.getPerpetualContract();
        if (perpetualContract == null || (symbol = perpetualContract.getSymbol()) == null) {
            symbol = "";
        }
        return companion.invoke(i, symbol);
    }

    public static final String getHistoryRowValueText(UiPerpetualSettlement uiPerpetualSettlement) {
        Intrinsics.checkNotNullParameter(uiPerpetualSettlement, "<this>");
        PerpetualMoney amountSettled = uiPerpetualSettlement.getSettlement().getAmountSettled();
        return CurrencyDefinitions.formatCurrency$default(amountSettled.getCurrency(), amountSettled.getAmount(), false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(amountSettled.getCurrency()), null, Boolean.TRUE, true, true, false, false, 1578, null);
    }

    public static final StringResource getHistoryRowSecondaryValueText(UiPerpetualSettlement uiPerpetualSettlement) {
        Intrinsics.checkNotNullParameter(uiPerpetualSettlement, "<this>");
        return PerpetualDisplayNames.getShortDisplayName(uiPerpetualSettlement.getSettlement().getMarginMode());
    }
}
