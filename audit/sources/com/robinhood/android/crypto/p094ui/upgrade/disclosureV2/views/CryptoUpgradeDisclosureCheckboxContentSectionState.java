package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureCheckboxContentSection.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureCheckboxContentSectionState;", "", "agreementId", "Ljava/util/UUID;", "checkboxContentSection", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "isChecked", "", "<init>", "(Ljava/util/UUID;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;Z)V", "getAgreementId", "()Ljava/util/UUID;", "getCheckboxContentSection", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$CheckboxDto;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureCheckboxContentSectionState {
    public static final int $stable = 8;
    private final UUID agreementId;
    private final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto checkboxContentSection;
    private final boolean isChecked;

    public static /* synthetic */ CryptoUpgradeDisclosureCheckboxContentSectionState copy$default(CryptoUpgradeDisclosureCheckboxContentSectionState cryptoUpgradeDisclosureCheckboxContentSectionState, UUID uuid, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto checkboxDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoUpgradeDisclosureCheckboxContentSectionState.agreementId;
        }
        if ((i & 2) != 0) {
            checkboxDto = cryptoUpgradeDisclosureCheckboxContentSectionState.checkboxContentSection;
        }
        if ((i & 4) != 0) {
            z = cryptoUpgradeDisclosureCheckboxContentSectionState.isChecked;
        }
        return cryptoUpgradeDisclosureCheckboxContentSectionState.copy(uuid, checkboxDto, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto getCheckboxContentSection() {
        return this.checkboxContentSection;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final CryptoUpgradeDisclosureCheckboxContentSectionState copy(UUID agreementId, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto checkboxContentSection, boolean isChecked) {
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(checkboxContentSection, "checkboxContentSection");
        return new CryptoUpgradeDisclosureCheckboxContentSectionState(agreementId, checkboxContentSection, isChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureCheckboxContentSectionState)) {
            return false;
        }
        CryptoUpgradeDisclosureCheckboxContentSectionState cryptoUpgradeDisclosureCheckboxContentSectionState = (CryptoUpgradeDisclosureCheckboxContentSectionState) other;
        return Intrinsics.areEqual(this.agreementId, cryptoUpgradeDisclosureCheckboxContentSectionState.agreementId) && Intrinsics.areEqual(this.checkboxContentSection, cryptoUpgradeDisclosureCheckboxContentSectionState.checkboxContentSection) && this.isChecked == cryptoUpgradeDisclosureCheckboxContentSectionState.isChecked;
    }

    public int hashCode() {
        return (((this.agreementId.hashCode() * 31) + this.checkboxContentSection.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    public String toString() {
        return "CryptoUpgradeDisclosureCheckboxContentSectionState(agreementId=" + this.agreementId + ", checkboxContentSection=" + this.checkboxContentSection + ", isChecked=" + this.isChecked + ")";
    }

    public CryptoUpgradeDisclosureCheckboxContentSectionState(UUID agreementId, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto checkboxContentSection, boolean z) {
        Intrinsics.checkNotNullParameter(agreementId, "agreementId");
        Intrinsics.checkNotNullParameter(checkboxContentSection, "checkboxContentSection");
        this.agreementId = agreementId;
        this.checkboxContentSection = checkboxContentSection;
        this.isChecked = z;
    }

    public final UUID getAgreementId() {
        return this.agreementId;
    }

    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.CheckboxDto getCheckboxContentSection() {
        return this.checkboxContentSection;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }
}
