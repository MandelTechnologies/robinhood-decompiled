package sprig.p544b;

import com.singular.sdk.internal.Constants;
import com.userleap.SurveyState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m3636d2 = {"", "Lcom/userleap/SurveyState;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "userleap_release"}, m3637k = 2, m3638mv = {1, 8, 0})
/* renamed from: sprig.b.b */
/* loaded from: classes28.dex */
public final class C48992b {
    /* renamed from: a */
    public static final SurveyState m4024a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.areEqual(str, "ready") ? SurveyState.READY : Intrinsics.areEqual(str, "no survey") ? SurveyState.NO_SURVEY : SurveyState.DISABLED;
    }
}
