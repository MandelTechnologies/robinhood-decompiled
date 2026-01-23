package sprig.graphics;

import androidx.work.Data;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"Landroidx/work/Data;", "", "key", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "userleap_release"}, m3637k = 2, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.e */
/* loaded from: classes28.dex */
public final class C49013e {
    /* renamed from: a */
    public static final String m4171a(Data data, String key) {
        Intrinsics.checkNotNullParameter(data, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String string2 = data.getString(key);
        if (string2 == null || string2.length() <= 0) {
            return null;
        }
        return string2;
    }
}
