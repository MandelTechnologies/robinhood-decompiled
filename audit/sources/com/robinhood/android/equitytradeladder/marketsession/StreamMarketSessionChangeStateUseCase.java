package com.robinhood.android.equitytradeladder.marketsession;

import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.models.card.p311db.Card;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: StreamMarketSessionChangeStateUseCase.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "<init>", "(Lj$/time/Clock;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "Ljava/util/UUID;", "instrumentId", "", "isAdt", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/equitytradeladder/marketsession/MarketSessionChangeDataState;", "invoke", "(Ljava/util/UUID;Z)Lkotlinx/coroutines/flow/Flow;", "Lj$/time/Clock;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StreamMarketSessionChangeStateUseCase {
    public static final int $stable = 8;
    private final Clock clock;
    private final TraderMarketHoursManager marketHoursManager;

    public StreamMarketSessionChangeStateUseCase(Clock clock, TraderMarketHoursManager marketHoursManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        this.clock = clock;
        this.marketHoursManager = marketHoursManager;
    }

    public final Flow<MarketSessionChangeDataState> invoke(UUID instrumentId, boolean isAdt) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return FlowKt.transformLatest(this.marketHoursManager.getCurrentTradingSession(), new C15940xd7a50232(null, isAdt, this));
    }
}
