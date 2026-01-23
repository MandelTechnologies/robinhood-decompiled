package io.ktor.utils.p478io.jvm.javaio;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pollers.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/ktor/utils/io/jvm/javaio/ProhibitParking;", "Lio/ktor/utils/io/jvm/javaio/Parking;", "Ljava/lang/Thread;", "<init>", "()V", "", "fail", "()Ljava/lang/Void;", "", "timeNanos", "", PlaceTypes.PARK, "(J)V", "token", "unpark", "(Ljava/lang/Thread;)V", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.jvm.javaio.ProhibitParking, reason: use source file name */
/* loaded from: classes14.dex */
final class Pollers4 implements Pollers2<Thread> {
    public static final Pollers4 INSTANCE = new Pollers4();

    private Pollers4() {
    }

    @Override // io.ktor.utils.p478io.jvm.javaio.Pollers2
    public void park(long timeNanos) {
        fail();
        throw new ExceptionsH();
    }

    @Override // io.ktor.utils.p478io.jvm.javaio.Pollers2
    public void unpark(Thread token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Pollers.INSTANCE.unpark(token);
    }

    private final Void fail() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }
}
