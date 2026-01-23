package microgram.android.internal.bundle;

import com.robinhood.work.PeriodicWorker;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StalePackageCleanupWorkerModule_ProvideFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/StalePackageCleanupWorkerModule_ProvideFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "provide", "()Lcom/robinhood/work/PeriodicWorker;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StalePackageCleanupWorkerModule_ProvideFactory implements Factory<PeriodicWorker> {
    public static final StalePackageCleanupWorkerModule_ProvideFactory INSTANCE = new StalePackageCleanupWorkerModule_ProvideFactory();

    private StalePackageCleanupWorkerModule_ProvideFactory() {
    }

    @Override // javax.inject.Provider
    public PeriodicWorker get() {
        return provide();
    }

    @JvmStatic
    public static final PeriodicWorker provide() {
        Object objCheckNotNull = Preconditions.checkNotNull(StalePackageCleanupWorker2.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (PeriodicWorker) objCheckNotNull;
    }
}
