package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.TargetBackend;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: InsightServiceModule_ProvideGrpcClientFactory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB(\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0011\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightServiceModule_ProvideGrpcClientFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/copilot/proto/v1/InsightServiceClient;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InsightServiceModule_ProvideGrpcClientFactory implements Factory<InsightServiceClient> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<OkHttpClient> lazy;
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final InsightServiceModule_ProvideGrpcClientFactory create(Provider<TargetBackend> provider, Provider<OkHttpClient> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final InsightServiceClient provideGrpcClient(TargetBackend targetBackend, Lazy<OkHttpClient> lazy) {
        return INSTANCE.provideGrpcClient(targetBackend, lazy);
    }

    public InsightServiceModule_ProvideGrpcClientFactory(Provider<TargetBackend> targetBackend, Provider<OkHttpClient> lazy) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        this.targetBackend = targetBackend;
        this.lazy = lazy;
    }

    @Override // javax.inject.Provider
    public InsightServiceClient get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        Lazy<OkHttpClient> lazy = DoubleCheck.lazy(this.lazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.provideGrpcClient(targetBackend, lazy);
    }

    /* compiled from: InsightServiceModule_ProvideGrpcClientFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0007H\u0007J#\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u000eH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightServiceModule_ProvideGrpcClientFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/copilot/proto/v1/InsightServiceModule_ProvideGrpcClientFactory;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "lazy", "Lokhttp3/OkHttpClient;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideGrpcClient", "Lcom/robinhood/copilot/proto/v1/InsightServiceClient;", "Ldagger/Lazy;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InsightServiceModule_ProvideGrpcClientFactory create(Provider<TargetBackend> targetBackend, Provider<OkHttpClient> lazy) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            return new InsightServiceModule_ProvideGrpcClientFactory(targetBackend, lazy);
        }

        @JvmStatic
        public final InsightServiceClient provideGrpcClient(TargetBackend targetBackend, Lazy<OkHttpClient> lazy) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(lazy, "lazy");
            Object objCheckNotNull = Preconditions.checkNotNull(InsightServiceModule.INSTANCE.provideGrpcClient(targetBackend, lazy), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (InsightServiceClient) objCheckNotNull;
        }
    }
}
