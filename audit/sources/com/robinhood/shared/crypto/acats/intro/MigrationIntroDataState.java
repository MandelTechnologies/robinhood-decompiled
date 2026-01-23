package com.robinhood.shared.crypto.acats.intro;

import crypto_portkey.service.p443v1.CheckMigrationEligibilityAuthedResponseDto;
import crypto_portkey.service.p443v1.MigrationEligibilityStatusDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\rHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/intro/MigrationIntroDataState;", "", "response", "Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;", "<init>", "(Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponseDto;)V", "loading", "", "getLoading", "()Z", "showDialog", "getShowDialog", "dialogMessage", "", "getDialogMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MigrationIntroDataState {
    public static final int $stable = 8;
    private final CheckMigrationEligibilityAuthedResponseDto response;

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationIntroDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final CheckMigrationEligibilityAuthedResponseDto getResponse() {
        return this.response;
    }

    public static /* synthetic */ MigrationIntroDataState copy$default(MigrationIntroDataState migrationIntroDataState, CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            checkMigrationEligibilityAuthedResponseDto = migrationIntroDataState.response;
        }
        return migrationIntroDataState.copy(checkMigrationEligibilityAuthedResponseDto);
    }

    public final MigrationIntroDataState copy(CheckMigrationEligibilityAuthedResponseDto response) {
        return new MigrationIntroDataState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MigrationIntroDataState) && Intrinsics.areEqual(this.response, ((MigrationIntroDataState) other).response);
    }

    public int hashCode() {
        CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto = this.response;
        if (checkMigrationEligibilityAuthedResponseDto == null) {
            return 0;
        }
        return checkMigrationEligibilityAuthedResponseDto.hashCode();
    }

    public String toString() {
        return "MigrationIntroDataState(response=" + this.response + ")";
    }

    public MigrationIntroDataState(CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto) {
        this.response = checkMigrationEligibilityAuthedResponseDto;
    }

    public /* synthetic */ MigrationIntroDataState(CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkMigrationEligibilityAuthedResponseDto);
    }

    public final boolean getLoading() {
        return this.response == null;
    }

    public final boolean getShowDialog() {
        CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto = this.response;
        return (checkMigrationEligibilityAuthedResponseDto == null || checkMigrationEligibilityAuthedResponseDto.getEligibility_status() == MigrationEligibilityStatusDto.MIGRATION_ELIGIBILITY_STATUS_ELIGIBLE) ? false : true;
    }

    public final String getDialogMessage() {
        CheckMigrationEligibilityAuthedResponseDto checkMigrationEligibilityAuthedResponseDto = this.response;
        if (checkMigrationEligibilityAuthedResponseDto != null) {
            return checkMigrationEligibilityAuthedResponseDto.getFailure_reason();
        }
        return null;
    }
}
