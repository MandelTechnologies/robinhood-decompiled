package com.robinhood.android.rhweb;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.prefs.Theme;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.lib.webview.WebAuthTokenManager;
import com.robinhood.android.lib.webview.data.DisplayInfo;
import com.robinhood.android.lib.webview.data.WebConfig;
import com.robinhood.android.rhweb.RhWebFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Optional;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: RhWebDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#Be\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\"0!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/rhweb/RhWebViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "themePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/designsystem/prefs/Theme;", "webAuthTokenManager", "Lcom/robinhood/android/lib/webview/WebAuthTokenManager;", "oAuthTokenPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "installation", "Lcom/robinhood/prefs/Installation;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "resources", "Landroid/content/res/Resources;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;Lcom/robinhood/android/common/ui/daynight/NightModeManager;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/android/lib/webview/WebAuthTokenManager;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/prefs/Installation;Lcom/robinhood/utils/ReleaseVersion;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/targetbackend/TargetBackend;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refreshAuthToken", "Lio/reactivex/Single;", "Lcom/robinhood/utils/Optional;", "Companion", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhWebDuxo extends OldBaseDuxo<RhWebViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Duration DEFAULT_REDIRECT_TIMEOUT = Durations.INSTANCE.getONE_MINUTE();
    private final ColorSchemeManager colorSchemeManager;
    private final NightModeManager nightModeManager;
    private final SavedStateHandle savedStateHandle;
    private final EnumPreference<Theme> themePref;
    private final WebAuthTokenManager webAuthTokenManager;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RhWebDuxo(ColorSchemeManager colorSchemeManager, NightModeManager nightModeManager, EnumPreference<Theme> themePref, WebAuthTokenManager webAuthTokenManager, MoshiSecurePreference<OAuthToken> oAuthTokenPref, Installation installation, ReleaseVersion releaseVersion, Resources resources, SavedStateHandle savedStateHandle, TargetBackend targetBackend) {
        super(new RhWebViewState(((RhWebFragment.Args) INSTANCE.getArgs(savedStateHandle)).uri(resources, targetBackend), new WebConfig(oAuthTokenPref.getValue(), installation.mo2745id(), releaseVersion.getVersionName(), new DisplayInfo((Theme) themePref.getValue(), colorSchemeManager.getColorScheme(), nightModeManager.getDayNightMode())), DEFAULT_REDIRECT_TIMEOUT), null, 2, 0 == true ? 1 : 0);
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
        this.colorSchemeManager = colorSchemeManager;
        this.nightModeManager = nightModeManager;
        this.themePref = themePref;
        this.webAuthTokenManager = webAuthTokenManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.colorSchemeManager.getPreference().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.onStart$lambda$1(this.f$0, (ColorScheme) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.themePref.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.onStart$lambda$3(this.f$0, (Theme) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhWebDuxo rhWebDuxo, final ColorScheme colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        rhWebDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.onStart$lambda$1$lambda$0(colorScheme, (RhWebViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhWebViewState onStart$lambda$1$lambda$0(ColorScheme colorScheme, RhWebViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhWebViewState.copy$default(applyMutation, null, WebConfig.displayInfoCopy$default(applyMutation.getWebConfig(), null, colorScheme, null, 5, null), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final RhWebDuxo rhWebDuxo, final Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        rhWebDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.onStart$lambda$3$lambda$2(theme, rhWebDuxo, (RhWebViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhWebViewState onStart$lambda$3$lambda$2(Theme theme, RhWebDuxo rhWebDuxo, RhWebViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhWebViewState.copy$default(applyMutation, null, WebConfig.displayInfoCopy$default(applyMutation.getWebConfig(), theme, null, rhWebDuxo.nightModeManager.getDayNightMode(), 2, null), null, 5, null);
    }

    public final Single<Optional<OAuthToken>> refreshAuthToken() {
        return this.webAuthTokenManager.refreshAuthToken(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.refreshAuthToken$lambda$5(this.f$0, (OAuthToken) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAuthToken$lambda$5(RhWebDuxo rhWebDuxo, final OAuthToken newAuthToken) {
        Intrinsics.checkNotNullParameter(newAuthToken, "newAuthToken");
        rhWebDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.rhweb.RhWebDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhWebDuxo.refreshAuthToken$lambda$5$lambda$4(newAuthToken, (RhWebViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RhWebViewState refreshAuthToken$lambda$5$lambda$4(OAuthToken oAuthToken, RhWebViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RhWebViewState.copy$default(applyMutation, null, WebConfig.copy$default(applyMutation.getWebConfig(), oAuthToken, null, null, null, 14, null), null, 5, null);
    }

    /* compiled from: RhWebDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhweb/RhWebDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhweb/RhWebDuxo;", "Lcom/robinhood/android/rhweb/RhWebFragment$Args;", "<init>", "()V", "j$/time/Duration", "DEFAULT_REDIRECT_TIMEOUT", "Lj$/time/Duration;", "getDEFAULT_REDIRECT_TIMEOUT", "()Lj$/time/Duration;", "feature-rhweb_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RhWebDuxo, RhWebFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhWebFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RhWebFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RhWebFragment.Args getArgs(RhWebDuxo rhWebDuxo) {
            return (RhWebFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rhWebDuxo);
        }

        public final Duration getDEFAULT_REDIRECT_TIMEOUT() {
            return RhWebDuxo.DEFAULT_REDIRECT_TIMEOUT;
        }
    }
}
