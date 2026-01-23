package microgram.android.internal.bundle;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PackageInterceptorModule_ProvidePackageInterceptorFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/PackageInterceptorModule_ProvidePackageInterceptorFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/internal/bundle/PackageInterceptor;", "<init>", "()V", "providePackageInterceptor", "()Lmicrogram/android/internal/bundle/PackageInterceptor;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PackageInterceptorModule_ProvidePackageInterceptorFactory implements Factory<PackageInterceptor> {
    public static final PackageInterceptorModule_ProvidePackageInterceptorFactory INSTANCE = new PackageInterceptorModule_ProvidePackageInterceptorFactory();

    private PackageInterceptorModule_ProvidePackageInterceptorFactory() {
    }

    @Override // javax.inject.Provider
    public PackageInterceptor get() {
        return providePackageInterceptor();
    }

    @JvmStatic
    public static final PackageInterceptor providePackageInterceptor() {
        Object objCheckNotNull = Preconditions.checkNotNull(PackageInterceptorModule.INSTANCE.providePackageInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (PackageInterceptor) objCheckNotNull;
    }
}
