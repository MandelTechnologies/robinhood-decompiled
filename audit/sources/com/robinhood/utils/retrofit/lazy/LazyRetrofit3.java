package com.robinhood.utils.retrofit.lazy;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.dagger.LazyKt;
import dagger.Lazy;
import dagger.internal.Provider;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/* compiled from: LazyRetrofit.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a-\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\f\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u000f\u001a$\u0010\f\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\u0006H\u0086\b¢\u0006\u0002\u0010\u0010\u001a5\u0010\f\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013\u001a,\u0010\f\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\b¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m3636d2 = {"lazyRetrofitService", "T", "", "type", "Ljava/lang/Class;", "lazy", "Ldagger/Lazy;", "(Ljava/lang/Class;Ldagger/Lazy;)Ljava/lang/Object;", "initializer", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lretrofit2/Retrofit;", "service", "(Ldagger/Lazy;Ljava/lang/Class;)Ljava/lang/Object;", "(Ldagger/Lazy;)Ljava/lang/Object;", "path", "", "(Ldagger/Lazy;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "(Ldagger/Lazy;Ljava/lang/String;)Ljava/lang/Object;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.retrofit.lazy.LazyRetrofitKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class LazyRetrofit3 {
    public static final <T> T create(final Lazy<Retrofit> lazy, final Class<T> service) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(service, "service");
        return (T) lazyRetrofitService(service, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.utils.retrofit.lazy.LazyRetrofitKt$create$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                T t = (T) ((Retrofit) lazy.get()).create(service);
                Intrinsics.checkNotNullExpressionValue(t, "create(...)");
                return t;
            }
        }));
    }

    public static final <T> T create(final Lazy<Retrofit> lazy, final Class<T> type2, final String path) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(path, "path");
        return (T) lazyRetrofitService(type2, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.utils.retrofit.lazy.LazyRetrofitKt$create$$inlined$lazyRetrofitService$2
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = lazy.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                Retrofit retrofit = (Retrofit) obj;
                HttpUrl httpUrlBaseUrl = retrofit.baseUrl();
                HttpUrl.Builder builderNewBuilder = httpUrlBaseUrl.newBuilder(path);
                if (builderNewBuilder == null) {
                    throw new IllegalArgumentException(("Cannot resolve link '" + path + "' from original URL '" + httpUrlBaseUrl + "'").toString());
                }
                T t = (T) retrofit.newBuilder().baseUrl(builderNewBuilder.build()).build().create(type2);
                Intrinsics.checkNotNullExpressionValue(t, "create(...)");
                return t;
            }
        }));
    }

    public static final <T> T lazyRetrofitService(Class<T> type2, Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return (T) lazyRetrofitService(type2, LazyKt.daggerLazy(new LazyRetrofitKt$lazyRetrofitService$$inlined$daggerLazy$1(initializer)));
    }

    public static final <T> T lazyRetrofitService(Class<T> type2, Lazy<? extends T> lazy) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        if (!type2.isInterface()) {
            throw new IllegalArgumentException(("Retrofit service type must be an interface: " + type2).toString());
        }
        T t = (T) Proxy.newProxyInstance(type2.getClassLoader(), new Class[]{type2}, new LazyRetrofit(lazy));
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.robinhood.utils.retrofit.lazy.LazyRetrofitKt.lazyRetrofitService");
        return t;
    }

    public static final /* synthetic */ <T> T lazyRetrofitService(Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) lazyRetrofitService(Object.class, LazyKt.daggerLazy(new LazyRetrofitKt$lazyRetrofitService$$inlined$daggerLazy$1(initializer)));
    }

    public static final /* synthetic */ <T> T create(Lazy<Retrofit> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) create(lazy, Object.class);
    }

    public static final /* synthetic */ <T> T create(Lazy<Retrofit> lazy, String path) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) create(lazy, Object.class, path);
    }
}
