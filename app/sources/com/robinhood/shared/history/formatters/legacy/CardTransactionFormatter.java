package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionLineItem;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.minerva.ApiCardTransactions;
import com.robinhood.models.api.minerva.ApiRoundupCardReward;
import com.robinhood.models.p320db.mcduckling.CardReward2;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.DeclinedCardTransaction;
import com.robinhood.models.p320db.mcduckling.Merchant;
import com.robinhood.models.p320db.mcduckling.PendingCardTransaction;
import com.robinhood.models.p320db.mcduckling.RoundupCardReward;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p320db.mcduckling.p321ui.UiMerchant;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardTransactionFormatter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/CardTransactionFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/MinervaTransaction$FromCard;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "hasCompletedExceptionally", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getPrimaryText", "", "getMetadataSecondaryText", "getStateDescription", "Lcom/robinhood/models/db/mcduckling/CardTransaction;", "getLineItems", "", "Lcom/robinhood/android/common/history/ui/format/TransactionLineItem;", "getMerchantName", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CardTransactionFormatter extends AbstractMinervaTransactionFormatter<MinervaTransaction.FromCard> {

    /* compiled from: CardTransactionFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRoundupCardReward.State.values().length];
            try {
                iArr[ApiRoundupCardReward.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRoundupCardReward.State.HELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRoundupCardReward.State.ROUNDED_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiRoundupCardReward.State.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiRoundupCardReward.State.RESTORED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiRoundupCardReward.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public boolean hasCompletedExceptionally(MinervaTransaction.FromCard transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CardTransaction event = transaction.getEvent();
        if (event instanceof DeclinedCardTransaction) {
            return true;
        }
        if ((event instanceof PendingCardTransaction) || (event instanceof SettledCardTransaction)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(MinervaTransaction.FromCard transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CardTransaction event = transaction.getEvent();
        if (event instanceof PendingCardTransaction) {
            return new TransactionSummary.Badge(getString(C39006R.string.transaction_badge_pending), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (event instanceof DeclinedCardTransaction) {
            return new TransactionSummary.Badge(getString(C39006R.string.transaction_badge_declined), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (!(event instanceof SettledCardTransaction)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((SettledCardTransaction) event).getHasDisputes()) {
            return new TransactionSummary.Badge(getString(C39006R.string.transaction_badge_disputed), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        return null;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(MinervaTransaction.FromCard transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return transaction.getDescription();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMetadataSecondaryText(MinervaTransaction.FromCard transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if ((transaction.getEvent() instanceof SettledCardTransaction) || (transaction.getEvent() instanceof PendingCardTransaction)) {
            RoundupCardReward roundupReward = CardReward2.getRoundupReward(transaction.getRewards());
            if ((roundupReward != null ? roundupReward.getRoundupAmount() : null) != null) {
                int i = C39006R.string.card_transaction_roundup_reward_state_round_up;
                RoundupCardReward roundupReward2 = CardReward2.getRoundupReward(transaction.getRewards());
                Money roundupAmount = roundupReward2 != null ? roundupReward2.getRoundupAmount() : null;
                Intrinsics.checkNotNull(roundupAmount);
                return getString(i, Money.format$default(roundupAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
            }
        }
        return null;
    }

    private final CharSequence getStateDescription(CardTransaction transaction) {
        if ((transaction instanceof PendingCardTransaction) || (transaction instanceof SettledCardTransaction)) {
            return null;
        }
        if (transaction instanceof DeclinedCardTransaction) {
            return ((DeclinedCardTransaction) transaction).getDeclineReasonDetail();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems, reason: merged with bridge method [inline-methods] */
    public List<TransactionLineItem> mo25632getLineItems(MinervaTransaction.FromCard transaction) throws Resources.NotFoundException {
        Money availableBalance;
        String str;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        CardTransaction event = transaction.getEvent();
        CharSequence stateDescription = getStateDescription(event);
        List<TransactionLineItem> listMutableListOf = CollectionsKt.mutableListOf(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_state), getString(CardTransactionFormatter2.getLabelResId(event.getStatus())), stateDescription, null, transaction.getEvent().getStatus() == CardTransaction.Status.DECLINED, stateDescription != null ? new TransactionLineItem.DialogContent(getString(CardTransactionFormatter2.getLabelResId(event.getStatus())), stateDescription, null, 4, null) : null, null, null, 200, null));
        RoundupCardReward roundupReward = CardReward2.getRoundupReward(transaction.getRewards());
        if (roundupReward != null) {
            List<TransactionLineItem> list = listMutableListOf;
            String string4 = getString(C39006R.string.transaction_line_item_title_roundup);
            switch (WhenMappings.$EnumSwitchMapping$0[roundupReward.getState().ordinal()]) {
                case 1:
                    Money roundupAmount = roundupReward.getRoundupAmount();
                    if (roundupAmount == null || (string2 = Money.format$default(roundupAmount, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
                        string2 = getString(C39006R.string.card_transaction_roundup_reward_state_pending);
                        break;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    Money roundupAmount2 = roundupReward.getRoundupAmount();
                    Intrinsics.checkNotNull(roundupAmount2);
                    string2 = Money.format$default(roundupAmount2, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                    break;
                case 5:
                    string2 = getString(C39006R.string.card_transaction_roundup_reward_state_restored);
                    break;
                case 6:
                    string2 = getString(C39006R.string.card_transaction_roundup_reward_state_failed);
                    break;
                default:
                    string2 = getString(C39006R.string.card_transaction_roundup_reward_state_unknown);
                    break;
            }
            String str2 = string2;
            Integer numValueOf = Integer.valueOf(C20690R.drawable.ic_rds_question_16dp);
            String string5 = getString(C39006R.string.card_transaction_roundup_reward_dialog_title);
            if (roundupReward.getState() == ApiRoundupCardReward.State.RESTORED) {
                string3 = getString(C39006R.string.card_transaction_roundup_reward_restored_dialog_message);
            } else {
                string3 = getString(C39006R.string.card_transaction_roundup_reward_dialog_message);
            }
            list.add(new TransactionLineItem(string4, str2, null, numValueOf, false, new TransactionLineItem.DialogContent(string5, string3, UserInteractionEventData.Action.VIEW_ROUNDUP_AMOUNT_FAQ), null, null, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, null));
        }
        List<TransactionLineItem> list2 = listMutableListOf;
        list2.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_time), InstantFormatter.NATURAL_TIMESTAMP_IN_SYSTEM_ZONE.format((InstantFormatter) event.getInitiatedAt()), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        String string6 = getString(C39006R.string.transaction_line_item_title_transaction_type);
        String string7 = getString(CardTransactionFormatter2.getLabelResId(event.getType()));
        ApiCardTransactions.TokenType mobilePayService = event.getMobilePayService();
        list2.add(new TransactionLineItem(string6, string7, null, mobilePayService != null ? CardTransactionFormatter2.getIconResId(mobilePayService) : null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null));
        list2.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_merchant_description), event.getMerchantDescription(), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        Money localAmount = event.getLocalAmount();
        if (localAmount != null && !Intrinsics.areEqual(localAmount.getCurrency(), event.getAdjustment().getAmount().getCurrency())) {
            String string8 = getString(C39006R.string.transaction_line_item_title_local_amount);
            if (event.getAdjustment().getDirection() == Money.Direction.CREDIT) {
                str = Money.Adjustment.format$default(localAmount.toCreditAdjustment(), true, null, 2, null);
            } else {
                str = Money.format$default(localAmount.abs(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            list2.add(new TransactionLineItem(string8, str, null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        if (!BigDecimals7.isZero(event.getCashBack().getDecimalValue())) {
            list2.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_cash_back), Money.format$default(transaction.getEvent().getCashBack(), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        DeclinedCardTransaction declinedCardTransaction = event instanceof DeclinedCardTransaction ? (DeclinedCardTransaction) event : null;
        if (declinedCardTransaction != null && (availableBalance = declinedCardTransaction.getAvailableBalance()) != null) {
            list2.add(new TransactionLineItem(getString(C39006R.string.transaction_line_item_title_available_balance), Money.format$default(availableBalance, null, false, null, false, 0, null, false, null, false, false, 1023, null), null, null, false, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        }
        return listMutableListOf;
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getMerchantName(MinervaTransaction.FromCard transaction) {
        Merchant merchant;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        UiMerchant merchant2 = transaction.getMerchant();
        if (merchant2 == null || (merchant = merchant2.getMerchant()) == null) {
            return null;
        }
        return merchant.getName();
    }
}
