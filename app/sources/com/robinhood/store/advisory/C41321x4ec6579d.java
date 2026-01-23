package com.robinhood.store.advisory;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringToBooleanMapPreference;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/store/advisory/LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.advisory.LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory */
/* loaded from: classes12.dex */
public final class C41321x4ec6579d implements Factory<StringToBooleanMapPreference> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<LazyMoshi> moshi;
    private final Provider<SharedPreferences> prefs;

    @JvmStatic
    public static final C41321x4ec6579d create(Provider<SharedPreferences> provider, Provider<LazyMoshi> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final StringToBooleanMapPreference provideHasDismissedRecsForRetirementStrategiesUpsellPref(SharedPreferences sharedPreferences, LazyMoshi lazyMoshi) {
        return INSTANCE.provideHasDismissedRecsForRetirementStrategiesUpsellPref(sharedPreferences, lazyMoshi);
    }

    public C41321x4ec6579d(Provider<SharedPreferences> prefs, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.prefs = prefs;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public StringToBooleanMapPreference get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.prefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideHasDismissedRecsForRetirementStrategiesUpsellPref(sharedPreferences, lazyMoshi);
    }

    /* compiled from: LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/store/advisory/LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/advisory/LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideHasDismissedRecsForRetirementStrategiesUpsellPref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.advisory.LibAdvisoryDashboardModule_ProvideHasDismissedRecsForRetirementStrategiesUpsellPrefFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C41321x4ec6579d create(Provider<SharedPreferences> prefs, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new C41321x4ec6579d(prefs, moshi);
        }

        @JvmStatic
        public final StringToBooleanMapPreference provideHasDismissedRecsForRetirementStrategiesUpsellPref(SharedPreferences prefs, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(LibStoreAdvisoryModule.INSTANCE.provideHasDismissedRecsForRetirementStrategiesUpsellPref(prefs, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (StringToBooleanMapPreference) objCheckNotNull;
        }
    }
}
