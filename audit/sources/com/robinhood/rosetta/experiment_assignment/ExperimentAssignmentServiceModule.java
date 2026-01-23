package com.robinhood.rosetta.experiment_assignment;

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

/* compiled from: ExperimentAssignmentServiceModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceModule;", "", "<init>", "()V", "OPTIONS", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "provideRestClient", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceRetrofit;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideGrpcClient", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentServiceClient;", "Lokhttp3/OkHttpClient;", "provideService", "Lcom/robinhood/rosetta/experiment_assignment/ExperimentAssignmentService;", "rest", "Lcom/robinhood/rosetta/experiment_assignment/RestExperimentAssignmentService;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ExperimentAssignmentServiceModule {
    public static final ExperimentAssignmentServiceModule INSTANCE = new ExperimentAssignmentServiceModule();
    private static final IDLServiceOptionsDto OPTIONS = new IDLServiceOptionsDto(new IDLServiceBackendOptionsDto(BackendServiceDto.BACKEND_SERVICE_EXPERIMENTS, ""));

    public final ExperimentAssignmentServiceRetrofit provideRestClient(final TargetBackend targetBackend, @IdlRetrofit final Lazy<Retrofit> lazy, @WireMoshi final Moshi moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (ExperimentAssignmentServiceRetrofit) LazyRetrofit3.lazyRetrofitService(ExperimentAssignmentServiceRetrofit.class, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceModule$provideRestClient$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                Retrofit retrofitBuild = ((Retrofit) lazy.get()).newBuilder().baseUrl(BackendServices.getUrl(targetBackend, ExperimentAssignmentServiceModule.OPTIONS)).addConverterFactory(MoshiConverterFactory.create(moshi)).addConverterFactory(new HttpOptionAdapterFactory()).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(ExperimentAssignmentServiceRetrofit.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((ExperimentAssignmentServiceRetrofit) objCreate);
            }
        }));
    }

    public final ExperimentAssignmentService provideService(final Lazy<RestExperimentAssignmentService> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        return (ExperimentAssignmentService) LazyRetrofit3.lazyRetrofitService(ExperimentAssignmentService.class, LazyKt.daggerLazy(new Provider() { // from class: com.robinhood.rosetta.experiment_assignment.ExperimentAssignmentServiceModule$provideService$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = rest.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (T) ((ExperimentAssignmentService) obj);
            }
        }));
    }

    private ExperimentAssignmentServiceModule() {
    }

    public final ExperimentAssignmentServiceClient provideGrpcClient(TargetBackend targetBackend, @IdlOkHttpClient Lazy<OkHttpClient> lazy) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        return (ExperimentAssignmentServiceClient) GrpcClients.client(new GrpcClient.Builder(), lazy).baseUrl(BackendServices.getUrl(targetBackend, OPTIONS)).minMessageToCompress(Long.MAX_VALUE).build().create(Reflection.getOrCreateKotlinClass(ExperimentAssignmentServiceClient.class));
    }
}
