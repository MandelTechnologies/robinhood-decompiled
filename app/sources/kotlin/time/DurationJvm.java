package kotlin.time;

import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DurationJvm.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\" \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"", "durationAssertionsEnabled", "Z", "getDurationAssertionsEnabled", "()Z", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "precisionFormats", "[Ljava/lang/ThreadLocal;", "kotlin-stdlib"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlin.time.DurationJvmKt, reason: use source file name */
/* loaded from: classes23.dex */
public final class DurationJvm {
    private static final boolean durationAssertionsEnabled = false;
    private static final ThreadLocal<DecimalFormat>[] precisionFormats;

    public static final boolean getDurationAssertionsEnabled() {
        return durationAssertionsEnabled;
    }

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        precisionFormats = threadLocalArr;
    }
}
