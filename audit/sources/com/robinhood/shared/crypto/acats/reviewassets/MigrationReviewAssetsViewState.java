package com.robinhood.shared.crypto.acats.reviewassets;

import crypto_portkey.service.p443v1.ProcessMigrationAuthedResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationReviewAssetsViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/reviewassets/MigrationReviewAssetsViewState;", "", "enabled", "", "isLoading", "assetListSections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/reviewassets/AssetListSectionState;", "migrationResponse", "Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;)V", "getEnabled", "()Z", "getAssetListSections", "()Lkotlinx/collections/immutable/ImmutableList;", "getMigrationResponse", "()Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponseDto;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MigrationReviewAssetsViewState {
    public static final int $stable = 8;
    private final ImmutableList<AssetListSectionState> assetListSections;
    private final boolean enabled;
    private final boolean isLoading;
    private final ProcessMigrationAuthedResponseDto migrationResponse;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MigrationReviewAssetsViewState copy$default(MigrationReviewAssetsViewState migrationReviewAssetsViewState, boolean z, boolean z2, ImmutableList immutableList, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = migrationReviewAssetsViewState.enabled;
        }
        if ((i & 2) != 0) {
            z2 = migrationReviewAssetsViewState.isLoading;
        }
        if ((i & 4) != 0) {
            immutableList = migrationReviewAssetsViewState.assetListSections;
        }
        if ((i & 8) != 0) {
            processMigrationAuthedResponseDto = migrationReviewAssetsViewState.migrationResponse;
        }
        return migrationReviewAssetsViewState.copy(z, z2, immutableList, processMigrationAuthedResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final ImmutableList<AssetListSectionState> component3() {
        return this.assetListSections;
    }

    /* renamed from: component4, reason: from getter */
    public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
        return this.migrationResponse;
    }

    public final MigrationReviewAssetsViewState copy(boolean enabled, boolean isLoading, ImmutableList<AssetListSectionState> assetListSections, ProcessMigrationAuthedResponseDto migrationResponse) {
        Intrinsics.checkNotNullParameter(assetListSections, "assetListSections");
        return new MigrationReviewAssetsViewState(enabled, isLoading, assetListSections, migrationResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationReviewAssetsViewState)) {
            return false;
        }
        MigrationReviewAssetsViewState migrationReviewAssetsViewState = (MigrationReviewAssetsViewState) other;
        return this.enabled == migrationReviewAssetsViewState.enabled && this.isLoading == migrationReviewAssetsViewState.isLoading && Intrinsics.areEqual(this.assetListSections, migrationReviewAssetsViewState.assetListSections) && Intrinsics.areEqual(this.migrationResponse, migrationReviewAssetsViewState.migrationResponse);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.assetListSections.hashCode()) * 31;
        ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto = this.migrationResponse;
        return iHashCode + (processMigrationAuthedResponseDto == null ? 0 : processMigrationAuthedResponseDto.hashCode());
    }

    public String toString() {
        return "MigrationReviewAssetsViewState(enabled=" + this.enabled + ", isLoading=" + this.isLoading + ", assetListSections=" + this.assetListSections + ", migrationResponse=" + this.migrationResponse + ")";
    }

    public MigrationReviewAssetsViewState(boolean z, boolean z2, ImmutableList<AssetListSectionState> assetListSections, ProcessMigrationAuthedResponseDto processMigrationAuthedResponseDto) {
        Intrinsics.checkNotNullParameter(assetListSections, "assetListSections");
        this.enabled = z;
        this.isLoading = z2;
        this.assetListSections = assetListSections;
        this.migrationResponse = processMigrationAuthedResponseDto;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final ImmutableList<AssetListSectionState> getAssetListSections() {
        return this.assetListSections;
    }

    public final ProcessMigrationAuthedResponseDto getMigrationResponse() {
        return this.migrationResponse;
    }
}
