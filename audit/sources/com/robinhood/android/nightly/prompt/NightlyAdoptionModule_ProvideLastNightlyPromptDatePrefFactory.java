package com.robinhood.android.nightly.prompt;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory implements Factory<LastNightlyPromptDatePreference> {
    private final Provider<SharedPreferences> prefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory create(Provider<SharedPreferences> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final LastNightlyPromptDatePreference provideLastNightlyPromptDatePref(SharedPreferences sharedPreferences) {
        return INSTANCE.provideLastNightlyPromptDatePref(sharedPreferences);
    }

    public NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory(Provider<SharedPreferences> prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    @Override // javax.inject.Provider
    public LastNightlyPromptDatePreference get() {
        Companion companion = INSTANCE;
        SharedPreferences sharedPreferences = this.prefs.get();
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "get(...)");
        return companion.provideLastNightlyPromptDatePref(sharedPreferences);
    }

    /* compiled from: NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/nightly/prompt/NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory;", "prefs", "Ljavax/inject/Provider;", "Landroid/content/SharedPreferences;", "provideLastNightlyPromptDatePref", "Lcom/robinhood/android/nightly/prompt/LastNightlyPromptDatePreference;", "lib-nightly-prompt_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory create(Provider<SharedPreferences> prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            return new NightlyAdoptionModule_ProvideLastNightlyPromptDatePrefFactory(prefs);
        }

        @JvmStatic
        public final LastNightlyPromptDatePreference provideLastNightlyPromptDatePref(SharedPreferences prefs) {
            Intrinsics.checkNotNullParameter(prefs, "prefs");
            Object objCheckNotNull = Preconditions.checkNotNull(NightlyAdoptionModule.INSTANCE.provideLastNightlyPromptDatePref(prefs), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (LastNightlyPromptDatePreference) objCheckNotNull;
        }
    }
}
