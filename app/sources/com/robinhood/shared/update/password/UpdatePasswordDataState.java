package com.robinhood.shared.update.password;

import com.robinhood.android.common.util.Validation;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordDataState;", "", "isLoading", "", "currentPassword", "", "newPassword", "confirmNewPassword", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getCurrentPassword", "()Ljava/lang/String;", "getNewPassword", "getConfirmNewPassword", "readyToUpdate", "getReadyToUpdate", "currentPasswordError", "Lcom/robinhood/utils/resource/StringResource;", "getCurrentPasswordError", "()Lcom/robinhood/utils/resource/StringResource;", "newPasswordError", "getNewPasswordError", "confirmNewPasswordError", "getConfirmNewPasswordError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UpdatePasswordDataState {
    public static final int $stable = 0;
    private final String confirmNewPassword;
    private final String currentPassword;
    private final boolean isLoading;
    private final String newPassword;

    public UpdatePasswordDataState() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ UpdatePasswordDataState copy$default(UpdatePasswordDataState updatePasswordDataState, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updatePasswordDataState.isLoading;
        }
        if ((i & 2) != 0) {
            str = updatePasswordDataState.currentPassword;
        }
        if ((i & 4) != 0) {
            str2 = updatePasswordDataState.newPassword;
        }
        if ((i & 8) != 0) {
            str3 = updatePasswordDataState.confirmNewPassword;
        }
        return updatePasswordDataState.copy(z, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentPassword() {
        return this.currentPassword;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNewPassword() {
        return this.newPassword;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfirmNewPassword() {
        return this.confirmNewPassword;
    }

    public final UpdatePasswordDataState copy(boolean isLoading, String currentPassword, String newPassword, String confirmNewPassword) {
        return new UpdatePasswordDataState(isLoading, currentPassword, newPassword, confirmNewPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePasswordDataState)) {
            return false;
        }
        UpdatePasswordDataState updatePasswordDataState = (UpdatePasswordDataState) other;
        return this.isLoading == updatePasswordDataState.isLoading && Intrinsics.areEqual(this.currentPassword, updatePasswordDataState.currentPassword) && Intrinsics.areEqual(this.newPassword, updatePasswordDataState.newPassword) && Intrinsics.areEqual(this.confirmNewPassword, updatePasswordDataState.confirmNewPassword);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.currentPassword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newPassword;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmNewPassword;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UpdatePasswordDataState(isLoading=" + this.isLoading + ", currentPassword=" + this.currentPassword + ", newPassword=" + this.newPassword + ", confirmNewPassword=" + this.confirmNewPassword + ")";
    }

    public UpdatePasswordDataState(boolean z, String str, String str2, String str3) {
        this.isLoading = z;
        this.currentPassword = str;
        this.newPassword = str2;
        this.confirmNewPassword = str3;
    }

    public /* synthetic */ UpdatePasswordDataState(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getCurrentPassword() {
        return this.currentPassword;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getConfirmNewPassword() {
        return this.confirmNewPassword;
    }

    public final boolean getReadyToUpdate() {
        return (this.isLoading || this.currentPassword == null || this.newPassword == null || this.confirmNewPassword == null || getCurrentPasswordError() != null || getNewPasswordError() != null || getConfirmNewPasswordError() != null) ? false : true;
    }

    public final StringResource getCurrentPasswordError() {
        String str = this.currentPassword;
        if (str == null || Validation.INSTANCE.isPasswordValid(str)) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C41211R.string.update_password_too_short_error, new Object[0]);
    }

    public final StringResource getNewPasswordError() {
        String str = this.newPassword;
        if (str == null || Validation.INSTANCE.isPasswordValid(str)) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C41211R.string.update_password_too_short_error, new Object[0]);
    }

    public final StringResource getConfirmNewPasswordError() {
        if (Intrinsics.areEqual(this.newPassword, this.confirmNewPassword)) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C41211R.string.update_password_mismatch_error, new Object[0]);
    }
}
