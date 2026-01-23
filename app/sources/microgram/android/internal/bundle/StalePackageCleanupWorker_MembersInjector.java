package microgram.android.internal.bundle;

import dagger.MembersInjector;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StalePackageCleanupWorker_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/internal/bundle/StalePackageCleanupWorker_MembersInjector;", "Ldagger/MembersInjector;", "Lmicrogram/android/internal/bundle/StalePackageCleanupWorker;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StalePackageCleanupWorker_MembersInjector implements MembersInjector<StalePackageCleanupWorker> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final void injectPackageManager(StalePackageCleanupWorker stalePackageCleanupWorker, PackageManager packageManager) {
        INSTANCE.injectPackageManager(stalePackageCleanupWorker, packageManager);
    }

    /* compiled from: StalePackageCleanupWorker_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/StalePackageCleanupWorker_MembersInjector$Companion;", "", "<init>", "()V", "Lmicrogram/android/internal/bundle/StalePackageCleanupWorker;", "instance", "Lmicrogram/android/internal/bundle/PackageManager;", "packageManager", "", "injectPackageManager", "(Lmicrogram/android/internal/bundle/StalePackageCleanupWorker;Lmicrogram/android/internal/bundle/PackageManager;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void injectPackageManager(StalePackageCleanupWorker instance, PackageManager packageManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            instance.setPackageManager(packageManager);
        }
    }
}
