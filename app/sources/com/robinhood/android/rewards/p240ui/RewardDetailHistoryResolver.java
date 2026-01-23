package com.robinhood.android.rewards.p240ui;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.history.contracts.RewardDetailFragmentKey;
import com.robinhood.shared.history.navigation.HistoryDetailResolver;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardDetailHistoryResolver.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rewards/ui/CashRewardDetailHistoryResolver;", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "<init>", "()V", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "fromDeepLink", "feature-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rewards.ui.CashRewardDetailHistoryResolver, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardDetailHistoryResolver extends HistoryDetailResolver {
    public static final RewardDetailHistoryResolver INSTANCE = new RewardDetailHistoryResolver();

    private RewardDetailHistoryResolver() {
        super(HistoryTransactionType.CASH_REWARD_ITEM);
    }

    @Override // com.robinhood.shared.history.navigation.HistoryDetailResolver
    public FragmentKey resolve(TransactionReference transactionReference, boolean isFromCryptoSource, boolean fromDeepLink) {
        Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
        return new RewardDetailFragmentKey(transactionReference.getSourceId(), RewardDetailFragmentKey.Type.CASH);
    }
}
