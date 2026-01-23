package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.api.minerva.ApiCheckPaymentDetails;
import com.robinhood.models.p320db.mcduckling.CheckPaymentDetails;
import com.robinhood.shared.models.history.CheckPaymentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CheckPaymentTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/CheckPaymentTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/CheckPaymentTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CheckPaymentTransactionFormatter extends AbstractMinervaTransactionFormatter<CheckPaymentTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((CheckPaymentTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPaymentTransactionFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(CheckPaymentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getString(C39006R.string.check_payment_history_row_primary_text, transaction.getCheckPaymentDetails().getCheckPayee().getName());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(CheckPaymentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return InstantFormatter.DATE_NO_YEAR_IN_SYSTEM_ZONE.format((InstantFormatter) transaction.getEvent().getInitiatedAt());
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(CheckPaymentTransaction transaction) {
        TransactionSummary.Tint tint;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CheckPaymentDetails checkPayment = transaction.getCheckPaymentDetails().getCheckPayment();
        if (checkPayment.getState() == ApiCheckPaymentDetails.State.COMPLETED || checkPayment.getState() == ApiCheckPaymentDetails.State.FORCE_CASHED) {
            return null;
        }
        String status = checkPayment.getStatus();
        if (checkPayment.isNegative()) {
            tint = TransactionSummary.Tint.NEGATIVE;
        } else {
            tint = TransactionSummary.Tint.FOREGROUND_2;
        }
        return new TransactionSummary.Badge(status, tint, false, 4, null);
    }

    public Void getLineItems(CheckPaymentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Check details has its own history screen");
    }
}
