package com.robinhood.android.equities.equityupsell;

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

/* compiled from: EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "module", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory implements Factory<StringToBooleanMapPreference> {
    private final EquityUpsellModule module;
    private final Provider<LazyMoshi> moshi;
    private final Provider<SharedPreferences> prefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory create(EquityUpsellModule equityUpsellModule, Provider<SharedPreferences> provider, Provider<LazyMoshi> provider2) {
        return INSTANCE.create(equityUpsellModule, provider, provider2);
    }

    @JvmStatic
    public static final StringToBooleanMapPreference provideEquityUpsellCompletePref(EquityUpsellModule equityUpsellModule, SharedPreferences sharedPreferences, LazyMoshi lazyMoshi) {
        return INSTANCE.provideEquityUpsellCompletePref(equityUpsellModule, sharedPreferences, lazyMoshi);
    }

    public EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory(EquityUpsellModule module, Provider<SharedPreferences> prefs, Provider<LazyMoshi> moshi) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.module = module;
        this.prefs = prefs;
        this.moshi = moshi;
    }

    @Override // javax.inject.Provider
    public StringToBooleanMapPreference get() {
        Companion companion = INSTANCE;
        EquityUpsellModule equityUpsellModule = this.module;
        SharedPreferences sharedPreferences = this.prefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        return companion.provideEquityUpsellCompletePref(equityUpsellModule, sharedPreferences, lazyMoshi);
    }

    /* compiled from: EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory;", "module", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellModule;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "provideEquityUpsellCompletePref", "Lcom/robinhood/prefs/StringToBooleanMapPreference;", "lib-equity-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory create(EquityUpsellModule module, Provider<SharedPreferences> prefs, Provider<LazyMoshi> moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new EquityUpsellModule_ProvideEquityUpsellCompletePrefFactory(module, prefs, moshi);
        }

        @JvmStatic
        public final StringToBooleanMapPreference provideEquityUpsellCompletePref(EquityUpsellModule module, SharedPreferences prefs, LazyMoshi moshi) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideEquityUpsellCompletePref(prefs, moshi), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (StringToBooleanMapPreference) objCheckNotNull;
        }
    }
}
