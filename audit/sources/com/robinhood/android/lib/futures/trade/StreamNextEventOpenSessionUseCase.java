package com.robinhood.android.lib.futures.trade;

import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.store.event.EventMarketdataStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: StreamNextEventOpenSessionUseCase.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/futures/trade/StreamNextEventOpenSessionUseCase;", "", "Lcom/robinhood/store/event/EventMarketdataStore;", "eventMarketdataStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/store/event/EventMarketdataStore;Lj$/time/Clock;)V", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "exchangeSource", "Lkotlin/Function0;", "j$/time/Instant", "getNow", "Lkotlin/time/Duration;", "retryDelayDuration", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/futures/trade/Session;", "invoke-SxA4cEA", "(Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;Lkotlin/jvm/functions/Function0;J)Lkotlinx/coroutines/flow/Flow;", "invoke", "Lcom/robinhood/store/event/EventMarketdataStore;", "Lj$/time/Clock;", "lib-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class StreamNextEventOpenSessionUseCase {
    private final Clock clock;
    private final EventMarketdataStore eventMarketdataStore;

    public StreamNextEventOpenSessionUseCase(EventMarketdataStore eventMarketdataStore, Clock clock) {
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.eventMarketdataStore = eventMarketdataStore;
        this.clock = clock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke-SxA4cEA$default, reason: not valid java name */
    public static /* synthetic */ Flow m15816invokeSxA4cEA$default(final StreamNextEventOpenSessionUseCase streamNextEventOpenSessionUseCase, ExchangeSource exchangeSource, Function0 function0, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.lib.futures.trade.StreamNextEventOpenSessionUseCase$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamNextEventOpenSessionUseCase.invoke_SxA4cEA$lambda$0(this.f$0);
                }
            };
        }
        if ((i & 4) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
        }
        return streamNextEventOpenSessionUseCase.m15817invokeSxA4cEA(exchangeSource, function0, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant invoke_SxA4cEA$lambda$0(StreamNextEventOpenSessionUseCase streamNextEventOpenSessionUseCase) {
        return Instant.now(streamNextEventOpenSessionUseCase.clock);
    }

    /* renamed from: invoke-SxA4cEA, reason: not valid java name */
    public final Flow<Session> m15817invokeSxA4cEA(ExchangeSource exchangeSource, Function0<Instant> getNow, long retryDelayDuration) {
        Intrinsics.checkNotNullParameter(exchangeSource, "exchangeSource");
        Intrinsics.checkNotNullParameter(getNow, "getNow");
        return FlowKt.distinctUntilChanged(FlowKt.flow(new StreamNextEventOpenSessionUseCase2(getNow, this, exchangeSource, retryDelayDuration, null)));
    }
}
