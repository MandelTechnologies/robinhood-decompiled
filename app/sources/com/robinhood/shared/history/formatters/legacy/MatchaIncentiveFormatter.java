package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.shared.models.history.MatchaIncentiveTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveFormatter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/MatchaIncentiveFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MatchaIncentiveTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MatchaIncentiveFormatter extends AbstractMinervaTransactionFormatter<MatchaIncentiveTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((MatchaIncentiveTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaIncentiveFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MatchaIncentiveTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return getString(C39006R.string.matcha_incentive_history_title);
    }

    public Void getLineItems(MatchaIncentiveTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Matcha incentives have their own history detail page");
    }
}
