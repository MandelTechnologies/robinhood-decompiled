package com.robinhood.android.equitytradeladder;

import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.hammer.core.internal.RhGenerated;
import kotlin.Metadata;

/* compiled from: EquityLadderShortingKillSwitch_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityLadderShortingKillSwitch_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/experiments/ExperimentDeclaration;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityLadderShortingKillSwitch_HammerModule {
    public static final int $stable = 0;
    public static final EquityLadderShortingKillSwitch_HammerModule INSTANCE = new EquityLadderShortingKillSwitch_HammerModule();

    private EquityLadderShortingKillSwitch_HammerModule() {
    }

    public final ExperimentDeclaration<?> provide() {
        return EquityLadderShortingKillSwitch.INSTANCE;
    }
}
