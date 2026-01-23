package com.robinhood.utils.lazy;

import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: TimeoutLazy.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0019B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/lazy/RealTimeoutLazy;", "T", "Lcom/robinhood/utils/lazy/TimeoutLazy;", "j$/time/Clock", Card.Icon.CLOCK, "j$/time/Duration", "timeout", "Lkotlin/Function0;", "initializer", "<init>", "(Lj$/time/Clock;Lj$/time/Duration;Lkotlin/jvm/functions/Function0;)V", "Lj$/time/Clock;", "Lj$/time/Duration;", "getTimeout", "()Lj$/time/Duration;", "Lkotlin/jvm/functions/Function0;", "", "lock", "Ljava/lang/Object;", "Lcom/robinhood/utils/lazy/RealTimeoutLazy$Entry;", "entry", "Lcom/robinhood/utils/lazy/RealTimeoutLazy$Entry;", "getValue", "()Ljava/lang/Object;", "value", "Entry", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.lazy.RealTimeoutLazy, reason: use source file name */
/* loaded from: classes21.dex */
final class TimeoutLazy2<T> implements TimeoutLazy<T> {
    private final Clock clock;
    private volatile Entry<? extends T> entry;
    private final Function0<T> initializer;
    private final Object lock;
    private final Duration timeout;

    /* JADX WARN: Multi-variable type inference failed */
    public TimeoutLazy2(Clock clock, Duration timeout, Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.clock = clock;
        this.timeout = timeout;
        this.initializer = initializer;
        this.lock = new Object();
    }

    @Override // com.robinhood.utils.lazy.TimeoutLazy
    public Duration getTimeout() {
        return this.timeout;
    }

    @Override // com.robinhood.utils.lazy.TimeoutLazy
    public T getValue() {
        T tInvoke;
        Entry<? extends T> entry = this.entry;
        if (entry != null && entry.getExpiration().isAfter(this.clock.instant())) {
            return entry.getValue();
        }
        synchronized (this.lock) {
            try {
                Entry<? extends T> entry2 = this.entry;
                if (entry2 != null && entry2.getExpiration().isAfter(this.clock.instant())) {
                    tInvoke = entry2.getValue();
                } else {
                    tInvoke = this.initializer.invoke();
                    Instant instantPlus = this.clock.instant().plus((TemporalAmount) getTimeout());
                    Intrinsics.checkNotNullExpressionValue(instantPlus, "plus(...)");
                    this.entry = new Entry<>(instantPlus, tInvoke);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tInvoke;
    }

    /* compiled from: TimeoutLazy.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/utils/lazy/RealTimeoutLazy$Entry;", "T", "", "j$/time/Instant", "expiration", "value", "<init>", "(Lj$/time/Instant;Ljava/lang/Object;)V", "component1", "()Lj$/time/Instant;", "component2", "()Ljava/lang/Object;", "copy", "(Lj$/time/Instant;Ljava/lang/Object;)Lcom/robinhood/utils/lazy/RealTimeoutLazy$Entry;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getExpiration", "Ljava/lang/Object;", "getValue", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.lazy.RealTimeoutLazy$Entry, reason: from toString */
    private static final /* data */ class Entry<T> {
        private final Instant expiration;
        private final T value;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Entry copy$default(Entry entry, Instant instant, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                instant = entry.expiration;
            }
            if ((i & 2) != 0) {
                obj = entry.value;
            }
            return entry.copy(instant, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getExpiration() {
            return this.expiration;
        }

        public final T component2() {
            return this.value;
        }

        public final Entry<T> copy(Instant expiration, T value) {
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            return new Entry<>(expiration, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(this.expiration, entry.expiration) && Intrinsics.areEqual(this.value, entry.value);
        }

        public int hashCode() {
            int iHashCode = this.expiration.hashCode() * 31;
            T t = this.value;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        public String toString() {
            return "Entry(expiration=" + this.expiration + ", value=" + this.value + ")";
        }

        public Entry(Instant expiration, T t) {
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            this.expiration = expiration;
            this.value = t;
        }

        public final Instant getExpiration() {
            return this.expiration;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
