package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureHeader.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "", "title", "", "currentDisclosureIndex", "", "totalDisclosuresLastIndex", "<init>", "(Ljava/lang/String;II)V", "getTitle", "()Ljava/lang/String;", "getCurrentDisclosureIndex", "()I", "getTotalDisclosuresLastIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureHeaderState {
    public static final int $stable = 0;
    private final int currentDisclosureIndex;
    private final String title;
    private final int totalDisclosuresLastIndex;

    public static /* synthetic */ CryptoUpgradeDisclosureHeaderState copy$default(CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cryptoUpgradeDisclosureHeaderState.title;
        }
        if ((i3 & 2) != 0) {
            i = cryptoUpgradeDisclosureHeaderState.currentDisclosureIndex;
        }
        if ((i3 & 4) != 0) {
            i2 = cryptoUpgradeDisclosureHeaderState.totalDisclosuresLastIndex;
        }
        return cryptoUpgradeDisclosureHeaderState.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentDisclosureIndex() {
        return this.currentDisclosureIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalDisclosuresLastIndex() {
        return this.totalDisclosuresLastIndex;
    }

    public final CryptoUpgradeDisclosureHeaderState copy(String title, int currentDisclosureIndex, int totalDisclosuresLastIndex) {
        return new CryptoUpgradeDisclosureHeaderState(title, currentDisclosureIndex, totalDisclosuresLastIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureHeaderState)) {
            return false;
        }
        CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState = (CryptoUpgradeDisclosureHeaderState) other;
        return Intrinsics.areEqual(this.title, cryptoUpgradeDisclosureHeaderState.title) && this.currentDisclosureIndex == cryptoUpgradeDisclosureHeaderState.currentDisclosureIndex && this.totalDisclosuresLastIndex == cryptoUpgradeDisclosureHeaderState.totalDisclosuresLastIndex;
    }

    public int hashCode() {
        String str = this.title;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.currentDisclosureIndex)) * 31) + Integer.hashCode(this.totalDisclosuresLastIndex);
    }

    public String toString() {
        return "CryptoUpgradeDisclosureHeaderState(title=" + this.title + ", currentDisclosureIndex=" + this.currentDisclosureIndex + ", totalDisclosuresLastIndex=" + this.totalDisclosuresLastIndex + ")";
    }

    public CryptoUpgradeDisclosureHeaderState(String str, int i, int i2) {
        this.title = str;
        this.currentDisclosureIndex = i;
        this.totalDisclosuresLastIndex = i2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCurrentDisclosureIndex() {
        return this.currentDisclosureIndex;
    }

    public final int getTotalDisclosuresLastIndex() {
        return this.totalDisclosuresLastIndex;
    }
}
