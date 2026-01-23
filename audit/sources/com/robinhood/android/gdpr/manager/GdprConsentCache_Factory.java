package com.robinhood.android.gdpr.manager;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.StringPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GdprConsentCache_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB`\u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprConsentCache_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "functionalConsent", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "marketingConsent", "performanceConsent", "lastUpdatedConsent", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class GdprConsentCache_Factory implements Factory<GdprConsentCache> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<EnumPreference<GdprConsentStatus>> functionalConsent;
    private final Provider<StringPreference> lastUpdatedConsent;
    private final Provider<EnumPreference<GdprConsentStatus>> marketingConsent;
    private final Provider<EnumPreference<GdprConsentStatus>> performanceConsent;

    @JvmStatic
    public static final GdprConsentCache_Factory create(Provider<EnumPreference<GdprConsentStatus>> provider, Provider<EnumPreference<GdprConsentStatus>> provider2, Provider<EnumPreference<GdprConsentStatus>> provider3, Provider<StringPreference> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final GdprConsentCache newInstance(EnumPreference<GdprConsentStatus> enumPreference, EnumPreference<GdprConsentStatus> enumPreference2, EnumPreference<GdprConsentStatus> enumPreference3, StringPreference stringPreference) {
        return INSTANCE.newInstance(enumPreference, enumPreference2, enumPreference3, stringPreference);
    }

    public GdprConsentCache_Factory(Provider<EnumPreference<GdprConsentStatus>> functionalConsent, Provider<EnumPreference<GdprConsentStatus>> marketingConsent, Provider<EnumPreference<GdprConsentStatus>> performanceConsent, Provider<StringPreference> lastUpdatedConsent) {
        Intrinsics.checkNotNullParameter(functionalConsent, "functionalConsent");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        Intrinsics.checkNotNullParameter(performanceConsent, "performanceConsent");
        Intrinsics.checkNotNullParameter(lastUpdatedConsent, "lastUpdatedConsent");
        this.functionalConsent = functionalConsent;
        this.marketingConsent = marketingConsent;
        this.performanceConsent = performanceConsent;
        this.lastUpdatedConsent = lastUpdatedConsent;
    }

    @Override // javax.inject.Provider
    public GdprConsentCache get() {
        Companion companion = INSTANCE;
        EnumPreference<GdprConsentStatus> enumPreference = this.functionalConsent.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<GdprConsentStatus> enumPreference2 = this.marketingConsent.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference2, "get(...)");
        EnumPreference<GdprConsentStatus> enumPreference3 = this.performanceConsent.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference3, "get(...)");
        StringPreference stringPreference = this.lastUpdatedConsent.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        return companion.newInstance(enumPreference, enumPreference2, enumPreference3, stringPreference);
    }

    /* compiled from: GdprConsentCache_Factory.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\u0017\u0010\f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007JI\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/gdpr/manager/GdprConsentCache_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/gdpr/manager/GdprConsentCache_Factory;", "functionalConsent", "Ljavax/inject/Provider;", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "marketingConsent", "performanceConsent", "lastUpdatedConsent", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/android/gdpr/manager/GdprConsentCache;", "lib-gdpr-manager_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GdprConsentCache_Factory create(Provider<EnumPreference<GdprConsentStatus>> functionalConsent, Provider<EnumPreference<GdprConsentStatus>> marketingConsent, Provider<EnumPreference<GdprConsentStatus>> performanceConsent, Provider<StringPreference> lastUpdatedConsent) {
            Intrinsics.checkNotNullParameter(functionalConsent, "functionalConsent");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            Intrinsics.checkNotNullParameter(performanceConsent, "performanceConsent");
            Intrinsics.checkNotNullParameter(lastUpdatedConsent, "lastUpdatedConsent");
            return new GdprConsentCache_Factory(functionalConsent, marketingConsent, performanceConsent, lastUpdatedConsent);
        }

        @JvmStatic
        public final GdprConsentCache newInstance(EnumPreference<GdprConsentStatus> functionalConsent, EnumPreference<GdprConsentStatus> marketingConsent, EnumPreference<GdprConsentStatus> performanceConsent, StringPreference lastUpdatedConsent) {
            Intrinsics.checkNotNullParameter(functionalConsent, "functionalConsent");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            Intrinsics.checkNotNullParameter(performanceConsent, "performanceConsent");
            Intrinsics.checkNotNullParameter(lastUpdatedConsent, "lastUpdatedConsent");
            return new GdprConsentCache(functionalConsent, marketingConsent, performanceConsent, lastUpdatedConsent);
        }
    }
}
