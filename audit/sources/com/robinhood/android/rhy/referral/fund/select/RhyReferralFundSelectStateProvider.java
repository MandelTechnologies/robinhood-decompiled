package com.robinhood.android.rhy.referral.fund.select;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralFundSelectStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectDataState;", "Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectViewState;", "<init>", "()V", "reduce", "dataState", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyReferralFundSelectStateProvider implements StateProvider<RhyReferralFundSelectDataState, RhyReferralFundSelectViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RhyReferralFundSelectViewState reduce(RhyReferralFundSelectDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<TransferAccount> fundingSources = dataState.getFundingSources();
        boolean z = false;
        if (!(fundingSources instanceof Collection) || !fundingSources.isEmpty()) {
            Iterator<T> it = fundingSources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((TransferAccount) it.next()).getType() != ApiTransferAccount.TransferAccountType.RHY) {
                    z = true;
                    break;
                }
            }
        }
        return new RhyReferralFundSelectViewState(z);
    }
}
