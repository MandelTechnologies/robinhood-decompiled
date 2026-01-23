package com.robinhood.android.crypto.authorize.wallet;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthorizeWalletDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/authorize/wallet/AuthorizeWalletViewState;", "", "loading", "", "token", "", "<init>", "(ZLjava/lang/String;)V", "getLoading", "()Z", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-authorize-wallet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AuthorizeWalletViewState {
    public static final int $stable = 0;
    private final boolean loading;
    private final String token;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizeWalletViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthorizeWalletViewState copy$default(AuthorizeWalletViewState authorizeWalletViewState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authorizeWalletViewState.loading;
        }
        if ((i & 2) != 0) {
            str = authorizeWalletViewState.token;
        }
        return authorizeWalletViewState.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final AuthorizeWalletViewState copy(boolean loading, String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new AuthorizeWalletViewState(loading, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizeWalletViewState)) {
            return false;
        }
        AuthorizeWalletViewState authorizeWalletViewState = (AuthorizeWalletViewState) other;
        return this.loading == authorizeWalletViewState.loading && Intrinsics.areEqual(this.token, authorizeWalletViewState.token);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.loading) * 31) + this.token.hashCode();
    }

    public String toString() {
        return "AuthorizeWalletViewState(loading=" + this.loading + ", token=" + this.token + ")";
    }

    public AuthorizeWalletViewState(boolean z, String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.loading = z;
        this.token = token;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public /* synthetic */ AuthorizeWalletViewState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final String getToken() {
        return this.token;
    }
}
