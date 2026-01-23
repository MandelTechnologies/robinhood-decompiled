package com.robinhood.librobinhood.dagger;

import android.content.SharedPreferences;
import com.robinhood.api.annotation.BonfireRetrofit;
import com.robinhood.librobinhood.data.prefs.CustomIntervalsTooltipShownPrefState;
import com.robinhood.librobinhood.data.prefs.DefaultOrderConfigurationPref;
import com.robinhood.librobinhood.data.prefs.EquityOrderExpireDateFetchDatePref;
import com.robinhood.librobinhood.data.prefs.EquityOrderExpireDatePref;
import com.robinhood.librobinhood.data.prefs.FractionalEquityDetailNuxPref;
import com.robinhood.librobinhood.data.prefs.HasShownAdtOnboardingBottomSheetPref;
import com.robinhood.librobinhood.data.prefs.InstrumentAccountNumberPref;
import com.robinhood.librobinhood.data.prefs.ShouldShowAdvancedChartZoomNuxPref;
import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.prefs.BooleanPrefState;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.LongSetPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;
import retrofit2.Retrofit;

/* compiled from: LibStoreEquitySharedModule.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007J\u0012\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0001\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0012\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\f\u001a\u00020\rH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/LibStoreEquitySharedModule;", "", "<init>", "()V", "provideInstrumentsApi", "Lcom/robinhood/librobinhood/data/store/bonfire/api/InstrumentsApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "provideDefaultOrderConfigurationPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "prefs", "Landroid/content/SharedPreferences;", "provideFractionalEquityDetailNuxPref", "Lcom/robinhood/prefs/LongSetPreference;", "provideAccountNumberPreference", "Lcom/robinhood/prefs/StringPreference;", "preferences", "provideHasShownAdtOnboardingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "provideEquityOrderExpireDatePref", "provideEquityOrderExpireDateFetchDatePref", "providesCustomIntervalsTooltipShownPrefState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "provideShouldShowAdvancedChartZoomNuxPref", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LibStoreEquitySharedModule {
    public static final LibStoreEquitySharedModule INSTANCE = new LibStoreEquitySharedModule();

    private LibStoreEquitySharedModule() {
    }

    @DefaultOrderConfigurationPref
    public final EnumPreference<DefaultableOrderConfiguration> provideDefaultOrderConfigurationPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new EnumPreference<>(DefaultableOrderConfiguration.class, prefs, "defaultOrderConfiguration", DefaultableOrderConfiguration.DOLLAR, null, 16, null);
    }

    @FractionalEquityDetailNuxPref
    public final LongSetPreference provideFractionalEquityDetailNuxPref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new LongSetPreference(prefs, "fractionalEquityDetailNux", null, 4, null);
    }

    public final InstrumentsApi provideInstrumentsApi(@BonfireRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (InstrumentsApi) LazyRetrofit3.create(retrofit, InstrumentsApi.class);
    }

    @InstrumentAccountNumberPref
    public final StringPreference provideAccountNumberPreference(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "accountSwitcherViewSharedPrefKey", null, null, 12, null);
    }

    @HasShownAdtOnboardingBottomSheetPref
    public final BooleanPreference provideHasShownAdtOnboardingBottomSheetPref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "hasShownAdtOnboardingBottomSheet", false, null, 8, null);
    }

    @EquityOrderExpireDatePref
    public final StringPreference provideEquityOrderExpireDatePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "equityOrderExpireDatePref ", null, null, 8, null);
    }

    @EquityOrderExpireDateFetchDatePref
    public final StringPreference provideEquityOrderExpireDateFetchDatePref(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new StringPreference(preferences, "equityOrderExpireDateFetchDatePref ", null, null, 8, null);
    }

    @CustomIntervalsTooltipShownPrefState
    public final StateFlow2<Boolean> providesCustomIntervalsTooltipShownPrefState(@UserPrefs SharedPreferences preferences, LogoutKillswitch logoutKillswitch) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        return BooleanPrefState.toPrefState(new BooleanPreference(preferences, "equityCustomIntervalsTooltipShownPref", false, null, 8, null), logoutKillswitch);
    }

    @ShouldShowAdvancedChartZoomNuxPref
    public final BooleanPreference provideShouldShowAdvancedChartZoomNuxPref(@UserPrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new BooleanPreference(prefs, "shouldShowAdvancedChartZoomNuxPref", true, null, 8, null);
    }
}
