package sprig.graphics;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import sprig.p543a.C48990a;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lsprig/e/r;", "", "", "payload", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Lsprig/a/a;", "Lsprig/a/a;", "networkService", "Lsprig/g/a;", "b", "Lsprig/g/a;", "logger", "c", "Ljava/lang/String;", "path", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.e.r */
/* loaded from: classes28.dex */
public final class C49026r {

    /* renamed from: a, reason: from kotlin metadata */
    private final C48990a networkService = new C48990a();

    /* renamed from: b, reason: from kotlin metadata */
    private final C49029a logger = new C49029a();

    /* renamed from: c, reason: from kotlin metadata */
    private final String path = "/2/environments/integrations/upload";

    /* renamed from: a */
    public final String m4277a(String payload) throws JSONException {
        String str;
        Intrinsics.checkNotNullParameter(payload, "payload");
        try {
            str = payload;
        } catch (Exception e) {
            e = e;
            str = payload;
        }
        try {
            String url = new JSONObject(C48990a.m4019a(this.networkService, this.path, str, null, 4, null)).getJSONObject("upload").getString("url");
            Intrinsics.checkNotNullExpressionValue(url, "url");
            return url;
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            C49029a.m4295a(this.logger, "Failed to generate upload url", "", "error: " + exc + ", payload: " + str, null, null, null, 56, null);
            return "";
        }
    }
}
