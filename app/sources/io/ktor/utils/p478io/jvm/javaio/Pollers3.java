package io.ktor.utils.p478io.jvm.javaio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: Pollers.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"", "isParkingAllowed", "()Z", "Ljava/lang/ThreadLocal;", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "parkingImplLocal", "Ljava/lang/ThreadLocal;", "getParkingImpl", "()Lio/ktor/utils/io/jvm/javaio/Parking;", "parkingImpl", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* renamed from: io.ktor.utils.io.jvm.javaio.PollersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Pollers3 {
    private static final ThreadLocal<Pollers2<Thread>> parkingImplLocal = new ThreadLocal<>();

    @JvmName
    public static final Pollers2<Thread> getParkingImpl() {
        Pollers2<Thread> pollers2 = parkingImplLocal.get();
        return pollers2 == null ? Pollers.INSTANCE : pollers2;
    }

    @JvmName
    public static final boolean isParkingAllowed() {
        return getParkingImpl() != Pollers4.INSTANCE;
    }
}
