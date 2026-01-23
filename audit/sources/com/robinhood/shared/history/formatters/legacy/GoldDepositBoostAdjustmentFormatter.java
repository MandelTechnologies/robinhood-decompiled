package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import android.text.Spanned;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.gold.hub.GoldDepositBoostHistoryDetailItem;
import com.robinhood.shared.models.history.GoldDepositBoostAdjustmentTransaction;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostAdjustmentFormatter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/GoldDepositBoostAdjustmentFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/GoldDepositBoostAdjustmentTransaction;", "resources", "Landroid/content/res/Resources;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Landroid/content/res/Resources;Lio/noties/markwon/Markwon;)V", "getPrimaryText", "", "transaction", "getAmountText", "hasCompletedExceptionally", "", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class GoldDepositBoostAdjustmentFormatter extends AbstractMinervaTransactionFormatter<GoldDepositBoostAdjustmentTransaction> {
    private final Markwon markwon;

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(GoldDepositBoostAdjustmentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldDepositBoostAdjustmentFormatter(Resources resources, Markwon markwon) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(GoldDepositBoostAdjustmentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getTitle();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getAmountText(GoldDepositBoostAdjustmentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getDescription();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(GoldDepositBoostAdjustmentTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        List<GoldDepositBoostHistoryDetailItem> details = transaction.getEvent().getDetails();
        ArrayList arrayList = null;
        if (details != null) {
            List<GoldDepositBoostHistoryDetailItem> list = details;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (GoldDepositBoostHistoryDetailItem goldDepositBoostHistoryDetailItem : list) {
                String title = goldDepositBoostHistoryDetailItem.getTitle();
                String value = goldDepositBoostHistoryDetailItem.getValue();
                String description = goldDepositBoostHistoryDetailItem.getDescription();
                Spanned markdown = description != null ? this.markwon.toMarkdown(description) : null;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(goldDepositBoostHistoryDetailItem.getValueIcon());
                arrayList2.add(new TransactionLineItem(title, value, markdown, null, false, null, serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null, TransactionSummary.Tint.SOL_LIGHT, 40, null));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
