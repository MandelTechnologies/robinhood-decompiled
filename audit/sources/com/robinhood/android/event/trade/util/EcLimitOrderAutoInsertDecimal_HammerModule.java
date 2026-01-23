package com.robinhood.android.event.trade.util;

import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: EcLimitOrderAutoInsertDecimal_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/util/EcLimitOrderAutoInsertDecimal_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/experiments/ExperimentDeclaration;", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EcLimitOrderAutoInsertDecimal_HammerModule {
    public static final int $stable = 0;
    public static final EcLimitOrderAutoInsertDecimal_HammerModule INSTANCE = new EcLimitOrderAutoInsertDecimal_HammerModule();

    private EcLimitOrderAutoInsertDecimal_HammerModule() {
    }

    public final ExperimentDeclaration<?> provide() {
        return EventContractExperiments.INSTANCE;
    }
}
