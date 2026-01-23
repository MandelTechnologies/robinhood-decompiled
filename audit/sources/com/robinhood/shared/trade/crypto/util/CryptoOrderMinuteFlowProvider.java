package com.robinhood.shared.trade.crypto.util;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: CryptoOrderMinuteFlowProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "Lj$/time/Clock;", "Lkotlinx/coroutines/flow/Flow;", "j$/time/Instant", "getMinuteFlow", "()Lkotlinx/coroutines/flow/Flow;", "minuteFlow", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoOrderMinuteFlowProvider {
    public static final int $stable = 8;
    private final Clock clock;

    public CryptoOrderMinuteFlowProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    public final Flow<Instant> getMinuteFlow() {
        return FlowKt.distinctUntilChangedBy(FlowKt.flow(new CryptoOrderMinuteFlowProvider2(this, null)), new Function1() { // from class: com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(CryptoOrderMinuteFlowProvider._get_minuteFlow_$lambda$0((Instant) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _get_minuteFlow_$lambda$0(Instant it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.atZone(ZoneId.systemDefault()).getMinute();
    }
}
