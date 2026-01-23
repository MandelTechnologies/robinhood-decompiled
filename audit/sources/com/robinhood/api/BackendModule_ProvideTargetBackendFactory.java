package com.robinhood.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.TargetBackendFactory;
import com.robinhood.targetbackend.TargetBackend;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackendModule_ProvideTargetBackendFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/api/BackendModule_ProvideTargetBackendFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackendFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/api/utils/TargetBackendFactory;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BackendModule_ProvideTargetBackendFactory implements Factory<TargetBackend> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TargetBackendFactory> targetBackendFactory;

    @JvmStatic
    public static final BackendModule_ProvideTargetBackendFactory create(Provider<TargetBackendFactory> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final TargetBackend provideTargetBackend(TargetBackendFactory targetBackendFactory) {
        return INSTANCE.provideTargetBackend(targetBackendFactory);
    }

    public BackendModule_ProvideTargetBackendFactory(Provider<TargetBackendFactory> targetBackendFactory) {
        Intrinsics.checkNotNullParameter(targetBackendFactory, "targetBackendFactory");
        this.targetBackendFactory = targetBackendFactory;
    }

    @Override // javax.inject.Provider
    public TargetBackend get() {
        Companion companion = INSTANCE;
        TargetBackendFactory targetBackendFactory = this.targetBackendFactory.get();
        Intrinsics.checkNotNullExpressionValue(targetBackendFactory, "get(...)");
        return companion.provideTargetBackend(targetBackendFactory);
    }

    /* compiled from: BackendModule_ProvideTargetBackendFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/BackendModule_ProvideTargetBackendFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/api/BackendModule_ProvideTargetBackendFactory;", "targetBackendFactory", "Ljavax/inject/Provider;", "Lcom/robinhood/api/utils/TargetBackendFactory;", "provideTargetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BackendModule_ProvideTargetBackendFactory create(Provider<TargetBackendFactory> targetBackendFactory) {
            Intrinsics.checkNotNullParameter(targetBackendFactory, "targetBackendFactory");
            return new BackendModule_ProvideTargetBackendFactory(targetBackendFactory);
        }

        @JvmStatic
        public final TargetBackend provideTargetBackend(TargetBackendFactory targetBackendFactory) {
            Intrinsics.checkNotNullParameter(targetBackendFactory, "targetBackendFactory");
            Object objCheckNotNull = Preconditions.checkNotNull(BackendModule.INSTANCE.provideTargetBackend(targetBackendFactory), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (TargetBackend) objCheckNotNull;
        }
    }
}
