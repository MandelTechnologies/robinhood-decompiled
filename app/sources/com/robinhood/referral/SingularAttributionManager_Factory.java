package com.robinhood.referral;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.gdpr.GdprConsentStatus;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.prefs.Installation;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringToStringMapPreference;
import com.robinhood.referral.singular.AttributionApi;
import com.robinhood.shared.common.singular.SingularSdkWrapper;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SingularAttributionManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u009e\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00180\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0015\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00180\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/referral/SingularAttributionManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/referral/SingularAttributionManager;", "attributionApi", "Ljavax/inject/Provider;", "Lcom/robinhood/referral/singular/AttributionApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "installation", "Lcom/robinhood/prefs/Installation;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "deeplinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "productDataPref", "Lcom/robinhood/prefs/StringPreference;", "campaignDataPref", "metadataPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class SingularAttributionManager_Factory implements Factory<SingularAttributionManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AttributionApi> attributionApi;
    private final Provider<AuthManager> authManager;
    private final Provider<StringPreference> campaignDataPref;
    private final Provider<CoroutineScope> coroutineScope;
    private final Provider<DeepLinkResolver> deeplinkResolver;
    private final Provider<Installation> installation;
    private final Provider<EnumPreference<GdprConsentStatus>> marketingConsent;
    private final Provider<StringToStringMapPreference> metadataPref;
    private final Provider<StringPreference> productDataPref;
    private final Provider<SingularSdkWrapper> singularSdkWrapper;

    @JvmStatic
    public static final SingularAttributionManager_Factory create(Provider<AttributionApi> provider, Provider<AuthManager> provider2, Provider<Installation> provider3, Provider<SingularSdkWrapper> provider4, Provider<DeepLinkResolver> provider5, Provider<StringPreference> provider6, Provider<StringPreference> provider7, Provider<StringToStringMapPreference> provider8, Provider<CoroutineScope> provider9, Provider<EnumPreference<GdprConsentStatus>> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final SingularAttributionManager newInstance(AttributionApi attributionApi, AuthManager authManager, Installation installation, SingularSdkWrapper singularSdkWrapper, DeepLinkResolver deepLinkResolver, StringPreference stringPreference, StringPreference stringPreference2, StringToStringMapPreference stringToStringMapPreference, CoroutineScope coroutineScope, EnumPreference<GdprConsentStatus> enumPreference) {
        return INSTANCE.newInstance(attributionApi, authManager, installation, singularSdkWrapper, deepLinkResolver, stringPreference, stringPreference2, stringToStringMapPreference, coroutineScope, enumPreference);
    }

    public SingularAttributionManager_Factory(Provider<AttributionApi> attributionApi, Provider<AuthManager> authManager, Provider<Installation> installation, Provider<SingularSdkWrapper> singularSdkWrapper, Provider<DeepLinkResolver> deeplinkResolver, Provider<StringPreference> productDataPref, Provider<StringPreference> campaignDataPref, Provider<StringToStringMapPreference> metadataPref, Provider<CoroutineScope> coroutineScope, Provider<EnumPreference<GdprConsentStatus>> marketingConsent) {
        Intrinsics.checkNotNullParameter(attributionApi, "attributionApi");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
        Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
        Intrinsics.checkNotNullParameter(productDataPref, "productDataPref");
        Intrinsics.checkNotNullParameter(campaignDataPref, "campaignDataPref");
        Intrinsics.checkNotNullParameter(metadataPref, "metadataPref");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
        this.attributionApi = attributionApi;
        this.authManager = authManager;
        this.installation = installation;
        this.singularSdkWrapper = singularSdkWrapper;
        this.deeplinkResolver = deeplinkResolver;
        this.productDataPref = productDataPref;
        this.campaignDataPref = campaignDataPref;
        this.metadataPref = metadataPref;
        this.coroutineScope = coroutineScope;
        this.marketingConsent = marketingConsent;
    }

    @Override // javax.inject.Provider
    public SingularAttributionManager get() {
        Companion companion = INSTANCE;
        AttributionApi attributionApi = this.attributionApi.get();
        Intrinsics.checkNotNullExpressionValue(attributionApi, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        Installation installation = this.installation.get();
        Intrinsics.checkNotNullExpressionValue(installation, "get(...)");
        SingularSdkWrapper singularSdkWrapper = this.singularSdkWrapper.get();
        Intrinsics.checkNotNullExpressionValue(singularSdkWrapper, "get(...)");
        DeepLinkResolver deepLinkResolver = this.deeplinkResolver.get();
        Intrinsics.checkNotNullExpressionValue(deepLinkResolver, "get(...)");
        StringPreference stringPreference = this.productDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.campaignDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        StringToStringMapPreference stringToStringMapPreference = this.metadataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToStringMapPreference, "get(...)");
        CoroutineScope coroutineScope = this.coroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        EnumPreference<GdprConsentStatus> enumPreference = this.marketingConsent.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        return companion.newInstance(attributionApi, authManager, installation, singularSdkWrapper, deepLinkResolver, stringPreference, stringPreference2, stringToStringMapPreference, coroutineScope, enumPreference);
    }

    /* compiled from: SingularAttributionManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009f\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0017\u0010\u0018\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001b0\u0007H\u0007Jc\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001bH\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/referral/SingularAttributionManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/referral/SingularAttributionManager_Factory;", "attributionApi", "Ljavax/inject/Provider;", "Lcom/robinhood/referral/singular/AttributionApi;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "installation", "Lcom/robinhood/prefs/Installation;", "singularSdkWrapper", "Lcom/robinhood/shared/common/singular/SingularSdkWrapper;", "deeplinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "productDataPref", "Lcom/robinhood/prefs/StringPreference;", "campaignDataPref", "metadataPref", "Lcom/robinhood/prefs/StringToStringMapPreference;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "marketingConsent", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/gdpr/GdprConsentStatus;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/referral/SingularAttributionManager;", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SingularAttributionManager_Factory create(Provider<AttributionApi> attributionApi, Provider<AuthManager> authManager, Provider<Installation> installation, Provider<SingularSdkWrapper> singularSdkWrapper, Provider<DeepLinkResolver> deeplinkResolver, Provider<StringPreference> productDataPref, Provider<StringPreference> campaignDataPref, Provider<StringToStringMapPreference> metadataPref, Provider<CoroutineScope> coroutineScope, Provider<EnumPreference<GdprConsentStatus>> marketingConsent) {
            Intrinsics.checkNotNullParameter(attributionApi, "attributionApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
            Intrinsics.checkNotNullParameter(productDataPref, "productDataPref");
            Intrinsics.checkNotNullParameter(campaignDataPref, "campaignDataPref");
            Intrinsics.checkNotNullParameter(metadataPref, "metadataPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            return new SingularAttributionManager_Factory(attributionApi, authManager, installation, singularSdkWrapper, deeplinkResolver, productDataPref, campaignDataPref, metadataPref, coroutineScope, marketingConsent);
        }

        @JvmStatic
        public final SingularAttributionManager newInstance(AttributionApi attributionApi, AuthManager authManager, Installation installation, SingularSdkWrapper singularSdkWrapper, DeepLinkResolver deeplinkResolver, StringPreference productDataPref, StringPreference campaignDataPref, StringToStringMapPreference metadataPref, CoroutineScope coroutineScope, EnumPreference<GdprConsentStatus> marketingConsent) {
            Intrinsics.checkNotNullParameter(attributionApi, "attributionApi");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(installation, "installation");
            Intrinsics.checkNotNullParameter(singularSdkWrapper, "singularSdkWrapper");
            Intrinsics.checkNotNullParameter(deeplinkResolver, "deeplinkResolver");
            Intrinsics.checkNotNullParameter(productDataPref, "productDataPref");
            Intrinsics.checkNotNullParameter(campaignDataPref, "campaignDataPref");
            Intrinsics.checkNotNullParameter(metadataPref, "metadataPref");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(marketingConsent, "marketingConsent");
            return new SingularAttributionManager(attributionApi, authManager, installation, singularSdkWrapper, deeplinkResolver, productDataPref, campaignDataPref, metadataPref, coroutineScope, marketingConsent);
        }
    }
}
