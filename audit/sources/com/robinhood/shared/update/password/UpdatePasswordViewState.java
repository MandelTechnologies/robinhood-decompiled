package com.robinhood.shared.update.password;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatePasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/update/password/UpdatePasswordViewState;", "", "isLoading", "", "currentPassword", "", "newPassword", "confirmNewPassword", "currentPasswordError", "Lcom/robinhood/utils/resource/StringResource;", "newPasswordError", "confirmNewPasswordError", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "()Z", "getCurrentPassword", "()Ljava/lang/String;", "getNewPassword", "getConfirmNewPassword", "getCurrentPasswordError", "()Lcom/robinhood/utils/resource/StringResource;", "getNewPasswordError", "getConfirmNewPasswordError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UpdatePasswordViewState {
    public static final int $stable = StringResource.$stable;
    private final String confirmNewPassword;
    private final StringResource confirmNewPasswordError;
    private final String currentPassword;
    private final StringResource currentPasswordError;
    private final boolean isLoading;
    private final String newPassword;
    private final StringResource newPasswordError;

    public static /* synthetic */ UpdatePasswordViewState copy$default(UpdatePasswordViewState updatePasswordViewState, boolean z, String str, String str2, String str3, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updatePasswordViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = updatePasswordViewState.currentPassword;
        }
        if ((i & 4) != 0) {
            str2 = updatePasswordViewState.newPassword;
        }
        if ((i & 8) != 0) {
            str3 = updatePasswordViewState.confirmNewPassword;
        }
        if ((i & 16) != 0) {
            stringResource = updatePasswordViewState.currentPasswordError;
        }
        if ((i & 32) != 0) {
            stringResource2 = updatePasswordViewState.newPasswordError;
        }
        if ((i & 64) != 0) {
            stringResource3 = updatePasswordViewState.confirmNewPasswordError;
        }
        StringResource stringResource4 = stringResource2;
        StringResource stringResource5 = stringResource3;
        StringResource stringResource6 = stringResource;
        String str4 = str2;
        return updatePasswordViewState.copy(z, str, str4, str3, stringResource6, stringResource4, stringResource5);
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

    /* renamed from: component5, reason: from getter */
    public final StringResource getCurrentPasswordError() {
        return this.currentPasswordError;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getNewPasswordError() {
        return this.newPasswordError;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getConfirmNewPasswordError() {
        return this.confirmNewPasswordError;
    }

    public final UpdatePasswordViewState copy(boolean isLoading, String currentPassword, String newPassword, String confirmNewPassword, StringResource currentPasswordError, StringResource newPasswordError, StringResource confirmNewPasswordError) {
        return new UpdatePasswordViewState(isLoading, currentPassword, newPassword, confirmNewPassword, currentPasswordError, newPasswordError, confirmNewPasswordError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePasswordViewState)) {
            return false;
        }
        UpdatePasswordViewState updatePasswordViewState = (UpdatePasswordViewState) other;
        return this.isLoading == updatePasswordViewState.isLoading && Intrinsics.areEqual(this.currentPassword, updatePasswordViewState.currentPassword) && Intrinsics.areEqual(this.newPassword, updatePasswordViewState.newPassword) && Intrinsics.areEqual(this.confirmNewPassword, updatePasswordViewState.confirmNewPassword) && Intrinsics.areEqual(this.currentPasswordError, updatePasswordViewState.currentPasswordError) && Intrinsics.areEqual(this.newPasswordError, updatePasswordViewState.newPasswordError) && Intrinsics.areEqual(this.confirmNewPasswordError, updatePasswordViewState.confirmNewPasswordError);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.currentPassword;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.newPassword;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.confirmNewPassword;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StringResource stringResource = this.currentPasswordError;
        int iHashCode5 = (iHashCode4 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.newPasswordError;
        int iHashCode6 = (iHashCode5 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.confirmNewPasswordError;
        return iHashCode6 + (stringResource3 != null ? stringResource3.hashCode() : 0);
    }

    public String toString() {
        return "UpdatePasswordViewState(isLoading=" + this.isLoading + ", currentPassword=" + this.currentPassword + ", newPassword=" + this.newPassword + ", confirmNewPassword=" + this.confirmNewPassword + ", currentPasswordError=" + this.currentPasswordError + ", newPasswordError=" + this.newPasswordError + ", confirmNewPasswordError=" + this.confirmNewPasswordError + ")";
    }

    public UpdatePasswordViewState(boolean z, String str, String str2, String str3, StringResource stringResource, StringResource stringResource2, StringResource stringResource3) {
        this.isLoading = z;
        this.currentPassword = str;
        this.newPassword = str2;
        this.confirmNewPassword = str3;
        this.currentPasswordError = stringResource;
        this.newPasswordError = stringResource2;
        this.confirmNewPasswordError = stringResource3;
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

    public final StringResource getCurrentPasswordError() {
        return this.currentPasswordError;
    }

    public final StringResource getNewPasswordError() {
        return this.newPasswordError;
    }

    public final StringResource getConfirmNewPasswordError() {
        return this.confirmNewPasswordError;
    }
}
