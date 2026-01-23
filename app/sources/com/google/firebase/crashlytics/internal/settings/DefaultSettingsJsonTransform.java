package com.google.firebase.crashlytics.internal.settings;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState4;
import org.json.JSONObject;

/* loaded from: classes.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    DefaultSettingsJsonTransform() {
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return defaultSettings(currentTimeProvider);
    }

    static Settings defaultSettings(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.getCurrentTimeMillis() + Constants.ONE_HOUR, new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, OptionsSimulatedReturnTimeSliderDataState4.ONE_HOUR_IN_SEC, 10.0d, 1.2d, 60);
    }
}
