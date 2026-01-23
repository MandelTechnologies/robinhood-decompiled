package com.salesforce.android.smi.network.api.auth;

import io.jsonwebtoken.Header;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserVerificationToken.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken;", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationTokenRequest;", "userVerificationType", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;", "customerIdentityToken", "", "<init>", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;Ljava/lang/String;)V", "getUserVerificationType", "()Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;", "getCustomerIdentityToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "UserVerificationType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserVerificationToken implements UserVerificationTokenRequest {
    private final String customerIdentityToken;
    private final UserVerificationType userVerificationType;

    public static /* synthetic */ UserVerificationToken copy$default(UserVerificationToken userVerificationToken, UserVerificationType userVerificationType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userVerificationType = userVerificationToken.userVerificationType;
        }
        if ((i & 2) != 0) {
            str = userVerificationToken.customerIdentityToken;
        }
        return userVerificationToken.copy(userVerificationType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UserVerificationType getUserVerificationType() {
        return this.userVerificationType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCustomerIdentityToken() {
        return this.customerIdentityToken;
    }

    public final UserVerificationToken copy(UserVerificationType userVerificationType, String customerIdentityToken) {
        Intrinsics.checkNotNullParameter(userVerificationType, "userVerificationType");
        Intrinsics.checkNotNullParameter(customerIdentityToken, "customerIdentityToken");
        return new UserVerificationToken(userVerificationType, customerIdentityToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserVerificationToken)) {
            return false;
        }
        UserVerificationToken userVerificationToken = (UserVerificationToken) other;
        return this.userVerificationType == userVerificationToken.userVerificationType && Intrinsics.areEqual(this.customerIdentityToken, userVerificationToken.customerIdentityToken);
    }

    public int hashCode() {
        return (this.userVerificationType.hashCode() * 31) + this.customerIdentityToken.hashCode();
    }

    public String toString() {
        return "UserVerificationToken(userVerificationType=" + this.userVerificationType + ", customerIdentityToken=" + this.customerIdentityToken + ")";
    }

    public UserVerificationToken(UserVerificationType userVerificationType, String customerIdentityToken) {
        Intrinsics.checkNotNullParameter(userVerificationType, "userVerificationType");
        Intrinsics.checkNotNullParameter(customerIdentityToken, "customerIdentityToken");
        this.userVerificationType = userVerificationType;
        this.customerIdentityToken = customerIdentityToken;
    }

    @Override // com.salesforce.android.smi.network.api.auth.UserVerificationTokenRequest
    public UserVerificationType getUserVerificationType() {
        return this.userVerificationType;
    }

    @Override // com.salesforce.android.smi.network.api.auth.UserVerificationTokenRequest
    public String getCustomerIdentityToken() {
        return this.customerIdentityToken;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserVerificationToken.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/salesforce/android/smi/network/api/auth/UserVerificationToken$UserVerificationType;", "", "<init>", "(Ljava/lang/String;I)V", Header.JWT_TYPE, "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UserVerificationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UserVerificationType[] $VALUES;
        public static final UserVerificationType JWT = new UserVerificationType(Header.JWT_TYPE, 0);

        private static final /* synthetic */ UserVerificationType[] $values() {
            return new UserVerificationType[]{JWT};
        }

        public static EnumEntries<UserVerificationType> getEntries() {
            return $ENTRIES;
        }

        private UserVerificationType(String str, int i) {
        }

        static {
            UserVerificationType[] userVerificationTypeArr$values = $values();
            $VALUES = userVerificationTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(userVerificationTypeArr$values);
        }

        public static UserVerificationType valueOf(String str) {
            return (UserVerificationType) Enum.valueOf(UserVerificationType.class, str);
        }

        public static UserVerificationType[] values() {
            return (UserVerificationType[]) $VALUES.clone();
        }
    }
}
