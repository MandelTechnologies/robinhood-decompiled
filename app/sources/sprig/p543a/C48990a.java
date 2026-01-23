package sprig.p543a;

import android.net.TrafficStats;
import android.os.Build;
import com.robinhood.android.car.result.CarResultComposable2;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import sprig.graphics.C48999g;

@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J,\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lsprig/a/a;", "", "", "", "additionalHeaders", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "path", CarResultComposable2.BODY, "headers", "Lokhttp3/OkHttpClient;", "Lokhttp3/OkHttpClient;", "client", "b", "Ljava/lang/String;", "url", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.a.a */
/* loaded from: classes23.dex */
public final class C48990a {

    /* renamed from: a, reason: from kotlin metadata */
    private final OkHttpClient client = new OkHttpClient();

    /* renamed from: b, reason: from kotlin metadata */
    private final String url = "https://api.sprig.com";

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ String m4019a(C48990a c48990a, String str, String str2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return c48990a.m4021a(str, str2, map);
    }

    /* renamed from: a */
    public final String m4021a(String path, String body, Map<String, String> headers) throws IOException {
        String strString;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        Response responseExecute = this.client.newCall(new Request.Builder().url(this.url + path).headers(Headers.INSTANCE.m3819of(m4020a(headers))).post(RequestBody.Companion.create$default(RequestBody.INSTANCE, body, (MediaType) null, 1, (Object) null)).build()).execute();
        try {
            if (responseExecute.isSuccessful()) {
                ResponseBody body2 = responseExecute.getBody();
                if (body2 == null || (strString = body2.string()) == null) {
                    strString = "";
                }
                Closeable.closeFinally(responseExecute, null);
                return strString;
            }
            throw new Exception("Failed to post to " + path + ": " + responseExecute.getCode() + ' ' + responseExecute.getMessage());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Closeable.closeFinally(responseExecute, th);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    private final Map<String, String> m4020a(Map<String, String> additionalHeaders) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("userleap-platform", "android");
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("Accept", "application/json");
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "unknown";
        }
        linkedHashMap.put("x-ul-mobile-user-agent", property);
        String str = (String) CollectionsKt.firstOrNull(StringsKt.split$default((CharSequence) "2.17.6", new char[]{'-'}, false, 0, 6, (Object) null));
        if (str == null) {
            str = "unknown";
        }
        linkedHashMap.put("x-ul-mobile-sdk-version", str);
        linkedHashMap.put("x-ul-environment-id", C48999g.f8243a.m4107m());
        String str2 = Build.VERSION.RELEASE;
        linkedHashMap.put("x-ul-os-version", str2 != null ? str2 : "unknown");
        linkedHashMap.put("accept-language", "en-US");
        for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
