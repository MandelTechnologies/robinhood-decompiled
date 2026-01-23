package com.robinhood.android.equities.historyformatter;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.shared.models.history.BorrowChargeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeFormatter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equities/historyformatter/BorrowChargeFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/BorrowChargeTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getSecondaryText", "", "transaction", "getPrimaryText", "getLineItems", "", "lib-equity-history-formatters_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BorrowChargeFormatter extends AbstractMinervaTransactionFormatter<BorrowChargeTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((BorrowChargeTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowChargeFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(BorrowChargeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return InstantFormatter.DATE_NO_YEAR_IN_UTC.format(transaction.getEvent().getBillingEndDate());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(BorrowChargeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getString(C14725R.string.borrow_fee);
    }

    public Void getLineItems(BorrowChargeTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Borrow charge currently have their own history");
    }
}
