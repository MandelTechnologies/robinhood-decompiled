package sprig.p544b;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m3636d2 = {"", "Lorg/json/JSONObject;", "b", "userleap_release"}, m3637k = 2, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.b.a */
/* loaded from: classes28.dex */
public final class C48991a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final JSONObject m4023b(String str) {
        Object objM28550constructorimpl;
        if (StringsKt.equals(str, "undefined", true)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(new JSONObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        return (JSONObject) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }
}
