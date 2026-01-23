package com.robinhood.store.futures.p404di;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/BooleanPreference;", "module", "Lcom/robinhood/store/futures/di/FuturesPreferencesModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/store/futures/di/FuturesPreferencesModule;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.di.FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory */
/* loaded from: classes21.dex */
public final class C41500x55bb7e57 implements Factory<BooleanPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FuturesPreferencesModule module;
    private final Provider<SharedPreferences> preferences;

    @JvmStatic
    public static final C41500x55bb7e57 create(FuturesPreferencesModule futuresPreferencesModule, Provider<SharedPreferences> provider) {
        return INSTANCE.create(futuresPreferencesModule, provider);
    }

    @JvmStatic
    public static final BooleanPreference providesShouldShowFuturesGoldUpsellPref(FuturesPreferencesModule futuresPreferencesModule, SharedPreferences sharedPreferences) {
        return INSTANCE.providesShouldShowFuturesGoldUpsellPref(futuresPreferencesModule, sharedPreferences);
    }

    public C41500x55bb7e57(FuturesPreferencesModule module, Provider<SharedPreferences> preferences) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.module = module;
        this.preferences = preferences;
    }

    @Override // javax.inject.Provider
    public BooleanPreference get() {
        Companion companion = INSTANCE;
        FuturesPreferencesModule futuresPreferencesModule = this.module;
        SharedPreferences sharedPreferences = this.preferences.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.providesShouldShowFuturesGoldUpsellPref(futuresPreferencesModule, sharedPreferences);
    }

    /* compiled from: FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/futures/di/FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory;", "module", "Lcom/robinhood/store/futures/di/FuturesPreferencesModule;", "preferences", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "providesShouldShowFuturesGoldUpsellPref", "Lcom/robinhood/prefs/BooleanPreference;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.di.FuturesPreferencesModule_ProvidesShouldShowFuturesGoldUpsellPrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C41500x55bb7e57 create(FuturesPreferencesModule module, Provider<SharedPreferences> preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            return new C41500x55bb7e57(module, preferences);
        }

        @JvmStatic
        public final BooleanPreference providesShouldShowFuturesGoldUpsellPref(FuturesPreferencesModule module, SharedPreferences preferences) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Object objCheckNotNull = Preconditions.checkNotNull(module.providesShouldShowFuturesGoldUpsellPref(preferences), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (BooleanPreference) objCheckNotNull;
        }
    }
}
