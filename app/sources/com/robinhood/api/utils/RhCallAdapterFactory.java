package com.robinhood.api.utils;

import com.robinhood.utils.LogoutKillswitch;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0002\u0010\u0014J5\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/api/utils/RhCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "throwableTransformer", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "<init>", "(Lcom/robinhood/utils/LogoutKillswitch;Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;)V", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "kotlin.jvm.PlatformType", "get", "Lretrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "createRxAdapter", "createCoroutinesAdapter", "ThrowableTransformer", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhCallAdapterFactory extends CallAdapter.Factory {
    private final LogoutKillswitch logoutKillswitch;
    private final RxJava2CallAdapterFactory rxJava2CallAdapterFactory;
    private final ThrowableTransformer throwableTransformer;

    /* compiled from: RhCallAdapterFactory.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "", "transform", "", "request", "Lokhttp3/Request;", "throwable", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ThrowableTransformer {
        Throwable transform(Request request, Throwable throwable);
    }

    public RhCallAdapterFactory(LogoutKillswitch logoutKillswitch, ThrowableTransformer throwableTransformer) {
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(throwableTransformer, "throwableTransformer");
        this.logoutKillswitch = logoutKillswitch;
        this.throwableTransformer = throwableTransformer;
        this.rxJava2CallAdapterFactory = RxJava2CallAdapterFactory.create();
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        CallAdapter<?, ?> callAdapterCreateRxAdapter = createRxAdapter(returnType, annotations, retrofit);
        if (callAdapterCreateRxAdapter != null) {
            return callAdapterCreateRxAdapter;
        }
        CallAdapter<?, ?> callAdapterCreateCoroutinesAdapter = createCoroutinesAdapter(returnType);
        if (callAdapterCreateCoroutinesAdapter != null) {
            return callAdapterCreateCoroutinesAdapter;
        }
        return null;
    }

    private final CallAdapter<?, ?> createRxAdapter(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        CallAdapter<?, ?> callAdapter = this.rxJava2CallAdapterFactory.get(returnType, annotations, retrofit);
        if (callAdapter == null) {
            return null;
        }
        Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(returnType);
        if (Intrinsics.areEqual(rawType, Observable.class)) {
            return new RhCallAdapterFactory6(callAdapter, this.logoutKillswitch, this.throwableTransformer);
        }
        if (Intrinsics.areEqual(rawType, Single.class)) {
            return new RhCallAdapterFactory9(callAdapter, this.logoutKillswitch, this.throwableTransformer);
        }
        return Intrinsics.areEqual(rawType, Maybe.class) ? new RhCallAdapterFactory5(callAdapter, this.logoutKillswitch, this.throwableTransformer) : callAdapter;
    }

    private final CallAdapter<?, ?> createCoroutinesAdapter(Type returnType) {
        if (!(returnType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) returnType;
        if (!Intrinsics.areEqual(parameterizedType.getRawType(), Call.class)) {
            return null;
        }
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, parameterizedType);
        Intrinsics.checkNotNull(parameterUpperBound);
        return new RhCallAdapterFactory2(parameterUpperBound, this.logoutKillswitch.getLoggedInScope(), this.throwableTransformer);
    }
}
