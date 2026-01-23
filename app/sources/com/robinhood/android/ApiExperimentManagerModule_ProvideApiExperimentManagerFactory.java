package com.robinhood.android;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.utils.ApiExperimentManager;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiExperimentManagerModule_ProvideApiExperimentManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/ApiExperimentManagerModule_ProvideApiExperimentManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/utils/ApiExperimentManager;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ApiExperimentManagerModule_ProvideApiExperimentManagerFactory implements Factory<ApiExperimentManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ExperimentsStore> experimentsStore;

    @JvmStatic
    public static final ApiExperimentManagerModule_ProvideApiExperimentManagerFactory create(Provider<ExperimentsStore> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ApiExperimentManager provideApiExperimentManager(ExperimentsStore experimentsStore) {
        return INSTANCE.provideApiExperimentManager(experimentsStore);
    }

    public ApiExperimentManagerModule_ProvideApiExperimentManagerFactory(Provider<ExperimentsStore> experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.experimentsStore = experimentsStore;
    }

    @Override // javax.inject.Provider
    public ApiExperimentManager get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        return companion.provideApiExperimentManager(experimentsStore);
    }

    /* compiled from: ApiExperimentManagerModule_ProvideApiExperimentManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/ApiExperimentManagerModule_ProvideApiExperimentManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/ApiExperimentManagerModule_ProvideApiExperimentManagerFactory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "provideApiExperimentManager", "Lcom/robinhood/api/utils/ApiExperimentManager;", "lib-experiments-store-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ApiExperimentManagerModule_ProvideApiExperimentManagerFactory create(Provider<ExperimentsStore> experimentsStore) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            return new ApiExperimentManagerModule_ProvideApiExperimentManagerFactory(experimentsStore);
        }

        @JvmStatic
        public final ApiExperimentManager provideApiExperimentManager(ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Object objCheckNotNull = Preconditions.checkNotNull(ApiExperimentManagerModule.INSTANCE.provideApiExperimentManager(experimentsStore), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ApiExperimentManager) objCheckNotNull;
        }
    }
}
