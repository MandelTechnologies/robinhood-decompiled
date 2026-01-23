package microgram.android.internal.guest.webview;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: WebViewExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/RenderProcessGoneException;", "Ljava/io/IOException;", "Lokio/IOException;", "", "crashed", "", "priorityAtExit", "<init>", "(ZI)V", "Z", "getCrashed", "()Z", "I", "getPriorityAtExit", "()I", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.webview.RenderProcessGoneException, reason: use source file name */
/* loaded from: classes14.dex */
public final class WebViewExceptions extends IOException {
    private final boolean crashed;
    private final int priorityAtExit;

    public WebViewExceptions(boolean z, int i) {
        super("Render process gone: crashed=" + z + ", priorityAtExit=" + i);
        this.crashed = z;
        this.priorityAtExit = i;
    }
}
