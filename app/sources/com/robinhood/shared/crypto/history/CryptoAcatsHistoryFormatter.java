package com.robinhood.shared.crypto.history;

import android.content.res.Resources;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.MigrationStateDto;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.shared.models.history.CryptoAcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.text.Capitalization;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: CryptoAcatsHistoryFormatter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/CryptoAcatsHistoryFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/CryptoAcatsTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryFormatter extends AbstractMinervaTransactionFormatter<CryptoAcatsTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((CryptoAcatsTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAcatsHistoryFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(CryptoAcatsTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String string2 = getResources().getString(C37690R.string.crypto_acats_history_row_primary_text, Capitalization.capitalizeFirstChar$default(transaction.getEvent().getData().getPartner(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getSecondaryText(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Instant initiatedAt = historyEvent.getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return LocalDateFormatter.MEDIUM.format((LocalDateFormatter) Instants.toLocalDate(initiatedAt, zoneIdSystemDefault));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(CryptoAcatsTransaction transaction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().getState() == MigrationStateDto.MIGRATION_STATE_FAILED) {
            String string2 = getResources().getString(C37690R.string.crypto_acats_history_row_badge_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new TransactionSummary.Badge(string2, TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (transaction.getEvent().getHistoryState() != HistoryEvent.State.PENDING) {
            return null;
        }
        String string3 = getResources().getString(C37690R.string.crypto_acats_history_row_badge_pending);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new TransactionSummary.Badge(string3, TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
    }

    public Void getLineItems(CryptoAcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Crypto ACATS transfers have their own history detail");
    }
}
