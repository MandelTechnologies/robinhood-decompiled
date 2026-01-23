package com.robinhood.shared.crypto.staking.staking.input;

import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuggestedInputAmountState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getLoggingIdentifier", "", "Lcom/robinhood/models/crypto/db/staking/StakingConfig$SuggestedInputAmount;", "rank", "", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountStateKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SuggestedInputAmountState2 {
    public static final String getLoggingIdentifier(StakingConfig.SuggestedInputAmount suggestedInputAmount, int i) {
        Intrinsics.checkNotNullParameter(suggestedInputAmount, "<this>");
        return "suggested_amount#" + i + "#" + suggestedInputAmount.getValue();
    }
}
