package com.robinhood.android.equities.store.swipetotrade;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: EquitySwipeNuxStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m3636d2 = {"", "peekCount", "j$/time/Instant", "peekLastShown", "tradesSinceLastPeekOrSwipe", "lastSwipe", "", "<anonymous>", "(ILj$/time/Instant;ILj$/time/Instant;)Z"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$showPeek$1$3", m3645f = "EquitySwipeNuxStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$showPeek$1$3, reason: use source file name */
/* loaded from: classes3.dex */
final class EquitySwipeNuxStore2 extends ContinuationImpl7 implements Function5<Integer, Instant, Integer, Instant, Continuation<? super Boolean>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    EquitySwipeNuxStore2(Continuation<? super EquitySwipeNuxStore2> continuation) {
        super(5, continuation);
    }

    public final Object invoke(int i, Instant instant, int i2, Instant instant2, Continuation<? super Boolean> continuation) {
        EquitySwipeNuxStore2 equitySwipeNuxStore2 = new EquitySwipeNuxStore2(continuation);
        equitySwipeNuxStore2.I$0 = i;
        equitySwipeNuxStore2.L$0 = instant;
        equitySwipeNuxStore2.I$1 = i2;
        equitySwipeNuxStore2.L$1 = instant2;
        return equitySwipeNuxStore2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Instant instant, Integer num2, Instant instant2, Continuation<? super Boolean> continuation) {
        return invoke(num.intValue(), instant, num2.intValue(), instant2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = this.I$0;
        Instant instant = (Instant) this.L$0;
        int i2 = this.I$1;
        Instant instant2 = (Instant) this.L$1;
        Instant instantMinus = Instant.now().minus((TemporalAmount) Duration.ofDays(60L));
        Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
        return boxing.boxBoolean(i < 3 && (instant == null || ((instant.isBefore(instantMinus) && (instant2 == null || instant2.isBefore(instantMinus))) || i2 >= 5)));
    }
}
