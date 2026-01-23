package com.robinhood.android.onboarding.p205ui.usercreation;

import android.content.SharedPreferences;
import com.robinhood.api.annotation.MidlandsRetrofit;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.retrofit.lazy.LazyRetrofit3;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Retrofit;

/* compiled from: UserCreationModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationModule;", "", "<init>", "()V", "provideHasOptInForMarketingEmails2", "Lcom/robinhood/prefs/BooleanPreference;", "preferences", "Landroid/content/SharedPreferences;", "provideReferralApi", "Lcom/robinhood/android/onboarding/ui/usercreation/MarketingOptInApi;", "retrofit", "Ldagger/Lazy;", "Lretrofit2/Retrofit;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UserCreationModule {
    public static final int $stable = 0;
    public static final UserCreationModule INSTANCE = new UserCreationModule();

    private UserCreationModule() {
    }

    @HasOptInForMarketingEmails
    public final BooleanPreference provideHasOptInForMarketingEmails2(@UserPrefs SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new BooleanPreference(preferences, "optInForMarketingEmails2", false, null, 8, null);
    }

    public final MarketingOptInApi provideReferralApi(@MidlandsRetrofit Lazy<Retrofit> retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return (MarketingOptInApi) LazyRetrofit3.create(retrofit, MarketingOptInApi.class);
    }
}
