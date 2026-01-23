package com.robinhood.shared.history.formatters.legacy;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.models.api.pluto.ApiRoundupReward;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RoundupRewardTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoundupRewardFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/history/formatters/legacy/RoundupRewardFormatter;", "Lcom/robinhood/android/common/history/ui/format/AbstractMinervaTransactionFormatter;", "Lcom/robinhood/shared/models/history/RoundupRewardTransaction;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPrimaryText", "", "transaction", "getSummaryBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "getLineItems", "", "lib-history-formatters-legacy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RoundupRewardFormatter extends AbstractMinervaTransactionFormatter<RoundupRewardTransaction> {

    /* compiled from: RoundupRewardFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRoundupReward.State.values().length];
            try {
                iArr[ApiRoundupReward.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRoundupReward.State.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiRoundupReward.State.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiRoundupReward.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiRoundupReward.State.SKIPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    /* renamed from: getLineItems */
    public /* bridge */ /* synthetic */ List mo25632getLineItems(MinervaTransaction minervaTransaction) {
        return (List) getLineItems((RoundupRewardTransaction) minervaTransaction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundupRewardFormatter(Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public CharSequence getPrimaryText(RoundupRewardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.getEvent().getAssetSymbol() != null) {
            return getString(C39006R.string.roundup_reward_description_with_symbol, transaction.getEvent().getAssetSymbol());
        }
        return getString(C39006R.string.roundup_reward_description);
    }

    @Override // com.robinhood.android.common.history.p082ui.format.AbstractMinervaTransactionFormatter, com.robinhood.android.common.history.p082ui.format.HistoryTransactionFormatter
    public TransactionSummary.Badge getSummaryBadge(RoundupRewardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int i = WhenMappings.$EnumSwitchMapping$0[transaction.getEvent().getRoundupReward().getState().ordinal()];
        if (i == 1) {
            return new TransactionSummary.Badge(getString(C39006R.string.roundup_reward_state_pending), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (i == 2) {
            return new TransactionSummary.Badge(getString(C39006R.string.roundup_reward_state_queued), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (i == 3) {
            return new TransactionSummary.Badge(getString(C39006R.string.roundup_reward_state_completed), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        if (i == 4) {
            return new TransactionSummary.Badge(getString(C39006R.string.roundup_reward_state_failed), TransactionSummary.Tint.NEGATIVE, false, 4, null);
        }
        if (i != 5) {
            return null;
        }
        return new TransactionSummary.Badge(getString(C39006R.string.roundup_reward_state_skipped), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
    }

    public Void getLineItems(RoundupRewardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        throw new UnsupportedOperationException("Roundup rewards currently have their own history detail");
    }
}
