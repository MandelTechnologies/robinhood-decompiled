package gold.proto.p464v1;

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

/* compiled from: GoldServiceModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lgold/proto/v1/GoldServiceModule;", "", "<init>", "()V", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lazy", "Lcom/squareup/moshi/Moshi;", "moshi", "Lgold/proto/v1/GoldServiceRetrofit;", "provideRestClient", "(Lcom/robinhood/targetbackend/TargetBackend;Ldagger/Lazy;Lcom/squareup/moshi/Moshi;)Lgold/proto/v1/GoldServiceRetrofit;", "Lgold/proto/v1/RestGoldService;", "rest", "Lgold/proto/v1/GoldService;", "provideService", "(Ldagger/Lazy;)Lgold/proto/v1/GoldService;", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "OPTIONS", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class GoldServiceModule {
    public static final GoldServiceModule INSTANCE = new GoldServiceModule();
    private static final IDLServiceOptionsDto OPTIONS = new IDLServiceOptionsDto(new IDLServiceBackendOptionsDto(BackendServiceDto.BACKEND_SERVICE_BONFIRE, ""));

    public final GoldServiceRetrofit provideRestClient(final TargetBackend targetBackend, @IdlRetrofit final Lazy<Retrofit> lazy, @WireMoshi final Moshi moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (GoldServiceRetrofit) LazyRetrofit3.lazyRetrofitService(GoldServiceRetrofit.class, LazyKt.daggerLazy(new Provider() { // from class: gold.proto.v1.GoldServiceModule$provideRestClient$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                Retrofit retrofitBuild = ((Retrofit) lazy.get()).newBuilder().baseUrl(BackendServices.getUrl(targetBackend, GoldServiceModule.OPTIONS)).addConverterFactory(MoshiConverterFactory.create(moshi)).addConverterFactory(new HttpOptionAdapterFactory()).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(GoldServiceRetrofit.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((GoldServiceRetrofit) objCreate);
            }
        }));
    }

    public final GoldService provideService(final Lazy<RestGoldService> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        return (GoldService) LazyRetrofit3.lazyRetrofitService(GoldService.class, LazyKt.daggerLazy(new Provider() { // from class: gold.proto.v1.GoldServiceModule$provideService$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = rest.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (T) ((GoldService) obj);
            }
        }));
    }

    private GoldServiceModule() {
    }
}
