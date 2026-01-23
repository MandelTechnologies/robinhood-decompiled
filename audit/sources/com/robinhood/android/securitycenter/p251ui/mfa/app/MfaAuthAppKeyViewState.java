package com.robinhood.android.securitycenter.p251ui.mfa.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MfaAuthAppKeyViewState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/app/MfaAuthAppKeyViewState;", "", "isLoading", "", "token", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MfaAuthAppKeyViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final String token;

    public static /* synthetic */ MfaAuthAppKeyViewState copy$default(MfaAuthAppKeyViewState mfaAuthAppKeyViewState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mfaAuthAppKeyViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = mfaAuthAppKeyViewState.token;
        }
        return mfaAuthAppKeyViewState.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final MfaAuthAppKeyViewState copy(boolean isLoading, String token) {
        return new MfaAuthAppKeyViewState(isLoading, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaAuthAppKeyViewState)) {
            return false;
        }
        MfaAuthAppKeyViewState mfaAuthAppKeyViewState = (MfaAuthAppKeyViewState) other;
        return this.isLoading == mfaAuthAppKeyViewState.isLoading && Intrinsics.areEqual(this.token, mfaAuthAppKeyViewState.token);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        String str = this.token;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "MfaAuthAppKeyViewState(isLoading=" + this.isLoading + ", token=" + this.token + ")";
    }

    public MfaAuthAppKeyViewState(boolean z, String str) {
        this.isLoading = z;
        this.token = str;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getToken() {
        return this.token;
    }
}
