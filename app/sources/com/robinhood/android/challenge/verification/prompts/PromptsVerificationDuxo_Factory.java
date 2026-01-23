package com.robinhood.android.challenge.verification.prompts;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.security.prompts.PromptsChallengeStatusManager;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeStateProvider;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsVerificationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo;", "statusManager", "Ljavax/inject/Provider;", "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PromptsVerificationDuxo_Factory implements Factory<PromptsVerificationDuxo> {
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<ChallengeManager> challengeManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<DeviceApprovalChallengeStateProvider> stateProvider;
    private final Provider<PromptsChallengeStatusManager> statusManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PromptsVerificationDuxo_Factory create(Provider<PromptsChallengeStatusManager> provider, Provider<ChallengeManager> provider2, Provider<EventLogger> provider3, Provider<SavedStateHandle> provider4, Provider<AppType> provider5, Provider<AuthManager> provider6, Provider<DuxoBundle> provider7, Provider<DeviceApprovalChallengeStateProvider> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final PromptsVerificationDuxo newInstance(PromptsChallengeStatusManager promptsChallengeStatusManager, ChallengeManager challengeManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider deviceApprovalChallengeStateProvider) {
        return INSTANCE.newInstance(promptsChallengeStatusManager, challengeManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, deviceApprovalChallengeStateProvider);
    }

    public PromptsVerificationDuxo_Factory(Provider<PromptsChallengeStatusManager> statusManager, Provider<ChallengeManager> challengeManager, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<AppType> appType, Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<DeviceApprovalChallengeStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(statusManager, "statusManager");
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.statusManager = statusManager;
        this.challengeManager = challengeManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.appType = appType;
        this.authManager = authManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public PromptsVerificationDuxo get() {
        Companion companion = INSTANCE;
        PromptsChallengeStatusManager promptsChallengeStatusManager = this.statusManager.get();
        Intrinsics.checkNotNullExpressionValue(promptsChallengeStatusManager, "get(...)");
        ChallengeManager challengeManager = this.challengeManager.get();
        Intrinsics.checkNotNullExpressionValue(challengeManager, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DeviceApprovalChallengeStateProvider deviceApprovalChallengeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(deviceApprovalChallengeStateProvider, "get(...)");
        return companion.newInstance(promptsChallengeStatusManager, challengeManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, deviceApprovalChallengeStateProvider);
    }

    /* compiled from: PromptsVerificationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo_Factory;", "statusManager", "Ljavax/inject/Provider;", "Lcom/robinhood/security/prompts/PromptsChallengeStatusManager;", "challengeManager", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "newInstance", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationDuxo;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PromptsVerificationDuxo_Factory create(Provider<PromptsChallengeStatusManager> statusManager, Provider<ChallengeManager> challengeManager, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<AppType> appType, Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<DeviceApprovalChallengeStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(statusManager, "statusManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PromptsVerificationDuxo_Factory(statusManager, challengeManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final PromptsVerificationDuxo newInstance(PromptsChallengeStatusManager statusManager, ChallengeManager challengeManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(statusManager, "statusManager");
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PromptsVerificationDuxo(statusManager, challengeManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, stateProvider);
        }
    }
}
