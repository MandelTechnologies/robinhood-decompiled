package com.robinhood.android.challenge.verification;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: ChallengeVerificationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0093\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ChallengeVerificationDuxo_Factory implements Factory<ChallengeVerificationDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<ChallengeManager> challengeManager;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SharedEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<ProfileInfoStore> profileInfoStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ChallengeVerificationStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ChallengeVerificationDuxo_Factory create(Provider<ChallengeManager> provider, Provider<UserStore> provider2, Provider<ProfileInfoStore> provider3, Provider<SharedEventLogger> provider4, Provider<AuthManager> provider5, Provider<ExperimentsStore> provider6, Provider<ChallengeVerificationStateProvider> provider7, Provider<DuxoBundle> provider8, Provider<SavedStateHandle> provider9, Provider<Clock> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final ChallengeVerificationDuxo newInstance(ChallengeManager challengeManager, UserStore userStore, ProfileInfoStore profileInfoStore, SharedEventLogger sharedEventLogger, AuthManager authManager, ExperimentsStore experimentsStore, ChallengeVerificationStateProvider challengeVerificationStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, Clock clock) {
        return INSTANCE.newInstance(challengeManager, userStore, profileInfoStore, sharedEventLogger, authManager, experimentsStore, challengeVerificationStateProvider, duxoBundle, savedStateHandle, clock);
    }

    public ChallengeVerificationDuxo_Factory(Provider<ChallengeManager> challengeManager, Provider<UserStore> userStore, Provider<ProfileInfoStore> profileInfoStore, Provider<SharedEventLogger> eventLogger, Provider<AuthManager> authManager, Provider<ExperimentsStore> experimentsStore, Provider<ChallengeVerificationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.challengeManager = challengeManager;
        this.userStore = userStore;
        this.profileInfoStore = profileInfoStore;
        this.eventLogger = eventLogger;
        this.authManager = authManager;
        this.experimentsStore = experimentsStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public ChallengeVerificationDuxo get() {
        Companion companion = INSTANCE;
        ChallengeManager challengeManager = this.challengeManager.get();
        Intrinsics.checkNotNullExpressionValue(challengeManager, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        SharedEventLogger sharedEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(sharedEventLogger, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ChallengeVerificationStateProvider challengeVerificationStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(challengeVerificationStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(challengeManager, userStore, profileInfoStore, sharedEventLogger, authManager, experimentsStore, challengeVerificationStateProvider, duxoBundle, savedStateHandle, clock);
    }

    /* compiled from: ChallengeVerificationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009b\u0001\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/analytics/SharedEventLogger;", "eventLogger", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo_Factory;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "newInstance", "(Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/analytics/SharedEventLogger;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/challenge/verification/ChallengeVerificationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;)Lcom/robinhood/android/challenge/verification/ChallengeVerificationDuxo;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChallengeVerificationDuxo_Factory create(Provider<ChallengeManager> challengeManager, Provider<UserStore> userStore, Provider<ProfileInfoStore> profileInfoStore, Provider<SharedEventLogger> eventLogger, Provider<AuthManager> authManager, Provider<ExperimentsStore> experimentsStore, Provider<ChallengeVerificationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ChallengeVerificationDuxo_Factory(challengeManager, userStore, profileInfoStore, eventLogger, authManager, experimentsStore, stateProvider, duxoBundle, savedStateHandle, clock);
        }

        @JvmStatic
        public final ChallengeVerificationDuxo newInstance(ChallengeManager challengeManager, UserStore userStore, ProfileInfoStore profileInfoStore, SharedEventLogger eventLogger, AuthManager authManager, ExperimentsStore experimentsStore, ChallengeVerificationStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, Clock clock) {
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new ChallengeVerificationDuxo(challengeManager, userStore, profileInfoStore, eventLogger, authManager, experimentsStore, stateProvider, duxoBundle, savedStateHandle, clock);
        }
    }
}
