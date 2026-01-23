package com.robinhood.android.p273ui.login.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.robinhood.android.authlock.biometric.BiometricChangeManager;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.p273ui.BaseLoginActivity;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.user.contracts.auth.Login;
import com.robinhood.targetbackend.TargetBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginActivity.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/LoginActivity;", "Lcom/robinhood/android/ui/BaseLoginActivity;", "<init>", "()V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "biometricChangeManager", "Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "getBiometricChangeManager", "()Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;", "setBiometricChangeManager", "(Lcom/robinhood/android/authlock/biometric/BiometricChangeManager;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "loginExtras", "Lcom/robinhood/shared/user/contracts/auth/Login;", "getLoginExtras", "()Lcom/robinhood/shared/user/contracts/auth/Login;", "Companion", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LoginActivity extends BaseLoginActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public BiometricChangeManager biometricChangeManager;
    public ExperimentsStore experimentsStore;
    public SupportEmailHandler supportEmailHandler;
    public TargetBackend targetBackend;

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public SupportEmailHandler getSupportEmailHandler() {
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler;
        if (supportEmailHandler != null) {
            return supportEmailHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportEmailHandler");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public void setSupportEmailHandler(SupportEmailHandler supportEmailHandler) {
        Intrinsics.checkNotNullParameter(supportEmailHandler, "<set-?>");
        this.supportEmailHandler = supportEmailHandler;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public BiometricChangeManager getBiometricChangeManager() {
        BiometricChangeManager biometricChangeManager = this.biometricChangeManager;
        if (biometricChangeManager != null) {
            return biometricChangeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("biometricChangeManager");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public void setBiometricChangeManager(BiometricChangeManager biometricChangeManager) {
        Intrinsics.checkNotNullParameter(biometricChangeManager, "<set-?>");
        this.biometricChangeManager = biometricChangeManager;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    public void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    @Override // com.robinhood.android.p273ui.BaseLoginActivity
    protected Login getLoginExtras() {
        return (Login) INSTANCE.getExtras((Activity) this);
    }

    /* compiled from: LoginActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ui/login/app/LoginActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/ui/login/app/LoginActivity;", "Lcom/robinhood/shared/user/contracts/auth/Login;", "<init>", "()V", "feature-login_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<LoginActivity, Login> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Login getExtras(LoginActivity loginActivity) {
            return (Login) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, loginActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, Login login) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, login);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Login login) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, login);
        }
    }
}
