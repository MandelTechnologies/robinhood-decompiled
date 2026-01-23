package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcEquityService_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService;", "grpcClient", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class GrpcEquityService_Factory implements Factory<GrpcEquityService> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EquityServiceClient> grpcClient;

    @JvmStatic
    public static final GrpcEquityService_Factory create(Provider<EquityServiceClient> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final GrpcEquityService newInstance(EquityServiceClient equityServiceClient) {
        return INSTANCE.newInstance(equityServiceClient);
    }

    public GrpcEquityService_Factory(Provider<EquityServiceClient> grpcClient) {
        Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
        this.grpcClient = grpcClient;
    }

    @Override // javax.inject.Provider
    public GrpcEquityService get() {
        Companion companion = INSTANCE;
        EquityServiceClient equityServiceClient = this.grpcClient.get();
        Intrinsics.checkNotNullExpressionValue(equityServiceClient, "get(...)");
        return companion.newInstance(equityServiceClient);
    }

    /* compiled from: GrpcEquityService_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService_Factory;", "grpcClient", "Ljavax/inject/Provider;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityServiceClient;", "newInstance", "Lcom/robinhood/arsenal/proto/v1/idl/GrpcEquityService;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GrpcEquityService_Factory create(Provider<EquityServiceClient> grpcClient) {
            Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
            return new GrpcEquityService_Factory(grpcClient);
        }

        @JvmStatic
        public final GrpcEquityService newInstance(EquityServiceClient grpcClient) {
            Intrinsics.checkNotNullParameter(grpcClient, "grpcClient");
            return new GrpcEquityService(grpcClient);
        }
    }
}
