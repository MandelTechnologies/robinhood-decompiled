package com.robinhood.coroutines;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.DelayKt;
import p479j$.time.Clock;

/* compiled from: MinTimeInFlight.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aD\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"T", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/time/Duration;", "minTime", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "withMinTimeInFlight-dWUq8MI", "(Lj$/time/Clock;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withMinTimeInFlight", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.MinTimeInFlightKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class MinTimeInFlight {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: withMinTimeInFlight-dWUq8MI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m22184withMinTimeInFlightdWUq8MI(Clock clock, long j, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        MinTimeInFlight2 minTimeInFlight2;
        long jMillis;
        if (continuation instanceof MinTimeInFlight2) {
            minTimeInFlight2 = (MinTimeInFlight2) continuation;
            int i = minTimeInFlight2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minTimeInFlight2.label = i - Integer.MIN_VALUE;
            } else {
                minTimeInFlight2 = new MinTimeInFlight2(continuation);
            }
        }
        Object objInvoke = minTimeInFlight2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = minTimeInFlight2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            jMillis = clock.millis();
            minTimeInFlight2.L$0 = clock;
            minTimeInFlight2.J$0 = j;
            minTimeInFlight2.J$1 = jMillis;
            minTimeInFlight2.label = 1;
            objInvoke = function1.invoke(minTimeInFlight2);
            if (objInvoke != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = minTimeInFlight2.L$0;
            ResultKt.throwOnFailure(objInvoke);
            return obj;
        }
        long j2 = minTimeInFlight2.J$1;
        long j3 = minTimeInFlight2.J$0;
        Clock clock2 = (Clock) minTimeInFlight2.L$0;
        ResultKt.throwOnFailure(objInvoke);
        jMillis = j2;
        j = j3;
        clock = clock2;
        long jMillis2 = clock.millis() - jMillis;
        Duration.Companion companion = Duration.INSTANCE;
        long jM28754minusLRDsOJo = Duration.m28754minusLRDsOJo(j, Duration3.toDuration(jMillis2, DurationUnitJvm.MILLISECONDS));
        if (Duration.m28727compareToLRDsOJo(jM28754minusLRDsOJo, Duration.INSTANCE.m28767getZEROUwyO8pc()) > 0) {
            minTimeInFlight2.L$0 = objInvoke;
            minTimeInFlight2.label = 2;
            if (DelayKt.m28786delayVtjQ1oo(jM28754minusLRDsOJo, minTimeInFlight2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return objInvoke;
    }
}
