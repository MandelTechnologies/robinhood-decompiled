package com.robinhood.android.plt;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.plt.contract.PltManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PltModule_Companion_ProvidePltManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/plt/PltModule_Companion_ProvidePltManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/plt/contract/PltManager;", "pltManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/plt/RealPltManager;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PltModule_Companion_ProvidePltManagerFactory implements Factory<PltManager> {
    private final Provider<RealPltManager> pltManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PltModule_Companion_ProvidePltManagerFactory create(Provider<RealPltManager> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final PltManager providePltManager(RealPltManager realPltManager) {
        return INSTANCE.providePltManager(realPltManager);
    }

    public PltModule_Companion_ProvidePltManagerFactory(Provider<RealPltManager> pltManager) {
        Intrinsics.checkNotNullParameter(pltManager, "pltManager");
        this.pltManager = pltManager;
    }

    @Override // javax.inject.Provider
    public PltManager get() {
        Companion companion = INSTANCE;
        RealPltManager realPltManager = this.pltManager.get();
        Intrinsics.checkNotNullExpressionValue(realPltManager, "get(...)");
        return companion.providePltManager(realPltManager);
    }

    /* compiled from: PltModule_Companion_ProvidePltManagerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/plt/PltModule_Companion_ProvidePltManagerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/plt/PltModule_Companion_ProvidePltManagerFactory;", "pltManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/plt/RealPltManager;", "providePltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "lib-perceived-loading-time_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PltModule_Companion_ProvidePltManagerFactory create(Provider<RealPltManager> pltManager) {
            Intrinsics.checkNotNullParameter(pltManager, "pltManager");
            return new PltModule_Companion_ProvidePltManagerFactory(pltManager);
        }

        @JvmStatic
        public final PltManager providePltManager(RealPltManager pltManager) {
            Intrinsics.checkNotNullParameter(pltManager, "pltManager");
            Object objCheckNotNull = Preconditions.checkNotNull(PltModule.INSTANCE.providePltManager(pltManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (PltManager) objCheckNotNull;
        }
    }
}
