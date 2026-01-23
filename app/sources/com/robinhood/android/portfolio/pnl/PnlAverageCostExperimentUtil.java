package com.robinhood.android.portfolio.pnl;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: PnlAverageCostExperimentUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"shouldUseClearingCostBasis", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "inPnlAverageCostRetirement", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnl.PnlAverageCostExperimentUtilKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlAverageCostExperimentUtil {
    public static final boolean shouldUseClearingCostBasis(BrokerageAccountType brokerageAccountType, boolean z) {
        if (brokerageAccountType == null) {
            return false;
        }
        return (brokerageAccountType.isRetirement() && z) || !brokerageAccountType.isRetirement();
    }
}
