package com.robinhood.store.futures.p404di;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lkotlin/jvm/JvmSuppressWildcards;", "module", "Lcom/robinhood/store/futures/di/FuturesPreferencesModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/store/futures/di/FuturesPreferencesModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory implements Factory<EnumPreference<FuturesTimeInForce>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FuturesPreferencesModule module;
    private final Provider<SharedPreferences> preferences;

    @JvmStatic
    public static final FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory create(FuturesPreferencesModule futuresPreferencesModule, Provider<SharedPreferences> provider) {
        return INSTANCE.create(futuresPreferencesModule, provider);
    }

    @JvmStatic
    public static final EnumPreference<FuturesTimeInForce> provideFuturesTimeInForcePref(FuturesPreferencesModule futuresPreferencesModule, SharedPreferences sharedPreferences) {
        return INSTANCE.provideFuturesTimeInForcePref(futuresPreferencesModule, sharedPreferences);
    }

    public FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory(FuturesPreferencesModule module, Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.module = module;
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public EnumPreference<FuturesTimeInForce> get() {
        Companion companion = INSTANCE;
        FuturesPreferencesModule futuresPreferencesModule = this.module;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideFuturesTimeInForcePref(futuresPreferencesModule, sharedPreferences);
    }

    /* compiled from: FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J#\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory;", "module", "Lcom/robinhood/store/futures/di/FuturesPreferencesModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideFuturesTimeInForcePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory create(FuturesPreferencesModule module, Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new FuturesPreferencesModule_ProvideFuturesTimeInForcePrefFactory(module, preferences);
        }

        @JvmStatic
        public final EnumPreference<FuturesTimeInForce> provideFuturesTimeInForcePref(FuturesPreferencesModule module, SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideFuturesTimeInForcePref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EnumPreference) objCheckNotNull;
        }
    }
}
