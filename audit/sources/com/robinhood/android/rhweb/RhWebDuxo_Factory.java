package com.robinhood.android.rhweb;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.lib.webview.WebAuthTokenManager;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BÓ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u000b0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/rhweb/RhWebDuxo;", "colorSchemeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "webAuthTokenManager", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RhWebDuxo_Factory implements Factory<RhWebDuxo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ColorSchemeManager> colorSchemeManager;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Installation> installation;
    private final Provider<NightModeManager> nightModeManager;
    private final Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref;
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<Resources> resources;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<TargetBackend> targetBackend;
    private final Provider<EnumPreference<Theme>> themePref;
    private final Provider<WebAuthTokenManager> webAuthTokenManager;

    @JvmStatic
    public static final RhWebDuxo_Factory create(Provider<ColorSchemeManager> provider, Provider<NightModeManager> provider2, Provider<EnumPreference<Theme>> provider3, Provider<WebAuthTokenManager> provider4, Provider<MoshiSecurePreference<OAuthToken>> provider5, Provider<Installation> provider6, Provider<ReleaseVersion> provider7, Provider<Resources> provider8, Provider<SavedStateHandle> provider9, Provider<TargetBackend> provider10, Provider<DispatcherProvider> provider11, Provider<RxFactory> provider12, Provider<RxGlobalErrorHandler> provider13) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    @JvmStatic
    public static final RhWebDuxo newInstance(ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> enumPreference, WebAuthTokenManager webAuthTokenManager, MoshiSecurePreference<OAuthToken> moshiSecurePreference, Installation installation, ReleaseVersion releaseVersion, Resources resources, SavedStateHandle savedStateHandle, TargetBackend targetBackend) {
        return INSTANCE.newInstance(colorSchemeManager, nightModeManager, enumPreference, webAuthTokenManager, moshiSecurePreference, installation, releaseVersion, resources, savedStateHandle, targetBackend);
    }

    public RhWebDuxo_Factory(Provider<ColorSchemeManager> colorSchemeManager, Provider<NightModeManager> nightModeManager, Provider<EnumPreference<Theme>> themePref, Provider<WebAuthTokenManager> webAuthTokenManager, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<TargetBackend> targetBackend, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
        Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
        Intrinsics.checkNotNullParameter(themePref, "themePref");
        Intrinsics.checkNotNullParameter(webAuthTokenManager, "webAuthTokenManager");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.colorSchemeManager = colorSchemeManager;
        this.nightModeManager = nightModeManager;
        this.themePref = themePref;
        this.webAuthTokenManager = webAuthTokenManager;
        this.oAuthTokenPref = oAuthTokenPref;
        this.installation = installation;
        this.releaseVersion = releaseVersion;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.targetBackend = targetBackend;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public RhWebDuxo get() {
        Companion companion = INSTANCE;
        ColorSchemeManager colorSchemeManager = this.colorSchemeManager.get();
        Intrinsics.checkNotNullExpressionValue(colorSchemeManager, "get(...)");
        NightModeManager nightModeManager = this.nightModeManager.get();
        Intrinsics.checkNotNullExpressionValue(nightModeManager, "get(...)");
        EnumPreference<Theme> enumPreference = this.themePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        WebAuthTokenManager webAuthTokenManager = this.webAuthTokenManager.get();
        Intrinsics.checkNotNullExpressionValue(webAuthTokenManager, "get(...)");
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        TargetBackend targetBackend = this.targetBackend.get();
        Intrinsics.checkNotNullExpressionValue(targetBackend, "get(...)");
        RhWebDuxo rhWebDuxoNewInstance = companion.newInstance(colorSchemeManager, nightModeManager, enumPreference, webAuthTokenManager, moshiSecurePreference, installation, releaseVersion, resources, savedStateHandle, targetBackend);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(rhWebDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(rhWebDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(rhWebDuxoNewInstance, rxGlobalErrorHandler);
        return rhWebDuxoNewInstance;
    }

    /* compiled from: RhWebDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÔ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0017\u0010\u0011\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u000e0\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007H\u0007Jn\u0010$\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/rhweb/RhWebDuxo_Factory;", "colorSchemeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "Lkotlin/jvm/JvmSuppressWildcards;", "webAuthTokenManager", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/rhweb/RhWebDuxo;", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RhWebDuxo_Factory create(Provider<ColorSchemeManager> colorSchemeManager, Provider<NightModeManager> nightModeManager, Provider<EnumPreference<Theme>> themePref, Provider<WebAuthTokenManager> webAuthTokenManager, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<Installation> installation, Provider<ReleaseVersion> releaseVersion, Provider<Resources> resources, Provider<SavedStateHandle> savedStateHandle, Provider<TargetBackend> targetBackend, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(themePref, "themePref");
            Intrinsics.checkNotNullParameter(webAuthTokenManager, "webAuthTokenManager");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new RhWebDuxo_Factory(colorSchemeManager, nightModeManager, themePref, webAuthTokenManager, oAuthTokenPref, installation, releaseVersion, resources, savedStateHandle, targetBackend, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final RhWebDuxo newInstance(ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> themePref, WebAuthTokenManager webAuthTokenManager, MoshiSecurePreference<OAuthToken> oAuthTokenPref, Installation installation, ReleaseVersion releaseVersion, Resources resources, SavedStateHandle savedStateHandle, TargetBackend targetBackend) {
            Intrinsics.checkNotNullParameter(colorSchemeManager, "colorSchemeManager");
            Intrinsics.checkNotNullParameter(nightModeManager, "nightModeManager");
            Intrinsics.checkNotNullParameter(themePref, "themePref");
            Intrinsics.checkNotNullParameter(webAuthTokenManager, "webAuthTokenManager");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            return new RhWebDuxo(colorSchemeManager, nightModeManager, themePref, webAuthTokenManager, oAuthTokenPref, installation, releaseVersion, resources, savedStateHandle, targetBackend);
        }
    }
}
