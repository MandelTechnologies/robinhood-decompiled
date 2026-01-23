package moneytree.p510v1;

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

/* compiled from: InterestServiceModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lmoneytree/v1/InterestServiceModule;", "", "<init>", "()V", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lazy", "Lcom/squareup/moshi/Moshi;", "moshi", "Lmoneytree/v1/InterestServiceRetrofit;", "provideRestClient", "(Lcom/robinhood/targetbackend/TargetBackend;Ldagger/Lazy;Lcom/squareup/moshi/Moshi;)Lmoneytree/v1/InterestServiceRetrofit;", "Lmoneytree/v1/RestInterestService;", "rest", "Lmoneytree/v1/InterestService;", "provideService", "(Ldagger/Lazy;)Lmoneytree/v1/InterestService;", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "OPTIONS", "Lcom/robinhood/idl/IDLServiceOptionsDto;", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class InterestServiceModule {
    public static final InterestServiceModule INSTANCE = new InterestServiceModule();
    private static final IDLServiceOptionsDto OPTIONS = new IDLServiceOptionsDto(new IDLServiceBackendOptionsDto(BackendServiceDto.BACKEND_SERVICE_MONEYTREE, ""));

    public final InterestServiceRetrofit provideRestClient(final TargetBackend targetBackend, @IdlRetrofit final Lazy<Retrofit> lazy, @WireMoshi final Moshi moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return (InterestServiceRetrofit) LazyRetrofit3.lazyRetrofitService(InterestServiceRetrofit.class, LazyKt.daggerLazy(new Provider() { // from class: moneytree.v1.InterestServiceModule$provideRestClient$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() throws SecurityException {
                Retrofit retrofitBuild = ((Retrofit) lazy.get()).newBuilder().baseUrl(BackendServices.getUrl(targetBackend, InterestServiceModule.OPTIONS)).addConverterFactory(MoshiConverterFactory.create(moshi)).addConverterFactory(new HttpOptionAdapterFactory()).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                Object objCreate = retrofitBuild.create(InterestServiceRetrofit.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                return (T) ((InterestServiceRetrofit) objCreate);
            }
        }));
    }

    public final InterestService provideService(final Lazy<RestInterestService> rest) {
        Intrinsics.checkNotNullParameter(rest, "rest");
        return (InterestService) LazyRetrofit3.lazyRetrofitService(InterestService.class, LazyKt.daggerLazy(new Provider() { // from class: moneytree.v1.InterestServiceModule$provideService$$inlined$lazyRetrofitService$1
            @Override // javax.inject.Provider
            public final T get() {
                Object obj = rest.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (T) ((InterestService) obj);
            }
        }));
    }

    private InterestServiceModule() {
    }
}
