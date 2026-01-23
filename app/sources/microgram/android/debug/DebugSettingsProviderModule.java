package microgram.android.debug;

import kotlin.Metadata;
import microgram.android.debug.DebugSettingsProvider;

/* compiled from: DebugSettingsProviderModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/debug/DebugSettingsProviderModule;", "", "<init>", "()V", "provideDebugSettingsProvider", "Lmicrogram/android/debug/DebugSettingsProvider;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DebugSettingsProviderModule {
    public static final DebugSettingsProviderModule INSTANCE = new DebugSettingsProviderModule();

    private DebugSettingsProviderModule() {
    }

    public final DebugSettingsProvider provideDebugSettingsProvider() {
        return DebugSettingsProvider.None.INSTANCE;
    }
}
