package microgram.android.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.internal.guest.Resource;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: HttpCalls.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"getOrThrow", "Lmicrogram/android/internal/guest/Resource;", "Lokhttp3/Call$Factory;", "url", "Lokhttp3/HttpUrl;", "cacheControl", "Lokhttp3/CacheControl;", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.http.HttpCallsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpCalls {
    public static /* synthetic */ Resource getOrThrow$default(Call.Factory factory, HttpUrl httpUrl, CacheControl cacheControl, int i, Object obj) {
        if ((i & 2) != 0) {
            cacheControl = new CacheControl.Builder().build();
        }
        return getOrThrow(factory, httpUrl, cacheControl);
    }

    public static final Resource getOrThrow(Call.Factory factory, HttpUrl url, CacheControl cacheControl) throws IOException {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
        Response responseExecute = factory.newCall(new Request.Builder().get().url(url).cacheControl(cacheControl).build()).execute();
        int code = responseExecute.getCode();
        if (code == 200) {
            ResponseBody body = responseExecute.getBody();
            if (body == null) {
                throw new IOException("Response should have had a body: " + url);
            }
            return new Resource(body.get$contentType(), body.getBodySource(), body.getContentLength());
        }
        ResponseBody body2 = responseExecute.getBody();
        if (body2 != null) {
            body2.close();
        }
        throw new HttpCalls2("HTTP " + code + ": " + url, null, 2, null);
    }
}
