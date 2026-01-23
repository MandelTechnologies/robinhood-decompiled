package com.robinhood.android.common.p088ui.daynight;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCommonNightModeManagerModule_ProvideNightModeManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/LibCommonNightModeManagerModule_ProvideNightModeManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "manager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibCommonNightModeManagerModule_ProvideNightModeManagerFactory implements Factory<NightModeManager> {
    private final Provider<NightModeManager3> manager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final LibCommonNightModeManagerModule_ProvideNightModeManagerFactory create(Provider<NightModeManager3> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final NightModeManager provideNightModeManager(NightModeManager3 nightModeManager3) {
        return INSTANCE.provideNightModeManager(nightModeManager3);
    }

    public LibCommonNightModeManagerModule_ProvideNightModeManagerFactory(Provider<NightModeManager3> manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.manager = manager;
    }

    @Override // javax.inject.Provider
    public NightModeManager get() {
        Companion companion = INSTANCE;
        NightModeManager3 nightModeManager3 = this.manager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager3, "get(...)");
        return companion.provideNightModeManager(nightModeManager3);
    }

    /* compiled from: LibCommonNightModeManagerModule_ProvideNightModeManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/daynight/LibCommonNightModeManagerModule_ProvideNightModeManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/daynight/LibCommonNightModeManagerModule_ProvideNightModeManagerFactory;", "manager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/daynight/RealNightModeManager;", "provideNightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LibCommonNightModeManagerModule_ProvideNightModeManagerFactory create(Provider<NightModeManager3> manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            return new LibCommonNightModeManagerModule_ProvideNightModeManagerFactory(manager);
        }

        @JvmStatic
        public final NightModeManager provideNightModeManager(NightModeManager3 manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Object objCheckNotNull = Preconditions.checkNotNull(LibCommonNightModeManagerModule.INSTANCE.provideNightModeManager(manager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (NightModeManager) objCheckNotNull;
        }
    }
}
