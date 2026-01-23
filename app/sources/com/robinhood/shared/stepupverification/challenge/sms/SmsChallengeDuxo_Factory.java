package com.robinhood.shared.stepupverification.challenge.sms;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: SmsChallengeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "workflowManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class SmsChallengeDuxo_Factory implements Factory<SmsChallengeDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<ChallengeManager> challengeManager;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ProfileInfoStore> profileInfoStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SmsChallengeStateProvider> stateProvider;
    private final Provider<UserStore> userStore;
    private final Provider<WorkflowManager> workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SmsChallengeDuxo_Factory create(Provider<AuthManager> provider, Provider<ChallengeManager> provider2, Provider<ProfileInfoStore> provider3, Provider<WorkflowManager> provider4, Provider<UserStore> provider5, Provider<Clock> provider6, Provider<SavedStateHandle> provider7, Provider<SmsChallengeStateProvider> provider8, Provider<DuxoBundle> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final SmsChallengeDuxo newInstance(AuthManager authManager, ChallengeManager challengeManager, ProfileInfoStore profileInfoStore, WorkflowManager workflowManager, UserStore userStore, Clock clock, SavedStateHandle savedStateHandle, SmsChallengeStateProvider smsChallengeStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(authManager, challengeManager, profileInfoStore, workflowManager, userStore, clock, savedStateHandle, smsChallengeStateProvider, duxoBundle);
    }

    public SmsChallengeDuxo_Factory(Provider<AuthManager> authManager, Provider<ChallengeManager> challengeManager, Provider<ProfileInfoStore> profileInfoStore, Provider<WorkflowManager> workflowManager, Provider<UserStore> userStore, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<SmsChallengeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.authManager = authManager;
        this.challengeManager = challengeManager;
        this.profileInfoStore = profileInfoStore;
        this.workflowManager = workflowManager;
        this.userStore = userStore;
        this.clock = clock;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public SmsChallengeDuxo get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        ChallengeManager challengeManager = this.challengeManager.get();
        Intrinsics.checkNotNullExpressionValue(challengeManager, "get(...)");
        ProfileInfoStore profileInfoStore = this.profileInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(profileInfoStore, "get(...)");
        WorkflowManager workflowManager = this.workflowManager.get();
        Intrinsics.checkNotNullExpressionValue(workflowManager, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SmsChallengeStateProvider smsChallengeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(smsChallengeStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(authManager, challengeManager, profileInfoStore, workflowManager, userStore, clock, savedStateHandle, smsChallengeStateProvider, duxoBundle);
    }

    /* compiled from: SmsChallengeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008d\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JW\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "authManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "challengeManager", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;", "profileInfoStore", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "workflowManager", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo_Factory;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "newInstance", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/lib/challenge/ChallengeManager;Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore;Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SmsChallengeDuxo_Factory create(Provider<AuthManager> authManager, Provider<ChallengeManager> challengeManager, Provider<ProfileInfoStore> profileInfoStore, Provider<WorkflowManager> workflowManager, Provider<UserStore> userStore, Provider<Clock> clock, Provider<SavedStateHandle> savedStateHandle, Provider<SmsChallengeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SmsChallengeDuxo_Factory(authManager, challengeManager, profileInfoStore, workflowManager, userStore, clock, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final SmsChallengeDuxo newInstance(AuthManager authManager, ChallengeManager challengeManager, ProfileInfoStore profileInfoStore, WorkflowManager workflowManager, UserStore userStore, Clock clock, SavedStateHandle savedStateHandle, SmsChallengeStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(profileInfoStore, "profileInfoStore");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new SmsChallengeDuxo(authManager, challengeManager, profileInfoStore, workflowManager, userStore, clock, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
