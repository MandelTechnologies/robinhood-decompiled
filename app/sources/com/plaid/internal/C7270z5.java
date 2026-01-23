package com.plaid.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;

@SourceDebugExtension
/* renamed from: com.plaid.internal.z5 */
/* loaded from: classes16.dex */
public final class C7270z5 extends Lambda implements Function0<OkHttpClient.Builder> {

    /* renamed from: a */
    public final /* synthetic */ C7252x5 f3342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7270z5(C7252x5 c7252x5) {
        super(0);
        this.f3342a = c7252x5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OkHttpClient.Builder invoke() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        C7252x5 c7252x5 = this.f3342a;
        c7252x5.getClass();
        builder.addInterceptor(new C7261y5(c7252x5));
        builder.readTimeout(10L, TimeUnit.MINUTES);
        return builder;
    }
}
