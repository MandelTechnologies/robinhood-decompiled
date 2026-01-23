package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.TargetBackend;
import com.squareup.moshi.Moshi;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* compiled from: InstrumentServiceModule_ProvideRestClientFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceModule_ProvideRestClientFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceRetrofit;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class InstrumentServiceModule_ProvideRestClientFactory implements Factory<InstrumentServiceRetrofit> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Retrofit> lazy;
    private final Provider<Moshi> moshi;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final InstrumentServiceModule_ProvideRestClientFactory create(Provider<TargetBackend> provider, Provider<Retrofit> provider2, Provider<Moshi> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final InstrumentServiceRetrofit provideRestClient(TargetBackend targetBackend, Lazy<Retrofit> lazy, Moshi moshi) {
        return INSTANCE.provideRestClient(targetBackend, lazy, moshi);
    }

    public InstrumentServiceModule_ProvideRestClientFactory(Provider<TargetBackend> targetBackend, Provider<Retrofit> lazy, Provider<Moshi> moshi) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.targetBackend = targetBackend;
        this.lazy = lazy;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public InstrumentServiceRetrofit get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        Lazy<Retrofit> lazy = DoubleCheck.lazy(this.lazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Moshi moshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(moshi, "get(...)");
        return companion.provideRestClient(targetBackend, lazy, moshi);
    }

    /* compiled from: InstrumentServiceModule_ProvideRestClientFactory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007H\u0007J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u00102\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceModule_ProvideRestClientFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceModule_ProvideRestClientFactory;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Lretrofit2/Retrofit;", "Lkotlin/jvm/JvmSuppressWildcards;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideRestClient", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentServiceRetrofit;", "Ldagger/Lazy;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentServiceModule_ProvideRestClientFactory create(Provider<TargetBackend> targetBackend, Provider<Retrofit> lazy, Provider<Moshi> moshi) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new InstrumentServiceModule_ProvideRestClientFactory(targetBackend, lazy, moshi);
        }

        @JvmStatic
        public final InstrumentServiceRetrofit provideRestClient(TargetBackend targetBackend, Lazy<Retrofit> lazy, Moshi moshi) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(InstrumentServiceModule.INSTANCE.provideRestClient(targetBackend, lazy, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InstrumentServiceRetrofit) objCheckNotNull;
        }
    }
}
