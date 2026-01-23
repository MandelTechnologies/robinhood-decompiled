package com.robinhood.android.regiongate;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.regiongate.annotation.RequiresRegionGate;
import com.robinhood.utils.http.HttpStatusCode;
import com.robinhood.utils.logging.CrashReporter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Invocation;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/* compiled from: RegionGateInterceptor.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/regiongate/RegionGateInterceptor;", "Lokhttp3/Interceptor;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "regionGateAnnotation", "Lcom/robinhood/android/regiongate/annotation/RequiresRegionGate;", "Lokhttp3/Request;", "getRegionGateAnnotation", "(Lokhttp3/Request;)Lcom/robinhood/android/regiongate/annotation/RequiresRegionGate;", "retrofitUrl", "", "getRetrofitUrl", "(Lokhttp3/Request;)Ljava/lang/String;", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RegionGateInterceptor implements Interceptor {
    private final RegionGateProvider regionGateProvider;

    public RegionGateInterceptor(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.regionGateProvider = regionGateProvider;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequiresRegionGate regionGateAnnotation = getRegionGateAnnotation(request);
        if (regionGateAnnotation != null) {
            List list = (List) BuildersKt__BuildersKt.runBlocking$default(null, new RegionGateInterceptor2(regionGateAnnotation, this, null), 1, null);
            if (list.isEmpty()) {
                return chain.proceed(request);
            }
            if (regionGateAnnotation.logIfNotInRegionGate()) {
                String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.android.regiongate.RegionGateInterceptor$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RegionGateInterceptor.intercept$lambda$0((RegionGate) obj);
                    }
                }, 30, null);
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RegionGateExceptions2("Trying to access " + getRetrofitUrl(request) + " but user does not have access to " + strJoinToString$default), true, null, 4, null);
            }
            return new Response.Builder().request(request).code(HttpStatusCode.FORBIDDEN).protocol(Protocol.HTTP_1_1).message(getRetrofitUrl(request) + " is not available ").body(ResponseBody.INSTANCE.create("", MediaType.INSTANCE.get("application/json"))).build();
        }
        return chain.proceed(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence intercept$lambda$0(RegionGate regionGate) {
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        String simpleName = regionGate.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private final RequiresRegionGate getRegionGateAnnotation(Request request) {
        Method method;
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation == null || (method = invocation.method()) == null) {
            return null;
        }
        return (RequiresRegionGate) method.getAnnotation(RequiresRegionGate.class);
    }

    private final String getRetrofitUrl(Request request) {
        Method method;
        Annotation[] annotations;
        String strValue;
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation != null && (method = invocation.method()) != null && (annotations = method.getAnnotations()) != null) {
            int length = annotations.length;
            int i = 0;
            while (true) {
                strValue = null;
                if (i >= length) {
                    break;
                }
                Annotation annotation = annotations[i];
                if (annotation instanceof POST) {
                    strValue = ((POST) annotation).value();
                } else if (annotation instanceof PUT) {
                    strValue = ((PUT) annotation).value();
                } else if (annotation instanceof GET) {
                    strValue = ((GET) annotation).value();
                } else if (annotation instanceof PATCH) {
                    strValue = ((PATCH) annotation).value();
                } else if (annotation instanceof HEAD) {
                    strValue = ((HEAD) annotation).value();
                } else if (annotation instanceof OPTIONS) {
                    strValue = ((OPTIONS) annotation).value();
                }
                if (strValue != null) {
                    break;
                }
                i++;
            }
            return strValue != null ? strValue : "Unknown endpoint";
        }
        return "Unknown endpoint";
    }
}
