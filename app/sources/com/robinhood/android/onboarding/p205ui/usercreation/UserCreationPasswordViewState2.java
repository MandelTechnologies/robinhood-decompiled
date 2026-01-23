package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationPasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "", "<init>", "()V", "Password", "User", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState$Password;", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState$User;", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.CreationState, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class UserCreationPasswordViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ UserCreationPasswordViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/CreationState$Password;", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "password", "", "<init>", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.CreationState$Password, reason: from toString */
    public static final /* data */ class Password extends UserCreationPasswordViewState2 {
        public static final int $stable = 0;
        private final String password;

        public static /* synthetic */ Password copy$default(Password password, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = password.password;
            }
            return password.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final Password copy(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            return new Password(password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Password) && Intrinsics.areEqual(this.password, ((Password) other).password);
        }

        public int hashCode() {
            return this.password.hashCode();
        }

        public String toString() {
            return "Password(password=" + this.password + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Password(String password) {
            super(null);
            Intrinsics.checkNotNullParameter(password, "password");
            this.password = password;
        }

        public final String getPassword() {
            return this.password;
        }
    }

    private UserCreationPasswordViewState2() {
    }

    /* compiled from: UserCreationPasswordViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/CreationState$User;", "Lcom/robinhood/android/onboarding/ui/usercreation/CreationState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.onboarding.ui.usercreation.CreationState$User */
    public static final /* data */ class User extends UserCreationPasswordViewState2 {
        public static final int $stable = 0;
        public static final User INSTANCE = new User();

        public boolean equals(Object other) {
            return this == other || (other instanceof User);
        }

        public int hashCode() {
            return -2138444336;
        }

        public String toString() {
            return "User";
        }

        private User() {
            super(null);
        }
    }
}
