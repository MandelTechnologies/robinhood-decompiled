package com.robinhood.shared.crypto.staking.staking.history;

import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.shared.history.navigation.HistoryDetailResolver;
import kotlin.Metadata;

/* compiled from: CryptoStakingHistoryDetailResolver_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/history/CryptoStakingHistoryDetailResolver_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/shared/history/navigation/HistoryDetailResolver;", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingHistoryDetailResolver_HammerModule {
    public static final int $stable = 0;
    public static final CryptoStakingHistoryDetailResolver_HammerModule INSTANCE = new CryptoStakingHistoryDetailResolver_HammerModule();

    private CryptoStakingHistoryDetailResolver_HammerModule() {
    }

    public final HistoryDetailResolver provide() {
        return CryptoStakingHistoryDetailResolver.INSTANCE;
    }
}
