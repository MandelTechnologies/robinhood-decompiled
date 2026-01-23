package com.robinhood.android.account.store.naming;

import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NicknameValidationResult.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "", "<init>", "()V", "canSubmit", "", "getCanSubmit", "()Z", "Valid", "NotEnoughLetters", "InvalidCharacters", "Error", "UnknownError", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult$Error;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult$InvalidCharacters;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult$NotEnoughLetters;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult$UnknownError;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult$Valid;", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class NicknameValidationResult {
    public /* synthetic */ NicknameValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NicknameValidationResult() {
    }

    /* compiled from: NicknameValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult$Valid;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "nickname", "", "<init>", "(Ljava/lang/String;)V", "getNickname", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Valid extends NicknameValidationResult {
        private final String nickname;

        /* JADX WARN: Multi-variable type inference failed */
        public Valid() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Valid copy$default(Valid valid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = valid.nickname;
            }
            return valid.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNickname() {
            return this.nickname;
        }

        public final Valid copy(String nickname) {
            return new Valid(nickname);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.nickname, ((Valid) other).nickname);
        }

        public int hashCode() {
            String str = this.nickname;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Valid(nickname=" + this.nickname + ")";
        }

        public Valid(String str) {
            super(null);
            this.nickname = str;
        }

        public /* synthetic */ Valid(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getNickname() {
            return this.nickname;
        }
    }

    /* compiled from: NicknameValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult$NotEnoughLetters;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotEnoughLetters extends NicknameValidationResult {
        public static final NotEnoughLetters INSTANCE = new NotEnoughLetters();

        public boolean equals(Object other) {
            return this == other || (other instanceof NotEnoughLetters);
        }

        public int hashCode() {
            return -384282288;
        }

        public String toString() {
            return "NotEnoughLetters";
        }

        private NotEnoughLetters() {
            super(null);
        }
    }

    /* compiled from: NicknameValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult$InvalidCharacters;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvalidCharacters extends NicknameValidationResult {
        public static final InvalidCharacters INSTANCE = new InvalidCharacters();

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidCharacters);
        }

        public int hashCode() {
            return -131563365;
        }

        public String toString() {
            return "InvalidCharacters";
        }

        private InvalidCharacters() {
            super(null);
        }
    }

    /* compiled from: NicknameValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult$Error;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "message", "", "severity", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;)V", "getMessage", "()Ljava/lang/String;", "getSeverity", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends NicknameValidationResult {
        private final String message;
        private final ValidateNicknameResponseDto.WarningDto.SeverityDto severity;

        public static /* synthetic */ Error copy$default(Error error, String str, ValidateNicknameResponseDto.WarningDto.SeverityDto severityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                severityDto = error.severity;
            }
            return error.copy(str, severityDto);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final ValidateNicknameResponseDto.WarningDto.SeverityDto getSeverity() {
            return this.severity;
        }

        public final Error copy(String message, ValidateNicknameResponseDto.WarningDto.SeverityDto severity) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
            return new Error(message, severity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.message, error.message) && this.severity == error.severity;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.severity.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ", severity=" + this.severity + ")";
        }

        public final String getMessage() {
            return this.message;
        }

        public final ValidateNicknameResponseDto.WarningDto.SeverityDto getSeverity() {
            return this.severity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, ValidateNicknameResponseDto.WarningDto.SeverityDto severity) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
            this.message = message;
            this.severity = severity;
        }
    }

    /* compiled from: NicknameValidationResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/store/naming/NicknameValidationResult$UnknownError;", "Lcom/robinhood/android/account/store/naming/NicknameValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnknownError extends NicknameValidationResult {
        public static final UnknownError INSTANCE = new UnknownError();

        public boolean equals(Object other) {
            return this == other || (other instanceof UnknownError);
        }

        public int hashCode() {
            return 1020650180;
        }

        public String toString() {
            return "UnknownError";
        }

        private UnknownError() {
            super(null);
        }
    }

    public final boolean getCanSubmit() {
        return (this instanceof Valid) || (this instanceof UnknownError);
    }
}
