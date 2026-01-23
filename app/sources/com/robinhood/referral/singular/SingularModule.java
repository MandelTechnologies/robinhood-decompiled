package com.robinhood.referral.singular;

import android.content.SharedPreferences;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.dagger.SharedPreferencesModule;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: SingularModule.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/referral/singular/SingularModule;", "", "<init>", "()V", "providesAttributionCampaignDataPref", "Lcom/robinhood/prefs/StringPreference;", SharedPreferencesModule.DEVICE_PREFS_NAME, "Landroid/content/SharedPreferences;", "providesAttributionProductDataPref", "providesAttributionMetadataPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideAttributionApi", "Lcom/robinhood/referral/singular/AttributionApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class SingularModule {
    public static final SingularModule INSTANCE = new SingularModule();

    private SingularModule() {
    }

    @AttributionCampaignDataPref
    public final StringPreference providesAttributionCampaignDataPref(@DevicePrefs SharedPreferences devicePrefs) {
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        return new StringPreference(devicePrefs, "singular_campaign_data", null, null, 12, null);
    }

    @AttributionProductDataPref
    public final StringPreference providesAttributionProductDataPref(@DevicePrefs SharedPreferences devicePrefs) {
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        return new StringPreference(devicePrefs, "singular_product_data", null, null, 12, null);
    }

    @AttributionMetadataPref
    public final StringToStringMapPreference providesAttributionMetadataPref(@DevicePrefs SharedPreferences devicePrefs, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(devicePrefs, "devicePrefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToStringMapPreference(devicePrefs, "singular_metadata", MapsKt.emptyMap(), moshi);
    }

    public final AttributionApi provideAttributionApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (AttributionApi) LazyRetrofit3.create(retrofit, AttributionApi.class, "rewards/");
    }
}
