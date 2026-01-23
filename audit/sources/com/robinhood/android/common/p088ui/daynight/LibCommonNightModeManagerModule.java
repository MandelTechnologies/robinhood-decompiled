package com.robinhood.android.common.p088ui.daynight;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCommonNightModeManagerModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/LibCommonNightModeManagerModule;", "", "<init>", "()V", "provideNightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "manager", "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibCommonNightModeManagerModule {
    public static final int $stable = 0;
    public static final LibCommonNightModeManagerModule INSTANCE = new LibCommonNightModeManagerModule();

    public final NightModeManager provideNightModeManager(NightModeManager3 manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return manager;
    }

    private LibCommonNightModeManagerModule() {
    }
}
