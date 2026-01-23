package com.robinhood.shared.update.password;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/update/password/UpdatePasswordDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UpdatePasswordDuxo_Factory implements Factory<UpdatePasswordDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<UpdatePasswordStateProvider> stateProvider;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final UpdatePasswordDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<AuthManager> provider2, Provider<SuvWorkflowManager> provider3, Provider<UpdatePasswordStateProvider> provider4, Provider<DuxoBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final UpdatePasswordDuxo newInstance(SavedStateHandle savedStateHandle, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, UpdatePasswordStateProvider updatePasswordStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(savedStateHandle, authManager, suvWorkflowManager, updatePasswordStateProvider, duxoBundle);
    }

    public UpdatePasswordDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<AuthManager> authManager, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<UpdatePasswordStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.authManager = authManager;
        this.suvWorkflowManager = suvWorkflowManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public UpdatePasswordDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        UpdatePasswordStateProvider updatePasswordStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(updatePasswordStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(savedStateHandle, authManager, suvWorkflowManager, updatePasswordStateProvider, duxoBundle);
    }

    /* compiled from: UpdatePasswordDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/update/password/UpdatePasswordDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/shared/update/password/UpdatePasswordStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/shared/update/password/UpdatePasswordDuxo;", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final UpdatePasswordDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<AuthManager> authManager, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<UpdatePasswordStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new UpdatePasswordDuxo_Factory(savedStateHandle, authManager, suvWorkflowManager, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final UpdatePasswordDuxo newInstance(SavedStateHandle savedStateHandle, AuthManager authManager, SuvWorkflowManager suvWorkflowManager, UpdatePasswordStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new UpdatePasswordDuxo(savedStateHandle, authManager, suvWorkflowManager, stateProvider, duxoBundle);
        }
    }
}
