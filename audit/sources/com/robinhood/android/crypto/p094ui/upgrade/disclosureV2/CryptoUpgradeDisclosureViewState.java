package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureViewState;", "", "cryptoUpgradeDisclosureHeaderState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "cryptoUpgradeDisclosureContentState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;", "cryptoUpgradeDisclosureBottomBarState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "<init>", "(Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;)V", "getCryptoUpgradeDisclosureHeaderState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "getCryptoUpgradeDisclosureContentState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;", "getCryptoUpgradeDisclosureBottomBarState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureViewState {
    public static final int $stable = 8;
    private final CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState;
    private final CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState;
    private final CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState;

    public static /* synthetic */ CryptoUpgradeDisclosureViewState copy$default(CryptoUpgradeDisclosureViewState cryptoUpgradeDisclosureViewState, CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState, CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState, CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBar2, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoUpgradeDisclosureHeaderState = cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureHeaderState;
        }
        if ((i & 2) != 0) {
            cryptoUpgradeDisclosureContentState = cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureContentState;
        }
        if ((i & 4) != 0) {
            cryptoUpgradeDisclosureBottomBar2 = cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureBottomBarState;
        }
        return cryptoUpgradeDisclosureViewState.copy(cryptoUpgradeDisclosureHeaderState, cryptoUpgradeDisclosureContentState, cryptoUpgradeDisclosureBottomBar2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoUpgradeDisclosureHeaderState getCryptoUpgradeDisclosureHeaderState() {
        return this.cryptoUpgradeDisclosureHeaderState;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoUpgradeDisclosureContentState getCryptoUpgradeDisclosureContentState() {
        return this.cryptoUpgradeDisclosureContentState;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoUpgradeDisclosureBottomBarState getCryptoUpgradeDisclosureBottomBarState() {
        return this.cryptoUpgradeDisclosureBottomBarState;
    }

    public final CryptoUpgradeDisclosureViewState copy(CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState, CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState, CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState) {
        Intrinsics.checkNotNullParameter(cryptoUpgradeDisclosureHeaderState, "cryptoUpgradeDisclosureHeaderState");
        return new CryptoUpgradeDisclosureViewState(cryptoUpgradeDisclosureHeaderState, cryptoUpgradeDisclosureContentState, cryptoUpgradeDisclosureBottomBarState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureViewState)) {
            return false;
        }
        CryptoUpgradeDisclosureViewState cryptoUpgradeDisclosureViewState = (CryptoUpgradeDisclosureViewState) other;
        return Intrinsics.areEqual(this.cryptoUpgradeDisclosureHeaderState, cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureHeaderState) && Intrinsics.areEqual(this.cryptoUpgradeDisclosureContentState, cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureContentState) && Intrinsics.areEqual(this.cryptoUpgradeDisclosureBottomBarState, cryptoUpgradeDisclosureViewState.cryptoUpgradeDisclosureBottomBarState);
    }

    public int hashCode() {
        int iHashCode = this.cryptoUpgradeDisclosureHeaderState.hashCode() * 31;
        CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = this.cryptoUpgradeDisclosureContentState;
        int iHashCode2 = (iHashCode + (cryptoUpgradeDisclosureContentState == null ? 0 : cryptoUpgradeDisclosureContentState.hashCode())) * 31;
        CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBar2 = this.cryptoUpgradeDisclosureBottomBarState;
        return iHashCode2 + (cryptoUpgradeDisclosureBottomBar2 != null ? cryptoUpgradeDisclosureBottomBar2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoUpgradeDisclosureViewState(cryptoUpgradeDisclosureHeaderState=" + this.cryptoUpgradeDisclosureHeaderState + ", cryptoUpgradeDisclosureContentState=" + this.cryptoUpgradeDisclosureContentState + ", cryptoUpgradeDisclosureBottomBarState=" + this.cryptoUpgradeDisclosureBottomBarState + ")";
    }

    public CryptoUpgradeDisclosureViewState(CryptoUpgradeDisclosureHeaderState cryptoUpgradeDisclosureHeaderState, CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState, CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBar2) {
        Intrinsics.checkNotNullParameter(cryptoUpgradeDisclosureHeaderState, "cryptoUpgradeDisclosureHeaderState");
        this.cryptoUpgradeDisclosureHeaderState = cryptoUpgradeDisclosureHeaderState;
        this.cryptoUpgradeDisclosureContentState = cryptoUpgradeDisclosureContentState;
        this.cryptoUpgradeDisclosureBottomBarState = cryptoUpgradeDisclosureBottomBar2;
    }

    public final CryptoUpgradeDisclosureHeaderState getCryptoUpgradeDisclosureHeaderState() {
        return this.cryptoUpgradeDisclosureHeaderState;
    }

    public final CryptoUpgradeDisclosureContentState getCryptoUpgradeDisclosureContentState() {
        return this.cryptoUpgradeDisclosureContentState;
    }

    public final CryptoUpgradeDisclosureBottomBarState getCryptoUpgradeDisclosureBottomBarState() {
        return this.cryptoUpgradeDisclosureBottomBarState;
    }
}
