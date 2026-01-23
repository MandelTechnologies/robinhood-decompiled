package nimbus.service.p511v1;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.WireMoshi;
import com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory;
import com.robinhood.idl.BackendServiceDto;
import com.robinhood.idl.BackendServices;
import com.robinhood.idl.IDLServiceBackendOptionsDto;
import com.robinhood.idl.IDLServiceOptionsDto;
import com.robinhood.idl.annotation.IdlRetrofit;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.dagger.LazyKt;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import dagger.internal.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: NimbusServiceModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lnimbus/service/v1/NimbusServiceModule;", "", "<init>", "()V", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lazy", "Lcom/squareup/moshi/Moshi;", "moshi", "Lnimbus/service/v1/NimbusServiceRetrofit;", "provideRestClient", "(Lcom/robinhood/targetbackend/TargetBackend;Ldagger/Lazy;Lcom/squareup/moshi/Moshi;)Lnimbus/service/v1/NimbusServiceRetrofit;", "Lnimbus/service/v1/RestNimbusService;", "rest", "Lnimbus/service/v1/NimbusService;", "provideService", "(Ldagger/Lazy;)Lnimbus/service/v1/NimbusService;", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "OPTIONS", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class NimbusServiceModule {
    public static final NimbusServiceModule INSTANCE = new NimbusServiceModule();
    private static final IDLServiceOptionsDto OPTIONS = new IDLServiceOptionsDto(new IDLServiceBackendOptionsDto(BackendServiceDto.BACKEND_SERVICE_NIMBUS, ""));

    public final NimbusServiceRetrofit provideRestClient(final TargetBackend targetBackend, @IdlRetrofit final Lazy<Retrofit> lazy, @WireMoshi final Moshi moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (NimbusServiceRetrofit) LazyRetrofit3.lazyRetrofitService(NimbusServiceRetrofit.class, LazyKt.daggerLazy(new Provider() { // from class: nimbus.service.v1.NimbusServiceModule$provideRestClient$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                Retrofit retrofitBuild = ((Retrofit) lazy.get()).newBuilder().baseUrl(BackendServices.getUrl(targetBackend, NimbusServiceModule.OPTIONS)).addConverterFactory(MoshiConverterFactory.create(moshi)).addConverterFactory(new HttpOptionAdapterFactory()).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(NimbusServiceRetrofit.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((NimbusServiceRetrofit) objCreate);
            }
        }));
    }

    public final NimbusService provideService(final Lazy<RestNimbusService> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        return (NimbusService) LazyRetrofit3.lazyRetrofitService(NimbusService.class, LazyKt.daggerLazy(new Provider() { // from class: nimbus.service.v1.NimbusServiceModule$provideService$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = rest.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (T) ((NimbusService) obj);
            }
        }));
    }

    private NimbusServiceModule() {
    }
}
