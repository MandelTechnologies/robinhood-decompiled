package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.models.gold.hub.GoldDepositBoostHistoryDetailItem;
import com.robinhood.shared.models.history.GoldDepositBoostPayoutTransaction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostPayoutFormatter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostPayoutFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/GoldDepositBoostPayoutTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "hasCompletedExceptionally", "", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class GoldDepositBoostPayoutFormatter extends AbstractMinervaTransactionFormatter<GoldDepositBoostPayoutTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(GoldDepositBoostPayoutTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldDepositBoostPayoutFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(GoldDepositBoostPayoutTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String title = transaction.getEvent().getTitle();
        return title != null ? title : "";
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(GoldDepositBoostPayoutTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        ArrayList arrayList = new ArrayList();
        List<GoldDepositBoostHistoryDetailItem> details = transaction.getEvent().getDetails();
        if (details != null) {
            for (GoldDepositBoostHistoryDetailItem goldDepositBoostHistoryDetailItem : details) {
                arrayList.add(new TransactionLineItem(goldDepositBoostHistoryDetailItem.getTitle(), goldDepositBoostHistoryDetailItem.getValue(), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null));
            }
        }
        return arrayList;
    }
}
