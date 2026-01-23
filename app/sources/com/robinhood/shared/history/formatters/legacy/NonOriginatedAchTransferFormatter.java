package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.transfers.api.NonOriginatedAchTransferState;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/NonOriginatedAchTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction$NonOriginatedAch;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class NonOriginatedAchTransferFormatter extends AbstractMinervaTransactionFormatter<MinervaTransaction.NonOriginatedAch> {

    /* compiled from: NonOriginatedAchTransferFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonOriginatedAchTransferFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(MinervaTransaction.NonOriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(MinervaTransaction.NonOriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        NonOriginatedAchTransferState state = transaction.getEvent().getState();
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            return new TransactionSummary.Badge(getString(NonOriginatedAchTransferFormatter2.getLabelResId(state)), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.FALSE)) {
            return new TransactionSummary.Badge(getString(NonOriginatedAchTransferFormatter2.getLabelResId(state)), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.TRUE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MinervaTransaction.NonOriginatedAch transaction) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i3 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
        if (i3 == 1) {
            i = C41787R.string.minerva_transfer_description_noa_credit_with_receiver;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_noa_debit_with_receiver;
        }
        String label = transaction.getEvent().getLabel();
        String originatorName = transaction.getEvent().getOriginatorName();
        if (Intrinsics.areEqual(transaction.getEvent().isRedirected(), Boolean.TRUE)) {
            i2 = C39006R.string.payment_transfer_account_type_rhy;
        } else {
            i2 = C39006R.string.payment_transfer_account_type_individual;
        }
        return getString(i, label, originatorName, getString(i2));
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(MinervaTransaction.NonOriginatedAch transaction) {
        String badgeText;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        GoldDepositBoostTransferDetail goldDepositBoost = transaction.getEvent().getGoldDepositBoost();
        return (goldDepositBoost == null || (badgeText = goldDepositBoost.getBadgeText()) == null) ? super.getMetadataSecondaryText((NonOriginatedAchTransferFormatter) transaction) : badgeText;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(MinervaTransaction.NonOriginatedAch transaction) {
        ServerToBentoAssetMapper2 iconAsset;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        GoldDepositBoostTransferDetail goldDepositBoost = transaction.getEvent().getGoldDepositBoost();
        if ((goldDepositBoost != null ? goldDepositBoost.getBadgeText() : null) != null) {
            GoldDepositBoostTransferDetail goldDepositBoost2 = transaction.getEvent().getGoldDepositBoost();
            if (goldDepositBoost2 == null || (iconAsset = goldDepositBoost2.getIconAsset()) == null) {
                return null;
            }
            return new TransactionSummary.Icon(iconAsset, TransactionSummary.Tint.SOL_LIGHT);
        }
        return super.getMetadataSecondaryTextIcon((NonOriginatedAchTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(MinervaTransaction.NonOriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("NonOriginatedAchTransfers currently have their own history detail");
    }
}
