package com.twilio.util;

import kotlin.Metadata;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU3;

/* compiled from: NextLong.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/util/NextLong;", "", "()V", "counter", "Lkotlinx/atomicfu/AtomicLong;", "invoke", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class NextLong {
    public static final NextLong INSTANCE = new NextLong();
    private static final AtomicFU3 counter = AtomicFU.atomic(0L);

    private NextLong() {
    }

    public final long invoke() {
        return counter.incrementAndGet();
    }
}
