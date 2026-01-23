package microgram.android.internal.guest.webview;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LyingInputStream.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m3636d2 = {"reportingAvailableBytes", "Ljava/io/InputStream;", "contentLength", "", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.webview.LyingInputStreamKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class LyingInputStream2 {
    public static final InputStream reportingAvailableBytes(InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return (j == -1 || j == 0) ? inputStream : new LyingInputStream(inputStream, j);
    }
}
