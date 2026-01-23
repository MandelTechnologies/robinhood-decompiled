package com.robinhood.librobinhood.dagger;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.prefs.EnumPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "Lkotlin/jvm/JvmSuppressWildcards;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.dagger.LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory */
/* loaded from: classes20.dex */
public final class C33429xe72037d2 implements Factory<EnumPreference<DefaultableOrderConfiguration>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<SharedPreferences> prefs;

    @JvmStatic
    public static final C33429xe72037d2 create(Provider<SharedPreferences> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final EnumPreference<DefaultableOrderConfiguration> provideDefaultOrderConfigurationPref(SharedPreferences sharedPreferences) {
        return INSTANCE.provideDefaultOrderConfigurationPref(sharedPreferences);
    }

    public C33429xe72037d2(Provider<SharedPreferences> prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    @Override // javax.inject.Provider
    public EnumPreference<DefaultableOrderConfiguration> get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.prefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideDefaultOrderConfigurationPref(sharedPreferences);
    }

    /* compiled from: LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001b\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/dagger/LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/dagger/LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideDefaultOrderConfigurationPref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/db/DefaultableOrderConfiguration;", "Lkotlin/jvm/JvmSuppressWildcards;", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.dagger.LibStoreEquitySharedModule_ProvideDefaultOrderConfigurationPrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C33429xe72037d2 create(Provider<SharedPreferences> prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new C33429xe72037d2(prefs);
        }

        @JvmStatic
        public final EnumPreference<DefaultableOrderConfiguration> provideDefaultOrderConfigurationPref(SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Object objCheckNotNull = Preconditions.checkNotNull(LibStoreEquitySharedModule.INSTANCE.provideDefaultOrderConfigurationPref(prefs), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EnumPreference) objCheckNotNull;
        }
    }
}
