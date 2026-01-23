package com.robinhood.shared.update.password.reset;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckEmailViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;", "", "isLoading", "", "showEmailResentDialog", "email", "", "<init>", "(ZZLjava/lang/String;)V", "()Z", "getShowEmailResentDialog", "getEmail", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-update-password_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckEmailViewState {
    public static final int $stable = 0;
    private final String email;
    private final boolean isLoading;
    private final boolean showEmailResentDialog;

    public CheckEmailViewState() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ CheckEmailViewState copy$default(CheckEmailViewState checkEmailViewState, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkEmailViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = checkEmailViewState.showEmailResentDialog;
        }
        if ((i & 4) != 0) {
            str = checkEmailViewState.email;
        }
        return checkEmailViewState.copy(z, z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowEmailResentDialog() {
        return this.showEmailResentDialog;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final CheckEmailViewState copy(boolean isLoading, boolean showEmailResentDialog, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new CheckEmailViewState(isLoading, showEmailResentDialog, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckEmailViewState)) {
            return false;
        }
        CheckEmailViewState checkEmailViewState = (CheckEmailViewState) other;
        return this.isLoading == checkEmailViewState.isLoading && this.showEmailResentDialog == checkEmailViewState.showEmailResentDialog && Intrinsics.areEqual(this.email, checkEmailViewState.email);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showEmailResentDialog)) * 31) + this.email.hashCode();
    }

    public String toString() {
        return "CheckEmailViewState(isLoading=" + this.isLoading + ", showEmailResentDialog=" + this.showEmailResentDialog + ", email=" + this.email + ")";
    }

    public CheckEmailViewState(boolean z, boolean z2, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.isLoading = z;
        this.showEmailResentDialog = z2;
        this.email = email;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowEmailResentDialog() {
        return this.showEmailResentDialog;
    }

    public /* synthetic */ CheckEmailViewState(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str);
    }

    public final String getEmail() {
        return this.email;
    }
}
