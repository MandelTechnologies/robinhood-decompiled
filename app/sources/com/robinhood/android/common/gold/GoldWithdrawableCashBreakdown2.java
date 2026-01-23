package com.robinhood.android.common.gold;

import com.robinhood.models.crypto.p314db.UnifiedBalances;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldWithdrawableCashBreakdown.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUtils;", "", "<init>", "()V", "createGoldWithdrawableCashBreakdown", "Lcom/robinhood/android/common/gold/GoldWithdrawableCashBreakdown;", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldUtils, reason: use source file name */
/* loaded from: classes2.dex */
public final class GoldWithdrawableCashBreakdown2 {
    public static final int $stable = 0;
    public static final GoldWithdrawableCashBreakdown2 INSTANCE = new GoldWithdrawableCashBreakdown2();

    private GoldWithdrawableCashBreakdown2() {
    }

    @JvmStatic
    public static final GoldWithdrawableCashBreakdown createGoldWithdrawableCashBreakdown(UnifiedBalances balances) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        return new GoldWithdrawableCashBreakdown(balances);
    }
}
