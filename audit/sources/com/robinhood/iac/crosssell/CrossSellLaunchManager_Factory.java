package com.robinhood.iac.crosssell;

import android.content.Context;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CrossSellLaunchManager_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/iac/crosssell/CrossSellLaunchManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-cross-sell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class CrossSellLaunchManager_Factory implements Factory<CrossSellLaunchManager> {
    private final Provider<AppType> appType;
    private final Provider<Context> context;
    private final Provider<CoroutineScope> microgramCoroutineScope;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CrossSellLaunchManager_Factory create(Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<MicrogramManager> provider3, Provider<Navigator> provider4, Provider<LazyMoshi> provider5, Provider<AppType> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CrossSellLaunchManager newInstance(Context context, CoroutineScope coroutineScope, MicrogramManager microgramManager, Navigator navigator, LazyMoshi lazyMoshi, AppType appType) {
        return INSTANCE.newInstance(context, coroutineScope, microgramManager, navigator, lazyMoshi, appType);
    }

    public CrossSellLaunchManager_Factory(Provider<Context> context, Provider<CoroutineScope> microgramCoroutineScope, Provider<MicrogramManager> microgramManager, Provider<Navigator> navigator, Provider<LazyMoshi> moshi, Provider<AppType> appType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.context = context;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.microgramManager = microgramManager;
        this.navigator = navigator;
        this.moshi = moshi;
        this.appType = appType;
    }

    @Override // javax.inject.Provider
    public CrossSellLaunchManager get() {
        Companion companion = INSTANCE;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        CoroutineScope coroutineScope = this.microgramCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        return companion.newInstance(context, coroutineScope, microgramManager, navigator, lazyMoshi, appType);
    }

    /* compiled from: CrossSellLaunchManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/iac/crosssell/CrossSellLaunchManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager_Factory;", "context", "Ljavax/inject/Provider;", "Landroid/content/Context;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "newInstance", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "lib-cross-sell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CrossSellLaunchManager_Factory create(Provider<Context> context, Provider<CoroutineScope> microgramCoroutineScope, Provider<MicrogramManager> microgramManager, Provider<Navigator> navigator, Provider<LazyMoshi> moshi, Provider<AppType> appType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CrossSellLaunchManager_Factory(context, microgramCoroutineScope, microgramManager, navigator, moshi, appType);
        }

        @JvmStatic
        public final CrossSellLaunchManager newInstance(Context context, CoroutineScope microgramCoroutineScope, MicrogramManager microgramManager, Navigator navigator, LazyMoshi moshi, AppType appType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(appType, "appType");
            return new CrossSellLaunchManager(context, microgramCoroutineScope, microgramManager, navigator, moshi, appType);
        }
    }
}
