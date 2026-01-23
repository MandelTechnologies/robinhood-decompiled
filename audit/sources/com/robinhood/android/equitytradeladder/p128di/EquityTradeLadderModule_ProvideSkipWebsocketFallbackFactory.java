package com.robinhood.android.equitytradeladder.p128di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory;", "Ldagger/internal/Factory;", "", "module", "Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule;", "<init>", "(Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule;)V", "get", "()Ljava/lang/Boolean;", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory implements Factory<Boolean> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EquityTradeLadderModule module;

    @JvmStatic
    public static final EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory create(EquityTradeLadderModule equityTradeLadderModule) {
        return INSTANCE.create(equityTradeLadderModule);
    }

    @JvmStatic
    public static final boolean provideSkipWebsocketFallback(EquityTradeLadderModule equityTradeLadderModule) {
        return INSTANCE.provideSkipWebsocketFallback(equityTradeLadderModule);
    }

    public EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory(EquityTradeLadderModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
    }

    @Override // javax.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(INSTANCE.provideSkipWebsocketFallback(this.module));
    }

    /* compiled from: EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory;", "module", "Lcom/robinhood/android/equitytradeladder/di/EquityTradeLadderModule;", "provideSkipWebsocketFallback", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory create(EquityTradeLadderModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return new EquityTradeLadderModule_ProvideSkipWebsocketFallbackFactory(module);
        }

        @JvmStatic
        public final boolean provideSkipWebsocketFallback(EquityTradeLadderModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            Object objCheckNotNull = Preconditions.checkNotNull(Boolean.valueOf(module.provideSkipWebsocketFallback()), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return ((Boolean) objCheckNotNull).booleanValue();
        }
    }
}
