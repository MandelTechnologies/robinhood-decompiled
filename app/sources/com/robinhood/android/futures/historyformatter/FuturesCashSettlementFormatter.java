package com.robinhood.android.futures.historyformatter;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct5;
import com.robinhood.shared.models.history.FuturesCashSettlementTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesCashSettlementFormatter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/historyformatter/FuturesCashSettlementFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/FuturesCashSettlementTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getLineItems", "", "lib-futures-history-formatter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class FuturesCashSettlementFormatter extends AbstractMinervaTransactionFormatter<FuturesCashSettlementTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(FuturesCashSettlementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(FuturesCashSettlementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return false;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((FuturesCashSettlementTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesCashSettlementFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(FuturesCashSettlementTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String string2 = getResources().getString(C17283R.string.futures_execution_history_title, transaction.getContract().getContract().getDisplaySymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(FuturesCashSettlementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getResources().getString(C17283R.string.futures_execution_history_subtitle_metadata, Formats.getIntegerDeltaFormat().format(transaction.getEvent().getQuantity()), FuturesProduct5.format$default(transaction.getContract().getProduct(), transaction.getEvent().getPricePerContract(), null, 2, null));
    }

    public Void getLineItems(FuturesCashSettlementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("FuturesCashCorrections currently have their own history detail");
    }
}
