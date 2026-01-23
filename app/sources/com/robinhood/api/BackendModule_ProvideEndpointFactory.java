package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.targetbackend.Endpoint;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackendModule_ProvideEndpointFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/BackendModule_ProvideEndpointFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/targetbackend/Endpoint;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BackendModule_ProvideEndpointFactory implements Factory<Endpoint> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TargetBackend> targetBackend;

    @JvmStatic
    public static final BackendModule_ProvideEndpointFactory create(Provider<TargetBackend> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final Endpoint provideEndpoint(TargetBackend targetBackend) {
        return INSTANCE.provideEndpoint(targetBackend);
    }

    public BackendModule_ProvideEndpointFactory(Provider<TargetBackend> targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.targetBackend = targetBackend;
    }

    @Override // javax.inject.Provider
    public Endpoint get() {
        Companion companion = INSTANCE;
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        return companion.provideEndpoint(targetBackend);
    }

    /* compiled from: BackendModule_ProvideEndpointFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/BackendModule_ProvideEndpointFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/BackendModule_ProvideEndpointFactory;", "targetBackend", "Ljavax/inject/Provider;", "Lcom/robinhood/targetbackend/TargetBackend;", "provideEndpoint", "Lcom/robinhood/targetbackend/Endpoint;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BackendModule_ProvideEndpointFactory create(Provider<TargetBackend> targetBackend) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new BackendModule_ProvideEndpointFactory(targetBackend);
        }

        @JvmStatic
        public final Endpoint provideEndpoint(TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Object objCheckNotNull = Preconditions.checkNotNull(BackendModule.INSTANCE.provideEndpoint(targetBackend), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Endpoint) objCheckNotNull;
        }
    }
}
