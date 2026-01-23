package com.robinhood.shared.stepupverification.challenge.email;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.lib.challenge.ChallengeManager;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailChallengeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;", "challengeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EmailChallengeDuxo_Factory implements Factory<EmailChallengeDuxo> {
    private final Provider<ChallengeManager> challengeManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<EmailChallengeStateProvider> stateProvider;
    private final Provider<WorkflowManager> workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EmailChallengeDuxo_Factory create(Provider<ChallengeManager> provider, Provider<WorkflowManager> provider2, Provider<SavedStateHandle> provider3, Provider<EmailChallengeStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final EmailChallengeDuxo newInstance(ChallengeManager challengeManager, WorkflowManager workflowManager, SavedStateHandle savedStateHandle, EmailChallengeStateProvider emailChallengeStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(challengeManager, workflowManager, savedStateHandle, emailChallengeStateProvider, duxoBundle);
    }

    public EmailChallengeDuxo_Factory(Provider<ChallengeManager> challengeManager, Provider<WorkflowManager> workflowManager, Provider<SavedStateHandle> savedStateHandle, Provider<EmailChallengeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.challengeManager = challengeManager;
        this.workflowManager = workflowManager;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public EmailChallengeDuxo get() {
        Companion companion = INSTANCE;
        ChallengeManager challengeManager = this.challengeManager.get();
        Intrinsics.checkNotNullExpressionValue(challengeManager, "get(...)");
        WorkflowManager workflowManager = this.workflowManager.get();
        Intrinsics.checkNotNullExpressionValue(workflowManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        EmailChallengeStateProvider emailChallengeStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(emailChallengeStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(challengeManager, workflowManager, savedStateHandle, emailChallengeStateProvider, duxoBundle);
    }

    /* compiled from: EmailChallengeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo_Factory;", "challengeManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/lib/challenge/ChallengeManager;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EmailChallengeDuxo_Factory create(Provider<ChallengeManager> challengeManager, Provider<WorkflowManager> workflowManager, Provider<SavedStateHandle> savedStateHandle, Provider<EmailChallengeStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EmailChallengeDuxo_Factory(challengeManager, workflowManager, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final EmailChallengeDuxo newInstance(ChallengeManager challengeManager, WorkflowManager workflowManager, SavedStateHandle savedStateHandle, EmailChallengeStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(challengeManager, "challengeManager");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EmailChallengeDuxo(challengeManager, workflowManager, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
