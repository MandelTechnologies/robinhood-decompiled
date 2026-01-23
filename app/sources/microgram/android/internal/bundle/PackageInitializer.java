package microgram.android.internal.bundle;

import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import microgram.manifest.AppInfo;

/* compiled from: PackageInitializer.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageInitializer;", "", "initializePackage", "", "appInfo", "Lmicrogram/manifest/AppInfo;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface PackageInitializer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void initializePackage(AppInfo appInfo) throws IOException;

    /* compiled from: PackageInitializer.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageInitializer$Companion;", "", "<init>", "()V", "wrapping", "Lmicrogram/android/internal/bundle/PackageInitializer;", "delegate", "Lkotlin/Lazy;", "Lkotlin/Function0;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PackageInitializer wrapping(final Lazy<? extends PackageInitializer> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new PackageInitializer() { // from class: microgram.android.internal.bundle.PackageInitializer$Companion$wrapping$1
                @Override // microgram.android.internal.bundle.PackageInitializer
                public final void initializePackage(AppInfo it) throws IOException {
                    Intrinsics.checkNotNullParameter(it, "it");
                    delegate.getValue().initializePackage(it);
                }
            };
        }

        public final PackageInitializer wrapping(Function0<? extends PackageInitializer> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return wrapping(LazyKt.lazy(delegate));
        }
    }
}
