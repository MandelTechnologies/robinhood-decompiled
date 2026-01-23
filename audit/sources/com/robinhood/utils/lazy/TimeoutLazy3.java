package com.robinhood.utils.lazy;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: TimeoutLazy.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"T", "Lcom/robinhood/utils/lazy/TimeoutLazy;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Lcom/robinhood/utils/lazy/TimeoutLazy;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/Duration", "timeout", "Lkotlin/Function0;", "initializer", "timeoutLazy", "(Lj$/time/Clock;Lj$/time/Duration;Lkotlin/jvm/functions/Function0;)Lcom/robinhood/utils/lazy/TimeoutLazy;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.lazy.TimeoutLazyKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class TimeoutLazy3 {
    public static final <T> T getValue(TimeoutLazy<? extends T> timeoutLazy, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(timeoutLazy, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return timeoutLazy.getValue();
    }

    public static final <T> TimeoutLazy<T> timeoutLazy(Clock clock, Duration timeout, Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new TimeoutLazy2(clock, timeout, initializer);
    }
}
