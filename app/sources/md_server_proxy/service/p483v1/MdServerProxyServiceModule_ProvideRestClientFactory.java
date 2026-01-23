package md_server_proxy.service.p483v1;

import com.robinhood.targetbackend.TargetBackend;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: MdServerProxyServiceModule_ProvideRestClientFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmd_server_proxy/service/v1/MdServerProxyServiceModule_ProvideRestClientFactory;", "Ldagger/internal/Factory;", "Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "Companion", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MdServerProxyServiceModule_ProvideRestClientFactory implements Factory<MdServerProxyServiceRetrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final MdServerProxyServiceRetrofit provideRestClient(TargetBackend targetBackend, Lazy<Retrofit> lazy, Moshi moshi) {
        return INSTANCE.provideRestClient(targetBackend, lazy, moshi);
    }

    /* compiled from: MdServerProxyServiceModule_ProvideRestClientFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmd_server_proxy/service/v1/MdServerProxyServiceModule_ProvideRestClientFactory$Companion;", "", "<init>", "()V", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "lazy", "Lcom/squareup/moshi/Moshi;", "moshi", "Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "provideRestClient", "(Lcom/robinhood/targetbackend/TargetBackend;Ldagger/Lazy;Lcom/squareup/moshi/Moshi;)Lmd_server_proxy/service/v1/MdServerProxyServiceRetrofit;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MdServerProxyServiceRetrofit provideRestClient(TargetBackend targetBackend, Lazy<Retrofit> lazy, Moshi moshi) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(MdServerProxyServiceModule.INSTANCE.provideRestClient(targetBackend, lazy, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (MdServerProxyServiceRetrofit) objCheckNotNull;
        }
    }
}
