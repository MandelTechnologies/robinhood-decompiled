package com.robinhood.android.common.p088ui.p089di;

import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.Lazy;
import dispatch.core.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragmentSingletons.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/android/navigation/Navigator;Ldagger/Lazy;Ldispatch/core/DispatcherProvider;Lcom/robinhood/coroutines/rx/RxFactory;Lcom/robinhood/utils/RxGlobalErrorHandler;)V", "getColorSchemeManager$lib_common_externalRelease", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getNavigator$lib_common_externalRelease", "()Lcom/robinhood/android/navigation/Navigator;", "getRhProcessLifecycleOwner$lib_common_externalRelease", "()Ldagger/Lazy;", "getDispatcherProvider$lib_common_externalRelease", "()Ldispatch/core/DispatcherProvider;", "getRxFactory$lib_common_externalRelease", "()Lcom/robinhood/coroutines/rx/RxFactory;", "getRxGlobalErrorHandler$lib_common_externalRelease", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class BaseFragmentSingletons {
    public static final int $stable = 8;
    private final ColorSchemeManager colorSchemeManager;
    private final DispatcherProvider dispatcherProvider;
    private final Navigator navigator;
    private final Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final RxFactory rxFactory;
    private final RxGlobalErrorHandler rxGlobalErrorHandler;

    public BaseFragmentSingletons(ColorSchemeManager colorSchemeManager, Navigator navigator, Lazy<RhProcessLifecycleOwner> rhProcessLifecycleOwner, DispatcherProvider dispatcherProvider, RxFactory rxFactory, RxGlobalErrorHandler rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.colorSchemeManager = colorSchemeManager;
        this.navigator = navigator;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    /* renamed from: getColorSchemeManager$lib_common_externalRelease, reason: from getter */
    public final ColorSchemeManager getColorSchemeManager() {
        return this.colorSchemeManager;
    }

    /* renamed from: getNavigator$lib_common_externalRelease, reason: from getter */
    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner$lib_common_externalRelease() {
        return this.rhProcessLifecycleOwner;
    }

    /* renamed from: getDispatcherProvider$lib_common_externalRelease, reason: from getter */
    public final DispatcherProvider getDispatcherProvider() {
        return this.dispatcherProvider;
    }

    /* renamed from: getRxFactory$lib_common_externalRelease, reason: from getter */
    public final RxFactory getRxFactory() {
        return this.rxFactory;
    }

    /* renamed from: getRxGlobalErrorHandler$lib_common_externalRelease, reason: from getter */
    public final RxGlobalErrorHandler getRxGlobalErrorHandler() {
        return this.rxGlobalErrorHandler;
    }
}
