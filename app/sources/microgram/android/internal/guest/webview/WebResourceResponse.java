package microgram.android.internal.guest.webview;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.MediaType;

/* compiled from: WebResourceResponse.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¨\u0006\f"}, m3636d2 = {"WebResourceResponse", "Landroid/webkit/WebResourceResponse;", "statusCode", "", "reasonPhrase", "", "responseHeaders", "", "mediaType", "Lokhttp3/MediaType;", WebsocketGatewayConstants.DATA_KEY, "Ljava/io/InputStream;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.guest.webview.WebResourceResponseKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class WebResourceResponse {
    public static /* synthetic */ android.webkit.WebResourceResponse WebResourceResponse$default(int i, String str, Map map, MediaType mediaType, InputStream inputStream, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 8) != 0) {
            mediaType = null;
        }
        if ((i2 & 16) != 0) {
            inputStream = null;
        }
        return WebResourceResponse(i, str, map, mediaType, inputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.webkit.WebResourceResponse WebResourceResponse(int i, String reasonPhrase, Map<String, String> responseHeaders, MediaType mediaType, InputStream inputStream) {
        String str;
        Charset charsetCharset$default;
        Intrinsics.checkNotNullParameter(reasonPhrase, "reasonPhrase");
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        if (mediaType != null) {
            str = mediaType.getType() + "/" + mediaType.getSubtype();
            if (str == null) {
                str = "text/plain";
            }
        }
        String str2 = str;
        if (mediaType == null || (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
            charsetCharset$default = Charsets.UTF_8;
        }
        return new android.webkit.WebResourceResponse(str2, charsetCharset$default.name(), i, reasonPhrase, MapsKt.plus(responseHeaders, MapsKt.mapOf(Tuples4.m3642to("Cache-Control", "no-cache, max-age=0"))), inputStream);
    }
}
