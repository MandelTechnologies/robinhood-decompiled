package com.robinhood.shared.crypto.transfer.verification.type;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletTypeDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/type/WalletTypeViewState;", "", "decentralizedOptionEnabled", "", "decentralizedSubtitle", "Lcom/robinhood/utils/resource/StringResource;", "interfaceEnabled", "loading", "shimmer", "title", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;ZZZLcom/robinhood/utils/resource/StringResource;)V", "getDecentralizedOptionEnabled", "()Z", "getDecentralizedSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getInterfaceEnabled", "getLoading", "getShimmer", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WalletTypeViewState {
    public static final int $stable = StringResource.$stable;
    private final boolean decentralizedOptionEnabled;
    private final StringResource decentralizedSubtitle;
    private final boolean interfaceEnabled;
    private final boolean loading;
    private final boolean shimmer;
    private final StringResource title;

    public static /* synthetic */ WalletTypeViewState copy$default(WalletTypeViewState walletTypeViewState, boolean z, StringResource stringResource, boolean z2, boolean z3, boolean z4, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = walletTypeViewState.decentralizedOptionEnabled;
        }
        if ((i & 2) != 0) {
            stringResource = walletTypeViewState.decentralizedSubtitle;
        }
        if ((i & 4) != 0) {
            z2 = walletTypeViewState.interfaceEnabled;
        }
        if ((i & 8) != 0) {
            z3 = walletTypeViewState.loading;
        }
        if ((i & 16) != 0) {
            z4 = walletTypeViewState.shimmer;
        }
        if ((i & 32) != 0) {
            stringResource2 = walletTypeViewState.title;
        }
        boolean z5 = z4;
        StringResource stringResource3 = stringResource2;
        return walletTypeViewState.copy(z, stringResource, z2, z3, z5, stringResource3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDecentralizedOptionEnabled() {
        return this.decentralizedOptionEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDecentralizedSubtitle() {
        return this.decentralizedSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInterfaceEnabled() {
        return this.interfaceEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShimmer() {
        return this.shimmer;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final WalletTypeViewState copy(boolean decentralizedOptionEnabled, StringResource decentralizedSubtitle, boolean interfaceEnabled, boolean loading, boolean shimmer, StringResource title) {
        Intrinsics.checkNotNullParameter(decentralizedSubtitle, "decentralizedSubtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WalletTypeViewState(decentralizedOptionEnabled, decentralizedSubtitle, interfaceEnabled, loading, shimmer, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTypeViewState)) {
            return false;
        }
        WalletTypeViewState walletTypeViewState = (WalletTypeViewState) other;
        return this.decentralizedOptionEnabled == walletTypeViewState.decentralizedOptionEnabled && Intrinsics.areEqual(this.decentralizedSubtitle, walletTypeViewState.decentralizedSubtitle) && this.interfaceEnabled == walletTypeViewState.interfaceEnabled && this.loading == walletTypeViewState.loading && this.shimmer == walletTypeViewState.shimmer && Intrinsics.areEqual(this.title, walletTypeViewState.title);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.decentralizedOptionEnabled) * 31) + this.decentralizedSubtitle.hashCode()) * 31) + Boolean.hashCode(this.interfaceEnabled)) * 31) + Boolean.hashCode(this.loading)) * 31) + Boolean.hashCode(this.shimmer)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "WalletTypeViewState(decentralizedOptionEnabled=" + this.decentralizedOptionEnabled + ", decentralizedSubtitle=" + this.decentralizedSubtitle + ", interfaceEnabled=" + this.interfaceEnabled + ", loading=" + this.loading + ", shimmer=" + this.shimmer + ", title=" + this.title + ")";
    }

    public WalletTypeViewState(boolean z, StringResource decentralizedSubtitle, boolean z2, boolean z3, boolean z4, StringResource title) {
        Intrinsics.checkNotNullParameter(decentralizedSubtitle, "decentralizedSubtitle");
        Intrinsics.checkNotNullParameter(title, "title");
        this.decentralizedOptionEnabled = z;
        this.decentralizedSubtitle = decentralizedSubtitle;
        this.interfaceEnabled = z2;
        this.loading = z3;
        this.shimmer = z4;
        this.title = title;
    }

    public final boolean getDecentralizedOptionEnabled() {
        return this.decentralizedOptionEnabled;
    }

    public final StringResource getDecentralizedSubtitle() {
        return this.decentralizedSubtitle;
    }

    public final boolean getInterfaceEnabled() {
        return this.interfaceEnabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getShimmer() {
        return this.shimmer;
    }

    public final StringResource getTitle() {
        return this.title;
    }
}
