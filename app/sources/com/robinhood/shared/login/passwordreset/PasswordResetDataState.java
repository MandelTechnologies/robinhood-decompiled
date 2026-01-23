package com.robinhood.shared.login.passwordreset;

import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasswordResetDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;", "", "isLoading", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(ZLcom/robinhood/shared/app/type/AppType;)V", "()Z", "showSuvBottomSheet", "getShowSuvBottomSheet", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PasswordResetDataState {
    public static final int $stable = 0;
    private final AppType appType;
    private final boolean isLoading;

    /* renamed from: component2, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ PasswordResetDataState copy$default(PasswordResetDataState passwordResetDataState, boolean z, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = passwordResetDataState.isLoading;
        }
        if ((i & 2) != 0) {
            appType = passwordResetDataState.appType;
        }
        return passwordResetDataState.copy(z, appType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final PasswordResetDataState copy(boolean isLoading, AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new PasswordResetDataState(isLoading, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PasswordResetDataState)) {
            return false;
        }
        PasswordResetDataState passwordResetDataState = (PasswordResetDataState) other;
        return this.isLoading == passwordResetDataState.isLoading && this.appType == passwordResetDataState.appType;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "PasswordResetDataState(isLoading=" + this.isLoading + ", appType=" + this.appType + ")";
    }

    public PasswordResetDataState(boolean z, AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.isLoading = z;
        this.appType = appType;
    }

    public /* synthetic */ PasswordResetDataState(boolean z, AppType appType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, appType);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowSuvBottomSheet() {
        return this.appType == AppType.TRADER;
    }
}
