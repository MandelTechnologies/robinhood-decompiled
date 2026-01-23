package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.util.Money;
import com.robinhood.shared.history.formatters.legacy.transfers.CancelSummaryBadgeManager;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.history.C41787R;
import com.robinhood.utils.Either2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OriginatedAchTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/OriginatedAchTransferFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction$OriginatedAch;", "cancelSummaryBadgeManager", "Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;", "resources", "Landroid/content/res/Resources;", "<init>", "(Lcom/robinhood/shared/history/formatters/legacy/transfers/CancelSummaryBadgeManager;Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getMetadataSecondaryTextIcon", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Icon;", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OriginatedAchTransferFormatter extends AbstractMinervaTransactionFormatter<MinervaTransaction.OriginatedAch> {
    private final CancelSummaryBadgeManager cancelSummaryBadgeManager;

    /* compiled from: OriginatedAchTransferFormatter.kt */
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

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((MinervaTransaction.OriginatedAch) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginatedAchTransferFormatter(CancelSummaryBadgeManager cancelSummaryBadgeManager, Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(cancelSummaryBadgeManager, "cancelSummaryBadgeManager");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.cancelSummaryBadgeManager = cancelSummaryBadgeManager;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(MinervaTransaction.OriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return Intrinsics.areEqual(transaction.getEvent().getState().getIsSuccessful(), Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(MinervaTransaction.OriginatedAch transaction) throws Resources.NotFoundException {
        TransactionSummary.Tint tint;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (this.cancelSummaryBadgeManager.shouldShowCancelSummaryBadge(Either2.asLeft(transaction.getEvent()))) {
            return new TransactionSummary.Badge(getString(C11048R.string.general_label_cancel), TransactionSummary.Tint.NEGATIVE, true);
        }
        AchTransferState state = transaction.getEvent().getState();
        Boolean isSuccessful = state.getIsSuccessful();
        if (isSuccessful == null) {
            String string2 = getString(OriginatedAchTransferFormatter2.getLabelResId(transaction.getEvent()));
            if (transaction.getEvent().getRhsState() == AchTransferRhsState.PENDING_CONFIRMATION) {
                tint = TransactionSummary.Tint.NEGATIVE;
            } else {
                tint = TransactionSummary.Tint.FOREGROUND_2;
            }
            return new TransactionSummary.Badge(string2, tint, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.FALSE)) {
            return new TransactionSummary.Badge(getString(OriginatedAchTransferFormatter2.getLabelResId(state)), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (Intrinsics.areEqual(isSuccessful, Boolean.TRUE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MinervaTransaction.OriginatedAch transaction) throws Resources.NotFoundException {
        int i;
        CharSequence string2;
        DisplayName displayName;
        DisplayName.Variants variants;
        StringResource inSentence;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String displayTitle = AchRelationships.getDisplayTitle(transaction.getRelationship(), getResources());
        int i2 = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getAdjustment().getDirection().ordinal()];
        if (i2 == 1) {
            i = C41787R.string.minerva_transfer_description_deposit_from_with_originator;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C41787R.string.minerva_transfer_description_withdrawal_to_with_originator;
        }
        Account originatingAccount = transaction.getOriginatingAccount();
        if (originatingAccount == null || (displayName = AccountDisplayNames.getDisplayName(originatingAccount)) == null || (variants = displayName.getShort()) == null || (inSentence = variants.getInSentence()) == null || (string2 = inSentence.getText(getResources())) == null) {
            string2 = getString(C39006R.string.payment_transfer_account_type_individual);
        }
        return getString(i, displayTitle, string2);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(MinervaTransaction.OriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        GoldDepositBoostTransferDetail goldDepositBoost = transaction.getEvent().getGoldDepositBoost();
        String badgeText = goldDepositBoost != null ? goldDepositBoost.getBadgeText() : null;
        Money clawbackAmount = transaction.getEvent().getClawbackAmount();
        if (badgeText != null) {
            return badgeText;
        }
        if (clawbackAmount != null) {
            String str = Money.format$default(clawbackAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            if (Intrinsics.areEqual(clawbackAmount.getDecimalValue(), BigDecimal.ZERO)) {
                return str;
            }
            return "-" + str;
        }
        return super.getMetadataSecondaryText((OriginatedAchTransferFormatter) transaction);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Icon getMetadataSecondaryTextIcon(MinervaTransaction.OriginatedAch transaction) {
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
        return super.getMetadataSecondaryTextIcon((OriginatedAchTransferFormatter) transaction);
    }

    public Void getLineItems(MinervaTransaction.OriginatedAch transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("OriginatedAchTransfers currently have their own history detail");
    }
}
