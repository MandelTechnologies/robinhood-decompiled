package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationPasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "", "<init>", "()V", "EmailUsernameError", "AccountLocked", "Success", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$AccountLocked;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$Success;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordResult, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationPasswordViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationPasswordViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "err", "", "errorType", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError$ErrorType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError$ErrorType;)V", "getErr", "()Ljava/lang/String;", "getErrorType", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError$ErrorType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ErrorType", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordResult$EmailUsernameError, reason: from toString */
    public static final /* data */ class EmailUsernameError extends UserCreationPasswordViewState3 {
        public static final int $stable = 0;
        private final String err;
        private final ErrorType errorType;

        public static /* synthetic */ EmailUsernameError copy$default(EmailUsernameError emailUsernameError, String str, ErrorType errorType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emailUsernameError.err;
            }
            if ((i & 2) != 0) {
                errorType = emailUsernameError.errorType;
            }
            return emailUsernameError.copy(str, errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErr() {
            return this.err;
        }

        /* renamed from: component2, reason: from getter */
        public final ErrorType getErrorType() {
            return this.errorType;
        }

        public final EmailUsernameError copy(String err, ErrorType errorType) {
            Intrinsics.checkNotNullParameter(err, "err");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            return new EmailUsernameError(err, errorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmailUsernameError)) {
                return false;
            }
            EmailUsernameError emailUsernameError = (EmailUsernameError) other;
            return Intrinsics.areEqual(this.err, emailUsernameError.err) && this.errorType == emailUsernameError.errorType;
        }

        public int hashCode() {
            return (this.err.hashCode() * 31) + this.errorType.hashCode();
        }

        public String toString() {
            return "EmailUsernameError(err=" + this.err + ", errorType=" + this.errorType + ")";
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserCreationPasswordViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$EmailUsernameError$ErrorType;", "", "analyticsTag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsTag", "()Ljava/lang/String;", "EMAIL", "USERNAME", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordResult$EmailUsernameError$ErrorType */
        public static final class ErrorType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ErrorType[] $VALUES;
            public static final ErrorType EMAIL = new ErrorType("EMAIL", 0, "email");
            public static final ErrorType USERNAME = new ErrorType("USERNAME", 1, "username");
            private final String analyticsTag;

            private static final /* synthetic */ ErrorType[] $values() {
                return new ErrorType[]{EMAIL, USERNAME};
            }

            public static EnumEntries<ErrorType> getEntries() {
                return $ENTRIES;
            }

            private ErrorType(String str, int i, String str2) {
                this.analyticsTag = str2;
            }

            public final String getAnalyticsTag() {
                return this.analyticsTag;
            }

            static {
                ErrorType[] errorTypeArr$values = $values();
                $VALUES = errorTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            }

            public static ErrorType valueOf(String str) {
                return (ErrorType) Enum.valueOf(ErrorType.class, str);
            }

            public static ErrorType[] values() {
                return (ErrorType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailUsernameError(String err, ErrorType errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(err, "err");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.err = err;
            this.errorType = errorType;
        }

        public final String getErr() {
            return this.err;
        }

        public final ErrorType getErrorType() {
            return this.errorType;
        }
    }

    private UserCreationPasswordViewState3() {
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$AccountLocked;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "err", "", "<init>", "(Ljava/lang/String;)V", "getErr", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordResult$AccountLocked, reason: from toString */
    public static final /* data */ class AccountLocked extends UserCreationPasswordViewState3 {
        public static final int $stable = 0;
        private final String err;

        public static /* synthetic */ AccountLocked copy$default(AccountLocked accountLocked, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountLocked.err;
            }
            return accountLocked.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getErr() {
            return this.err;
        }

        public final AccountLocked copy(String err) {
            return new AccountLocked(err);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountLocked) && Intrinsics.areEqual(this.err, ((AccountLocked) other).err);
        }

        public int hashCode() {
            String str = this.err;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AccountLocked(err=" + this.err + ")";
        }

        public AccountLocked(String str) {
            super(null);
            this.err = str;
        }

        public final String getErr() {
            return this.err;
        }
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult$Success;", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationPasswordResult;", "state", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "<init>", "(Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;)V", "getState", "()Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationPasswordResult$Success, reason: from toString */
    public static final /* data */ class Success extends UserCreationPasswordViewState3 {
        public static final int $stable = 0;
        private final UserCreationPasswordViewState2 state;

        public static /* synthetic */ Success copy$default(Success success, UserCreationPasswordViewState2 userCreationPasswordViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                userCreationPasswordViewState2 = success.state;
            }
            return success.copy(userCreationPasswordViewState2);
        }

        /* renamed from: component1, reason: from getter */
        public final UserCreationPasswordViewState2 getState() {
            return this.state;
        }

        public final Success copy(UserCreationPasswordViewState2 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Success(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.state, ((Success) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Success(state=" + this.state + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(UserCreationPasswordViewState2 state) {
            super(null);
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final UserCreationPasswordViewState2 getState() {
            return this.state;
        }
    }
}
