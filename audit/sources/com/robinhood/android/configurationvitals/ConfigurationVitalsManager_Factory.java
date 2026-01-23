package com.robinhood.android.configurationvitals;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.clearcache.CacheClearManager;
import com.robinhood.utils.RhProcessLifecycleOwner;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: ConfigurationVitalsManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u009d\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u00070\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001f\u0010\b\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001f\u0010\f\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "Lkotlin/jvm/JvmSuppressWildcards;", "preference", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "prompt", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "configurationVitalsProvider", "Lcom/robinhood/prefs/StringPreference;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/LongPreference;", "lastClearCacheCreatedBeforeTimestamp", "Lcom/robinhood/prefs/BooleanPreference;", "vitalsEnabledPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/clearcache/CacheClearManager;", "cacheClearManager", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "rhProcessLifecycleOwner", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "Ljavax/inject/Provider;", "Companion", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationVitalsManager_Factory implements Factory<ConfigurationVitalsManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<CacheClearManager> cacheClearManager;
    private final Provider<Clock> clock;
    private final Provider<ConfigurationVitalsProvider> configurationVitalsProvider;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<LongPreference> lastClearCacheCreatedBeforeTimestamp;
    private final Provider<StringPreference> lastVitalsDismissPref;
    private final Provider<ConfigurationVitalsPreference> preference;
    private final Provider<ForceUpdatePrompt> prompt;
    private final Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner;
    private final Provider<BooleanPreference> vitalsEnabledPref;

    @JvmStatic
    public static final ConfigurationVitalsManager_Factory create(Provider<CoroutineScope> provider, Provider<ConfigurationVitalsPreference> provider2, Provider<ForceUpdatePrompt> provider3, Provider<ConfigurationVitalsProvider> provider4, Provider<StringPreference> provider5, Provider<LongPreference> provider6, Provider<BooleanPreference> provider7, Provider<Clock> provider8, Provider<CacheClearManager> provider9, Provider<RhProcessLifecycleOwner> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final ConfigurationVitalsManager newInstance(CoroutineScope coroutineScope, Lazy<ConfigurationVitalsPreference> lazy, ForceUpdatePrompt forceUpdatePrompt, Lazy<ConfigurationVitalsProvider> lazy2, StringPreference stringPreference, LongPreference longPreference, BooleanPreference booleanPreference, Clock clock, CacheClearManager cacheClearManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        return INSTANCE.newInstance(coroutineScope, lazy, forceUpdatePrompt, lazy2, stringPreference, longPreference, booleanPreference, clock, cacheClearManager, rhProcessLifecycleOwner);
    }

    public ConfigurationVitalsManager_Factory(Provider<CoroutineScope> coroutineScope, Provider<ConfigurationVitalsPreference> preference, Provider<ForceUpdatePrompt> prompt, Provider<ConfigurationVitalsProvider> configurationVitalsProvider, Provider<StringPreference> lastVitalsDismissPref, Provider<LongPreference> lastClearCacheCreatedBeforeTimestamp, Provider<BooleanPreference> vitalsEnabledPref, Provider<Clock> clock, Provider<CacheClearManager> cacheClearManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(configurationVitalsProvider, "configurationVitalsProvider");
        Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
        Intrinsics.checkNotNullParameter(lastClearCacheCreatedBeforeTimestamp, "lastClearCacheCreatedBeforeTimestamp");
        Intrinsics.checkNotNullParameter(vitalsEnabledPref, "vitalsEnabledPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cacheClearManager, "cacheClearManager");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.coroutineScope = coroutineScope;
        this.preference = preference;
        this.prompt = prompt;
        this.configurationVitalsProvider = configurationVitalsProvider;
        this.lastVitalsDismissPref = lastVitalsDismissPref;
        this.lastClearCacheCreatedBeforeTimestamp = lastClearCacheCreatedBeforeTimestamp;
        this.vitalsEnabledPref = vitalsEnabledPref;
        this.clock = clock;
        this.cacheClearManager = cacheClearManager;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    @Override // javax.inject.Provider
    public ConfigurationVitalsManager get() {
        Companion companion = INSTANCE;
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        Lazy<ConfigurationVitalsPreference> lazy = DoubleCheck.lazy(this.preference);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        ForceUpdatePrompt forceUpdatePrompt = this.prompt.get();
        Intrinsics.checkNotNullExpressionValue(forceUpdatePrompt, "get(...)");
        Lazy<ConfigurationVitalsProvider> lazy2 = DoubleCheck.lazy(this.configurationVitalsProvider);
        Intrinsics.checkNotNullExpressionValue(lazy2, "lazy(...)");
        StringPreference stringPreference = this.lastVitalsDismissPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        LongPreference longPreference = this.lastClearCacheCreatedBeforeTimestamp.get();
        Intrinsics.checkNotNullExpressionValue(longPreference, "get(...)");
        BooleanPreference booleanPreference = this.vitalsEnabledPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CacheClearManager cacheClearManager = this.cacheClearManager.get();
        Intrinsics.checkNotNullExpressionValue(cacheClearManager, "get(...)");
        RhProcessLifecycleOwner rhProcessLifecycleOwner = this.rhProcessLifecycleOwner.get();
        Intrinsics.checkNotNullExpressionValue(rhProcessLifecycleOwner, "get(...)");
        return companion.newInstance(coroutineScope, lazy, forceUpdatePrompt, lazy2, stringPreference, longPreference, booleanPreference, clock, cacheClearManager, rhProcessLifecycleOwner);
    }

    /* compiled from: ConfigurationVitalsManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¥\u0001\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJu\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\b0\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsPreference;", "Lkotlin/jvm/JvmSuppressWildcards;", "preference", "Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;", "prompt", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsProvider;", "configurationVitalsProvider", "Lcom/robinhood/prefs/StringPreference;", "lastVitalsDismissPref", "Lcom/robinhood/prefs/LongPreference;", "lastClearCacheCreatedBeforeTimestamp", "Lcom/robinhood/prefs/BooleanPreference;", "vitalsEnabledPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/clearcache/CacheClearManager;", "cacheClearManager", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "rhProcessLifecycleOwner", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager_Factory;", "Ldagger/Lazy;", "Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "newInstance", "(Lkotlinx/coroutines/CoroutineScope;Ldagger/Lazy;Lcom/robinhood/android/configurationvitals/ForceUpdatePrompt;Ldagger/Lazy;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/BooleanPreference;Lj$/time/Clock;Lcom/robinhood/shared/clearcache/CacheClearManager;Lcom/robinhood/utils/RhProcessLifecycleOwner;)Lcom/robinhood/android/configurationvitals/ConfigurationVitalsManager;", "lib-configuration-vitals_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ConfigurationVitalsManager_Factory create(Provider<CoroutineScope> coroutineScope, Provider<ConfigurationVitalsPreference> preference, Provider<ForceUpdatePrompt> prompt, Provider<ConfigurationVitalsProvider> configurationVitalsProvider, Provider<StringPreference> lastVitalsDismissPref, Provider<LongPreference> lastClearCacheCreatedBeforeTimestamp, Provider<BooleanPreference> vitalsEnabledPref, Provider<Clock> clock, Provider<CacheClearManager> cacheClearManager, Provider<RhProcessLifecycleOwner> rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(preference, "preference");
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(configurationVitalsProvider, "configurationVitalsProvider");
            Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
            Intrinsics.checkNotNullParameter(lastClearCacheCreatedBeforeTimestamp, "lastClearCacheCreatedBeforeTimestamp");
            Intrinsics.checkNotNullParameter(vitalsEnabledPref, "vitalsEnabledPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cacheClearManager, "cacheClearManager");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new ConfigurationVitalsManager_Factory(coroutineScope, preference, prompt, configurationVitalsProvider, lastVitalsDismissPref, lastClearCacheCreatedBeforeTimestamp, vitalsEnabledPref, clock, cacheClearManager, rhProcessLifecycleOwner);
        }

        @JvmStatic
        public final ConfigurationVitalsManager newInstance(CoroutineScope coroutineScope, Lazy<ConfigurationVitalsPreference> preference, ForceUpdatePrompt prompt, Lazy<ConfigurationVitalsProvider> configurationVitalsProvider, StringPreference lastVitalsDismissPref, LongPreference lastClearCacheCreatedBeforeTimestamp, BooleanPreference vitalsEnabledPref, Clock clock, CacheClearManager cacheClearManager, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(preference, "preference");
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            Intrinsics.checkNotNullParameter(configurationVitalsProvider, "configurationVitalsProvider");
            Intrinsics.checkNotNullParameter(lastVitalsDismissPref, "lastVitalsDismissPref");
            Intrinsics.checkNotNullParameter(lastClearCacheCreatedBeforeTimestamp, "lastClearCacheCreatedBeforeTimestamp");
            Intrinsics.checkNotNullParameter(vitalsEnabledPref, "vitalsEnabledPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cacheClearManager, "cacheClearManager");
            Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
            return new ConfigurationVitalsManager(coroutineScope, preference, prompt, configurationVitalsProvider, lastVitalsDismissPref, lastClearCacheCreatedBeforeTimestamp, vitalsEnabledPref, clock, cacheClearManager, rhProcessLifecycleOwner);
        }
    }
}
