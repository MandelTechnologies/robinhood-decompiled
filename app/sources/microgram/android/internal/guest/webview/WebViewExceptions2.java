package microgram.android.internal.guest.webview;

import android.net.Uri;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewExceptions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebResourceException;", "Ljava/io/IOException;", "Lokio/IOException;", "Landroid/net/Uri;", "url", "", "errorCode", "", "description", "<init>", "(Landroid/net/Uri;ILjava/lang/String;)V", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "I", "getErrorCode", "()I", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.webview.WebResourceException, reason: use source file name */
/* loaded from: classes14.dex */
public final class WebViewExceptions2 extends IOException {
    private final String description;
    private final int errorCode;
    private final Uri url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewExceptions2(Uri url, int i, String str) {
        super("Error " + i + " for " + url + ": " + str);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.errorCode = i;
        this.description = str;
    }
}
