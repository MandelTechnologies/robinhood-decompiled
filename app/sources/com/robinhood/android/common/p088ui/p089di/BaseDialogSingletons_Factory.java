package com.robinhood.android.common.p088ui.p089di;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDialogSingletons_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseDialogSingletons_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "colorSchemeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseDialogSingletons_Factory implements Factory<BaseDialogSingletons> {
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final BaseDialogSingletons_Factory create(Provider<ColorSchemeManager> provider, Provider<DispatcherProvider> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final BaseDialogSingletons newInstance(ColorSchemeManager colorSchemeManager, DispatcherProvider dispatcherProvider, RxGlobalErrorHandler rxGlobalErrorHandler) {
        return INSTANCE.newInstance(colorSchemeManager, dispatcherProvider, rxGlobalErrorHandler);
    }

    public BaseDialogSingletons_Factory(Provider<ColorSchemeManager> colorSchemeManager, Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.colorSchemeManager = colorSchemeManager;
        this.dispatcherProvider = dispatcherProvider;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public BaseDialogSingletons get() {
        Companion companion = INSTANCE;
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        return companion.newInstance(colorSchemeManager, dispatcherProvider, rxGlobalErrorHandler);
    }

    /* compiled from: BaseDialogSingletons_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseDialogSingletons_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons_Factory;", "colorSchemeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BaseDialogSingletons_Factory create(Provider<ColorSchemeManager> colorSchemeManager, Provider<DispatcherProvider> dispatcherProvider, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new BaseDialogSingletons_Factory(colorSchemeManager, dispatcherProvider, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final BaseDialogSingletons newInstance(ColorSchemeManager colorSchemeManager, DispatcherProvider dispatcherProvider, RxGlobalErrorHandler rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new BaseDialogSingletons(colorSchemeManager, dispatcherProvider, rxGlobalErrorHandler);
        }
    }
}
