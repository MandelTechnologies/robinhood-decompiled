package microgram.android.inject;

import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.ReleaseVersion;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.RuntimeInfo;
import microgram.android.MicrogramSource;
import microgram.android.debug.DebugSettingsProvider;

/* compiled from: MicrogramRuntimeModule_ProvideRuntimeInfoFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideRuntimeInfoFactory;", "Ldagger/internal/Factory;", "Lmicrogram/RuntimeInfo;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class MicrogramRuntimeModule_ProvideRuntimeInfoFactory implements Factory<RuntimeInfo> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final RuntimeInfo provideRuntimeInfo(MicrogramSource microgramSource, ReleaseVersion releaseVersion, TargetBackend targetBackend, AppType appType, LocaleConfiguration localeConfiguration, DebugSettingsProvider debugSettingsProvider) {
        return INSTANCE.provideRuntimeInfo(microgramSource, releaseVersion, targetBackend, appType, localeConfiguration, debugSettingsProvider);
    }

    /* compiled from: MicrogramRuntimeModule_ProvideRuntimeInfoFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/android/inject/MicrogramRuntimeModule_ProvideRuntimeInfoFactory$Companion;", "", "<init>", "()V", "Lmicrogram/android/MicrogramSource;", "source", "Lcom/robinhood/utils/ReleaseVersion;", "releaseVersion", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "localeConfiguration", "Lmicrogram/android/debug/DebugSettingsProvider;", "debugSettingsProvider", "Lmicrogram/RuntimeInfo;", "provideRuntimeInfo", "(Lmicrogram/android/MicrogramSource;Lcom/robinhood/utils/ReleaseVersion;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;Lmicrogram/android/debug/DebugSettingsProvider;)Lmicrogram/RuntimeInfo;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RuntimeInfo provideRuntimeInfo(MicrogramSource source, ReleaseVersion releaseVersion, TargetBackend targetBackend, AppType appType, LocaleConfiguration localeConfiguration, DebugSettingsProvider debugSettingsProvider) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
            Intrinsics.checkNotNullParameter(debugSettingsProvider, "debugSettingsProvider");
            Object objCheckNotNull = Preconditions.checkNotNull(MicrogramRuntimeModule.INSTANCE.provideRuntimeInfo(source, releaseVersion, targetBackend, appType, localeConfiguration, debugSettingsProvider), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RuntimeInfo) objCheckNotNull;
        }
    }
}
