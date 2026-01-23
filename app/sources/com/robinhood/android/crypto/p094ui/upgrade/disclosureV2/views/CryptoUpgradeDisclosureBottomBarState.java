package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureBottomBar.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "", "unscrolledButton", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "scrolledButton", "hasScrolledToBottom", "", "isButtonEnabled", "isLoading", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;ZZZ)V", "getUnscrolledButton", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$ButtonDto;", "getScrolledButton", "getHasScrolledToBottom", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureBottomBarState {
    public static final int $stable = 8;
    private final boolean hasScrolledToBottom;
    private final boolean isButtonEnabled;
    private final boolean isLoading;
    private final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto scrolledButton;
    private final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto unscrolledButton;

    public static /* synthetic */ CryptoUpgradeDisclosureBottomBarState copy$default(CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto buttonDto, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto buttonDto2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonDto = cryptoUpgradeDisclosureBottomBarState.unscrolledButton;
        }
        if ((i & 2) != 0) {
            buttonDto2 = cryptoUpgradeDisclosureBottomBarState.scrolledButton;
        }
        if ((i & 4) != 0) {
            z = cryptoUpgradeDisclosureBottomBarState.hasScrolledToBottom;
        }
        if ((i & 8) != 0) {
            z2 = cryptoUpgradeDisclosureBottomBarState.isButtonEnabled;
        }
        if ((i & 16) != 0) {
            z3 = cryptoUpgradeDisclosureBottomBarState.isLoading;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return cryptoUpgradeDisclosureBottomBarState.copy(buttonDto, buttonDto2, z5, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto getUnscrolledButton() {
        return this.unscrolledButton;
    }

    /* renamed from: component2, reason: from getter */
    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto getScrolledButton() {
        return this.scrolledButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasScrolledToBottom() {
        return this.hasScrolledToBottom;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsButtonEnabled() {
        return this.isButtonEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoUpgradeDisclosureBottomBarState copy(GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto unscrolledButton, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto scrolledButton, boolean hasScrolledToBottom, boolean isButtonEnabled, boolean isLoading) {
        Intrinsics.checkNotNullParameter(scrolledButton, "scrolledButton");
        return new CryptoUpgradeDisclosureBottomBarState(unscrolledButton, scrolledButton, hasScrolledToBottom, isButtonEnabled, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureBottomBarState)) {
            return false;
        }
        CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState = (CryptoUpgradeDisclosureBottomBarState) other;
        return Intrinsics.areEqual(this.unscrolledButton, cryptoUpgradeDisclosureBottomBarState.unscrolledButton) && Intrinsics.areEqual(this.scrolledButton, cryptoUpgradeDisclosureBottomBarState.scrolledButton) && this.hasScrolledToBottom == cryptoUpgradeDisclosureBottomBarState.hasScrolledToBottom && this.isButtonEnabled == cryptoUpgradeDisclosureBottomBarState.isButtonEnabled && this.isLoading == cryptoUpgradeDisclosureBottomBarState.isLoading;
    }

    public int hashCode() {
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto buttonDto = this.unscrolledButton;
        return ((((((((buttonDto == null ? 0 : buttonDto.hashCode()) * 31) + this.scrolledButton.hashCode()) * 31) + Boolean.hashCode(this.hasScrolledToBottom)) * 31) + Boolean.hashCode(this.isButtonEnabled)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CryptoUpgradeDisclosureBottomBarState(unscrolledButton=" + this.unscrolledButton + ", scrolledButton=" + this.scrolledButton + ", hasScrolledToBottom=" + this.hasScrolledToBottom + ", isButtonEnabled=" + this.isButtonEnabled + ", isLoading=" + this.isLoading + ")";
    }

    public CryptoUpgradeDisclosureBottomBarState(GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto buttonDto, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto scrolledButton, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(scrolledButton, "scrolledButton");
        this.unscrolledButton = buttonDto;
        this.scrolledButton = scrolledButton;
        this.hasScrolledToBottom = z;
        this.isButtonEnabled = z2;
        this.isLoading = z3;
    }

    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto getUnscrolledButton() {
        return this.unscrolledButton;
    }

    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto getScrolledButton() {
        return this.scrolledButton;
    }

    public final boolean getHasScrolledToBottom() {
        return this.hasScrolledToBottom;
    }

    public final boolean isButtonEnabled() {
        return this.isButtonEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
