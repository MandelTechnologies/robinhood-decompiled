package com.robinhood.android.common.p088ui.p089di;

import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.utils.RxGlobalErrorHandler;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDialogSingletons.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Ldispatch/core/DispatcherProvider;Lcom/robinhood/utils/RxGlobalErrorHandler;)V", "getColorSchemeManager$lib_common_externalRelease", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getDispatcherProvider$lib_common_externalRelease", "()Ldispatch/core/DispatcherProvider;", "getRxGlobalErrorHandler$lib_common_externalRelease", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseDialogSingletons {
    public static final int $stable = 8;
    private final ColorSchemeManager colorSchemeManager;
    private final DispatcherProvider dispatcherProvider;
    private final RxGlobalErrorHandler rxGlobalErrorHandler;

    public BaseDialogSingletons(ColorSchemeManager colorSchemeManager, DispatcherProvider dispatcherProvider, RxGlobalErrorHandler rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.colorSchemeManager = colorSchemeManager;
        this.dispatcherProvider = dispatcherProvider;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    /* renamed from: getColorSchemeManager$lib_common_externalRelease, reason: from getter */
    public final ColorSchemeManager getColorSchemeManager() {
        return this.colorSchemeManager;
    }

    /* renamed from: getDispatcherProvider$lib_common_externalRelease, reason: from getter */
    public final DispatcherProvider getDispatcherProvider() {
        return this.dispatcherProvider;
    }

    /* renamed from: getRxGlobalErrorHandler$lib_common_externalRelease, reason: from getter */
    public final RxGlobalErrorHandler getRxGlobalErrorHandler() {
        return this.rxGlobalErrorHandler;
    }
}
