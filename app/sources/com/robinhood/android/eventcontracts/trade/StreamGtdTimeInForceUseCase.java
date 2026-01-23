package com.robinhood.android.eventcontracts.trade;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Clock;

/* compiled from: StreamGtdTimeInForceUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/StreamGtdTimeInForceUseCase;", "", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Lj$/time/Clock;", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class StreamGtdTimeInForceUseCase {
    private final Clock clock;

    public StreamGtdTimeInForceUseCase(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    public final Flow<GtdTimeInForceInfo> invoke() {
        return StreamGtdExpireTimestamp2.streamGtdExpireTimestampFormatted(this.clock);
    }
}
