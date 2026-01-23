package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import com.robinhood.android.account.strings.DisplayName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOneClickSnackBarViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/EmptyViewDuxoDataState;", "", "success", "", "accountDisplayName", "Lcom/robinhood/android/account/strings/DisplayName;", "exception", "", "<init>", "(ZLcom/robinhood/android/account/strings/DisplayName;Ljava/lang/Throwable;)V", "getSuccess", "()Z", "getAccountDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "getException", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EmptyViewDuxoDataState {
    public static final int $stable = 8;
    private final DisplayName accountDisplayName;
    private final Throwable exception;
    private final boolean success;

    public EmptyViewDuxoDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ EmptyViewDuxoDataState copy$default(EmptyViewDuxoDataState emptyViewDuxoDataState, boolean z, DisplayName displayName, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = emptyViewDuxoDataState.success;
        }
        if ((i & 2) != 0) {
            displayName = emptyViewDuxoDataState.accountDisplayName;
        }
        if ((i & 4) != 0) {
            th = emptyViewDuxoDataState.exception;
        }
        return emptyViewDuxoDataState.copy(z, displayName, th);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final DisplayName getAccountDisplayName() {
        return this.accountDisplayName;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final EmptyViewDuxoDataState copy(boolean success, DisplayName accountDisplayName, Throwable exception) {
        return new EmptyViewDuxoDataState(success, accountDisplayName, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyViewDuxoDataState)) {
            return false;
        }
        EmptyViewDuxoDataState emptyViewDuxoDataState = (EmptyViewDuxoDataState) other;
        return this.success == emptyViewDuxoDataState.success && Intrinsics.areEqual(this.accountDisplayName, emptyViewDuxoDataState.accountDisplayName) && Intrinsics.areEqual(this.exception, emptyViewDuxoDataState.exception);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        DisplayName displayName = this.accountDisplayName;
        int iHashCode2 = (iHashCode + (displayName == null ? 0 : displayName.hashCode())) * 31;
        Throwable th = this.exception;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "EmptyViewDuxoDataState(success=" + this.success + ", accountDisplayName=" + this.accountDisplayName + ", exception=" + this.exception + ")";
    }

    public EmptyViewDuxoDataState(boolean z, DisplayName displayName, Throwable th) {
        this.success = z;
        this.accountDisplayName = displayName;
        this.exception = th;
    }

    public /* synthetic */ EmptyViewDuxoDataState(boolean z, DisplayName displayName, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : displayName, (i & 4) != 0 ? null : th);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final DisplayName getAccountDisplayName() {
        return this.accountDisplayName;
    }

    public final Throwable getException() {
        return this.exception;
    }
}
