package io.ktor.utils.p478io.internal;

import io.ktor.utils.p478io.ByteWriteChannel3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ByteBufferChannelInternals.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, m3636d2 = {"Lio/ktor/utils/io/internal/ClosedElement;", "", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "toString", "", "Companion", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.internal.ClosedElement, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteBufferChannelInternals {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ByteBufferChannelInternals EmptyCause = new ByteBufferChannelInternals(null);
    private final Throwable cause;

    public ByteBufferChannelInternals(Throwable th) {
        this.cause = th;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final Throwable getSendException() {
        Throwable th = this.cause;
        return th == null ? new ByteWriteChannel3("The channel was closed") : th;
    }

    public String toString() {
        return "Closed[" + getSendException() + ']';
    }

    /* compiled from: ByteBufferChannelInternals.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lio/ktor/utils/io/internal/ClosedElement$Companion;", "", "()V", "EmptyCause", "Lio/ktor/utils/io/internal/ClosedElement;", "getEmptyCause", "()Lio/ktor/utils/io/internal/ClosedElement;", "ktor-io"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.ktor.utils.io.internal.ClosedElement$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ByteBufferChannelInternals getEmptyCause() {
            return ByteBufferChannelInternals.EmptyCause;
        }
    }
}
