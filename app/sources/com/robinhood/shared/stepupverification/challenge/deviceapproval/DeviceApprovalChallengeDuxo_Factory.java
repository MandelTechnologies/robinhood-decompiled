package com.robinhood.shared.stepupverification.challenge.deviceapproval;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeStateProvider;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.lib.workflow.WorkflowManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceApprovalChallengeDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DeviceApprovalChallengeDuxo_Factory implements Factory<DeviceApprovalChallengeDuxo> {
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<Sheriff> sheriff;
    private final Provider<DeviceApprovalChallengeStateProvider> stateProvider;
    private final Provider<WorkflowManager> workflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DeviceApprovalChallengeDuxo_Factory create(Provider<Sheriff> provider, Provider<WorkflowManager> provider2, Provider<EventLogger> provider3, Provider<SavedStateHandle> provider4, Provider<AppType> provider5, Provider<AuthManager> provider6, Provider<DuxoBundle> provider7, Provider<DeviceApprovalChallengeStateProvider> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final DeviceApprovalChallengeDuxo newInstance(Sheriff sheriff, WorkflowManager workflowManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider deviceApprovalChallengeStateProvider) {
        return INSTANCE.newInstance(sheriff, workflowManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, deviceApprovalChallengeStateProvider);
    }

    public DeviceApprovalChallengeDuxo_Factory(Provider<Sheriff> sheriff, Provider<WorkflowManager> workflowManager, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<AppType> appType, Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<DeviceApprovalChallengeStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.sheriff = sheriff;
        this.workflowManager = workflowManager;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        this.appType = appType;
        this.authManager = authManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public DeviceApprovalChallengeDuxo get() {
        Companion companion = INSTANCE;
        Sheriff sheriff = this.sheriff.get();
        Intrinsics.checkNotNullExpressionValue(sheriff, "get(...)");
        WorkflowManager workflowManager = this.workflowManager.get();
        Intrinsics.checkNotNullExpressionValue(workflowManager, "get(...)");
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
        return companion.newInstance(sheriff, workflowManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, deviceApprovalChallengeStateProvider);
    }

    /* compiled from: DeviceApprovalChallengeDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo_Factory;", "sheriff", "Ljavax/inject/Provider;", "Lcom/robinhood/api/retrofit/Sheriff;", "workflowManager", "Lcom/robinhood/shared/security/lib/workflow/WorkflowManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeStateProvider;", "newInstance", "Lcom/robinhood/shared/stepupverification/challenge/deviceapproval/DeviceApprovalChallengeDuxo;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DeviceApprovalChallengeDuxo_Factory create(Provider<Sheriff> sheriff, Provider<WorkflowManager> workflowManager, Provider<EventLogger> eventLogger, Provider<SavedStateHandle> savedStateHandle, Provider<AppType> appType, Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<DeviceApprovalChallengeStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new DeviceApprovalChallengeDuxo_Factory(sheriff, workflowManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final DeviceApprovalChallengeDuxo newInstance(Sheriff sheriff, WorkflowManager workflowManager, EventLogger eventLogger, SavedStateHandle savedStateHandle, AppType appType, AuthManager authManager, DuxoBundle duxoBundle, DeviceApprovalChallengeStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(workflowManager, "workflowManager");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new DeviceApprovalChallengeDuxo(sheriff, workflowManager, eventLogger, savedStateHandle, appType, authManager, duxoBundle, stateProvider);
        }
    }
}
