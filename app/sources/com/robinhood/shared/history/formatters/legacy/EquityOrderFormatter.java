package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Order;
import com.robinhood.shared.history.order.Orders3;
import com.robinhood.shared.models.history.EquityOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderFormatter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/EquityOrderFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/EquityOrderTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getLineItems", "", "getAmountText", "getMetadataSecondaryText", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EquityOrderFormatter extends AbstractMinervaTransactionFormatter<EquityOrderTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((EquityOrderTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().isSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Order event = transaction.getEvent();
        if (event.isCancelledIpoAccessNoAllocation() || event.isIpoAccessPartialAllocation()) {
            return new TransactionSummary.Badge(Orders3.getOrderStateString$default(event, false, 1, null).getText(getResources()), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        EquityOrderState state = transaction.getEvent().getState();
        if (state.isSuccessful() == null || state.isCancelled()) {
            return new TransactionSummary.Badge(Orders3.getOrderStateString$default(transaction.getEvent(), false, 1, null).getText(getResources()), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (Intrinsics.areEqual(state.isSuccessful(), Boolean.FALSE)) {
            return new TransactionSummary.Badge(Orders3.getOrderStateString$default(transaction.getEvent(), false, 1, null).getText(getResources()), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Orders3.getOrderDisplayStringWithSymbol(transaction.getEvent(), transaction.getInstrument().getSymbol()).getText(getResources());
    }

    public Void getLineItems(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Orders currently have their own history detail");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (!transaction.getEvent().isSuccess()) {
            return "";
        }
        return super.getAmountText((EquityOrderFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(EquityOrderTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().isSuccess()) {
            return Orders3.getFilledDescription(transaction.getEvent(), getResources());
        }
        return null;
    }
}
