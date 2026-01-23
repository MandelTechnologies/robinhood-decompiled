package com.robinhood.android.configurationvitals;

import com.robinhood.models.api.ConfigurationVitals;
import com.robinhood.prefs.StringPreference;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConfigurationVitalsPreference.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ConfigurationVitals;", "preference", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/robinhood/prefs/StringPreference;)V", "_value", "value", "getValue", "()Lcom/robinhood/models/api/ConfigurationVitals;", "setValue", "(Lcom/robinhood/models/api/ConfigurationVitals;)V", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ConfigurationVitalsPreference {
    private ConfigurationVitals _value;
    private final JsonAdapter<ConfigurationVitals> adapter;
    private final StringPreference preference;

    public ConfigurationVitalsPreference(JsonAdapter<ConfigurationVitals> adapter, StringPreference preference) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.adapter = adapter;
        this.preference = preference;
    }

    public final ConfigurationVitals getValue() throws IOException {
        ConfigurationVitals configurationVitals = this._value;
        if (configurationVitals != null) {
            return configurationVitals;
        }
        String str = this.preference.get();
        ConfigurationVitals configurationVitalsFromJson = null;
        if (str == null) {
            return null;
        }
        try {
            configurationVitalsFromJson = this.adapter.fromJson(str);
        } catch (JsonDataException unused) {
        }
        this._value = configurationVitalsFromJson;
        return configurationVitalsFromJson;
    }

    public final void setValue(ConfigurationVitals configurationVitals) {
        this._value = configurationVitals;
        this.preference.set(this.adapter.toJson(configurationVitals));
    }
}
