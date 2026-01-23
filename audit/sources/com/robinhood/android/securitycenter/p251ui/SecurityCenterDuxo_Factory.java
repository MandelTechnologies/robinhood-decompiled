package com.robinhood.android.securitycenter.p251ui;

import com.robinhood.android.authlock.biometric.BiometricAuthManager;
import com.robinhood.android.authlock.pin.PinManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.settings.util.MfaManager;
import com.robinhood.android.store.matcha.MatchaTreatmentStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB¡\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo;", "mfaManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/settings/util/MfaManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "markwon", "Lio/noties/markwon/Markwon;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class SecurityCenterDuxo_Factory implements Factory<SecurityCenterDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<BiometricAuthManager> biometricAuthManager;
    private final Provider<ChallengeManager> challengeManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<Markwon> markwon;
    private final Provider<MatchaTreatmentStore> matchaTreatmentStore;
    private final Provider<MfaManager> mfaManager;
    private final Provider<PinManager> pinManager;
    private final Provider<SecurityCenterStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SecurityCenterDuxo_Factory create(Provider<MfaManager> provider, Provider<ExperimentsStore> provider2, Provider<StaticContentStore> provider3, Provider<MatchaTreatmentStore> provider4, Provider<Markwon> provider5, Provider<BiometricAuthManager> provider6, Provider<PinManager> provider7, Provider<AuthManager> provider8, Provider<ChallengeManager> provider9, Provider<SecurityCenterStateProvider> provider10, Provider<DuxoBundle> provider11) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    @JvmStatic
    public static final SecurityCenterDuxo newInstance(MfaManager mfaManager, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, MatchaTreatmentStore matchaTreatmentStore, Markwon markwon, BiometricAuthManager biometricAuthManager, PinManager pinManager, AuthManager authManager, ChallengeManager challengeManager, SecurityCenterStateProvider securityCenterStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(mfaManager, experimentsStore, staticContentStore, matchaTreatmentStore, markwon, biometricAuthManager, pinManager, authManager, challengeManager, securityCenterStateProvider, duxoBundle);
    }

    public SecurityCenterDuxo_Factory(Provider<MfaManager> mfaManager, Provider<ExperimentsStore> experimentsStore, Provider<StaticContentStore> staticContentStore, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<Markwon> markwon, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<AuthManager> authManager, Provider<ChallengeManager> challengeManager, Provider<SecurityCenterStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(pinManager, "pinManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.mfaManager = mfaManager;
        this.experimentsStore = experimentsStore;
        this.staticContentStore = staticContentStore;
        this.matchaTreatmentStore = matchaTreatmentStore;
        this.markwon = markwon;
        this.biometricAuthManager = biometricAuthManager;
        this.pinManager = pinManager;
        this.authManager = authManager;
        this.challengeManager = challengeManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SecurityCenterDuxo get() {
        Companion companion = INSTANCE;
        MfaManager mfaManager = this.mfaManager.get();
        Intrinsics.checkNotNullExpressionValue(mfaManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        MatchaTreatmentStore matchaTreatmentStore = this.matchaTreatmentStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTreatmentStore, "get(...)");
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        BiometricAuthManager biometricAuthManager = this.biometricAuthManager.get();
        Intrinsics.checkNotNullExpressionValue(biometricAuthManager, "get(...)");
        PinManager pinManager = this.pinManager.get();
        Intrinsics.checkNotNullExpressionValue(pinManager, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ChallengeManager challengeManager = this.challengeManager.get();
        Intrinsics.checkNotNullExpressionValue(challengeManager, "get(...)");
        SecurityCenterStateProvider securityCenterStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(securityCenterStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(mfaManager, experimentsStore, staticContentStore, matchaTreatmentStore, markwon, biometricAuthManager, pinManager, authManager, challengeManager, securityCenterStateProvider, duxoBundle);
    }

    /* compiled from: SecurityCenterDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¢\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0007J`\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo_Factory;", "mfaManager", "Ljavax/inject/Provider;", "Lcom/robinhood/android/settings/util/MfaManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "matchaTreatmentStore", "Lcom/robinhood/android/store/matcha/MatchaTreatmentStore;", "markwon", "Lio/noties/markwon/Markwon;", "biometricAuthManager", "Lcom/robinhood/android/authlock/biometric/BiometricAuthManager;", "pinManager", "Lcom/robinhood/android/authlock/pin/PinManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "stateProvider", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterDuxo;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SecurityCenterDuxo_Factory create(Provider<MfaManager> mfaManager, Provider<ExperimentsStore> experimentsStore, Provider<StaticContentStore> staticContentStore, Provider<MatchaTreatmentStore> matchaTreatmentStore, Provider<Markwon> markwon, Provider<BiometricAuthManager> biometricAuthManager, Provider<PinManager> pinManager, Provider<AuthManager> authManager, Provider<ChallengeManager> challengeManager, Provider<SecurityCenterStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SecurityCenterDuxo_Factory(mfaManager, experimentsStore, staticContentStore, matchaTreatmentStore, markwon, biometricAuthManager, pinManager, authManager, challengeManager, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final SecurityCenterDuxo newInstance(MfaManager mfaManager, ExperimentsStore experimentsStore, StaticContentStore staticContentStore, MatchaTreatmentStore matchaTreatmentStore, Markwon markwon, BiometricAuthManager biometricAuthManager, PinManager pinManager, AuthManager authManager, ChallengeManager challengeManager, SecurityCenterStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(mfaManager, "mfaManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(matchaTreatmentStore, "matchaTreatmentStore");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
            Intrinsics.checkNotNullParameter(pinManager, "pinManager");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SecurityCenterDuxo(mfaManager, experimentsStore, staticContentStore, matchaTreatmentStore, markwon, biometricAuthManager, pinManager, authManager, challengeManager, stateProvider, duxoBundle);
        }
    }
}
