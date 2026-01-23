package microgram.android.debug;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/debug/DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory;", "Ldagger/internal/Factory;", "Lmicrogram/android/debug/DebugSettingsProvider;", "<init>", "()V", "provideDebugSettingsProvider", "()Lmicrogram/android/debug/DebugSettingsProvider;", "get", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory implements Factory<DebugSettingsProvider> {
    public static final DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory INSTANCE = new DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory();

    private DebugSettingsProviderModule_ProvideDebugSettingsProviderFactory() {
    }

    @Override // javax.inject.Provider
    public DebugSettingsProvider get() {
        return provideDebugSettingsProvider();
    }

    @JvmStatic
    public static final DebugSettingsProvider provideDebugSettingsProvider() {
        Object objCheckNotNull = Preconditions.checkNotNull(DebugSettingsProviderModule.INSTANCE.provideDebugSettingsProvider(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (DebugSettingsProvider) objCheckNotNull;
    }
}
