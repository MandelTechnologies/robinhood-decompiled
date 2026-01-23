package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.android.common.util.Validation;
import com.robinhood.android.onboarding.p205ui.usercreation.UserCreationEmailFragment;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationEmailViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÂ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;", "", "args", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "isLoading", "", "typedEmail", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;ZLjava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode;)V", "getArgs", "()Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailFragment$Args;", "()Z", "getTypedEmail", "()Ljava/lang/String;", "isContinueEnabled", "isEmailValid", "isAlreadyHaveAccountButtonVisible", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UserCreationEmailViewState {
    public static final int $stable = 8;
    private final UserCreationEmailFragment.Args args;
    private final boolean isAlreadyHaveAccountButtonVisible;
    private final boolean isLoading;
    private final CountryCode locality;
    private final String typedEmail;

    /* renamed from: component4, reason: from getter */
    private final CountryCode getLocality() {
        return this.locality;
    }

    public static /* synthetic */ UserCreationEmailViewState copy$default(UserCreationEmailViewState userCreationEmailViewState, UserCreationEmailFragment.Args args, boolean z, String str, CountryCode countryCode, int i, Object obj) {
        if ((i & 1) != 0) {
            args = userCreationEmailViewState.args;
        }
        if ((i & 2) != 0) {
            z = userCreationEmailViewState.isLoading;
        }
        if ((i & 4) != 0) {
            str = userCreationEmailViewState.typedEmail;
        }
        if ((i & 8) != 0) {
            countryCode = userCreationEmailViewState.locality;
        }
        return userCreationEmailViewState.copy(args, z, str, countryCode);
    }

    /* renamed from: component1, reason: from getter */
    public final UserCreationEmailFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTypedEmail() {
        return this.typedEmail;
    }

    public final UserCreationEmailViewState copy(UserCreationEmailFragment.Args args, boolean isLoading, String typedEmail, CountryCode locality) {
        Intrinsics.checkNotNullParameter(typedEmail, "typedEmail");
        return new UserCreationEmailViewState(args, isLoading, typedEmail, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCreationEmailViewState)) {
            return false;
        }
        UserCreationEmailViewState userCreationEmailViewState = (UserCreationEmailViewState) other;
        return Intrinsics.areEqual(this.args, userCreationEmailViewState.args) && this.isLoading == userCreationEmailViewState.isLoading && Intrinsics.areEqual(this.typedEmail, userCreationEmailViewState.typedEmail) && Intrinsics.areEqual(this.locality, userCreationEmailViewState.locality);
    }

    public int hashCode() {
        UserCreationEmailFragment.Args args = this.args;
        int iHashCode = (((((args == null ? 0 : args.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.typedEmail.hashCode()) * 31;
        CountryCode countryCode = this.locality;
        return iHashCode + (countryCode != null ? countryCode.hashCode() : 0);
    }

    public String toString() {
        return "UserCreationEmailViewState(args=" + this.args + ", isLoading=" + this.isLoading + ", typedEmail=" + this.typedEmail + ", locality=" + this.locality + ")";
    }

    public UserCreationEmailViewState(UserCreationEmailFragment.Args args, boolean z, String typedEmail, CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(typedEmail, "typedEmail");
        this.args = args;
        this.isLoading = z;
        this.typedEmail = typedEmail;
        this.locality = countryCode;
        this.isAlreadyHaveAccountButtonVisible = !Intrinsics.areEqual(countryCode, CountryCode.Supported.Singapore.INSTANCE);
    }

    public final UserCreationEmailFragment.Args getArgs() {
        return this.args;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ UserCreationEmailViewState(UserCreationEmailFragment.Args args, boolean z, String str, CountryCode countryCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : countryCode);
    }

    public final String getTypedEmail() {
        return this.typedEmail;
    }

    public final boolean isContinueEnabled() {
        return isEmailValid() && !this.isLoading;
    }

    private final boolean isEmailValid() {
        return Validation.INSTANCE.isEmailValid(this.typedEmail);
    }

    /* renamed from: isAlreadyHaveAccountButtonVisible, reason: from getter */
    public final boolean getIsAlreadyHaveAccountButtonVisible() {
        return this.isAlreadyHaveAccountButtonVisible;
    }
}
