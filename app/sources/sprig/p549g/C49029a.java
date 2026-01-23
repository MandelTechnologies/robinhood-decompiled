package sprig.p549g;

import android.os.Build;
import com.robinhood.models.api.ErrorResponse;
import com.singular.sdk.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.json.JSONException;
import org.json.JSONObject;
import sprig.graphics.C48999g;
import sprig.p543a.C48990a;

@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002JD\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lsprig/g/a;", "", "", "message", ErrorResponse.DETAIL, "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/lang/StackTraceElement;", "d", "b", "c", "additionalDetails", "stackTrace", "callingMethod", "callingFile", "Ljava/lang/String;", "TAG", "Lsprig/a/a;", "Lsprig/a/a;", "networkService", "errorsPath", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
/* renamed from: sprig.g.a */
/* loaded from: classes23.dex */
public final class C49029a {

    /* renamed from: a, reason: from kotlin metadata */
    private final String TAG = "SprigLogger";

    /* renamed from: b, reason: from kotlin metadata */
    private final C48990a networkService = new C48990a();

    /* renamed from: c, reason: from kotlin metadata */
    private final String errorsPath = "/sdk/1/errors";

    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "it", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Ljava/lang/StackTraceElement;)Ljava/lang/CharSequence;"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.g.a$a */
    /* loaded from: classes28.dex */
    static final class a extends Lambda implements Function1<StackTraceElement, CharSequence> {

        /* renamed from: a */
        public static final a f8507a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(StackTraceElement stackTraceElement) {
            return stackTraceElement.getFileName() + ':' + stackTraceElement.getLineNumber() + ' ' + stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
        }
    }

    /* renamed from: a */
    private final void m4294a(String message, String detail) {
    }

    /* renamed from: a */
    public static /* synthetic */ void m4295a(C49029a c49029a, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = c49029a.m4297c();
        }
        if ((i & 16) != 0) {
            str5 = c49029a.m4296b();
        }
        if ((i & 32) != 0) {
            str6 = c49029a.m4293a();
        }
        c49029a.m4299a(str, str2, str3, str4, str5, str6);
    }

    /* renamed from: b */
    private final String m4296b() {
        try {
            Result.Companion companion = Result.INSTANCE;
            String methodName = m4298d().getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "traceElement.methodName");
            return methodName;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                return "UnknownFile";
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            Object obj = (Void) objM28550constructorimpl;
            return obj != null ? (String) obj : "";
        }
    }

    /* renamed from: c */
    private final String m4297c() {
        try {
            Result.Companion companion = Result.INSTANCE;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            return ArraysKt.joinToString$default(stackTrace, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f8507a, 31, (Object) null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                return "UnknownStackTrace";
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            Object obj = (Void) objM28550constructorimpl;
            return obj != null ? (String) obj : "";
        }
    }

    /* renamed from: d */
    private final StackTraceElement m4298d() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[RangesKt.coerceAtMost(r0.length - 1, 2)];
        Intrinsics.checkNotNullExpressionValue(stackTraceElement, "stackTrace[index]");
        return stackTraceElement;
    }

    /* renamed from: a */
    public final void m4299a(String message, String detail, String additionalDetails, String stackTrace, String callingMethod, String callingFile) throws JSONException {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(callingMethod, "callingMethod");
        Intrinsics.checkNotNullParameter(callingFile, "callingFile");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", detail);
        jSONObject.put("stack", stackTrace);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("device.name", Build.MODEL);
        jSONObject2.put("device.OSVersion", Build.VERSION.RELEASE);
        JSONObject jSONObject3 = new JSONObject();
        if (additionalDetails == null) {
            additionalDetails = "";
        }
        jSONObject3.put("additional.details", additionalDetails);
        jSONObject3.put("method", callingMethod);
        jSONObject3.put("file", callingFile);
        jSONObject3.put("tags", jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("action", message);
        jSONObject4.put("err", jSONObject);
        jSONObject4.put(com.adjust.sdk.Constants.REFERRER_API_META, jSONObject3);
        C48999g c48999g = C48999g.f8243a;
        String visitorIdentifierString = c48999g.getVisitorIdentifierString();
        if (visitorIdentifierString == null) {
            visitorIdentifierString = "(no vid)";
        }
        jSONObject4.put("vid", visitorIdentifierString);
        jSONObject4.put("envId", c48999g.m4107m());
        Map<String, String> mapMapOf = MapsKt.mapOf(Tuples4.m3642to("x-ul-error", "userleap-" + System.currentTimeMillis() + "-error"));
        try {
            Result.Companion companion = Result.INSTANCE;
            C48990a c48990a = this.networkService;
            String str = this.errorsPath;
            String string2 = jSONObject4.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "body.toString()");
            objM28550constructorimpl = Result.m28550constructorimpl(c48990a.m4021a(str, string2, mapMapOf));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            m4294a("Failed to send error report", thM28553exceptionOrNullimpl.getMessage());
        }
    }

    /* renamed from: a */
    private final String m4293a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            String fileName = m4298d().getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "traceElement.fileName");
            return fileName;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) != null) {
                return "UnknownFile";
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            Object obj = (Void) objM28550constructorimpl;
            if (obj != null) {
                return (String) obj;
            }
            return "";
        }
    }
}
