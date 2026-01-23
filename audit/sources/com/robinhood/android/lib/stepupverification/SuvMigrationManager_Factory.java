package com.robinhood.android.lib.stepupverification;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.stepupverification.StepUpVerificationApi;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuvMigrationManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SuvMigrationManager_Factory implements Factory<SuvMigrationManager> {
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<StepUpVerificationApi> stepUpVerificationApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SuvMigrationManager_Factory create(Provider<ExperimentsStore> provider, Provider<StepUpVerificationApi> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final SuvMigrationManager newInstance(ExperimentsStore experimentsStore, StepUpVerificationApi stepUpVerificationApi) {
        return INSTANCE.newInstance(experimentsStore, stepUpVerificationApi);
    }

    public SuvMigrationManager_Factory(Provider<ExperimentsStore> experimentsStore, Provider<StepUpVerificationApi> stepUpVerificationApi) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
        this.experimentsStore = experimentsStore;
        this.stepUpVerificationApi = stepUpVerificationApi;
    }

    @Override // javax.inject.Provider
    public SuvMigrationManager get() {
        Companion companion = INSTANCE;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StepUpVerificationApi stepUpVerificationApi = this.stepUpVerificationApi.get();
        Intrinsics.checkNotNullExpressionValue(stepUpVerificationApi, "get(...)");
        return companion.newInstance(experimentsStore, stepUpVerificationApi);
    }

    /* compiled from: SuvMigrationManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager_Factory;", "experimentsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "stepUpVerificationApi", "Lcom/robinhood/api/stepupverification/StepUpVerificationApi;", "newInstance", "Lcom/robinhood/android/lib/stepupverification/SuvMigrationManager;", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SuvMigrationManager_Factory create(Provider<ExperimentsStore> experimentsStore, Provider<StepUpVerificationApi> stepUpVerificationApi) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
            return new SuvMigrationManager_Factory(experimentsStore, stepUpVerificationApi);
        }

        @JvmStatic
        public final SuvMigrationManager newInstance(ExperimentsStore experimentsStore, StepUpVerificationApi stepUpVerificationApi) {
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stepUpVerificationApi, "stepUpVerificationApi");
            return new SuvMigrationManager(experimentsStore, stepUpVerificationApi);
        }
    }
}
