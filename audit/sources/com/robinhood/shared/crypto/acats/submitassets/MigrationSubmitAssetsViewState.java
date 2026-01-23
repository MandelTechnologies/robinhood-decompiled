package com.robinhood.shared.crypto.acats.submitassets;

import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.shared.crypto.acats.AssetRowText;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationSubmitAssetsViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\u008b\u0001\u0010\u001a\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00032\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR%\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsViewState;", "", "transferableUsdRow", "Lkotlin/Pair;", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/AssetRowText;", "transferableCryptoRow", "nonTransferableCashRow", "nonTransferableCryptoRow", "loading", "", "<init>", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Z)V", "getTransferableUsdRow", "()Lkotlin/Pair;", "getTransferableCryptoRow", "getNonTransferableCashRow", "getNonTransferableCryptoRow", "getLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MigrationSubmitAssetsViewState {
    public static final int $stable = BentoBaseRowState.$stable;
    private final boolean loading;
    private final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCashRow;
    private final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> nonTransferableCryptoRow;
    private final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableCryptoRow;
    private final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> transferableUsdRow;

    public static /* synthetic */ MigrationSubmitAssetsViewState copy$default(MigrationSubmitAssetsViewState migrationSubmitAssetsViewState, Tuples2 tuples2, Tuples2 tuples22, Tuples2 tuples23, Tuples2 tuples24, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tuples2 = migrationSubmitAssetsViewState.transferableUsdRow;
        }
        if ((i & 2) != 0) {
            tuples22 = migrationSubmitAssetsViewState.transferableCryptoRow;
        }
        if ((i & 4) != 0) {
            tuples23 = migrationSubmitAssetsViewState.nonTransferableCashRow;
        }
        if ((i & 8) != 0) {
            tuples24 = migrationSubmitAssetsViewState.nonTransferableCryptoRow;
        }
        if ((i & 16) != 0) {
            z = migrationSubmitAssetsViewState.loading;
        }
        boolean z2 = z;
        Tuples2 tuples25 = tuples23;
        return migrationSubmitAssetsViewState.copy(tuples2, tuples22, tuples25, tuples24, z2);
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> component1() {
        return this.transferableUsdRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> component2() {
        return this.transferableCryptoRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> component3() {
        return this.nonTransferableCashRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> component4() {
        return this.nonTransferableCryptoRow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final MigrationSubmitAssetsViewState copy(Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> transferableUsdRow, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> transferableCryptoRow, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> nonTransferableCashRow, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> nonTransferableCryptoRow, boolean loading) {
        return new MigrationSubmitAssetsViewState(transferableUsdRow, transferableCryptoRow, nonTransferableCashRow, nonTransferableCryptoRow, loading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationSubmitAssetsViewState)) {
            return false;
        }
        MigrationSubmitAssetsViewState migrationSubmitAssetsViewState = (MigrationSubmitAssetsViewState) other;
        return Intrinsics.areEqual(this.transferableUsdRow, migrationSubmitAssetsViewState.transferableUsdRow) && Intrinsics.areEqual(this.transferableCryptoRow, migrationSubmitAssetsViewState.transferableCryptoRow) && Intrinsics.areEqual(this.nonTransferableCashRow, migrationSubmitAssetsViewState.nonTransferableCashRow) && Intrinsics.areEqual(this.nonTransferableCryptoRow, migrationSubmitAssetsViewState.nonTransferableCryptoRow) && this.loading == migrationSubmitAssetsViewState.loading;
    }

    public int hashCode() {
        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> tuples2 = this.transferableUsdRow;
        int iHashCode = (tuples2 == null ? 0 : tuples2.hashCode()) * 31;
        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> tuples22 = this.transferableCryptoRow;
        int iHashCode2 = (iHashCode + (tuples22 == null ? 0 : tuples22.hashCode())) * 31;
        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> tuples23 = this.nonTransferableCashRow;
        int iHashCode3 = (iHashCode2 + (tuples23 == null ? 0 : tuples23.hashCode())) * 31;
        Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> tuples24 = this.nonTransferableCryptoRow;
        return ((iHashCode3 + (tuples24 != null ? tuples24.hashCode() : 0)) * 31) + Boolean.hashCode(this.loading);
    }

    public String toString() {
        return "MigrationSubmitAssetsViewState(transferableUsdRow=" + this.transferableUsdRow + ", transferableCryptoRow=" + this.transferableCryptoRow + ", nonTransferableCashRow=" + this.nonTransferableCashRow + ", nonTransferableCryptoRow=" + this.nonTransferableCryptoRow + ", loading=" + this.loading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MigrationSubmitAssetsViewState(Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> tuples2, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> tuples22, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> tuples23, Tuples2<BentoBaseRowState, ? extends ImmutableList<AssetRowText>> tuples24, boolean z) {
        this.transferableUsdRow = tuples2;
        this.transferableCryptoRow = tuples22;
        this.nonTransferableCashRow = tuples23;
        this.nonTransferableCryptoRow = tuples24;
        this.loading = z;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getTransferableUsdRow() {
        return this.transferableUsdRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getTransferableCryptoRow() {
        return this.transferableCryptoRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getNonTransferableCashRow() {
        return this.nonTransferableCashRow;
    }

    public final Tuples2<BentoBaseRowState, ImmutableList<AssetRowText>> getNonTransferableCryptoRow() {
        return this.nonTransferableCryptoRow;
    }

    public final boolean getLoading() {
        return this.loading;
    }
}
