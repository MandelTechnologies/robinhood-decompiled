package com.robinhood.shared.login.lib.p385ui;

import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseLoginEvent.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "", "LoginSuccess", "LoginError", "LoginVerificationRequired", "AccountRecoveryVerificationRequired", "SaveCredentials", "ShowPasskeyBottomSheet", "PasskeyLoginSuccess", "PasskeyLoginFailure", "PasskeyCancelledOrInterrupted", "PasskeyNoCredentialsAvailable", "PromptForPrivacy", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$AccountRecoveryVerificationRequired;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginError;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginSuccess;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginVerificationRequired;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyCancelledOrInterrupted;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyLoginFailure;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyLoginSuccess;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyNoCredentialsAvailable;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PromptForPrivacy;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$SaveCredentials;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$ShowPasskeyBottomSheet;", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface BaseLoginEvent {

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginSuccess;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "email", "", "password", "<init>", "(Lcom/robinhood/login/LoginStatus;Ljava/lang/String;Ljava/lang/String;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoginSuccess implements BaseLoginEvent {
        public static final int $stable = 8;
        private final String email;
        private final LoginStatus loginStatus;
        private final String password;

        public static /* synthetic */ LoginSuccess copy$default(LoginSuccess loginSuccess, LoginStatus loginStatus, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                loginStatus = loginSuccess.loginStatus;
            }
            if ((i & 2) != 0) {
                str = loginSuccess.email;
            }
            if ((i & 4) != 0) {
                str2 = loginSuccess.password;
            }
            return loginSuccess.copy(loginStatus, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final LoginSuccess copy(LoginStatus loginStatus, String email, String password) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(password, "password");
            return new LoginSuccess(loginStatus, email, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginSuccess)) {
                return false;
            }
            LoginSuccess loginSuccess = (LoginSuccess) other;
            return Intrinsics.areEqual(this.loginStatus, loginSuccess.loginStatus) && Intrinsics.areEqual(this.email, loginSuccess.email) && Intrinsics.areEqual(this.password, loginSuccess.password);
        }

        public int hashCode() {
            return (((this.loginStatus.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "LoginSuccess(loginStatus=" + this.loginStatus + ", email=" + this.email + ", password=" + this.password + ")";
        }

        public LoginSuccess(LoginStatus loginStatus, String email, String password) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(password, "password");
            this.loginStatus = loginStatus;
            this.email = email;
            this.password = password;
        }

        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginError;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "error", "", "email", "", "password", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/Throwable;", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoginError implements BaseLoginEvent {
        public static final int $stable = 8;
        private final String email;
        private final Throwable error;
        private final String password;

        public static /* synthetic */ LoginError copy$default(LoginError loginError, Throwable th, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                th = loginError.error;
            }
            if ((i & 2) != 0) {
                str = loginError.email;
            }
            if ((i & 4) != 0) {
                str2 = loginError.password;
            }
            return loginError.copy(th, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final LoginError copy(Throwable error, String email, String password) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(password, "password");
            return new LoginError(error, email, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginError)) {
                return false;
            }
            LoginError loginError = (LoginError) other;
            return Intrinsics.areEqual(this.error, loginError.error) && Intrinsics.areEqual(this.email, loginError.email) && Intrinsics.areEqual(this.password, loginError.password);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "LoginError(error=" + this.error + ", email=" + this.email + ", password=" + this.password + ")";
        }

        public LoginError(Throwable error, String email, String password) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(password, "password");
            this.error = error;
            this.email = email;
            this.password = password;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$LoginVerificationRequired;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoginVerificationRequired implements BaseLoginEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ LoginVerificationRequired copy$default(LoginVerificationRequired loginVerificationRequired, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loginVerificationRequired.workflowId;
            }
            if ((i & 2) != 0) {
                z = loginVerificationRequired.isMigrated;
            }
            return loginVerificationRequired.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final LoginVerificationRequired copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new LoginVerificationRequired(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginVerificationRequired)) {
                return false;
            }
            LoginVerificationRequired loginVerificationRequired = (LoginVerificationRequired) other;
            return Intrinsics.areEqual(this.workflowId, loginVerificationRequired.workflowId) && this.isMigrated == loginVerificationRequired.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "LoginVerificationRequired(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public LoginVerificationRequired(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$AccountRecoveryVerificationRequired;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "workflowId", "Ljava/util/UUID;", "isMigrated", "", "<init>", "(Ljava/util/UUID;Z)V", "getWorkflowId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountRecoveryVerificationRequired implements BaseLoginEvent {
        public static final int $stable = 8;
        private final boolean isMigrated;
        private final UUID workflowId;

        public static /* synthetic */ AccountRecoveryVerificationRequired copy$default(AccountRecoveryVerificationRequired accountRecoveryVerificationRequired, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = accountRecoveryVerificationRequired.workflowId;
            }
            if ((i & 2) != 0) {
                z = accountRecoveryVerificationRequired.isMigrated;
            }
            return accountRecoveryVerificationRequired.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMigrated() {
            return this.isMigrated;
        }

        public final AccountRecoveryVerificationRequired copy(UUID workflowId, boolean isMigrated) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            return new AccountRecoveryVerificationRequired(workflowId, isMigrated);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountRecoveryVerificationRequired)) {
                return false;
            }
            AccountRecoveryVerificationRequired accountRecoveryVerificationRequired = (AccountRecoveryVerificationRequired) other;
            return Intrinsics.areEqual(this.workflowId, accountRecoveryVerificationRequired.workflowId) && this.isMigrated == accountRecoveryVerificationRequired.isMigrated;
        }

        public int hashCode() {
            return (this.workflowId.hashCode() * 31) + Boolean.hashCode(this.isMigrated);
        }

        public String toString() {
            return "AccountRecoveryVerificationRequired(workflowId=" + this.workflowId + ", isMigrated=" + this.isMigrated + ")";
        }

        public AccountRecoveryVerificationRequired(UUID workflowId, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.workflowId = workflowId;
            this.isMigrated = z;
        }

        public final UUID getWorkflowId() {
            return this.workflowId;
        }

        public final boolean isMigrated() {
            return this.isMigrated;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$SaveCredentials;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "id", "", "password", "<init>", "(Lcom/robinhood/login/LoginStatus;Ljava/lang/String;Ljava/lang/String;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "getId", "()Ljava/lang/String;", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SaveCredentials implements BaseLoginEvent {
        public static final int $stable = 8;
        private final String id;
        private final LoginStatus loginStatus;
        private final String password;

        public static /* synthetic */ SaveCredentials copy$default(SaveCredentials saveCredentials, LoginStatus loginStatus, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                loginStatus = saveCredentials.loginStatus;
            }
            if ((i & 2) != 0) {
                str = saveCredentials.id;
            }
            if ((i & 4) != 0) {
                str2 = saveCredentials.password;
            }
            return saveCredentials.copy(loginStatus, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final SaveCredentials copy(LoginStatus loginStatus, String id, String password) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            return new SaveCredentials(loginStatus, id, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveCredentials)) {
                return false;
            }
            SaveCredentials saveCredentials = (SaveCredentials) other;
            return Intrinsics.areEqual(this.loginStatus, saveCredentials.loginStatus) && Intrinsics.areEqual(this.id, saveCredentials.id) && Intrinsics.areEqual(this.password, saveCredentials.password);
        }

        public int hashCode() {
            return (((this.loginStatus.hashCode() * 31) + this.id.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "SaveCredentials(loginStatus=" + this.loginStatus + ", id=" + this.id + ", password=" + this.password + ")";
        }

        public SaveCredentials(LoginStatus loginStatus, String id, String password) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            this.loginStatus = loginStatus;
            this.id = id;
            this.password = password;
        }

        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        public final String getId() {
            return this.id;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$ShowPasskeyBottomSheet;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPasskeyBottomSheet implements BaseLoginEvent {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ ShowPasskeyBottomSheet copy$default(ShowPasskeyBottomSheet showPasskeyBottomSheet, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = showPasskeyBottomSheet.challenge;
            }
            return showPasskeyBottomSheet.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final ShowPasskeyBottomSheet copy(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new ShowPasskeyBottomSheet(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPasskeyBottomSheet) && Intrinsics.areEqual(this.challenge, ((ShowPasskeyBottomSheet) other).challenge);
        }

        public int hashCode() {
            return this.challenge.hashCode();
        }

        public String toString() {
            return "ShowPasskeyBottomSheet(challenge=" + this.challenge + ")";
        }

        public ShowPasskeyBottomSheet(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyLoginSuccess;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "loginStatus", "Lcom/robinhood/login/LoginStatus;", "<init>", "(Lcom/robinhood/login/LoginStatus;)V", "getLoginStatus", "()Lcom/robinhood/login/LoginStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PasskeyLoginSuccess implements BaseLoginEvent {
        public static final int $stable = 8;
        private final LoginStatus loginStatus;

        public static /* synthetic */ PasskeyLoginSuccess copy$default(PasskeyLoginSuccess passkeyLoginSuccess, LoginStatus loginStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                loginStatus = passkeyLoginSuccess.loginStatus;
            }
            return passkeyLoginSuccess.copy(loginStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }

        public final PasskeyLoginSuccess copy(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            return new PasskeyLoginSuccess(loginStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PasskeyLoginSuccess) && Intrinsics.areEqual(this.loginStatus, ((PasskeyLoginSuccess) other).loginStatus);
        }

        public int hashCode() {
            return this.loginStatus.hashCode();
        }

        public String toString() {
            return "PasskeyLoginSuccess(loginStatus=" + this.loginStatus + ")";
        }

        public PasskeyLoginSuccess(LoginStatus loginStatus) {
            Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
            this.loginStatus = loginStatus;
        }

        public final LoginStatus getLoginStatus() {
            return this.loginStatus;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyLoginFailure;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PasskeyLoginFailure implements BaseLoginEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ PasskeyLoginFailure copy$default(PasskeyLoginFailure passkeyLoginFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = passkeyLoginFailure.error;
            }
            return passkeyLoginFailure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final PasskeyLoginFailure copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new PasskeyLoginFailure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PasskeyLoginFailure) && Intrinsics.areEqual(this.error, ((PasskeyLoginFailure) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "PasskeyLoginFailure(error=" + this.error + ")";
        }

        public PasskeyLoginFailure(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyCancelledOrInterrupted;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PasskeyCancelledOrInterrupted implements BaseLoginEvent {
        public static final int $stable = 0;
        public static final PasskeyCancelledOrInterrupted INSTANCE = new PasskeyCancelledOrInterrupted();

        public boolean equals(Object other) {
            return this == other || (other instanceof PasskeyCancelledOrInterrupted);
        }

        public int hashCode() {
            return 1909664104;
        }

        public String toString() {
            return "PasskeyCancelledOrInterrupted";
        }

        private PasskeyCancelledOrInterrupted() {
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PasskeyNoCredentialsAvailable;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PasskeyNoCredentialsAvailable implements BaseLoginEvent {
        public static final int $stable = 0;
        public static final PasskeyNoCredentialsAvailable INSTANCE = new PasskeyNoCredentialsAvailable();

        public boolean equals(Object other) {
            return this == other || (other instanceof PasskeyNoCredentialsAvailable);
        }

        public int hashCode() {
            return 1163945320;
        }

        public String toString() {
            return "PasskeyNoCredentialsAvailable";
        }

        private PasskeyNoCredentialsAvailable() {
        }
    }

    /* compiled from: BaseLoginEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent$PromptForPrivacy;", "Lcom/robinhood/shared/login/lib/ui/BaseLoginEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PromptForPrivacy implements BaseLoginEvent {
        public static final int $stable = 0;
        public static final PromptForPrivacy INSTANCE = new PromptForPrivacy();

        public boolean equals(Object other) {
            return this == other || (other instanceof PromptForPrivacy);
        }

        public int hashCode() {
            return 1220714231;
        }

        public String toString() {
            return "PromptForPrivacy";
        }

        private PromptForPrivacy() {
        }
    }
}
