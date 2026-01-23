package microgram.android.internal.guest.webview;

import com.robinhood.android.tracing.RhTrace6;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TracingInputStream.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"tracing", "Ljava/io/InputStream;", "trace", "Lcom/robinhood/android/tracing/TrackTrace;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.webview.TracingInputStreamKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TracingInputStream2 {
    public static final InputStream tracing(InputStream inputStream, RhTrace6 trace) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(trace, "trace");
        return trace.isEnabled() ? new TracingInputStream(trace, inputStream) : inputStream;
    }
}
