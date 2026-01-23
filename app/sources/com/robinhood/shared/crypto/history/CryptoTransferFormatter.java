package com.robinhood.shared.crypto.history;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryItem;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.shared.models.history.CryptoTransferTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferFormatter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/history/CryptoTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/CryptoTransferTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSecondaryText", "getAmountText", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferFormatter extends AbstractMinervaTransactionFormatter<CryptoTransferTransaction> {
    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((CryptoTransferTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getPrimaryText(CryptoTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getTitle();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getSecondaryText(CryptoTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getSubtitle();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getAmountText(CryptoTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getEvent().getAmountDisplayString();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public String getMetadataSecondaryText(CryptoTransferTransaction transaction) {
        String badgeText;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        GoldDepositBoostTransferDetail goldDepositBoost = transaction.getEvent().getGoldDepositBoost();
        return (goldDepositBoost == null || (badgeText = goldDepositBoost.getBadgeText()) == null) ? transaction.getEvent().getAmountSubtitle() : badgeText;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(CryptoTransferTransaction transaction) {
        GoldDepositBoostTransferDetail goldDepositBoost;
        ServerToBentoAssetMapper2 iconAsset;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        GoldDepositBoostTransferDetail goldDepositBoost2 = transaction.getEvent().getGoldDepositBoost();
        if ((goldDepositBoost2 != null ? goldDepositBoost2.getBadgeText() : null) != null && (goldDepositBoost = transaction.getEvent().getGoldDepositBoost()) != null && (iconAsset = goldDepositBoost.getIconAsset()) != null) {
            return new TransactionSummary.Icon(iconAsset, TransactionSummary.Tint.SOL_LIGHT);
        }
        return super.getMetadataSecondaryTextIcon((CryptoTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(CryptoTransferTransaction transaction) {
        TransactionSummary.Tint toTint;
        Color light;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String stateString = transaction.getEvent().getStateString();
        if (stateString == null) {
            return null;
        }
        ThemedColor stateColorOverride = transaction.getEvent().getStateColorOverride();
        if (stateColorOverride == null || (light = stateColorOverride.getLight()) == null || (toTint = Colors6.getToTint(light)) == null) {
            if (transaction.getEvent().getState() == ApiCryptoTransferHistoryItem.State.ABNORMAL) {
                toTint = TransactionSummary.Tint.NEGATIVE;
            } else {
                toTint = TransactionSummary.Tint.FOREGROUND_2;
            }
        }
        return new TransactionSummary.Badge(stateString, toTint, false, 4, null);
    }

    public Void getLineItems(CryptoTransferTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Crypto transfers currently have their own history detail");
    }
}
