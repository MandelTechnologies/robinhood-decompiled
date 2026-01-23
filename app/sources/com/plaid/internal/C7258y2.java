package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.link.event.LinkEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.DelayQueue;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.y2 */
/* loaded from: classes16.dex */
public final class C7258y2 {

    /* renamed from: a */
    public final DelayQueue<DelayedC7247x0> f3320a;

    /* renamed from: b */
    public final List<LinkEvent> f3321b;

    public C7258y2() {
        this(null);
    }

    /* renamed from: a */
    public final void m1666a(LinkEvent event, int i) {
        Intrinsics.checkNotNullParameter(event, "event");
        C5953R5.a.m1299a(C5953R5.f1671a, "putting: " + event.getEventName() + " for " + i);
        this.f3320a.put((DelayQueue<DelayedC7247x0>) new DelayedC7247x0(event, i));
    }

    /* renamed from: b */
    public final void m1668b(Function1<? super LinkEvent, Unit> function1) {
        synchronized (this.f3321b) {
            try {
                List<LinkEvent> list = this.f3321b;
                C5953R5.a.m1299a(C5953R5.f1671a, "flushing " + list.size() + " events");
                for (LinkEvent linkEvent : list) {
                    if (function1 != null) {
                        function1.invoke(linkEvent);
                    } else {
                        m1666a(linkEvent, -1);
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C7258y2(Object obj) {
        DelayQueue<DelayedC7247x0> delayable = new DelayQueue<>();
        List<LinkEvent> enqueable = Collections.synchronizedList(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(enqueable, "synchronizedList(...)");
        Intrinsics.checkNotNullParameter(delayable, "delayable");
        Intrinsics.checkNotNullParameter(enqueable, "enqueable");
        this.f3320a = delayable;
        this.f3321b = enqueable;
    }

    /* renamed from: a */
    public final void m1667a(Function1<? super LinkEvent, Unit> deliver) {
        Intrinsics.checkNotNullParameter(deliver, "deliver");
        m1668b(deliver);
        Object[] array2 = this.f3320a.toArray();
        this.f3320a.clear();
        Intrinsics.checkNotNull(array2);
        ArraysKt.sort(array2);
        C5953R5.a.m1299a(C5953R5.f1671a, "draining: " + array2.length + " events");
        for (Object obj : array2) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.plaid.internal.event.DelayedLinkEvent");
            deliver.invoke(((DelayedC7247x0) obj).m1647a());
        }
    }

    /* renamed from: a */
    public final void m1665a(LinkEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this.f3321b) {
            C5953R5.a.m1300a(C5953R5.f1671a, "enqueueing: " + event.getEventName(), new Object[]{""});
            this.f3321b.add(event);
        }
    }
}
