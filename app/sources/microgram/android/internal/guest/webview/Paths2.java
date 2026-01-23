package microgram.android.internal.guest.webview;

import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okio.Path;

/* compiled from: Paths.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"guessMediaType", "Lokhttp3/MediaType;", "Lokio/Path;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.guest.webview.PathsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Paths2 {
    public static final MediaType guessMediaType(Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(path.name());
        if (strGuessContentTypeFromName != null) {
            return MediaType.INSTANCE.parse(strGuessContentTypeFromName);
        }
        return null;
    }
}
