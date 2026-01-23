package com.robinhood.android.crypto.tab.p093ui.appbar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeAppBarViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/appbar/CryptoHomeAppBarViewState;", "", "title", "", "accountValue", "", "isInboxBadgeVisible", "", "isInboxBadgeCritical", "isInboxVisible", "isSearchVisible", "<init>", "(ILjava/lang/String;ZZZZ)V", "getTitle", "()I", "getAccountValue", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeAppBarViewState {
    public static final int $stable = 0;
    private final String accountValue;
    private final boolean isInboxBadgeCritical;
    private final boolean isInboxBadgeVisible;
    private final boolean isInboxVisible;
    private final boolean isSearchVisible;
    private final int title;

    public static /* synthetic */ CryptoHomeAppBarViewState copy$default(CryptoHomeAppBarViewState cryptoHomeAppBarViewState, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cryptoHomeAppBarViewState.title;
        }
        if ((i2 & 2) != 0) {
            str = cryptoHomeAppBarViewState.accountValue;
        }
        if ((i2 & 4) != 0) {
            z = cryptoHomeAppBarViewState.isInboxBadgeVisible;
        }
        if ((i2 & 8) != 0) {
            z2 = cryptoHomeAppBarViewState.isInboxBadgeCritical;
        }
        if ((i2 & 16) != 0) {
            z3 = cryptoHomeAppBarViewState.isInboxVisible;
        }
        if ((i2 & 32) != 0) {
            z4 = cryptoHomeAppBarViewState.isSearchVisible;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        return cryptoHomeAppBarViewState.copy(i, str, z, z2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountValue() {
        return this.accountValue;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInboxBadgeVisible() {
        return this.isInboxBadgeVisible;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInboxBadgeCritical() {
        return this.isInboxBadgeCritical;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInboxVisible() {
        return this.isInboxVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSearchVisible() {
        return this.isSearchVisible;
    }

    public final CryptoHomeAppBarViewState copy(int title, String accountValue, boolean isInboxBadgeVisible, boolean isInboxBadgeCritical, boolean isInboxVisible, boolean isSearchVisible) {
        return new CryptoHomeAppBarViewState(title, accountValue, isInboxBadgeVisible, isInboxBadgeCritical, isInboxVisible, isSearchVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeAppBarViewState)) {
            return false;
        }
        CryptoHomeAppBarViewState cryptoHomeAppBarViewState = (CryptoHomeAppBarViewState) other;
        return this.title == cryptoHomeAppBarViewState.title && Intrinsics.areEqual(this.accountValue, cryptoHomeAppBarViewState.accountValue) && this.isInboxBadgeVisible == cryptoHomeAppBarViewState.isInboxBadgeVisible && this.isInboxBadgeCritical == cryptoHomeAppBarViewState.isInboxBadgeCritical && this.isInboxVisible == cryptoHomeAppBarViewState.isInboxVisible && this.isSearchVisible == cryptoHomeAppBarViewState.isSearchVisible;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.title) * 31;
        String str = this.accountValue;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isInboxBadgeVisible)) * 31) + Boolean.hashCode(this.isInboxBadgeCritical)) * 31) + Boolean.hashCode(this.isInboxVisible)) * 31) + Boolean.hashCode(this.isSearchVisible);
    }

    public String toString() {
        return "CryptoHomeAppBarViewState(title=" + this.title + ", accountValue=" + this.accountValue + ", isInboxBadgeVisible=" + this.isInboxBadgeVisible + ", isInboxBadgeCritical=" + this.isInboxBadgeCritical + ", isInboxVisible=" + this.isInboxVisible + ", isSearchVisible=" + this.isSearchVisible + ")";
    }

    public CryptoHomeAppBarViewState(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.title = i;
        this.accountValue = str;
        this.isInboxBadgeVisible = z;
        this.isInboxBadgeCritical = z2;
        this.isInboxVisible = z3;
        this.isSearchVisible = z4;
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getAccountValue() {
        return this.accountValue;
    }

    public final boolean isInboxBadgeVisible() {
        return this.isInboxBadgeVisible;
    }

    public final boolean isInboxBadgeCritical() {
        return this.isInboxBadgeCritical;
    }

    public final boolean isInboxVisible() {
        return this.isInboxVisible;
    }

    public final boolean isSearchVisible() {
        return this.isSearchVisible;
    }
}
