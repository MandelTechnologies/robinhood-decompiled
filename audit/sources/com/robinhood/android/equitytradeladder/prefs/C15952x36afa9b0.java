package com.robinhood.android.equitytradeladder.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "module", "Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule;Ljavax/inject/Provider;)V", "get", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.prefs.EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory */
/* loaded from: classes3.dex */
public final class C15952x36afa9b0 implements Factory<EnumPreference<EquityPostTradeLadderFtuxState>> {
    private final EquityTradeLadderPrefsModule module;
    private final Provider<SharedPreferences> prefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final C15952x36afa9b0 create(EquityTradeLadderPrefsModule equityTradeLadderPrefsModule, Provider<SharedPreferences> provider) {
        return INSTANCE.create(equityTradeLadderPrefsModule, provider);
    }

    @JvmStatic
    public static final EnumPreference<EquityPostTradeLadderFtuxState> providePostTradeLadderFtuxStatePref(EquityTradeLadderPrefsModule equityTradeLadderPrefsModule, SharedPreferences sharedPreferences) {
        return INSTANCE.providePostTradeLadderFtuxStatePref(equityTradeLadderPrefsModule, sharedPreferences);
    }

    public C15952x36afa9b0(EquityTradeLadderPrefsModule module, Provider<SharedPreferences> prefs) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.module = module;
        this.prefs = prefs;
    }

    @Override // javax.inject.Provider
    public EnumPreference<EquityPostTradeLadderFtuxState> get() {
        Companion companion = INSTANCE;
        EquityTradeLadderPrefsModule equityTradeLadderPrefsModule = this.module;
        SharedPreferences sharedPreferences = this.prefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.providePostTradeLadderFtuxStatePref(equityTradeLadderPrefsModule, sharedPreferences);
    }

    /* compiled from: EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007J#\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory;", "module", "Lcom/robinhood/android/equitytradeladder/prefs/EquityTradeLadderPrefsModule;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "providePostTradeLadderFtuxStatePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitytradeladder.prefs.EquityTradeLadderPrefsModule_ProvidePostTradeLadderFtuxStatePrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C15952x36afa9b0 create(EquityTradeLadderPrefsModule module, Provider<SharedPreferences> prefs) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new C15952x36afa9b0(module, prefs);
        }

        @JvmStatic
        public final EnumPreference<EquityPostTradeLadderFtuxState> providePostTradeLadderFtuxStatePref(EquityTradeLadderPrefsModule module, SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Object objCheckNotNull = Preconditions.checkNotNull(module.providePostTradeLadderFtuxStatePref(prefs), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EnumPreference) objCheckNotNull;
        }
    }
}
