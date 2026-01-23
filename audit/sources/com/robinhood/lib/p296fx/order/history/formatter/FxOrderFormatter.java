package com.robinhood.lib.p296fx.order.history.formatter;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.FxOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.OrderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FxOrderFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/lib/fx/order/history/formatter/FxOrderFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/FxOrderTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getAmountText", "getMetadataSecondaryText", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-fx-order-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class FxOrderFormatter extends AbstractMinervaTransactionFormatter<FxOrderTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((FxOrderTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxOrderFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(FxOrderTransaction transaction) {
        int i;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().getState().isPending()) {
            i = C33388R.string.fx_order_converting;
        } else {
            i = Intrinsics.areEqual(transaction.getEvent().getState().isSuccessful(), Boolean.TRUE) ? C33388R.string.fx_order_converted : C33388R.string.fx_order_convert;
        }
        return getString(C33388R.string.fx_order_primary_text, getString(i), transaction.getEvent().getFromCurrency().name(), transaction.getEvent().getToCurrency().name());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(FxOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getState() == OrderState.FILLED ? getString(C33388R.string.fx_order_to_currency, Money.format$default(transaction.getEvent().getAmountTo(), null, false, null, false, 2, 2, false, null, false, false, 975, null)) : getString(C33388R.string.fx_order_from_currency, Money.format$default(transaction.getEvent().getAmountFrom(), null, false, null, false, 2, 2, false, null, false, false, 975, null));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(FxOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().getState() == OrderState.FILLED) {
            return getString(C33388R.string.fx_order_from_currency, Money.format$default(transaction.getEvent().getAmountFrom(), null, false, null, false, 2, 2, false, null, false, false, 975, null));
        }
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(FxOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().getState() != OrderState.FILLED) {
            return new TransactionSummary.Badge(getString(OrderStates.getLabelResId(transaction.getEvent().getState())), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        return null;
    }

    public Void getLineItems(FxOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Fx order currently have their own history");
    }
}
