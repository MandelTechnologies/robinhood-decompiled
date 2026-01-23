package com.robinhood.android.onboarding.p205ui.usercreation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UserCreationFullNameViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationFullNameViewState;", "", "firstName", "", "lastName", "isLoading", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "()Z", "areFieldsFilled", "getAreFieldsFilled", "canSubmitRequest", "getCanSubmitRequest", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UserCreationFullNameViewState {
    public static final int $stable = 0;
    private final String firstName;
    private final boolean isLoading;
    private final String lastName;

    public UserCreationFullNameViewState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ UserCreationFullNameViewState copy$default(UserCreationFullNameViewState userCreationFullNameViewState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userCreationFullNameViewState.firstName;
        }
        if ((i & 2) != 0) {
            str2 = userCreationFullNameViewState.lastName;
        }
        if ((i & 4) != 0) {
            z = userCreationFullNameViewState.isLoading;
        }
        return userCreationFullNameViewState.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UserCreationFullNameViewState copy(String firstName, String lastName, boolean isLoading) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new UserCreationFullNameViewState(firstName, lastName, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreationFullNameViewState)) {
            return false;
        }
        UserCreationFullNameViewState userCreationFullNameViewState = (UserCreationFullNameViewState) other;
        return Intrinsics.areEqual(this.firstName, userCreationFullNameViewState.firstName) && Intrinsics.areEqual(this.lastName, userCreationFullNameViewState.lastName) && this.isLoading == userCreationFullNameViewState.isLoading;
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "UserCreationFullNameViewState(firstName=" + this.firstName + ", lastName=" + this.lastName + ", isLoading=" + this.isLoading + ")";
    }

    public UserCreationFullNameViewState(String firstName, String lastName, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
        this.isLoading = z;
    }

    public /* synthetic */ UserCreationFullNameViewState(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getAreFieldsFilled() {
        return (StringsKt.isBlank(this.firstName) || StringsKt.isBlank(this.lastName)) ? false : true;
    }

    public final boolean getCanSubmitRequest() {
        return !this.isLoading && getAreFieldsFilled();
    }
}
