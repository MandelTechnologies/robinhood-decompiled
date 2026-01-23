package com.robinhood.shared.common.singular.p373di;

import android.content.SharedPreferences;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.shared.common.singular.SingularDisableTrackingPref;
import com.robinhood.shared.common.singular.SingularSdkWrapper;
import com.robinhood.shared.common.singular.SingularSdkWrapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingularSdkModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/di/SingularSdkModule;", "", "<init>", "()V", "bindsSingularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "sdkWrapper", "Lcom/robinhood/shared/common/singular/RealSingularSdkWrapper;", "Companion", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class SingularSdkModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract SingularSdkWrapper bindsSingularSdkWrapper(SingularSdkWrapper2 sdkWrapper);

    /* compiled from: SingularSdkModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/singular/di/SingularSdkModule$Companion;", "", "<init>", "()V", "providesSingularDisableTrackingPref", "Lcom/robinhood/prefs/BooleanPreference;", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "lib-singular_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @SingularDisableTrackingPref
        public final BooleanPreference providesSingularDisableTrackingPref(@DevicePrefs SharedPreferences devicePrefs) {
            Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
            return new BooleanPreference(devicePrefs, "singular_disableTracking", false, null, 12, null);
        }
    }
}
