package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState;
import com.robinhood.shared.models.history.shared.OrderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowsForTokenizedStocks.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"createRowsForTokenizedStocks", "", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState$CryptoOrderConfirmationRowType;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.RowsForTokenizedStocksKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RowsForTokenizedStocks {
    public static final List<BaseCryptoConfirmationState.CryptoOrderConfirmationRowType> createRowsForTokenizedStocks(UiCryptoOrder uiCryptoOrder) {
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
        if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.CANCELED || uiCryptoOrder.getCryptoOrder().getState() == OrderState.FAILED) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.QUANTITY_FSM);
        if (uiCryptoOrder.getCryptoOrder().getType() == CryptoOrderType.LIMIT) {
            listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE_FSM);
        } else {
            listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_PRICE_FSM);
        }
        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FX_FEE_FSM);
        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.TOTAL_COST_FSM);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
