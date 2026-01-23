package com.plaid.internal;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import javax.net.SocketFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.protobuf.ProtoConverterFactory;

@SourceDebugExtension
/* renamed from: com.plaid.internal.x5 */
/* loaded from: classes16.dex */
public final class C7252x5 {

    /* renamed from: d */
    public static final a f3298d = new a();

    /* renamed from: e */
    public static volatile C7252x5 f3299e;

    /* renamed from: a */
    public final String f3300a;

    /* renamed from: b */
    public final LinkedHashMap f3301b = new LinkedHashMap();

    /* renamed from: c */
    public final Lazy f3302c = LazyKt.lazy(new C7270z5(this));

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.x5$a */
    public static final class a {
        /* renamed from: a */
        public final C7252x5 m1655a(String str) {
            C7252x5 c7252x5;
            C7252x5 c7252x52 = C7252x5.f3299e;
            if (c7252x52 != null) {
                return c7252x52;
            }
            synchronized (this) {
                c7252x5 = C7252x5.f3299e;
                if (c7252x5 == null) {
                    c7252x5 = new C7252x5(str);
                    C7252x5.f3299e = c7252x5;
                }
            }
            return c7252x5;
        }
    }

    public C7252x5(String str) {
        this.f3300a = str;
    }

    /* renamed from: a */
    public final Retrofit m1654a(String baseUrl, C5798A5 options) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Retrofit retrofit = (Retrofit) this.f3301b.get(baseUrl);
        if (retrofit != null) {
            return retrofit;
        }
        OkHttpClient.Builder builder = (OkHttpClient.Builder) this.f3302c.getValue();
        SocketFactory socketFactory = options.f1232b;
        if (socketFactory != null) {
            builder.socketFactory(socketFactory);
        }
        Gson gson = options.f1231a;
        GsonConverterFactory gsonConverterFactoryCreate = gson == null ? GsonConverterFactory.create() : GsonConverterFactory.create(gson);
        Retrofit.Builder builderAddCallAdapterFactory = new Retrofit.Builder().client(((OkHttpClient.Builder) this.f3302c.getValue()).build()).addCallAdapterFactory(new C5956S());
        Intrinsics.checkNotNullExpressionValue(builderAddCallAdapterFactory, "addCallAdapterFactory(...)");
        builderAddCallAdapterFactory.baseUrl(baseUrl);
        builderAddCallAdapterFactory.addConverterFactory(ProtoConverterFactory.create());
        builderAddCallAdapterFactory.addConverterFactory(gsonConverterFactoryCreate);
        Retrofit retrofitBuild = builderAddCallAdapterFactory.build();
        LinkedHashMap linkedHashMap = this.f3301b;
        Intrinsics.checkNotNull(retrofitBuild);
        linkedHashMap.put(baseUrl, retrofitBuild);
        return retrofitBuild;
    }
}
