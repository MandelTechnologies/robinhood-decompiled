package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.internal.core.networking.models.NetworkException;
import com.robinhood.utils.http.Headers;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@SourceDebugExtension
/* renamed from: com.plaid.internal.y5 */
/* loaded from: classes16.dex */
public final class C7261y5 implements Interceptor {

    /* renamed from: a */
    public final /* synthetic */ C7252x5 f3327a;

    public C7261y5(C7252x5 c7252x5) {
        this.f3327a = c7252x5;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        String str = this.f3327a.f3300a;
        if (str != null) {
            builderNewBuilder.addHeader(Headers.USER_AGENT, str);
        }
        Request requestBuild = builderNewBuilder.build();
        Response responseProceed = chain.proceed(requestBuild);
        if (!responseProceed.isSuccessful() && !StringsKt.contains$default((CharSequence) requestBuild.getUrl().encodedPath(), (CharSequence) "sentry", false, 2, (Object) null)) {
            int i = NetworkException.f1963c;
            NetworkException networkExceptionM1383a = NetworkException.C6060a.m1383a(requestBuild, responseProceed);
            C5953R5.a.m1302a(C5953R5.f1671a, networkExceptionM1383a, networkExceptionM1383a.f1964a);
        }
        return responseProceed;
    }
}
