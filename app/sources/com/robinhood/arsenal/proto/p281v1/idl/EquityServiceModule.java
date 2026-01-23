package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.idl.common.GrpcClients;
import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.WireMoshi;
import com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory;
import com.robinhood.idl.BackendServiceDto;
import com.robinhood.idl.BackendServices;
import com.robinhood.idl.IDLServiceBackendOptionsDto;
import com.robinhood.idl.IDLServiceOptionsDto;
import com.robinhood.idl.annotation.IdlOkHttpClient;
import com.robinhood.idl.annotation.IdlRetrofit;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.dagger.LazyKt;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import com.squareup.moshi.Moshi;
import com.squareup.wire.GrpcClient;
import dagger.Lazy;
import dagger.internal.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: EquityServiceModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceModule;", "", "<init>", "()V", "OPTIONS", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "provideRestClient", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceRetrofit;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideGrpcClient", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "Lokhttp3/OkHttpClient;", "provideService", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "rest", "Lcom/robinhood/arsenal/proto/v1/idl/RestEquityService;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class EquityServiceModule {
    public static final EquityServiceModule INSTANCE = new EquityServiceModule();
    private static final IDLServiceOptionsDto OPTIONS = new IDLServiceOptionsDto(new IDLServiceBackendOptionsDto(BackendServiceDto.BACKEND_SERVICE_ARSENAL, ""));

    public final EquityServiceRetrofit provideRestClient(final TargetBackend targetBackend, @IdlRetrofit final Lazy<Retrofit> lazy, @WireMoshi final Moshi moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (EquityServiceRetrofit) LazyRetrofit3.lazyRetrofitService(EquityServiceRetrofit.class, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.arsenal.proto.v1.idl.EquityServiceModule$provideRestClient$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                Retrofit retrofitBuild = ((Retrofit) lazy.get()).newBuilder().baseUrl(BackendServices.getUrl(targetBackend, EquityServiceModule.OPTIONS)).addConverterFactory(MoshiConverterFactory.create(moshi)).addConverterFactory(new HttpOptionAdapterFactory()).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(EquityServiceRetrofit.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((EquityServiceRetrofit) objCreate);
            }
        }));
    }

    public final EquityService provideService(final Lazy<RestEquityService> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        return (EquityService) LazyRetrofit3.lazyRetrofitService(EquityService.class, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.arsenal.proto.v1.idl.EquityServiceModule$provideService$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = rest.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (T) ((EquityService) obj);
            }
        }));
    }

    private EquityServiceModule() {
    }

    public final EquityServiceClient provideGrpcClient(TargetBackend targetBackend, @IdlOkHttpClient Lazy<OkHttpClient> lazy) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return (EquityServiceClient) GrpcClients.client(new GrpcClient.Builder(), lazy).baseUrl(BackendServices.getUrl(targetBackend, OPTIONS)).minMessageToCompress(Long.MAX_VALUE).build().create(Reflection.getOrCreateKotlinClass(EquityServiceClient.class));
    }
}
