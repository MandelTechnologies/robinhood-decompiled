package com.plaid.internal;

import com.plaid.link.event.LinkEvent;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.x0 */
/* loaded from: classes16.dex */
public final class DelayedC7247x0 implements Delayed {

    /* renamed from: a */
    public final LinkEvent f3291a;

    /* renamed from: b */
    public final long f3292b;

    public DelayedC7247x0(LinkEvent linkEvent, int i) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        this.f3291a = linkEvent;
        this.f3292b = System.currentTimeMillis() + i;
    }

    /* renamed from: a */
    public final LinkEvent m1647a() {
        return this.f3291a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed other = delayed;
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.f3292b, ((DelayedC7247x0) other).f3292b);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(this.f3292b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
