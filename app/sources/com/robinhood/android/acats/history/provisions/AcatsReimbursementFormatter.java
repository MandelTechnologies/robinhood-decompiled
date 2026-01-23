package com.robinhood.android.acats.history.provisions;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.shared.models.history.AcatsReimbursementTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsReimbursementFormatter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/acats/history/provisions/AcatsReimbursementFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/AcatsReimbursementTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsReimbursementFormatter extends AbstractMinervaTransactionFormatter<AcatsReimbursementTransaction> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsReimbursementFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(AcatsReimbursementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getTitle();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(AcatsReimbursementTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return CollectionsKt.emptyList();
    }
}
