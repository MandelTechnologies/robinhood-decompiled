package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.models.acats.p299db.LegacyAcatsTransfers;
import com.robinhood.shared.models.history.LegacyAcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyAcatsFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/LegacyAcatsFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/LegacyAcatsTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getPrimaryText", "", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LegacyAcatsFormatter extends AbstractMinervaTransactionFormatter<LegacyAcatsTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((LegacyAcatsTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAcatsFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(LegacyAcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(LegacyAcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return LegacyAcatsTransfers.getHistoryRowTitle(transaction.getEvent(), getResources());
    }

    public Void getLineItems(LegacyAcatsTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Acats transfers currently have their own history detail");
    }
}
