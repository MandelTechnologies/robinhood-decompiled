package io.ktor.utils.p478io;

import kotlin.Metadata;

/* compiled from: ByteBufferChannel.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"", "cause", "", "rethrowClosed", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "ktor-io"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.utils.io.ByteBufferChannelKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ByteBufferChannel4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Void rethrowClosed(Throwable th) throws Throwable {
        Throwable thTryCopyException;
        try {
            thTryCopyException = ExceptionUtilsJvm2.tryCopyException(th, th);
        } catch (Throwable unused) {
            thTryCopyException = null;
        }
        if (thTryCopyException == null) {
            throw th;
        }
        throw thTryCopyException;
    }
}
