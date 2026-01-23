package com.robinhood.shared.update.password.reset;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResetPasswordViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/ResetPasswordViewState;", "", "isLoading", "", "email", "", "showUpdateEmailAddressCta", "<init>", "(ZLjava/lang/String;Z)V", "()Z", "getEmail", "()Ljava/lang/String;", "getShowUpdateEmailAddressCta", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ResetPasswordViewState {
    public static final int $stable = 0;
    private final String email;
    private final boolean isLoading;
    private final boolean showUpdateEmailAddressCta;

    public static /* synthetic */ ResetPasswordViewState copy$default(ResetPasswordViewState resetPasswordViewState, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = resetPasswordViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = resetPasswordViewState.email;
        }
        if ((i & 4) != 0) {
            z2 = resetPasswordViewState.showUpdateEmailAddressCta;
        }
        return resetPasswordViewState.copy(z, str, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowUpdateEmailAddressCta() {
        return this.showUpdateEmailAddressCta;
    }

    public final ResetPasswordViewState copy(boolean isLoading, String email, boolean showUpdateEmailAddressCta) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new ResetPasswordViewState(isLoading, email, showUpdateEmailAddressCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetPasswordViewState)) {
            return false;
        }
        ResetPasswordViewState resetPasswordViewState = (ResetPasswordViewState) other;
        return this.isLoading == resetPasswordViewState.isLoading && Intrinsics.areEqual(this.email, resetPasswordViewState.email) && this.showUpdateEmailAddressCta == resetPasswordViewState.showUpdateEmailAddressCta;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.showUpdateEmailAddressCta);
    }

    public String toString() {
        return "ResetPasswordViewState(isLoading=" + this.isLoading + ", email=" + this.email + ", showUpdateEmailAddressCta=" + this.showUpdateEmailAddressCta + ")";
    }

    public ResetPasswordViewState(boolean z, String email, boolean z2) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.isLoading = z;
        this.email = email;
        this.showUpdateEmailAddressCta = z2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ ResetPasswordViewState(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, z2);
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getShowUpdateEmailAddressCta() {
        return this.showUpdateEmailAddressCta;
    }
}
